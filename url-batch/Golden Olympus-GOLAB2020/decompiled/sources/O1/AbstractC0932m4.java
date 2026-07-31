package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0932m4 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6981a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6982b = a.f6983i;

    /* renamed from: O1.m4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6983i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0932m4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0932m4.f6981a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.m4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0932m4 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0932m4 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0896k4) BuiltInParserKt.getBuiltInParserComponent().t2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.m4$c */
    public static final class c extends AbstractC0932m4 {

        /* renamed from: c, reason: collision with root package name */
        private final K5 f6984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6984c = value;
        }

        public final K5 c() {
            return this.f6984c;
        }
    }

    /* renamed from: O1.m4$d */
    public static final class d extends AbstractC0932m4 {

        /* renamed from: c, reason: collision with root package name */
        private final C1042s7 f6985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1042s7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6985c = value;
        }

        public final C1042s7 c() {
            return this.f6985c;
        }
    }

    public /* synthetic */ AbstractC0932m4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "infinity";
        }
        if (this instanceof c) {
            return "fixed";
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
        return ((C0896k4) BuiltInParserKt.getBuiltInParserComponent().t2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0932m4() {
    }
}
