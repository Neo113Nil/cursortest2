package u;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7130h = 0;
    public q6.s i;

    /* renamed from: j, reason: collision with root package name */
    public q6.s f7131j;

    /* renamed from: k, reason: collision with root package name */
    public int f7132k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7133l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f7134m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q6.s sVar, x0 x0Var, g6.c cVar) {
        super(2, cVar);
        this.f7131j = sVar;
        this.f7134m = x0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7130h) {
            case 0:
                return ((z) l((g6.c) obj2, (p6.c) obj)).p(c6.m.f1757a);
            default:
                return ((z) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f7130h) {
            case 0:
                z zVar = new z(this.f7131j, this.f7134m, cVar);
                zVar.f7133l = obj;
                return zVar;
            default:
                z zVar2 = new z(this.f7134m, cVar);
                zVar2.f7133l = obj;
                return zVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r11 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (u.x0.u0(r2, r10) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (u.x0.u0(r2, r10) != r4) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00d9, B:31:0x00c7], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x014a -> B:63:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014f -> B:64:0x0150). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        p6.c cVar;
        Object obj2;
        a7.u uVar;
        q6.s sVar;
        q6.s sVar2;
        q6.s sVar3;
        a7.u uVar2;
        a7.u uVar3;
        Object f6;
        o oVar;
        Object obj3;
        switch (this.f7130h) {
            case 0:
                q6.s sVar4 = this.f7131j;
                int i = this.f7132k;
                if (i == 0) {
                    s6.a.K(obj);
                    cVar = (p6.c) this.f7133l;
                    obj2 = sVar4.f6205d;
                    if (obj2 instanceof n) {
                    }
                    return c6.m.f1757a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q6.s sVar5 = this.i;
                cVar = (p6.c) this.f7133l;
                s6.a.K(obj);
                o oVar2 = (o) obj;
                sVar5.f6205d = oVar2;
                obj2 = sVar4.f6205d;
                if (!(obj2 instanceof n) || (obj2 instanceof k)) {
                    return c6.m.f1757a;
                }
                oVar2 = null;
                l lVar = obj2 instanceof l ? (l) obj2 : null;
                if (lVar != null) {
                    cVar.i(lVar);
                }
                c7.c cVar2 = this.f7134m.f7124x;
                if (cVar2 == null) {
                    sVar5 = sVar4;
                    sVar5.f6205d = oVar2;
                    obj2 = sVar4.f6205d;
                    if (obj2 instanceof n) {
                    }
                    return c6.m.f1757a;
                }
                this.f7133l = cVar;
                this.i = sVar4;
                this.f7132k = 1;
                obj = cVar2.x(this);
                h6.a aVar = h6.a.f3204d;
                if (obj == aVar) {
                    return aVar;
                }
                sVar5 = sVar4;
                o oVar22 = (o) obj;
                sVar5.f6205d = oVar22;
                obj2 = sVar4.f6205d;
                if (obj2 instanceof n) {
                }
                return c6.m.f1757a;
            default:
                int i8 = this.f7132k;
                c6.m mVar = c6.m.f1757a;
                x0 x0Var = this.f7134m;
                h6.a aVar2 = h6.a.f3204d;
                switch (i8) {
                    case 0:
                        s6.a.K(obj);
                        uVar = (a7.u) this.f7133l;
                        if (a7.x.l(uVar)) {
                            sVar = new q6.s();
                            c7.c cVar3 = x0Var.f7124x;
                            if (cVar3 != null) {
                                this.f7133l = uVar;
                                this.i = sVar;
                                this.f7131j = sVar;
                                this.f7132k = 1;
                                obj = cVar3.x(this);
                                if (obj != aVar2) {
                                    sVar2 = sVar;
                                    oVar = (o) obj;
                                    sVar.f6205d = oVar;
                                    obj3 = sVar2.f6205d;
                                    if (obj3 instanceof m) {
                                        this.f7133l = uVar;
                                        this.i = sVar2;
                                        this.f7131j = null;
                                        this.f7132k = 2;
                                        if (x0.v0(x0Var, (m) obj3, this) != aVar2) {
                                            sVar3 = sVar2;
                                            uVar2 = uVar;
                                            z zVar = new z(sVar3, x0Var, null);
                                            this.f7133l = uVar2;
                                            this.i = sVar3;
                                            this.f7132k = 3;
                                            e1 e1Var = x0Var.H;
                                            f6 = e1Var.f(t.j0.f6795e, new b0.c(zVar, e1Var, null, 14), this);
                                            if (f6 != aVar2) {
                                                f6 = mVar;
                                                break;
                                            }
                                        }
                                    }
                                    if (a7.x.l(uVar)) {
                                        return mVar;
                                    }
                                }
                                return aVar2;
                            }
                            sVar2 = sVar;
                            oVar = null;
                            sVar.f6205d = oVar;
                            obj3 = sVar2.f6205d;
                            if (obj3 instanceof m) {
                            }
                            if (a7.x.l(uVar)) {
                            }
                        }
                        break;
                    case 1:
                        sVar = this.f7131j;
                        sVar2 = this.i;
                        uVar = (a7.u) this.f7133l;
                        s6.a.K(obj);
                        oVar = (o) obj;
                        sVar.f6205d = oVar;
                        obj3 = sVar2.f6205d;
                        if (obj3 instanceof m) {
                        }
                        if (a7.x.l(uVar)) {
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        sVar3 = this.i;
                        uVar2 = (a7.u) this.f7133l;
                        s6.a.K(obj);
                        z zVar2 = new z(sVar3, x0Var, null);
                        this.f7133l = uVar2;
                        this.i = sVar3;
                        this.f7132k = 3;
                        e1 e1Var2 = x0Var.H;
                        f6 = e1Var2.f(t.j0.f6795e, new b0.c(zVar2, e1Var2, null, 14), this);
                        if (f6 != aVar2) {
                        }
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        sVar3 = this.i;
                        uVar2 = (a7.u) this.f7133l;
                        try {
                            s6.a.K(obj);
                        } catch (CancellationException unused) {
                            uVar3 = uVar2;
                            this.f7133l = uVar3;
                            this.i = null;
                            this.f7132k = 6;
                            break;
                        }
                        uVar = uVar2;
                        try {
                        } catch (CancellationException unused2) {
                            uVar3 = uVar;
                            this.f7133l = uVar3;
                            this.i = null;
                            this.f7132k = 6;
                        }
                        Object obj4 = sVar3.f6205d;
                        if (obj4 instanceof n) {
                            this.f7133l = uVar;
                            this.i = null;
                            this.f7132k = 4;
                            if (x0.w0(x0Var, (n) obj4, this) == aVar2) {
                                return aVar2;
                            }
                            if (a7.x.l(uVar)) {
                            }
                        } else {
                            if (obj4 instanceof k) {
                                this.f7133l = uVar;
                                this.i = null;
                                this.f7132k = 5;
                                break;
                            }
                            if (a7.x.l(uVar)) {
                            }
                        }
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        uVar3 = (a7.u) this.f7133l;
                        try {
                            s6.a.K(obj);
                        } catch (CancellationException unused3) {
                            this.f7133l = uVar3;
                            this.i = null;
                            this.f7132k = 6;
                            break;
                        }
                        uVar = uVar3;
                        if (a7.x.l(uVar)) {
                        }
                        break;
                    case 5:
                        uVar3 = (a7.u) this.f7133l;
                        s6.a.K(obj);
                        uVar = uVar3;
                        if (a7.x.l(uVar)) {
                        }
                        break;
                    case 6:
                        uVar3 = (a7.u) this.f7133l;
                        s6.a.K(obj);
                        uVar = uVar3;
                        if (a7.x.l(uVar)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x0 x0Var, g6.c cVar) {
        super(2, cVar);
        this.f7134m = x0Var;
    }
}
