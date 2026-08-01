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
import a0.C0056a;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
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
import g.AbstractActivityC0133i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0154f;
import k.C0163o;
import k.InterfaceC0159k;
import k.InterfaceC0172x;
import k.MenuC0161m;
import k.RunnableC0153e;
import k.SubMenuC0148E;
import k.ViewOnKeyListenerC0155g;
import l.C0226k;
import l.H0;
import l.InterfaceC0232n;
import l.X0;
import u1.l;

/* loaded from: classes.dex */
public class g implements InterfaceC0002c, InterfaceC0004e, T.i, p, G.b, d0.e, H0, InterfaceC0172x, InterfaceC0159k {

    /* renamed from: c, reason: collision with root package name */
    public static g f64c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b, reason: collision with root package name */
    public Object f66b;

    public /* synthetic */ g(int i, Object obj) {
        this.f65a = i;
        this.f66b = obj;
    }

    public void A() {
        View view = (View) this.f66b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void B() {
        ((C0051u) this.f66b).h.K();
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    public void D(int i) {
        ((SharedPreferences) this.f66b).edit().putInt("password_length", l.n(i, 8, 32)).apply();
    }

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f66b).setExtras(bundle);
    }

    @Override // k.InterfaceC0172x
    public void b(MenuC0161m menuC0161m, boolean z2) {
        if (menuC0161m instanceof SubMenuC0148E) {
            ((SubMenuC0148E) menuC0161m).f2553z.k().c(false);
        }
        InterfaceC0172x interfaceC0172x = ((C0226k) this.f66b).f2943e;
        if (interfaceC0172x != null) {
            interfaceC0172x.b(menuC0161m, z2);
        }
    }

    @Override // K.InterfaceC0002c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f66b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0004e
    public int d() {
        int source;
        source = ((ContentInfo) this.f66b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(MenuC0161m menuC0161m, C0163o c0163o) {
        ViewOnKeyListenerC0155g viewOnKeyListenerC0155g = (ViewOnKeyListenerC0155g) this.f66b;
        viewOnKeyListenerC0155g.f2580f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0155g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0161m == ((C0154f) arrayList.get(i)).f2575b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0155g.f2580f.postAtTime(new RunnableC0153e(this, i2 < arrayList.size() ? (C0154f) arrayList.get(i2) : null, c0163o, menuC0161m), menuC0161m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0172x
    public boolean f(MenuC0161m menuC0161m) {
        C0226k c0226k = (C0226k) this.f66b;
        if (menuC0161m == c0226k.f2942c) {
            return false;
        }
        ((SubMenuC0148E) menuC0161m).f2552A.getClass();
        c0226k.getClass();
        InterfaceC0172x interfaceC0172x = c0226k.f2943e;
        if (interfaceC0172x != null) {
            return interfaceC0172x.f(menuC0161m);
        }
        return false;
    }

    @Override // T.i
    public void g(final l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                u1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s u2 = u1.d.u((Context) gVar.f66b);
                    if (u2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) u2.f771b);
                    synchronized (rVar.d) {
                        rVar.f797f = threadPoolExecutor2;
                    }
                    ((i) u2.f771b).g(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.K(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // T.p
    public Object h() {
        return this;
    }

    @Override // K.InterfaceC0004e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f66b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0002c
    public C0005f j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f66b).build();
        return new C0005f(new g(build));
    }

    @Override // d0.e
    public void k(int i, Serializable serializable) {
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
        ((ProfileInstallReceiver) this.f66b).setResultCode(i);
    }

    @Override // G.b
    public void l() {
        ((U) this.f66b).a();
    }

    @Override // K.InterfaceC0004e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f66b).getFlags();
        return flags;
    }

    @Override // d0.e
    public void n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0159k
    public void o(MenuC0161m menuC0161m) {
        X0 x02 = ((ActionMenuView) this.f66b).f1249u;
        if (x02 != null) {
            x02.o(menuC0161m);
        }
    }

    @Override // T.p
    public boolean p(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f66b)) {
            return true;
        }
        xVar.f810c = (xVar.f810c & 3) | 4;
        return false;
    }

    @Override // k.InterfaceC0159k
    public boolean q(MenuC0161m menuC0161m, MenuItem menuItem) {
        InterfaceC0232n interfaceC0232n = ((ActionMenuView) this.f66b).f1254z;
        if (interfaceC0232n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((X0) interfaceC0232n).f2872a.f1273G.f423c).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f862a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo r() {
        return (ContentInfo) this.f66b;
    }

    @Override // l.H0
    public void s(MenuC0161m menuC0161m, C0163o c0163o) {
        ((ViewOnKeyListenerC0155g) this.f66b).f2580f.removeCallbacksAndMessages(menuC0161m);
    }

    @Override // K.InterfaceC0002c
    public void t(int i) {
        ((ContentInfo.Builder) this.f66b).setFlags(i);
    }

    public String toString() {
        switch (this.f65a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f66b) + "}";
            default:
                return super.toString();
        }
    }

    public L.j u(int i) {
        return null;
    }

    public void v() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f66b;
        if (sharedPreferences.getBoolean("use_upper", true) || sharedPreferences.getBoolean("use_lower", true) || sharedPreferences.getBoolean("use_digits", true) || sharedPreferences.getBoolean("use_symbols", true)) {
            return;
        }
        sharedPreferences.edit().putBoolean("use_lower", true).apply();
    }

    public L.j w(int i) {
        return null;
    }

    public M x(Class cls) {
        String str;
        b1.b a2 = b1.h.a(cls);
        Class cls2 = a2.f1567a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = b1.b.f1566c;
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
            return ((C0011l) this.f66b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public int y() {
        return l.n(((SharedPreferences) this.f66b).getInt("password_length", 12), 8, 32);
    }

    public P0.b z() {
        Object dVar;
        String string = ((SharedPreferences) this.f66b).getString("password_type", "SECURE");
        try {
            dVar = P0.b.valueOf(string != null ? string : "SECURE");
        } catch (Throwable th) {
            dVar = new S0.d(th);
        }
        Object obj = P0.b.SECURE;
        if (dVar instanceof S0.d) {
            dVar = obj;
        }
        return (P0.b) dVar;
    }

    public g(AbstractActivityC0133i abstractActivityC0133i) {
        this.f65a = 11;
        SharedPreferences sharedPreferences = abstractActivityC0133i.getSharedPreferences("play_gen_settings", 0);
        b1.d.d(sharedPreferences, "getSharedPreferences(...)");
        this.f66b = sharedPreferences;
    }

    public g(View view) {
        this.f65a = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            C0021w c0021w = new C0021w(5, view);
            c0021w.d = view;
            this.f66b = c0021w;
            return;
        }
        this.f66b = new g(5, view);
    }

    public g(O o2, N n2) {
        this.f65a = 21;
        b1.d.e(o2, "store");
        C0056a c0056a = C0056a.f1164b;
        b1.d.e(c0056a, "defaultCreationExtras");
        this.f66b = new C0011l(o2, n2, c0056a);
    }

    public g(TextView textView) {
        this.f65a = 16;
        this.f66b = new V.g(textView);
    }

    public g(EditText editText) {
        this.f65a = 15;
        this.f66b = new B.j(editText);
    }

    public g(int i) {
        this.f65a = i;
        switch (i) {
            case 7:
                this.f66b = new Object();
                new Handler(Looper.getMainLooper(), new K0.e(this));
                break;
            case 8:
                this.f66b = new L.k(this);
                break;
        }
    }

    public g(Context context) {
        this.f65a = 13;
        this.f66b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f65a = 4;
        contentInfo.getClass();
        this.f66b = F0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f65a = 3;
        this.f66b = F0.e.e(clipData, i);
    }
}
