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
public abstract class Jd implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3333a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f3334b = a.f3335i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3335i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Jd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Jd.f3333a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Jd b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Jd a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1043s8) BuiltInParserKt.getBuiltInParserComponent().K4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Y3 f3336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3336c = value;
        }

        public final Y3 c() {
            return this.f3336c;
        }
    }

    public static final class d extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C1147y4 f3337c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1147y4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3337c = value;
        }

        public final C1147y4 c() {
            return this.f3337c;
        }
    }

    public static final class e extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C1149y6 f3338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1149y6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3338c = value;
        }

        public final C1149y6 c() {
            return this.f3338c;
        }
    }

    public static final class f extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final F6 f3339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(F6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3339c = value;
        }

        public final F6 c() {
            return this.f3339c;
        }
    }

    public static final class g extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final N6 f3340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(N6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3340c = value;
        }

        public final N6 c() {
            return this.f3340c;
        }
    }

    public static final class h extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Z6 f3341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Z6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3341c = value;
        }

        public final Z6 c() {
            return this.f3341c;
        }
    }

    public static final class i extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C0953n7 f3342c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C0953n7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3342c = value;
        }

        public final C0953n7 c() {
            return this.f3342c;
        }
    }

    public static final class j extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C0757c8 f3343c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C0757c8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3343c = value;
        }

        public final C0757c8 c() {
            return this.f3343c;
        }
    }

    public static final class k extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Q9 f3344c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Q9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3344c = value;
        }

        public final Q9 c() {
            return this.f3344c;
        }
    }

    public static final class l extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C1172zb f3345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C1172zb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3345c = value;
        }

        public final C1172zb c() {
            return this.f3345c;
        }
    }

    public static final class m extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Hb f3346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Hb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3346c = value;
        }

        public final Hb c() {
            return this.f3346c;
        }
    }

    public static final class n extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C1047sc f3347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C1047sc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3347c = value;
        }

        public final C1047sc c() {
            return this.f3347c;
        }
    }

    public static final class o extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Lc f3348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Lc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3348c = value;
        }

        public final Lc c() {
            return this.f3348c;
        }
    }

    public static final class p extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final C0995pd f3349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C0995pd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3349c = value;
        }

        public final C0995pd c() {
            return this.f3349c;
        }
    }

    public static final class q extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Id f3350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Id value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3350c = value;
        }

        public final Id c() {
            return this.f3350c;
        }
    }

    public static final class r extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Me f3351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Me value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3351c = value;
        }

        public final Me c() {
            return this.f3351c;
        }
    }

    public static final class s extends Jd {

        /* renamed from: c, reason: collision with root package name */
        private final Uf f3352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Uf value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3352c = value;
        }

        public final Uf c() {
            return this.f3352c;
        }
    }

    public /* synthetic */ Jd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof h) {
            return "image";
        }
        if (this instanceof f) {
            return "gif";
        }
        if (this instanceof r) {
            return b9.h.f15450K0;
        }
        if (this instanceof m) {
            return "separator";
        }
        if (this instanceof c) {
            return "container";
        }
        if (this instanceof g) {
            return "grid";
        }
        if (this instanceof e) {
            return "gallery";
        }
        if (this instanceof k) {
            return "pager";
        }
        if (this instanceof q) {
            return "tabs";
        }
        if (this instanceof o) {
            return b9.h.f15456P;
        }
        if (this instanceof d) {
            return "custom";
        }
        if (this instanceof i) {
            return "indicator";
        }
        if (this instanceof n) {
            return "slider";
        }
        if (this instanceof p) {
            return "switch";
        }
        if (this instanceof j) {
            return "input";
        }
        if (this instanceof l) {
            return "select";
        }
        if (this instanceof s) {
            return "video";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1043s8) BuiltInParserKt.getBuiltInParserComponent().K4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Jd() {
    }
}
