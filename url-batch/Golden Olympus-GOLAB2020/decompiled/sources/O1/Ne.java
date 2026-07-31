package O1;

import O1.Qe;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ne implements JSONSerializable, Hashable {

    /* renamed from: h, reason: collision with root package name */
    public static final b f4162h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f4163i = Expression.Companion.constant(0L);

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f4164j = a.f4172i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4165a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4167c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4168d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f4169e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4170f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f4171g;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4172i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ne invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Ne.f4162h.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Ne a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Qe.b) BuiltInParserKt.getBuiltInParserComponent().G8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public Ne(Expression duration, List list, String id, List list2, Expression expression, String str) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f4165a = duration;
        this.f4166b = list;
        this.f4167c = id;
        this.f4168d = list2;
        this.f4169e = expression;
        this.f4170f = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        Integer num = this.f4171g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Ne.class).hashCode() + this.f4165a.hashCode();
        List list = this.f4166b;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int hashCode2 = hashCode + i4 + this.f4167c.hashCode();
        List list2 = this.f4168d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i6 = hashCode2 + i5;
        Expression expression = this.f4169e;
        int hashCode3 = i6 + (expression != null ? expression.hashCode() : 0);
        String str = this.f4170f;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.f4171g = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Qe.b) BuiltInParserKt.getBuiltInParserComponent().G8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
