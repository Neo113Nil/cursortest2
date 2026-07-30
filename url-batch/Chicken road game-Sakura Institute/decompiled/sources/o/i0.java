package o;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6643g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f6644h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6645i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6646j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6647k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(h6.i iVar, q6.e eVar, h6.d dVar) {
        super(2, dVar);
        this.f6646j = iVar;
        this.f6647k = (j6.h) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [j6.h, q6.e] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6643g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i0 i0Var = new i0((h6.i) this.f6646j, (j6.h) this.f6647k, dVar);
                i0Var.f6645i = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0((w.n0) this.f6647k, dVar);
                i0Var2.f6645i = obj;
                return i0Var2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        l1.c0 c0Var = (l1.c0) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6643g) {
        }
        return ((i0) create(c0Var, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l1.c0] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v8, types: [j6.h, q6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:8:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e0 -> B:33:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00f5 -> B:33:0x00af). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object q8;
        l1.c0 c0Var;
        l1.c0 c0Var2;
        l1.c0 c0Var3;
        l1.c0 c0Var4;
        l1.v vVar;
        int size;
        int i7;
        switch (this.f6643g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h6.i iVar = (h6.i) this.f6646j;
                l1.c0 c0Var5 = this.f6644h;
                i6.a aVar = i6.a.f4956f;
                try {
                } catch (CancellationException e9) {
                    e = e9;
                    if (c7.a0.o(iVar)) {
                        throw e;
                    }
                    this.f6645i = c0Var5;
                    this.f6644h = 3;
                    Object q9 = t6.a.q(c0Var5, this);
                    c0Var2 = c0Var5;
                    if (q9 == aVar) {
                        return aVar;
                    }
                    c0Var = c0Var2;
                    if (c7.a0.o(iVar)) {
                    }
                }
                if (c0Var5 == 0) {
                    d6.a.e(obj);
                    c0Var = (l1.c0) this.f6645i;
                    if (c7.a0.o(iVar)) {
                    }
                } else if (c0Var5 != 1) {
                    if (c0Var5 == 2) {
                        l1.c0 c0Var6 = (l1.c0) this.f6645i;
                        d6.a.e(obj);
                        c0Var2 = c0Var6;
                    } else {
                        if (c0Var5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l1.c0 c0Var7 = (l1.c0) this.f6645i;
                        d6.a.e(obj);
                        c0Var2 = c0Var7;
                    }
                    c0Var = c0Var2;
                    if (c7.a0.o(iVar)) {
                        try {
                        } catch (CancellationException e10) {
                            c0Var5 = c0Var;
                            e = e10;
                            if (c7.a0.o(iVar)) {
                            }
                        }
                        ?? r12 = (j6.h) this.f6647k;
                        this.f6645i = c0Var;
                        this.f6644h = 1;
                        if (r12.d(c0Var, this) == aVar) {
                            return aVar;
                        }
                        c0Var5 = c0Var;
                        this.f6645i = c0Var5;
                        this.f6644h = 2;
                        q8 = t6.a.q(c0Var5, this);
                        c0Var2 = c0Var5;
                        if (q8 == aVar) {
                            return aVar;
                        }
                        c0Var = c0Var2;
                        if (c7.a0.o(iVar)) {
                            return d6.z.f2639a;
                        }
                    }
                } else {
                    l1.c0 c0Var8 = (l1.c0) this.f6645i;
                    d6.a.e(obj);
                    c0Var5 = c0Var8;
                    this.f6645i = c0Var5;
                    this.f6644h = 2;
                    q8 = t6.a.q(c0Var5, this);
                    c0Var2 = c0Var5;
                    if (q8 == aVar) {
                    }
                    c0Var = c0Var2;
                    if (c7.a0.o(iVar)) {
                    }
                }
            default:
                w.n0 n0Var = (w.n0) this.f6647k;
                int i8 = this.f6644h;
                i6.a aVar2 = i6.a.f4956f;
                if (i8 == 0) {
                    d6.a.e(obj);
                    c0Var3 = (l1.c0) this.f6645i;
                    this.f6645i = c0Var3;
                    this.f6644h = 1;
                    obj = p1.b(c0Var3, (r3 & 1) != 0, l1.k.f5816g, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar = (l1.v) this.f6646j;
                        c0Var4 = (l1.c0) this.f6645i;
                        d6.a.e(obj);
                        ?? r14 = ((l1.j) obj).f5812a;
                        size = r14.size();
                        i7 = 0;
                        while (i7 < size) {
                            l1.v vVar2 = (l1.v) r14.get(i7);
                            if (l1.u.a(vVar2.f5830a, vVar.f5830a) && vVar2.f5833d) {
                                this.f6645i = c0Var4;
                                this.f6646j = vVar;
                                this.f6644h = 2;
                                obj = c0Var4.b(l1.k.f5816g, this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                ?? r142 = ((l1.j) obj).f5812a;
                                size = r142.size();
                                i7 = 0;
                                while (i7 < size) {
                                }
                            } else {
                                i7++;
                            }
                        }
                        n0Var.b();
                        return d6.z.f2639a;
                    }
                    c0Var3 = (l1.c0) this.f6645i;
                    d6.a.e(obj);
                }
                l1.v vVar3 = (l1.v) obj;
                long j8 = vVar3.f5832c;
                n0Var.d();
                c0Var4 = c0Var3;
                vVar = vVar3;
                this.f6645i = c0Var4;
                this.f6646j = vVar;
                this.f6644h = 2;
                obj = c0Var4.b(l1.k.f5816g, this);
                if (obj == aVar2) {
                }
                ?? r1422 = ((l1.j) obj).f5812a;
                size = r1422.size();
                i7 = 0;
                while (i7 < size) {
                }
                n0Var.b();
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(w.n0 n0Var, h6.d dVar) {
        super(2, dVar);
        this.f6647k = n0Var;
    }
}
