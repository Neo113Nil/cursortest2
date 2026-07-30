package com.anythink.basead.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.C0544a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ae implements Parcelable {
    public static final Parcelable.Creator<ae> CREATOR = new Parcelable.Creator<ae>() { // from class: com.anythink.basead.exoplayer.h.ae.1
        private static ae a(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ae createFromParcel(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ae[] newArray(int i) {
            return new ae[i];
        }

        private static ae[] a(int i) {
            return new ae[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f7669a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.m[] f7670b;

    /* renamed from: c, reason: collision with root package name */
    private int f7671c;

    public ae(com.anythink.basead.exoplayer.m... mVarArr) {
        C0544a.b(true);
        this.f7670b = mVarArr;
        this.f7669a = 1;
    }

    public final com.anythink.basead.exoplayer.m a(int i) {
        return this.f7670b[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ae.class == obj.getClass()) {
            ae aeVar = (ae) obj;
            if (this.f7669a == aeVar.f7669a && Arrays.equals(this.f7670b, aeVar.f7670b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7671c == 0) {
            this.f7671c = Arrays.hashCode(this.f7670b) + 527;
        }
        return this.f7671c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7669a);
        for (int i4 = 0; i4 < this.f7669a; i4++) {
            parcel.writeParcelable(this.f7670b[i4], 0);
        }
    }

    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.m[] mVarArr = this.f7670b;
            if (i >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public ae(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7669a = readInt;
        this.f7670b = new com.anythink.basead.exoplayer.m[readInt];
        for (int i = 0; i < this.f7669a; i++) {
            this.f7670b[i] = (com.anythink.basead.exoplayer.m) parcel.readParcelable(com.anythink.basead.exoplayer.m.class.getClassLoader());
        }
    }
}
