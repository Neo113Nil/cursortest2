package C;

import K.C0008f;
import K.C0014l;
import K.C0024w;
import K.InterfaceC0004c;
import K.InterfaceC0007e;
import U.ThreadFactoryC0034a;
import U.p;
import U.x;
import Y.B;
import Y.C0054u;
import Y.U;
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
import b0.C0079a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0159f;
import k.C0168o;
import k.InterfaceC0164k;
import k.InterfaceC0177x;
import k.MenuC0166m;
import k.RunnableC0158e;
import k.SubMenuC0153E;
import k.ViewOnKeyListenerC0160g;
import l.C0219k;
import l.G0;
import l.InterfaceC0225n;
import l.W0;
import l.Z;
import z1.l;

/* loaded from: classes.dex */
public class g implements InterfaceC0004c, InterfaceC0007e, U.i, p, G.b, e0.e, G0, InterfaceC0177x, InterfaceC0164k, Z {

    /* renamed from: c, reason: collision with root package name */
    public static g f78c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;

    /* renamed from: b, reason: collision with root package name */
    public Object f80b;

    public /* synthetic */ g(int i, Object obj) {
        this.f79a = i;
        this.f80b = obj;
    }

    public void A() {
        View view = (View) this.f80b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void B() {
        ((C0054u) this.f80b).d.K();
    }

    public boolean C(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f80b).setExtras(bundle);
    }

    @Override // k.InterfaceC0177x
    public void b(MenuC0166m menuC0166m, boolean z2) {
        if (menuC0166m instanceof SubMenuC0153E) {
            ((SubMenuC0153E) menuC0166m).f2654z.k().c(false);
        }
        InterfaceC0177x interfaceC0177x = ((C0219k) this.f80b).f2960e;
        if (interfaceC0177x != null) {
            interfaceC0177x.b(menuC0166m, z2);
        }
    }

    @Override // l.Z
    public void c(int i) {
    }

    @Override // K.InterfaceC0004c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f80b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0007e
    public int e() {
        int source;
        source = ((ContentInfo) this.f80b).getSource();
        return source;
    }

    @Override // l.G0
    public void f(MenuC0166m menuC0166m, C0168o c0168o) {
        ViewOnKeyListenerC0160g viewOnKeyListenerC0160g = (ViewOnKeyListenerC0160g) this.f80b;
        viewOnKeyListenerC0160g.f2681f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0160g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0166m == ((C0159f) arrayList.get(i)).f2676b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0160g.f2681f.postAtTime(new RunnableC0158e(this, i2 < arrayList.size() ? (C0159f) arrayList.get(i2) : null, c0168o, menuC0166m), menuC0166m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0177x
    public boolean g(MenuC0166m menuC0166m) {
        C0219k c0219k = (C0219k) this.f80b;
        if (menuC0166m == c0219k.f2959c) {
            return false;
        }
        ((SubMenuC0153E) menuC0166m).f2653A.getClass();
        c0219k.getClass();
        InterfaceC0177x interfaceC0177x = c0219k.f2960e;
        if (interfaceC0177x != null) {
            return interfaceC0177x.g(menuC0166m);
        }
        return false;
    }

    @Override // U.p
    public Object h() {
        return this;
    }

    @Override // K.InterfaceC0007e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f80b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0004c
    public C0008f j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f80b).build();
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
        ((ProfileInstallReceiver) this.f80b).setResultCode(i);
    }

    @Override // G.b
    public void l() {
        ((U) this.f80b).a();
    }

    @Override // K.InterfaceC0007e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f80b).getFlags();
        return flags;
    }

    @Override // l.Z
    public void n(int i, float f2) {
    }

    @Override // e0.e
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0164k
    public void p(MenuC0166m menuC0166m) {
        W0 w02 = ((ActionMenuView) this.f80b).f1339u;
        if (w02 != null) {
            w02.p(menuC0166m);
        }
    }

    @Override // U.i
    public void q(final l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0034a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                z1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s w2 = z1.d.w((Context) gVar.f80b);
                    if (w2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) w2.f853b);
                    synchronized (rVar.d) {
                        rVar.f879f = threadPoolExecutor2;
                    }
                    ((i) w2.f853b).q(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.I(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // k.InterfaceC0164k
    public boolean r(MenuC0166m menuC0166m, MenuItem menuItem) {
        InterfaceC0225n interfaceC0225n = ((ActionMenuView) this.f80b).f1344z;
        if (interfaceC0225n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0225n).f2891a.f1363G.f492b).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f949a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U.p
    public boolean s(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f80b)) {
            return true;
        }
        xVar.f892c = (xVar.f892c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0007e
    public ContentInfo t() {
        return (ContentInfo) this.f80b;
    }

    public String toString() {
        switch (this.f79a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f80b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // l.G0
    public void u(MenuC0166m menuC0166m, C0168o c0168o) {
        ((ViewOnKeyListenerC0160g) this.f80b).f2681f.removeCallbacksAndMessages(menuC0166m);
    }

    @Override // l.Z
    public void v(int i) {
    }

    @Override // K.InterfaceC0004c
    public void w(int i) {
        ((ContentInfo.Builder) this.f80b).setFlags(i);
    }

    public L.j x(int i) {
        return null;
    }

    public L.j y(int i) {
        return null;
    }

    public M z(Class cls) {
        String str;
        g1.b a2 = g1.h.a(cls);
        Class cls2 = a2.f2547a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = g1.b.f2546c;
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
            return ((C0014l) this.f80b).f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public g(View view) {
        this.f79a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f80b = new g(5, view);
            return;
        }
        C0024w c0024w = new C0024w(5, view);
        c0024w.d = view;
        this.f80b = c0024w;
    }

    public g(int i) {
        this.f79a = i;
        switch (i) {
            case 7:
                this.f80b = new L.k(this);
                break;
            case 8:
                this.f80b = new Object();
                new Handler(Looper.getMainLooper(), new L0.e(this));
                break;
        }
    }

    public g(O o2, N n2) {
        this.f79a = 20;
        g1.d.e(o2, "store");
        C0079a c0079a = C0079a.f1660b;
        g1.d.e(c0079a, "defaultCreationExtras");
        this.f80b = new C0014l(o2, n2, c0079a);
    }

    public g(TextView textView) {
        this.f79a = 15;
        this.f80b = new W.g(textView);
    }

    public g(EditText editText) {
        this.f79a = 14;
        this.f80b = new B.j(editText);
    }

    public g(Context context) {
        this.f79a = 12;
        this.f80b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f79a = 4;
        contentInfo.getClass();
        this.f80b = G0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f79a = 3;
        this.f80b = G0.e.e(clipData, i);
    }
}
