package A0;

import K.AbstractC0002c;
import K.C0006g;
import K.C0012m;
import K.InterfaceC0003d;
import K.InterfaceC0005f;
import L.k;
import L.l;
import T.ThreadFactoryC0029a;
import T.j;
import X.B;
import X.C0051u;
import X.U;
import a0.C0057a;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import d0.InterfaceC0091e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0160f;
import k.C0169o;
import k.InterfaceC0165k;
import k.InterfaceC0178x;
import k.MenuC0167m;
import k.RunnableC0159e;
import k.SubMenuC0154E;
import k.ViewOnKeyListenerC0161g;
import l.C0221k;
import l.F0;
import l.InterfaceC0227n;
import l.V0;
import l.Y;

/* loaded from: classes.dex */
public class h implements a, InterfaceC0003d, InterfaceC0005f, j, G.b, InterfaceC0091e, F0, InterfaceC0178x, InterfaceC0165k, Y {

    /* renamed from: c, reason: collision with root package name */
    public static h f28c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30b;

    public /* synthetic */ h(int i, Object obj) {
        this.f29a = i;
        this.f30b = obj;
    }

    @Override // K.InterfaceC0003d
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f30b).setExtras(bundle);
    }

    @Override // k.InterfaceC0178x
    public void b(MenuC0167m menuC0167m, boolean z2) {
        if (menuC0167m instanceof SubMenuC0154E) {
            ((SubMenuC0154E) menuC0167m).f2687z.k().c(false);
        }
        InterfaceC0178x interfaceC0178x = ((C0221k) this.f30b).f2990e;
        if (interfaceC0178x != null) {
            interfaceC0178x.b(menuC0167m, z2);
        }
    }

    @Override // l.Y
    public void c(int i) {
    }

    @Override // K.InterfaceC0003d
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f30b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0005f
    public int e() {
        int source;
        source = ((ContentInfo) this.f30b).getSource();
        return source;
    }

    @Override // l.F0
    public void f(MenuC0167m menuC0167m, C0169o c0169o) {
        ViewOnKeyListenerC0161g viewOnKeyListenerC0161g = (ViewOnKeyListenerC0161g) this.f30b;
        viewOnKeyListenerC0161g.f2714f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0161g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0167m == ((C0160f) arrayList.get(i)).f2709b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0161g.f2714f.postAtTime(new RunnableC0159e(this, i2 < arrayList.size() ? (C0160f) arrayList.get(i2) : null, c0169o, menuC0167m), menuC0167m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0178x
    public boolean g(MenuC0167m menuC0167m) {
        C0221k c0221k = (C0221k) this.f30b;
        if (menuC0167m == c0221k.f2989c) {
            return false;
        }
        ((SubMenuC0154E) menuC0167m).f2686A.getClass();
        c0221k.getClass();
        InterfaceC0178x interfaceC0178x = c0221k.f2990e;
        if (interfaceC0178x != null) {
            return interfaceC0178x.g(menuC0167m);
        }
        return false;
    }

    @Override // K.InterfaceC0005f
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f30b).getClip();
        return clip;
    }

    @Override // T.j
    public void i(final T.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0029a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.m
            @Override // java.lang.Runnable
            public final void run() {
                A0.h hVar = A0.h.this;
                d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                hVar.getClass();
                try {
                    u o2 = d.o((Context) hVar.f30b);
                    if (o2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    t tVar = (t) ((j) o2.f813b);
                    synchronized (tVar.d) {
                        tVar.f841f = threadPoolExecutor2;
                    }
                    ((j) o2.f813b).i(new n(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.B(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0003d
    public C0006g j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f30b).build();
        return new C0006g(new h(build));
    }

    @Override // d0.InterfaceC0091e
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
        ((ProfileInstallReceiver) this.f30b).setResultCode(i);
    }

    @Override // G.b
    public void l() {
        ((U) this.f30b).a();
    }

    @Override // K.InterfaceC0005f
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f30b).getFlags();
        return flags;
    }

    @Override // l.Y
    public void n(int i, float f2) {
    }

    @Override // d0.InterfaceC0091e
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0165k
    public void p(MenuC0167m menuC0167m) {
        V0 v02 = ((ActionMenuView) this.f30b).f1328u;
        if (v02 != null) {
            v02.p(menuC0167m);
        }
    }

    @Override // k.InterfaceC0165k
    public boolean q(MenuC0167m menuC0167m, MenuItem menuItem) {
        InterfaceC0227n interfaceC0227n = ((ActionMenuView) this.f30b).f1333z;
        if (interfaceC0227n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((V0) interfaceC0227n).f2921a.f1355G.f423c).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f928a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K.InterfaceC0005f
    public ContentInfo r() {
        return (ContentInfo) this.f30b;
    }

    @Override // l.F0
    public void s(MenuC0167m menuC0167m, C0169o c0169o) {
        ((ViewOnKeyListenerC0161g) this.f30b).f2714f.removeCallbacksAndMessages(menuC0167m);
    }

    @Override // l.Y
    public void t(int i) {
    }

    public String toString() {
        switch (this.f29a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f30b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0003d
    public void u(int i) {
        ((ContentInfo.Builder) this.f30b).setFlags(i);
    }

    public k v(int i) {
        return null;
    }

    public k w(int i) {
        return null;
    }

    public O x(Class cls) {
        String str;
        g1.c a2 = g1.j.a(cls);
        Class cls2 = a2.f2566a;
        g1.f.e(cls2, "jClass");
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = g1.c.f2565c;
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
            return ((C0012m) this.f30b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void y() {
        ((C0051u) this.f30b).d.K();
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public h(ConstraintLayout constraintLayout, AppCompatButton appCompatButton) {
        this.f29a = 29;
        this.f30b = appCompatButton;
    }

    public h(Q q2, P p2) {
        this.f29a = 18;
        g1.f.e(q2, "store");
        C0057a c0057a = C0057a.f1242b;
        g1.f.e(c0057a, "defaultCreationExtras");
        this.f30b = new C0012m(q2, p2, c0057a);
    }

    public h(TextView textView) {
        this.f29a = 13;
        this.f30b = new V.g(textView);
    }

    public h(EditText editText) {
        this.f29a = 12;
        this.f30b = new B.j(editText);
    }

    public h(Context context) {
        this.f29a = 11;
        this.f30b = context.getApplicationContext();
    }

    public h(ContentInfo contentInfo) {
        this.f29a = 4;
        contentInfo.getClass();
        this.f30b = AbstractC0002c.g(contentInfo);
    }

    public h(ClipData clipData, int i) {
        this.f29a = 3;
        this.f30b = AbstractC0002c.e(clipData, i);
    }

    public h(int i) {
        this.f29a = i;
        switch (i) {
            case 5:
                this.f30b = new l(this);
                break;
            case 10:
                this.f30b = new Object();
                new Handler(Looper.getMainLooper(), new Q0.e(this));
                break;
            case 19:
                this.f30b = new LinkedHashMap();
                break;
        }
    }
}
