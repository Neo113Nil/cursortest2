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
public abstract class Ea implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2621a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f2622b = a.f2623i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2623i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ea invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Ea.f2621a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Ea b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Ea a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ca) BuiltInParserKt.getBuiltInParserComponent().a6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Ea {

        /* renamed from: c, reason: collision with root package name */
        private final Ja f2624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ja value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2624c = value;
        }

        public final Ja c() {
            return this.f2624c;
        }
    }

    public static final class d extends Ea {

        /* renamed from: c, reason: collision with root package name */
        private final Wa f2625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Wa value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2625c = value;
        }

        public final Wa c() {
            return this.f2625c;
        }
    }

    public /* synthetic */ Ea(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "fixed";
        }
        if (this instanceof d) {
            return "relative";
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
        return ((Ca) BuiltInParserKt.getBuiltInParserComponent().a6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Ea() {
    }
}
