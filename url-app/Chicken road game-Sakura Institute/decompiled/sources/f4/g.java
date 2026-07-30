package f4;

import android.app.Application;
import androidx.lifecycle.i0;
import c7.g0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlateReply;
import com.chicken.road.whale.plate.PlateVault;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {
    private static final d Companion = new d();

    /* renamed from: a, reason: collision with root package name */
    public final b1.b f3326a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f3327b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.c f3328c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f3329d;

    public g(Application application) {
        this.f3326a = new b1.b(application);
        this.f3327b = new e0(application);
        this.f3328c = new b6.c(13, application);
        this.f3329d = new c0(application);
    }

    public static Object c(g gVar, long j8, f fVar) {
        Object e9;
        gVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j8;
        return (currentTimeMillis >= 1200 || (e9 = c7.a0.e(1200 - currentTimeMillis, fVar)) != i6.a.f4956f) ? d6.z.f2639a : e9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(4:21|22|23|(1:25))|11|12|(2:14|15)(1:17)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        r5 = d6.a.b(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j6.c cVar) {
        e eVar;
        int i7;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i8 = eVar.f3315h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f3315h = i8 - Integer.MIN_VALUE;
                Object obj = eVar.f3313f;
                i7 = eVar.f3315h;
                if (i7 != 0) {
                    d6.a.e(obj);
                    eVar.f3315h = 1;
                    obj = b(eVar);
                    Object obj2 = i6.a.f4956f;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                Object b9 = (w) obj;
                return !(b9 instanceof d6.l) ? t.f3349a : b9;
            }
        }
        eVar = new e(this, cVar);
        Object obj3 = eVar.f3313f;
        i7 = eVar.f3315h;
        if (i7 != 0) {
        }
        Object b92 = (w) obj3;
        if (!(b92 instanceof d6.l)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (r1 == r14) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        if (r1 == r14) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j6.c cVar) {
        f fVar;
        int i7;
        long currentTimeMillis;
        g gVar;
        Object j8;
        a aVar;
        g gVar2;
        g gVar3;
        f0 f0Var;
        a aVar2;
        g gVar4;
        String str;
        g gVar5;
        String str2;
        String url;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i8 = fVar.f3323l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f3323l = i8 - Integer.MIN_VALUE;
                Object obj = fVar.f3321j;
                i7 = fVar.f3323l;
                int i9 = 1;
                int i10 = 2;
                t tVar = t.f3349a;
                h6.d dVar = null;
                i6.a aVar3 = i6.a.f4956f;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        d6.a.e(obj);
                        currentTimeMillis = System.currentTimeMillis();
                        fVar.f3317f = this;
                        fVar.f3320i = currentTimeMillis;
                        fVar.f3323l = 1;
                        obj = c7.a0.y(8000L, new c(i10, dVar), fVar);
                        if (obj != aVar3) {
                            gVar = this;
                            a aVar4 = (a) obj;
                            a0 a0Var = gVar.f3329d.f3310f;
                            fVar.f3317f = gVar;
                            fVar.f3318g = aVar4;
                            fVar.f3320i = currentTimeMillis;
                            fVar.f3323l = 2;
                            j8 = f7.f0.j(a0Var, fVar);
                            if (j8 != aVar3) {
                                g gVar6 = gVar;
                                aVar = aVar4;
                                obj = j8;
                                gVar2 = gVar6;
                                if (((Boolean) obj).booleanValue()) {
                                    a0 a0Var2 = gVar2.f3329d.f3309e;
                                    fVar.f3317f = gVar2;
                                    fVar.f3318g = aVar;
                                    fVar.f3320i = currentTimeMillis;
                                    fVar.f3323l = 4;
                                    obj = f7.f0.j(a0Var2, fVar);
                                    break;
                                } else {
                                    fVar.f3317f = null;
                                    fVar.f3318g = null;
                                    fVar.f3323l = 3;
                                    if (c(gVar2, currentTimeMillis, fVar) != aVar3) {
                                        return tVar;
                                    }
                                }
                            }
                        }
                        return aVar3;
                    case 1:
                        currentTimeMillis = fVar.f3320i;
                        gVar = fVar.f3317f;
                        d6.a.e(obj);
                        a aVar42 = (a) obj;
                        a0 a0Var3 = gVar.f3329d.f3310f;
                        fVar.f3317f = gVar;
                        fVar.f3318g = aVar42;
                        fVar.f3320i = currentTimeMillis;
                        fVar.f3323l = 2;
                        j8 = f7.f0.j(a0Var3, fVar);
                        if (j8 != aVar3) {
                        }
                        return aVar3;
                    case 2:
                        currentTimeMillis = fVar.f3320i;
                        aVar = (a) fVar.f3318g;
                        gVar2 = fVar.f3317f;
                        d6.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return aVar3;
                    case 3:
                        d6.a.e(obj);
                        return tVar;
                    case 4:
                        currentTimeMillis = fVar.f3320i;
                        aVar = (a) fVar.f3318g;
                        gVar2 = fVar.f3317f;
                        d6.a.e(obj);
                        String str3 = (String) obj;
                        if (aVar != null && aVar.getEnabled() && !z6.h.G(aVar.getGateUrl())) {
                            e0 e0Var = gVar2.f3327b;
                            fVar.f3317f = gVar2;
                            fVar.f3318g = aVar;
                            fVar.f3320i = currentTimeMillis;
                            fVar.f3323l = 6;
                            e0Var.getClass();
                            j7.e eVar = g0.f1696a;
                            obj = c7.a0.x(j7.d.f5151h, new androidx.room.e(e0Var, dVar, i9), fVar);
                            break;
                        } else {
                            if (str3 != null && str3.length() != 0) {
                                gVar2.getClass();
                                return new u(str3, z6.h.y(str3, PlateVault.INSTANCE.at(4)));
                            }
                            fVar.f3317f = null;
                            fVar.f3318g = null;
                            fVar.f3323l = 5;
                            if (c(gVar2, currentTimeMillis, fVar) == aVar3) {
                            }
                        }
                        return aVar3;
                    case 5:
                        d6.a.e(obj);
                        return tVar;
                    case 6:
                        currentTimeMillis = fVar.f3320i;
                        aVar = (a) fVar.f3318g;
                        gVar2 = fVar.f3317f;
                        d6.a.e(obj);
                        gVar3 = gVar2;
                        a aVar5 = aVar;
                        f0Var = (f0) obj;
                        b6.c cVar2 = gVar3.f3328c;
                        fVar.f3317f = gVar3;
                        fVar.f3318g = aVar5;
                        fVar.f3319h = f0Var;
                        fVar.f3320i = currentTimeMillis;
                        fVar.f3323l = 7;
                        obj = cVar2.v(5000L, fVar);
                        if (obj != aVar3) {
                            aVar2 = aVar5;
                            String str4 = (String) obj;
                            b1.b bVar = gVar3.f3326a;
                            String gateUrl = aVar2.getGateUrl();
                            String str5 = f0Var.f3324a;
                            String str6 = f0Var.f3325b;
                            fVar.f3317f = gVar3;
                            fVar.f3318g = null;
                            fVar.f3319h = null;
                            fVar.f3320i = currentTimeMillis;
                            fVar.f3323l = 8;
                            bVar.getClass();
                            j7.e eVar2 = g0.f1696a;
                            obj = c7.a0.x(j7.d.f5151h, new i0(gateUrl, str5, str6, str4, bVar, null, 2), fVar);
                            if (obj != aVar3) {
                                gVar4 = gVar3;
                                PlateReply plateReply = (PlateReply) obj;
                                str = (plateReply != null || (url = plateReply.getUrl()) == null || z6.h.G(url)) ? null : url;
                                if (str == null) {
                                    c0 c0Var = gVar4.f3329d;
                                    String time = plateReply.getTime();
                                    fVar.f3317f = gVar4;
                                    fVar.f3318g = str;
                                    fVar.f3323l = 9;
                                    if (d0.a(c0Var.f3305a).d(new k3.c(new x(c0Var, str, time, dVar, 0), null, 1), fVar) != aVar3) {
                                        gVar5 = gVar4;
                                        str2 = str;
                                        gVar5.getClass();
                                        return new u(str2, z6.h.y(str2, PlateVault.INSTANCE.at(4)));
                                    }
                                } else {
                                    fVar.f3317f = null;
                                    fVar.f3323l = 10;
                                    if (c(gVar4, currentTimeMillis, fVar) == aVar3) {
                                    }
                                }
                            }
                        }
                        return aVar3;
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        currentTimeMillis = fVar.f3320i;
                        f0Var = fVar.f3319h;
                        aVar2 = (a) fVar.f3318g;
                        gVar3 = fVar.f3317f;
                        d6.a.e(obj);
                        String str42 = (String) obj;
                        b1.b bVar2 = gVar3.f3326a;
                        String gateUrl2 = aVar2.getGateUrl();
                        String str52 = f0Var.f3324a;
                        String str62 = f0Var.f3325b;
                        fVar.f3317f = gVar3;
                        fVar.f3318g = null;
                        fVar.f3319h = null;
                        fVar.f3320i = currentTimeMillis;
                        fVar.f3323l = 8;
                        bVar2.getClass();
                        j7.e eVar22 = g0.f1696a;
                        obj = c7.a0.x(j7.d.f5151h, new i0(gateUrl2, str52, str62, str42, bVar2, null, 2), fVar);
                        if (obj != aVar3) {
                        }
                        return aVar3;
                    case 8:
                        currentTimeMillis = fVar.f3320i;
                        gVar4 = fVar.f3317f;
                        d6.a.e(obj);
                        PlateReply plateReply2 = (PlateReply) obj;
                        if (plateReply2 != null) {
                            break;
                        }
                        if (str == null) {
                        }
                        return aVar3;
                    case q.c.f7259c /* 9 */:
                        str2 = (String) fVar.f3318g;
                        gVar5 = fVar.f3317f;
                        d6.a.e(obj);
                        gVar5.getClass();
                        return new u(str2, z6.h.y(str2, PlateVault.INSTANCE.at(4)));
                    case q.c.f7261e /* 10 */:
                        d6.a.e(obj);
                        return tVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f3321j;
        i7 = fVar.f3323l;
        int i92 = 1;
        int i102 = 2;
        t tVar2 = t.f3349a;
        h6.d dVar2 = null;
        i6.a aVar32 = i6.a.f4956f;
        switch (i7) {
        }
    }
}
