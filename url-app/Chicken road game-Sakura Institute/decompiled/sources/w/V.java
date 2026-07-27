package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.C0811i;
import l0.EnumC0812j;
import o.R0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class V extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public l0.s f11090i;

    /* renamed from: j, reason: collision with root package name */
    public int f11091j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11092k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f11093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y4, C2.a aVar) {
        super(2, aVar);
        this.f11093l = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((V) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        V v4 = new V(this.f11093l, aVar);
        v4.f11092k = obj;
        return v4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        C0800A c0800a2;
        l0.s sVar;
        int size;
        int i2;
        D2.a aVar = D2.a.f2163d;
        int i4 = this.f11091j;
        Y y4 = this.f11093l;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f11092k;
            this.f11092k = c0800a;
            this.f11091j = 1;
            obj = R0.b(c0800a, (r3 & 1) != 0, EnumC0812j.f7911e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f11090i;
                c0800a2 = (C0800A) this.f11092k;
                AbstractC1343r.b(obj);
                ?? r13 = ((C0811i) obj).f7907a;
                size = r13.size();
                i2 = 0;
                while (i2 < size) {
                    l0.s sVar2 = (l0.s) r13.get(i2);
                    if (l0.r.a(sVar2.f7923a, sVar.f7923a) && sVar2.f7926d) {
                        this.f11092k = c0800a2;
                        this.f11090i = sVar;
                        this.f11091j = 2;
                        obj = c0800a2.a(EnumC0812j.f7911e, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        ?? r132 = ((C0811i) obj).f7907a;
                        size = r132.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                y4.b();
                return Unit.f7487a;
            }
            c0800a = (C0800A) this.f11092k;
            AbstractC1343r.b(obj);
        }
        l0.s sVar3 = (l0.s) obj;
        long j4 = sVar3.f7925c;
        y4.e();
        c0800a2 = c0800a;
        sVar = sVar3;
        this.f11092k = c0800a2;
        this.f11090i = sVar;
        this.f11091j = 2;
        obj = c0800a2.a(EnumC0812j.f7911e, this);
        if (obj == aVar) {
        }
        ?? r1322 = ((C0811i) obj).f7907a;
        size = r1322.size();
        i2 = 0;
        while (i2 < size) {
        }
        y4.b();
        return Unit.f7487a;
    }
}
