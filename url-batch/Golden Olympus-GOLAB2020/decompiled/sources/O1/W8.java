package O1;

import O1.AbstractC0861i4;
import O1.Z8;
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
public final class W8 implements JSONSerializable, Hashable, F2 {

    /* renamed from: m, reason: collision with root package name */
    public static final b f5116m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f5117n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f5118o;

    /* renamed from: p, reason: collision with root package name */
    private static final AbstractC0861i4.c f5119p;

    /* renamed from: q, reason: collision with root package name */
    private static final Expression f5120q;

    /* renamed from: r, reason: collision with root package name */
    private static final Function2 f5121r;

    /* renamed from: a, reason: collision with root package name */
    private final List f5122a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f5123b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f5124c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5125d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f5126e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5127f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f5128g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC0861i4 f5129h;

    /* renamed from: i, reason: collision with root package name */
    private final Expression f5130i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f5131j;

    /* renamed from: k, reason: collision with root package name */
    private final String f5132k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f5133l;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5134i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return W8.f5116m.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Z8.d) BuiltInParserKt.getBuiltInParserComponent().e5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f5117n = companion.constant(EnumC1145y2.NORMAL);
        f5118o = companion.constant(EnumC1163z2.LINEAR);
        f5119p = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f5120q = companion.constant(0L);
        f5121r = a.f5134i;
    }

    public W8(List list, Expression direction, Expression duration, List list2, Expression endValue, String id, Expression interpolator, AbstractC0861i4 repeatCount, Expression startDelay, Expression expression, String variableName) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f5122a = list;
        this.f5123b = direction;
        this.f5124c = duration;
        this.f5125d = list2;
        this.f5126e = endValue;
        this.f5127f = id;
        this.f5128g = interpolator;
        this.f5129h = repeatCount;
        this.f5130i = startDelay;
        this.f5131j = expression;
        this.f5132k = variableName;
    }

    @Override // O1.F2
    public List a() {
        return this.f5125d;
    }

    @Override // O1.F2
    public AbstractC0861i4 b() {
        return this.f5129h;
    }

    @Override // O1.F2
    public Expression c() {
        return this.f5123b;
    }

    @Override // O1.F2
    public Expression d() {
        return this.f5128g;
    }

    @Override // O1.F2
    public List e() {
        return this.f5122a;
    }

    @Override // O1.F2
    public Expression f() {
        return this.f5130i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r7.a() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0055, code lost:
    
        if (r7.e() == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(W8 w8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (w8 == null) {
            return false;
        }
        List e4 = e();
        if (e4 != null) {
            List e5 = w8.e();
            if (e5 != null && e4.size() == e5.size()) {
                int i4 = 0;
                for (Object obj : e4) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((C0892k0) obj).a((C0892k0) e5.get(i4), resolver, otherResolver)) {
                        break;
                    }
                    i4 = i5;
                }
                if (c().evaluate(resolver) == w8.c().evaluate(otherResolver) && ((Number) getDuration().evaluate(resolver)).longValue() == ((Number) w8.getDuration().evaluate(otherResolver)).longValue()) {
                    List a4 = a();
                    if (a4 != null) {
                        List a5 = w8.a();
                        if (a5 != null && a4.size() == a5.size()) {
                            int i6 = 0;
                            for (Object obj2 : a4) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (!((C0892k0) obj2).a((C0892k0) a5.get(i6), resolver, otherResolver)) {
                                    break;
                                }
                                i6 = i7;
                            }
                            if (((Number) this.f5126e.evaluate(resolver)).doubleValue() == ((Number) w8.f5126e.evaluate(otherResolver)).doubleValue() && Intrinsics.areEqual(getId(), w8.getId()) && d().evaluate(resolver) == w8.d().evaluate(otherResolver) && b().a(w8.b(), resolver, otherResolver) && ((Number) f().evaluate(resolver)).longValue() == ((Number) w8.f().evaluate(otherResolver)).longValue()) {
                                Expression expression = this.f5131j;
                                Double d4 = expression != null ? (Double) expression.evaluate(resolver) : null;
                                Expression expression2 = w8.f5131j;
                                if (!Intrinsics.areEqual(d4, expression2 != null ? (Double) expression2.evaluate(otherResolver) : null) || !Intrinsics.areEqual(h(), w8.h())) {
                                    break;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    @Override // O1.F2
    public Expression getDuration() {
        return this.f5124c;
    }

    @Override // O1.F2
    public String getId() {
        return this.f5127f;
    }

    public String h() {
        return this.f5132k;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        Integer num = this.f5133l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(W8.class).hashCode();
        List e4 = e();
        if (e4 != null) {
            Iterator it = e4.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int hashCode2 = hashCode + i4 + c().hashCode() + getDuration().hashCode();
        List a4 = a();
        if (a4 != null) {
            Iterator it2 = a4.iterator();
            i5 = 0;
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hashCode3 = hashCode2 + i5 + this.f5126e.hashCode() + getId().hashCode() + d().hashCode() + b().hash() + f().hashCode();
        Expression expression = this.f5131j;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0) + h().hashCode();
        this.f5133l = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Z8.d) BuiltInParserKt.getBuiltInParserComponent().e5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
