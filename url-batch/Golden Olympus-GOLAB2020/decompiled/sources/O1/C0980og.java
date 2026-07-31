package O1;

import O1.AbstractC1016qg;
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

/* renamed from: O1.og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0980og implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f7426c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f7427d = a.f7430i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7428a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7429b;

    /* renamed from: O1.og$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7430i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0980og invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0980og.f7426c.a(env, it);
        }
    }

    /* renamed from: O1.og$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0980og a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1016qg.b) BuiltInParserKt.getBuiltInParserComponent().C9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0980og(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7428a = value;
    }

    public final boolean a(C0980og c0980og, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0980og != null && ((Number) this.f7428a.evaluate(resolver)).longValue() == ((Number) c0980og.f7428a.evaluate(otherResolver)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7429b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0980og.class).hashCode() + this.f7428a.hashCode();
        this.f7429b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1016qg.b) BuiltInParserKt.getBuiltInParserComponent().C9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
