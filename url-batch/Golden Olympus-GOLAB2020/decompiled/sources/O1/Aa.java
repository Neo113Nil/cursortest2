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
public abstract class Aa implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1323b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f1324c = a.f1326i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f1325a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1326i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Aa invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Aa.f1323b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Aa a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ba) BuiltInParserKt.getBuiltInParserComponent().Z5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Aa {

        /* renamed from: d, reason: collision with root package name */
        private final Ha f1327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ha value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1327d = value;
        }

        public final Ha c() {
            return this.f1327d;
        }
    }

    public static final class d extends Aa {

        /* renamed from: d, reason: collision with root package name */
        private final Sa f1328d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Sa value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1328d = value;
        }

        public final Sa c() {
            return this.f1328d;
        }
    }

    public /* synthetic */ Aa(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(Aa aa, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (aa == null) {
            return false;
        }
        if (this instanceof c) {
            Ha c4 = ((c) this).c();
            Object b4 = aa.b();
            return c4.a(b4 instanceof Ha ? (Ha) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        Sa c5 = ((d) this).c();
        Object b5 = aa.b();
        return c5.a(b5 instanceof Sa ? (Sa) b5 : null, resolver, otherResolver);
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
        Integer num = this.f1325a;
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
        this.f1325a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ba) BuiltInParserKt.getBuiltInParserComponent().Z5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Aa() {
    }
}
