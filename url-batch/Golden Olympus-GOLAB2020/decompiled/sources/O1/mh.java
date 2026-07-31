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

/* loaded from: classes2.dex */
public final class mh implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7107d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7108e = a.f7112i;

    /* renamed from: a, reason: collision with root package name */
    public final String f7109a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7110b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7111c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7112i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mh invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return mh.f7107d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mh a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((nh) BuiltInParserKt.getBuiltInParserComponent().ga().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public mh(String name, Expression value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7109a = name;
        this.f7110b = value;
    }

    public final boolean a(mh mhVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return mhVar != null && Intrinsics.areEqual(this.f7109a, mhVar.f7109a) && Intrinsics.areEqual(this.f7110b.evaluate(resolver), mhVar.f7110b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7111c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(mh.class).hashCode() + this.f7109a.hashCode() + this.f7110b.hashCode();
        this.f7111c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((nh) BuiltInParserKt.getBuiltInParserComponent().ga().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
