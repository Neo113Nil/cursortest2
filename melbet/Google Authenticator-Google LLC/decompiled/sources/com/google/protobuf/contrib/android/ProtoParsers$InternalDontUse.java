package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hoq;
import defpackage.jex;
import defpackage.jjz;
import defpackage.jkd;
import defpackage.jld;
import defpackage.jll;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProtoParsers$InternalDontUse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new jex(5);
    private volatile byte[] a;
    private volatile jll b;

    public ProtoParsers$InternalDontUse(byte[] bArr, jll jllVar) {
        boolean z = true;
        if (bArr == null && jllVar == null) {
            z = false;
        }
        hoq.y(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = jllVar;
    }

    public final jll a(jll jllVar, jkd jkdVar) {
        try {
            return b(jllVar, jkdVar);
        } catch (jld e) {
            throw new IllegalStateException(e);
        }
    }

    public final jll b(jll jllVar, jkd jkdVar) {
        if (this.b == null) {
            this.b = jllVar.C().e(this.a, jkdVar).q();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.j()];
            try {
                this.b.K(jjz.S(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
