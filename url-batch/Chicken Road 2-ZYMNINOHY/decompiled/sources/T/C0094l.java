package T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* renamed from: T.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094l implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0094l> CREATOR = new C0092j(0);

    /* renamed from: a, reason: collision with root package name */
    public final C0093k[] f2801a;

    /* renamed from: b, reason: collision with root package name */
    public int f2802b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2804d;

    public C0094l(ArrayList arrayList, String str) {
        this(str, false, (C0093k[]) arrayList.toArray(new C0093k[0]));
    }

    public final C0094l a(String str) {
        return Objects.equals(this.f2803c, str) ? this : new C0094l(str, false, this.f2801a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0093k c0093k = (C0093k) obj;
        C0093k c0093k2 = (C0093k) obj2;
        UUID uuid = AbstractC0088f.f2779a;
        return uuid.equals(c0093k.f2797b) ? uuid.equals(c0093k2.f2797b) ? 0 : 1 : c0093k.f2797b.compareTo(c0093k2.f2797b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0094l.class == obj.getClass()) {
            C0094l c0094l = (C0094l) obj;
            if (Objects.equals(this.f2803c, c0094l.f2803c) && Arrays.equals(this.f2801a, c0094l.f2801a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2802b == 0) {
            String str = this.f2803c;
            this.f2802b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f2801a);
        }
        return this.f2802b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f2803c);
        parcel.writeTypedArray(this.f2801a, 0);
    }

    public C0094l(C0093k... c0093kArr) {
        this(null, true, c0093kArr);
    }

    public C0094l(String str, boolean z, C0093k... c0093kArr) {
        this.f2803c = str;
        c0093kArr = z ? (C0093k[]) c0093kArr.clone() : c0093kArr;
        this.f2801a = c0093kArr;
        this.f2804d = c0093kArr.length;
        Arrays.sort(c0093kArr, this);
    }

    public C0094l(Parcel parcel) {
        this.f2803c = parcel.readString();
        C0093k[] c0093kArr = (C0093k[]) parcel.createTypedArray(C0093k.CREATOR);
        String str = W.J.f3263a;
        this.f2801a = c0093kArr;
        this.f2804d = c0093kArr.length;
    }
}
