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

/* renamed from: O1.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0827g6 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6226d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f6227e = a.f6231i;

    /* renamed from: a, reason: collision with root package name */
    public final String f6228a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0915l5 f6229b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6230c;

    /* renamed from: O1.g6$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6231i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0827g6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0827g6.f6226d.a(env, it);
        }
    }

    /* renamed from: O1.g6$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0827g6 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0845h6) BuiltInParserKt.getBuiltInParserComponent().C3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0827g6(String name, EnumC0915l5 type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f6228a = name;
        this.f6229b = type;
    }

    public final boolean a(C0827g6 c0827g6, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0827g6 != null && Intrinsics.areEqual(this.f6228a, c0827g6.f6228a) && this.f6229b == c0827g6.f6229b;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6230c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0827g6.class).hashCode() + this.f6228a.hashCode() + this.f6229b.hashCode();
        this.f6230c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0845h6) BuiltInParserKt.getBuiltInParserComponent().C3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
