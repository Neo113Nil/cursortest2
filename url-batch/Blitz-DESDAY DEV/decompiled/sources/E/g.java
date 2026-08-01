package E;

import M.C0005f;
import M.C0020v;
import M.InterfaceC0002c;
import M.InterfaceC0004e;
import V.o;
import V.v;
import Z.B;
import Z.C0050u;
import Z.U;
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
import c0.C0079a;
import com.winfour.neondrop.MainActivity;
import f0.InterfaceC0089e;
import h0.a0;
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
import k.C0168f;
import k.RunnableC0167e;
import k.SubMenuC0162E;
import k.ViewOnKeyListenerC0169g;
import k.m;
import k.x;
import l.C0195k;
import l.H0;
import l.InterfaceC0201n;
import l.X0;
import r1.l;
import r1.n;
import r1.r;
import r1.s;

/* loaded from: classes.dex */
public class g implements InterfaceC0002c, InterfaceC0004e, V.i, o, I.b, InterfaceC0089e, H0, x, k.k {

    /* renamed from: c, reason: collision with root package name */
    public static g f168c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* renamed from: b, reason: collision with root package name */
    public Object f170b;

    public /* synthetic */ g(int i, Object obj) {
        this.f169a = i;
        this.f170b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(v1.j jVar, r rVar) {
        String str;
        n nVar;
        Charset charset;
        String str2;
        String str3 = ((l) rVar.f3545a.f359c).h;
        s sVar = rVar.f3550g;
        if (sVar != null) {
            E1.h h = sVar.h();
            try {
                switch (sVar.f3555a) {
                    case 0:
                        nVar = (n) sVar.f3557c;
                        break;
                    default:
                        String str4 = (String) sVar.f3557c;
                        if (str4 != null) {
                            Pattern pattern = n.f3502c;
                            try {
                                nVar = a0.k(str4);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        nVar = null;
                        break;
                }
                if (nVar != null) {
                    charset = n1.a.f3290a;
                    String[] strArr = nVar.f3504b;
                    int i = 0;
                    int O2 = z1.l.O(0, strArr.length - 1, 2);
                    if (O2 >= 0) {
                        while (!n1.l.x(strArr[i], "charset")) {
                            if (i != O2) {
                                i += 2;
                            }
                        }
                        str2 = strArr[i + 1];
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
                charset = n1.a.f3290a;
                str = h.e(s1.b.q(h, charset));
                z1.l.u(h, null);
            } finally {
            }
        } else {
            str = "";
        }
        MainActivity mainActivity = (MainActivity) this.f170b;
        mainActivity.runOnUiThread(new R0.c(str3, mainActivity, str));
    }

    public boolean B(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // M.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f170b).setExtras(bundle);
    }

    @Override // k.x
    public void b(m mVar, boolean z2) {
        if (mVar instanceof SubMenuC0162E) {
            ((SubMenuC0162E) mVar).f2706z.k().c(false);
        }
        x xVar = ((C0195k) this.f170b).f3016e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // M.InterfaceC0002c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f170b).setLinkUri(uri);
    }

    @Override // M.InterfaceC0004e
    public int d() {
        int source;
        source = ((ContentInfo) this.f170b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(m mVar, k.o oVar) {
        ViewOnKeyListenerC0169g viewOnKeyListenerC0169g = (ViewOnKeyListenerC0169g) this.f170b;
        viewOnKeyListenerC0169g.f2733f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0169g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C0168f) arrayList.get(i)).f2728b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0169g.f2733f.postAtTime(new RunnableC0167e(this, i2 < arrayList.size() ? (C0168f) arrayList.get(i2) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.x
    public boolean f(m mVar) {
        C0195k c0195k = (C0195k) this.f170b;
        if (mVar == c0195k.f3015c) {
            return false;
        }
        ((SubMenuC0162E) mVar).f2705A.getClass();
        c0195k.getClass();
        x xVar = c0195k.f3016e;
        if (xVar != null) {
            return xVar.f(mVar);
        }
        return false;
    }

    @Override // V.o
    public boolean g(CharSequence charSequence, int i, int i2, v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f170b)) {
            return true;
        }
        vVar.f917c = (vVar.f917c & 3) | 4;
        return false;
    }

    @Override // V.o
    public Object h() {
        return this;
    }

    @Override // M.InterfaceC0004e
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f170b).getClip();
        return clip;
    }

    @Override // M.InterfaceC0002c
    public C0005f j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f170b).build();
        return new C0005f(new g(build));
    }

    @Override // f0.InterfaceC0089e
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
        ((ProfileInstallReceiver) this.f170b).setResultCode(i);
    }

    @Override // I.b
    public void l() {
        ((U) this.f170b).a();
    }

    @Override // M.InterfaceC0004e
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f170b).getFlags();
        return flags;
    }

    @Override // f0.InterfaceC0089e
    public void n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.k
    public void o(m mVar) {
        X0 x02 = ((ActionMenuView) this.f170b).f1396u;
        if (x02 != null) {
            x02.o(mVar);
        }
    }

    @Override // V.i
    public void p(z1.d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new V.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new R0.c(this, dVar, threadPoolExecutor));
    }

    @Override // k.k
    public boolean q(m mVar, MenuItem menuItem) {
        InterfaceC0201n interfaceC0201n = ((ActionMenuView) this.f170b).f1401z;
        if (interfaceC0201n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((X0) interfaceC0201n).f2945a.f1421G.f81c).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f1011a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // M.InterfaceC0004e
    public ContentInfo r() {
        return (ContentInfo) this.f170b;
    }

    @Override // l.H0
    public void s(m mVar, k.o oVar) {
        ((ViewOnKeyListenerC0169g) this.f170b).f2733f.removeCallbacksAndMessages(mVar);
    }

    @Override // M.InterfaceC0002c
    public void t(int i) {
        ((ContentInfo.Builder) this.f170b).setFlags(i);
    }

    public String toString() {
        switch (this.f169a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f170b) + "}";
            default:
                return super.toString();
        }
    }

    public N.j u(int i) {
        return null;
    }

    public N.j v(int i) {
        return null;
    }

    public M w(Class cls) {
        String str;
        g1.b a2 = g1.h.a(cls);
        Class cls2 = a2.f2361a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = g1.b.f2360c;
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
            return ((A1.j) this.f170b).p(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void x() {
        View view = (View) this.f170b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y() {
        ((C0050u) this.f170b).d.K();
    }

    public void z(v1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f170b;
        mainActivity.runOnUiThread(new B.a(6, mainActivity));
    }

    public g(View view) {
        this.f169a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f170b = new g(5, view);
            return;
        }
        C0020v c0020v = new C0020v(5, view);
        c0020v.d = view;
        this.f170b = c0020v;
    }

    public g(int i) {
        this.f169a = i;
        switch (i) {
            case 7:
                this.f170b = new N.k(this);
                break;
            case 8:
                this.f170b = new Object();
                new Handler(Looper.getMainLooper(), new N0.e(this));
                break;
        }
    }

    public g(O o2, N n2) {
        this.f169a = 21;
        g1.d.e(o2, "store");
        C0079a c0079a = C0079a.f1718b;
        g1.d.e(c0079a, "defaultCreationExtras");
        this.f170b = new A1.j(o2, n2, c0079a);
    }

    public g(TextView textView) {
        this.f169a = 16;
        this.f170b = new X.g(textView);
    }

    public g(EditText editText) {
        this.f169a = 15;
        this.f170b = new D.j(editText);
    }

    public g(Context context) {
        this.f169a = 13;
        this.f170b = context.getApplicationContext();
    }

    public g(ContentInfo contentInfo) {
        this.f169a = 4;
        contentInfo.getClass();
        this.f170b = I0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f169a = 3;
        this.f170b = I0.e.e(clipData, i);
    }
}
