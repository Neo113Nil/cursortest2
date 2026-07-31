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
public abstract class Wb implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5147a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f5148b = b.f5150i;

    public static final class a extends Wb {

        /* renamed from: c, reason: collision with root package name */
        private final C3 f5149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5149c = value;
        }

        public final C3 c() {
            return this.f5149c;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5150i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wb invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return c.b(Wb.f5147a, env, false, it, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Wb b(c cVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return cVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Wb a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ub) BuiltInParserKt.getBuiltInParserComponent().T6().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public static final class d extends Wb {

        /* renamed from: c, reason: collision with root package name */
        private final C0778db f5151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0778db value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5151c = value;
        }

        public final C0778db c() {
            return this.f5151c;
        }
    }

    public /* synthetic */ Wb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "rounded_rectangle";
        }
        if (this instanceof a) {
            return "circle";
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
        return ((Ub) BuiltInParserKt.getBuiltInParserComponent().T6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Wb() {
    }
}
