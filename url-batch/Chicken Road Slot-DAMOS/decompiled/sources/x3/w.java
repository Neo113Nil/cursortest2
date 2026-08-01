package x3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10475d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f10476e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10477i;

    /* renamed from: r, reason: collision with root package name */
    public Object f10478r;

    /* renamed from: s, reason: collision with root package name */
    public Object f10479s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10480t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(z zVar, CoroutineContext coroutineContext, Function2 function2, ld.a aVar) {
        super(1, aVar);
        this.f10477i = zVar;
        this.f10479s = coroutineContext;
        this.f10480t = (nd.i) function2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        switch (this.f10475d) {
            case 0:
                return new w((wd.b0) this.f10479s, (z) this.f10477i, (wd.a0) this.f10480t, aVar);
            case 1:
                return new w((z) this.f10477i, (CoroutineContext) this.f10479s, (Function2) this.f10480t, aVar);
            default:
                return new w((k0) this.f10477i, this.f10480t, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.f10475d) {
        }
        return ((w) create(aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wd.b0 b0Var;
        wd.a0 a0Var;
        c cVar;
        Object obj2;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        switch (this.f10475d) {
            case 0:
                wd.a0 a0Var2 = (wd.a0) this.f10480t;
                wd.b0 b0Var2 = (wd.b0) this.f10479s;
                z zVar = (z) this.f10477i;
                md.a aVar = md.a.f6622d;
                int i3 = this.f10476e;
                try {
                } catch (b unused) {
                    Object obj3 = b0Var2.f10141d;
                    this.f10478r = a0Var2;
                    this.f10476e = 3;
                    obj = zVar.k(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i3 == 0) {
                    cf.c.M(obj);
                    this.f10478r = b0Var2;
                    this.f10476e = 1;
                    obj = zVar.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            a0Var = (wd.a0) ((Serializable) this.f10478r);
                            cf.c.M(obj);
                            a0Var.f10139d = ((Number) obj).intValue();
                            return Unit.f5554a;
                        }
                        if (i3 != 3) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0Var2 = (wd.a0) ((Serializable) this.f10478r);
                        cf.c.M(obj);
                        a0Var2.f10139d = ((Number) obj).intValue();
                        return Unit.f5554a;
                    }
                    b0Var = (wd.b0) ((Serializable) this.f10478r);
                    cf.c.M(obj);
                }
                b0Var.f10141d = obj;
                s0 i10 = zVar.i();
                this.f10478r = a0Var2;
                this.f10476e = 2;
                obj = i10.a();
                if (obj == aVar) {
                    return aVar;
                }
                a0Var = a0Var2;
                a0Var.f10139d = ((Number) obj).intValue();
                return Unit.f5554a;
            case 1:
                z zVar2 = (z) this.f10477i;
                md.a aVar2 = md.a.f6622d;
                int i11 = this.f10476e;
                if (i11 == 0) {
                    cf.c.M(obj);
                    this.f10476e = 1;
                    obj = z.g(zVar2, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj4 = this.f10478r;
                            cf.c.M(obj);
                            return obj4;
                        }
                        cVar = (c) this.f10478r;
                        cf.c.M(obj);
                        obj2 = cVar.f10341b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f10342c) {
                            kotlin.collections.i0.l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!Intrinsics.a(cVar.f10341b, obj)) {
                            this.f10478r = obj;
                            this.f10476e = 3;
                            if (zVar2.k(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    cf.c.M(obj);
                }
                cVar = (c) obj;
                CoroutineContext coroutineContext = (CoroutineContext) this.f10479s;
                a3.t tVar = new a3.t((Function2) this.f10480t, cVar, (ld.a) null);
                this.f10478r = cVar;
                this.f10476e = 2;
                obj = ge.a0.B(coroutineContext, tVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = cVar.f10341b;
                if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f10342c) {
                }
            default:
                File file = ((k0) this.f10477i).f10347a;
                md.a aVar3 = md.a.f6622d;
                int i12 = this.f10476e;
                if (i12 == 0) {
                    cf.c.M(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        Object obj5 = this.f10480t;
                        try {
                            v0 v0Var = new v0(fileOutputStream3);
                            this.f10478r = fileOutputStream3;
                            this.f10479s = fileOutputStream3;
                            this.f10476e = 1;
                            if (b4.f.b(obj5, v0Var) == aVar3) {
                                return aVar3;
                            }
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th2) {
                            fileOutputStream = fileOutputStream3;
                            th = th2;
                            throw th;
                        }
                    } catch (Exception e2) {
                        if (e2 instanceof FileNotFoundException) {
                            throw z6.m.a(file.getParent(), (FileNotFoundException) e2);
                        }
                        throw e2;
                    }
                } else {
                    if (i12 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.f10479s;
                    fileOutputStream = (FileOutputStream) this.f10478r;
                    try {
                        cf.c.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            i7.a.G(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                i7.a.G(fileOutputStream, null);
                return Unit.f5554a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wd.b0 b0Var, z zVar, wd.a0 a0Var, ld.a aVar) {
        super(1, aVar);
        this.f10479s = b0Var;
        this.f10477i = zVar;
        this.f10480t = a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k0 k0Var, Object obj, ld.a aVar) {
        super(1, aVar);
        this.f10477i = k0Var;
        this.f10480t = obj;
    }
}
