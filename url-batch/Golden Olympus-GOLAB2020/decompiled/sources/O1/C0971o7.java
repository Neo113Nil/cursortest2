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

/* renamed from: O1.o7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0971o7 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7355b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f7356c = a.f7358i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f7357a;

    /* renamed from: O1.o7$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7358i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0971o7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0971o7.f7355b.a(env, it);
        }
    }

    /* renamed from: O1.o7$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0971o7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0989p7) BuiltInParserKt.getBuiltInParserComponent().d4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public final boolean a(C0971o7 c0971o7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0971o7 != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7357a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0971o7.class).hashCode();
        this.f7357a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0989p7) BuiltInParserKt.getBuiltInParserComponent().d4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
