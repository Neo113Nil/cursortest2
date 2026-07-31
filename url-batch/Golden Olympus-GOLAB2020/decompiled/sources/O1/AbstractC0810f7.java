package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.f7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0810f7 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6181a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6182b = a.f6183i;

    /* renamed from: O1.f7$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6183i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0810f7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0810f7.f6181a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.f7$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0810f7 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0810f7 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0774d7) BuiltInParserKt.getBuiltInParserComponent().Y3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.f7$c */
    public static final class c extends AbstractC0810f7 {

        /* renamed from: c, reason: collision with root package name */
        private final I4 f6184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(I4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6184c = value;
        }

        public final I4 c() {
            return this.f6184c;
        }
    }

    /* renamed from: O1.f7$d */
    public static final class d extends AbstractC0810f7 {

        /* renamed from: c, reason: collision with root package name */
        private final Pc f6185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Pc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6185c = value;
        }

        public final Pc c() {
            return this.f6185c;
        }
    }

    public /* synthetic */ AbstractC0810f7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "default";
        }
        if (this instanceof d) {
            return "stretch";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0774d7) BuiltInParserKt.getBuiltInParserComponent().Y3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0810f7() {
    }
}
