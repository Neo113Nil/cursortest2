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
public abstract class Tc implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4874b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4875c = a.f4877i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4876a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4877i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Tc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Tc.f4874b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Tc a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Zc) BuiltInParserKt.getBuiltInParserComponent().C7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Tc {

        /* renamed from: d, reason: collision with root package name */
        private final Uc f4878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4878d = value;
        }

        public final Uc c() {
            return this.f4878d;
        }
    }

    public static final class d extends Tc {

        /* renamed from: d, reason: collision with root package name */
        private final C0762cd f4879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0762cd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4879d = value;
        }

        public final C0762cd c() {
            return this.f4879d;
        }
    }

    public /* synthetic */ Tc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Tc tc, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (tc == null) {
            return false;
        }
        if (this instanceof d) {
            C0762cd c4 = ((d) this).c();
            Object b4 = tc.b();
            return c4.a(b4 instanceof C0762cd ? (C0762cd) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        Uc c5 = ((c) this).c();
        Object b5 = tc.b();
        return c5.a(b5 instanceof Uc ? (Uc) b5 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f4876a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new W1.m();
            }
            hash = ((c) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f4876a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Zc) BuiltInParserKt.getBuiltInParserComponent().C7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Tc() {
    }
}
