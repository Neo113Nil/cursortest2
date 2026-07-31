package y2;

import C2.AbstractC0337u0;
import C2.AbstractC0339v0;
import C2.C0298a0;
import C2.C0302c0;
import C2.C0307f;
import C2.E0;
import C2.N;
import C2.P;
import W1.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.reflect.KTypeProjection;
import z2.AbstractC3551a;

/* renamed from: y2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3538m {

    /* renamed from: y2.m$a */
    static final class a extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f46790i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(0);
            this.f46790i = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m2.d invoke() {
            return ((m2.k) this.f46790i.get(0)).g();
        }
    }

    private static final InterfaceC3527b a(m2.c cVar, List list, Function0 function0) {
        if (Intrinsics.areEqual(cVar, H.b(Collection.class)) ? true : Intrinsics.areEqual(cVar, H.b(List.class)) ? true : Intrinsics.areEqual(cVar, H.b(List.class)) ? true : Intrinsics.areEqual(cVar, H.b(ArrayList.class))) {
            return new C0307f((InterfaceC3527b) list.get(0));
        }
        if (Intrinsics.areEqual(cVar, H.b(HashSet.class))) {
            return new P((InterfaceC3527b) list.get(0));
        }
        if (Intrinsics.areEqual(cVar, H.b(Set.class)) ? true : Intrinsics.areEqual(cVar, H.b(Set.class)) ? true : Intrinsics.areEqual(cVar, H.b(LinkedHashSet.class))) {
            return new C0302c0((InterfaceC3527b) list.get(0));
        }
        if (Intrinsics.areEqual(cVar, H.b(HashMap.class))) {
            return new N((InterfaceC3527b) list.get(0), (InterfaceC3527b) list.get(1));
        }
        if (Intrinsics.areEqual(cVar, H.b(Map.class)) ? true : Intrinsics.areEqual(cVar, H.b(Map.class)) ? true : Intrinsics.areEqual(cVar, H.b(LinkedHashMap.class))) {
            return new C0298a0((InterfaceC3527b) list.get(0), (InterfaceC3527b) list.get(1));
        }
        if (Intrinsics.areEqual(cVar, H.b(Map.Entry.class))) {
            return AbstractC3551a.j((InterfaceC3527b) list.get(0), (InterfaceC3527b) list.get(1));
        }
        if (Intrinsics.areEqual(cVar, H.b(Pair.class))) {
            return AbstractC3551a.m((InterfaceC3527b) list.get(0), (InterfaceC3527b) list.get(1));
        }
        if (Intrinsics.areEqual(cVar, H.b(q.class))) {
            return AbstractC3551a.o((InterfaceC3527b) list.get(0), (InterfaceC3527b) list.get(1), (InterfaceC3527b) list.get(2));
        }
        if (!AbstractC0337u0.k(cVar)) {
            return null;
        }
        Object invoke = function0.invoke();
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return AbstractC3551a.a((m2.c) invoke, (InterfaceC3527b) list.get(0));
    }

    private static final InterfaceC3527b b(m2.c cVar, List list) {
        InterfaceC3527b[] interfaceC3527bArr = (InterfaceC3527b[]) list.toArray(new InterfaceC3527b[0]);
        return AbstractC0337u0.d(cVar, (InterfaceC3527b[]) Arrays.copyOf(interfaceC3527bArr, interfaceC3527bArr.length));
    }

    private static final InterfaceC3527b c(InterfaceC3527b interfaceC3527b, boolean z4) {
        if (z4) {
            return AbstractC3551a.t(interfaceC3527b);
        }
        Intrinsics.checkNotNull(interfaceC3527b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return interfaceC3527b;
    }

    public static final InterfaceC3527b d(m2.c cVar, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        InterfaceC3527b a4 = a(cVar, serializers, elementClassifierIfArray);
        return a4 == null ? b(cVar, serializers) : a4;
    }

    public static final InterfaceC3527b e(F2.b bVar, m2.k type) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC3527b f4 = f(bVar, type, true);
        if (f4 != null) {
            return f4;
        }
        AbstractC0337u0.l(AbstractC0339v0.c(type));
        throw new W1.f();
    }

    private static final InterfaceC3527b f(F2.b bVar, m2.k kVar, boolean z4) {
        InterfaceC3527b interfaceC3527b;
        InterfaceC3527b b4;
        m2.c c4 = AbstractC0339v0.c(kVar);
        boolean d4 = kVar.d();
        List f4 = kVar.f();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(f4, 10));
        Iterator it = f4.iterator();
        while (it.hasNext()) {
            m2.k a4 = ((KTypeProjection) it.next()).a();
            if (a4 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kVar).toString());
            }
            arrayList.add(a4);
        }
        if (arrayList.isEmpty()) {
            interfaceC3527b = AbstractC3536k.a(c4, d4);
        } else {
            Object b5 = AbstractC3536k.b(c4, arrayList, d4);
            if (!z4) {
                if (Result.d(b5) == null) {
                    interfaceC3527b = (InterfaceC3527b) b5;
                }
                return null;
            }
            if (Result.m244isFailureimpl(b5)) {
                b5 = null;
            }
            interfaceC3527b = (InterfaceC3527b) b5;
        }
        if (interfaceC3527b != null) {
            return interfaceC3527b;
        }
        if (arrayList.isEmpty()) {
            b4 = F2.b.c(bVar, c4, null, 2, null);
        } else {
            List e4 = AbstractC3537l.e(bVar, arrayList, z4);
            if (e4 == null) {
                return null;
            }
            InterfaceC3527b a5 = AbstractC3537l.a(c4, e4, new a(arrayList));
            b4 = a5 == null ? bVar.b(c4, e4) : a5;
        }
        if (b4 != null) {
            return c(b4, d4);
        }
        return null;
    }

    public static final InterfaceC3527b g(F2.b bVar, m2.k type) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return f(bVar, type, false);
    }

    public static final InterfaceC3527b h(m2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        InterfaceC3527b b4 = AbstractC0337u0.b(cVar);
        return b4 == null ? E0.b(cVar) : b4;
    }

    public static final List i(F2.b bVar, List typeArguments, boolean z4) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z4) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3537l.b(bVar, (m2.k) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC3527b c4 = AbstractC3537l.c(bVar, (m2.k) it2.next());
            if (c4 == null) {
                return null;
            }
            arrayList2.add(c4);
        }
        return arrayList2;
    }
}
