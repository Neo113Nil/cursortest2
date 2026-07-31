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

/* renamed from: O1.jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0890jg implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6739b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6740c = a.f6742i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6741a;

    /* renamed from: O1.jg$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6742i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0890jg invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0890jg.f6739b.a(env, it);
        }
    }

    /* renamed from: O1.jg$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0890jg a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0908kg) BuiltInParserKt.getBuiltInParserComponent().z9().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public final boolean a(C0890jg c0890jg, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0890jg != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6741a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0890jg.class).hashCode();
        this.f6741a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0908kg) BuiltInParserKt.getBuiltInParserComponent().z9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
