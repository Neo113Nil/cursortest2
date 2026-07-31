package O1;

import O1.AbstractC0978oe;
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

/* renamed from: O1.me, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0942me implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7094d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7095e = a.f7099i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7096a;

    /* renamed from: b, reason: collision with root package name */
    public final Qc f7097b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7098c;

    /* renamed from: O1.me$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7099i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0942me invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0942me.f7094d.a(env, it);
        }
    }

    /* renamed from: O1.me$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0942me a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0978oe.b) BuiltInParserKt.getBuiltInParserComponent().p8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0942me(Expression expression, Qc qc) {
        this.f7096a = expression;
        this.f7097b = qc;
    }

    public final boolean a(C0942me c0942me, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0942me == null) {
            return false;
        }
        Expression expression = this.f7096a;
        Long l4 = expression != null ? (Long) expression.evaluate(resolver) : null;
        Expression expression2 = c0942me.f7096a;
        if (Intrinsics.areEqual(l4, expression2 != null ? (Long) expression2.evaluate(otherResolver) : null)) {
            Qc qc = this.f7097b;
            Qc qc2 = c0942me.f7097b;
            if (qc != null ? qc.a(qc2, resolver, otherResolver) : qc2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7098c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0942me.class).hashCode();
        Expression expression = this.f7096a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Qc qc = this.f7097b;
        int hash = hashCode2 + (qc != null ? qc.hash() : 0);
        this.f7098c = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0978oe.b) BuiltInParserKt.getBuiltInParserComponent().p8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
