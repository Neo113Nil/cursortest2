package C1;

import M.C0010f;
import M.C0024u;
import M.InterfaceC0007c;
import M.InterfaceC0009e;
import N.j;
import V.ThreadFactoryC0035a;
import V.i;
import X.g;
import Z.C0056u;
import Z.U;
import a.AbstractC0058a;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import c0.C0101a;
import j1.h;
import j1.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C0222f;
import m.C0231o;
import m.InterfaceC0240x;
import m.MenuC0229m;
import m.RunnableC0221e;
import m.SubMenuC0216E;
import m.ViewOnKeyListenerC0223g;
import n.C0282k;
import n.J0;

/* loaded from: classes.dex */
public class d implements InterfaceC0007c, InterfaceC0009e, i, I.b, f0.e, J0, InterfaceC0240x {

    /* renamed from: c, reason: collision with root package name */
    public static d f143c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a;

    /* renamed from: b, reason: collision with root package name */
    public Object f145b;

    public /* synthetic */ d(int i, Object obj) {
        this.f144a = i;
        this.f145b = obj;
    }

    @Override // M.InterfaceC0007c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f145b).setExtras(bundle);
    }

    @Override // m.InterfaceC0240x
    public void b(MenuC0229m menuC0229m, boolean z2) {
        if (menuC0229m instanceof SubMenuC0216E) {
            ((SubMenuC0216E) menuC0229m).f3289z.k().c(false);
        }
        InterfaceC0240x interfaceC0240x = ((C0282k) this.f145b).e;
        if (interfaceC0240x != null) {
            interfaceC0240x.b(menuC0229m, z2);
        }
    }

    @Override // M.InterfaceC0007c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f145b).setLinkUri(uri);
    }

    @Override // M.InterfaceC0009e
    public int d() {
        int source;
        source = ((ContentInfo) this.f145b).getSource();
        return source;
    }

    @Override // V.i
    public void e(final AbstractC0058a abstractC0058a) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0035a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: V.l
            @Override // java.lang.Runnable
            public final void run() {
                C1.d dVar = C1.d.this;
                AbstractC0058a abstractC0058a2 = abstractC0058a;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                dVar.getClass();
                try {
                    t r2 = H1.l.r((Context) dVar.f145b);
                    if (r2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) r2.f1272b);
                    synchronized (sVar.f1298d) {
                        sVar.f1299f = threadPoolExecutor2;
                    }
                    ((i) r2.f1272b).e(new m(abstractC0058a2, threadPoolExecutor2));
                } catch (Throwable th) {
                    abstractC0058a2.O(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // M.InterfaceC0009e
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f145b).getClip();
        return clip;
    }

    @Override // m.InterfaceC0240x
    public boolean g(MenuC0229m menuC0229m) {
        C0282k c0282k = (C0282k) this.f145b;
        if (menuC0229m == c0282k.f3652c) {
            return false;
        }
        ((SubMenuC0216E) menuC0229m).f3288A.getClass();
        c0282k.getClass();
        InterfaceC0240x interfaceC0240x = c0282k.e;
        if (interfaceC0240x != null) {
            return interfaceC0240x.g(menuC0229m);
        }
        return false;
    }

    @Override // M.InterfaceC0007c
    public C0010f h() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f145b).build();
        return new C0010f(new d(build));
    }

    @Override // f0.e
    public void i(int i, Serializable serializable) {
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
        ((ProfileInstallReceiver) this.f145b).setResultCode(i);
    }

    @Override // n.J0
    public void j(MenuC0229m menuC0229m, C0231o c0231o) {
        ((ViewOnKeyListenerC0223g) this.f145b).f3316f.removeCallbacksAndMessages(menuC0229m);
    }

    @Override // I.b
    public void k() {
        ((U) this.f145b).a();
    }

    @Override // M.InterfaceC0009e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f145b).getFlags();
        return flags;
    }

    @Override // f0.e
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // n.J0
    public void n(MenuC0229m menuC0229m, C0231o c0231o) {
        ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f145b;
        viewOnKeyListenerC0223g.f3316f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0223g.f3318h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0229m == ((C0222f) arrayList.get(i)).f3311b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0223g.f3316f.postAtTime(new RunnableC0221e(this, i2 < arrayList.size() ? (C0222f) arrayList.get(i2) : null, c0231o, menuC0229m), menuC0229m, SystemClock.uptimeMillis() + 200);
    }

    @Override // M.InterfaceC0009e
    public ContentInfo o() {
        return (ContentInfo) this.f145b;
    }

    @Override // M.InterfaceC0007c
    public void p(int i) {
        ((ContentInfo.Builder) this.f145b).setFlags(i);
    }

    public N.i q(int i) {
        return null;
    }

    public N.i r(int i) {
        return null;
    }

    public O s(Class cls) {
        String str;
        j1.d a2 = l.a(cls);
        Class cls2 = a2.f3178a;
        h.e(cls2, "jClass");
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = j1.d.f3176c;
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
            return ((I0.h) this.f145b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void t() {
        View view = (View) this.f145b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public String toString() {
        switch (this.f144a) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f145b) + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        ((C0056u) this.f145b).e.K();
    }

    public boolean v(int i, int i2, Bundle bundle) {
        return false;
    }

    public d(int i) {
        this.f144a = i;
        switch (i) {
            case 2:
                break;
            case 8:
                this.f145b = new j(this);
                break;
            case 10:
                this.f145b = new Object();
                new Handler(Looper.getMainLooper(), new P0.e(this));
                break;
            case 22:
                this.f145b = new LinkedHashMap();
                break;
            default:
                this.f145b = new LinkedHashSet();
                break;
        }
    }

    public d(View view) {
        this.f144a = 7;
        if (Build.VERSION.SDK_INT >= 30) {
            C0024u c0024u = new C0024u(6, view);
            c0024u.f795d = view;
            this.f145b = c0024u;
            return;
        }
        this.f145b = new d(6, view);
    }

    public d(Q q2, P p2) {
        this.f144a = 21;
        h.e(q2, "store");
        C0101a c0101a = C0101a.f2227b;
        h.e(c0101a, "defaultCreationExtras");
        this.f145b = new I0.h(q2, p2, c0101a);
    }

    public d(TextView textView) {
        this.f144a = 16;
        this.f145b = new g(textView);
    }

    public d(EditText editText) {
        this.f144a = 15;
        this.f145b = new B1.c(editText);
    }

    public d(Context context) {
        this.f144a = 14;
        this.f145b = context.getApplicationContext();
    }

    public d(A1.b bVar) {
        this.f144a = 0;
        this.f145b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }

    public d(ContentInfo contentInfo) {
        this.f144a = 5;
        contentInfo.getClass();
        this.f145b = K0.e.g(contentInfo);
    }

    public d(ClipData clipData, int i) {
        this.f144a = 4;
        this.f145b = K0.e.e(clipData, i);
    }
}
