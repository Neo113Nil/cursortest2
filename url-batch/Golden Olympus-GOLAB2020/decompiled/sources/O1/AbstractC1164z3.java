package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1164z3 implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8701a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f8702b = b.f8704i;

    /* renamed from: O1.z3$a */
    public static final class a extends AbstractC1164z3 {

        /* renamed from: c, reason: collision with root package name */
        private final C1003q3 f8703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1003q3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8703c = value;
        }

        public final C1003q3 c() {
            return this.f8703c;
        }
    }

    /* renamed from: O1.z3$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8704i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1164z3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return c.b(AbstractC1164z3.f8701a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.z3$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC1164z3 b(c cVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return cVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC1164z3 a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1128x3) BuiltInParserKt.getBuiltInParserComponent().S1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.z3$d */
    public static final class d extends AbstractC1164z3 {

        /* renamed from: c, reason: collision with root package name */
        private final C1074u3 f8705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1074u3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8705c = value;
        }

        public final C1074u3 c() {
            return this.f8705c;
        }
    }

    public /* synthetic */ AbstractC1164z3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "set";
        }
        if (this instanceof a) {
            return "change_bounds";
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
        return ((C1128x3) BuiltInParserKt.getBuiltInParserComponent().S1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1164z3() {
    }
}
