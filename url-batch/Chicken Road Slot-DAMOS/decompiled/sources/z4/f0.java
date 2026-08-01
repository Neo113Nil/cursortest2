package z4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:13:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, x3.j jVar, nd.c cVar) {
        x3.d dVar;
        int i3;
        List list2;
        wd.b0 b0Var;
        Iterator it;
        Throwable th;
        if (cVar instanceof x3.d) {
            dVar = (x3.d) cVar;
            int i10 = dVar.f10346r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f10346r = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f10345i;
                Object obj2 = md.a.f6622d;
                i3 = dVar.f10346r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ArrayList arrayList = new ArrayList();
                    v.w wVar = new v.w(list, arrayList, (ld.a) null);
                    dVar.f10343d = arrayList;
                    dVar.f10346r = 1;
                    if (jVar.a(wVar, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = dVar.f10344e;
                        b0Var = (wd.b0) dVar.f10343d;
                        try {
                            cf.c.M(obj);
                        } catch (Throwable th2) {
                            Object obj3 = b0Var.f10141d;
                            if (obj3 == null) {
                                b0Var.f10141d = th2;
                            } else {
                                hd.b.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            dVar.f10343d = b0Var;
                            dVar.f10344e = it;
                            dVar.f10346r = 2;
                            if (function1.invoke(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) b0Var.f10141d;
                        if (th == null) {
                            return Unit.f5554a;
                        }
                        throw th;
                    }
                    list2 = (List) dVar.f10343d;
                    cf.c.M(obj);
                }
                b0Var = new wd.b0();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) b0Var.f10141d;
                if (th == null) {
                }
            }
        }
        dVar = new x3.d(cVar);
        Object obj4 = dVar.f10345i;
        Object obj22 = md.a.f6622d;
        i3 = dVar.f10346r;
        if (i3 != 0) {
        }
        b0Var = new wd.b0();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) b0Var.f10141d;
        if (th == null) {
        }
    }

    public static final Object b(l lVar, String str, nd.c cVar) {
        Object c10 = lVar.c(str, new q4.f(25), cVar);
        return c10 == md.a.f6622d ? c10 : Unit.f5554a;
    }
}
