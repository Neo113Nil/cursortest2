package o;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6597g = 1;

    /* renamed from: h, reason: collision with root package name */
    public r6.v f6598h;

    /* renamed from: i, reason: collision with root package name */
    public r6.v f6599i;

    /* renamed from: j, reason: collision with root package name */
    public int f6600j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6601k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f6602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x0 x0Var, h6.d dVar) {
        super(2, dVar);
        this.f6602l = x0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6597g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e0 e0Var = new e0(this.f6599i, this.f6602l, dVar);
                e0Var.f6601k = obj;
                return e0Var;
            default:
                e0 e0Var2 = new e0(this.f6602l, dVar);
                e0Var2.f6601k = obj;
                return e0Var2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f6597g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e0) create((q6.c) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((e0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)(1:46)|(1:45)|27|28|29|(2:35|(2:37|(1:39)))(2:31|(2:33|34))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[Catch: CancellationException -> 0x00d9, TryCatch #1 {CancellationException -> 0x00d9, blocks: (B:29:0x00c3, B:31:0x00c9, B:35:0x00db, B:37:0x00df), top: B:28:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db A[Catch: CancellationException -> 0x00d9, TryCatch #1 {CancellationException -> 0x00d9, blocks: (B:29:0x00c3, B:31:0x00c9, B:35:0x00db, B:37:0x00df), top: B:28:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003a, blocks: (B:23:0x009d, B:46:0x00be, B:62:0x0034), top: B:61:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d6 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dd -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ea -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x014e -> B:64:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0153 -> B:65:0x0154). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q6.c cVar;
        Object obj2;
        c7.x xVar;
        r6.v vVar;
        r6.v vVar2;
        r6.v vVar3;
        c7.x xVar2;
        c7.x xVar3;
        Object obj3;
        Object e9;
        r rVar;
        Object obj4;
        switch (this.f6597g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.v vVar4 = this.f6599i;
                int i7 = this.f6600j;
                if (i7 == 0) {
                    d6.a.e(obj);
                    cVar = (q6.c) this.f6601k;
                    obj2 = vVar4.f7968f;
                    if (obj2 instanceof q) {
                    }
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r6.v vVar5 = this.f6598h;
                cVar = (q6.c) this.f6601k;
                d6.a.e(obj);
                r rVar2 = (r) obj;
                vVar5.f7968f = rVar2;
                obj2 = vVar4.f7968f;
                if (!(obj2 instanceof q) || (obj2 instanceof n)) {
                    return d6.z.f2639a;
                }
                rVar2 = null;
                o oVar = obj2 instanceof o ? (o) obj2 : null;
                if (oVar != null) {
                    cVar.f(oVar);
                }
                e7.e eVar = this.f6602l.f6796y;
                if (eVar == null) {
                    vVar5 = vVar4;
                    vVar5.f7968f = rVar2;
                    obj2 = vVar4.f7968f;
                    if (obj2 instanceof q) {
                    }
                    return d6.z.f2639a;
                }
                this.f6601k = cVar;
                this.f6598h = vVar4;
                this.f6600j = 1;
                obj = eVar.a(this);
                i6.a aVar = i6.a.f4956f;
                if (obj == aVar) {
                    return aVar;
                }
                vVar5 = vVar4;
                r rVar22 = (r) obj;
                vVar5.f7968f = rVar22;
                obj2 = vVar4.f7968f;
                if (obj2 instanceof q) {
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f6600j;
                x0 x0Var = this.f6602l;
                i6.a aVar2 = i6.a.f4956f;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        d6.a.e(obj);
                        xVar = (c7.x) this.f6601k;
                        if (!c7.a0.n(xVar)) {
                            vVar = new r6.v();
                            e7.e eVar2 = x0Var.f6796y;
                            if (eVar2 != null) {
                                this.f6601k = xVar;
                                this.f6598h = vVar;
                                this.f6599i = vVar;
                                this.f6600j = 1;
                                obj = eVar2.a(this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                vVar2 = vVar;
                                rVar = (r) obj;
                                vVar.f7968f = rVar;
                                obj4 = vVar2.f7968f;
                                if (obj4 instanceof p) {
                                    this.f6601k = xVar;
                                    this.f6598h = vVar2;
                                    this.f6599i = null;
                                    this.f6600j = 2;
                                    if (x0.E0(x0Var, (p) obj4, this) == aVar2) {
                                        return aVar2;
                                    }
                                    vVar3 = vVar2;
                                    xVar2 = xVar;
                                    e0 e0Var = new e0(vVar3, x0Var, null);
                                    this.f6601k = xVar2;
                                    this.f6598h = vVar3;
                                    this.f6600j = 3;
                                    f1 f1Var = x0Var.H;
                                    e9 = f1Var.e(m.p0.f6229g, new a0.a0(e0Var, f1Var, (h6.d) null, 16), this);
                                    if (e9 == i6.a.f4956f) {
                                        e9 = d6.z.f2639a;
                                    }
                                    if (e9 == aVar2) {
                                        return aVar2;
                                    }
                                    xVar = xVar2;
                                    obj3 = vVar3.f7968f;
                                    if (obj3 instanceof q) {
                                        this.f6601k = xVar;
                                        this.f6598h = null;
                                        this.f6600j = 4;
                                        if (x0.F0(x0Var, (q) obj3, this) == aVar2) {
                                            return aVar2;
                                        }
                                    } else if (obj3 instanceof n) {
                                        this.f6601k = xVar;
                                        this.f6598h = null;
                                        this.f6600j = 5;
                                        if (x0.D0(x0Var, this) == aVar2) {
                                            return aVar2;
                                        }
                                    }
                                }
                                if (!c7.a0.n(xVar)) {
                                    return d6.z.f2639a;
                                }
                            } else {
                                vVar2 = vVar;
                                rVar = null;
                                vVar.f7968f = rVar;
                                obj4 = vVar2.f7968f;
                                if (obj4 instanceof p) {
                                }
                                if (!c7.a0.n(xVar)) {
                                }
                            }
                        }
                    case 1:
                        vVar = this.f6599i;
                        vVar2 = this.f6598h;
                        xVar = (c7.x) this.f6601k;
                        d6.a.e(obj);
                        rVar = (r) obj;
                        vVar.f7968f = rVar;
                        obj4 = vVar2.f7968f;
                        if (obj4 instanceof p) {
                        }
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    case 2:
                        vVar3 = this.f6598h;
                        xVar2 = (c7.x) this.f6601k;
                        d6.a.e(obj);
                        e0 e0Var2 = new e0(vVar3, x0Var, null);
                        this.f6601k = xVar2;
                        this.f6598h = vVar3;
                        this.f6600j = 3;
                        f1 f1Var2 = x0Var.H;
                        e9 = f1Var2.e(m.p0.f6229g, new a0.a0(e0Var2, f1Var2, (h6.d) null, 16), this);
                        if (e9 == i6.a.f4956f) {
                        }
                        if (e9 == aVar2) {
                        }
                        xVar = xVar2;
                        obj3 = vVar3.f7968f;
                        if (obj3 instanceof q) {
                        }
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    case 3:
                        vVar3 = this.f6598h;
                        xVar2 = (c7.x) this.f6601k;
                        try {
                            d6.a.e(obj);
                        } catch (CancellationException unused) {
                            xVar3 = xVar2;
                            this.f6601k = xVar3;
                            this.f6598h = null;
                            this.f6600j = 6;
                            if (x0.D0(x0Var, this) == aVar2) {
                            }
                            xVar = xVar3;
                            if (!c7.a0.n(xVar)) {
                            }
                        }
                        xVar = xVar2;
                        obj3 = vVar3.f7968f;
                        if (obj3 instanceof q) {
                        }
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    case 4:
                        xVar3 = (c7.x) this.f6601k;
                        try {
                            d6.a.e(obj);
                        } catch (CancellationException unused2) {
                            this.f6601k = xVar3;
                            this.f6598h = null;
                            this.f6600j = 6;
                            if (x0.D0(x0Var, this) == aVar2) {
                                return aVar2;
                            }
                            xVar = xVar3;
                            if (!c7.a0.n(xVar)) {
                            }
                        }
                        xVar = xVar3;
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    case 5:
                        xVar3 = (c7.x) this.f6601k;
                        d6.a.e(obj);
                        xVar = xVar3;
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    case 6:
                        xVar3 = (c7.x) this.f6601k;
                        d6.a.e(obj);
                        xVar = xVar3;
                        if (!c7.a0.n(xVar)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r6.v vVar, x0 x0Var, h6.d dVar) {
        super(2, dVar);
        this.f6599i = vVar;
        this.f6602l = x0Var;
    }
}
