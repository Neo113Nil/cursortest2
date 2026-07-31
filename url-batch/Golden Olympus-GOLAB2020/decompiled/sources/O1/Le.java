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
public abstract class Le implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3782a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f3783b = a.f3784i;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3784i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Le invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(Le.f3782a, env, false, it, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Le b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final Le a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ce) BuiltInParserKt.getBuiltInParserComponent().y8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends Le {

        /* renamed from: c, reason: collision with root package name */
        private final He f3785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(He value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3785c = value;
        }

        public final He c() {
            return this.f3785c;
        }
    }

    public static final class d extends Le {

        /* renamed from: c, reason: collision with root package name */
        private final Ke f3786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ke value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3786c = value;
        }

        public final Ke c() {
            return this.f3786c;
        }
    }

    public /* synthetic */ Le(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "particles";
        }
        if (this instanceof d) {
            return "solid";
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
        return ((Ce) BuiltInParserKt.getBuiltInParserComponent().y8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private Le() {
    }
}
