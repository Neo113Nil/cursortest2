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
public abstract class D9 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2463a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f2464b = a.f2465i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2465i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(D9.f2463a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ D9 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final D9 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0955n9) BuiltInParserKt.getBuiltInParserComponent().o5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends D9 {

        /* renamed from: c, reason: collision with root package name */
        private final C1098v9 f2466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1098v9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2466c = value;
        }

        public final C1098v9 c() {
            return this.f2466c;
        }
    }

    public static final class d extends D9 {

        /* renamed from: c, reason: collision with root package name */
        private final C9 f2467c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2467c = value;
        }

        public final C9 c() {
            return this.f2467c;
        }
    }

    public /* synthetic */ D9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "slide";
        }
        if (this instanceof c) {
            return "overlap";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0955n9) BuiltInParserKt.getBuiltInParserComponent().o5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private D9() {
    }
}
