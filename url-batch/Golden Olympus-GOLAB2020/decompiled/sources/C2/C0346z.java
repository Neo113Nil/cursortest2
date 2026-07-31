package C2;

import g2.AbstractC2429a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0346z implements InterfaceC0335t0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f358a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f359b;

    public C0346z(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f358a = compute;
        this.f359b = new ConcurrentHashMap();
    }

    @Override // C2.InterfaceC0335t0
    public Object a(m2.c key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m243constructorimpl;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.f359b;
        Class a4 = AbstractC2429a.a(key);
        Object obj = concurrentHashMap2.get(a4);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(a4, (obj = new C0333s0()))) != null) {
            obj = putIfAbsent;
        }
        C0333s0 c0333s0 = (C0333s0) obj;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new X((m2.k) it.next()));
        }
        concurrentHashMap = c0333s0.f331a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl((InterfaceC3527b) this.f358a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Result a5 = Result.a(m243constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, a5);
            obj2 = putIfAbsent2 == null ? a5 : putIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((Result) obj2).h();
    }
}
