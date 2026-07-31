package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jf4 extends wf4 {
    public static final Parcelable.Creator<jf4> CREATOR = new if4();

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f7116g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    jf4(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f7116g = (byte[]) n13.c(parcel.createByteArray());
    }

    public jf4(String str, byte[] bArr) {
        super(str);
        this.f7116g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf4.class == obj.getClass()) {
            jf4 jf4Var = (jf4) obj;
            if (this.f13818f.equals(jf4Var.f13818f) && Arrays.equals(this.f7116g, jf4Var.f7116g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13818f.hashCode() + 527) * 31) + Arrays.hashCode(this.f7116g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f13818f);
        parcel.writeByteArray(this.f7116g);
    }
}
