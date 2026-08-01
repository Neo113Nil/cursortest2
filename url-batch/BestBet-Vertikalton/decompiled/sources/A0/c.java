package A0;

import K.C0010f;
import K.C0024u;
import K.InterfaceC0007c;
import K.InterfaceC0009e;
import K.Q;
import L.j;
import L.k;
import L.s;
import T0.e;
import U.ThreadFactoryC0030a;
import U.i;
import W.g;
import Y.C0053u;
import Y.U;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0080a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e0.InterfaceC0106e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0182f;
import k.C0192p;
import k.MenuC0189m;
import k.RunnableC0181e;
import k.ViewOnKeyListenerC0183g;
import l.F0;
import u0.C0365d;
import u0.C0372k;

/* loaded from: classes.dex */
public class c implements s, D0.a, InterfaceC0007c, InterfaceC0009e, i, G.b, InterfaceC0106e, F0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6b;

    public /* synthetic */ c(int i, Object obj) {
        this.f5a = i;
        this.f6b = obj;
    }

    @Override // K.InterfaceC0007c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f6b).setExtras(bundle);
    }

    @Override // K.InterfaceC0007c
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f6b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0009e
    public int c() {
        int source;
        source = ((ContentInfo) this.f6b).getSource();
        return source;
    }

    @Override // l.F0
    public void d(MenuC0189m menuC0189m, C0192p c0192p) {
        ViewOnKeyListenerC0183g viewOnKeyListenerC0183g = (ViewOnKeyListenerC0183g) this.f6b;
        viewOnKeyListenerC0183g.f3131f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0183g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0189m == ((C0182f) arrayList.get(i)).f3126b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0183g.f3131f.postAtTime(new RunnableC0181e(this, i2 < arrayList.size() ? (C0182f) arrayList.get(i2) : null, c0192p, menuC0189m), menuC0189m, SystemClock.uptimeMillis() + 200);
    }

    @Override // U.i
    public void e(final H1.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                A0.c cVar = A0.c.this;
                H1.d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                cVar.getClass();
                try {
                    t u2 = H1.l.u((Context) cVar.f6b);
                    if (u2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) u2.f1086b);
                    synchronized (sVar.d) {
                        sVar.f1114f = threadPoolExecutor2;
                    }
                    ((i) u2.f1086b).e(new m(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.S(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0009e
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f6b).getClip();
        return clip;
    }

    @Override // L.s
    public boolean g(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f6b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = Q.f578a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f2142e;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f1937A0);
        e eVar = swipeDismissBehavior.f2140b;
        if (eVar != null) {
            eVar.a(view);
        }
        return true;
    }

    @Override // K.InterfaceC0007c
    public C0010f h() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f6b).build();
        return new C0010f(new c(build));
    }

    @Override // e0.InterfaceC0106e
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
        ((ProfileInstallReceiver) this.f6b).setResultCode(i);
    }

    @Override // G.b
    public void j() {
        ((U) this.f6b).a();
    }

    @Override // K.InterfaceC0009e
    public int k() {
        int flags;
        flags = ((ContentInfo) this.f6b).getFlags();
        return flags;
    }

    @Override // e0.InterfaceC0106e
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // K.InterfaceC0009e
    public ContentInfo m() {
        return (ContentInfo) this.f6b;
    }

    @Override // l.F0
    public void n(MenuC0189m menuC0189m, C0192p c0192p) {
        ((ViewOnKeyListenerC0183g) this.f6b).f3131f.removeCallbacksAndMessages(menuC0189m);
    }

    @Override // K.InterfaceC0007c
    public void o(int i) {
        ((ContentInfo.Builder) this.f6b).setFlags(i);
    }

    public j p(int i) {
        return null;
    }

    public j q(int i) {
        return null;
    }

    public O r(Class cls) {
        String str;
        k1.c a2 = k1.i.a(cls);
        Class cls2 = a2.f3240a;
        k1.e.e(cls2, "jClass");
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = k1.c.f3239c;
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
            return ((C0372k) this.f6b).g(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void s() {
        View view = (View) this.f6b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void t() {
        ((C0053u) this.f6b).d.K();
    }

    public String toString() {
        switch (this.f5a) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f6b) + "}";
            default:
                return super.toString();
        }
    }

    public boolean u(int i, int i2, Bundle bundle) {
        return false;
    }

    public /* synthetic */ c(int i, boolean z2) {
        this.f5a = i;
    }

    public c(int i) {
        this.f5a = i;
        switch (i) {
            case 9:
                this.f6b = new k(this);
                break;
            case 28:
                this.f6b = new LinkedHashMap();
                break;
            default:
                this.f6b = new LinkedHashSet();
                break;
        }
    }

    public c(View view) {
        this.f5a = 8;
        if (Build.VERSION.SDK_INT >= 30) {
            C0024u c0024u = new C0024u(7, view);
            c0024u.f661c = view;
            this.f6b = c0024u;
            return;
        }
        this.f6b = new c(7, view);
    }

    public c(androidx.lifecycle.Q q2, P p2) {
        this.f5a = 23;
        k1.e.e(q2, "store");
        C0080a c0080a = C0080a.f2039b;
        k1.e.e(c0080a, "defaultCreationExtras");
        this.f6b = new C0372k(q2, p2, c0080a);
    }

    public c(TextView textView) {
        this.f5a = 18;
        this.f6b = new g(textView);
    }

    public c(EditText editText) {
        this.f5a = 17;
        this.f6b = new C0365d(editText);
    }

    public c(Context context) {
        this.f5a = 16;
        this.f6b = context.getApplicationContext();
    }

    public c(A1.b bVar) {
        this.f5a = 2;
        this.f6b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
    }

    public c(ContentInfo contentInfo) {
        this.f5a = 6;
        contentInfo.getClass();
        this.f6b = C0.a.g(contentInfo);
    }

    public c(ClipData clipData, int i) {
        this.f5a = 5;
        this.f6b = C0.a.e(clipData, i);
    }
}
