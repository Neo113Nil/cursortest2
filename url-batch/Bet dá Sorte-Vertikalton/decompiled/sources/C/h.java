package C;

import K.C0005f;
import K.C0011l;
import K.C0021w;
import K.InterfaceC0002c;
import K.InterfaceC0004e;
import T.ThreadFactoryC0030a;
import T.p;
import T.x;
import X.B;
import X.C0050u;
import X.U;
import a0.C0055a;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0150f;
import k.C0159o;
import k.InterfaceC0155k;
import k.InterfaceC0168x;
import k.MenuC0157m;
import k.RunnableC0149e;
import k.SubMenuC0144E;
import k.ViewOnKeyListenerC0151g;
import l.C0219k;
import l.F0;
import l.InterfaceC0225n;
import l.V0;
import l.Y;

/* loaded from: classes.dex */
public class h implements InterfaceC0002c, InterfaceC0004e, T.i, p, G.b, d0.e, F0, InterfaceC0168x, InterfaceC0155k, Y {

    /* renamed from: c, reason: collision with root package name */
    public static h f148c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    /* renamed from: b, reason: collision with root package name */
    public Object f150b;

    public /* synthetic */ h(int i, Object obj) {
        this.f149a = i;
        this.f150b = obj;
    }

    public void A() {
        View view = (View) this.f150b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void B() {
        ((C0050u) this.f150b).h.K();
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f150b).setExtras(bundle);
    }

    @Override // k.InterfaceC0168x
    public void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m instanceof SubMenuC0144E) {
            ((SubMenuC0144E) menuC0157m).f2589z.k().c(false);
        }
        InterfaceC0168x interfaceC0168x = ((C0219k) this.f150b).f2975e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // l.Y
    public void c(int i) {
    }

    @Override // K.InterfaceC0002c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f150b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0004e
    public int e() {
        int source;
        source = ((ContentInfo) this.f150b).getSource();
        return source;
    }

    @Override // l.F0
    public void f(MenuC0157m menuC0157m, C0159o c0159o) {
        ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f150b;
        viewOnKeyListenerC0151g.f2616f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0151g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0157m == ((C0150f) arrayList.get(i)).f2611b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0151g.f2616f.postAtTime(new RunnableC0149e(this, i2 < arrayList.size() ? (C0150f) arrayList.get(i2) : null, c0159o, menuC0157m), menuC0157m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0168x
    public boolean g(MenuC0157m menuC0157m) {
        C0219k c0219k = (C0219k) this.f150b;
        if (menuC0157m == c0219k.f2974c) {
            return false;
        }
        ((SubMenuC0144E) menuC0157m).f2588A.getClass();
        c0219k.getClass();
        InterfaceC0168x interfaceC0168x = c0219k.f2975e;
        if (interfaceC0168x != null) {
            return interfaceC0168x.g(menuC0157m);
        }
        return false;
    }

    @Override // T.i
    public void h(final u1.l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C.h hVar = C.h.this;
                u1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                hVar.getClass();
                try {
                    s v2 = u1.d.v((Context) hVar.f150b);
                    if (v2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) v2.f786b);
                    synchronized (rVar.d) {
                        rVar.f812f = threadPoolExecutor2;
                    }
                    ((i) v2.f786b).h(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.U(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // T.p
    public Object i() {
        return this;
    }

    @Override // K.InterfaceC0004e
    public ClipData j() {
        ClipData clip;
        clip = ((ContentInfo) this.f150b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0002c
    public C0005f k() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f150b).build();
        return new C0005f(new h(build));
    }

    @Override // d0.e
    public void l(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f150b).setResultCode(i);
    }

    @Override // G.b
    public void m() {
        ((U) this.f150b).a();
    }

    @Override // K.InterfaceC0004e
    public int n() {
        int flags;
        flags = ((ContentInfo) this.f150b).getFlags();
        return flags;
    }

    @Override // l.Y
    public void o(int i, float f2) {
    }

    @Override // d0.e
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0155k
    public void q(MenuC0157m menuC0157m) {
        V0 v02 = ((ActionMenuView) this.f150b).f1263u;
        if (v02 != null) {
            v02.q(menuC0157m);
        }
    }

    @Override // T.p
    public boolean r(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f150b)) {
            return true;
        }
        xVar.f825c = (xVar.f825c & 3) | 4;
        return false;
    }

    @Override // k.InterfaceC0155k
    public boolean s(MenuC0157m menuC0157m, MenuItem menuItem) {
        InterfaceC0225n interfaceC0225n = ((ActionMenuView) this.f150b).f1268z;
        if (interfaceC0225n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((V0) interfaceC0225n).f2906a.f1290G.f405c).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f876a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo t() {
        return (ContentInfo) this.f150b;
    }

    public String toString() {
        switch (this.f149a) {
            case 3:
                return "ContentInfoCompat{" + ((ContentInfo) this.f150b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // l.F0
    public void u(MenuC0157m menuC0157m, C0159o c0159o) {
        ((ViewOnKeyListenerC0151g) this.f150b).f2616f.removeCallbacksAndMessages(menuC0157m);
    }

    @Override // l.Y
    public void v(int i) {
    }

    @Override // K.InterfaceC0002c
    public void w(int i) {
        ((ContentInfo.Builder) this.f150b).setFlags(i);
    }

    public L.j x(int i) {
        return null;
    }

    public L.j y(int i) {
        return null;
    }

    public M z(Class cls) {
        String str;
        b1.b a2 = b1.h.a(cls);
        Class cls2 = a2.f1583a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = b1.b.f1582c;
            if (isArray) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls2.getName());
                if (str2 == null) {
                    str2 = cls2.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((C0011l) this.f150b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public h(View view) {
        this.f149a = 5;
        if (Build.VERSION.SDK_INT < 30) {
            this.f150b = new h(4, view);
            return;
        }
        C0021w c0021w = new C0021w(4, view);
        c0021w.d = view;
        this.f150b = c0021w;
    }

    public h(int i) {
        this.f149a = i;
        switch (i) {
            case 6:
                this.f150b = new L.k(this);
                break;
            case 8:
                this.f150b = new Object();
                new Handler(Looper.getMainLooper(), new O0.e(this));
                break;
        }
    }

    public h(O o2, N n2) {
        this.f149a = 20;
        b1.d.e(o2, "store");
        C0055a c0055a = C0055a.f1178b;
        b1.d.e(c0055a, "defaultCreationExtras");
        this.f150b = new C0011l(o2, n2, c0055a);
    }

    public h(TextView textView) {
        this.f149a = 15;
        this.f150b = new V.g(textView);
    }

    public h(EditText editText) {
        this.f149a = 14;
        this.f150b = new B.j(editText);
    }

    public h(Context context) {
        this.f149a = 12;
        this.f150b = context.getApplicationContext();
    }

    public h(ContentInfo contentInfo) {
        this.f149a = 3;
        contentInfo.getClass();
        this.f150b = J0.e.g(contentInfo);
    }

    public h(ClipData clipData, int i) {
        this.f149a = 2;
        this.f150b = J0.e.e(clipData, i);
    }
}
