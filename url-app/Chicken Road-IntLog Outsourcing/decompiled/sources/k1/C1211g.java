package k1;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211g implements Parcelable {
    public static final Parcelable.Creator<C1211g> CREATOR = new C1207c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f10687a;

    public C1211g(IBinder iBinder) {
        this.f10687a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f10687a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C1211g) obj).f10687a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f10687a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f10687a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
