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
public abstract class G5 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2826a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f2827b = b.f2829i;

    public static final class a extends G5 {

        /* renamed from: c, reason: collision with root package name */
        private final C0842h3 f2828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0842h3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2828c = value;
        }

        public final C0842h3 c() {
            return this.f2828c;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f2829i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return c.b(G5.f2826a, env, false, it, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ G5 b(c cVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return cVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final G5 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1166z5) BuiltInParserKt.getBuiltInParserComponent().f3().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public static final class d extends G5 {

        /* renamed from: c, reason: collision with root package name */
        private final F5 f2830c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(F5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2830c = value;
        }

        public final F5 c() {
            return this.f2830c;
        }
    }

    public /* synthetic */ G5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "blur";
        }
        if (this instanceof d) {
            return "rtl_mirror";
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
        return ((C1166z5) BuiltInParserKt.getBuiltInParserComponent().f3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private G5() {
    }
}
