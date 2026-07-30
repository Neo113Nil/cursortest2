package g3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f4148g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f4149h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4150i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4151j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f4152k;

    /* renamed from: l, reason: collision with root package name */
    public int f4153l;

    /* renamed from: m, reason: collision with root package name */
    public int f4154m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f4155n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f4156o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a0 a0Var, k kVar, h6.d dVar) {
        super(1, dVar);
        this.f4155n = a0Var;
        this.f4156o = kVar;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new j(this.f4155n, this.f4156o, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        return ((j) create((h6.d) obj)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0102, code lost:
    
        if (r14 != r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k7.a cVar;
        r6.r rVar;
        r6.v vVar;
        r6.v vVar2;
        Iterator it;
        k7.a aVar;
        r6.r rVar2;
        r6.v vVar3;
        i iVar;
        k7.c cVar2;
        r6.v vVar4;
        r6.r rVar3;
        Object obj2;
        Object obj3;
        int hashCode;
        int i7 = this.f4154m;
        k kVar = this.f4156o;
        a0 a0Var = this.f4155n;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 == 0) {
            d6.a.e(obj);
            cVar = new k7.c();
            rVar = new r6.r();
            vVar = new r6.v();
            this.f4148g = cVar;
            this.f4149h = rVar;
            this.f4150i = vVar;
            this.f4151j = vVar;
            this.f4154m = 1;
            obj = a0.c(a0Var, true, this);
            if (obj != aVar2) {
                vVar2 = vVar;
            }
            return aVar2;
        }
        if (i7 == 1) {
            vVar = (r6.v) this.f4151j;
            vVar2 = (r6.v) this.f4150i;
            rVar = (r6.r) this.f4149h;
            cVar = (k7.a) this.f4148g;
            d6.a.e(obj);
        } else {
            if (i7 == 2) {
                it = this.f4152k;
                iVar = (i) this.f4151j;
                vVar3 = (r6.v) this.f4150i;
                rVar2 = (r6.r) this.f4149h;
                aVar = (k7.a) this.f4148g;
                d6.a.e(obj);
                while (it.hasNext()) {
                    q6.e eVar = (q6.e) it.next();
                    this.f4148g = aVar;
                    this.f4149h = rVar2;
                    this.f4150i = vVar3;
                    this.f4151j = iVar;
                    this.f4152k = it;
                    this.f4154m = 2;
                    if (eVar.d(iVar, this) == aVar2) {
                        break;
                    }
                }
                vVar2 = vVar3;
                rVar = rVar2;
                cVar = aVar;
                kVar.f4162i = null;
                this.f4148g = rVar;
                this.f4149h = vVar2;
                this.f4150i = cVar;
                this.f4151j = null;
                this.f4152k = null;
                this.f4154m = 3;
                cVar2 = (k7.c) cVar;
                if (cVar2.c(this) != aVar2) {
                    vVar4 = vVar2;
                    rVar3 = rVar;
                    obj2 = cVar2;
                    rVar3.f7964f = true;
                    ((k7.c) obj2).e(null);
                    obj3 = vVar4.f7968f;
                    hashCode = obj3 == null ? obj3.hashCode() : 0;
                    h0 e9 = a0Var.e();
                    this.f4148g = obj3;
                    this.f4149h = null;
                    this.f4150i = null;
                    this.f4153l = hashCode;
                    this.f4154m = 4;
                    obj = e9.a();
                }
                return aVar2;
            }
            if (i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hashCode = this.f4153l;
                obj3 = this.f4148g;
                d6.a.e(obj);
                return new c(hashCode, ((Number) obj).intValue(), obj3);
            }
            Object obj4 = (k7.a) this.f4150i;
            vVar4 = (r6.v) this.f4149h;
            rVar3 = (r6.r) this.f4148g;
            d6.a.e(obj);
            obj2 = obj4;
            try {
                rVar3.f7964f = true;
                ((k7.c) obj2).e(null);
                obj3 = vVar4.f7968f;
                hashCode = obj3 == null ? obj3.hashCode() : 0;
                h0 e92 = a0Var.e();
                this.f4148g = obj3;
                this.f4149h = null;
                this.f4150i = null;
                this.f4153l = hashCode;
                this.f4154m = 4;
                obj = e92.a();
            } catch (Throwable th) {
                ((k7.c) obj2).e(null);
                throw th;
            }
        }
        vVar.f7968f = ((c) obj).f4101b;
        i iVar2 = new i(cVar, rVar, vVar2, a0Var);
        List list = (List) kVar.f4162i;
        if (list != null) {
            it = list.iterator();
            aVar = cVar;
            rVar2 = rVar;
            vVar3 = vVar2;
            iVar = iVar2;
            while (it.hasNext()) {
            }
            vVar2 = vVar3;
            rVar = rVar2;
            cVar = aVar;
        }
        kVar.f4162i = null;
        this.f4148g = rVar;
        this.f4149h = vVar2;
        this.f4150i = cVar;
        this.f4151j = null;
        this.f4152k = null;
        this.f4154m = 3;
        cVar2 = (k7.c) cVar;
        if (cVar2.c(this) != aVar2) {
        }
        return aVar2;
    }
}
