package ya;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.c;
import p.d;
import p.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends d {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String str, boolean z10, Context context) {
            str.getClass();
            context.getClass();
            this.url = str;
            this.openActivity = z10;
            this.context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // p.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCustomTabsServiceConnected(ComponentName componentName, p.b bVar) {
            e eVar;
            componentName.getClass();
            bVar.getClass();
            c cVar = bVar.f7584a;
            try {
                ((b.a) cVar).E();
            } catch (RemoteException unused) {
            }
            p.a aVar = new p.a();
            aVar.attachInterface(aVar, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            if (((b.a) cVar).D(aVar)) {
                eVar = new e(cVar, aVar, bVar.f7585b, 0);
                if (eVar != null) {
                    return;
                }
                p.a aVar2 = (p.a) eVar.f7589i;
                Uri parse = Uri.parse(this.url);
                try {
                    ((b.a) ((c) eVar.f7588e)).C(aVar2, parse, new Bundle());
                } catch (RemoteException unused2) {
                }
                if (this.openActivity) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setPackage(((ComponentName) eVar.f7590r).getPackageName());
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", aVar2);
                    intent.putExtras(bundle);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle2);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.context.startActivity(intent, null);
                    return;
                }
                return;
            }
            eVar = null;
            if (eVar != null) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            componentName.getClass();
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String str, boolean z10, Context context) {
        str.getClass();
        context.getClass();
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(str, z10, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
