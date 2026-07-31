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

/* renamed from: O1.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0981p implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7432d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7433e = a.f7437i;

    /* renamed from: a, reason: collision with root package name */
    public final String f7434a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7435b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7436c;

    /* renamed from: O1.p$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7437i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0981p invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0981p.f7432d.a(env, it);
        }
    }

    /* renamed from: O1.p$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0981p a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0999q) BuiltInParserKt.getBuiltInParserComponent().j().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0981p(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7434a = name;
        this.f7435b = value;
    }

    public final boolean a(C0981p c0981p, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0981p != null && Intrinsics.areEqual(this.f7434a, c0981p.f7434a) && ((Boolean) this.f7435b.evaluate(resolver)).booleanValue() == ((Boolean) c0981p.f7435b.evaluate(otherResolver)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7436c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0981p.class).hashCode() + this.f7434a.hashCode() + this.f7435b.hashCode();
        this.f7436c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0999q) BuiltInParserKt.getBuiltInParserComponent().j().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
