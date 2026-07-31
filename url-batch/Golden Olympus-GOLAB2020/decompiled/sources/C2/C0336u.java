package C2;

import g2.AbstractC2429a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0336u implements InterfaceC0335t0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f336a;

    /* renamed from: b, reason: collision with root package name */
    private final C0338v f337b;

    /* renamed from: C2.u$a */
    public static final class a extends kotlin.jvm.internal.s implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C0333s0();
        }
    }

    public C0336u(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f336a = compute;
        this.f337b = new C0338v();
    }

    @Override // C2.InterfaceC0335t0
    public Object a(m2.c key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.f337b.get(AbstractC2429a.a(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
        C0318k0 c0318k0 = (C0318k0) obj;
        Object obj2 = c0318k0.f303a.get();
        if (obj2 == null) {
            obj2 = c0318k0.a(new a());
        }
        C0333s0 c0333s0 = (C0333s0) obj2;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new X((m2.k) it.next()));
        }
        concurrentHashMap = c0333s0.f331a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl((InterfaceC3527b) this.f336a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Result a4 = Result.a(m243constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, a4);
            obj3 = putIfAbsent == null ? a4 : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((Result) obj3).h();
    }
}
