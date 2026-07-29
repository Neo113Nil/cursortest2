package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: CustomTabsSessionToken.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final g f1490a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1491b = new a() { // from class: android.support.customtabs.f.1
        @Override // android.support.customtabs.a
        public void a(int i, Bundle bundle) {
            try {
                f.this.f1490a.a(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // android.support.customtabs.a
        public void a(String str, Bundle bundle) {
            try {
                f.this.f1490a.a(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // android.support.customtabs.a
        public void a(Bundle bundle) {
            try {
                f.this.f1490a.a(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // android.support.customtabs.a
        public void b(String str, Bundle bundle) {
            try {
                f.this.f1490a.b(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // android.support.customtabs.a
        public void a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                f.this.f1490a.a(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    };

    f(g gVar) {
        this.f1490a = gVar;
    }

    IBinder a() {
        return this.f1490a.asBinder();
    }

    public int hashCode() {
        return a().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).a().equals(this.f1490a.asBinder());
        }
        return false;
    }
}
