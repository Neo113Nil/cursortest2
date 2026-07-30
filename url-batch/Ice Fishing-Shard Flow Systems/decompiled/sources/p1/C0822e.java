package p1;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822e implements Parcelable {
    public static final Parcelable.Creator<C0822e> CREATOR = new I1.c(19);

    /* renamed from: d, reason: collision with root package name */
    public final Messenger f7169d;

    public C0822e(IBinder iBinder) {
        this.f7169d = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f7169d.getBinder().equals(((C0822e) obj).f7169d.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7169d.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.f7169d.getBinder());
    }
}
