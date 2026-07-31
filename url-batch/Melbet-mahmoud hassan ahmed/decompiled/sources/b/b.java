package b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import b.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final boolean f1596f = false;

    /* renamed from: g, reason: collision with root package name */
    final Handler f1597g = null;

    /* renamed from: h, reason: collision with root package name */
    b.a f1598h;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    class BinderC0036b extends a.AbstractBinderC0034a {
        BinderC0036b() {
        }

        @Override // b.a
        public void j6(int i7, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f1597g;
            if (handler != null) {
                handler.post(bVar.new c(i7, bundle));
            } else {
                bVar.a(i7, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final int f1600f;

        /* renamed from: g, reason: collision with root package name */
        final Bundle f1601g;

        c(int i7, Bundle bundle) {
            this.f1600f = i7;
            this.f1601g = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f1600f, this.f1601g);
        }
    }

    b(Parcel parcel) {
        this.f1598h = a.AbstractBinderC0034a.E(parcel.readStrongBinder());
    }

    protected void a(int i7, Bundle bundle) {
    }

    public void c(int i7, Bundle bundle) {
        if (this.f1596f) {
            Handler handler = this.f1597g;
            if (handler != null) {
                handler.post(new c(i7, bundle));
                return;
            } else {
                a(i7, bundle);
                return;
            }
        }
        b.a aVar = this.f1598h;
        if (aVar != null) {
            try {
                aVar.j6(i7, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            if (this.f1598h == null) {
                this.f1598h = new BinderC0036b();
            }
            parcel.writeStrongBinder(this.f1598h.asBinder());
        }
    }
}
