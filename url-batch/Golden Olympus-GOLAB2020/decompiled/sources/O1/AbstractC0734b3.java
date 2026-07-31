package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0734b3 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5767a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f5768b = a.f5769i;

    /* renamed from: O1.b3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5769i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0734b3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0734b3.f5767a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.b3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0734b3 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0734b3 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Z2) BuiltInParserKt.getBuiltInParserComponent().D1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.b3$c */
    public static final class c extends AbstractC0734b3 {

        /* renamed from: c, reason: collision with root package name */
        private final S6 f5770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5770c = value;
        }

        public final S6 c() {
            return this.f5770c;
        }
    }

    /* renamed from: O1.b3$d */
    public static final class d extends AbstractC0734b3 {

        /* renamed from: c, reason: collision with root package name */
        private final H8 f5771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(H8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5771c = value;
        }

        public final H8 c() {
            return this.f5771c;
        }
    }

    /* renamed from: O1.b3$e */
    public static final class e extends AbstractC0734b3 {

        /* renamed from: c, reason: collision with root package name */
        private final V8 f5772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(V8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5772c = value;
        }

        public final V8 c() {
            return this.f5772c;
        }
    }

    /* renamed from: O1.b3$f */
    public static final class f extends AbstractC0734b3 {

        /* renamed from: c, reason: collision with root package name */
        private final C0724ab f5773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0724ab value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5773c = value;
        }

        public final C0724ab c() {
            return this.f5773c;
        }
    }

    /* renamed from: O1.b3$g */
    public static final class g extends AbstractC0734b3 {

        /* renamed from: c, reason: collision with root package name */
        private final Ac f5774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ac value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5774c = value;
        }

        public final Ac c() {
            return this.f5774c;
        }
    }

    public /* synthetic */ AbstractC0734b3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "gradient";
        }
        if (this instanceof f) {
            return "radial_gradient";
        }
        if (this instanceof c) {
            return "image";
        }
        if (this instanceof g) {
            return "solid";
        }
        if (this instanceof e) {
            return "nine_patch_image";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
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
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Z2) BuiltInParserKt.getBuiltInParserComponent().D1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0734b3() {
    }
}
