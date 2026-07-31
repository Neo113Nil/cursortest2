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

/* renamed from: O1.yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1158yf implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8652a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f8653b = d.f8657i;

    /* renamed from: O1.yf$a */
    public static final class a extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final C0784e f8654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0784e value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8654c = value;
        }

        public final C0784e c() {
            return this.f8654c;
        }
    }

    /* renamed from: O1.yf$b */
    public static final class b extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final C0963o f8655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0963o value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8655c = value;
        }

        public final C0963o c() {
            return this.f8655c;
        }
    }

    /* renamed from: O1.yf$c */
    public static final class c extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final C1142y f8656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1142y value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8656c = value;
        }

        public final C1142y c() {
            return this.f8656c;
        }
    }

    /* renamed from: O1.yf$d */
    static final class d extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8657i = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1158yf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return e.b(AbstractC1158yf.f8652a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.yf$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC1158yf b(e eVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return eVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC1158yf a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1122wf) BuiltInParserKt.getBuiltInParserComponent().c9().getValue()).deserialize(env, json);
        }

        private e() {
        }
    }

    /* renamed from: O1.yf$f */
    public static final class f extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final T f8658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(T value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8658c = value;
        }

        public final T c() {
            return this.f8658c;
        }
    }

    /* renamed from: O1.yf$g */
    public static final class g extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final C1123wg f8659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1123wg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8659c = value;
        }

        public final C1123wg c() {
            return this.f8659c;
        }
    }

    /* renamed from: O1.yf$h */
    public static final class h extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final Hg f8660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Hg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8660c = value;
        }

        public final Hg c() {
            return this.f8660c;
        }
    }

    /* renamed from: O1.yf$i */
    public static final class i extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final bh f8661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(bh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8661c = value;
        }

        public final bh c() {
            return this.f8661c;
        }
    }

    /* renamed from: O1.yf$j */
    public static final class j extends AbstractC1158yf {

        /* renamed from: c, reason: collision with root package name */
        private final lh f8662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(lh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8662c = value;
        }

        public final lh c() {
            return this.f8662c;
        }
    }

    public /* synthetic */ AbstractC1158yf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof i) {
            return "string";
        }
        if (this instanceof g) {
            return "integer";
        }
        if (this instanceof h) {
            return "number";
        }
        if (this instanceof c) {
            return b9.h.f15459S;
        }
        if (this instanceof b) {
            return "boolean";
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
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
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
        return ((C1122wf) BuiltInParserKt.getBuiltInParserComponent().c9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1158yf() {
    }
}
