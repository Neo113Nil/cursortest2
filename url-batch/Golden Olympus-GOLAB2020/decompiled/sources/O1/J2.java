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
public abstract class J2 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3303a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f3304b = b.f3306i;

    public static final class a extends J2 {

        /* renamed from: c, reason: collision with root package name */
        private final Q3 f3305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3305c = value;
        }

        public final Q3 c() {
            return this.f3305c;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f3306i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return c.b(J2.f3303a, env, false, it, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ J2 b(c cVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return cVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final J2 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((H2) BuiltInParserKt.getBuiltInParserComponent().r1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public static final class d extends J2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0722a9 f3307c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0722a9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3307c = value;
        }

        public final C0722a9 c() {
            return this.f3307c;
        }
    }

    public /* synthetic */ J2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "color_animator";
        }
        if (this instanceof d) {
            return "number_animator";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((H2) BuiltInParserKt.getBuiltInParserComponent().r1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private J2() {
    }
}
