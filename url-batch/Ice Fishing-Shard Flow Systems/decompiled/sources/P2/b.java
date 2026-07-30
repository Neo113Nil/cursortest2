package P2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import b.C0261b;
import b.InterfaceC0263d;
import kotlin.jvm.internal.Intrinsics;
import q.f;
import q.g;
import q.h;
import q.i;
import q.k;
import q.n;

/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends k {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z7, Context context) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "context");
            this.url = url;
            this.openActivity = z7;
            this.context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // q.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCustomTabsServiceConnected(ComponentName componentName, g customTabsClient) {
            n nVar;
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(customTabsClient, "customTabsClient");
            customTabsClient.getClass();
            InterfaceC0263d interfaceC0263d = customTabsClient.f7286a;
            try {
                ((C0261b) interfaceC0263d).k();
            } catch (RemoteException unused) {
            }
            f fVar = new f(null);
            if (((C0261b) interfaceC0263d).d(fVar)) {
                nVar = new n(interfaceC0263d, fVar, customTabsClient.f7287b);
                if (nVar != null) {
                    return;
                }
                Uri parse = Uri.parse(this.url);
                try {
                    ((C0261b) nVar.f7304b).c(nVar.f7305c, parse, nVar.a(null), null);
                } catch (RemoteException unused2) {
                }
                if (this.openActivity) {
                    i a7 = new h(nVar).a();
                    Intent intent = a7.f7295a;
                    Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.context.startActivity(intent, a7.f7296b);
                    return;
                }
                return;
            }
            nVar = null;
            if (nVar != null) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z7, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        if (hasChromeTabLibrary()) {
            return g.a(context, "com.android.chrome", new a(url, z7, context));
        }
        return false;
    }
}
