package y3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public Object f8894h;
    public Serializable i;

    /* renamed from: j, reason: collision with root package name */
    public Object f8895j;

    /* renamed from: k, reason: collision with root package name */
    public Object f8896k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f8897l;

    /* renamed from: m, reason: collision with root package name */
    public int f8898m;

    /* renamed from: n, reason: collision with root package name */
    public int f8899n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f8900o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c5.x f8901p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0 b0Var, c5.x xVar, g6.c cVar) {
        super(1, cVar);
        this.f8900o = b0Var;
        this.f8901p = xVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        return new k(this.f8900o, this.f8901p, (g6.c) obj).p(c6.m.f1757a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r14 != r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        i7.a cVar;
        q6.o oVar;
        q6.s sVar;
        q6.s sVar2;
        Iterator it;
        i7.a aVar;
        q6.o oVar2;
        q6.s sVar3;
        j jVar;
        i7.c cVar2;
        q6.s sVar4;
        q6.o oVar3;
        Object obj2;
        Object obj3;
        int hashCode;
        int i = this.f8899n;
        c5.x xVar = this.f8901p;
        b0 b0Var = this.f8900o;
        h6.a aVar2 = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            cVar = new i7.c();
            oVar = new q6.o();
            sVar = new q6.s();
            this.f8894h = cVar;
            this.i = oVar;
            this.f8895j = sVar;
            this.f8896k = sVar;
            this.f8899n = 1;
            obj = b0.f(b0Var, true, this);
            if (obj != aVar2) {
                sVar2 = sVar;
            }
            return aVar2;
        }
        if (i == 1) {
            sVar = (q6.s) this.f8896k;
            sVar2 = (q6.s) this.f8895j;
            oVar = (q6.o) this.i;
            cVar = (i7.a) this.f8894h;
            s6.a.K(obj);
        } else {
            if (i == 2) {
                it = this.f8897l;
                jVar = (j) this.f8896k;
                sVar3 = (q6.s) this.f8895j;
                oVar2 = (q6.o) this.i;
                aVar = (i7.a) this.f8894h;
                s6.a.K(obj);
                while (it.hasNext()) {
                    p6.e eVar = (p6.e) it.next();
                    this.f8894h = aVar;
                    this.i = oVar2;
                    this.f8895j = sVar3;
                    this.f8896k = jVar;
                    this.f8897l = it;
                    this.f8899n = 2;
                    if (eVar.g(jVar, this) == aVar2) {
                        break;
                    }
                }
                sVar2 = sVar3;
                oVar = oVar2;
                cVar = aVar;
                xVar.f1739f = null;
                this.f8894h = oVar;
                this.i = sVar2;
                this.f8895j = cVar;
                this.f8896k = null;
                this.f8897l = null;
                this.f8899n = 3;
                cVar2 = (i7.c) cVar;
                if (cVar2.d(this) != aVar2) {
                    sVar4 = sVar2;
                    oVar3 = oVar;
                    obj2 = cVar2;
                    oVar3.f6201d = true;
                    ((i7.c) obj2).f(null);
                    obj3 = sVar4.f6205d;
                    hashCode = obj3 == null ? obj3.hashCode() : 0;
                    r0 g3 = b0Var.g();
                    this.f8894h = obj3;
                    this.i = null;
                    this.f8895j = null;
                    this.f8898m = hashCode;
                    this.f8899n = 4;
                    obj = g3.a();
                }
                return aVar2;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashCode = this.f8898m;
                obj3 = this.f8894h;
                s6.a.K(obj);
                return new c(hashCode, ((Number) obj).intValue(), obj3);
            }
            Object obj4 = (i7.a) this.f8895j;
            sVar4 = (q6.s) this.i;
            oVar3 = (q6.o) this.f8894h;
            s6.a.K(obj);
            obj2 = obj4;
            try {
                oVar3.f6201d = true;
                ((i7.c) obj2).f(null);
                obj3 = sVar4.f6205d;
                hashCode = obj3 == null ? obj3.hashCode() : 0;
                r0 g32 = b0Var.g();
                this.f8894h = obj3;
                this.i = null;
                this.f8895j = null;
                this.f8898m = hashCode;
                this.f8899n = 4;
                obj = g32.a();
            } catch (Throwable th) {
                ((i7.c) obj2).f(null);
                throw th;
            }
        }
        sVar.f6205d = ((c) obj).f8850b;
        j jVar2 = new j(cVar, oVar, sVar2, b0Var);
        List list = (List) xVar.f1739f;
        if (list != null) {
            it = list.iterator();
            aVar = cVar;
            oVar2 = oVar;
            sVar3 = sVar2;
            jVar = jVar2;
            while (it.hasNext()) {
            }
            sVar2 = sVar3;
            oVar = oVar2;
            cVar = aVar;
        }
        xVar.f1739f = null;
        this.f8894h = oVar;
        this.i = sVar2;
        this.f8895j = cVar;
        this.f8896k = null;
        this.f8897l = null;
        this.f8899n = 3;
        cVar2 = (i7.c) cVar;
        if (cVar2.d(this) != aVar2) {
        }
        return aVar2;
    }
}
