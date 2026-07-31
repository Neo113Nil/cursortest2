package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0736b5 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5783a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f5784b = a.f5785i;

    /* renamed from: O1.b5$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5785i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0736b5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0736b5.f5783a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.b5$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0736b5 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0736b5 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Z4) BuiltInParserKt.getBuiltInParserComponent().T2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.b5$c */
    public static final class c extends AbstractC0736b5 {

        /* renamed from: c, reason: collision with root package name */
        private final Sb f5786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Sb value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5786c = value;
        }

        public final Sb c() {
            return this.f5786c;
        }
    }

    public /* synthetic */ AbstractC0736b5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "shape_drawable";
        }
        throw new W1.m();
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Z4) BuiltInParserKt.getBuiltInParserComponent().T2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0736b5() {
    }
}
