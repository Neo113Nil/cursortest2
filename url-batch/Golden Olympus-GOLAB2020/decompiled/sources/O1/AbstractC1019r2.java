package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1019r2 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7732a = new h(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f7733b = g.f7740i;

    /* renamed from: O1.r2$a */
    public static final class a extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0982p0 f7734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0982p0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7734c = value;
        }

        public final C0982p0 c() {
            return this.f7734c;
        }
    }

    /* renamed from: O1.r2$b */
    public static final class b extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1071u0 f7735c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1071u0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7735c = value;
        }

        public final C1071u0 c() {
            return this.f7735c;
        }
    }

    /* renamed from: O1.r2$c */
    public static final class c extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1161z0 f7736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1161z0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7736c = value;
        }

        public final C1161z0 c() {
            return this.f7736c;
        }
    }

    /* renamed from: O1.r2$d */
    public static final class d extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final E0 f7737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(E0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7737c = value;
        }

        public final E0 c() {
            return this.f7737c;
        }
    }

    /* renamed from: O1.r2$e */
    public static final class e extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final J0 f7738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(J0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7738c = value;
        }

        public final J0 c() {
            return this.f7738c;
        }
    }

    /* renamed from: O1.r2$f */
    public static final class f extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final O0 f7739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7739c = value;
        }

        public final O0 c() {
            return this.f7739c;
        }
    }

    /* renamed from: O1.r2$g */
    static final class g extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final g f7740i = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1019r2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return h.b(AbstractC1019r2.f7732a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.r2$h */
    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC1019r2 b(h hVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return hVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC1019r2 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0984p2) BuiltInParserKt.getBuiltInParserComponent().i1().getValue()).deserialize(env, json);
        }

        private h() {
        }
    }

    /* renamed from: O1.r2$i */
    public static final class i extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final Y0 f7741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y0 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7741c = value;
        }

        public final Y0 c() {
            return this.f7741c;
        }
    }

    /* renamed from: O1.r2$j */
    public static final class j extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0768d1 f7742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C0768d1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7742c = value;
        }

        public final C0768d1 c() {
            return this.f7742c;
        }
    }

    /* renamed from: O1.r2$k */
    public static final class k extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0858i1 f7743c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C0858i1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7743c = value;
        }

        public final C0858i1 c() {
            return this.f7743c;
        }
    }

    /* renamed from: O1.r2$l */
    public static final class l extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0947n1 f7744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C0947n1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7744c = value;
        }

        public final C0947n1 c() {
            return this.f7744c;
        }
    }

    /* renamed from: O1.r2$m */
    public static final class m extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1036s1 f7745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C1036s1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7745c = value;
        }

        public final C1036s1 c() {
            return this.f7745c;
        }
    }

    /* renamed from: O1.r2$n */
    public static final class n extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1162z1 f7746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C1162z1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7746c = value;
        }

        public final C1162z1 c() {
            return this.f7746c;
        }
    }

    /* renamed from: O1.r2$o */
    public static final class o extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final H1 f7747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(H1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7747c = value;
        }

        public final H1 c() {
            return this.f7747c;
        }
    }

    /* renamed from: O1.r2$p */
    public static final class p extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final K1 f7748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(K1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7748c = value;
        }

        public final K1 c() {
            return this.f7748c;
        }
    }

    /* renamed from: O1.r2$q */
    public static final class q extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final P1 f7749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(P1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7749c = value;
        }

        public final P1 c() {
            return this.f7749c;
        }
    }

    /* renamed from: O1.r2$r */
    public static final class r extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final U1 f7750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(U1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7750c = value;
        }

        public final U1 c() {
            return this.f7750c;
        }
    }

    /* renamed from: O1.r2$s */
    public static final class s extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final Z1 f7751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Z1 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7751c = value;
        }

        public final Z1 c() {
            return this.f7751c;
        }
    }

    /* renamed from: O1.r2$t */
    public static final class t extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0859i2 f7752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(C0859i2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7752c = value;
        }

        public final C0859i2 c() {
            return this.f7752c;
        }
    }

    /* renamed from: O1.r2$u */
    public static final class u extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0930m2 f7753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(C0930m2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7753c = value;
        }

        public final C0930m2 c() {
            return this.f7753c;
        }
    }

    /* renamed from: O1.r2$v */
    public static final class v extends AbstractC1019r2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1073u2 f7754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(C1073u2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7754c = value;
        }

        public final C1073u2 c() {
            return this.f7754c;
        }
    }

    public /* synthetic */ AbstractC1019r2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "animator_start";
        }
        if (this instanceof b) {
            return "animator_stop";
        }
        if (this instanceof c) {
            return "array_insert_value";
        }
        if (this instanceof d) {
            return "array_remove_value";
        }
        if (this instanceof e) {
            return "array_set_value";
        }
        if (this instanceof f) {
            return "clear_focus";
        }
        if (this instanceof i) {
            return "copy_to_clipboard";
        }
        if (this instanceof j) {
            return "dict_set_value";
        }
        if (this instanceof k) {
            return "download";
        }
        if (this instanceof l) {
            return "focus_element";
        }
        if (this instanceof m) {
            return "hide_tooltip";
        }
        if (this instanceof n) {
            return "scroll_by";
        }
        if (this instanceof o) {
            return "scroll_to";
        }
        if (this instanceof p) {
            return "set_state";
        }
        if (this instanceof q) {
            return "set_stored_value";
        }
        if (this instanceof r) {
            return "set_variable";
        }
        if (this instanceof s) {
            return "show_tooltip";
        }
        if (this instanceof t) {
            return "submit";
        }
        if (this instanceof u) {
            return "timer";
        }
        if (this instanceof v) {
            return "video";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0984p2) BuiltInParserKt.getBuiltInParserComponent().i1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1019r2() {
    }
}
