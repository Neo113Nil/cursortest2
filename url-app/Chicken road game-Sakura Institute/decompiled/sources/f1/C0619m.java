package f1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619m extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public Object f6598k;

    /* renamed from: l, reason: collision with root package name */
    public Serializable f6599l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6600m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6601n;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f6602o;

    /* renamed from: p, reason: collision with root package name */
    public int f6603p;

    /* renamed from: q, reason: collision with root package name */
    public int f6604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f6605r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y0.b f6606s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619m(N n2, Y0.b bVar, C2.a aVar) {
        super(1, aVar);
        this.f6605r = n2;
        this.f6606s = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0619m(this.f6605r, this.f6606s, (C2.a) obj).l(Unit.f7487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        e3.a a4;
        M2.A a5;
        M2.E e4;
        M2.E e5;
        Iterator it;
        e3.a aVar;
        M2.A a6;
        M2.E e6;
        C0618l c0618l;
        e3.c cVar;
        M2.E e7;
        M2.A a7;
        Object obj2;
        Object obj3;
        Integer a8;
        int i2;
        D2.a aVar2 = D2.a.f2163d;
        int i4 = this.f6604q;
        Y0.b bVar = this.f6606s;
        N n2 = this.f6605r;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            a4 = e3.d.a();
            a5 = new M2.A();
            e4 = new M2.E();
            this.f6598k = a4;
            this.f6599l = a5;
            this.f6600m = e4;
            this.f6601n = e4;
            this.f6604q = 1;
            obj = N.c(n2, true, this);
            if (obj == aVar2) {
                return aVar2;
            }
            e5 = e4;
        } else if (i4 == 1) {
            e4 = (M2.E) this.f6601n;
            e5 = (M2.E) this.f6600m;
            a5 = (M2.A) this.f6599l;
            a4 = (e3.a) this.f6598k;
            AbstractC1343r.b(obj);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f6603p;
                    obj3 = this.f6598k;
                    AbstractC1343r.b(obj);
                    return new C0610d(i2, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (e3.a) this.f6600m;
                e7 = (M2.E) this.f6599l;
                a7 = (M2.A) this.f6598k;
                AbstractC1343r.b(obj);
                obj2 = obj4;
                try {
                    a7.f3576d = true;
                    Unit unit = Unit.f7487a;
                    ((e3.c) obj2).e(null);
                    obj3 = e7.f3580d;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    X e8 = n2.e();
                    this.f6598k = obj3;
                    this.f6599l = null;
                    this.f6600m = null;
                    this.f6603p = hashCode;
                    this.f6604q = 4;
                    a8 = e8.a();
                    if (a8 != aVar2) {
                        return aVar2;
                    }
                    i2 = hashCode;
                    obj = a8;
                    return new C0610d(i2, ((Number) obj).intValue(), obj3);
                } catch (Throwable th) {
                    ((e3.c) obj2).e(null);
                    throw th;
                }
            }
            it = this.f6602o;
            c0618l = (C0618l) this.f6601n;
            e6 = (M2.E) this.f6600m;
            a6 = (M2.A) this.f6599l;
            aVar = (e3.a) this.f6598k;
            AbstractC1343r.b(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f6598k = aVar;
                this.f6599l = a6;
                this.f6600m = e6;
                this.f6601n = c0618l;
                this.f6602o = it;
                this.f6604q = 2;
                if (function2.h(c0618l, this) == aVar2) {
                    return aVar2;
                }
            }
            e5 = e6;
            a5 = a6;
            a4 = aVar;
            bVar.f4389e = null;
            this.f6598k = a5;
            this.f6599l = e5;
            this.f6600m = a4;
            this.f6601n = null;
            this.f6602o = null;
            this.f6604q = 3;
            cVar = (e3.c) a4;
            if (cVar.c(null, this) != aVar2) {
                return aVar2;
            }
            e7 = e5;
            a7 = a5;
            obj2 = cVar;
            a7.f3576d = true;
            Unit unit2 = Unit.f7487a;
            ((e3.c) obj2).e(null);
            obj3 = e7.f3580d;
            if (obj3 == null) {
            }
            X e82 = n2.e();
            this.f6598k = obj3;
            this.f6599l = null;
            this.f6600m = null;
            this.f6603p = hashCode;
            this.f6604q = 4;
            a8 = e82.a();
            if (a8 != aVar2) {
            }
        }
        e4.f3580d = ((C0610d) obj).f6566b;
        C0618l c0618l2 = new C0618l(a4, a5, e5, n2);
        List list = (List) bVar.f4389e;
        if (list != null) {
            it = list.iterator();
            aVar = a4;
            a6 = a5;
            e6 = e5;
            c0618l = c0618l2;
            while (it.hasNext()) {
            }
            e5 = e6;
            a5 = a6;
            a4 = aVar;
        }
        bVar.f4389e = null;
        this.f6598k = a5;
        this.f6599l = e5;
        this.f6600m = a4;
        this.f6601n = null;
        this.f6602o = null;
        this.f6604q = 3;
        cVar = (e3.c) a4;
        if (cVar.c(null, this) != aVar2) {
        }
    }
}
