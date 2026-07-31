package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class X4 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5212b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5213c = a.f5215i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5214a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5215i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return X4.f5212b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Y4) BuiltInParserKt.getBuiltInParserComponent().S2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends X4 {

        /* renamed from: d, reason: collision with root package name */
        private final Ob f5216d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ob value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5216d = value;
        }

        public final Ob c() {
            return this.f5216d;
        }
    }

    public /* synthetic */ X4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(X4 x4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (x4 == null) {
            return false;
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        Ob c4 = ((c) this).c();
        Object b4 = x4.b();
        return c4.a(b4 instanceof Ob ? (Ob) b4 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5214a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        int hash = hashCode + ((c) this).c().hash();
        this.f5214a = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Y4) BuiltInParserKt.getBuiltInParserComponent().S2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private X4() {
    }
}
