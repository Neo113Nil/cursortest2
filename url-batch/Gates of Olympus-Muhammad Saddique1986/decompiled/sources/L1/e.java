package L1;

import B.Y;
import android.app.Application;
import com.gatesof.olympus.martu.marku.salon.SalonDepot;
import com.gatesof.olympus.martu.marku.salon.SalonReply;
import l1.C0597f;
import n2.AbstractC0730j;
import q2.AbstractC0837y;
import q2.E;
import t2.AbstractC1035F;

/* loaded from: classes.dex */
public final class e {
    private static final C0201b Companion = new C0201b();

    /* renamed from: a, reason: collision with root package name */
    public final G1.m f3366a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3367b;

    /* renamed from: c, reason: collision with root package name */
    public final A f3368c;

    public e(Application application) {
        this.f3366a = new G1.m(application);
        this.f3367b = new Y(application);
        this.f3368c = new A(application);
    }

    public static Object c(e eVar, long j3, d dVar) {
        Object f3;
        eVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j3;
        R1.y yVar = R1.y.f4171a;
        return (currentTimeMillis >= 1200 || (f3 = AbstractC0837y.f(1200 - currentTimeMillis, dVar)) != W1.a.f4608d) ? yVar : f3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r5 = R1.a.b(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(X1.c cVar) {
        C0202c c0202c;
        int i3;
        if (cVar instanceof C0202c) {
            c0202c = (C0202c) cVar;
            int i4 = c0202c.f3359i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0202c.f3359i = i4 - Integer.MIN_VALUE;
                Object obj = c0202c.f3357g;
                Object obj2 = W1.a.f4608d;
                i3 = c0202c.f3359i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    c0202c.f3359i = 1;
                    obj = b(c0202c);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                Object b3 = (t) obj;
                return !(b3 instanceof R1.k) ? q.f3386a : b3;
            }
        }
        c0202c = new C0202c(this, cVar);
        Object obj3 = c0202c.f3357g;
        Object obj22 = W1.a.f4608d;
        i3 = c0202c.f3359i;
        if (i3 != 0) {
        }
        Object b32 = (t) obj3;
        if (!(b32 instanceof R1.k)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(X1.c cVar) {
        d dVar;
        int i3;
        long currentTimeMillis;
        e eVar;
        String str;
        SalonReply salonReply;
        String str2;
        e eVar2;
        String str3;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i4 = dVar.f3365l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.f3365l = i4 - Integer.MIN_VALUE;
                Object obj = dVar.f3363j;
                W1.a aVar = W1.a.f4608d;
                i3 = dVar.f3365l;
                q qVar = q.f3386a;
                switch (i3) {
                    case 0:
                        R1.a.e(obj);
                        currentTimeMillis = System.currentTimeMillis();
                        y yVar = this.f3368c.f3348f;
                        dVar.f3360g = this;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 1;
                        obj = AbstractC1035F.j(yVar, dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        eVar = this;
                        if (!((Boolean) obj).booleanValue()) {
                            dVar.f3360g = null;
                            dVar.f3365l = 2;
                            return c(eVar, currentTimeMillis, dVar) == aVar ? aVar : qVar;
                        }
                        y yVar2 = eVar.f3368c.f3347e;
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 3;
                        obj = AbstractC1035F.j(yVar2, dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        str = (String) obj;
                        if (str == null && str.length() != 0) {
                            eVar.getClass();
                            return new r(str, AbstractC0730j.C(str, SalonDepot.INSTANCE.at(1)));
                        }
                        Y y3 = eVar.f3367b;
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 4;
                        y3.getClass();
                        x2.e eVar3 = E.f7851a;
                        obj = AbstractC0837y.z(x2.d.f10346f, new C(y3, null), dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        G1.m mVar = eVar.f3366a;
                        String at = SalonDepot.INSTANCE.at(0);
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 5;
                        mVar.getClass();
                        x2.e eVar4 = E.f7851a;
                        obj = AbstractC0837y.z(x2.d.f10346f, new C0200a(at, (String) obj, mVar, null), dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        salonReply = (SalonReply) obj;
                        if (salonReply != null || (str2 = salonReply.getUrl()) == null || AbstractC0730j.K(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            dVar.f3360g = null;
                            dVar.f3365l = 7;
                            return c(eVar, currentTimeMillis, dVar) == aVar ? aVar : qVar;
                        }
                        A a3 = eVar.f3368c;
                        String time = salonReply.getTime();
                        dVar.f3360g = eVar;
                        dVar.f3361h = str2;
                        dVar.f3365l = 6;
                        if (B.a(a3.f3343a).a(new C0597f(new v(a3, str2, time, null), null), dVar) == aVar) {
                            return aVar;
                        }
                        eVar2 = eVar;
                        str3 = str2;
                        eVar2.getClass();
                        return new r(str3, AbstractC0730j.C(str3, SalonDepot.INSTANCE.at(1)));
                    case 1:
                        currentTimeMillis = dVar.f3362i;
                        eVar = dVar.f3360g;
                        R1.a.e(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        R1.a.e(obj);
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        currentTimeMillis = dVar.f3362i;
                        eVar = dVar.f3360g;
                        R1.a.e(obj);
                        str = (String) obj;
                        if (str == null) {
                            break;
                        }
                        Y y32 = eVar.f3367b;
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 4;
                        y32.getClass();
                        x2.e eVar32 = E.f7851a;
                        obj = AbstractC0837y.z(x2.d.f10346f, new C(y32, null), dVar);
                        if (obj == aVar) {
                        }
                        G1.m mVar2 = eVar.f3366a;
                        String at2 = SalonDepot.INSTANCE.at(0);
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 5;
                        mVar2.getClass();
                        x2.e eVar42 = E.f7851a;
                        obj = AbstractC0837y.z(x2.d.f10346f, new C0200a(at2, (String) obj, mVar2, null), dVar);
                        if (obj == aVar) {
                        }
                        salonReply = (SalonReply) obj;
                        if (salonReply != null) {
                            break;
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        currentTimeMillis = dVar.f3362i;
                        eVar = dVar.f3360g;
                        R1.a.e(obj);
                        G1.m mVar22 = eVar.f3366a;
                        String at22 = SalonDepot.INSTANCE.at(0);
                        dVar.f3360g = eVar;
                        dVar.f3362i = currentTimeMillis;
                        dVar.f3365l = 5;
                        mVar22.getClass();
                        x2.e eVar422 = E.f7851a;
                        obj = AbstractC0837y.z(x2.d.f10346f, new C0200a(at22, (String) obj, mVar22, null), dVar);
                        if (obj == aVar) {
                        }
                        salonReply = (SalonReply) obj;
                        if (salonReply != null) {
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case 5:
                        currentTimeMillis = dVar.f3362i;
                        eVar = dVar.f3360g;
                        R1.a.e(obj);
                        salonReply = (SalonReply) obj;
                        if (salonReply != null) {
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case 6:
                        str3 = dVar.f3361h;
                        eVar2 = dVar.f3360g;
                        R1.a.e(obj);
                        eVar2.getClass();
                        return new r(str3, AbstractC0730j.C(str3, SalonDepot.INSTANCE.at(1)));
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        R1.a.e(obj);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f3363j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = dVar.f3365l;
        q qVar2 = q.f3386a;
        switch (i3) {
        }
    }
}
