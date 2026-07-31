package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0802f implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6153d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f6154e = a.f6158i;

    /* renamed from: a, reason: collision with root package name */
    public final String f6155a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6156b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6157c;

    /* renamed from: O1.f$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6158i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0802f invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0802f.f6153d.a(env, it);
        }
    }

    /* renamed from: O1.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0802f a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0820g) BuiltInParserKt.getBuiltInParserComponent().d().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0802f(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6155a = name;
        this.f6156b = value;
    }

    public final boolean a(C0802f c0802f, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0802f != null && Intrinsics.areEqual(this.f6155a, c0802f.f6155a) && Intrinsics.areEqual(this.f6156b.evaluate(resolver), c0802f.f6156b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6157c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0802f.class).hashCode() + this.f6155a.hashCode() + this.f6156b.hashCode();
        this.f6157c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0820g) BuiltInParserKt.getBuiltInParserComponent().d().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
