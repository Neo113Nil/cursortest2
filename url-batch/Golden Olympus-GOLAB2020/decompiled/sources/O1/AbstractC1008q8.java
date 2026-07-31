package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.q8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1008q8 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7574a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f7575b = a.f7576i;

    /* renamed from: O1.q8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7576i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1008q8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC1008q8.f7574a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.q8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC1008q8 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC1008q8 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0918l8) BuiltInParserKt.getBuiltInParserComponent().E4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.q8$c */
    public static final class c extends AbstractC1008q8 {

        /* renamed from: c, reason: collision with root package name */
        private final C0882j8 f7577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0882j8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7577c = value;
        }

        public final C0882j8 c() {
            return this.f7577c;
        }
    }

    /* renamed from: O1.q8$d */
    public static final class d extends AbstractC1008q8 {

        /* renamed from: c, reason: collision with root package name */
        private final C0990p8 f7578c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0990p8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f7578c = value;
        }

        public final C0990p8 c() {
            return this.f7578c;
        }
    }

    public /* synthetic */ AbstractC1008q8(DefaultConstructorMarker defaultConstructorMarker) {
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
        return ((C0918l8) BuiltInParserKt.getBuiltInParserComponent().E4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1008q8() {
    }
}
