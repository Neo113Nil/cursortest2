package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1063ta implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8104a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f8105b = a.f8106i;

    /* renamed from: O1.ta$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8106i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1063ta invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC1063ta.f8104a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.ta$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC1063ta b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC1063ta a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0938ma) BuiltInParserKt.getBuiltInParserComponent().R5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.ta$c */
    public static final class c extends AbstractC1063ta {

        /* renamed from: c, reason: collision with root package name */
        private final C0902ka f8107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0902ka value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8107c = value;
        }

        public final C0902ka c() {
            return this.f8107c;
        }
    }

    /* renamed from: O1.ta$d */
    public static final class d extends AbstractC1063ta {

        /* renamed from: c, reason: collision with root package name */
        private final C1045sa f8108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1045sa value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8108c = value;
        }

        public final C1045sa c() {
            return this.f8108c;
        }
    }

    public /* synthetic */ AbstractC1063ta(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "pivot-fixed";
        }
        if (this instanceof d) {
            return "pivot-percentage";
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
        return ((C0938ma) BuiltInParserKt.getBuiltInParserComponent().R5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1063ta() {
    }
}
