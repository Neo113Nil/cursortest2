package O1;

import O1.AbstractC0811f8;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.e8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0793e8 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6089e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f6090f = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f6091g = a.f6096i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6092a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6093b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6094c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6095d;

    /* renamed from: O1.e8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6096i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0793e8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0793e8.f6089e.a(env, it);
        }
    }

    /* renamed from: O1.e8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0793e8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0811f8.b) BuiltInParserKt.getBuiltInParserComponent().y4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0793e8(Expression allowEmpty, Expression expression, String str) {
        Intrinsics.checkNotNullParameter(allowEmpty, "allowEmpty");
        this.f6092a = allowEmpty;
        this.f6093b = expression;
        this.f6094c = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6095d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0793e8.class).hashCode() + this.f6092a.hashCode();
        Expression expression = this.f6093b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.f6094c;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f6095d = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0811f8.b) BuiltInParserKt.getBuiltInParserComponent().y4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
