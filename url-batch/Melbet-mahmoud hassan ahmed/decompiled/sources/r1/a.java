package r1;

import android.os.Parcel;
import android.os.Parcelable;
import m1.b;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0128a();

    /* renamed from: r1.a$a, reason: collision with other inner class name */
    class C0128a implements Parcelable.Creator<a> {
        C0128a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    a(Parcel parcel) {
        super(parcel);
    }

    public a(String str, String str2) {
        super(str, str2);
    }
}
