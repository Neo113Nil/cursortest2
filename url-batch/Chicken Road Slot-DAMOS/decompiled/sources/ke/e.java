package ke;

import ge.a0;
import ge.x;
import ge.y;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e implements n {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f5512d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5513e;

    /* renamed from: i, reason: collision with root package name */
    public final ie.a f5514i;

    public e(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        this.f5512d = coroutineContext;
        this.f5513e = i3;
        this.f5514i = aVar;
    }

    @Override // ke.n
    public final je.e a(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        CoroutineContext coroutineContext2 = this.f5512d;
        CoroutineContext p4 = coroutineContext.p(coroutineContext2);
        ie.a aVar2 = ie.a.f4712d;
        ie.a aVar3 = this.f5514i;
        int i10 = this.f5513e;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i3 != -3) {
                    if (i10 != -2) {
                        if (i3 != -2) {
                            i3 += i10;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i10;
            }
            aVar = aVar3;
        }
        return (Intrinsics.a(p4, coroutineContext2) && i3 == i10 && aVar == aVar3) ? this : e(p4, i3, aVar);
    }

    public String b() {
        return null;
    }

    @Override // je.e
    public Object c(je.f fVar, ld.a aVar) {
        Object h10 = a0.h(new b5.t(fVar, this, null, 4), aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    public abstract Object d(ie.n nVar, ld.a aVar);

    public abstract e e(CoroutineContext coroutineContext, int i3, ie.a aVar);

    public je.e f() {
        return null;
    }

    public ie.g g(x xVar) {
        int i3 = this.f5513e;
        if (i3 == -3) {
            i3 = -2;
        }
        y yVar = y.f4419i;
        Function2 tVar = new a3.t(this, (ld.a) null, 11);
        ie.n nVar = new ie.n(ge.r.b(xVar, this.f5512d), ie.j.a(i3, 4, this.f5514i));
        nVar.h0(yVar, nVar, tVar);
        return nVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b10 = b();
        if (b10 != null) {
            arrayList.add(b10);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
        CoroutineContext coroutineContext = this.f5512d;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i3 = this.f5513e;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        ie.a aVar = ie.a.f4712d;
        ie.a aVar2 = this.f5514i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return n0.l.h(sb2, CollectionsKt.B(arrayList, ", ", null, null, null, 62), ']');
    }
}
