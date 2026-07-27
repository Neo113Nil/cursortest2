package a3;

import A.AbstractC0017m;
import W2.AbstractC0296s;
import W2.B;
import W2.EnumC0303z;
import W2.InterfaceC0302y;
import W2.J;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0429g implements q {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f4955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4956e;

    /* renamed from: i, reason: collision with root package name */
    public final Y2.a f4957i;

    public AbstractC0429g(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        this.f4955d = coroutineContext;
        this.f4956e = i2;
        this.f4957i = aVar;
    }

    @Override // a3.q
    public final InterfaceC0330f c(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        CoroutineContext coroutineContext2 = this.f4955d;
        CoroutineContext s4 = coroutineContext.s(coroutineContext2);
        Y2.a aVar2 = Y2.a.f4398d;
        Y2.a aVar3 = this.f4957i;
        int i4 = this.f4956e;
        if (aVar == aVar2) {
            if (i4 != -3) {
                if (i2 != -3) {
                    if (i4 != -2) {
                        if (i2 != -2) {
                            i2 += i4;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i4;
            }
            aVar = aVar3;
        }
        return (Intrinsics.a(s4, coroutineContext2) && i2 == i4 && aVar == aVar3) ? this : g(s4, i2, aVar);
    }

    public String d() {
        return null;
    }

    @Override // Z2.InterfaceC0330f
    public Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        Object d4 = B.d(new C0427e(interfaceC0331g, this, null), aVar);
        return d4 == D2.a.f2163d ? d4 : Unit.f7487a;
    }

    public abstract Object f(Y2.q qVar, C0428f c0428f);

    public abstract AbstractC0429g g(CoroutineContext coroutineContext, int i2, Y2.a aVar);

    public InterfaceC0330f h() {
        return null;
    }

    public Y2.r i(InterfaceC0302y interfaceC0302y) {
        int i2 = this.f4956e;
        if (i2 == -3) {
            i2 = -2;
        }
        EnumC0303z enumC0303z = EnumC0303z.f4306i;
        Function2 c0428f = new C0428f(this, null);
        Y2.e a4 = Y2.l.a(i2, 4, this.f4957i);
        CoroutineContext a5 = AbstractC0296s.a(interfaceC0302y.q(), this.f4955d, true);
        d3.e eVar = J.f4225a;
        if (a5 != eVar && a5.k(kotlin.coroutines.e.f7496f) == null) {
            a5 = a5.s(eVar);
        }
        Y2.p pVar = new Y2.p(a5, a4);
        pVar.j0(enumC0303z, pVar, c0428f);
        return pVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d4 = d();
        if (d4 != null) {
            arrayList.add(d4);
        }
        kotlin.coroutines.i iVar = kotlin.coroutines.i.f7498d;
        CoroutineContext coroutineContext = this.f4955d;
        if (coroutineContext != iVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i2 = this.f4956e;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        Y2.a aVar = Y2.a.f4398d;
        Y2.a aVar2 = this.f4957i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0017m.m(sb, C1403G.w(arrayList, ", ", null, null, null, 62), ']');
    }
}
