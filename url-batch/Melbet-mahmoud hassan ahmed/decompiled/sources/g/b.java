package g;

import a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f16202a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f16203b;

    class a extends a.AbstractBinderC0000a {

        /* renamed from: f, reason: collision with root package name */
        private Handler f16204f = new Handler(Looper.getMainLooper());

        a(g.a aVar) {
        }

        @Override // a.a
        public void B5(int i7, Uri uri, boolean z6, Bundle bundle) {
        }

        @Override // a.a
        public void X4(String str, Bundle bundle) {
        }

        @Override // a.a
        public void p5(Bundle bundle) {
        }

        @Override // a.a
        public void q3(int i7, Bundle bundle) {
        }

        @Override // a.a
        public void t2(String str, Bundle bundle) {
        }
    }

    b(a.b bVar, ComponentName componentName) {
        this.f16202a = bVar;
        this.f16203b = componentName;
    }

    public static boolean a(Context context, String str, d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    public e b(g.a aVar) {
        a aVar2 = new a(aVar);
        try {
            if (this.f16202a.k4(aVar2)) {
                return new e(this.f16202a, aVar2, this.f16203b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean c(long j7) {
        try {
            return this.f16202a.w5(j7);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
