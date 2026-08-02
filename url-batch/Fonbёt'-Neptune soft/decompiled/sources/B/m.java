package B;

import A.C0010k;
import B0.D;
import I.C0069d;
import I.C0079n;
import I.InterfaceC0074i;
import I.b0;
import I.d0;
import I.k0;
import I.l0;
import P.O;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import i.C0207e;
import i.InterfaceC0216n;
import i.MenuC0211i;
import i.MenuItemC0212j;
import i.SubMenuC0221s;
import i.ViewOnKeyListenerC0208f;
import j.C0233i;
import j.InterfaceC0236l;
import j.M;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class m implements b1.d, InterfaceC0074i, N.e, V.o, M, i0.c, InterfaceC0216n, InterfaceC0236l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f77e;

    /* renamed from: f, reason: collision with root package name */
    public Object f78f;

    public /* synthetic */ m(int i2, Object obj) {
        this.f77e = i2;
        this.f78f = obj;
    }

    public static int n(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public static boolean o(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    @Override // i.InterfaceC0216n
    public void a(MenuC0211i menuC0211i, boolean z2) {
        if (menuC0211i instanceof SubMenuC0221s) {
            ((SubMenuC0221s) menuC0211i).v.j().c(false);
        }
        InterfaceC0216n interfaceC0216n = ((C0233i) this.f78f).f2969i;
        if (interfaceC0216n != null) {
            interfaceC0216n.a(menuC0211i, z2);
        }
    }

    @Override // i.InterfaceC0216n
    public boolean b(SubMenuC0221s subMenuC0221s) {
        if (subMenuC0221s == null) {
            return false;
        }
        subMenuC0221s.f2486w.getClass();
        C0233i c0233i = (C0233i) this.f78f;
        c0233i.getClass();
        InterfaceC0216n interfaceC0216n = c0233i.f2969i;
        if (interfaceC0216n != null) {
            return interfaceC0216n.b(subMenuC0221s);
        }
        return false;
    }

    @Override // I.InterfaceC0074i
    public Object c(P0.p pVar, J0.g gVar) {
        return ((InterfaceC0074i) this.f78f).c(new L.c(pVar, null), gVar);
    }

    @Override // i0.c
    public void d(String str, HashMap hashMap) {
        ((v0.i) this.f78f).a("sqlite_error", str, hashMap);
    }

    @Override // j.M
    public void e(MenuC0211i menuC0211i, MenuItemC0212j menuItemC0212j) {
        ViewOnKeyListenerC0208f viewOnKeyListenerC0208f = (ViewOnKeyListenerC0208f) this.f78f;
        viewOnKeyListenerC0208f.f2385j.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0208f.f2387l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0211i == ((C0207e) arrayList.get(i2)).f2375b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0208f.f2385j.postAtTime(new h0.o(this, i3 < arrayList.size() ? (C0207e) arrayList.get(i3) : null, menuItemC0212j, menuC0211i, 1), menuC0211i, SystemClock.uptimeMillis() + 200);
    }

    @Override // N.e
    public void f(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
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
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f78f).setResultCode(i2);
    }

    @Override // j.M
    public void g(MenuC0211i menuC0211i, MenuItemC0212j menuItemC0212j) {
        ((ViewOnKeyListenerC0208f) this.f78f).f2385j.removeCallbacksAndMessages(menuC0211i);
    }

    @Override // I.InterfaceC0074i
    public b1.d getData() {
        return ((InterfaceC0074i) this.f78f).getData();
    }

    @Override // V.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) i1.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f78f).getStatics());
    }

    @Override // V.o
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) i1.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f78f).getWebkitToCompatConverter());
    }

    @Override // N.e
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // V.o
    public String[] i() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f78f).getSupportedFeatures();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v12, types: [J0.g, P0.p] */
    @Override // b1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(b1.e eVar, H0.d dVar) {
        b1.a aVar;
        int i2;
        Throwable th;
        c1.n nVar;
        switch (this.f77e) {
            case 1:
                Object k2 = ((b1.d) this.f78f).k(new D(eVar, 0), dVar);
                return k2 == I0.a.f733e ? k2 : F0.h.f469a;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                Object k3 = ((O) this.f78f).k(new D(eVar, 1), dVar);
                return k3 == I0.a.f733e ? k3 : F0.h.f469a;
            default:
                if (dVar instanceof b1.a) {
                    aVar = (b1.a) dVar;
                    int i3 = aVar.f1902k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f1902k = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f1900i;
                        I0.a aVar2 = I0.a.f733e;
                        i2 = aVar.f1902k;
                        F0.h hVar = F0.h.f469a;
                        if (i2 != 0) {
                            i1.a.G(obj);
                            H0.i iVar = aVar.f737f;
                            Q0.h.b(iVar);
                            c1.n nVar2 = new c1.n(eVar, iVar);
                            try {
                                aVar.f1899h = nVar2;
                                aVar.f1902k = 1;
                                Object h2 = ((J0.g) this.f78f).h(nVar2, aVar);
                                if (h2 != aVar2) {
                                    h2 = hVar;
                                }
                                if (h2 == aVar2) {
                                    return aVar2;
                                }
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.m();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f1899h;
                            try {
                                i1.a.G(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.m();
                                throw th;
                            }
                        }
                        nVar.m();
                        return hVar;
                    }
                }
                aVar = new b1.a(this, dVar);
                Object obj2 = aVar.f1900i;
                I0.a aVar22 = I0.a.f733e;
                i2 = aVar.f1902k;
                F0.h hVar2 = F0.h.f469a;
                if (i2 != 0) {
                }
                nVar.m();
                return hVar2;
        }
    }

    @Override // i0.c
    public void l(Serializable serializable) {
        ((v0.i) this.f78f).c(serializable);
    }

    public k0 m() {
        b1.p pVar = (b1.p) this.f78f;
        pVar.getClass();
        m mVar = c1.l.f2019a;
        Object obj = b1.p.f1957i.get(pVar);
        if (obj == mVar) {
            obj = null;
        }
        return (k0) obj;
    }

    public void p(int i2, v0.m mVar) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f78f;
        jVar.d();
        jVar.f2601f = mVar;
        jVar.f2600e = new C0010k(2, i2);
        jVar.f2603h.e(jVar);
        C0079n c0079n = mVar.f3537j;
        jVar.f2603h = new io.flutter.plugin.editing.e(c0079n != null ? (v0.o) c0079n.f691g : null, jVar.f2596a);
        jVar.e(mVar);
        jVar.f2604i = true;
        if (jVar.f2600e.f48b == 3) {
            jVar.f2610o = false;
        }
        jVar.f2607l = null;
        jVar.f2603h.a(jVar);
    }

    public void q(double d2, double d3, double[] dArr) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f78f;
        jVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        io.flutter.plugin.editing.i iVar = new io.flutter.plugin.editing.i(z2, dArr, dArr2);
        iVar.a(d2, 0.0d);
        iVar.a(d2, d3);
        iVar.a(0.0d, d3);
        double d8 = jVar.f2596a.getContext().getResources().getDisplayMetrics().density;
        jVar.f2607l = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void r(v0.o oVar) {
        v0.o oVar2;
        int i2;
        int i3;
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f78f;
        View view = jVar.f2596a;
        if (!jVar.f2604i && (oVar2 = jVar.f2609n) != null && (i2 = oVar2.f3546d) >= 0 && (i3 = oVar2.f3547e) > i2) {
            int i4 = i3 - i2;
            int i5 = oVar.f3547e;
            int i6 = oVar.f3546d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (oVar2.f3543a.charAt(i7 + i2) != oVar.f3543a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            jVar.f2604i = z2;
        }
        jVar.f2609n = oVar;
        jVar.f2603h.f(oVar);
        if (jVar.f2604i) {
            jVar.f2597b.restartInput(view);
            jVar.f2604i = false;
        }
    }

    public void s(boolean z2) {
        ((WebSettingsBoundaryInterface) this.f78f).setPaymentRequestEnabled(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f673a > r3.f673a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(k0 k0Var) {
        b1.p pVar;
        Object obj;
        Object obj2;
        Q0.h.e(k0Var, "newState");
        do {
            pVar = (b1.p) this.f78f;
            pVar.getClass();
            obj = c1.l.f2019a;
            Object obj3 = b1.p.f1957i.get(pVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            k0 k0Var2 = (k0) obj2;
            if (!(k0Var2 instanceof d0 ? true : Q0.h.a(k0Var2, l0.f678b))) {
                if (!(k0Var2 instanceof C0069d)) {
                    if (!(k0Var2 instanceof b0)) {
                        throw new F0.b();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (k0Var2 != null) {
                    obj = k0Var2;
                }
            }
            k0Var2 = k0Var;
            if (obj2 == null) {
            }
            if (k0Var2 != null) {
            }
        } while (!pVar.c(obj2, obj));
    }

    public String toString() {
        switch (this.f77e) {
            case 19:
                return "<" + ((String) this.f78f) + '>';
            default:
                return super.toString();
        }
    }

    public m(int i2) {
        this.f77e = i2;
        switch (i2) {
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f78f = new b1.p(l0.f678b);
                break;
            case 10:
                this.f78f = new SparseIntArray();
                break;
            case 12:
                break;
            default:
                this.f78f = new AtomicInteger(0);
                break;
        }
    }

    public m(boolean z2) {
        this.f77e = 7;
        this.f78f = new AtomicBoolean(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(P0.p pVar) {
        this.f77e = 17;
        this.f78f = (J0.g) pVar;
    }
}
