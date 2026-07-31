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
public abstract class Nb implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f4155b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4156c = b.f4159i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4157a;

    public static final class a extends Nb {

        /* renamed from: d, reason: collision with root package name */
        private final A3 f4158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4158d = value;
        }

        public final A3 c() {
            return this.f4158d;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f4159i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Nb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Nb.f4155b.a(env, it);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Nb a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Tb) BuiltInParserKt.getBuiltInParserComponent().S6().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public static final class d extends Nb {

        /* renamed from: d, reason: collision with root package name */
        private final C0742bb f4160d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0742bb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4160d = value;
        }

        public final C0742bb c() {
            return this.f4160d;
        }
    }

    public /* synthetic */ Nb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Nb nb, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (nb == null) {
            return false;
        }
        if (this instanceof d) {
            C0742bb c4 = ((d) this).c();
            Object b4 = nb.b();
            return c4.a(b4 instanceof C0742bb ? (C0742bb) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof a)) {
            throw new W1.m();
        }
        A3 c5 = ((a) this).c();
        Object b5 = nb.b();
        return c5.a(b5 instanceof A3 ? (A3) b5 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f4157a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new W1.m();
            }
            hash = ((a) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f4157a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Tb) BuiltInParserKt.getBuiltInParserComponent().S6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Nb() {
    }
}
