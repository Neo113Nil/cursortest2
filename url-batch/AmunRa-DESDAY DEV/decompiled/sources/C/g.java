package C;

import K.C0005f;
import K.C0011l;
import K.C0021w;
import K.InterfaceC0002c;
import K.InterfaceC0004e;
import T.ThreadFactoryC0031a;
import T.p;
import T.x;
import X.C0051u;
import X.U;
import a0.C0056a;
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
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0151f;
import k.C0160o;
import k.InterfaceC0169x;
import k.MenuC0158m;
import k.RunnableC0150e;
import k.SubMenuC0145E;
import k.ViewOnKeyListenerC0152g;
import k1.l;
import l.C0223k;
import l.H0;
import o1.n;

/* loaded from: classes.dex */
public class g implements InterfaceC0002c, InterfaceC0004e, T.i, p, G.b, d0.e, H0, InterfaceC0169x {

    /* renamed from: c, reason: collision with root package name */
    public static g f62c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;

    /* renamed from: b, reason: collision with root package name */
    public Object f64b;

    public /* synthetic */ g(int i, Object obj) {
        this.f63a = i;
        this.f64b = obj;
    }

    public void A(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f64b;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f64b).setExtras(bundle);
    }

    @Override // k.InterfaceC0169x
    public void b(MenuC0158m menuC0158m, boolean z2) {
        if (menuC0158m instanceof SubMenuC0145E) {
            ((SubMenuC0145E) menuC0158m).f2543z.k().c(false);
        }
        InterfaceC0169x interfaceC0169x = ((C0223k) this.f64b).f3089e;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    @Override // K.InterfaceC0002c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f64b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0004e
    public int d() {
        int source;
        source = ((ContentInfo) this.f64b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(MenuC0158m menuC0158m, C0160o c0160o) {
        ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f64b;
        viewOnKeyListenerC0152g.f2570f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0152g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0158m == ((C0151f) arrayList.get(i)).f2565b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0152g.f2570f.postAtTime(new RunnableC0150e(this, i2 < arrayList.size() ? (C0151f) arrayList.get(i2) : null, c0160o, menuC0158m), menuC0158m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0169x
    public boolean f(MenuC0158m menuC0158m) {
        C0223k c0223k = (C0223k) this.f64b;
        if (menuC0158m == c0223k.f3088c) {
            return false;
        }
        ((SubMenuC0145E) menuC0158m).f2542A.getClass();
        c0223k.getClass();
        InterfaceC0169x interfaceC0169x = c0223k.f3089e;
        if (interfaceC0169x != null) {
            return interfaceC0169x.f(menuC0158m);
        }
        return false;
    }

    @Override // T.p
    public Object g() {
        return this;
    }

    @Override // K.InterfaceC0004e
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f64b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0002c
    public C0005f i() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f64b).build();
        return new C0005f(new g(build));
    }

    @Override // d0.e
    public void j(int i, Serializable serializable) {
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
        ((ProfileInstallReceiver) this.f64b).setResultCode(i);
    }

    @Override // G.b
    public void k() {
        ((U) this.f64b).a();
    }

    @Override // K.InterfaceC0004e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f64b).getFlags();
        return flags;
    }

    @Override // d0.e
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.p
    public boolean n(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f64b)) {
            return true;
        }
        xVar.f800c = (xVar.f800c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo o() {
        return (ContentInfo) this.f64b;
    }

    @Override // T.i
    public void p(final s1.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                s1.d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s s2 = s1.l.s((Context) gVar.f64b);
                    if (s2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) s2.f761b);
                    synchronized (rVar.d) {
                        rVar.f787f = threadPoolExecutor2;
                    }
                    ((i) s2.f761b).p(new m(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.T(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // l.H0
    public void q(MenuC0158m menuC0158m, C0160o c0160o) {
        ((ViewOnKeyListenerC0152g) this.f64b).f2570f.removeCallbacksAndMessages(menuC0158m);
    }

    @Override // K.InterfaceC0002c
    public void r(int i) {
        ((ContentInfo.Builder) this.f64b).setFlags(i);
    }

    public void s(String str, String str2) {
        Z0.d.e(str, "name");
        Z0.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f64b;
        arrayList.add(str);
        arrayList.add(g1.d.I0(str2).toString());
    }

    public l t() {
        return new l((String[]) ((ArrayList) this.f64b).toArray(new String[0]));
    }

    public String toString() {
        switch (this.f63a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f64b) + "}";
            default:
                return super.toString();
        }
    }

    public L.j u(int i) {
        return null;
    }

    public L.j v(int i) {
        return null;
    }

    public M w(Class cls) {
        String str;
        Z0.b a2 = Z0.h.a(cls);
        Class cls2 = a2.f1063a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = Z0.b.f1062c;
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
            return ((C0011l) this.f64b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void x() {
        View view = (View) this.f64b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y() {
        ((C0051u) this.f64b).f1038k.K();
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public g(View view) {
        this.f63a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f64b = new g(5, view);
            return;
        }
        C0021w c0021w = new C0021w(5, view);
        c0021w.d = view;
        this.f64b = c0021w;
    }

    public g(O o2, N n2) {
        this.f63a = 20;
        Z0.d.e(o2, "store");
        C0056a c0056a = C0056a.f1139b;
        Z0.d.e(c0056a, "defaultCreationExtras");
        this.f64b = new C0011l(o2, n2, c0056a);
    }

    public g(TextView textView) {
        this.f63a = 15;
        this.f64b = new V.g(textView);
    }

    public g(EditText editText) {
        this.f63a = 14;
        this.f64b = new B.j(editText);
    }

    public g(Context context) {
        this.f63a = 12;
        this.f64b = context.getApplicationContext();
    }

    public g(int i) {
        this.f63a = i;
        switch (i) {
            case 7:
                this.f64b = new Object();
                new Handler(Looper.getMainLooper(), new K0.e(this));
                break;
            case 8:
                this.f64b = new L.k(this);
                break;
            case 27:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Z0.d.e(timeUnit, "timeUnit");
                this.f64b = new n(n1.d.h, timeUnit);
                break;
            case 28:
                this.f64b = new ArrayList(20);
                break;
        }
    }

    public g(ContentInfo contentInfo) {
        this.f63a = 4;
        contentInfo.getClass();
        this.f64b = F0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f63a = 3;
        this.f64b = F0.e.e(clipData, i);
    }
}
