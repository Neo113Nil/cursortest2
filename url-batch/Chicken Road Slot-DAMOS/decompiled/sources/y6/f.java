package y6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import c7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new p(29);

    /* renamed from: d, reason: collision with root package name */
    public final Messenger f10641d;

    public f(IBinder iBinder) {
        this.f10641d = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f10641d.getBinder().equals(((f) obj).f10641d.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10641d.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStrongBinder(this.f10641d.getBinder());
    }
}
