package O1;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.cc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0761cc implements JSONSerializable, JsonTemplate {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5957a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f5958b = a.f5959i;

    /* renamed from: O1.cc$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5959i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0761cc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return b.b(AbstractC0761cc.f5957a, env, false, it, 2, null);
        }
    }

    /* renamed from: O1.cc$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC0761cc b(b bVar, ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return bVar.a(parsingEnvironment, z4, jSONObject);
        }

        public final AbstractC0761cc a(ParsingEnvironment env, boolean z4, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0725ac) BuiltInParserKt.getBuiltInParserComponent().W6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.cc$c */
    public static final class c extends AbstractC0761cc {

        /* renamed from: c, reason: collision with root package name */
        private final V5 f5960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5960c = value;
        }

        public final V5 c() {
            return this.f5960c;
        }
    }

    /* renamed from: O1.cc$d */
    public static final class d extends AbstractC0761cc {

        /* renamed from: c, reason: collision with root package name */
        private final L8 f5961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5961c = value;
        }

        public final L8 c() {
            return this.f5961c;
        }
    }

    /* renamed from: O1.cc$e */
    public static final class e extends AbstractC0761cc {

        /* renamed from: c, reason: collision with root package name */
        private final C0872ig f5962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0872ig value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5962c = value;
        }

        public final C0872ig c() {
            return this.f5962c;
        }
    }

    public /* synthetic */ AbstractC0761cc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "fixed";
        }
        if (this instanceof d) {
            return "match_parent";
        }
        if (this instanceof e) {
            return "wrap_content";
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
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0725ac) BuiltInParserKt.getBuiltInParserComponent().W6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0761cc() {
    }
}
