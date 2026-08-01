package x3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public Object f10392d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f10393e;

    /* renamed from: i, reason: collision with root package name */
    public Object f10394i;

    /* renamed from: r, reason: collision with root package name */
    public Object f10395r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f10396s;

    /* renamed from: t, reason: collision with root package name */
    public int f10397t;

    /* renamed from: u, reason: collision with root package name */
    public int f10398u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f10399v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c6.n f10400w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, c6.n nVar, ld.a aVar) {
        super(1, aVar);
        this.f10399v = zVar;
        this.f10400w = nVar;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        return new k(this.f10399v, this.f10400w, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k) create((ld.a) obj)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oe.a cVar;
        wd.z zVar;
        wd.b0 b0Var;
        wd.b0 b0Var2;
        oe.a aVar;
        Iterator it;
        oe.a aVar2;
        wd.z zVar2;
        wd.b0 b0Var3;
        j jVar;
        wd.b0 b0Var4;
        wd.z zVar3;
        Object obj2;
        Integer a9;
        int i3;
        md.a aVar3 = md.a.f6622d;
        int i10 = this.f10398u;
        c6.n nVar = this.f10400w;
        z zVar4 = this.f10399v;
        if (i10 == 0) {
            cf.c.M(obj);
            cVar = new oe.c();
            zVar = new wd.z();
            b0Var = new wd.b0();
            this.f10392d = cVar;
            this.f10393e = zVar;
            this.f10394i = b0Var;
            this.f10395r = b0Var;
            this.f10398u = 1;
            obj = z.g(zVar4, true, this);
            if (obj != aVar3) {
                b0Var2 = b0Var;
            }
            return aVar3;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.f10397t;
                    obj2 = this.f10392d;
                    cf.c.M(obj);
                    return new c(i3, ((Number) obj).intValue(), obj2);
                }
                aVar = (oe.a) this.f10394i;
                b0Var4 = (wd.b0) this.f10393e;
                zVar3 = (wd.z) this.f10392d;
                cf.c.M(obj);
                try {
                    zVar3.f10164d = true;
                    aVar.d(null);
                    obj2 = b0Var4.f10141d;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    s0 i11 = zVar4.i();
                    this.f10392d = obj2;
                    this.f10393e = null;
                    this.f10394i = null;
                    this.f10397t = hashCode;
                    this.f10398u = 4;
                    a9 = i11.a();
                    if (a9 != aVar3) {
                        i3 = hashCode;
                        obj = a9;
                        return new c(i3, ((Number) obj).intValue(), obj2);
                    }
                    return aVar3;
                } catch (Throwable th) {
                    aVar.d(null);
                    throw th;
                }
            }
            it = this.f10396s;
            jVar = (j) this.f10395r;
            b0Var3 = (wd.b0) this.f10394i;
            zVar2 = (wd.z) this.f10393e;
            aVar2 = (oe.a) this.f10392d;
            cf.c.M(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f10392d = aVar2;
                this.f10393e = zVar2;
                this.f10394i = b0Var3;
                this.f10395r = jVar;
                this.f10396s = it;
                this.f10398u = 2;
                if (function2.invoke(jVar, this) == aVar3) {
                    break;
                }
            }
            b0Var2 = b0Var3;
            zVar = zVar2;
            aVar = aVar2;
            nVar.f1835i = null;
            this.f10392d = zVar;
            this.f10393e = b0Var2;
            this.f10394i = aVar;
            this.f10395r = null;
            this.f10396s = null;
            this.f10398u = 3;
            if (aVar.a(this) != aVar3) {
                b0Var4 = b0Var2;
                zVar3 = zVar;
                zVar3.f10164d = true;
                aVar.d(null);
                obj2 = b0Var4.f10141d;
                if (obj2 == null) {
                }
                s0 i112 = zVar4.i();
                this.f10392d = obj2;
                this.f10393e = null;
                this.f10394i = null;
                this.f10397t = hashCode;
                this.f10398u = 4;
                a9 = i112.a();
                if (a9 != aVar3) {
                }
            }
            return aVar3;
        }
        b0Var = (wd.b0) this.f10395r;
        b0Var2 = (wd.b0) this.f10394i;
        zVar = (wd.z) this.f10393e;
        cVar = (oe.a) this.f10392d;
        cf.c.M(obj);
        b0Var.f10141d = ((c) obj).f10341b;
        j jVar2 = new j(cVar, zVar, b0Var2, zVar4);
        List list = (List) nVar.f1835i;
        if (list == null) {
            aVar = cVar;
            nVar.f1835i = null;
            this.f10392d = zVar;
            this.f10393e = b0Var2;
            this.f10394i = aVar;
            this.f10395r = null;
            this.f10396s = null;
            this.f10398u = 3;
            if (aVar.a(this) != aVar3) {
            }
            return aVar3;
        }
        it = list.iterator();
        aVar2 = cVar;
        zVar2 = zVar;
        b0Var3 = b0Var2;
        jVar = jVar2;
        while (it.hasNext()) {
        }
        b0Var2 = b0Var3;
        zVar = zVar2;
        aVar = aVar2;
        nVar.f1835i = null;
        this.f10392d = zVar;
        this.f10393e = b0Var2;
        this.f10394i = aVar;
        this.f10395r = null;
        this.f10396s = null;
        this.f10398u = 3;
        if (aVar.a(this) != aVar3) {
        }
        return aVar3;
    }
}
