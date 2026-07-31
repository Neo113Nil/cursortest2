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

/* renamed from: O1.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0759ca implements JSONSerializable, Hashable, U7 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5945c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5946d = a.f5949i;

    /* renamed from: a, reason: collision with root package name */
    private final String f5947a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5948b;

    /* renamed from: O1.ca$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5949i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0759ca invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0759ca.f5945c.a(env, it);
        }
    }

    /* renamed from: O1.ca$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0759ca a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0777da) BuiltInParserKt.getBuiltInParserComponent().K5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0759ca(String rawTextVariable) {
        Intrinsics.checkNotNullParameter(rawTextVariable, "rawTextVariable");
        this.f5947a = rawTextVariable;
    }

    @Override // O1.U7
    public String a() {
        return this.f5947a;
    }

    public final boolean b(C0759ca c0759ca, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0759ca == null) {
            return false;
        }
        return Intrinsics.areEqual(a(), c0759ca.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5948b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0759ca.class).hashCode() + a().hashCode();
        this.f5948b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0777da) BuiltInParserKt.getBuiltInParserComponent().K5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
