package x3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oe.a f10388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd.z f10389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd.b0 f10390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f10391d;

    public j(oe.a aVar, wd.z zVar, wd.b0 b0Var, z zVar2) {
        this.f10388a = aVar;
        this.f10389b = zVar;
        this.f10390c = b0Var;
        this.f10391d = zVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:27:0x004f, B:28:0x00ab, B:30:0x00b3), top: B:26:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:40:0x008f, B:42:0x0093, B:45:0x00d4, B:46:0x00db), top: B:39:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[Catch: all -> 0x00d1, TRY_ENTER, TryCatch #0 {all -> 0x00d1, blocks: (B:40:0x008f, B:42:0x0093, B:45:0x00d4, B:46:0x00db), top: B:39:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v.w wVar, nd.c cVar) {
        i iVar;
        int i3;
        oe.a aVar;
        z zVar;
        wd.z zVar2;
        wd.b0 b0Var;
        Function2 function2;
        oe.a aVar2;
        oe.a aVar3;
        z zVar3;
        Object obj;
        wd.b0 b0Var2;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i10 = iVar.f10384v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    iVar.f10384v = i10 - Integer.MIN_VALUE;
                    Object obj2 = iVar.f10382t;
                    md.a aVar4 = md.a.f6622d;
                    i3 = iVar.f10384v;
                    if (i3 != 0) {
                        cf.c.M(obj2);
                        iVar.f10377d = wVar;
                        aVar = this.f10388a;
                        iVar.f10378e = aVar;
                        wd.z zVar4 = this.f10389b;
                        iVar.f10379i = zVar4;
                        wd.b0 b0Var3 = this.f10390c;
                        iVar.f10380r = b0Var3;
                        zVar = this.f10391d;
                        iVar.f10381s = zVar;
                        iVar.f10384v = 1;
                        if (aVar.a(iVar) != aVar4) {
                            zVar2 = zVar4;
                            b0Var = b0Var3;
                            function2 = wVar;
                        }
                        return aVar4;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = iVar.f10379i;
                            b0Var2 = (wd.b0) iVar.f10378e;
                            aVar2 = (oe.a) iVar.f10377d;
                            try {
                                cf.c.M(obj2);
                                b0Var2.f10141d = obj;
                                b0Var = b0Var2;
                                Object obj3 = b0Var.f10141d;
                                aVar2.d(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                aVar2.d(null);
                                throw th;
                            }
                        }
                        zVar3 = (z) iVar.f10379i;
                        b0Var = (wd.b0) iVar.f10378e;
                        aVar3 = (oe.a) iVar.f10377d;
                        try {
                            cf.c.M(obj2);
                            if (!Intrinsics.a(obj2, b0Var.f10141d)) {
                                aVar2 = aVar3;
                                Object obj32 = b0Var.f10141d;
                                aVar2.d(null);
                                return obj32;
                            }
                            iVar.f10377d = aVar3;
                            iVar.f10378e = b0Var;
                            iVar.f10379i = obj2;
                            iVar.f10384v = 3;
                            if (zVar3.k(obj2, false, iVar) != aVar4) {
                                obj = obj2;
                                b0Var2 = b0Var;
                                aVar2 = aVar3;
                                b0Var2.f10141d = obj;
                                b0Var = b0Var2;
                                Object obj322 = b0Var.f10141d;
                                aVar2.d(null);
                                return obj322;
                            }
                            return aVar4;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = aVar3;
                            aVar2.d(null);
                            throw th;
                        }
                    }
                    z zVar5 = iVar.f10381s;
                    b0Var = iVar.f10380r;
                    zVar2 = (wd.z) iVar.f10379i;
                    oe.a aVar5 = (oe.a) iVar.f10378e;
                    Function2 function22 = (Function2) iVar.f10377d;
                    cf.c.M(obj2);
                    zVar = zVar5;
                    function2 = function22;
                    aVar = aVar5;
                    if (!zVar2.f10164d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = b0Var.f10141d;
                    iVar.f10377d = aVar;
                    iVar.f10378e = b0Var;
                    iVar.f10379i = zVar;
                    iVar.f10380r = null;
                    iVar.f10381s = null;
                    iVar.f10384v = 2;
                    Object invoke = function2.invoke(obj4, iVar);
                    if (invoke != aVar4) {
                        aVar3 = aVar;
                        obj2 = invoke;
                        zVar3 = zVar;
                        if (!Intrinsics.a(obj2, b0Var.f10141d)) {
                        }
                    }
                    return aVar4;
                }
            }
            if (!zVar2.f10164d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.d(null);
            throw th;
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.f10382t;
        md.a aVar42 = md.a.f6622d;
        i3 = iVar.f10384v;
        if (i3 != 0) {
        }
    }
}
