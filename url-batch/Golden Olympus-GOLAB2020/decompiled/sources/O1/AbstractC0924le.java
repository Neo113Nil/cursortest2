package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.le, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0924le implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6945a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6946b = b.f6948i;

    /* renamed from: O1.le$a */
    public static final class a extends AbstractC0924le {

        /* renamed from: c, reason: collision with root package name */
        private final G3 f6947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6947c = value;
        }

        public final G3 c() {
            return this.f6947c;
        }
    }

    /* renamed from: O1.le$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6948i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0924le invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return c.b(AbstractC0924le.f6945a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.le$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0924le b(c cVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return cVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0924le a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0888je) BuiltInParserKt.getBuiltInParserComponent().n8().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.le$d */
    public static final class d extends AbstractC0924le {

        /* renamed from: c, reason: collision with root package name */
        private final Ac f6949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ac value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6949c = value;
        }

        public final Ac c() {
            return this.f6949c;
        }
    }

    public /* synthetic */ AbstractC0924le(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "solid";
        }
        if (this instanceof a) {
            return "cloud";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0888je) BuiltInParserKt.getBuiltInParserComponent().n8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0924le() {
    }
}
