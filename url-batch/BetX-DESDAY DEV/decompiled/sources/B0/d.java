package B0;

import K.B;
import K.C0010f;
import K.InterfaceC0004c;
import K.InterfaceC0008e;
import T.ThreadFactoryC0036a;
import T.y;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.X;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.luckyarcade.spinthrow.GameConfig;
import g.C0148I;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0195f;
import k.C0204o;
import k.InterfaceC0200k;
import k.InterfaceC0213x;
import k.MenuC0202m;
import k.RunnableC0194e;
import k.SubMenuC0189E;
import k.ViewOnKeyListenerC0196g;
import l.C0270k;
import l.H0;
import l.InterfaceC0251a0;
import l.InterfaceC0276n;
import l.W0;
import l.a1;

/* loaded from: classes.dex */
public class d implements InterfaceC0004c, InterfaceC0008e, T.i, T.p, G.c, c0.d, H0, InterfaceC0213x, InterfaceC0200k, InterfaceC0251a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b, reason: collision with root package name */
    public Object f66b;

    public /* synthetic */ d(int i, Object obj) {
        this.f65a = i;
        this.f66b = obj;
    }

    public L.j A(int i) {
        return null;
    }

    public P B(Class cls) {
        String str;
        X0.b a2 = X0.j.a(cls);
        Class cls2 = a2.f871a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = X0.b.f870c;
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
            return ((T.r) this.f66b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void C() {
        View view = (View) this.f66b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public boolean D(int i, int i2, Bundle bundle) {
        return false;
    }

    public void E(String str) {
        X0.f.e(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f66b;
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

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f66b).setExtras(bundle);
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
        if (menuC0202m instanceof SubMenuC0189E) {
            ((SubMenuC0189E) menuC0202m).f2997z.k().c(false);
        }
        InterfaceC0213x interfaceC0213x = ((C0270k) this.f66b).f3393e;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // l.InterfaceC0251a0
    public void c(int i) {
    }

    @Override // K.InterfaceC0004c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f66b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0008e
    public int e() {
        int source;
        source = ((ContentInfo) this.f66b).getSource();
        return source;
    }

    @Override // l.H0
    public void f(MenuC0202m menuC0202m, C0204o c0204o) {
        ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f66b;
        viewOnKeyListenerC0196g.f3027f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0196g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0202m == ((C0195f) arrayList.get(i)).f3021b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0196g.f3027f.postAtTime(new RunnableC0194e(this, i2 < arrayList.size() ? (C0195f) arrayList.get(i2) : null, c0204o, menuC0202m), menuC0202m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0213x
    public boolean g(MenuC0202m menuC0202m) {
        C0270k c0270k = (C0270k) this.f66b;
        if (menuC0202m == c0270k.f3391c) {
            return false;
        }
        ((SubMenuC0189E) menuC0202m).f2996A.getClass();
        c0270k.getClass();
        InterfaceC0213x interfaceC0213x = c0270k.f3393e;
        if (interfaceC0213x != null) {
            return interfaceC0213x.g(menuC0202m);
        }
        return false;
    }

    @Override // T.p
    public Object h() {
        return this;
    }

    @Override // K.InterfaceC0008e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f66b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0004c
    public C0010f j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f66b).build();
        return new C0010f(new d(build));
    }

    @Override // c0.d
    public void k(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
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
            case GameConfig.SCORE_PER_STICK /* 10 */:
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

    @Override // G.c
    public void l() {
        ((X) this.f66b).a();
    }

    @Override // K.InterfaceC0008e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f66b).getFlags();
        return flags;
    }

    @Override // l.InterfaceC0251a0
    public void n(int i, float f2) {
    }

    @Override // c0.d
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0200k
    public void p(MenuC0202m menuC0202m) {
        InterfaceC0200k interfaceC0200k = ((ActionMenuView) this.f66b).f1043v;
        if (interfaceC0200k != null) {
            interfaceC0200k.p(menuC0202m);
        }
    }

    @Override // T.p
    public boolean q(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f66b)) {
            return true;
        }
        yVar.f835c = (yVar.f835c & 3) | 4;
        return false;
    }

    @Override // k.InterfaceC0200k
    public boolean r(MenuC0202m menuC0202m, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC0276n interfaceC0276n = ((ActionMenuView) this.f66b).f1036A;
        if (interfaceC0276n == null) {
            return false;
        }
        Toolbar toolbar = ((W0) interfaceC0276n).f3316a;
        if (toolbar.f1067G.a()) {
            onMenuItemSelected = true;
        } else {
            a1 a1Var = toolbar.f1069I;
            onMenuItemSelected = a1Var != null ? ((C0148I) a1Var).f2500a.f2502b.f2600a.onMenuItemSelected(0, menuItem) : false;
        }
        return onMenuItemSelected;
    }

    @Override // K.InterfaceC0008e
    public ContentInfo s() {
        return (ContentInfo) this.f66b;
    }

    @Override // l.H0
    public void t(MenuC0202m menuC0202m, C0204o c0204o) {
        ((ViewOnKeyListenerC0196g) this.f66b).f3027f.removeCallbacksAndMessages(menuC0202m);
    }

    public String toString() {
        switch (this.f65a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f66b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // T.i
    public void u(final q1.l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0036a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                B0.d dVar = B0.d.this;
                q1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                dVar.getClass();
                try {
                    t q2 = q1.d.q((Context) dVar.f66b);
                    if (q2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) q2.f786b);
                    synchronized (sVar.f817d) {
                        sVar.f819f = threadPoolExecutor2;
                    }
                    ((i) q2.f786b).u(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.P(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // l.InterfaceC0251a0
    public void v(int i) {
    }

    @Override // K.InterfaceC0004c
    public void w(int i) {
        ((ContentInfo.Builder) this.f66b).setFlags(i);
    }

    public void x(String str, String str2) {
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f66b;
        arrayList.add(str);
        arrayList.add(e1.d.P0(str2).toString());
    }

    public i1.n y() {
        return new i1.n((String[]) ((ArrayList) this.f66b).toArray(new String[0]));
    }

    public L.j z(int i) {
        return null;
    }

    public d(View view) {
        this.f65a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f66b = new d(5, view);
            return;
        }
        B b2 = new B(5, view);
        b2.f394c = view;
        this.f66b = b2;
    }

    public d(U u2, S s2) {
        this.f65a = 18;
        X0.f.e(u2, "store");
        Z.a aVar = Z.a.f882b;
        X0.f.e(aVar, "defaultCreationExtras");
        this.f66b = new T.r(u2, s2, aVar);
    }

    public d(TextView textView) {
        this.f65a = 14;
        this.f66b = new V.g(textView);
    }

    public d(EditText editText) {
        this.f65a = 13;
        this.f66b = new B.j(editText);
    }

    public d(Context context) {
        this.f65a = 11;
        this.f66b = context.getApplicationContext();
    }

    public d(int i) {
        this.f65a = i;
        switch (i) {
            case 7:
                this.f66b = new L.k(this);
                break;
            case 23:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X0.f.e(timeUnit, "timeUnit");
                this.f66b = new m1.n(l1.e.h, timeUnit);
                break;
            case 24:
                this.f66b = new ArrayList(20);
                break;
        }
    }

    public d(ContentInfo contentInfo) {
        this.f65a = 4;
        contentInfo.getClass();
        this.f66b = E0.e.g(contentInfo);
    }

    public d(ClipData clipData, int i) {
        this.f65a = 3;
        this.f66b = E0.e.e(clipData, i);
    }
}
