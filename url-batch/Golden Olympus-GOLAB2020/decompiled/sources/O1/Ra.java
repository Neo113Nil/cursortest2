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
public abstract class Ra implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4676a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f4677b = a.f4678i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4678i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ra invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Ra.f4676a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Ra b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Ra a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Pa) BuiltInParserKt.getBuiltInParserComponent().m6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Ra {

        /* renamed from: c, reason: collision with root package name */
        private final V5 f4679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4679c = value;
        }

        public final V5 c() {
            return this.f4679c;
        }
    }

    public static final class d extends Ra {

        /* renamed from: c, reason: collision with root package name */
        private final Za f4680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Za value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4680c = value;
        }

        public final Za c() {
            return this.f4680c;
        }
    }

    public /* synthetic */ Ra(DefaultConstructorMarker defaultConstructorMarker) {
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
        return ((Pa) BuiltInParserKt.getBuiltInParserComponent().m6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Ra() {
    }
}
