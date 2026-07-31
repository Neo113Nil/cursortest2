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
public abstract class Q0 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4359b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4360c = a.f4362i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4361a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4362i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Q0.f4359b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Q0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((R0) BuiltInParserKt.getBuiltInParserComponent().c0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Q0 {

        /* renamed from: d, reason: collision with root package name */
        private final E f4363d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4363d = value;
        }

        public final E c() {
            return this.f4363d;
        }
    }

    public static final class d extends Q0 {

        /* renamed from: d, reason: collision with root package name */
        private final J f4364d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4364d = value;
        }

        public final J c() {
            return this.f4364d;
        }
    }

    public /* synthetic */ Q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Q0 q02, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (q02 == null) {
            return false;
        }
        if (this instanceof c) {
            E c4 = ((c) this).c();
            Object b4 = q02.b();
            return c4.a(b4 instanceof E ? (E) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        J c5 = ((d) this).c();
        Object b5 = q02.b();
        return c5.a(b5 instanceof J ? (J) b5 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f4361a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new W1.m();
            }
            hash = ((d) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f4361a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((R0) BuiltInParserKt.getBuiltInParserComponent().c0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Q0() {
    }
}
