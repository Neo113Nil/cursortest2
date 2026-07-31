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
public abstract class O2 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4188b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4189c = a.f4191i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4190a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4191i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return O2.f4188b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final O2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((P2) BuiltInParserKt.getBuiltInParserComponent().w1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends O2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1022r5 f4192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1022r5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4192d = value;
        }

        public final C1022r5 c() {
            return this.f4192d;
        }
    }

    public static final class d extends O2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0796eb f4193d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0796eb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4193d = value;
        }

        public final C0796eb c() {
            return this.f4193d;
        }
    }

    public static final class e extends O2 {

        /* renamed from: d, reason: collision with root package name */
        private final K2 f4194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(K2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4194d = value;
        }

        public final K2 c() {
            return this.f4194d;
        }
    }

    public static final class f extends O2 {

        /* renamed from: d, reason: collision with root package name */
        private final C0797ec f4195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0797ec value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4195d = value;
        }

        public final C0797ec c() {
            return this.f4195d;
        }
    }

    public /* synthetic */ O2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(O2 o22, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (o22 == null) {
            return false;
        }
        if (this instanceof e) {
            K2 c4 = ((e) this).c();
            Object b4 = o22.b();
            return c4.a(b4 instanceof K2 ? (K2) b4 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            C1022r5 c5 = ((c) this).c();
            Object b5 = o22.b();
            return c5.a(b5 instanceof C1022r5 ? (C1022r5) b5 : null, resolver, otherResolver);
        }
        if (this instanceof d) {
            C0796eb c6 = ((d) this).c();
            Object b6 = o22.b();
            return c6.a(b6 instanceof C0796eb ? (C0796eb) b6 : null, resolver, otherResolver);
        }
        if (!(this instanceof f)) {
            throw new W1.m();
        }
        C0797ec c7 = ((f) this).c();
        Object b7 = o22.b();
        return c7.a(b7 instanceof C0797ec ? (C0797ec) b7 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f4190a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof e) {
            hash = ((e) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof f)) {
                throw new W1.m();
            }
            hash = ((f) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f4190a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((P2) BuiltInParserKt.getBuiltInParserComponent().w1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private O2() {
    }
}
