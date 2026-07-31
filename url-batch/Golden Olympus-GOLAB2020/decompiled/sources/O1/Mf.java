package O1;

import O1.Sf;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Mf implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f4055f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f4056g = a.f4062i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4059c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f4060d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f4061e;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4062i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Mf.f4055f.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Mf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Nf) BuiltInParserKt.getBuiltInParserComponent().k9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f4063d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f4064e = a.f4068i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f4065a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f4066b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4067c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f4068i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f4063d.a(env, it);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Sf.b) BuiltInParserKt.getBuiltInParserComponent().n9().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Expression height, Expression width) {
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(width, "width");
            this.f4065a = height;
            this.f4066b = width;
        }

        public final boolean a(c cVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return cVar != null && ((Number) this.f4065a.evaluate(resolver)).longValue() == ((Number) cVar.f4065a.evaluate(otherResolver)).longValue() && ((Number) this.f4066b.evaluate(resolver)).longValue() == ((Number) cVar.f4066b.evaluate(otherResolver)).longValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f4067c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f4065a.hashCode() + this.f4066b.hashCode();
            this.f4067c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Sf.b) BuiltInParserKt.getBuiltInParserComponent().n9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public Mf(Expression expression, Expression mimeType, c cVar, Expression url) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f4057a = expression;
        this.f4058b = mimeType;
        this.f4059c = cVar;
        this.f4060d = url;
    }

    public final boolean a(Mf mf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (mf == null) {
            return false;
        }
        Expression expression = this.f4057a;
        Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
        Expression expression2 = mf.f4057a;
        if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null) && Intrinsics.areEqual(this.f4058b.evaluate(resolver), mf.f4058b.evaluate(otherResolver))) {
            c cVar = this.f4059c;
            if ((cVar != null ? cVar.a(mf.f4059c, resolver, otherResolver) : mf.f4059c == null) && Intrinsics.areEqual(this.f4060d.evaluate(resolver), mf.f4060d.evaluate(otherResolver))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4061e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Mf.class).hashCode();
        Expression expression = this.f4057a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f4058b.hashCode();
        c cVar = this.f4059c;
        int hash = hashCode2 + (cVar != null ? cVar.hash() : 0) + this.f4060d.hashCode();
        this.f4061e = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Nf) BuiltInParserKt.getBuiltInParserComponent().k9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
