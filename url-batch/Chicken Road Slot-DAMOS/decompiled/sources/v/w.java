package v;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9891d = 1;

    /* renamed from: e, reason: collision with root package name */
    public Object f9892e;

    /* renamed from: i, reason: collision with root package name */
    public int f9893i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9894r;

    /* renamed from: s, reason: collision with root package name */
    public Object f9895s;

    /* renamed from: t, reason: collision with root package name */
    public Object f9896t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9897u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Serializable f9898v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(x xVar, Function1 function1, ld.a aVar) {
        super(2, aVar);
        u uVar = u.f9886d;
        this.f9897u = xVar;
        this.f9898v = (nd.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, nd.i] */
    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        int i3 = this.f9891d;
        Serializable serializable = this.f9898v;
        Object obj2 = this.f9897u;
        switch (i3) {
            case 0:
                u uVar = u.f9886d;
                w wVar = new w((x) obj2, (Function1) serializable, aVar);
                wVar.f9894r = obj;
                return wVar;
            default:
                w wVar2 = new w((List) obj2, (ArrayList) serializable, aVar);
                wVar2.f9894r = obj;
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9891d) {
            case 0:
                return ((w) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((w) create(obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, oe.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r3v9, types: [oe.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:8:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00aa -> B:9:0x004f). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oe.c cVar;
        x xVar;
        v vVar;
        ?? r12;
        Throwable th;
        x xVar2;
        oe.a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Iterator it;
        Object obj2;
        List list;
        List list2;
        z3.b bVar;
        int i3 = this.f9891d;
        ?? r13 = this.f9898v;
        Object obj3 = this.f9897u;
        ld.a aVar2 = null;
        switch (i3) {
            case 0:
                x xVar3 = (x) obj3;
                md.a aVar3 = md.a.f6622d;
                int i10 = this.f9893i;
                try {
                    try {
                        if (i10 == 0) {
                            cf.c.M(obj);
                            ge.x xVar4 = (ge.x) this.f9894r;
                            u uVar = u.f9886d;
                            CoroutineContext.Element m10 = xVar4.h().m(ge.u.f4403e);
                            m10.getClass();
                            v vVar2 = new v((ge.c1) m10);
                            AtomicReference atomicReference3 = xVar3.f9911a;
                            while (true) {
                                v vVar3 = (v) atomicReference3.get();
                                if (vVar3 != null) {
                                    u uVar2 = u.f9886d;
                                    if (uVar2.compareTo(uVar2) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(vVar3, vVar2)) {
                                    if (atomicReference3.get() != vVar3) {
                                        break;
                                    }
                                }
                                if (vVar3 != null) {
                                    vVar3.f9888a.a(new d1.m("Mutation interrupted", 2));
                                }
                                cVar = xVar3.f9912b;
                                nd.i iVar = (nd.i) r13;
                                this.f9894r = vVar2;
                                this.f9895s = cVar;
                                this.f9892e = iVar;
                                this.f9896t = xVar3;
                                this.f9893i = 1;
                                if (cVar.a(this) != aVar3) {
                                    xVar = xVar3;
                                    vVar = vVar2;
                                    r12 = iVar;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xVar2 = (x) this.f9892e;
                                aVar = (oe.a) this.f9895s;
                                vVar = (v) this.f9894r;
                                try {
                                    cf.c.M(obj);
                                    atomicReference2 = xVar2.f9911a;
                                    while (!atomicReference2.compareAndSet(vVar, null) && atomicReference2.get() == vVar) {
                                    }
                                    aVar.d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicReference = xVar2.f9911a;
                                    while (!atomicReference.compareAndSet(vVar, null)) {
                                    }
                                    throw th;
                                }
                            }
                            x xVar5 = (x) this.f9896t;
                            Function1 function1 = (Function1) this.f9892e;
                            ?? r32 = (oe.a) this.f9895s;
                            v vVar4 = (v) this.f9894r;
                            cf.c.M(obj);
                            cVar = r32;
                            xVar = xVar5;
                            vVar = vVar4;
                            r12 = function1;
                        }
                        this.f9894r = vVar;
                        this.f9895s = cVar;
                        this.f9892e = xVar;
                        this.f9896t = null;
                        this.f9893i = 2;
                        Object invoke = r12.invoke(this);
                        if (invoke != aVar3) {
                            aVar = cVar;
                            obj = invoke;
                            xVar2 = xVar;
                            atomicReference2 = xVar2.f9911a;
                            while (!atomicReference2.compareAndSet(vVar, null)) {
                            }
                            aVar.d(null);
                            return obj;
                        }
                        return aVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        xVar2 = xVar;
                        atomicReference = xVar2.f9911a;
                        while (!atomicReference.compareAndSet(vVar, null) && atomicReference.get() == vVar) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    r13.d(null);
                    throw th4;
                }
            default:
                md.a aVar4 = md.a.f6622d;
                int i11 = this.f9893i;
                if (i11 == 0) {
                    cf.c.M(obj);
                    Object obj4 = this.f9894r;
                    List list3 = (ArrayList) r13;
                    it = ((List) obj3).iterator();
                    obj2 = obj4;
                    list = list3;
                    if (!it.hasNext()) {
                    }
                } else if (i11 == 1) {
                    obj2 = this.f9892e;
                    z3.b bVar2 = (z3.b) this.f9896t;
                    Iterator it2 = (Iterator) this.f9895s;
                    list2 = (List) this.f9894r;
                    cf.c.M(obj);
                    bVar = bVar2;
                    it = it2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i11 != 2) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it3 = (Iterator) this.f9895s;
                    List list4 = (List) this.f9894r;
                    cf.c.M(obj);
                    Iterator it4 = it3;
                    obj2 = obj;
                    list = list4;
                    it = it4;
                    if (!it.hasNext()) {
                        bVar = (z3.b) it.next();
                        this.f9894r = list;
                        this.f9895s = it;
                        this.f9896t = bVar;
                        this.f9892e = obj2;
                        this.f9893i = 1;
                        Object a9 = bVar.a(obj2, this);
                        if (a9 != aVar4) {
                            list2 = list;
                            obj = a9;
                            if (((Boolean) obj).booleanValue()) {
                                list = list2;
                                if (!it.hasNext()) {
                                }
                            } else {
                                list2.add(new x3.e(bVar, aVar2, 0));
                                this.f9894r = list2;
                                this.f9895s = it;
                                this.f9896t = null;
                                this.f9892e = null;
                                this.f9893i = 2;
                                obj = bVar.f10695b.a(new z3.d((SharedPreferences) bVar.f10698e.getValue(), bVar.f10699f), obj2, this);
                                if (obj != aVar4) {
                                    it3 = it;
                                    list4 = list2;
                                    Iterator it42 = it3;
                                    obj2 = obj;
                                    list = list4;
                                    it = it42;
                                    if (!it.hasNext()) {
                                        return obj2;
                                    }
                                }
                            }
                        }
                        return aVar4;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(List list, ArrayList arrayList, ld.a aVar) {
        super(2, aVar);
        this.f9897u = list;
        this.f9898v = arrayList;
    }
}
