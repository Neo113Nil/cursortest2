package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class P9 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4331a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f4332b = a.f4333i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4333i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(P9.f4331a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ P9 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final P9 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((N9) BuiltInParserKt.getBuiltInParserComponent().A5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends P9 {

        /* renamed from: c, reason: collision with root package name */
        private final Q8 f4334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4334c = value;
        }

        public final Q8 c() {
            return this.f4334c;
        }
    }

    public static final class d extends P9 {

        /* renamed from: c, reason: collision with root package name */
        private final C0812f9 f4335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0812f9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4335c = value;
        }

        public final C0812f9 c() {
            return this.f4335c;
        }
    }

    public static final class e extends P9 {

        /* renamed from: c, reason: collision with root package name */
        private final C0901k9 f4336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0901k9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4336c = value;
        }

        public final C0901k9 c() {
            return this.f4336c;
        }
    }

    public /* synthetic */ P9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "percentage";
        }
        if (this instanceof c) {
            return "fixed";
        }
        if (this instanceof d) {
            return "wrap_content";
        }
        throw new W1.m();
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

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((N9) BuiltInParserKt.getBuiltInParserComponent().A5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private P9() {
    }
}
