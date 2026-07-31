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

/* renamed from: O1.g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0830g9 implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6239c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f6240d = a.f6243i;

    /* renamed from: a, reason: collision with root package name */
    public final Y9 f6241a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6242b;

    /* renamed from: O1.g9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6243i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0830g9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0830g9.f6239c.a(env, it);
        }
    }

    /* renamed from: O1.g9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0830g9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0848h9) BuiltInParserKt.getBuiltInParserComponent().k5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0830g9(Y9 pageWidth) {
        Intrinsics.checkNotNullParameter(pageWidth, "pageWidth");
        this.f6241a = pageWidth;
    }

    public final boolean a(C0830g9 c0830g9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0830g9 == null) {
            return false;
        }
        return this.f6241a.a(c0830g9.f6241a, resolver, otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6242b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0830g9.class).hashCode() + this.f6241a.hash();
        this.f6242b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0848h9) BuiltInParserKt.getBuiltInParserComponent().k5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
