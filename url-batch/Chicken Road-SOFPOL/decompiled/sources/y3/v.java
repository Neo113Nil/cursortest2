package y3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8949h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f8950j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8951k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, g6.c cVar, int i) {
        super(1, cVar);
        this.f8949h = i;
        this.f8951k = obj;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        g6.c cVar = (g6.c) obj;
        switch (this.f8949h) {
            case 0:
                return new v((b0) this.f8951k, cVar, 0).p(c6.m.f1757a);
            default:
                return new v((d0) this.f8951k, cVar, 1).p(c6.m.f1757a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    @Override // i6.a
    public final Object p(Object obj) {
        Throwable th;
        s0 s0Var;
        FileInputStream fileInputStream;
        switch (this.f8949h) {
            case 0:
                b0 b0Var = (b0) this.f8951k;
                int i = this.i;
                h6.a aVar = h6.a.f3204d;
                try {
                } catch (Throwable th2) {
                    r0 g3 = b0Var.g();
                    this.f8950j = th2;
                    this.i = 2;
                    Integer a8 = g3.a();
                    if (a8 == aVar) {
                        return aVar;
                    }
                    th = th2;
                    obj = a8;
                }
                if (i == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    obj = b0.f(b0Var, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f8950j;
                        s6.a.K(obj);
                        s0Var = new n0(th, ((Number) obj).intValue());
                        return new c6.f(s0Var, Boolean.TRUE);
                    }
                    s6.a.K(obj);
                }
                s0Var = (s0) obj;
                return new c6.f(s0Var, Boolean.TRUE);
            default:
                d0 d0Var = (d0) this.f8951k;
                ?? r12 = this.i;
                b4.f fVar = b4.f.f1246a;
                boolean z3 = true;
                h6.a aVar2 = h6.a.f3204d;
                try {
                    try {
                        try {
                            try {
                            } finally {
                            }
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (d0Var.f8856a.exists()) {
                            fileInputStream = new FileInputStream(d0Var.f8856a);
                            this.f8950j = fileInputStream;
                            this.i = 2;
                            obj = fVar.a(fileInputStream);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                        } else {
                            obj = new b4.a(z3);
                        }
                    }
                    if (r12 == 0) {
                        s6.a.K(obj);
                        FileInputStream fileInputStream2 = new FileInputStream(d0Var.f8856a);
                        this.f8950j = fileInputStream2;
                        this.i = 1;
                        obj = fVar.a(fileInputStream2);
                        r12 = fileInputStream2;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileInputStream = (FileInputStream) this.f8950j;
                            s6.a.K(obj);
                            m.a.i(fileInputStream, null);
                            return obj;
                        }
                        FileInputStream fileInputStream3 = (FileInputStream) this.f8950j;
                        s6.a.K(obj);
                        r12 = fileInputStream3;
                    }
                    m.a.i(r12, null);
                    return obj;
                } catch (Exception e8) {
                    if (e8 instanceof FileNotFoundException) {
                        throw r2.r.Z(d0Var.f8856a.getParent(), (FileNotFoundException) e8);
                    }
                    throw e8;
                }
        }
    }
}
