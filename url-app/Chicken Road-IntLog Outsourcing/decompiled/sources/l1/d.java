package l1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class d extends AbstractC1380a {
    public static final Parcelable.Creator<d> CREATOR = new B1.c(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f11006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11007b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11008c;

    public d(String str) {
        this.f11006a = str;
        this.f11008c = 1L;
        this.f11007b = -1;
    }

    public final long a() {
        long j2 = this.f11008c;
        return j2 == -1 ? this.f11007b : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f11006a;
            if (((str != null && str.equals(dVar.f11006a)) || (str == null && dVar.f11006a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11006a, Long.valueOf(a())});
    }

    public final String toString() {
        B0.l lVar = new B0.l(this);
        lVar.c(this.f11006a, "name");
        lVar.c(Long.valueOf(a()), "version");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.O(parcel, 1, this.f11006a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f11007b);
        long a6 = a();
        AbstractC0169a.T(parcel, 3, 8);
        parcel.writeLong(a6);
        AbstractC0169a.S(parcel, R5);
    }

    public d(String str, int i2, long j2) {
        this.f11006a = str;
        this.f11007b = i2;
        this.f11008c = j2;
    }
}
