package M4;

import S0.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0518b;
import b.InterfaceC0520d;
import com.bumptech.glide.manager.n;
import f4.p;
import kotlin.jvm.internal.h;
import p.AbstractC4846f;
import p.AbstractServiceConnectionC4851k;
import p.BinderC4845e;

/* loaded from: classes2.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends AbstractServiceConnectionC4851k {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String url, boolean z8, Context context) {
            h.e(url, "url");
            h.e(context, "context");
            this.url = url;
            this.openActivity = z8;
            this.context = context;
        }

        @Override // p.AbstractServiceConnectionC4851k
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4846f customTabsClient) {
            h.e(componentName, "componentName");
            h.e(customTabsClient, "customTabsClient");
            try {
                ((C0518b) customTabsClient.f39754a).N0();
            } catch (RemoteException unused) {
            }
            p c4 = customTabsClient.c(null);
            if (c4 == null) {
                return;
            }
            Uri parse = Uri.parse(this.url);
            Bundle bundle = new Bundle();
            try {
                ((C0518b) ((InterfaceC0520d) c4.f37764v)).i0((BinderC4845e) c4.f37765w, parse, bundle);
            } catch (RemoteException unused2) {
            }
            if (this.openActivity) {
                l b9 = new n(c4).b();
                Intent intent = (Intent) b9.f2910u;
                intent.setData(parse);
                intent.addFlags(268435456);
                this.context.startActivity(intent, (Bundle) b9.f2911v);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            h.e(name, "name");
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String url, boolean z8, Context context) {
        h.e(url, "url");
        h.e(context, "context");
        if (hasChromeTabLibrary()) {
            return AbstractC4846f.a(context, "com.android.chrome", new a(url, z8, context));
        }
        return false;
    }
}
