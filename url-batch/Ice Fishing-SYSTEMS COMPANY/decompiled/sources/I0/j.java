package I0;

import N2.C0324j;
import N2.H;
import N2.y;
import O.A0;
import O.B;
import O.InterfaceC0358u;
import O.X;
import O.y0;
import P.u;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import c7.q;
import c7.t;
import com.icefishing.icefishingliveapp.F;
import com.icefishing.icefishingliveapp.GenderActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import com.icefishing.icefishingliveapp.PlaygamesActivity;
import com.icefishing.icefishingliveapp.StartActivity;
import com.icefishing.icefishingliveapp.ViewOnClickListenerC4414c;
import com.icefishing.icefishingliveapp.p;
import com.icefishing.icefishingliveapp.z;
import g1.C4523c;
import h.LayoutInflaterFactory2C4535B;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import k4.InterfaceC4657l;
import l.w;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public class j implements WebMessageListenerBoundaryInterface, InterfaceC0358u, s1.f, H0.b, h3.c, H, R7.l, R7.b, u, i6.m, InterfaceC4657l, w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1232n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1233u;

    public /* synthetic */ j(int i, Object obj) {
        this.f1232n = i;
        this.f1233u = obj;
    }

    public static boolean u(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String y(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f1232n) {
            case 22:
                ViewOnClickListenerC4414c viewOnClickListenerC4414c = (ViewOnClickListenerC4414c) this.f1233u;
                viewOnClickListenerC4414c.f37067u.startActivity(new Intent(viewOnClickListenerC4414c.f37067u, (Class<?>) MainActivity.class));
                break;
            case 23:
                p pVar = (p) this.f1233u;
                pVar.f37092u.startActivity(new Intent(pVar.f37092u, (Class<?>) GenderActivity.class));
                break;
            case 24:
                MainActivity mainActivity = ((com.icefishing.icefishingliveapp.w) this.f1233u).f37107u.f37110c;
                mainActivity.startActivity(mainActivity.f37003R);
                break;
            case 25:
                PlaygamesActivity playgamesActivity = ((z) this.f1233u).f37112u;
                playgamesActivity.startActivity(playgamesActivity.f37041u);
                break;
            default:
                StartActivity startActivity = ((F) this.f1233u).f36553u;
                startActivity.startActivity(startActivity.f37059y);
                break;
        }
    }

    public long a() {
        return ((Y5.a) this.f1233u).c();
    }

    @Override // i6.m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q build() {
        return (q) ((c7.m) this.f1233u).b(new B1.w(28));
    }

    @Override // i6.m
    public i6.m c(String str) {
        ((c7.m) this.f1233u).f5721d = str;
        return this;
    }

    @Override // i6.m
    public i6.m d(String str) {
        ((c7.m) this.f1233u).f5722e = str;
        return this;
    }

    @Override // l.w
    public void e(l.l lVar, boolean z8) {
        ((LayoutInflaterFactory2C4535B) this.f1233u).s(lVar);
    }

    @Override // P.u
    public boolean f(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f1233u;
        if (!DrawerLayout.n(view) || drawerLayout.i(view) == 2) {
            return false;
        }
        drawerLayout.b(view);
        return true;
    }

    @Override // l.w
    public boolean g(l.l lVar) {
        Window.Callback callback = ((LayoutInflaterFactory2C4535B) this.f1233u).f37975E.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f1233u)) {
            ((ByteBuffer) this.f1233u).position(0);
            messageDigest.update(((ByteBuffer) this.f1233u).putInt(num.intValue()).array());
        }
    }

    @Override // N2.H
    public void i(L2.b bVar) {
        C0324j c0324j = (C0324j) this.f1233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            c0324j.f2063B = bVar;
            C0324j.h(c0324j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // R7.b
    public Object j(R7.c cVar, InterfaceC5133d interfaceC5133d) {
        ((R7.n) ((R7.k) this.f1233u)).j(cVar, interfaceC5133d);
        return EnumC5179a.f41704n;
    }

    @Override // O.InterfaceC0358u
    public A0 k(View view, A0 a02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1233u;
        if (!Objects.equals(coordinatorLayout.f4785G, a02)) {
            coordinatorLayout.f4785G = a02;
            boolean z8 = a02.d() > 0;
            coordinatorLayout.f4786H = z8;
            coordinatorLayout.setWillNotDraw(!z8 && coordinatorLayout.getBackground() == null);
            y0 y0Var = a02.f2213a;
            if (!y0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = X.f2240a;
                    if (childAt.getFitsSystemWindows() && ((B.e) childAt.getLayoutParams()).f43a != null && y0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return a02;
    }

    public u8.h l(long j9) {
        return ((Y5.a) this.f1233u).d((int) j9);
    }

    @Override // N2.H
    public void m(int i) {
        C0324j c0324j = (C0324j) this.f1233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            if (c0324j.f2065n) {
                c0324j.f2065n = false;
                C0324j.g(c0324j, i);
            } else {
                c0324j.f2065n = true;
                ((y) c0324j.f2068w).onConnectionSuspended(i);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // N2.H
    public void n(Bundle bundle) {
        C0324j c0324j = (C0324j) this.f1233u;
        ReentrantLock reentrantLock = (ReentrantLock) c0324j.f2064C;
        ReentrantLock reentrantLock2 = (ReentrantLock) c0324j.f2064C;
        reentrantLock.lock();
        try {
            c0324j.f2063B = L2.b.f1710y;
            C0324j.h(c0324j);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // h3.c
    public void o(h3.n nVar) {
        ((CountDownLatch) this.f1233u).countDown();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z8, InvocationHandler invocationHandler2) {
        H0.c cVar;
        H0.c cVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) w8.a.b(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        C4523c[] c4523cArr = new C4523c[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            C4523c c4523c = new C4523c(5);
            c4523c.f37856u = (WebMessagePortBoundaryInterface) w8.a.b(WebMessagePortBoundaryInterface.class, invocationHandler3);
            c4523cArr[i] = c4523c;
        }
        if (m.f1235a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) w8.a.b(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                cVar = new H0.c(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    cVar2 = null;
                    if (cVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) w8.a.b(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((H0.d) this.f1233u).onPostMessage(webView, cVar2, uri, z8, (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new f(0, jsReplyProxyBoundaryInterface)));
                        return;
                    }
                    return;
                }
                cVar = new H0.c(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            cVar = new H0.c(webMessageBoundaryInterface.getData());
        }
        cVar2 = cVar;
        if (cVar2 == null) {
        }
    }

    public boolean p(String str) {
        String t9 = t(str);
        return "1".equals(t9) || Boolean.parseBoolean(t9);
    }

    public Integer q(String str) {
        String t9 = t(str);
        if (TextUtils.isEmpty(t9)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(t9));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + y(str) + "(" + t9 + ") into an int");
            return null;
        }
    }

    public JSONArray r(String str) {
        String t9 = t(str);
        if (TextUtils.isEmpty(t9)) {
            return null;
        }
        try {
            return new JSONArray(t9);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + y(str) + ": " + t9 + ", falling back to default");
            return null;
        }
    }

    public String s(Resources resources, String str, String str2) {
        String[] strArr;
        String t9 = t(str2);
        if (!TextUtils.isEmpty(t9)) {
            return t9;
        }
        String t10 = t(str2.concat("_loc_key"));
        if (!TextUtils.isEmpty(t10)) {
            int identifier = resources.getIdentifier(t10, com.anythink.expressad.foundation.h.k.f19794g, str);
            if (identifier == 0) {
                Log.w("NotificationParams", y(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            JSONArray r9 = r(str2.concat("_loc_args"));
            if (r9 == null) {
                strArr = null;
            } else {
                int length = r9.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = r9.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e6) {
                Log.w("NotificationParams", "Missing format argument for " + y(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e6);
            }
        }
        return null;
    }

    public String t(String str) {
        Bundle bundle = (Bundle) this.f1233u;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public String toString() {
        switch (this.f1232n) {
            case 19:
                return ((c7.m) this.f1233u).d(getClass().getSimpleName());
            default:
                return super.toString();
        }
    }

    public Bundle v() {
        Bundle bundle = (Bundle) this.f1233u;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void w(int i) {
        ((Y5.a) this.f1233u).k(i);
    }

    public synchronized void x(r1.c cVar) {
        cVar.f40256b = null;
        cVar.f40257c = null;
        ((ArrayDeque) this.f1233u).offer(cVar);
    }

    public /* synthetic */ j(h4.c cVar) {
        this.f1232n = 7;
        cVar.getClass();
        this.f1233u = (I3.a) cVar.f38233u;
    }

    public j(View view) {
        this.f1232n = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            B b9 = new B(10, view);
            b9.f2214x = view;
            this.f1233u = b9;
            return;
        }
        this.f1233u = new h4.c(10, view);
    }

    public j(Y5.a aVar) {
        this.f1232n = 14;
        new ArrayList();
        this.f1233u = aVar;
    }

    public j(Bundle bundle) {
        this.f1232n = 27;
        this.f1233u = new Bundle(bundle);
    }

    public j(WindowInsetsController windowInsetsController) {
        this.f1232n = 11;
        B b9 = new B(10, null);
        b9.f2215y = windowInsetsController;
        this.f1233u = b9;
    }

    public j(t tVar, String str) {
        this.f1232n = 19;
        this.f1233u = new c7.m(str, c7.n.f5726n, 1, tVar);
    }

    public j(TextView textView) {
        this.f1232n = 18;
        this.f1233u = new c0.g(textView);
    }

    public j(int i) {
        this.f1232n = i;
        switch (i) {
            case 4:
                char[] cArr = N1.p.f1976a;
                this.f1233u = new ArrayDeque(0);
                break;
            case 6:
                this.f1233u = new ArrayList();
                break;
            case 20:
                this.f1233u = new HashMap();
                break;
            default:
                this.f1233u = ByteBuffer.allocate(4);
                break;
        }
    }
}
