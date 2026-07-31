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
public abstract class T7 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4863b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f4864c = a.f4866i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f4865a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4866i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return T7.f4863b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final T7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((V7) BuiltInParserKt.getBuiltInParserComponent().s4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends T7 {

        /* renamed from: d, reason: collision with root package name */
        private final C0950n4 f4867d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0950n4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4867d = value;
        }

        public final C0950n4 c() {
            return this.f4867d;
        }
    }

    public static final class d extends T7 {

        /* renamed from: d, reason: collision with root package name */
        private final L5 f4868d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4868d = value;
        }

        public final L5 c() {
            return this.f4868d;
        }
    }

    public static final class e extends T7 {

        /* renamed from: d, reason: collision with root package name */
        private final C0759ca f4869d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0759ca value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4869d = value;
        }

        public final C0759ca c() {
            return this.f4869d;
        }
    }

    public /* synthetic */ T7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(T7 t7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (t7 == null) {
            return false;
        }
        if (this instanceof d) {
            L5 c4 = ((d) this).c();
            U7 b4 = t7.b();
            return c4.b(b4 instanceof L5 ? (L5) b4 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            C0950n4 c5 = ((c) this).c();
            U7 b5 = t7.b();
            return c5.b(b5 instanceof C0950n4 ? (C0950n4) b5 : null, resolver, otherResolver);
        }
        if (!(this instanceof e)) {
            throw new W1.m();
        }
        C0759ca c6 = ((e) this).c();
        U7 b6 = t7.b();
        return c6.b(b6 instanceof C0759ca ? (C0759ca) b6 : null, resolver, otherResolver);
    }

    public final U7 b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f4865a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new W1.m();
            }
            hash = ((e) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f4865a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((V7) BuiltInParserKt.getBuiltInParserComponent().s4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private T7() {
    }
}
