package a2;

import android.os.Parcel;
import android.os.Parcelable;
import b1.w0;
import j2.e0;
import k.x2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    public /* synthetic */ c(int i4) {
        this.f5a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5a) {
            case 0:
                return new d(parcel, classLoader);
            case 1:
                return new w0(parcel, classLoader);
            case 2:
                return new h2.d(parcel, classLoader);
            case 3:
                return new e0(parcel, classLoader);
            case 4:
                return new x2(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return p0.b.g;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new q1.a(parcel, classLoader);
            case 7:
                return new r1.d(parcel, classLoader);
            default:
                return new x.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f5a) {
            case 0:
                return new d[i4];
            case 1:
                return new w0[i4];
            case 2:
                return new h2.d[i4];
            case 3:
                return new e0[i4];
            case 4:
                return new x2[i4];
            case 5:
                return new p0.b[i4];
            case 6:
                return new q1.a[i4];
            case 7:
                return new r1.d[i4];
            default:
                return new x.f[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5a) {
            case 0:
                return new d(parcel, null);
            case 1:
                return new w0(parcel, null);
            case 2:
                return new h2.d(parcel, null);
            case 3:
                return new e0(parcel, null);
            case 4:
                return new x2(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return p0.b.g;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new q1.a(parcel, null);
            case 7:
                return new r1.d(parcel, null);
            default:
                return new x.f(parcel, null);
        }
    }
}
