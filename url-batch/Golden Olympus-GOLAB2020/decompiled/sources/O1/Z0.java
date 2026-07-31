package O1;

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
public final class Z0 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f5442e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f5443f = a.f5448i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5444a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1086uf f5445b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f5446c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f5447d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5448i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Z0.f5442e.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0714a1) BuiltInParserKt.getBuiltInParserComponent().i0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Z0(Expression key, AbstractC1086uf abstractC1086uf, Expression variableName) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f5444a = key;
        this.f5445b = abstractC1086uf;
        this.f5446c = variableName;
    }

    public final boolean a(Z0 z02, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (z02 != null && Intrinsics.areEqual(this.f5444a.evaluate(resolver), z02.f5444a.evaluate(otherResolver))) {
            AbstractC1086uf abstractC1086uf = this.f5445b;
            if ((abstractC1086uf != null ? abstractC1086uf.a(z02.f5445b, resolver, otherResolver) : z02.f5445b == null) && Intrinsics.areEqual(this.f5446c.evaluate(resolver), z02.f5446c.evaluate(otherResolver))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5447d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Z0.class).hashCode() + this.f5444a.hashCode();
        AbstractC1086uf abstractC1086uf = this.f5445b;
        int hash = hashCode + (abstractC1086uf != null ? abstractC1086uf.hash() : 0) + this.f5446c.hashCode();
        this.f5447d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0714a1) BuiltInParserKt.getBuiltInParserComponent().i0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
