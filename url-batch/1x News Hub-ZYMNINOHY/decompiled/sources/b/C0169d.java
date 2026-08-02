package b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0169d implements Parcelable {
    public static final Parcelable.Creator<C0169d> CREATOR = new android.support.v4.media.session.b(2);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0167b f2520a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f2520a == null) {
                    this.f2520a = new BinderC0168c(this);
                }
                parcel.writeStrongBinder(this.f2520a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i3, Bundle bundle) {
    }
}
