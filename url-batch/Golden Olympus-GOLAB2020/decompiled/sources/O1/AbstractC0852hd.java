package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0852hd implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6403a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6404b = a.f6405i;

    /* renamed from: O1.hd$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6405i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0852hd invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0852hd.f6403a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.hd$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0852hd b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0852hd a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0726ad) BuiltInParserKt.getBuiltInParserComponent().D7().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.hd$c */
    public static final class c extends AbstractC0852hd {

        /* renamed from: c, reason: collision with root package name */
        private final Yc f6406c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Yc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6406c = value;
        }

        public final Yc c() {
            return this.f6406c;
        }
    }

    /* renamed from: O1.hd$d */
    public static final class d extends AbstractC0852hd {

        /* renamed from: c, reason: collision with root package name */
        private final C0834gd f6407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0834gd value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6407c = value;
        }

        public final C0834gd c() {
            return this.f6407c;
        }
    }

    public /* synthetic */ AbstractC0852hd(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "solid";
        }
        if (this instanceof c) {
            return "dashed";
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
        return ((C0726ad) BuiltInParserKt.getBuiltInParserComponent().D7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0852hd() {
    }
}
