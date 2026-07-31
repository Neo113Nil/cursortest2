package O1;

import O1.AbstractC1144y1;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1126x1 implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f8374g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f8375h;

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f8376i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f8377j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f8378k;

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f8379l;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8380a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f8381b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f8382c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f8383d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f8384e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8385f;

    /* renamed from: O1.x1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8386i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1126x1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1126x1.f8374g.a(env, it);
        }
    }

    /* renamed from: O1.x1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1126x1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1144y1.c) BuiltInParserKt.getBuiltInParserComponent().A0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.x1$c */
    public enum c {
        CLAMP("clamp"),
        RING("ring");


        /* renamed from: c, reason: collision with root package name */
        public static final C0052c f8387c = new C0052c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f8388d = b.f8395i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f8389e = a.f8394i;

        /* renamed from: b, reason: collision with root package name */
        private final String f8393b;

        /* renamed from: O1.x1$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8394i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f8387c.a(value);
            }
        }

        /* renamed from: O1.x1$c$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f8395i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f8387c.b(value);
            }
        }

        /* renamed from: O1.x1$c$c, reason: collision with other inner class name */
        public static final class C0052c {
            public /* synthetic */ C0052c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.CLAMP;
                if (Intrinsics.areEqual(value, cVar.f8393b)) {
                    return cVar;
                }
                c cVar2 = c.RING;
                if (Intrinsics.areEqual(value, cVar2.f8393b)) {
                    return cVar2;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f8393b;
            }

            private C0052c() {
            }
        }

        c(String str) {
            this.f8393b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8375h = companion.constant(Boolean.TRUE);
        f8376i = companion.constant(0L);
        f8377j = companion.constant(0L);
        f8378k = companion.constant(c.CLAMP);
        f8379l = a.f8386i;
    }

    public C1126x1(Expression animated, Expression id, Expression itemCount, Expression offset, Expression overflow) {
        Intrinsics.checkNotNullParameter(animated, "animated");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(itemCount, "itemCount");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(overflow, "overflow");
        this.f8380a = animated;
        this.f8381b = id;
        this.f8382c = itemCount;
        this.f8383d = offset;
        this.f8384e = overflow;
    }

    public final boolean a(C1126x1 c1126x1, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1126x1 != null && ((Boolean) this.f8380a.evaluate(resolver)).booleanValue() == ((Boolean) c1126x1.f8380a.evaluate(otherResolver)).booleanValue() && Intrinsics.areEqual(this.f8381b.evaluate(resolver), c1126x1.f8381b.evaluate(otherResolver)) && ((Number) this.f8382c.evaluate(resolver)).longValue() == ((Number) c1126x1.f8382c.evaluate(otherResolver)).longValue() && ((Number) this.f8383d.evaluate(resolver)).longValue() == ((Number) c1126x1.f8383d.evaluate(otherResolver)).longValue() && this.f8384e.evaluate(resolver) == c1126x1.f8384e.evaluate(otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8385f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1126x1.class).hashCode() + this.f8380a.hashCode() + this.f8381b.hashCode() + this.f8382c.hashCode() + this.f8383d.hashCode() + this.f8384e.hashCode();
        this.f8385f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1144y1.c) BuiltInParserKt.getBuiltInParserComponent().A0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
