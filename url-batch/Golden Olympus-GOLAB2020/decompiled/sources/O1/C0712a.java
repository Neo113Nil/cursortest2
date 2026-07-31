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

/* renamed from: O1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0712a implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5569c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5570d = C0038a.f5573i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5571a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5572b;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    static final class C0038a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final C0038a f5573i = new C0038a();

        C0038a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0712a invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0712a.f5569c.a(env, it);
        }
    }

    /* renamed from: O1.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0712a a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0730b) BuiltInParserKt.getBuiltInParserComponent().a().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0712a(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5571a = value;
    }

    public final boolean a(C0712a c0712a, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0712a == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f5571a.evaluate(resolver), c0712a.f5571a.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5572b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0712a.class).hashCode() + this.f5571a.hashCode();
        this.f5572b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0730b) BuiltInParserKt.getBuiltInParserComponent().a().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
