package C;

import K.C0005f;
import K.C0011l;
import K.C0021w;
import K.InterfaceC0002c;
import K.InterfaceC0004e;
import T.ThreadFactoryC0031a;
import T.p;
import T.x;
import X.B;
import X.C0051u;
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
import k.C0153f;
import k.C0162o;
import k.InterfaceC0158k;
import k.InterfaceC0171x;
import k.MenuC0160m;
import k.RunnableC0152e;
import k.SubMenuC0147E;
import k.ViewOnKeyListenerC0154g;
import l.C0225k;
import l.G0;
import l.InterfaceC0231n;
import l.W0;
import l.Z;

/* loaded from: classes.dex */
public class g implements InterfaceC0002c, InterfaceC0004e, T.i, p, G.b, d0.e, G0, InterfaceC0171x, InterfaceC0158k, Z {

    /* renamed from: c, reason: collision with root package name */
    public static g f65c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66a;

    /* renamed from: b, reason: collision with root package name */
    public Object f67b;

    public /* synthetic */ g(int i, Object obj) {
        this.f66a = i;
        this.f67b = obj;
    }

    public void A() {
        View view = (View) this.f67b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void B() {
        ((C0051u) this.f67b).h.K();
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f67b).setExtras(bundle);
    }

    @Override // k.InterfaceC0171x
    public void b(MenuC0160m menuC0160m, boolean z2) {
        if (menuC0160m instanceof SubMenuC0147E) {
            ((SubMenuC0147E) menuC0160m).f2602z.k().c(false);
        }
        InterfaceC0171x interfaceC0171x = ((C0225k) this.f67b).f2996e;
        if (interfaceC0171x != null) {
            interfaceC0171x.b(menuC0160m, z2);
        }
    }

    @Override // l.Z
    public void c(int i) {
    }

    @Override // K.InterfaceC0002c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f67b).setLinkUri(uri);
    }

    @Override // T.i
    public void e(final x1.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                x1.d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s q2 = x1.l.q((Context) gVar.f67b);
                    if (q2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) q2.f798b);
                    synchronized (rVar.d) {
                        rVar.f824f = threadPoolExecutor2;
                    }
                    ((i) q2.f798b).e(new m(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.M(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0004e
    public int f() {
        int source;
        source = ((ContentInfo) this.f67b).getSource();
        return source;
    }

    @Override // l.G0
    public void g(MenuC0160m menuC0160m, C0162o c0162o) {
        ViewOnKeyListenerC0154g viewOnKeyListenerC0154g = (ViewOnKeyListenerC0154g) this.f67b;
        viewOnKeyListenerC0154g.f2629f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0154g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0160m == ((C0153f) arrayList.get(i)).f2624b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0154g.f2629f.postAtTime(new RunnableC0152e(this, i2 < arrayList.size() ? (C0153f) arrayList.get(i2) : null, c0162o, menuC0160m), menuC0160m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0171x
    public boolean h(MenuC0160m menuC0160m) {
        C0225k c0225k = (C0225k) this.f67b;
        if (menuC0160m == c0225k.f2995c) {
            return false;
        }
        ((SubMenuC0147E) menuC0160m).f2601A.getClass();
        c0225k.getClass();
        InterfaceC0171x interfaceC0171x = c0225k.f2996e;
        if (interfaceC0171x != null) {
            return interfaceC0171x.h(menuC0160m);
        }
        return false;
    }

    @Override // T.p
    public Object i() {
        return this;
    }

    @Override // K.InterfaceC0004e
    public ClipData j() {
        ClipData clip;
        clip = ((ContentInfo) this.f67b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0002c
    public C0005f k() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f67b).build();
        return new C0005f(new g(build));
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
        ((ProfileInstallReceiver) this.f67b).setResultCode(i);
    }

    @Override // G.b
    public void m() {
        ((U) this.f67b).a();
    }

    @Override // K.InterfaceC0004e
    public int n() {
        int flags;
        flags = ((ContentInfo) this.f67b).getFlags();
        return flags;
    }

    @Override // l.Z
    public void o(int i, float f2) {
    }

    @Override // d0.e
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0158k
    public void q(MenuC0160m menuC0160m) {
        W0 w02 = ((ActionMenuView) this.f67b).f1294u;
        if (w02 != null) {
            w02.q(menuC0160m);
        }
    }

    @Override // T.p
    public boolean r(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f67b)) {
            return true;
        }
        xVar.f837c = (xVar.f837c & 3) | 4;
        return false;
    }

    @Override // k.InterfaceC0158k
    public boolean s(MenuC0160m menuC0160m, MenuItem menuItem) {
        InterfaceC0231n interfaceC0231n = ((ActionMenuView) this.f67b).f1299z;
        if (interfaceC0231n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0231n).f2927a.f1318G.f476c).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f902a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo t() {
        return (ContentInfo) this.f67b;
    }

    public String toString() {
        switch (this.f66a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f67b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // l.G0
    public void u(MenuC0160m menuC0160m, C0162o c0162o) {
        ((ViewOnKeyListenerC0154g) this.f67b).f2629f.removeCallbacksAndMessages(menuC0160m);
    }

    @Override // l.Z
    public void v(int i) {
    }

    @Override // K.InterfaceC0002c
    public void w(int i) {
        ((ContentInfo.Builder) this.f67b).setFlags(i);
    }

    public L.j x(int i) {
        return null;
    }

    public L.j y(int i) {
        return null;
    }

    public M z(Class cls) {
        String str;
        e1.b a2 = e1.h.a(cls);
        Class cls2 = a2.f2051a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = e1.b.f2050c;
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
            return ((C0011l) this.f67b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public g(View view) {
        this.f66a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f67b = new g(5, view);
            return;
        }
        C0021w c0021w = new C0021w(5, view);
        c0021w.d = view;
        this.f67b = c0021w;
    }

    public g(O o2, N n2) {
        this.f66a = 20;
        e1.d.e(o2, "store");
        C0055a c0055a = C0055a.f1208b;
        e1.d.e(c0055a, "defaultCreationExtras");
        this.f67b = new C0011l(o2, n2, c0055a);
    }

    public g(TextView textView) {
        this.f66a = 15;
        this.f67b = new V.g(textView);
    }

    public g(EditText editText) {
        this.f66a = 14;
        this.f67b = new B.j(editText);
    }

    public g(int i) {
        this.f66a = i;
        switch (i) {
            case 7:
                this.f67b = new Object();
                new Handler(Looper.getMainLooper(), new K0.e(this));
                break;
            case 8:
                this.f67b = new L.k(this);
                break;
        }
    }

    public g(Context context) {
        this.f66a = 12;
        this.f67b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f66a = 4;
        contentInfo.getClass();
        this.f67b = F0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f66a = 3;
        this.f67b = F0.e.e(clipData, i);
    }
}
