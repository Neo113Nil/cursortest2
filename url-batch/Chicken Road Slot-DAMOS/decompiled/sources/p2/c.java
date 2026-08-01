package p2;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import n0.j1;
import n0.m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements m2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f7616d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f7617e;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f7618i;

    /* renamed from: r, reason: collision with root package name */
    public final j1 f7619r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7620s = true;

    public c(List list, Object obj, a0 a0Var, p.e eVar, Function1 function1, c4.o oVar) {
        this.f7616d = list;
        this.f7617e = a0Var;
        this.f7618i = function1;
        this.f7619r = n0.h.r(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:16:0x0097, B:23:0x0047, B:25:0x004c, B:28:0x0074, B:33:0x008d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0097 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nd.c cVar) {
        b bVar;
        int i3;
        Function1 function1;
        j1 j1Var;
        int size;
        List list;
        int i10;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i11 = bVar.f7614u;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f7614u = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f7612s;
                    md.a aVar = md.a.f6622d;
                    i3 = bVar.f7614u;
                    function1 = this.f7618i;
                    j1Var = this.f7619r;
                    if (i3 == 0) {
                        if (i3 == 1) {
                            int i12 = bVar.f7611r;
                            int i13 = bVar.f7610i;
                            x xVar = bVar.f7609e;
                            List list2 = bVar.f7608d;
                            cf.c.M(obj);
                            if (obj != null) {
                                a0 a0Var = this.f7617e;
                                j1Var.setValue(i7.a.h0(a0Var.f7606d, obj, xVar, a0Var.f7604b, a0Var.f7605c));
                                return Unit.f5554a;
                            }
                            bVar.f7608d = list2;
                            bVar.f7609e = null;
                            bVar.f7610i = i13;
                            bVar.f7611r = i12;
                            bVar.f7614u = 2;
                            if (ge.a0.E(bVar) == aVar) {
                                return aVar;
                            }
                            size = i12;
                            i10 = i13;
                            list = list2;
                        } else {
                            if (i3 != 2) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            size = bVar.f7611r;
                            i10 = bVar.f7610i;
                            list = bVar.f7608d;
                            cf.c.M(obj);
                        }
                        i10++;
                        if (i10 < size) {
                            ((x) list.get(i10)).getClass();
                            i10++;
                            if (i10 < size) {
                                boolean q3 = ge.a0.q(bVar.getContext());
                                this.f7620s = false;
                                function1.invoke(new c0(j1Var.getValue(), q3));
                                return Unit.f5554a;
                            }
                        }
                    } else {
                        cf.c.M(obj);
                        List list3 = this.f7616d;
                        size = list3.size();
                        list = list3;
                        i10 = 0;
                        if (i10 < size) {
                        }
                    }
                }
            }
            if (i3 == 0) {
            }
        } finally {
            boolean q7 = ge.a0.q(bVar.getContext());
            this.f7620s = false;
            function1.invoke(new c0(j1Var.getValue(), q7));
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f7612s;
        md.a aVar2 = md.a.f6622d;
        i3 = bVar.f7614u;
        function1 = this.f7618i;
        j1Var = this.f7619r;
    }

    @Override // n0.m2
    public final Object getValue() {
        return this.f7619r.getValue();
    }
}
