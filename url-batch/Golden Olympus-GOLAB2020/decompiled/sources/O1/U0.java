package O1;

import com.ironsource.b9;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class U0 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4904a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f4905b = a.f4906i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4906i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(U0.f4904a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ U0 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final U0 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((S0) BuiltInParserKt.getBuiltInParserComponent().d0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends U0 {

        /* renamed from: c, reason: collision with root package name */
        private final I f4907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4907c = value;
        }

        public final I c() {
            return this.f4907c;
        }
    }

    public static final class d extends U0 {

        /* renamed from: c, reason: collision with root package name */
        private final N f4908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(N value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4908c = value;
        }

        public final N c() {
            return this.f4908c;
        }
    }

    public /* synthetic */ U0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return b9.h.f15450K0;
        }
        if (this instanceof d) {
            return "url";
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
        return ((S0) BuiltInParserKt.getBuiltInParserComponent().d0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private U0() {
    }
}
