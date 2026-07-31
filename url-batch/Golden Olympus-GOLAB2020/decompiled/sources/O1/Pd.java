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
public abstract class Pd implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4346b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4347c = a.f4349i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4348a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4349i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Pd.f4346b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pd a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Qd) BuiltInParserKt.getBuiltInParserComponent().a8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Pd {

        /* renamed from: d, reason: collision with root package name */
        private final A8 f4350d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4350d = value;
        }

        public final A8 c() {
            return this.f4350d;
        }
    }

    public static final class d extends Pd {

        /* renamed from: d, reason: collision with root package name */
        private final C1171za f4351d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1171za value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4351d = value;
        }

        public final C1171za c() {
            return this.f4351d;
        }
    }

    public /* synthetic */ Pd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Pd pd, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (pd == null) {
            return false;
        }
        if (this instanceof c) {
            A8 c4 = ((c) this).c();
            Object b4 = pd.b();
            return c4.a(b4 instanceof A8 ? (A8) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        C1171za c5 = ((d) this).c();
        Object b5 = pd.b();
        return c5.a(b5 instanceof C1171za ? (C1171za) b5 : null, resolver, otherResolver);
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
        Integer num = this.f4348a;
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
        this.f4348a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Qd) BuiltInParserKt.getBuiltInParserComponent().a8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Pd() {
    }
}
