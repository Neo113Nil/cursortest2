package D;

import A1.m;
import L.C0008f;
import L.C0014l;
import L.C0024w;
import L.InterfaceC0004c;
import L.InterfaceC0007e;
import V.p;
import V.w;
import Z.B;
import Z.C0053u;
import Z.U;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
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
import c0.C0090a;
import com.winfour.winrandom.MainActivity;
import com.winfour.winrandom.MainActivity2;
import h0.d0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l.C0162f;
import l.C0171o;
import l.InterfaceC0167k;
import l.InterfaceC0180x;
import l.MenuC0169m;
import l.RunnableC0161e;
import l.SubMenuC0156E;
import l.ViewOnKeyListenerC0163g;
import m.C0221k;
import m.InterfaceC0227n;
import m.K0;
import m.c1;
import o1.d;
import s1.l;
import s1.n;
import s1.r;
import s1.s;

/* loaded from: classes.dex */
public class g implements InterfaceC0004c, InterfaceC0007e, V.i, p, H.b, f0.e, K0, InterfaceC0180x, InterfaceC0167k {

    /* renamed from: c, reason: collision with root package name */
    public static g f120c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121a;

    /* renamed from: b, reason: collision with root package name */
    public Object f122b;

    public /* synthetic */ g(int i, Object obj) {
        this.f121a = i;
        this.f122b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(w1.j jVar, r rVar) {
        String str;
        n nVar;
        Charset charset;
        String str2;
        int i = MainActivity.f2098E;
        ((MainActivity) this.f122b).getClass();
        final String t2 = MainActivity.t(new byte[]{-75, -2, 72, 20, -89, -29, 73, 81, -90, -12, 76});
        final String t3 = MainActivity.t(new byte[]{-32, -30, 78, 30, -74, -28, 73, 93, -8, -77, 85, 20, -32});
        final String str3 = ((l) rVar.f3702a.f321c).f3655h;
        s sVar = rVar.f3707g;
        if (sVar != null) {
            F1.h h2 = sVar.h();
            try {
                switch (sVar.f3713a) {
                    case 0:
                        nVar = (n) sVar.f3715c;
                        break;
                    default:
                        String str4 = (String) sVar.f3715c;
                        if (str4 != null) {
                            Pattern pattern = n.f3656c;
                            try {
                                nVar = d0.j(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                }
                if (nVar != null) {
                    charset = o1.a.f3416a;
                    String[] strArr = nVar.f3658b;
                    int i2 = 0;
                    int J2 = A1.d.J(0, strArr.length - 1, 2);
                    if (J2 >= 0) {
                        while (!o1.l.u(strArr[i2], "charset")) {
                            if (i2 != J2) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = o1.a.f3416a;
                str = h2.f(t1.b.q(h2, charset));
                A1.d.p(h2, null);
            } finally {
            }
        } else {
            str = "";
        }
        final String str5 = str;
        final MainActivity mainActivity = (MainActivity) this.f122b;
        mainActivity.runOnUiThread(new Runnable() { // from class: Q0.c
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean A2 = d.A(str6, t2);
                MainActivity mainActivity2 = mainActivity;
                if (A2 || d.A(str5, t3)) {
                    int i3 = MainActivity.f2098E;
                    mainActivity2.getClass();
                    mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) MainActivity2.class));
                    return;
                }
                mainActivity2.f2102D = str6;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.f2101C.a();
                h1.d.d(sharedPreferences, "access$getPrefs(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(mainActivity2.f2100B, str6);
                edit.apply();
                mainActivity2.v(str6);
            }
        });
    }

    public boolean B(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // L.InterfaceC0004c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f122b).setExtras(bundle);
    }

    @Override // l.InterfaceC0180x
    public void b(MenuC0169m menuC0169m, boolean z2) {
        if (menuC0169m instanceof SubMenuC0156E) {
            ((SubMenuC0156E) menuC0169m).f2754z.k().c(false);
        }
        InterfaceC0180x interfaceC0180x = ((C0221k) this.f122b).f3126e;
        if (interfaceC0180x != null) {
            interfaceC0180x.b(menuC0169m, z2);
        }
    }

    @Override // L.InterfaceC0004c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f122b).setLinkUri(uri);
    }

    @Override // m.K0
    public void d(MenuC0169m menuC0169m, C0171o c0171o) {
        ((ViewOnKeyListenerC0163g) this.f122b).f2782f.removeCallbacksAndMessages(menuC0169m);
    }

    @Override // L.InterfaceC0007e
    public int e() {
        int source;
        source = ((ContentInfo) this.f122b).getSource();
        return source;
    }

    @Override // V.p
    public boolean f(CharSequence charSequence, int i, int i2, w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f122b)) {
            return true;
        }
        wVar.f932c = (wVar.f932c & 3) | 4;
        return false;
    }

    @Override // V.p
    public Object g() {
        return this;
    }

    @Override // m.K0
    public void h(MenuC0169m menuC0169m, C0171o c0171o) {
        ViewOnKeyListenerC0163g viewOnKeyListenerC0163g = (ViewOnKeyListenerC0163g) this.f122b;
        viewOnKeyListenerC0163g.f2782f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0163g.f2784h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0169m == ((C0162f) arrayList.get(i)).f2777b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0163g.f2782f.postAtTime(new RunnableC0161e(this, i2 < arrayList.size() ? (C0162f) arrayList.get(i2) : null, c0171o, menuC0169m), menuC0169m, SystemClock.uptimeMillis() + 200);
    }

    @Override // L.InterfaceC0007e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f122b).getClip();
        return clip;
    }

    @Override // l.InterfaceC0180x
    public boolean j(MenuC0169m menuC0169m) {
        C0221k c0221k = (C0221k) this.f122b;
        if (menuC0169m == c0221k.f3125c) {
            return false;
        }
        ((SubMenuC0156E) menuC0169m).f2753A.getClass();
        c0221k.getClass();
        InterfaceC0180x interfaceC0180x = c0221k.f3126e;
        if (interfaceC0180x != null) {
            return interfaceC0180x.j(menuC0169m);
        }
        return false;
    }

    @Override // L.InterfaceC0004c
    public C0008f k() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f122b).build();
        return new C0008f(new g(build));
    }

    @Override // f0.e
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
        ((ProfileInstallReceiver) this.f122b).setResultCode(i);
    }

    @Override // H.b
    public void m() {
        ((U) this.f122b).a();
    }

    @Override // L.InterfaceC0007e
    public int n() {
        int flags;
        flags = ((ContentInfo) this.f122b).getFlags();
        return flags;
    }

    @Override // l.InterfaceC0167k
    public boolean o(MenuC0169m menuC0169m, MenuItem menuItem) {
        InterfaceC0227n interfaceC0227n = ((ActionMenuView) this.f122b).f1398z;
        if (interfaceC0227n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((c1) interfaceC0227n).f3076a.G.f543b).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f992a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f0.e
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.InterfaceC0167k
    public void q(MenuC0169m menuC0169m) {
        c1 c1Var = ((ActionMenuView) this.f122b).f1393u;
        if (c1Var != null) {
            c1Var.q(menuC0169m);
        }
    }

    @Override // L.InterfaceC0007e
    public ContentInfo r() {
        return (ContentInfo) this.f122b;
    }

    @Override // V.i
    public void s(final m mVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new V.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: V.l
            @Override // java.lang.Runnable
            public final void run() {
                D.g gVar = D.g.this;
                A1.m mVar2 = mVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s v2 = A1.d.v((Context) gVar.f122b);
                    if (v2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) v2.f894b);
                    synchronized (rVar.d) {
                        rVar.f921f = threadPoolExecutor2;
                    }
                    ((i) v2.f894b).s(new m(mVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    mVar2.N(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // L.InterfaceC0004c
    public void t(int i) {
        ((ContentInfo.Builder) this.f122b).setFlags(i);
    }

    public String toString() {
        switch (this.f121a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f122b) + "}";
            default:
                return super.toString();
        }
    }

    public M.j u(int i) {
        return null;
    }

    public M.j v(int i) {
        return null;
    }

    public M w(Class cls) {
        String str;
        h1.b a2 = h1.h.a(cls);
        Class cls2 = a2.f2646a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = h1.b.f2645c;
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
            return ((C0014l) this.f122b).f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void x() {
        View view = (View) this.f122b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y() {
        ((C0053u) this.f122b).f1212h.K();
    }

    public void z(w1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f122b;
        mainActivity.runOnUiThread(new A.a(6, mainActivity));
    }

    public g(View view) {
        this.f121a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f122b = new g(5, view);
            return;
        }
        C0024w c0024w = new C0024w(5, view);
        c0024w.d = view;
        this.f122b = c0024w;
    }

    public g(int i) {
        this.f121a = i;
        switch (i) {
            case 7:
                this.f122b = new M.k(this);
                break;
            case 8:
                this.f122b = new Object();
                new Handler(Looper.getMainLooper(), new M0.e(this));
                break;
        }
    }

    public g(O o2, N n2) {
        this.f121a = 21;
        h1.d.e(o2, "store");
        C0090a c0090a = C0090a.f1733b;
        h1.d.e(c0090a, "defaultCreationExtras");
        this.f122b = new C0014l(o2, n2, c0090a);
    }

    public g(TextView textView) {
        this.f121a = 16;
        this.f122b = new X.g(textView);
    }

    public g(EditText editText) {
        this.f121a = 15;
        this.f122b = new C.j(editText);
    }

    public g(Context context) {
        this.f121a = 13;
        this.f122b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f121a = 4;
        contentInfo.getClass();
        this.f122b = H0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f121a = 3;
        this.f122b = H0.e.e(clipData, i);
    }
}
