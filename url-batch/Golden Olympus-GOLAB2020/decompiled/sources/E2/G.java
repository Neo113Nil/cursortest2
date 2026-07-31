package E2;

import A2.k;
import D2.AbstractC0348a;
import E2.C0393y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;

/* loaded from: classes3.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final C0393y.a f516a = new C0393y.a();

    /* renamed from: b, reason: collision with root package name */
    private static final C0393y.a f517b = new C0393y.a();

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ A2.f f518i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC0348a f519j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A2.f fVar, AbstractC0348a abstractC0348a) {
            super(0);
            this.f518i = fVar;
            this.f519j = abstractC0348a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return G.b(this.f518i, this.f519j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(A2.f fVar, AbstractC0348a abstractC0348a) {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k(fVar, abstractC0348a);
        int f4 = fVar.f();
        for (int i4 = 0; i4 < f4; i4++) {
            List h4 = fVar.h(i4);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h4) {
                if (obj instanceof D2.s) {
                    arrayList.add(obj);
                }
            }
            D2.s sVar = (D2.s) CollectionsKt.singleOrNull((List) arrayList);
            if (sVar != null && (names = sVar.names()) != null) {
                for (String str : names) {
                    c(linkedHashMap, fVar, str, i4);
                }
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    private static final void c(Map map, A2.f fVar, String str, int i4) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i4));
            return;
        }
        throw new E("The suggested name '" + str + "' for property " + fVar.g(i4) + " is already one of the names for property " + fVar.g(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + fVar);
    }

    public static final Map d(AbstractC0348a abstractC0348a, A2.f descriptor) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) D2.B.a(abstractC0348a).b(descriptor, f516a, new a(descriptor, abstractC0348a));
    }

    public static final C0393y.a e() {
        return f516a;
    }

    public static final String f(A2.f fVar, AbstractC0348a json, int i4) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        k(fVar, json);
        return fVar.g(i4);
    }

    public static final int g(A2.f fVar, AbstractC0348a json, String name) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        k(fVar, json);
        int d4 = fVar.d(name);
        return (d4 == -3 && json.d().k()) ? h(json, fVar, name) : d4;
    }

    private static final int h(AbstractC0348a abstractC0348a, A2.f fVar, String str) {
        Integer num = (Integer) d(abstractC0348a, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int i(A2.f fVar, AbstractC0348a json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int g4 = g(fVar, json, name);
        if (g4 != -3) {
            return g4;
        }
        throw new C3534i(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int j(A2.f fVar, AbstractC0348a abstractC0348a, String str, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, abstractC0348a, str, str2);
    }

    public static final D2.t k(A2.f fVar, AbstractC0348a json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(fVar.e(), k.a.f99a)) {
            json.d().h();
        }
        return null;
    }
}
