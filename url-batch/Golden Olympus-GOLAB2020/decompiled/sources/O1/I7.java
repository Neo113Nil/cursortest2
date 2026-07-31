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
public abstract class I7 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3139a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f3140b = a.f3141i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3141i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(I7.f3139a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ I7 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final I7 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B7) BuiltInParserKt.getBuiltInParserComponent().k4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends I7 {

        /* renamed from: c, reason: collision with root package name */
        private final C1168z7 f3142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1168z7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3142c = value;
        }

        public final C1168z7 c() {
            return this.f3142c;
        }
    }

    public static final class d extends I7 {

        /* renamed from: c, reason: collision with root package name */
        private final H7 f3143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(H7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3143c = value;
        }

        public final H7 c() {
            return this.f3143c;
        }
    }

    public /* synthetic */ I7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "regex";
        }
        if (this instanceof c) {
            return "expression";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B7) BuiltInParserKt.getBuiltInParserComponent().k4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private I7() {
    }
}
