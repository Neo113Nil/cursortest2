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
public final class ch implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5982d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f5983e = a.f5987i;

    /* renamed from: a, reason: collision with root package name */
    public final String f5984a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f5985b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f5986c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5987i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ch invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return ch.f5982d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ch a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((dh) BuiltInParserKt.getBuiltInParserComponent().aa().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public ch(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5984a = name;
        this.f5985b = value;
    }

    public final boolean a(ch chVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return chVar != null && Intrinsics.areEqual(this.f5984a, chVar.f5984a) && Intrinsics.areEqual(this.f5985b.evaluate(resolver), chVar.f5985b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5986c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(ch.class).hashCode() + this.f5984a.hashCode() + this.f5985b.hashCode();
        this.f5986c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dh) BuiltInParserKt.getBuiltInParserComponent().aa().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
