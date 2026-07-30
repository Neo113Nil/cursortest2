package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(oo0 oo0Var, no0 no0Var) {
        this.d = 13;
        this.e = oo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x044b, code lost:
    
        if (((defpackage.k71) r1).s != false) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0354  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        rf0 rf0Var;
        long j;
        List list;
        int i = 4;
        rf0 rf0Var2 = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return obj == ((m) this.e) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                b0 b0Var = (b0) this.e;
                Map.Entry entry = (Map.Entry) obj;
                y yVar = b0.g;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == b0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != b0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                v11 v11Var = (v11) this.e;
                kj1 kj1Var = (kj1) obj;
                if (!v11Var.d) {
                    kj1Var.getClass();
                    break;
                }
                r6 = true;
                v11Var.d = r6;
                return Boolean.valueOf(!r6);
            case 3:
                ak1 ak1Var = (ak1) obj;
                return ((x10) this.e).a(new ak1(null, ak1Var.b, ak1Var.c, ak1Var.d, ak1Var.e)).getValue();
            case 4:
                d60 d60Var = (d60) this.e;
                qn0 qn0Var = (qn0) obj;
                hy0 hy0Var = d60.c;
                Map a = qn0Var.a();
                LinkedHashMap linkedHashMap = qn0Var.a;
                long j2 = 0;
                for (Map.Entry entry2 : a.entrySet()) {
                    if (entry2.getValue() instanceof Set) {
                        hy0 hy0Var2 = (hy0) entry2.getKey();
                        Set set = (Set) entry2.getValue();
                        String b = d60Var.b(System.currentTimeMillis());
                        if (set.contains(b)) {
                            qn0Var.d(hy0Var2, Set.of(b));
                            j2++;
                        } else {
                            hy0Var2.getClass();
                            qn0Var.b();
                            linkedHashMap.remove(hy0Var2);
                        }
                    }
                }
                if (j2 == 0) {
                    hy0Var.getClass();
                    qn0Var.b();
                    linkedHashMap.remove(hy0Var);
                } else {
                    qn0Var.d(hy0Var, Long.valueOf(j2));
                }
                return null;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                String str = (String) this.e;
                u81 u81Var = (u81) obj;
                dc0[] dc0VarArr = s81.a;
                u81Var.a(p81.a, yh.b(str));
                s81.a(u81Var);
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new n2(i, (oe0) this.e);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new n2(6, (we0) this.e);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                wf0 wf0Var = (wf0) this.e;
                float f = -((Float) obj).floatValue();
                if ((f >= 0.0f || wf0Var.d()) && (f <= 0.0f || wf0Var.a())) {
                    if (Math.abs(wf0Var.h) > 0.5f) {
                        r80.c("entered drag with non-zero pending scroll");
                    }
                    wf0Var.d = true;
                    float f2 = wf0Var.h + f;
                    wf0Var.h = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = wf0Var.h;
                        int round = Math.round(f3);
                        rf0 f4 = ((rf0) wf0Var.f.getValue()).f(round, !wf0Var.b);
                        if (f4 != null && (rf0Var = wf0Var.c) != null) {
                            rf0 f5 = rf0Var.f(round, true);
                            if (f5 != null) {
                                wf0Var.c = f5;
                            }
                            if (rf0Var2 == null) {
                                wf0Var.f(rf0Var2, wf0Var.b, true);
                                wf0Var.v.setValue(Unit.a);
                                wf0Var.h(f3 - wf0Var.h, rf0Var2);
                            } else {
                                jd0 jd0Var = wf0Var.k;
                                if (jd0Var != null) {
                                    jd0Var.k();
                                }
                                wf0Var.h(f3 - wf0Var.h, wf0Var.g());
                            }
                        }
                        rf0Var2 = f4;
                        if (rf0Var2 == null) {
                        }
                    }
                    if (Math.abs(wf0Var.h) > 0.5f) {
                        f -= wf0Var.h;
                        wf0Var.h = 0.0f;
                    }
                    r8 = f;
                }
                return Float.valueOf(-r8);
            case 9:
                t51 t51Var = (t51) this.e;
                return Boolean.valueOf(t51Var != null ? t51Var.b(obj) : true);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                yd1 yd1Var = (yd1) this.e;
                hu huVar = (hu) obj;
                huVar.getClass();
                ze1 ze1Var = new ze1(va1.b(huVar.x()) * 0.085f, 0.0f, 0, 0, 26);
                ze1 ze1Var2 = new ze1(va1.b(huVar.x()) * 0.055f, 0.0f, 1, 0, 26);
                float floatValue = ((Number) yd1Var.getValue()).floatValue();
                long N = huVar.N();
                i8 v = huVar.v();
                long i2 = v.i();
                v.g().k();
                try {
                    ((s40) v.e).w(floatValue, N);
                    j = i2;
                    try {
                        hu.g0(huVar, la0.d(4279568138L), 0.0f, 284.0f, 0L, 0L, ze1Var, 880);
                        huVar.u(j50.s(new Pair[]{new Pair(Float.valueOf(0.0f), new hi(la0.d(4294956032L))), new Pair(Float.valueOf(0.34f), new hi(la0.d(4294932992L))), new Pair(Float.valueOf(0.68f), new hi(la0.d(4294963574L))), new Pair(Float.valueOf(1.0f), new hi(la0.d(4294956032L)))}), hu.l0(huVar.x(), 0L), ze1Var2);
                        qy0.s(v, j);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        qy0.s(v, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = i2;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                return ((a0) this.e).b(((Integer) obj).intValue());
            case 12:
                List list2 = (List) this.e;
                kf0 kf0Var = (kf0) obj;
                kf0Var.getClass();
                kf0Var.a(list2.size(), new cl0(1, list2), new hk(802480018, true, new el0(list2)));
                return Unit.a;
            case 13:
                ((oo0) this.e).h(null);
                return Unit.a;
            case 14:
                z11 z11Var = (z11) this.e;
                kj1 kj1Var2 = (kj1) obj;
                kj1Var2.getClass();
                bf0 bf0Var = ((mj1) kj1Var2).s;
                List list3 = (List) z11Var.d;
                if (list3 != null) {
                    list3.add(bf0Var);
                    list = list3;
                } else {
                    list = zh.f(bf0Var);
                }
                z11Var.d = list;
                return jj1.e;
            case 15:
                u81 u81Var2 = (u81) obj;
                Object invoke = ((Function0) this.e).invoke();
                Float f6 = (Float) (Float.isNaN(((Number) invoke).floatValue()) ? null : invoke);
                qz0 qz0Var = new qz0(f6 != null ? f6.floatValue() : 0.0f, new nh(1.0f));
                dc0[] dc0VarArr2 = s81.a;
                t81 t81Var = p81.c;
                dc0 dc0Var = s81.a[1];
                u81Var2.a(t81Var, qz0Var);
                return Unit.a;
            case 16:
                ((tl) this.e).z(obj);
                return Unit.a;
            case 17:
                o11 o11Var = (o11) this.e;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                synchronized (o11Var.c) {
                    try {
                        jb0 jb0Var = o11Var.d;
                        if (jb0Var != null) {
                            be1 be1Var = o11Var.u;
                            k11 k11Var = k11.e;
                            be1Var.getClass();
                            be1Var.j(null, k11Var);
                            jb0Var.a(cancellationException);
                            o11Var.r = null;
                            jb0Var.h(new c(o11Var, 16, th3));
                        } else {
                            o11Var.e = cancellationException;
                            be1 be1Var2 = o11Var.u;
                            k11 k11Var2 = k11.d;
                            be1Var2.getClass();
                            be1Var2.j(null, k11Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return Unit.a;
            case 18:
                t51 t51Var2 = ((r51) this.e).g;
                return Boolean.valueOf(t51Var2 != null ? t51Var2.b(obj) : true);
            case 19:
                h71 h71Var = (h71) this.e;
                float floatValue2 = ((Float) obj).floatValue();
                xu0 xu0Var = h71Var.a;
                float h = xu0Var.h() + floatValue2 + h71Var.f;
                float b2 = b11.b(h, 0.0f, h71Var.e.h());
                r6 = h == b2;
                float h2 = b2 - xu0Var.h();
                int round2 = Math.round(h2);
                xu0Var.i(xu0Var.h() + round2);
                h71Var.f = h2 - round2;
                if (!r6) {
                    floatValue2 = h2;
                }
                return Float.valueOf(floatValue2);
            case 20:
                d81 d81Var = (d81) this.e;
                return new wq0(d81Var.c(d81Var.k, ((wq0) obj).a, d81Var.j));
            case 21:
                wn0 wn0Var = (wn0) this.e;
                if (obj instanceof he1) {
                    ((he1) obj).g(4);
                }
                wn0Var.a(obj);
                return Unit.a;
            case 22:
                cc1 cc1Var = (cc1) this.e;
                synchronized (cc1Var.g) {
                    bc1 bc1Var = cc1Var.i;
                    bc1Var.getClass();
                    Object obj2 = bc1Var.b;
                    obj2.getClass();
                    int i3 = bc1Var.d;
                    ln0 ln0Var = bc1Var.c;
                    if (ln0Var == null) {
                        ln0Var = new ln0();
                        bc1Var.c = ln0Var;
                        bc1Var.f.m(obj2, ln0Var);
                    }
                    bc1Var.b(obj, i3, obj2, ln0Var);
                }
                return Unit.a;
            case 23:
                o7 o7Var = (o7) obj;
                ((h40) this.e).b(o7Var.e.getValue(), ((Function1) p4.o.g).invoke(o7Var.f));
                return Unit.a;
            default:
                ao0 ao0Var = (ao0) this.e;
                ((ps) obj).getClass();
                return new n2(7, ao0Var);
        }
    }

    public /* synthetic */ l(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
