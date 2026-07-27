package B1;

import W2.y0;
import android.app.Application;
import com.appsflyer.attribution.RequestError;
import com.chicken.road.kedro.laqer.village.VillageReply;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import w2.C1294c;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* renamed from: B1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104k {
    private static final C0101h Companion = new C0101h();

    /* renamed from: a, reason: collision with root package name */
    public final Application f1005a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097d f1006b;

    /* renamed from: c, reason: collision with root package name */
    public final L f1007c;

    /* renamed from: d, reason: collision with root package name */
    public final C1294c f1008d;

    /* renamed from: e, reason: collision with root package name */
    public final I f1009e;

    public C0104k(Application appContext) {
        Intrinsics.checkNotNullParameter(appContext, "app");
        this.f1005a = appContext;
        this.f1006b = new C0097d(appContext);
        this.f1007c = new L(appContext);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        C1294c c1294c = new C1294c();
        c1294c.f11388d = appContext;
        this.f1008d = c1294c;
        this.f1009e = new I(appContext);
    }

    public static Object c(C0104k c0104k, long j4, C0103j c0103j) {
        Object a4;
        c0104k.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j4;
        return (currentTimeMillis >= 1200 || (a4 = W2.F.a(1200 - currentTimeMillis, c0103j)) != D2.a.f2163d) ? Unit.f7487a : a4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r0 = y2.AbstractC1341p.f11673d;
        r5 = y2.AbstractC1343r.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(E2.c cVar) {
        C0102i c0102i;
        int i2;
        if (cVar instanceof C0102i) {
            c0102i = (C0102i) cVar;
            int i4 = c0102i.f996l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0102i.f996l = i4 - Integer.MIN_VALUE;
                Object obj = c0102i.f994j;
                Object obj2 = D2.a.f2163d;
                i2 = c0102i.f996l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    c0102i.f996l = 1;
                    obj = b(c0102i);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                Object a4 = (B) obj;
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                return !(a4 instanceof C1342q) ? y.f1033a : a4;
            }
        }
        c0102i = new C0102i(this, cVar);
        Object obj3 = c0102i.f994j;
        Object obj22 = D2.a.f2163d;
        i2 = c0102i.f996l;
        if (i2 != 0) {
        }
        Object a42 = (B) obj3;
        AbstractC1341p.a aVar22 = AbstractC1341p.f11673d;
        if (!(a42 instanceof C1342q)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(E2.c cVar) {
        C0103j c0103j;
        int i2;
        long currentTimeMillis;
        C0104k c0104k;
        Object j4;
        C0098e c0098e;
        long j5;
        C0104k c0104k2;
        String str;
        Object k4;
        C0104k c0104k3;
        C0094a c0094a;
        C0098e c0098e2;
        String str2;
        String str3;
        String str4;
        long j6;
        C0104k c0104k4;
        String str5;
        VillageReply villageReply;
        String str6;
        String str7;
        C0104k c0104k5;
        if (cVar instanceof C0103j) {
            c0103j = (C0103j) cVar;
            int i4 = c0103j.f1004q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0103j.f1004q = i4 - Integer.MIN_VALUE;
                Object obj = c0103j.f1002o;
                D2.a aVar = D2.a.f2163d;
                i2 = c0103j.f1004q;
                y yVar = y.f1033a;
                switch (i2) {
                    case 0:
                        AbstractC1343r.b(obj);
                        currentTimeMillis = System.currentTimeMillis();
                        c0103j.f997j = this;
                        c0103j.f1001n = currentTimeMillis;
                        c0103j.f1004q = 1;
                        obj = y0.b(8000L, new C0100g(2, null), c0103j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0104k = this;
                        C0098e c0098e3 = (C0098e) obj;
                        G g4 = c0104k.f1009e.f968f;
                        c0103j.f997j = c0104k;
                        c0103j.f998k = c0098e3;
                        c0103j.f1001n = currentTimeMillis;
                        c0103j.f1004q = 2;
                        j4 = Z2.H.j(g4, c0103j);
                        if (j4 != aVar) {
                            return aVar;
                        }
                        C0104k c0104k6 = c0104k;
                        c0098e = c0098e3;
                        obj = j4;
                        j5 = currentTimeMillis;
                        c0104k2 = c0104k6;
                        if (!((Boolean) obj).booleanValue()) {
                            c0103j.f997j = null;
                            c0103j.f998k = null;
                            c0103j.f1004q = 3;
                            return c(c0104k2, j5, c0103j) == aVar ? aVar : yVar;
                        }
                        G g5 = c0104k2.f1009e.f967e;
                        c0103j.f997j = c0104k2;
                        c0103j.f998k = c0098e;
                        c0103j.f1001n = j5;
                        c0103j.f1004q = 4;
                        obj = Z2.H.j(g5, c0103j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        str = (String) obj;
                        if (c0098e != null || !c0098e.getActive() || kotlin.text.y.x(c0098e.getCheckUrl())) {
                            if (str == null && str.length() != 0) {
                                c0104k2.getClass();
                                return new z(str, kotlin.text.y.p(str, "Privacy-Policy"));
                            }
                            c0103j.f997j = null;
                            c0103j.f998k = null;
                            c0103j.f1004q = 5;
                            return c(c0104k2, j5, c0103j) != aVar ? aVar : yVar;
                        }
                        L l4 = c0104k2.f1007c;
                        c0103j.f997j = c0104k2;
                        c0103j.f998k = c0098e;
                        c0103j.f1001n = j5;
                        c0103j.f1004q = 6;
                        l4.getClass();
                        d3.e eVar = W2.J.f4225a;
                        obj = W2.B.q(d3.d.f6116i, new K(l4, null), c0103j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        C0094a c0094a2 = (C0094a) obj;
                        C1294c c1294c = c0104k2.f1008d;
                        c0103j.f997j = c0104k2;
                        c0103j.f998k = c0098e;
                        c0103j.f999l = c0094a2;
                        c0103j.f1001n = j5;
                        c0103j.f1004q = 7;
                        k4 = c1294c.k(5000L, c0103j);
                        if (k4 != aVar) {
                            return aVar;
                        }
                        c0104k3 = c0104k2;
                        c0094a = c0094a2;
                        obj = k4;
                        c0098e2 = c0098e;
                        str2 = (String) obj;
                        if (!kotlin.text.y.x(c0098e2.getTitle())) {
                            Application application = c0104k3.f1005a;
                            String title = c0098e2.getTitle();
                            c0103j.f997j = c0104k3;
                            c0103j.f998k = c0098e2;
                            c0103j.f999l = c0094a;
                            c0103j.f1000m = str2;
                            c0103j.f1001n = j5;
                            c0103j.f1004q = 8;
                            d3.e eVar2 = W2.J.f4225a;
                            obj = W2.B.q(b3.m.f5679a, new C0095b(application, title, null), c0103j);
                            if (obj == aVar) {
                                return aVar;
                            }
                            str5 = (String) obj;
                            if (str5 != null) {
                                str3 = str5;
                                str4 = str2;
                                j6 = j5;
                                C0097d c0097d = c0104k3.f1006b;
                                String checkUrl = c0098e2.getCheckUrl();
                                String str8 = c0094a.f973a;
                                c0103j.f997j = c0104k3;
                                c0103j.f998k = null;
                                c0103j.f999l = null;
                                c0103j.f1000m = null;
                                c0103j.f1001n = j6;
                                c0103j.f1004q = 9;
                                c0097d.getClass();
                                d3.e eVar3 = W2.J.f4225a;
                                obj = W2.B.q(d3.d.f6116i, new C0096c(checkUrl, str8, c0094a.f974b, str4, str3, c0097d, null), c0103j);
                                if (obj != aVar) {
                                    return aVar;
                                }
                                c0104k4 = c0104k3;
                                villageReply = (VillageReply) obj;
                                if (villageReply != null || (str6 = villageReply.getUrl()) == null || kotlin.text.y.x(str6)) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    c0103j.f997j = null;
                                    c0103j.f1004q = 11;
                                    return c(c0104k4, j6, c0103j) == aVar ? aVar : yVar;
                                }
                                I i5 = c0104k4.f1009e;
                                String time = villageReply.getTime();
                                c0103j.f997j = c0104k4;
                                c0103j.f998k = str6;
                                c0103j.f1004q = 10;
                                if (J.a(i5.f963a).d(new j1.f(new D(i5, str6, time, null), null), c0103j) == aVar) {
                                    return aVar;
                                }
                                str7 = str6;
                                c0104k5 = c0104k4;
                                c0104k5.getClass();
                                return new z(str7, kotlin.text.y.p(str7, "Privacy-Policy"));
                            }
                        }
                        str4 = str2;
                        str3 = "";
                        j6 = j5;
                        C0097d c0097d2 = c0104k3.f1006b;
                        String checkUrl2 = c0098e2.getCheckUrl();
                        String str82 = c0094a.f973a;
                        c0103j.f997j = c0104k3;
                        c0103j.f998k = null;
                        c0103j.f999l = null;
                        c0103j.f1000m = null;
                        c0103j.f1001n = j6;
                        c0103j.f1004q = 9;
                        c0097d2.getClass();
                        d3.e eVar32 = W2.J.f4225a;
                        obj = W2.B.q(d3.d.f6116i, new C0096c(checkUrl2, str82, c0094a.f974b, str4, str3, c0097d2, null), c0103j);
                        if (obj != aVar) {
                        }
                        break;
                    case 1:
                        currentTimeMillis = c0103j.f1001n;
                        c0104k = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        C0098e c0098e32 = (C0098e) obj;
                        G g42 = c0104k.f1009e.f968f;
                        c0103j.f997j = c0104k;
                        c0103j.f998k = c0098e32;
                        c0103j.f1001n = currentTimeMillis;
                        c0103j.f1004q = 2;
                        j4 = Z2.H.j(g42, c0103j);
                        if (j4 != aVar) {
                        }
                        break;
                    case 2:
                        j5 = c0103j.f1001n;
                        c0098e = (C0098e) c0103j.f998k;
                        c0104k2 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        AbstractC1343r.b(obj);
                    case 4:
                        j5 = c0103j.f1001n;
                        c0098e = (C0098e) c0103j.f998k;
                        c0104k2 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        str = (String) obj;
                        if (c0098e != null) {
                            break;
                        }
                        if (str == null) {
                            break;
                        }
                        c0103j.f997j = null;
                        c0103j.f998k = null;
                        c0103j.f1004q = 5;
                        if (c(c0104k2, j5, c0103j) != aVar) {
                        }
                        break;
                    case 5:
                        AbstractC1343r.b(obj);
                    case 6:
                        j5 = c0103j.f1001n;
                        c0098e = (C0098e) c0103j.f998k;
                        c0104k2 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        C0094a c0094a22 = (C0094a) obj;
                        C1294c c1294c2 = c0104k2.f1008d;
                        c0103j.f997j = c0104k2;
                        c0103j.f998k = c0098e;
                        c0103j.f999l = c0094a22;
                        c0103j.f1001n = j5;
                        c0103j.f1004q = 7;
                        k4 = c1294c2.k(5000L, c0103j);
                        if (k4 != aVar) {
                        }
                        break;
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        j5 = c0103j.f1001n;
                        C0094a c0094a3 = c0103j.f999l;
                        C0098e c0098e4 = (C0098e) c0103j.f998k;
                        C0104k c0104k7 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        c0104k3 = c0104k7;
                        c0098e2 = c0098e4;
                        c0094a = c0094a3;
                        str2 = (String) obj;
                        if (!kotlin.text.y.x(c0098e2.getTitle())) {
                        }
                        str4 = str2;
                        str3 = "";
                        j6 = j5;
                        C0097d c0097d22 = c0104k3.f1006b;
                        String checkUrl22 = c0098e2.getCheckUrl();
                        String str822 = c0094a.f973a;
                        c0103j.f997j = c0104k3;
                        c0103j.f998k = null;
                        c0103j.f999l = null;
                        c0103j.f1000m = null;
                        c0103j.f1001n = j6;
                        c0103j.f1004q = 9;
                        c0097d22.getClass();
                        d3.e eVar322 = W2.J.f4225a;
                        obj = W2.B.q(d3.d.f6116i, new C0096c(checkUrl22, str822, c0094a.f974b, str4, str3, c0097d22, null), c0103j);
                        if (obj != aVar) {
                        }
                        break;
                    case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                        j5 = c0103j.f1001n;
                        str2 = c0103j.f1000m;
                        c0094a = c0103j.f999l;
                        c0098e2 = (C0098e) c0103j.f998k;
                        c0104k3 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        str5 = (String) obj;
                        if (str5 != null) {
                        }
                        str4 = str2;
                        str3 = "";
                        j6 = j5;
                        C0097d c0097d222 = c0104k3.f1006b;
                        String checkUrl222 = c0098e2.getCheckUrl();
                        String str8222 = c0094a.f973a;
                        c0103j.f997j = c0104k3;
                        c0103j.f998k = null;
                        c0103j.f999l = null;
                        c0103j.f1000m = null;
                        c0103j.f1001n = j6;
                        c0103j.f1004q = 9;
                        c0097d222.getClass();
                        d3.e eVar3222 = W2.J.f4225a;
                        obj = W2.B.q(d3.d.f6116i, new C0096c(checkUrl222, str8222, c0094a.f974b, str4, str3, c0097d222, null), c0103j);
                        if (obj != aVar) {
                        }
                        break;
                    case AbstractC1024c.f9242c /* 9 */:
                        j6 = c0103j.f1001n;
                        c0104k4 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        villageReply = (VillageReply) obj;
                        if (villageReply != null) {
                            break;
                        }
                        str6 = null;
                        if (str6 != null) {
                        }
                        break;
                    case 10:
                        str7 = (String) c0103j.f998k;
                        c0104k5 = c0103j.f997j;
                        AbstractC1343r.b(obj);
                        c0104k5.getClass();
                        return new z(str7, kotlin.text.y.p(str7, "Privacy-Policy"));
                    case RequestError.STOP_TRACKING /* 11 */:
                        AbstractC1343r.b(obj);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0103j = new C0103j(this, cVar);
        Object obj2 = c0103j.f1002o;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c0103j.f1004q;
        y yVar2 = y.f1033a;
        switch (i2) {
        }
    }
}
