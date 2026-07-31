package O1;

import O1.R6;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class P6 implements JSONSerializable, Hashable {

    /* renamed from: i, reason: collision with root package name */
    public static final b f4314i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f4315j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f4316k;

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f4317l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f4318m;

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f4319n;

    /* renamed from: o, reason: collision with root package name */
    private static final Function2 f4320o;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f4321a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f4322b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f4323c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4324d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f4325e;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f4326f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f4327g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f4328h;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4329i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return P6.f4314i.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P6 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((R6.e) BuiltInParserKt.getBuiltInParserComponent().R3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4315j = companion.constant(Double.valueOf(1.0d));
        f4316k = companion.constant(EnumC1091v2.CENTER);
        f4317l = companion.constant(EnumC1109w2.CENTER);
        f4318m = companion.constant(Boolean.FALSE);
        f4319n = companion.constant(Y6.FILL);
        f4320o = a.f4329i;
    }

    public P6(Expression alpha, Expression contentAlignmentHorizontal, Expression contentAlignmentVertical, List list, Expression imageUrl, Expression preloadRequired, Expression scale) {
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        Intrinsics.checkNotNullParameter(contentAlignmentHorizontal, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(contentAlignmentVertical, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(preloadRequired, "preloadRequired");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f4321a = alpha;
        this.f4322b = contentAlignmentHorizontal;
        this.f4323c = contentAlignmentVertical;
        this.f4324d = list;
        this.f4325e = imageUrl;
        this.f4326f = preloadRequired;
        this.f4327g = scale;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r7.f4324d == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(P6 p6, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (p6 != null && ((Number) this.f4321a.evaluate(resolver)).doubleValue() == ((Number) p6.f4321a.evaluate(otherResolver)).doubleValue() && this.f4322b.evaluate(resolver) == p6.f4322b.evaluate(otherResolver) && this.f4323c.evaluate(resolver) == p6.f4323c.evaluate(otherResolver)) {
            List list = this.f4324d;
            if (list != null) {
                List list2 = p6.f4324d;
                if (list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((AbstractC1130x5) obj).a((AbstractC1130x5) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    }
                    if (!Intrinsics.areEqual(this.f4325e.evaluate(resolver), p6.f4325e.evaluate(otherResolver)) || ((Boolean) this.f4326f.evaluate(resolver)).booleanValue() != ((Boolean) p6.f4326f.evaluate(otherResolver)).booleanValue() || this.f4327g.evaluate(resolver) != p6.f4327g.evaluate(otherResolver)) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f4328h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(P6.class).hashCode() + this.f4321a.hashCode() + this.f4322b.hashCode() + this.f4323c.hashCode();
        List list = this.f4324d;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i4 += ((AbstractC1130x5) it.next()).hash();
            }
        }
        int hashCode2 = hashCode + i4 + this.f4325e.hashCode() + this.f4326f.hashCode() + this.f4327g.hashCode();
        this.f4328h = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((R6.e) BuiltInParserKt.getBuiltInParserComponent().R3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
