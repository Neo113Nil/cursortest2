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
public abstract class Y7 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5391a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f5392b = a.f5393i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5393i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Y7.f5391a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Y7 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Y7 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((W7) BuiltInParserKt.getBuiltInParserComponent().t4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Y7 {

        /* renamed from: c, reason: collision with root package name */
        private final C1021r4 f5394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1021r4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5394c = value;
        }

        public final C1021r4 c() {
            return this.f5394c;
        }
    }

    public static final class d extends Y7 {

        /* renamed from: c, reason: collision with root package name */
        private final R5 f5395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(R5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5395c = value;
        }

        public final R5 c() {
            return this.f5395c;
        }
    }

    public static final class e extends Y7 {

        /* renamed from: c, reason: collision with root package name */
        private final C0831ga f5396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0831ga value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5396c = value;
        }

        public final C0831ga c() {
            return this.f5396c;
        }
    }

    public /* synthetic */ Y7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "fixed_length";
        }
        if (this instanceof c) {
            return "currency";
        }
        if (this instanceof e) {
            return "phone";
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
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((W7) BuiltInParserKt.getBuiltInParserComponent().t4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Y7() {
    }
}
