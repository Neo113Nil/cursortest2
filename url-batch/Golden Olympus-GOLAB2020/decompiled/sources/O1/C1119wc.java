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

/* renamed from: O1.wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1119wc implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8339c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f8340d = a.f8343i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8341a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8342b;

    /* renamed from: O1.wc$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8343i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1119wc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1119wc.f8339c.a(env, it);
        }
    }

    /* renamed from: O1.wc$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1119wc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1137xc) BuiltInParserKt.getBuiltInParserComponent().k7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1119wc(Expression color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f8341a = color;
    }

    public final boolean a(C1119wc c1119wc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1119wc != null && ((Number) this.f8341a.evaluate(resolver)).intValue() == ((Number) c1119wc.f8341a.evaluate(otherResolver)).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8342b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1119wc.class).hashCode() + this.f8341a.hashCode();
        this.f8342b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1137xc) BuiltInParserKt.getBuiltInParserComponent().k7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
