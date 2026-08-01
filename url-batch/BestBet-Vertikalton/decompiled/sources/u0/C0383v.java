package u0;

import android.os.CancellationSignal;
import androidx.recyclerview.widget.RecyclerView;
import c1.EnumC0088a;
import com.fortunequest.neontrack.data.FortuneQuestDatabase;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import d1.AbstractC0095c;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: u0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383v {

    /* renamed from: a, reason: collision with root package name */
    public final C0372k f4224a;

    /* renamed from: b, reason: collision with root package name */
    public final C0365d f4225b;

    /* renamed from: c, reason: collision with root package name */
    public final C0385x f4226c;

    public C0383v(FortuneQuestDatabase fortuneQuestDatabase) {
        this.f4224a = fortuneQuestDatabase.i();
        this.f4225b = fortuneQuestDatabase.b();
        this.f4226c = fortuneQuestDatabase.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135 A[LOOP:0: B:30:0x012f->B:32:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j2, AbstractC0095c abstractC0095c) {
        C0378q c0378q;
        long j3;
        C0383v c0383v;
        long j4;
        long j5;
        C0383v c0383v2;
        List list;
        Iterator it;
        long j6;
        C0383v c0383v3;
        C0386y c0386y;
        C0385x c0385x;
        C0386y a2;
        int i;
        C0383v c0383v4;
        C0386y c0386y2;
        if (abstractC0095c instanceof C0378q) {
            c0378q = (C0378q) abstractC0095c;
            int i2 = c0378q.f4206k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0378q.f4206k = i2 - Integer.MIN_VALUE;
                Object obj = c0378q.i;
                EnumC0088a enumC0088a = EnumC0088a.f2060a;
                switch (c0378q.f4206k) {
                    case 0:
                        H1.l.h0(obj);
                        c0378q.d = this;
                        j3 = j2;
                        c0378q.f4203f = j3;
                        c0378q.f4206k = 1;
                        if (b(c0378q) == enumC0088a) {
                            return enumC0088a;
                        }
                        c0383v = this;
                        c0383v.getClass();
                        long epochDay = LocalDate.now().toEpochDay();
                        c0378q.d = c0383v;
                        c0378q.f4203f = j3;
                        c0378q.f4204g = epochDay;
                        c0378q.f4206k = 2;
                        C0365d c0365d = c0383v.f4225b;
                        c0365d.getClass();
                        h0.p a3 = h0.p.a("SELECT COUNT(*) FROM completions WHERE habitId = ? AND dayEpoch = ?", 2);
                        a3.n(1, j3);
                        a3.n(2, epochDay);
                        obj = h0.e.a((FortuneQuestDatabase_Impl) c0365d.f4175b, new CancellationSignal(), new CallableC0364c(c0365d, a3, 1), c0378q);
                        if (obj != enumC0088a) {
                            return enumC0088a;
                        }
                        long j7 = j3;
                        j4 = epochDay;
                        j5 = j7;
                        if (((Number) obj).intValue() <= 0) {
                            return C0375n.f4200a;
                        }
                        C0365d c0365d2 = c0383v.f4225b;
                        C0368g c0368g = new C0368g(j5, j4);
                        c0378q.d = c0383v;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 3;
                        c0365d2.getClass();
                        if (h0.e.b((FortuneQuestDatabase_Impl) c0365d2.f4175b, new CallableC0363b(c0365d2, 0, c0368g), c0378q) == enumC0088a) {
                            return enumC0088a;
                        }
                        C0372k c0372k = c0383v.f4224a;
                        c0378q.d = c0383v;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 4;
                        obj = c0372k.b(c0378q);
                        if (obj == enumC0088a) {
                            return enumC0088a;
                        }
                        c0383v2 = c0383v;
                        list = (List) obj;
                        C0365d c0365d3 = c0383v2.f4225b;
                        c0378q.d = c0383v2;
                        c0378q.f4202e = list;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 5;
                        obj = c0365d3.b(j4, c0378q);
                        if (obj == enumC0088a) {
                            return enumC0088a;
                        }
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(Y0.l.z0(iterable));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Long(((C0368g) it.next()).f4183a));
                        }
                        Set E02 = Y0.j.E0(arrayList);
                        if (!list.isEmpty()) {
                            if (!list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (!E02.contains(new Long(((C0373l) it2.next()).f4193a))) {
                                    }
                                }
                            }
                            C0385x c0385x2 = c0383v2.f4226c;
                            c0378q.d = c0383v2;
                            c0378q.f4202e = null;
                            c0378q.f4203f = j4;
                            c0378q.f4206k = 6;
                            obj = c0385x2.u(c0378q);
                            if (obj == enumC0088a) {
                                return enumC0088a;
                            }
                            j6 = j4;
                            c0383v3 = c0383v2;
                            c0386y = (C0386y) obj;
                            if (c0386y == null) {
                                c0386y = new C0386y();
                            }
                            C0386y c0386y3 = c0386y;
                            int i3 = c0386y3.f4234b + 1;
                            int max = Math.max(c0386y3.f4235c, i3);
                            c0385x = c0383v3.f4226c;
                            a2 = C0386y.a(c0386y3, i3, max, j6, j6, 0, Math.min(3.0f, (i3 * 0.1f) + 1.0f), 33);
                            c0378q.d = c0383v3;
                            c0378q.h = i3;
                            c0378q.f4206k = 7;
                            c0385x.getClass();
                            if (h0.e.b((FortuneQuestDatabase_Impl) c0385x.f4231b, new CallableC0363b(c0385x, 2, a2), c0378q) != enumC0088a) {
                                return enumC0088a;
                            }
                            i = i3;
                            c0383v4 = c0383v3;
                            c0383v4.getClass();
                            return new C0374m(Math.min(3.0f, (i * 0.1f) + 1.0f), i, (i / 3) + 1);
                        }
                        C0385x c0385x3 = c0383v2.f4226c;
                        c0378q.d = null;
                        c0378q.f4202e = null;
                        c0378q.f4206k = 8;
                        obj = c0385x3.u(c0378q);
                        if (obj == enumC0088a) {
                            return enumC0088a;
                        }
                        c0386y2 = (C0386y) obj;
                        if (c0386y2 == null) {
                            c0386y2 = new C0386y();
                        }
                        return new C0376o(c0386y2.f4238g);
                    case 1:
                        j3 = c0378q.f4203f;
                        c0383v = c0378q.d;
                        H1.l.h0(obj);
                        c0383v.getClass();
                        long epochDay2 = LocalDate.now().toEpochDay();
                        c0378q.d = c0383v;
                        c0378q.f4203f = j3;
                        c0378q.f4204g = epochDay2;
                        c0378q.f4206k = 2;
                        C0365d c0365d4 = c0383v.f4225b;
                        c0365d4.getClass();
                        h0.p a32 = h0.p.a("SELECT COUNT(*) FROM completions WHERE habitId = ? AND dayEpoch = ?", 2);
                        a32.n(1, j3);
                        a32.n(2, epochDay2);
                        obj = h0.e.a((FortuneQuestDatabase_Impl) c0365d4.f4175b, new CancellationSignal(), new CallableC0364c(c0365d4, a32, 1), c0378q);
                        if (obj != enumC0088a) {
                        }
                        break;
                    case 2:
                        j4 = c0378q.f4204g;
                        j5 = c0378q.f4203f;
                        c0383v = c0378q.d;
                        H1.l.h0(obj);
                        if (((Number) obj).intValue() <= 0) {
                        }
                        break;
                    case 3:
                        j4 = c0378q.f4203f;
                        c0383v = c0378q.d;
                        H1.l.h0(obj);
                        C0372k c0372k2 = c0383v.f4224a;
                        c0378q.d = c0383v;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 4;
                        obj = c0372k2.b(c0378q);
                        if (obj == enumC0088a) {
                        }
                        c0383v2 = c0383v;
                        list = (List) obj;
                        C0365d c0365d32 = c0383v2.f4225b;
                        c0378q.d = c0383v2;
                        c0378q.f4202e = list;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 5;
                        obj = c0365d32.b(j4, c0378q);
                        if (obj == enumC0088a) {
                        }
                        Iterable iterable2 = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(Y0.l.z0(iterable2));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        Set E022 = Y0.j.E0(arrayList2);
                        if (!list.isEmpty()) {
                        }
                        C0385x c0385x32 = c0383v2.f4226c;
                        c0378q.d = null;
                        c0378q.f4202e = null;
                        c0378q.f4206k = 8;
                        obj = c0385x32.u(c0378q);
                        if (obj == enumC0088a) {
                        }
                        c0386y2 = (C0386y) obj;
                        if (c0386y2 == null) {
                        }
                        return new C0376o(c0386y2.f4238g);
                    case 4:
                        j4 = c0378q.f4203f;
                        c0383v = c0378q.d;
                        H1.l.h0(obj);
                        c0383v2 = c0383v;
                        list = (List) obj;
                        C0365d c0365d322 = c0383v2.f4225b;
                        c0378q.d = c0383v2;
                        c0378q.f4202e = list;
                        c0378q.f4203f = j4;
                        c0378q.f4206k = 5;
                        obj = c0365d322.b(j4, c0378q);
                        if (obj == enumC0088a) {
                        }
                        Iterable iterable22 = (Iterable) obj;
                        ArrayList arrayList22 = new ArrayList(Y0.l.z0(iterable22));
                        it = iterable22.iterator();
                        while (it.hasNext()) {
                        }
                        Set E0222 = Y0.j.E0(arrayList22);
                        if (!list.isEmpty()) {
                        }
                        C0385x c0385x322 = c0383v2.f4226c;
                        c0378q.d = null;
                        c0378q.f4202e = null;
                        c0378q.f4206k = 8;
                        obj = c0385x322.u(c0378q);
                        if (obj == enumC0088a) {
                        }
                        c0386y2 = (C0386y) obj;
                        if (c0386y2 == null) {
                        }
                        return new C0376o(c0386y2.f4238g);
                    case 5:
                        j4 = c0378q.f4203f;
                        list = c0378q.f4202e;
                        c0383v2 = c0378q.d;
                        H1.l.h0(obj);
                        Iterable iterable222 = (Iterable) obj;
                        ArrayList arrayList222 = new ArrayList(Y0.l.z0(iterable222));
                        it = iterable222.iterator();
                        while (it.hasNext()) {
                        }
                        Set E02222 = Y0.j.E0(arrayList222);
                        if (!list.isEmpty()) {
                        }
                        C0385x c0385x3222 = c0383v2.f4226c;
                        c0378q.d = null;
                        c0378q.f4202e = null;
                        c0378q.f4206k = 8;
                        obj = c0385x3222.u(c0378q);
                        if (obj == enumC0088a) {
                        }
                        c0386y2 = (C0386y) obj;
                        if (c0386y2 == null) {
                        }
                        return new C0376o(c0386y2.f4238g);
                    case 6:
                        long j8 = c0378q.f4203f;
                        c0383v3 = c0378q.d;
                        H1.l.h0(obj);
                        j6 = j8;
                        c0386y = (C0386y) obj;
                        if (c0386y == null) {
                        }
                        C0386y c0386y32 = c0386y;
                        int i32 = c0386y32.f4234b + 1;
                        int max2 = Math.max(c0386y32.f4235c, i32);
                        c0385x = c0383v3.f4226c;
                        a2 = C0386y.a(c0386y32, i32, max2, j6, j6, 0, Math.min(3.0f, (i32 * 0.1f) + 1.0f), 33);
                        c0378q.d = c0383v3;
                        c0378q.h = i32;
                        c0378q.f4206k = 7;
                        c0385x.getClass();
                        if (h0.e.b((FortuneQuestDatabase_Impl) c0385x.f4231b, new CallableC0363b(c0385x, 2, a2), c0378q) != enumC0088a) {
                        }
                        break;
                    case 7:
                        i = c0378q.h;
                        c0383v4 = c0378q.d;
                        H1.l.h0(obj);
                        c0383v4.getClass();
                        return new C0374m(Math.min(3.0f, (i * 0.1f) + 1.0f), i, (i / 3) + 1);
                    case 8:
                        H1.l.h0(obj);
                        c0386y2 = (C0386y) obj;
                        if (c0386y2 == null) {
                        }
                        return new C0376o(c0386y2.f4238g);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0378q = new C0378q(this, abstractC0095c);
        Object obj2 = c0378q.i;
        EnumC0088a enumC0088a2 = EnumC0088a.f2060a;
        switch (c0378q.f4206k) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC0095c abstractC0095c) {
        C0379r c0379r;
        Object obj;
        int i;
        C0383v c0383v;
        if (abstractC0095c instanceof C0379r) {
            c0379r = (C0379r) abstractC0095c;
            int i2 = c0379r.f4209g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0379r.f4209g = i2 - Integer.MIN_VALUE;
                obj = c0379r.f4207e;
                EnumC0088a enumC0088a = EnumC0088a.f2060a;
                i = c0379r.f4209g;
                X0.g gVar = X0.g.f1277c;
                if (i != 0) {
                    H1.l.h0(obj);
                    c0379r.d = this;
                    c0379r.f4209g = 1;
                    obj = this.f4226c.u(c0379r);
                    if (obj == enumC0088a) {
                        return enumC0088a;
                    }
                    c0383v = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        H1.l.h0(obj);
                        return gVar;
                    }
                    c0383v = c0379r.d;
                    H1.l.h0(obj);
                }
                if (obj == null) {
                    C0385x c0385x = c0383v.f4226c;
                    C0386y c0386y = new C0386y();
                    c0379r.d = null;
                    c0379r.f4209g = 2;
                    c0385x.getClass();
                    if (h0.e.b((FortuneQuestDatabase_Impl) c0385x.f4231b, new CallableC0363b(c0385x, 2, c0386y), c0379r) == enumC0088a) {
                        return enumC0088a;
                    }
                }
                return gVar;
            }
        }
        c0379r = new C0379r(this, abstractC0095c);
        obj = c0379r.f4207e;
        EnumC0088a enumC0088a2 = EnumC0088a.f2060a;
        i = c0379r.f4209g;
        X0.g gVar2 = X0.g.f1277c;
        if (i != 0) {
        }
        if (obj == null) {
        }
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0109 A[LOOP:0: B:18:0x0103->B:20:0x0109, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[LOOP:2: B:47:0x00be->B:49:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC0095c abstractC0095c) {
        C0380s c0380s;
        Object obj;
        EnumC0088a enumC0088a;
        int i;
        C0383v c0383v;
        C0383v c0383v2;
        long j2;
        Object b2;
        C0383v c0383v3;
        List<C0373l> list;
        Iterator it;
        Object u2;
        Set set;
        C0383v c0383v4;
        C0386y c0386y;
        ArrayList arrayList;
        if (abstractC0095c instanceof C0380s) {
            c0380s = (C0380s) abstractC0095c;
            int i2 = c0380s.f4213j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0380s.f4213j = i2 - Integer.MIN_VALUE;
                obj = c0380s.h;
                enumC0088a = EnumC0088a.f2060a;
                i = c0380s.f4213j;
                if (i != 0) {
                    H1.l.h0(obj);
                    c0380s.d = this;
                    c0380s.f4213j = 1;
                    if (b(c0380s) == enumC0088a) {
                        return enumC0088a;
                    }
                    c0383v = this;
                } else if (i == 1) {
                    c0383v = c0380s.d;
                    H1.l.h0(obj);
                } else if (i == 2) {
                    c0383v = c0380s.d;
                    H1.l.h0(obj);
                    c0383v2 = c0383v;
                    c0383v2.getClass();
                    long epochDay = LocalDate.now().toEpochDay();
                    c0380s.d = c0383v2;
                    c0380s.f4212g = epochDay;
                    c0380s.f4213j = 3;
                    obj = c0383v2.f4224a.b(c0380s);
                    if (obj == enumC0088a) {
                        return enumC0088a;
                    }
                    j2 = epochDay;
                    List list2 = (List) obj;
                    C0365d c0365d = c0383v2.f4225b;
                    c0380s.d = c0383v2;
                    c0380s.f4210e = list2;
                    c0380s.f4213j = 4;
                    b2 = c0365d.b(j2, c0380s);
                    if (b2 != enumC0088a) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            set = c0380s.f4211f;
                            list = c0380s.f4210e;
                            c0383v4 = c0380s.d;
                            H1.l.h0(obj);
                            c0386y = (C0386y) obj;
                            if (c0386y == null) {
                                c0386y = new C0386y();
                            }
                            arrayList = new ArrayList(Y0.l.z0(list));
                            for (C0373l c0373l : list) {
                                long j3 = c0373l.f4193a;
                                arrayList.add(new C0384w(j3, c0373l.f4194b, c0373l.f4195c, set.contains(new Long(j3))));
                            }
                            int i3 = 0;
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (((C0384w) it2.next()).d && (i3 = i3 + 1) < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                            }
                            int i4 = i3;
                            c0383v4.getClass();
                            int i5 = c0386y.f4234b;
                            int size = arrayList.size();
                            return new C0367f(arrayList, i5, c0386y.f4235c, c0386y.f4237f, c0386y.f4238g, (i5 / 3) + 1, i4, size);
                        }
                        list = c0380s.f4210e;
                        c0383v3 = c0380s.d;
                        H1.l.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(Y0.l.z0(iterable));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new Long(((C0368g) it.next()).f4183a));
                        }
                        Set E02 = Y0.j.E0(arrayList2);
                        C0385x c0385x = c0383v3.f4226c;
                        c0380s.d = c0383v3;
                        c0380s.f4210e = list;
                        c0380s.f4211f = E02;
                        c0380s.f4213j = 5;
                        u2 = c0385x.u(c0380s);
                        if (u2 != enumC0088a) {
                            return enumC0088a;
                        }
                        set = E02;
                        obj = u2;
                        c0383v4 = c0383v3;
                        c0386y = (C0386y) obj;
                        if (c0386y == null) {
                        }
                        arrayList = new ArrayList(Y0.l.z0(list));
                        while (r4.hasNext()) {
                        }
                        int i32 = 0;
                        if (!arrayList.isEmpty()) {
                        }
                        int i42 = i32;
                        c0383v4.getClass();
                        int i52 = c0386y.f4234b;
                        int size2 = arrayList.size();
                        return new C0367f(arrayList, i52, c0386y.f4235c, c0386y.f4237f, c0386y.f4238g, (i52 / 3) + 1, i42, size2);
                    }
                    j2 = c0380s.f4212g;
                    c0383v2 = c0380s.d;
                    H1.l.h0(obj);
                    List list22 = (List) obj;
                    C0365d c0365d2 = c0383v2.f4225b;
                    c0380s.d = c0383v2;
                    c0380s.f4210e = list22;
                    c0380s.f4213j = 4;
                    b2 = c0365d2.b(j2, c0380s);
                    if (b2 != enumC0088a) {
                        return enumC0088a;
                    }
                    c0383v3 = c0383v2;
                    list = list22;
                    obj = b2;
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList22 = new ArrayList(Y0.l.z0(iterable2));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                    }
                    Set E022 = Y0.j.E0(arrayList22);
                    C0385x c0385x2 = c0383v3.f4226c;
                    c0380s.d = c0383v3;
                    c0380s.f4210e = list;
                    c0380s.f4211f = E022;
                    c0380s.f4213j = 5;
                    u2 = c0385x2.u(c0380s);
                    if (u2 != enumC0088a) {
                    }
                }
                c0380s.d = c0383v;
                c0380s.f4213j = 2;
                if (c0383v.d(c0380s) == enumC0088a) {
                    return enumC0088a;
                }
                c0383v2 = c0383v;
                c0383v2.getClass();
                long epochDay2 = LocalDate.now().toEpochDay();
                c0380s.d = c0383v2;
                c0380s.f4212g = epochDay2;
                c0380s.f4213j = 3;
                obj = c0383v2.f4224a.b(c0380s);
                if (obj == enumC0088a) {
                }
            }
        }
        c0380s = new C0380s(this, abstractC0095c);
        obj = c0380s.h;
        enumC0088a = EnumC0088a.f2060a;
        i = c0380s.f4213j;
        if (i != 0) {
        }
        c0380s.d = c0383v;
        c0380s.f4213j = 2;
        if (c0383v.d(c0380s) == enumC0088a) {
        }
        c0383v2 = c0383v;
        c0383v2.getClass();
        long epochDay22 = LocalDate.now().toEpochDay();
        c0380s.d = c0383v2;
        c0380s.f4212g = epochDay22;
        c0380s.f4213j = 3;
        obj = c0383v2.f4224a.b(c0380s);
        if (obj == enumC0088a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0104 -> B:23:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC0095c abstractC0095c) {
        C0381t c0381t;
        Object obj;
        EnumC0088a enumC0088a;
        int i;
        C0383v c0383v;
        C0386y c0386y;
        long j2;
        long j3;
        int i2;
        C0383v c0383v2;
        int i3;
        long j4;
        C0386y c0386y2;
        int i4;
        int i5;
        if (abstractC0095c instanceof C0381t) {
            c0381t = (C0381t) abstractC0095c;
            int i6 = c0381t.f4220m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0381t.f4220m = i6 - Integer.MIN_VALUE;
                obj = c0381t.f4218k;
                enumC0088a = EnumC0088a.f2060a;
                i = c0381t.f4220m;
                if (i != 0) {
                    H1.l.h0(obj);
                    c0381t.d = this;
                    c0381t.f4220m = 1;
                    if (b(c0381t) == enumC0088a) {
                        return enumC0088a;
                    }
                    c0383v = this;
                } else if (i == 1) {
                    c0383v = c0381t.d;
                    H1.l.h0(obj);
                } else if (i == 2) {
                    c0383v = c0381t.d;
                    H1.l.h0(obj);
                    c0386y = (C0386y) obj;
                    if (c0386y == null) {
                        c0386y = new C0386y();
                    }
                    c0383v.getClass();
                    long epochDay = LocalDate.now().toEpochDay();
                    j2 = c0386y.f4236e;
                    if (j2 == 0) {
                        C0386y a2 = C0386y.a(c0386y, 0, 0, 0L, epochDay, 0, RecyclerView.f1937A0, 111);
                        c0381t.d = null;
                        c0381t.f4220m = 3;
                        C0385x c0385x = c0383v.f4226c;
                        c0385x.getClass();
                        if (h0.e.b((FortuneQuestDatabase_Impl) c0385x.f4231b, new CallableC0363b(c0385x, 2, a2), c0381t) == enumC0088a) {
                            return enumC0088a;
                        }
                        return Boolean.FALSE;
                    }
                    if (epochDay <= j2) {
                        return Boolean.FALSE;
                    }
                    int i7 = c0386y.f4234b;
                    j3 = j2 + 1;
                    i2 = c0386y.f4237f;
                    c0383v2 = c0383v;
                    i3 = i7;
                    j4 = epochDay;
                    c0386y2 = c0386y;
                    i4 = 0;
                    if (j3 >= j4) {
                    }
                } else {
                    if (i == 3) {
                        H1.l.h0(obj);
                        return Boolean.FALSE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = c0381t.h;
                        H1.l.h0(obj);
                        return Boolean.valueOf(i5 == 0);
                    }
                    j3 = c0381t.f4216g;
                    int i8 = c0381t.f4217j;
                    int i9 = c0381t.i;
                    int i10 = c0381t.h;
                    long j5 = c0381t.f4215f;
                    C0386y c0386y3 = c0381t.f4214e;
                    C0383v c0383v3 = c0381t.d;
                    H1.l.h0(obj);
                    C0383v c0383v4 = c0383v3;
                    int i11 = i8;
                    c0386y2 = c0386y3;
                    i2 = i9;
                    if (!((Boolean) obj).booleanValue()) {
                        if (i2 > 0) {
                            i2--;
                        } else {
                            i4 = 1;
                            i10 = 0;
                            j3++;
                            c0383v2 = c0383v4;
                            j4 = j5;
                            i3 = i10;
                            if (j3 >= j4) {
                                C0385x c0385x2 = c0383v2.f4226c;
                                C0386y a3 = C0386y.a(c0386y2, i3, 0, 0L, j4, i2, Math.min(3.0f, (i3 * 0.1f) + 1.0f), 13);
                                c0381t.d = null;
                                c0381t.f4214e = null;
                                c0381t.h = i4;
                                c0381t.f4220m = 5;
                                c0385x2.getClass();
                                if (h0.e.b((FortuneQuestDatabase_Impl) c0385x2.f4231b, new CallableC0363b(c0385x2, 2, a3), c0381t) == enumC0088a) {
                                    return enumC0088a;
                                }
                                i5 = i4;
                                return Boolean.valueOf(i5 == 0);
                            }
                            c0381t.d = c0383v2;
                            c0381t.f4214e = c0386y2;
                            c0381t.f4215f = j4;
                            c0381t.h = i3;
                            c0381t.i = i2;
                            c0381t.f4217j = i4;
                            c0381t.f4216g = j3;
                            c0381t.f4220m = 4;
                            Object e2 = c0383v2.e(j3, c0381t);
                            if (e2 == enumC0088a) {
                                return enumC0088a;
                            }
                            C0383v c0383v5 = c0383v2;
                            i11 = i4;
                            obj = e2;
                            i10 = i3;
                            j5 = j4;
                            c0383v4 = c0383v5;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    i4 = i11;
                    j3++;
                    c0383v2 = c0383v4;
                    j4 = j5;
                    i3 = i10;
                    if (j3 >= j4) {
                    }
                }
                C0385x c0385x3 = c0383v.f4226c;
                c0381t.d = c0383v;
                c0381t.f4220m = 2;
                obj = c0385x3.u(c0381t);
                if (obj == enumC0088a) {
                    return enumC0088a;
                }
                c0386y = (C0386y) obj;
                if (c0386y == null) {
                }
                c0383v.getClass();
                long epochDay2 = LocalDate.now().toEpochDay();
                j2 = c0386y.f4236e;
                if (j2 == 0) {
                }
            }
        }
        c0381t = new C0381t(this, abstractC0095c);
        obj = c0381t.f4218k;
        enumC0088a = EnumC0088a.f2060a;
        i = c0381t.f4220m;
        if (i != 0) {
        }
        C0385x c0385x32 = c0383v.f4226c;
        c0381t.d = c0383v;
        c0381t.f4220m = 2;
        obj = c0385x32.u(c0381t);
        if (obj == enumC0088a) {
        }
        c0386y = (C0386y) obj;
        if (c0386y == null) {
        }
        c0383v.getClass();
        long epochDay22 = LocalDate.now().toEpochDay();
        j2 = c0386y.f4236e;
        if (j2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j2, AbstractC0095c abstractC0095c) {
        C0382u c0382u;
        int i;
        C0383v c0383v;
        List list;
        List list2;
        if (abstractC0095c instanceof C0382u) {
            c0382u = (C0382u) abstractC0095c;
            int i2 = c0382u.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0382u.h = i2 - Integer.MIN_VALUE;
                Object obj = c0382u.f4222f;
                EnumC0088a enumC0088a = EnumC0088a.f2060a;
                i = c0382u.h;
                if (i != 0) {
                    H1.l.h0(obj);
                    c0382u.d = this;
                    c0382u.f4221e = j2;
                    c0382u.h = 1;
                    obj = this.f4224a.b(c0382u);
                    if (obj == enumC0088a) {
                        return enumC0088a;
                    }
                    c0383v = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) c0382u.d;
                        H1.l.h0(obj);
                        return Boolean.valueOf(((List) obj).size() >= list2.size());
                    }
                    j2 = c0382u.f4221e;
                    c0383v = (C0383v) c0382u.d;
                    H1.l.h0(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return Boolean.TRUE;
                }
                C0365d c0365d = c0383v.f4225b;
                c0382u.d = list;
                c0382u.h = 2;
                Object b2 = c0365d.b(j2, c0382u);
                if (b2 == enumC0088a) {
                    return enumC0088a;
                }
                obj = b2;
                list2 = list;
                return Boolean.valueOf(((List) obj).size() >= list2.size());
            }
        }
        c0382u = new C0382u(this, abstractC0095c);
        Object obj2 = c0382u.f4222f;
        EnumC0088a enumC0088a2 = EnumC0088a.f2060a;
        i = c0382u.h;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }
}
