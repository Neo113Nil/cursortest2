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
public abstract class Td implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4880a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f4881b = a.f4882i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4882i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Td invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Td.f4880a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Td b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Td a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Rd) BuiltInParserKt.getBuiltInParserComponent().b8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Td {

        /* renamed from: c, reason: collision with root package name */
        private final H8 f4883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(H8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4883c = value;
        }

        public final H8 c() {
            return this.f4883c;
        }
    }

    public static final class d extends Td {

        /* renamed from: c, reason: collision with root package name */
        private final C0724ab f4884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0724ab value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4884c = value;
        }

        public final C0724ab c() {
            return this.f4884c;
        }
    }

    public /* synthetic */ Td(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "gradient";
        }
        if (this instanceof d) {
            return "radial_gradient";
        }
        throw new W1.m();
    }

    public final Object b() {
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
        return ((Rd) BuiltInParserKt.getBuiltInParserComponent().b8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Td() {
    }
}
