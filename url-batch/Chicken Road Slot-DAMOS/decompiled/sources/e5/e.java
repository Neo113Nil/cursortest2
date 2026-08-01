package e5;

import b5.c0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z4.d0;
import z4.e0;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public d0 f3892d;

    /* renamed from: e, reason: collision with root package name */
    public int f3893e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3894i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f3897t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f3898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function1 function1, ld.a aVar, u uVar, boolean z10, boolean z11) {
        super(2, aVar);
        this.f3895r = z10;
        this.f3896s = z11;
        this.f3897t = uVar;
        this.f3898u = function1;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        e eVar = new e(this.f3898u, aVar, this.f3897t, this.f3895r, this.f3896s);
        eVar.f3894i = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((e0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r11 != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
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
        int i3 = this.f3893e;
        Function1 function1 = this.f3898u;
        u uVar = this.f3897t;
        boolean z10 = this.f3896s;
        if (i3 == 0) {
            cf.c.M(obj);
            e0 e0Var4 = (e0) this.f3894i;
            if (!this.f3895r) {
                e0Var4.getClass();
                return function1.invoke(((c0) e0Var4).b());
            }
            d0Var = z10 ? d0.f10732d : d0.f10733e;
            if (!z10) {
                this.f3894i = e0Var4;
                this.f3892d = d0Var;
                this.f3893e = 1;
                Boolean a9 = e0Var4.a(this);
                if (a9 != aVar) {
                    e0Var2 = e0Var4;
                    obj = a9;
                }
                return aVar;
            }
            d0 d0Var3 = d0Var;
            e0Var = e0Var4;
            d0Var2 = d0Var3;
            d dVar = new d((ld.a) null, function1);
            this.f3894i = e0Var;
            this.f3892d = null;
            this.f3893e = 3;
            obj = e0Var.d(d0Var2, dVar, this);
        } else if (i3 == 1) {
            d0Var = this.f3892d;
            e0Var2 = (e0) this.f3894i;
            cf.c.M(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f3894i;
                    cf.c.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        z4.f j = uVar.j();
                        j.f10737b.e(j.f10740e, j.f10741f);
                    }
                    return obj2;
                }
                e0Var = (e0) this.f3894i;
                cf.c.M(obj);
                if (z10) {
                    return obj;
                }
                this.f3894i = obj;
                this.f3893e = 4;
                Boolean a10 = e0Var.a(this);
                if (a10 != aVar) {
                    obj2 = obj;
                    obj = a10;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return aVar;
            }
            d0Var = this.f3892d;
            e0Var3 = (e0) this.f3894i;
            cf.c.M(obj);
            d0Var2 = d0Var;
            e0Var = e0Var3;
            d dVar2 = new d((ld.a) null, function1);
            this.f3894i = e0Var;
            this.f3892d = null;
            this.f3893e = 3;
            obj = e0Var.d(d0Var2, dVar2, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            z4.f j3 = uVar.j();
            this.f3894i = e0Var2;
            this.f3892d = d0Var;
            this.f3893e = 2;
            Object f3 = j3.f10737b.f(this);
            if (f3 != aVar) {
                f3 = Unit.f5554a;
            }
            if (f3 != aVar) {
                e0Var3 = e0Var2;
                d0Var2 = d0Var;
                e0Var = e0Var3;
                d dVar22 = new d((ld.a) null, function1);
                this.f3894i = e0Var;
                this.f3892d = null;
                this.f3893e = 3;
                obj = e0Var.d(d0Var2, dVar22, this);
            }
            return aVar;
        }
        d0Var2 = d0Var;
        e0Var = e0Var2;
        d dVar222 = new d((ld.a) null, function1);
        this.f3894i = e0Var;
        this.f3892d = null;
        this.f3893e = 3;
        obj = e0Var.d(d0Var2, dVar222, this);
    }
}
