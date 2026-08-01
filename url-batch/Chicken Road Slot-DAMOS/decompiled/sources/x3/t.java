package x3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10454d;

    /* renamed from: e, reason: collision with root package name */
    public int f10455e;

    /* renamed from: i, reason: collision with root package name */
    public Object f10456i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10457r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, ld.a aVar, int i3) {
        super(1, aVar);
        this.f10454d = i3;
        this.f10457r = obj;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        switch (this.f10454d) {
            case 0:
                return new t((z) this.f10457r, aVar, 0);
            default:
                return new t((d0) this.f10457r, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.f10454d) {
        }
        return ((t) create(aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        t0 t0Var;
        FileInputStream fileInputStream;
        Throwable th2;
        switch (this.f10454d) {
            case 0:
                z zVar = (z) this.f10457r;
                md.a aVar = md.a.f6622d;
                int i3 = this.f10455e;
                try {
                } catch (Throwable th3) {
                    s0 i10 = zVar.i();
                    this.f10456i = th3;
                    this.f10455e = 2;
                    Integer a9 = i10.a();
                    if (a9 == aVar) {
                        return aVar;
                    }
                    th = th3;
                    obj = a9;
                }
                if (i3 == 0) {
                    cf.c.M(obj);
                    this.f10455e = 1;
                    obj = z.g(zVar, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.f10456i;
                        cf.c.M(obj);
                        t0Var = new o0(th, ((Number) obj).intValue());
                        return new Pair(t0Var, Boolean.TRUE);
                    }
                    cf.c.M(obj);
                }
                t0Var = (t0) obj;
                return new Pair(t0Var, Boolean.TRUE);
            default:
                d0 d0Var = (d0) this.f10457r;
                md.a aVar2 = md.a.f6622d;
                ?? r22 = this.f10455e;
                boolean z10 = true;
                try {
                    try {
                        try {
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (d0Var.f10347a.exists()) {
                            FileInputStream fileInputStream2 = new FileInputStream(d0Var.f10347a);
                            try {
                                this.f10456i = fileInputStream2;
                                this.f10455e = 2;
                                b4.a a10 = b4.f.a(fileInputStream2);
                                if (a10 == aVar2) {
                                    return aVar2;
                                }
                                fileInputStream = fileInputStream2;
                                obj = a10;
                            } catch (Throwable th4) {
                                fileInputStream = fileInputStream2;
                                th2 = th4;
                                try {
                                    throw th2;
                                } catch (Throwable th5) {
                                    i7.a.G(fileInputStream, th2);
                                    throw th5;
                                }
                            }
                        } else {
                            obj = new b4.a(z10);
                        }
                    }
                    if (r22 == 0) {
                        cf.c.M(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(d0Var.f10347a);
                        this.f10456i = fileInputStream3;
                        this.f10455e = 1;
                        obj = b4.f.a(fileInputStream3);
                        r22 = fileInputStream3;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (r22 != 1) {
                            if (r22 != 2) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.f10456i;
                            try {
                                cf.c.M(obj);
                                i7.a.G(fileInputStream, null);
                                return obj;
                            } catch (Throwable th6) {
                                th2 = th6;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.f10456i;
                        cf.c.M(obj);
                        r22 = fileInputStream4;
                    }
                    i7.a.G(r22, null);
                    return obj;
                } catch (Exception e2) {
                    if (e2 instanceof FileNotFoundException) {
                        throw z6.m.a(d0Var.f10347a.getParent(), (FileNotFoundException) e2);
                    }
                    throw e2;
                }
        }
    }
}
