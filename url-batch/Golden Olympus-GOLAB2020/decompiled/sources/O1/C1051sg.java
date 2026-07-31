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

/* renamed from: O1.sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1051sg implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7951c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7952d = a.f7955i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7953a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7954b;

    /* renamed from: O1.sg$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7955i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1051sg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1051sg.f7951c.a(env, it);
        }
    }

    /* renamed from: O1.sg$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1051sg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1069tg) BuiltInParserKt.getBuiltInParserComponent().F9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1051sg(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7953a = value;
    }

    public final boolean a(C1051sg c1051sg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1051sg != null && ((Number) this.f7953a.evaluate(resolver)).longValue() == ((Number) c1051sg.f7953a.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7954b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1051sg.class).hashCode() + this.f7953a.hashCode();
        this.f7954b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1069tg) BuiltInParserKt.getBuiltInParserComponent().F9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
