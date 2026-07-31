package x;

import e2.InterfaceC0426e;
import n0.C0700A;
import n0.C0711i;
import n0.EnumC0712j;
import p.U0;

/* loaded from: classes.dex */
public final class W extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public n0.s f10011f;

    /* renamed from: g, reason: collision with root package name */
    public int f10012g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10013h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f10014i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Z z3, V1.d dVar) {
        super(2, dVar);
        this.f10014i = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((W) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        W w2 = new W(this.f10014i, dVar);
        w2.f10013h = obj;
        return w2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0700A c0700a;
        C0700A c0700a2;
        n0.s sVar;
        int size;
        int i3;
        W1.a aVar = W1.a.f4608d;
        int i4 = this.f10012g;
        Z z3 = this.f10014i;
        if (i4 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f10013h;
            this.f10013h = c0700a;
            this.f10012g = 1;
            obj = U0.b(c0700a, (r3 & 1) != 0, EnumC0712j.f7296e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f10011f;
                c0700a2 = (C0700A) this.f10013h;
                R1.a.e(obj);
                ?? r13 = ((C0711i) obj).f7292a;
                size = r13.size();
                i3 = 0;
                while (i3 < size) {
                    n0.s sVar2 = (n0.s) r13.get(i3);
                    if (n0.r.a(sVar2.f7308a, sVar.f7308a) && sVar2.f7311d) {
                        this.f10013h = c0700a2;
                        this.f10011f = sVar;
                        this.f10012g = 2;
                        obj = c0700a2.b(EnumC0712j.f7296e, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        ?? r132 = ((C0711i) obj).f7292a;
                        size = r132.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                    } else {
                        i3++;
                    }
                }
                z3.b();
                return R1.y.f4171a;
            }
            c0700a = (C0700A) this.f10013h;
            R1.a.e(obj);
        }
        n0.s sVar3 = (n0.s) obj;
        long j3 = sVar3.f7310c;
        z3.e();
        c0700a2 = c0700a;
        sVar = sVar3;
        this.f10013h = c0700a2;
        this.f10011f = sVar;
        this.f10012g = 2;
        obj = c0700a2.b(EnumC0712j.f7296e, this);
        if (obj == aVar) {
        }
        ?? r1322 = ((C0711i) obj).f7292a;
        size = r1322.size();
        i3 = 0;
        while (i3 < size) {
        }
        z3.b();
        return R1.y.f4171a;
    }
}
