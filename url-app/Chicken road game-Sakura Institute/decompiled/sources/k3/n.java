package k3;

import e2.C0559a;
import kotlin.Unit;
import y2.AbstractC1327b;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class n extends E2.i implements L2.c {

    /* renamed from: i, reason: collision with root package name */
    public int f7454i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ AbstractC1327b f7455j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f7456k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, C2.a aVar) {
        super(3, aVar);
        this.f7456k = pVar;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f7456k, (C2.a) obj3);
        nVar.f7455j = (AbstractC1327b) obj;
        return nVar.l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7454i;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            AbstractC1327b abstractC1327b = this.f7455j;
            p pVar = this.f7456k;
            byte y4 = ((C0559a) pVar.f7467d).y();
            if (y4 == 1) {
                return pVar.e(true);
            }
            if (y4 == 0) {
                return pVar.e(false);
            }
            if (y4 != 6) {
                if (y4 == 8) {
                    return pVar.d();
                }
                C0559a.o((C0559a) pVar.f7467d, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f7454i = 1;
            obj = p.a(pVar, abstractC1327b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return (j3.m) obj;
    }
}
