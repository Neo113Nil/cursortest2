package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class E1 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2496a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f2497b = a.f2498i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2498i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(E1.f2496a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ E1 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final E1 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1) BuiltInParserKt.getBuiltInParserComponent().E0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends E1 {

        /* renamed from: c, reason: collision with root package name */
        private final C0962ng f2499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0962ng value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2499c = value;
        }

        public final C0962ng c() {
            return this.f2499c;
        }
    }

    public static final class d extends E1 {

        /* renamed from: c, reason: collision with root package name */
        private final C1033rg f2500c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1033rg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2500c = value;
        }

        public final C1033rg c() {
            return this.f2500c;
        }
    }

    public static final class e extends E1 {

        /* renamed from: c, reason: collision with root package name */
        private final Qg f2501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Qg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2501c = value;
        }

        public final Qg c() {
            return this.f2501c;
        }
    }

    public static final class f extends E1 {

        /* renamed from: c, reason: collision with root package name */
        private final Wg f2502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Wg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2502c = value;
        }

        public final Wg c() {
            return this.f2502c;
        }
    }

    public /* synthetic */ E1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "offset";
        }
        if (this instanceof d) {
            return FirebaseAnalytics.Param.INDEX;
        }
        if (this instanceof f) {
            return "start";
        }
        if (this instanceof c) {
            return "end";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1) BuiltInParserKt.getBuiltInParserComponent().E0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private E1() {
    }
}
