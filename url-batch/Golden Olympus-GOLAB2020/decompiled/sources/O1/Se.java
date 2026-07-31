package O1;

import O1.Ue;
import O1.Ve;
import com.ironsource.b9;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Se implements JSONSerializable, Hashable {

    /* renamed from: m, reason: collision with root package name */
    public static final b f4807m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f4808n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f4809o;

    /* renamed from: p, reason: collision with root package name */
    private static final Ve.c f4810p;

    /* renamed from: q, reason: collision with root package name */
    private static final Function2 f4811q;

    /* renamed from: a, reason: collision with root package name */
    public final C1127x2 f4812a;

    /* renamed from: b, reason: collision with root package name */
    public final C1127x2 f4813b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f4814c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f4815d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f4816e;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f4817f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4818g;

    /* renamed from: h, reason: collision with root package name */
    public final Ve f4819h;

    /* renamed from: i, reason: collision with root package name */
    public final C1081ua f4820i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f4821j;

    /* renamed from: k, reason: collision with root package name */
    public final List f4822k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f4823l;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4824i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Se invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Se.f4807m.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Se a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ue.c) BuiltInParserKt.getBuiltInParserComponent().J8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public enum c {
        LEFT("left"),
        TOP_LEFT(b9.e.f15361c),
        TOP("top"),
        TOP_RIGHT(b9.e.f15360b),
        RIGHT("right"),
        BOTTOM_RIGHT(b9.e.f15362d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(b9.e.f15363e),
        CENTER("center");


        /* renamed from: c, reason: collision with root package name */
        public static final C0035c f4825c = new C0035c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f4826d = b.f4840i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f4827e = a.f4839i;

        /* renamed from: b, reason: collision with root package name */
        private final String f4838b;

        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f4839i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f4825c.a(value);
            }
        }

        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f4840i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f4825c.b(value);
            }
        }

        /* renamed from: O1.Se$c$c, reason: collision with other inner class name */
        public static final class C0035c {
            public /* synthetic */ C0035c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.LEFT;
                if (Intrinsics.areEqual(value, cVar.f4838b)) {
                    return cVar;
                }
                c cVar2 = c.TOP_LEFT;
                if (Intrinsics.areEqual(value, cVar2.f4838b)) {
                    return cVar2;
                }
                c cVar3 = c.TOP;
                if (Intrinsics.areEqual(value, cVar3.f4838b)) {
                    return cVar3;
                }
                c cVar4 = c.TOP_RIGHT;
                if (Intrinsics.areEqual(value, cVar4.f4838b)) {
                    return cVar4;
                }
                c cVar5 = c.RIGHT;
                if (Intrinsics.areEqual(value, cVar5.f4838b)) {
                    return cVar5;
                }
                c cVar6 = c.BOTTOM_RIGHT;
                if (Intrinsics.areEqual(value, cVar6.f4838b)) {
                    return cVar6;
                }
                c cVar7 = c.BOTTOM;
                if (Intrinsics.areEqual(value, cVar7.f4838b)) {
                    return cVar7;
                }
                c cVar8 = c.BOTTOM_LEFT;
                if (Intrinsics.areEqual(value, cVar8.f4838b)) {
                    return cVar8;
                }
                c cVar9 = c.CENTER;
                if (Intrinsics.areEqual(value, cVar9.f4838b)) {
                    return cVar9;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f4838b;
            }

            private C0035c() {
            }
        }

        c(String str) {
            this.f4838b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4808n = companion.constant(Boolean.TRUE);
        f4809o = companion.constant(5000L);
        f4810p = new Ve.c(new Ze());
        f4811q = a.f4824i;
    }

    public Se(C1127x2 c1127x2, C1127x2 c1127x22, Expression expression, Expression closeByTapOutside, Z div, Expression duration, String id, Ve mode, C1081ua c1081ua, Expression position, List list) {
        Intrinsics.checkNotNullParameter(closeByTapOutside, "closeByTapOutside");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f4812a = c1127x2;
        this.f4813b = c1127x22;
        this.f4814c = expression;
        this.f4815d = closeByTapOutside;
        this.f4816e = div;
        this.f4817f = duration;
        this.f4818g = id;
        this.f4819h = mode;
        this.f4820i = c1081ua;
        this.f4821j = position;
        this.f4822k = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        if (r8 == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Se se, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        boolean z4;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (se == null) {
            return false;
        }
        C1127x2 c1127x2 = this.f4812a;
        if (c1127x2 != null ? c1127x2.a(se.f4812a, resolver, otherResolver) : se.f4812a == null) {
            C1127x2 c1127x22 = this.f4813b;
            if (c1127x22 != null ? c1127x22.a(se.f4813b, resolver, otherResolver) : se.f4813b == null) {
                Expression expression = this.f4814c;
                String str = expression != null ? (String) expression.evaluate(resolver) : null;
                Expression expression2 = se.f4814c;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null) && ((Boolean) this.f4815d.evaluate(resolver)).booleanValue() == ((Boolean) se.f4815d.evaluate(otherResolver)).booleanValue() && this.f4816e.a(se.f4816e, resolver, otherResolver) && ((Number) this.f4817f.evaluate(resolver)).longValue() == ((Number) se.f4817f.evaluate(otherResolver)).longValue() && Intrinsics.areEqual(this.f4818g, se.f4818g) && this.f4819h.a(se.f4819h, resolver, otherResolver)) {
                    C1081ua c1081ua = this.f4820i;
                    if ((c1081ua != null ? c1081ua.a(se.f4820i, resolver, otherResolver) : se.f4820i == null) && this.f4821j.evaluate(resolver) == se.f4821j.evaluate(otherResolver)) {
                        List list = this.f4822k;
                        List list2 = se.f4822k;
                        if (list != null) {
                            if (list2 != null) {
                                if (list.size() == list2.size()) {
                                    int i4 = 0;
                                    for (Object obj : list) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        if (((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
                                            i4 = i5;
                                        }
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                                break;
                            }
                            return false;
                        }
                        if (z4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4823l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Se.class).hashCode();
        C1127x2 c1127x2 = this.f4812a;
        int i4 = 0;
        int hash = hashCode + (c1127x2 != null ? c1127x2.hash() : 0);
        C1127x2 c1127x22 = this.f4813b;
        int hash2 = hash + (c1127x22 != null ? c1127x22.hash() : 0);
        Expression expression = this.f4814c;
        int hashCode2 = hash2 + (expression != null ? expression.hashCode() : 0) + this.f4815d.hashCode() + this.f4816e.hash() + this.f4817f.hashCode() + this.f4818g.hashCode() + this.f4819h.hash();
        C1081ua c1081ua = this.f4820i;
        int hash3 = hashCode2 + (c1081ua != null ? c1081ua.hash() : 0) + this.f4821j.hashCode();
        List list = this.f4822k;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        }
        int i5 = hash3 + i4;
        this.f4823l = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ue.c) BuiltInParserKt.getBuiltInParserComponent().J8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
