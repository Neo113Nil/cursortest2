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
public abstract class E2 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f2503b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f2504c = b.f2507i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f2505a;

    public static final class a extends E2 {

        /* renamed from: d, reason: collision with root package name */
        private final M3 f2506d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2506d = value;
        }

        public final M3 c() {
            return this.f2506d;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f2507i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return E2.f2503b.a(env, it);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((G2) BuiltInParserKt.getBuiltInParserComponent().q1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public static final class d extends E2 {

        /* renamed from: d, reason: collision with root package name */
        private final W8 f2508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(W8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2508d = value;
        }

        public final W8 c() {
            return this.f2508d;
        }
    }

    public /* synthetic */ E2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(E2 e22, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (e22 == null) {
            return false;
        }
        if (this instanceof a) {
            M3 c4 = ((a) this).c();
            F2 b4 = e22.b();
            return c4.g(b4 instanceof M3 ? (M3) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        W8 c5 = ((d) this).c();
        F2 b5 = e22.b();
        return c5.g(b5 instanceof W8 ? (W8) b5 : null, resolver, otherResolver);
    }

    public final F2 b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f2505a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof a) {
            hash = ((a) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new W1.m();
            }
            hash = ((d) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f2505a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((G2) BuiltInParserKt.getBuiltInParserComponent().q1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private E2() {
    }
}
