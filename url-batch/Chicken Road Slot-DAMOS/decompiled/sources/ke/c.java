package ke;

import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ld.a[] f5510a = new ld.a[0];

    /* renamed from: b, reason: collision with root package name */
    public static final a8.f f5511b = new a8.f("NULL", 3);

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, ld.a aVar) {
        f fVar;
        int i3;
        Object c10;
        Object invoke;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.f5520t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f5520t = i10 - Integer.MIN_VALUE;
                Object obj3 = fVar.f5519s;
                Object obj4 = md.a.f6622d;
                i3 = fVar.f5520t;
                if (i3 != 0) {
                    cf.c.M(obj3);
                    c10 = le.v.c(coroutineContext, obj2);
                    try {
                        fVar.f5515d = coroutineContext;
                        fVar.f5516e = obj;
                        fVar.f5517i = coroutineContext;
                        fVar.f5518r = c10;
                        fVar.f5520t = 1;
                        u uVar = new u(fVar, coroutineContext);
                        if (function2 == null) {
                            invoke = md.f.c(function2, obj, uVar);
                        } else {
                            g0.c(2, function2);
                            invoke = function2.invoke(obj, uVar);
                        }
                        obj3 = invoke;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        le.v.a(coroutineContext, c10);
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = fVar.f5518r;
                    CoroutineContext coroutineContext2 = fVar.f5517i;
                    try {
                        cf.c.M(obj3);
                        c10 = obj5;
                        coroutineContext = coroutineContext2;
                    } catch (Throwable th2) {
                        c10 = obj5;
                        coroutineContext = coroutineContext2;
                        th = th2;
                        le.v.a(coroutineContext, c10);
                        throw th;
                    }
                }
                le.v.a(coroutineContext, c10);
                return obj3;
            }
        }
        fVar = new f(aVar);
        Object obj32 = fVar.f5519s;
        Object obj42 = md.a.f6622d;
        i3 = fVar.f5520t;
        if (i3 != 0) {
        }
        le.v.a(coroutineContext, c10);
        return obj32;
    }
}
