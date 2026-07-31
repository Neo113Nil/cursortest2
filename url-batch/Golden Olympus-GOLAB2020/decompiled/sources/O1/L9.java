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
public abstract class L9 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3700b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f3701c = a.f3703i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f3702a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3703i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return L9.f3700b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((M9) BuiltInParserKt.getBuiltInParserComponent().z5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends L9 {

        /* renamed from: d, reason: collision with root package name */
        private final M8 f3704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(M8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3704d = value;
        }

        public final M8 c() {
            return this.f3704d;
        }
    }

    public static final class d extends L9 {

        /* renamed from: d, reason: collision with root package name */
        private final C0740b9 f3705d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0740b9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3705d = value;
        }

        public final C0740b9 c() {
            return this.f3705d;
        }
    }

    public static final class e extends L9 {

        /* renamed from: d, reason: collision with root package name */
        private final C0830g9 f3706d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0830g9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3706d = value;
        }

        public final C0830g9 c() {
            return this.f3706d;
        }
    }

    public /* synthetic */ L9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(L9 l9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (l9 == null) {
            return false;
        }
        if (this instanceof e) {
            C0830g9 c4 = ((e) this).c();
            Object b4 = l9.b();
            return c4.a(b4 instanceof C0830g9 ? (C0830g9) b4 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            M8 c5 = ((c) this).c();
            Object b5 = l9.b();
            return c5.a(b5 instanceof M8 ? (M8) b5 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        C0740b9 c6 = ((d) this).c();
        Object b6 = l9.b();
        return c6.a(b6 instanceof C0740b9 ? (C0740b9) b6 : null, resolver, otherResolver);
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
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f3702a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof e) {
            hash = ((e) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new W1.m();
            }
            hash = ((d) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f3702a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((M9) BuiltInParserKt.getBuiltInParserComponent().z5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private L9() {
    }
}
