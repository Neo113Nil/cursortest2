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
import androidx.fragment.app.X;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0193f;
import k.C0202o;
import k.InterfaceC0211x;
import k.MenuC0200m;
import k.RunnableC0192e;
import k.SubMenuC0187E;
import k.ViewOnKeyListenerC0194g;
import l.C0268k;
import l.I0;

/* loaded from: classes.dex */
public class d implements InterfaceC0004c, InterfaceC0008e, T.i, T.p, G.c, c0.d, I0, InterfaceC0211x {

    /* renamed from: c, reason: collision with root package name */
    public static d f65c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66a;

    /* renamed from: b, reason: collision with root package name */
    public Object f67b;

    public /* synthetic */ d(int i, Object obj) {
        this.f66a = i;
        this.f67b = obj;
    }

    @Override // K.InterfaceC0004c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f67b).setExtras(bundle);
    }

    @Override // k.InterfaceC0211x
    public void b(MenuC0200m menuC0200m, boolean z2) {
        if (menuC0200m instanceof SubMenuC0187E) {
            ((SubMenuC0187E) menuC0200m).f2993z.k().c(false);
        }
        InterfaceC0211x interfaceC0211x = ((C0268k) this.f67b).f3390e;
        if (interfaceC0211x != null) {
            interfaceC0211x.b(menuC0200m, z2);
        }
    }

    @Override // K.InterfaceC0004c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f67b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0008e
    public int d() {
        int source;
        source = ((ContentInfo) this.f67b).getSource();
        return source;
    }

    @Override // l.I0
    public void e(MenuC0200m menuC0200m, C0202o c0202o) {
        ViewOnKeyListenerC0194g viewOnKeyListenerC0194g = (ViewOnKeyListenerC0194g) this.f67b;
        viewOnKeyListenerC0194g.f3023f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0194g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0200m == ((C0193f) arrayList.get(i)).f3017b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0194g.f3023f.postAtTime(new RunnableC0192e(this, i2 < arrayList.size() ? (C0193f) arrayList.get(i2) : null, c0202o, menuC0200m), menuC0200m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0211x
    public boolean f(MenuC0200m menuC0200m) {
        C0268k c0268k = (C0268k) this.f67b;
        if (menuC0200m == c0268k.f3388c) {
            return false;
        }
        ((SubMenuC0187E) menuC0200m).f2992A.getClass();
        c0268k.getClass();
        InterfaceC0211x interfaceC0211x = c0268k.f3390e;
        if (interfaceC0211x != null) {
            return interfaceC0211x.f(menuC0200m);
        }
        return false;
    }

    @Override // T.p
    public Object g() {
        return this;
    }

    @Override // K.InterfaceC0008e
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f67b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0004c
    public C0010f i() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f67b).build();
        return new C0010f(new d(build));
    }

    @Override // c0.d
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
        ((ProfileInstallReceiver) this.f67b).setResultCode(i);
    }

    @Override // G.c
    public void k() {
        ((X) this.f67b).a();
    }

    @Override // K.InterfaceC0008e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f67b).getFlags();
        return flags;
    }

    @Override // c0.d
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.p
    public boolean n(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f67b)) {
            return true;
        }
        yVar.f834c = (yVar.f834c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0008e
    public ContentInfo o() {
        return (ContentInfo) this.f67b;
    }

    @Override // l.I0
    public void p(MenuC0200m menuC0200m, C0202o c0202o) {
        ((ViewOnKeyListenerC0194g) this.f67b).f3023f.removeCallbacksAndMessages(menuC0200m);
    }

    @Override // T.i
    public void q(final q1.l lVar) {
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
                    t q2 = q1.d.q((Context) dVar.f67b);
                    if (q2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) q2.f785b);
                    synchronized (sVar.f816d) {
                        sVar.f818f = threadPoolExecutor2;
                    }
                    ((i) q2.f785b).q(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.P(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0004c
    public void r(int i) {
        ((ContentInfo.Builder) this.f67b).setFlags(i);
    }

    public void s(String str, String str2) {
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f67b;
        arrayList.add(str);
        arrayList.add(e1.d.P0(str2).toString());
    }

    public i1.n t() {
        return new i1.n((String[]) ((ArrayList) this.f67b).toArray(new String[0]));
    }

    public String toString() {
        switch (this.f66a) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f67b) + "}";
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

    public P w(Class cls) {
        String str;
        X0.b a2 = X0.j.a(cls);
        Class cls2 = a2.f870a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = X0.b.f869c;
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
            return ((T.r) this.f67b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void x() {
        View view = (View) this.f67b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public boolean y(int i, int i2, Bundle bundle) {
        return false;
    }

    public void z(String str) {
        X0.f.e(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f67b;
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

    public d(View view) {
        this.f66a = 7;
        if (Build.VERSION.SDK_INT < 30) {
            this.f67b = new d(6, view);
            return;
        }
        B b2 = new B(6, view);
        b2.f393d = view;
        this.f67b = b2;
    }

    public d(U u2, S s2) {
        this.f66a = 19;
        X0.f.e(u2, "store");
        Z.a aVar = Z.a.f881b;
        X0.f.e(aVar, "defaultCreationExtras");
        this.f67b = new T.r(u2, s2, aVar);
    }

    public d(TextView textView) {
        this.f66a = 15;
        this.f67b = new V.g(textView);
    }

    public d(EditText editText) {
        this.f66a = 14;
        this.f67b = new B.j(editText);
    }

    public d(Context context) {
        this.f66a = 12;
        this.f67b = context.getApplicationContext();
    }

    public d(int i) {
        this.f66a = i;
        switch (i) {
            case 3:
                this.f67b = new Object();
                new Handler(Looper.getMainLooper(), new J0.e(this));
                break;
            case 8:
                this.f67b = new L.k(this);
                break;
            case 25:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X0.f.e(timeUnit, "timeUnit");
                this.f67b = new m1.n(l1.d.h, timeUnit);
                break;
            case 26:
                this.f67b = new ArrayList(20);
                break;
        }
    }

    public d(ContentInfo contentInfo) {
        this.f66a = 5;
        contentInfo.getClass();
        this.f67b = E0.e.g(contentInfo);
    }

    public d(ClipData clipData, int i) {
        this.f66a = 4;
        this.f67b = E0.e.e(clipData, i);
    }
}
