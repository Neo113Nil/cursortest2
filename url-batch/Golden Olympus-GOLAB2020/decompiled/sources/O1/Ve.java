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
public abstract class Ve implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5035b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5036c = a.f5038i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5037a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5038i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ve invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ve.f5035b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ve a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((We) BuiltInParserKt.getBuiltInParserComponent().M8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Ve {

        /* renamed from: d, reason: collision with root package name */
        private final Ze f5039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ze value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5039d = value;
        }

        public final Ze c() {
            return this.f5039d;
        }
    }

    public static final class d extends Ve {

        /* renamed from: d, reason: collision with root package name */
        private final C0800ef f5040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0800ef value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5040d = value;
        }

        public final C0800ef c() {
            return this.f5040d;
        }
    }

    public /* synthetic */ Ve(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Ve ve, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (ve == null) {
            return false;
        }
        if (this instanceof d) {
            C0800ef c4 = ((d) this).c();
            Object b4 = ve.b();
            return c4.a(b4 instanceof C0800ef ? (C0800ef) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        Ze c5 = ((c) this).c();
        Object b5 = ve.b();
        return c5.a(b5 instanceof Ze ? (Ze) b5 : null, resolver, otherResolver);
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
        Integer num = this.f5037a;
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
        this.f5037a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((We) BuiltInParserKt.getBuiltInParserComponent().M8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Ve() {
    }
}
