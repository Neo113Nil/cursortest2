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
public abstract class S2 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4698a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f4699b = a.f4700i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4700i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(S2.f4698a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ S2 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final S2 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Q2) BuiltInParserKt.getBuiltInParserComponent().x1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends S2 {

        /* renamed from: c, reason: collision with root package name */
        private final C1112w5 f4701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1112w5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4701c = value;
        }

        public final C1112w5 c() {
            return this.f4701c;
        }
    }

    public static final class d extends S2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0921lb f4702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0921lb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4702c = value;
        }

        public final C0921lb c() {
            return this.f4702c;
        }
    }

    public static final class e extends S2 {

        /* renamed from: c, reason: collision with root package name */
        private final N2 f4703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(N2 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4703c = value;
        }

        public final N2 c() {
            return this.f4703c;
        }
    }

    public static final class f extends S2 {

        /* renamed from: c, reason: collision with root package name */
        private final C0869ic f4704c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0869ic value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f4704c = value;
        }

        public final C0869ic c() {
            return this.f4704c;
        }
    }

    public /* synthetic */ S2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "set";
        }
        if (this instanceof c) {
            return "fade";
        }
        if (this instanceof d) {
            return "scale";
        }
        if (this instanceof f) {
            return "slide";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Q2) BuiltInParserKt.getBuiltInParserComponent().x1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private S2() {
    }
}
