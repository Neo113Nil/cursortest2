package a2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.appsflyer.attribution.RequestError;
import d2.p1;
import d2.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f53e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u1 u1Var, d2.b0 b0Var) {
        super(0);
        this.f52d = 4;
        this.f53e = u1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        n0.q qVar;
        switch (this.f52d) {
            case 0:
                t tVar = (t) this.f53e;
                if (!((Boolean) tVar.f155f.getValue()).booleanValue() && (qVar = tVar.f152c) != null) {
                    qVar.k();
                }
                return Unit.f5554a;
            case 1:
                c0 a9 = ((z0) this.f53e).a();
                c2.g0 g0Var = a9.f61d;
                if (a9.A != ((o0.b) g0Var.m()).f7311d.f7319i) {
                    s.h0 h0Var = a9.f65s;
                    Object[] objArr = h0Var.f8314c;
                    long[] jArr = h0Var.f8312a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j) < 128) {
                                        ((t) objArr[(i3 << 3) + i11]).f153d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (g0Var.f1556v != null) {
                        if (!g0Var.T.f1597e) {
                            c2.g0.P(g0Var, false, 7);
                        }
                    } else if (!g0Var.p()) {
                        c2.g0.R(g0Var, false, 7);
                    }
                }
                return Unit.f5554a;
            case 2:
                return (j1.c) this.f53e;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                c2.k0 k0Var = ((c2.g0) this.f53e).T;
                k0Var.f1606p.M = true;
                c2.s0 s0Var = k0Var.f1607q;
                if (s0Var != null) {
                    s0Var.G = true;
                }
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((u1) this.f53e).getClass();
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                d2.c1 c1Var = (d2.c1) this.f53e;
                boolean a10 = x2.k.a(0L, 0L);
                View view = c1Var.f3353a;
                if (!a10) {
                    return new d2.e1(0L, i7.a.d(view.getContext()).m(z4.m.b(0L)));
                }
                Context context = view.getContext();
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    if (!(context2 instanceof Activity) && !(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() == null) {
                            context2 = null;
                        } else {
                            context2 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context2 != null) {
                        Configuration configuration = context.getResources().getConfiguration();
                        x2.e d10 = i7.a.d(context);
                        long c10 = a.a.c(configuration.screenWidthDp, configuration.screenHeightDp);
                        long H = d10.H(c10);
                        return new d2.e1((((int) Float.intBitsToFloat((int) (H & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (H >> 32))) << 32), c10);
                    }
                    r5.c.f8179a.getClass();
                    r5.d dVar = r5.b.f8178b;
                    dVar.getClass();
                    ContextWrapper contextWrapper2 = (ContextWrapper) context2;
                    int i12 = Build.VERSION.SDK_INT;
                    r5.a c11 = (i12 >= 34 ? s5.f.f8457c : i12 >= 30 ? s5.d.f8455c : s5.c.g).c(contextWrapper2, dVar.f8180b);
                    long height = (4294967295L & c11.a().height()) | (c11.a().width() << 32);
                    return new d2.e1(height, i7.a.d(context2).m(z4.m.b(height)));
                }
                context2 = null;
                if (context2 != null) {
                }
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                y0.c cVar = (y0.c) ((p1) this.f53e).f3503a.f3701e;
                if (!cVar.f10572e) {
                    if (cVar.f10573i) {
                        z0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.f10573i = true;
                }
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((i1.t) this.f53e).K();
                return Unit.f5554a;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                k2.b bVar = (k2.b) this.f53e;
                bVar.f5367h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    Trace.endSection();
                    return Unit.f5554a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 9:
                q1.i0 i0Var = (q1.i0) this.f53e;
                Unit unit = Unit.f5554a;
                i0Var.f7896h.setValue(unit);
                return unit;
            case 10:
                Object systemService = ((View) ((c6.s) this.f53e).f1868d).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case RequestError.STOP_TRACKING /* 11 */:
                return new BaseInputConnection(((q2.e) this.f53e).f7966a, false);
            case 12:
                v.z0 z0Var = (v.z0) this.f53e;
                Object l10 = z0Var.f9917a.l();
                u.w wVar = u.w.f9557i;
                return Boolean.valueOf(l10 == wVar && z0Var.f9920d.getValue() == wVar);
            case 13:
                return ((w1.c) this.f53e).f10012d;
            default:
                return ((w1.h) this.f53e).I();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i3, Object obj) {
        super(0);
        this.f52d = i3;
        this.f53e = obj;
    }
}
