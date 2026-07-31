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
public abstract class Df implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2470a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f2471b = d.f2475i;

    public static final class a extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final C0873j f2472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0873j value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2472c = value;
        }

        public final C0873j c() {
            return this.f2472c;
        }
    }

    public static final class b extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final C1052t f2473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1052t value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2473c = value;
        }

        public final C1052t c() {
            return this.f2473c;
        }
    }

    public static final class c extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final D f2474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2474c = value;
        }

        public final D c() {
            return this.f2474c;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f2475i = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Df invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return e.b(Df.f2470a, env, false, it, 2, null);
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Df b(e eVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return eVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Df a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Bf) BuiltInParserKt.getBuiltInParserComponent().f9().getValue()).deserialize(env, json);
        }

        private e() {
        }
    }

    public static final class f extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final Y f2476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2476c = value;
        }

        public final Y c() {
            return this.f2476c;
        }
    }

    public static final class g extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final Bg f2477c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Bg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2477c = value;
        }

        public final Bg c() {
            return this.f2477c;
        }
    }

    public static final class h extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final Mg f2478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Mg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2478c = value;
        }

        public final Mg c() {
            return this.f2478c;
        }
    }

    public static final class i extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final gh f2479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(gh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2479c = value;
        }

        public final gh c() {
            return this.f2479c;
        }
    }

    public static final class j extends Df {

        /* renamed from: c, reason: collision with root package name */
        private final qh f2480c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(qh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2480c = value;
        }

        public final qh c() {
            return this.f2480c;
        }
    }

    public /* synthetic */ Df(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof i) {
            return "string";
        }
        if (this instanceof h) {
            return "number";
        }
        if (this instanceof g) {
            return "integer";
        }
        if (this instanceof b) {
            return "boolean";
        }
        if (this instanceof c) {
            return b9.h.f15459S;
        }
        if (this instanceof j) {
            return "url";
        }
        if (this instanceof f) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Bf) BuiltInParserKt.getBuiltInParserComponent().f9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Df() {
    }
}
