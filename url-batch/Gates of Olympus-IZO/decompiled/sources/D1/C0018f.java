package D1;

import android.app.Application;
import com.gates.olympus.miruv.tenon.TenonLocker;
import com.gates.olympus.miruv.tenon.TenonReply;
import h1.C0438i;
import h2.AbstractC0447i;
import i1.C0469f;
import k2.AbstractC0552y;
import n2.AbstractC0682G;

/* renamed from: D1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018f {
    private static final C0015c Companion = new C0015c();

    /* renamed from: a, reason: collision with root package name */
    public final C0014b f548a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.g f549b;

    /* renamed from: c, reason: collision with root package name */
    public final C f550c;

    public C0018f(Application application) {
        this.f548a = new C0014b(application);
        this.f549b = new A2.g(2, application);
        this.f550c = new C(application);
    }

    public static Object c(C0018f c0018f, long j3, C0017e c0017e) {
        Object e3;
        c0018f.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j3;
        L1.z zVar = L1.z.f2729a;
        return (currentTimeMillis >= 1200 || (e3 = AbstractC0552y.e(1200 - currentTimeMillis, c0017e)) != Q1.a.f3113d) ? zVar : e3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r5 = I2.l.t(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(R1.c cVar) {
        C0016d c0016d;
        int i3;
        if (cVar instanceof C0016d) {
            c0016d = (C0016d) cVar;
            int i4 = c0016d.f541f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0016d.f541f = i4 - Integer.MIN_VALUE;
                Object obj = c0016d.f539d;
                Object obj2 = Q1.a.f3113d;
                i3 = c0016d.f541f;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    c0016d.f541f = 1;
                    obj = b(c0016d);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I2.l.Q(obj);
                }
                Object t3 = (v) obj;
                return !(t3 instanceof L1.l) ? s.f570a : t3;
            }
        }
        c0016d = new C0016d(this, cVar);
        Object obj3 = c0016d.f539d;
        Object obj22 = Q1.a.f3113d;
        i3 = c0016d.f541f;
        if (i3 != 0) {
        }
        Object t32 = (v) obj3;
        if (!(t32 instanceof L1.l)) {
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
    public final Object b(R1.c cVar) {
        C0017e c0017e;
        int i3;
        long currentTimeMillis;
        C0018f c0018f;
        String str;
        TenonReply tenonReply;
        String str2;
        C0018f c0018f2;
        String str3;
        if (cVar instanceof C0017e) {
            c0017e = (C0017e) cVar;
            int i4 = c0017e.f547i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0017e.f547i = i4 - Integer.MIN_VALUE;
                Object obj = c0017e.f545g;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0017e.f547i;
                s sVar = s.f570a;
                switch (i3) {
                    case 0:
                        I2.l.Q(obj);
                        currentTimeMillis = System.currentTimeMillis();
                        A a3 = this.f550c.f525f;
                        c0017e.f542d = this;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 1;
                        obj = AbstractC0682G.i(a3, c0017e);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0018f = this;
                        if (!((Boolean) obj).booleanValue()) {
                            c0017e.f542d = null;
                            c0017e.f547i = 2;
                            return c(c0018f, currentTimeMillis, c0017e) == aVar ? aVar : sVar;
                        }
                        A a4 = c0018f.f550c.f524e;
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 3;
                        obj = AbstractC0682G.i(a4, c0017e);
                        if (obj == aVar) {
                            return aVar;
                        }
                        str = (String) obj;
                        if (str == null && str.length() != 0) {
                            c0018f.getClass();
                            return new t(str, AbstractC0447i.l0(str, TenonLocker.INSTANCE.at(1)));
                        }
                        A2.g gVar = c0018f.f549b;
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 4;
                        gVar.getClass();
                        r2.e eVar = k2.E.f5312a;
                        obj = AbstractC0552y.y(r2.d.f7321f, new F(gVar, null), c0017e);
                        if (obj == aVar) {
                            return aVar;
                        }
                        C0014b c0014b = c0018f.f548a;
                        String at = TenonLocker.INSTANCE.at(0);
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 5;
                        c0014b.getClass();
                        r2.e eVar2 = k2.E.f5312a;
                        obj = AbstractC0552y.y(r2.d.f7321f, new C0013a(at, (String) obj, c0014b, null), c0017e);
                        if (obj == aVar) {
                            return aVar;
                        }
                        tenonReply = (TenonReply) obj;
                        if (tenonReply != null || (str2 = tenonReply.getUrl()) == null || AbstractC0447i.t0(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            c0017e.f542d = null;
                            c0017e.f547i = 7;
                            return c(c0018f, currentTimeMillis, c0017e) == aVar ? aVar : sVar;
                        }
                        C c3 = c0018f.f550c;
                        String time = tenonReply.getTime();
                        c0017e.f542d = c0018f;
                        c0017e.f543e = str2;
                        c0017e.f547i = 6;
                        if (D.a(c3.f520a).h(new C0469f(new x(c3, str2, time, null), null), c0017e) == aVar) {
                            return aVar;
                        }
                        c0018f2 = c0018f;
                        str3 = str2;
                        c0018f2.getClass();
                        return new t(str3, AbstractC0447i.l0(str3, TenonLocker.INSTANCE.at(1)));
                    case 1:
                        currentTimeMillis = c0017e.f544f;
                        c0018f = c0017e.f542d;
                        I2.l.Q(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                        I2.l.Q(obj);
                    case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                        currentTimeMillis = c0017e.f544f;
                        c0018f = c0017e.f542d;
                        I2.l.Q(obj);
                        str = (String) obj;
                        if (str == null) {
                            break;
                        }
                        A2.g gVar2 = c0018f.f549b;
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 4;
                        gVar2.getClass();
                        r2.e eVar3 = k2.E.f5312a;
                        obj = AbstractC0552y.y(r2.d.f7321f, new F(gVar2, null), c0017e);
                        if (obj == aVar) {
                        }
                        C0014b c0014b2 = c0018f.f548a;
                        String at2 = TenonLocker.INSTANCE.at(0);
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 5;
                        c0014b2.getClass();
                        r2.e eVar22 = k2.E.f5312a;
                        obj = AbstractC0552y.y(r2.d.f7321f, new C0013a(at2, (String) obj, c0014b2, null), c0017e);
                        if (obj == aVar) {
                        }
                        tenonReply = (TenonReply) obj;
                        if (tenonReply != null) {
                            break;
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case C0438i.LONG_FIELD_NUMBER /* 4 */:
                        currentTimeMillis = c0017e.f544f;
                        c0018f = c0017e.f542d;
                        I2.l.Q(obj);
                        C0014b c0014b22 = c0018f.f548a;
                        String at22 = TenonLocker.INSTANCE.at(0);
                        c0017e.f542d = c0018f;
                        c0017e.f544f = currentTimeMillis;
                        c0017e.f547i = 5;
                        c0014b22.getClass();
                        r2.e eVar222 = k2.E.f5312a;
                        obj = AbstractC0552y.y(r2.d.f7321f, new C0013a(at22, (String) obj, c0014b22, null), c0017e);
                        if (obj == aVar) {
                        }
                        tenonReply = (TenonReply) obj;
                        if (tenonReply != null) {
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case 5:
                        currentTimeMillis = c0017e.f544f;
                        c0018f = c0017e.f542d;
                        I2.l.Q(obj);
                        tenonReply = (TenonReply) obj;
                        if (tenonReply != null) {
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        break;
                    case 6:
                        str3 = c0017e.f543e;
                        c0018f2 = c0017e.f542d;
                        I2.l.Q(obj);
                        c0018f2.getClass();
                        return new t(str3, AbstractC0447i.l0(str3, TenonLocker.INSTANCE.at(1)));
                    case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                        I2.l.Q(obj);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0017e = new C0017e(this, cVar);
        Object obj2 = c0017e.f545g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0017e.f547i;
        s sVar2 = s.f570a;
        switch (i3) {
        }
    }
}
