package O1;

import O1.AbstractC0861i4;
import O1.P3;
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
public final class M3 implements JSONSerializable, Hashable, F2 {

    /* renamed from: m, reason: collision with root package name */
    public static final b f3806m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Expression f3807n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f3808o;

    /* renamed from: p, reason: collision with root package name */
    private static final AbstractC0861i4.c f3809p;

    /* renamed from: q, reason: collision with root package name */
    private static final Expression f3810q;

    /* renamed from: r, reason: collision with root package name */
    private static final Function2 f3811r;

    /* renamed from: a, reason: collision with root package name */
    private final List f3812a;

    /* renamed from: b, reason: collision with root package name */
    private final Expression f3813b;

    /* renamed from: c, reason: collision with root package name */
    private final Expression f3814c;

    /* renamed from: d, reason: collision with root package name */
    private final List f3815d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f3816e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3817f;

    /* renamed from: g, reason: collision with root package name */
    private final Expression f3818g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC0861i4 f3819h;

    /* renamed from: i, reason: collision with root package name */
    private final Expression f3820i;

    /* renamed from: j, reason: collision with root package name */
    public final Expression f3821j;

    /* renamed from: k, reason: collision with root package name */
    private final String f3822k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f3823l;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3824i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return M3.f3806m.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final M3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((P3.d) BuiltInParserKt.getBuiltInParserComponent().g2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f3807n = companion.constant(EnumC1145y2.NORMAL);
        f3808o = companion.constant(EnumC1163z2.LINEAR);
        f3809p = new AbstractC0861i4.c(new H5(companion.constant(1L)));
        f3810q = companion.constant(0L);
        f3811r = a.f3824i;
    }

    public M3(List list, Expression direction, Expression duration, List list2, Expression endValue, String id, Expression interpolator, AbstractC0861i4 repeatCount, Expression startDelay, Expression expression, String variableName) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.f3812a = list;
        this.f3813b = direction;
        this.f3814c = duration;
        this.f3815d = list2;
        this.f3816e = endValue;
        this.f3817f = id;
        this.f3818g = interpolator;
        this.f3819h = repeatCount;
        this.f3820i = startDelay;
        this.f3821j = expression;
        this.f3822k = variableName;
    }

    @Override // O1.F2
    public List a() {
        return this.f3815d;
    }

    @Override // O1.F2
    public AbstractC0861i4 b() {
        return this.f3819h;
    }

    @Override // O1.F2
    public Expression c() {
        return this.f3813b;
    }

    @Override // O1.F2
    public Expression d() {
        return this.f3818g;
    }

    @Override // O1.F2
    public List e() {
        return this.f3812a;
    }

    @Override // O1.F2
    public Expression f() {
        return this.f3820i;
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
    public final boolean g(M3 m32, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (m32 == null) {
            return false;
        }
        List e4 = e();
        if (e4 != null) {
            List e5 = m32.e();
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
                if (c().evaluate(resolver) == m32.c().evaluate(otherResolver) && ((Number) getDuration().evaluate(resolver)).longValue() == ((Number) m32.getDuration().evaluate(otherResolver)).longValue()) {
                    List a4 = a();
                    if (a4 != null) {
                        List a5 = m32.a();
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
                            if (((Number) this.f3816e.evaluate(resolver)).intValue() == ((Number) m32.f3816e.evaluate(otherResolver)).intValue() && Intrinsics.areEqual(getId(), m32.getId()) && d().evaluate(resolver) == m32.d().evaluate(otherResolver) && b().a(m32.b(), resolver, otherResolver) && ((Number) f().evaluate(resolver)).longValue() == ((Number) m32.f().evaluate(otherResolver)).longValue()) {
                                Expression expression = this.f3821j;
                                Integer num = expression != null ? (Integer) expression.evaluate(resolver) : null;
                                Expression expression2 = m32.f3821j;
                                if (!Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(otherResolver) : null) || !Intrinsics.areEqual(h(), m32.h())) {
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
        return this.f3814c;
    }

    @Override // O1.F2
    public String getId() {
        return this.f3817f;
    }

    public String h() {
        return this.f3822k;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        Integer num = this.f3823l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(M3.class).hashCode();
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
        int hashCode3 = hashCode2 + i5 + this.f3816e.hashCode() + getId().hashCode() + d().hashCode() + b().hash() + f().hashCode();
        Expression expression = this.f3821j;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0) + h().hashCode();
        this.f3823l = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((P3.d) BuiltInParserKt.getBuiltInParserComponent().g2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
