package O1;

import O1.AbstractC1175ze;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ye, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157ye implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f8646c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Expression f8647d = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f8648e = a.f8651i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8649a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8650b;

    /* renamed from: O1.ye$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8651i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1157ye invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1157ye.f8646c.a(env, it);
        }
    }

    /* renamed from: O1.ye$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1157ye a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1175ze.b) BuiltInParserKt.getBuiltInParserComponent().v8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1157ye(Expression isEnabled) {
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        this.f8649a = isEnabled;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8650b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1157ye.class).hashCode() + this.f8649a.hashCode();
        this.f8650b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1175ze.b) BuiltInParserKt.getBuiltInParserComponent().v8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
