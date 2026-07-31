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

/* renamed from: O1.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1079u8 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8143d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f8144e = a.f8148i;

    /* renamed from: a, reason: collision with root package name */
    public final String f8145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8146b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8147c;

    /* renamed from: O1.u8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8148i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1079u8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1079u8.f8143d.a(env, it);
        }
    }

    /* renamed from: O1.u8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1079u8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1097v8) BuiltInParserKt.getBuiltInParserComponent().M4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1079u8(String str, String str2) {
        this.f8145a = str;
        this.f8146b = str2;
    }

    public final boolean a(C1079u8 c1079u8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1079u8 != null && Intrinsics.areEqual(this.f8145a, c1079u8.f8145a) && Intrinsics.areEqual(this.f8146b, c1079u8.f8146b);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8147c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1079u8.class).hashCode();
        String str = this.f8145a;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f8146b;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.f8147c = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1097v8) BuiltInParserKt.getBuiltInParserComponent().M4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
