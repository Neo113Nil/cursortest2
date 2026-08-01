package e5;

import a4.l;
import b5.c0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import z4.d0;
import z4.e0;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public d0 f3872d;

    /* renamed from: e, reason: collision with root package name */
    public int f3873e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3874i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3875r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f3876s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1.d f3877t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, u uVar, ld.a aVar, a1.d dVar) {
        super(2, aVar);
        this.f3875r = z10;
        this.f3876s = uVar;
        this.f3877t = dVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        a aVar2 = new a(this.f3875r, this.f3876s, aVar, this.f3877t);
        aVar2.f3874i = obj;
        return aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((e0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r10 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ac  */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        e0 e0Var;
        d0 d0Var2;
        e0 e0Var2;
        e0 e0Var3;
        Object obj2;
        md.a aVar = md.a.f6622d;
        int i3 = this.f3873e;
        a1.d dVar = this.f3877t;
        u uVar = this.f3876s;
        if (i3 == 0) {
            cf.c.M(obj);
            e0 e0Var4 = (e0) this.f3874i;
            if (!this.f3875r) {
                e0Var4.getClass();
                return dVar.invoke(((c0) e0Var4).b());
            }
            d0Var = d0.f10733e;
            this.f3874i = e0Var4;
            this.f3872d = d0Var;
            this.f3873e = 1;
            Boolean a9 = e0Var4.a(this);
            if (a9 != aVar) {
                e0Var = e0Var4;
                obj = a9;
            }
            return aVar;
        }
        if (i3 == 1) {
            d0Var = this.f3872d;
            e0Var = (e0) this.f3874i;
            cf.c.M(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f3874i;
                    cf.c.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        z4.f j = uVar.j();
                        j.f10737b.e(j.f10740e, j.f10741f);
                    }
                    return obj2;
                }
                e0Var2 = (e0) this.f3874i;
                cf.c.M(obj);
                this.f3874i = obj;
                this.f3873e = 4;
                Boolean a10 = e0Var2.a(this);
                if (a10 != aVar) {
                    obj2 = obj;
                    obj = a10;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return aVar;
            }
            d0Var = this.f3872d;
            e0Var3 = (e0) this.f3874i;
            cf.c.M(obj);
            d0Var2 = d0Var;
            e0Var2 = e0Var3;
            l lVar = new l((ld.a) null, dVar);
            this.f3874i = e0Var2;
            this.f3872d = null;
            this.f3873e = 3;
            obj = e0Var2.d(d0Var2, lVar, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            z4.f j3 = uVar.j();
            this.f3874i = e0Var;
            this.f3872d = d0Var;
            this.f3873e = 2;
            Object f3 = j3.f10737b.f(this);
            if (f3 != aVar) {
                f3 = Unit.f5554a;
            }
            if (f3 != aVar) {
                e0Var3 = e0Var;
                d0Var2 = d0Var;
                e0Var2 = e0Var3;
                l lVar2 = new l((ld.a) null, dVar);
                this.f3874i = e0Var2;
                this.f3872d = null;
                this.f3873e = 3;
                obj = e0Var2.d(d0Var2, lVar2, this);
            }
            return aVar;
        }
        d0Var2 = d0Var;
        e0Var2 = e0Var;
        l lVar22 = new l((ld.a) null, dVar);
        this.f3874i = e0Var2;
        this.f3872d = null;
        this.f3873e = 3;
        obj = e0Var2.d(d0Var2, lVar22, this);
    }
}
