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
public final class R8 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4645d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f4646e = a.f4650i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4647a;

    /* renamed from: b, reason: collision with root package name */
    public final C0713a0 f4648b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4649c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4650i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return R8.f4645d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final R8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((S8) BuiltInParserKt.getBuiltInParserComponent().b5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public R8(Expression imageUrl, C0713a0 insets) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f4647a = imageUrl;
        this.f4648b = insets;
    }

    public final boolean a(R8 r8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return r8 != null && Intrinsics.areEqual(this.f4647a.evaluate(resolver), r8.f4647a.evaluate(otherResolver)) && this.f4648b.a(r8.f4648b, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4649c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(R8.class).hashCode() + this.f4647a.hashCode() + this.f4648b.hash();
        this.f4649c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((S8) BuiltInParserKt.getBuiltInParserComponent().b5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
