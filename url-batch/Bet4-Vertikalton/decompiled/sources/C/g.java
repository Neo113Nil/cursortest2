package C;

import D0.o;
import K.C0008f;
import K.C0014l;
import K.C0024w;
import K.InterfaceC0004c;
import K.InterfaceC0007e;
import P0.m;
import P0.r;
import U.ThreadFactoryC0034a;
import U.p;
import U.x;
import Y.B;
import Y.C0054u;
import Y.U;
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
import b0.C0078a;
import g.AbstractActivityC0106i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0157f;
import k.C0166o;
import k.InterfaceC0162k;
import k.InterfaceC0175x;
import k.MenuC0164m;
import k.RunnableC0156e;
import k.SubMenuC0151E;
import k.ViewOnKeyListenerC0158g;
import l.C0216k;
import l.G0;
import l.InterfaceC0222n;
import l.W0;
import w1.l;

/* loaded from: classes.dex */
public class g implements InterfaceC0004c, InterfaceC0007e, U.i, p, G.b, e0.e, G0, InterfaceC0175x, InterfaceC0162k {

    /* renamed from: c, reason: collision with root package name */
    public static g f113c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* renamed from: b, reason: collision with root package name */
    public Object f115b;

    public /* synthetic */ g(int i, Object obj) {
        this.f114a = i;
        this.f115b = obj;
    }

    public static String D(r rVar, String str) {
        return "packed_" + rVar.name() + "_" + str;
    }

    public static String v(r rVar) {
        return "custom_items_" + rVar.name();
    }

    public void A() {
        View view = (View) this.f115b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public boolean B(r rVar, String str) {
        d1.d.e(rVar, "trip");
        d1.d.e(str, "itemName");
        return ((SharedPreferences) this.f115b).getBoolean(D(rVar, str), false);
    }

    public void C() {
        ((C0054u) this.f115b).h.K();
    }

    public boolean E(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f115b).setExtras(bundle);
    }

    @Override // k.InterfaceC0175x
    public void b(MenuC0164m menuC0164m, boolean z2) {
        if (menuC0164m instanceof SubMenuC0151E) {
            ((SubMenuC0151E) menuC0164m).f2626z.k().c(false);
        }
        InterfaceC0175x interfaceC0175x = ((C0216k) this.f115b).f2935e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // K.InterfaceC0004c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f115b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0007e
    public int d() {
        int source;
        source = ((ContentInfo) this.f115b).getSource();
        return source;
    }

    @Override // l.G0
    public void e(MenuC0164m menuC0164m, C0166o c0166o) {
        ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f115b;
        viewOnKeyListenerC0158g.f2653f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0158g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0164m == ((C0157f) arrayList.get(i)).f2648b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0158g.f2653f.postAtTime(new RunnableC0156e(this, i2 < arrayList.size() ? (C0157f) arrayList.get(i2) : null, c0166o, menuC0164m), menuC0164m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0175x
    public boolean f(MenuC0164m menuC0164m) {
        C0216k c0216k = (C0216k) this.f115b;
        if (menuC0164m == c0216k.f2934c) {
            return false;
        }
        ((SubMenuC0151E) menuC0164m).f2625A.getClass();
        c0216k.getClass();
        InterfaceC0175x interfaceC0175x = c0216k.f2935e;
        if (interfaceC0175x != null) {
            return interfaceC0175x.f(menuC0164m);
        }
        return false;
    }

    @Override // U.i
    public void g(final l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0034a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                w1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s w2 = w1.d.w((Context) gVar.f115b);
                    if (w2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) w2.f844b);
                    synchronized (rVar.d) {
                        rVar.f870f = threadPoolExecutor2;
                    }
                    ((i) w2.f844b).g(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.H(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // U.p
    public Object h() {
        return this;
    }

    @Override // K.InterfaceC0007e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f115b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0004c
    public C0008f j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f115b).build();
        return new C0008f(new g(build));
    }

    @Override // e0.e
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
        ((ProfileInstallReceiver) this.f115b).setResultCode(i);
    }

    @Override // G.b
    public void l() {
        ((U) this.f115b).a();
    }

    @Override // K.InterfaceC0007e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f115b).getFlags();
        return flags;
    }

    @Override // e0.e
    public void n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0162k
    public void o(MenuC0164m menuC0164m) {
        W0 w02 = ((ActionMenuView) this.f115b).f1308u;
        if (w02 != null) {
            w02.o(menuC0164m);
        }
    }

    @Override // k.InterfaceC0162k
    public boolean p(MenuC0164m menuC0164m, MenuItem menuItem) {
        InterfaceC0222n interfaceC0222n = ((ActionMenuView) this.f115b).f1313z;
        if (interfaceC0222n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0222n).f2864a.f1332G.f475b).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f922a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U.p
    public boolean q(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f115b)) {
            return true;
        }
        xVar.f883c = (xVar.f883c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0007e
    public ContentInfo r() {
        return (ContentInfo) this.f115b;
    }

    @Override // l.G0
    public void s(MenuC0164m menuC0164m, C0166o c0166o) {
        ((ViewOnKeyListenerC0158g) this.f115b).f2653f.removeCallbacksAndMessages(menuC0164m);
    }

    @Override // K.InterfaceC0004c
    public void t(int i) {
        ((ContentInfo.Builder) this.f115b).setFlags(i);
    }

    public String toString() {
        switch (this.f114a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f115b) + "}";
            default:
                return super.toString();
        }
    }

    public L.j u(int i) {
        return null;
    }

    public L.j w(int i) {
        return null;
    }

    public M x(Class cls) {
        String str;
        d1.b a2 = d1.h.a(cls);
        Class cls2 = a2.f2015a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = d1.b.f2014c;
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
            return ((C0014l) this.f115b).f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public ArrayList y(r rVar) {
        d1.d.e(rVar, "trip");
        return S0.g.C0(m.a(rVar), z(rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List z(r rVar) {
        d1.d.e(rVar, "trip");
        String v2 = v(rVar);
        Set set = S0.r.f797a;
        Set stringSet = ((SharedPreferences) this.f115b).getStringSet(v2, set);
        if (stringSet != null) {
            set = stringSet;
        }
        List E0 = S0.g.E0(set);
        o oVar = new o(1);
        if (E0.size() <= 1) {
            return S0.g.E0(E0);
        }
        Object[] array = E0.toArray(new Object[0]);
        d1.d.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, oVar);
        }
        return S0.f.b0(array);
    }

    public g(AbstractActivityC0106i abstractActivityC0106i) {
        this.f114a = 11;
        this.f115b = abstractActivityC0106i.getSharedPreferences("play_bag_checklists", 0);
    }

    public g(View view) {
        this.f114a = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            C0024w c0024w = new C0024w(5, view);
            c0024w.d = view;
            this.f115b = c0024w;
            return;
        }
        this.f115b = new g(5, view);
    }

    public g(int i) {
        this.f114a = i;
        switch (i) {
            case 7:
                this.f115b = new L.k(this);
                break;
            case 8:
                this.f115b = new Object();
                new Handler(Looper.getMainLooper(), new L0.e(this));
                break;
        }
    }

    public g(O o2, N n2) {
        this.f114a = 21;
        d1.d.e(o2, "store");
        C0078a c0078a = C0078a.f1631b;
        d1.d.e(c0078a, "defaultCreationExtras");
        this.f115b = new C0014l(o2, n2, c0078a);
    }

    public g(TextView textView) {
        this.f114a = 16;
        this.f115b = new W.g(textView);
    }

    public g(EditText editText) {
        this.f114a = 15;
        this.f115b = new B.j(editText);
    }

    public g(Context context) {
        this.f114a = 13;
        this.f115b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f114a = 4;
        contentInfo.getClass();
        this.f115b = G0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f114a = 3;
        this.f115b = G0.e.e(clipData, i);
    }
}
