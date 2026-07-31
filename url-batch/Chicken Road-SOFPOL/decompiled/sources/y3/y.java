package y3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8967h = 0;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8968j;

    /* renamed from: k, reason: collision with root package name */
    public Object f8969k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q6.s sVar, b0 b0Var, q6.q qVar, g6.c cVar) {
        super(1, cVar);
        this.f8970l = sVar;
        this.f8968j = b0Var;
        this.f8971m = qVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [i6.i, p6.e] */
    @Override // p6.c
    public final Object i(Object obj) {
        g6.c cVar = (g6.c) obj;
        switch (this.f8967h) {
            case 0:
                return new y((q6.s) this.f8970l, (b0) this.f8968j, (q6.q) this.f8971m, cVar).p(c6.m.f1757a);
            case 1:
                return new y((b0) this.f8968j, (g6.h) this.f8970l, (p6.e) this.f8971m, cVar).p(c6.m.f1757a);
            default:
                return new y((j0) this.f8968j, this.f8971m, cVar).p(c6.m.f1757a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Type inference failed for: r7v3, types: [i6.i, p6.e] */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        q6.s sVar;
        q6.q qVar;
        c cVar;
        Object obj2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        switch (this.f8967h) {
            case 0:
                q6.q qVar2 = (q6.q) this.f8971m;
                q6.s sVar2 = (q6.s) this.f8970l;
                b0 b0Var = (b0) this.f8968j;
                int i = this.i;
                h6.a aVar = h6.a.f3204d;
                try {
                } catch (b unused) {
                    Object obj3 = sVar2.f6205d;
                    this.f8969k = qVar2;
                    this.i = 3;
                    obj = b0Var.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i == 0) {
                    s6.a.K(obj);
                    this.f8969k = sVar2;
                    this.i = 1;
                    obj = b0Var.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qVar = (q6.q) ((Serializable) this.f8969k);
                            s6.a.K(obj);
                            qVar.f6203d = ((Number) obj).intValue();
                            return c6.m.f1757a;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        qVar2 = (q6.q) ((Serializable) this.f8969k);
                        s6.a.K(obj);
                        qVar2.f6203d = ((Number) obj).intValue();
                        return c6.m.f1757a;
                    }
                    sVar = (q6.s) ((Serializable) this.f8969k);
                    s6.a.K(obj);
                }
                sVar.f6205d = obj;
                r0 g3 = b0Var.g();
                this.f8969k = qVar2;
                this.i = 2;
                obj = g3.a();
                if (obj == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                qVar.f6203d = ((Number) obj).intValue();
                return c6.m.f1757a;
            case 1:
                b0 b0Var2 = (b0) this.f8968j;
                int i8 = this.i;
                h6.a aVar2 = h6.a.f3204d;
                if (i8 == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    obj = b0.f(b0Var2, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f8969k;
                            s6.a.K(obj);
                            return obj4;
                        }
                        cVar = (c) this.f8969k;
                        s6.a.K(obj);
                        obj2 = cVar.f8850b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f8851c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!q6.i.a(cVar.f8850b, obj)) {
                            this.f8969k = obj;
                            this.i = 3;
                            if (b0Var2.j(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    s6.a.K(obj);
                }
                cVar = (c) obj;
                g6.h hVar = (g6.h) this.f8970l;
                b0.d dVar = new b0.d((p6.e) this.f8971m, cVar, (g6.c) null);
                this.f8969k = cVar;
                this.i = 2;
                obj = a7.x.u(hVar, dVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = cVar.f8850b;
                if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f8851c) {
                }
            default:
                File file = ((j0) this.f8968j).f8856a;
                int i9 = this.i;
                c6.m mVar = c6.m.f1757a;
                if (i9 == 0) {
                    s6.a.K(obj);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        Object obj5 = this.f8971m;
                        try {
                            b4.f fVar = b4.f.f1246a;
                            u0 u0Var = new u0(fileOutputStream);
                            this.f8969k = fileOutputStream;
                            this.f8970l = fileOutputStream;
                            this.i = 1;
                            fVar.b(obj5, u0Var);
                            h6.a aVar3 = h6.a.f3204d;
                            if (mVar == aVar3) {
                                return aVar3;
                            }
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            throw th;
                        }
                    } catch (Exception e8) {
                        if (e8 instanceof FileNotFoundException) {
                            throw r2.r.Z(file.getParent(), (FileNotFoundException) e8);
                        }
                        throw e8;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) this.f8970l;
                    fileOutputStream2 = (FileOutputStream) this.f8969k;
                    try {
                        s6.a.K(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            m.a.i(fileOutputStream2, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                m.a.i(fileOutputStream2, null);
                return mVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(b0 b0Var, g6.h hVar, p6.e eVar, g6.c cVar) {
        super(1, cVar);
        this.f8968j = b0Var;
        this.f8970l = hVar;
        this.f8971m = (i6.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(j0 j0Var, Object obj, g6.c cVar) {
        super(1, cVar);
        this.f8968j = j0Var;
        this.f8971m = obj;
    }
}
