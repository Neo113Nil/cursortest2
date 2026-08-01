package n9;

import androidx.lifecycle.o0;
import ge.a0;
import ge.x;
import java.util.Iterator;
import java.util.List;
import je.l0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7186d;

    /* renamed from: e, reason: collision with root package name */
    public int f7187e;

    /* renamed from: i, reason: collision with root package name */
    public int f7188i;

    /* renamed from: r, reason: collision with root package name */
    public c f7189r;

    /* renamed from: s, reason: collision with root package name */
    public int f7190s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f7191t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ld.a aVar) {
        super(2, aVar);
        this.f7191t = cVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new a(this.f7191t, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0095 -> B:5:0x0098). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i3;
        int i10;
        int i11;
        c cVar;
        Object value2;
        j9.a aVar;
        Object value3;
        j9.a aVar2;
        float f3;
        md.a aVar3 = md.a.f6622d;
        int i12 = this.f7190s;
        int i13 = 1;
        c cVar2 = this.f7191t;
        if (i12 == 0) {
            cf.c.M(obj);
            l0 l0Var = cVar2.f7196c;
            do {
                value = l0Var.getValue();
            } while (!l0Var.i(value, j9.a.a((j9.a) value, 0, false, true, 0.0f, 0.0f, 0, null, null, 1999)));
            i3 = 33;
            i10 = 32;
            i11 = 0;
            cVar = cVar2;
            if (i11 < i3) {
            }
        } else {
            if (i12 != 1) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i11 = this.f7188i;
            i3 = this.f7187e;
            i10 = this.f7186d;
            cVar = this.f7189r;
            cf.c.M(obj);
            i11 += i13;
            if (i11 < i3) {
                float f10 = i10;
                float f11 = i11 / f10;
                l0 l0Var2 = cVar.f7196c;
                do {
                    value3 = l0Var2.getValue();
                    aVar2 = (j9.a) value3;
                    boolean z10 = aVar2.f5115i;
                    f3 = aVar2.g;
                    if (z10) {
                        f3 -= cVar.j / f10;
                    }
                } while (!l0Var2.i(value3, j9.a.a(aVar2, 0, false, false, f11, f3, 0, null, null, 1951)));
                this.f7189r = cVar;
                this.f7186d = i10;
                this.f7187e = i3;
                this.f7188i = i11;
                i13 = 1;
                this.f7190s = 1;
                if (a0.i(16L, this) == aVar3) {
                    return aVar3;
                }
                i11 += i13;
                if (i11 < i3) {
                    j9.a aVar4 = (j9.a) cVar2.f7196c.getValue();
                    int i14 = aVar4.f5114h + 1;
                    List list = aVar4.f5116k;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (cVar2.f((j9.d) it.next(), i14)) {
                                a0.s(o0.g(cVar2), null, new i9.b(cVar2, null, 1), 3);
                                return Unit.f5554a;
                            }
                        }
                    }
                    l0 l0Var3 = cVar2.f7196c;
                    do {
                        value2 = l0Var3.getValue();
                        aVar = (j9.a) value2;
                    } while (!l0Var3.i(value2, j9.a.a(aVar, aVar.f5108a + 1, false, false, 0.0f, 0.0f, i14, CollectionsKt.F(aVar.j, new Integer(i14)), null, 1102)));
                    return Unit.f5554a;
                }
            }
        }
    }
}
