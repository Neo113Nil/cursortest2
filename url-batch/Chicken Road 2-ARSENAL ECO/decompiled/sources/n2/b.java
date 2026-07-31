package n2;

import B0.c;
import H1.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.C0259b;
import b.InterfaceC0258a;
import b.InterfaceC0261d;
import kotlin.jvm.internal.i;
import n.AbstractC0534b;
import n.AbstractServiceConnectionC0539g;
import n.BinderC0533a;
import u0.C0675e;

/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends AbstractServiceConnectionC0539g {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z5, Context context) {
            i.e(url, "url");
            i.e(context, "context");
            this.url = url;
            this.openActivity = z5;
            this.context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // n.AbstractServiceConnectionC0539g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC0534b customTabsClient) {
            c cVar;
            i.e(componentName, "componentName");
            i.e(customTabsClient, "customTabsClient");
            InterfaceC0261d interfaceC0261d = customTabsClient.f5488a;
            try {
                ((C0259b) interfaceC0261d).d();
            } catch (RemoteException unused) {
            }
            BinderC0533a binderC0533a = new BinderC0533a();
            binderC0533a.attachInterface(binderC0533a, InterfaceC0258a.f3599a);
            new Handler(Looper.getMainLooper());
            if (((C0259b) interfaceC0261d).c(binderC0533a)) {
                cVar = new c(interfaceC0261d, binderC0533a, customTabsClient.f5489b, 22);
                if (cVar != null) {
                    return;
                }
                Uri parse = Uri.parse(this.url);
                Bundle bundle = new Bundle();
                try {
                    ((C0259b) ((InterfaceC0261d) cVar.f72h)).b((BinderC0533a) cVar.f73i, parse, bundle);
                } catch (RemoteException unused2) {
                }
                if (this.openActivity) {
                    C0675e a7 = new s(cVar).a();
                    Intent intent = (Intent) a7.f5975b;
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.context.startActivity(intent, (Bundle) a7.f5976c);
                    return;
                }
                return;
            }
            cVar = null;
            if (cVar != null) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            i.e(name, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z5, Context context) {
        i.e(url, "url");
        i.e(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(url, z5, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
