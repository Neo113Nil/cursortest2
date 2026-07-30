package r6;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import p6.EnumC0830a;

/* loaded from: classes.dex */
public abstract class e implements p {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f7552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7553e;

    /* renamed from: i, reason: collision with root package name */
    public final EnumC0830a f7554i;

    public e(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        this.f7552d = coroutineContext;
        this.f7553e = i2;
        this.f7554i = enumC0830a;
    }

    public abstract Object a(p6.q qVar, V5.b bVar);

    public abstract e b(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a);

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        Object c7 = AbstractC0792z.c(new C0855c(eVar, this, null), bVar);
        return c7 == W5.a.f2787d ? c7 : Unit.f6114a;
    }

    @Override // r6.p
    public final q6.d o(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        CoroutineContext coroutineContext2 = this.f7552d;
        CoroutineContext j = coroutineContext.j(coroutineContext2);
        EnumC0830a enumC0830a2 = EnumC0830a.f7215d;
        EnumC0830a enumC0830a3 = this.f7554i;
        int i5 = this.f7553e;
        if (enumC0830a == enumC0830a2) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            enumC0830a = enumC0830a3;
        }
        return (Intrinsics.a(j, coroutineContext2) && i2 == i5 && enumC0830a == enumC0830a3) ? this : b(j, i2, enumC0830a);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f6146d;
        CoroutineContext coroutineContext = this.f7552d;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i2 = this.f7553e;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        EnumC0830a enumC0830a = EnumC0830a.f7215d;
        EnumC0830a enumC0830a2 = this.f7554i;
        if (enumC0830a2 != enumC0830a) {
            arrayList.add("onBufferOverflow=" + enumC0830a2);
        }
        return getClass().getSimpleName() + '[' + CollectionsKt.s(arrayList, ", ", null, null, null, 62) + ']';
    }
}
