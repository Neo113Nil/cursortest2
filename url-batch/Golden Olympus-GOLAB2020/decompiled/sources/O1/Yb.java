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
public abstract class Yb implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5408b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5409c = a.f5411i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5410a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5411i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Yb.f5408b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Yb a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Zb) BuiltInParserKt.getBuiltInParserComponent().V6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Yb {

        /* renamed from: d, reason: collision with root package name */
        private final S5 f5412d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5412d = value;
        }

        public final S5 c() {
            return this.f5412d;
        }
    }

    public static final class d extends Yb {

        /* renamed from: d, reason: collision with root package name */
        private final I8 f5413d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(I8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5413d = value;
        }

        public final I8 c() {
            return this.f5413d;
        }
    }

    public static final class e extends Yb {

        /* renamed from: d, reason: collision with root package name */
        private final C0765cg f5414d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0765cg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5414d = value;
        }

        public final C0765cg c() {
            return this.f5414d;
        }
    }

    public /* synthetic */ Yb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Yb yb, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (yb == null) {
            return false;
        }
        if (this instanceof c) {
            S5 c4 = ((c) this).c();
            Object b4 = yb.b();
            return c4.a(b4 instanceof S5 ? (S5) b4 : null, resolver, otherResolver);
        }
        if (this instanceof d) {
            I8 c5 = ((d) this).c();
            Object b5 = yb.b();
            return c5.a(b5 instanceof I8 ? (I8) b5 : null, resolver, otherResolver);
        }
        if (!(this instanceof e)) {
            throw new W1.m();
        }
        C0765cg c6 = ((e) this).c();
        Object b6 = yb.b();
        return c6.a(b6 instanceof C0765cg ? (C0765cg) b6 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f5410a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new W1.m();
            }
            hash = ((e) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f5410a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Zb) BuiltInParserKt.getBuiltInParserComponent().V6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Yb() {
    }
}
