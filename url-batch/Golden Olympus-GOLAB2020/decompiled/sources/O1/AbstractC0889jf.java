package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.jf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0889jf implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6734a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6735b = a.f6736i;

    /* renamed from: O1.jf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6736i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0889jf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0889jf.f6734a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.jf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0889jf b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0889jf a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Xe) BuiltInParserKt.getBuiltInParserComponent().N8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.jf$c */
    public static final class c extends AbstractC0889jf {

        /* renamed from: c, reason: collision with root package name */
        private final C0782df f6737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0782df value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6737c = value;
        }

        public final C0782df c() {
            return this.f6737c;
        }
    }

    /* renamed from: O1.jf$d */
    public static final class d extends AbstractC0889jf {

        /* renamed from: c, reason: collision with root package name */
        private final Cif f6738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Cif value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6738c = value;
        }

        public final Cif c() {
            return this.f6738c;
        }
    }

    public /* synthetic */ AbstractC0889jf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "non_modal";
        }
        if (this instanceof c) {
            return "modal";
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
        return ((Xe) BuiltInParserKt.getBuiltInParserComponent().N8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0889jf() {
    }
}
