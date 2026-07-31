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
public abstract class Na implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4149b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4150c = a.f4152i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4151a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4152i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Na invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Na.f4149b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Na a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Oa) BuiltInParserKt.getBuiltInParserComponent().l6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Na {

        /* renamed from: d, reason: collision with root package name */
        private final S5 f4153d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4153d = value;
        }

        public final S5 c() {
            return this.f4153d;
        }
    }

    public static final class d extends Na {

        /* renamed from: d, reason: collision with root package name */
        private final Xa f4154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Xa value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4154d = value;
        }

        public final Xa c() {
            return this.f4154d;
        }
    }

    public /* synthetic */ Na(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Na na, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (na == null) {
            return false;
        }
        if (this instanceof c) {
            S5 c4 = ((c) this).c();
            Object b4 = na.b();
            return c4.a(b4 instanceof S5 ? (S5) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        Xa c5 = ((d) this).c();
        Object b5 = na.b();
        return c5.a(b5 instanceof Xa ? (Xa) b5 : null, resolver, otherResolver);
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
        Integer num = this.f4151a;
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
        this.f4151a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Oa) BuiltInParserKt.getBuiltInParserComponent().l6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Na() {
    }
}
