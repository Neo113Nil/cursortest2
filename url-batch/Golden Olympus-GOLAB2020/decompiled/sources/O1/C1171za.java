package O1;

import O1.Aa;
import O1.Ga;
import O1.Ma;
import O1.Na;
import O1.Xa;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1171za implements JSONSerializable, Hashable {

    /* renamed from: g, reason: collision with root package name */
    public static final c f8804g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Aa.d f8805h;

    /* renamed from: i, reason: collision with root package name */
    private static final Aa.d f8806i;

    /* renamed from: j, reason: collision with root package name */
    private static final Na.d f8807j;

    /* renamed from: k, reason: collision with root package name */
    private static final Function2 f8808k;

    /* renamed from: a, reason: collision with root package name */
    public final Aa f8809a;

    /* renamed from: b, reason: collision with root package name */
    public final Aa f8810b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8811c;

    /* renamed from: d, reason: collision with root package name */
    public final ExpressionList f8812d;

    /* renamed from: e, reason: collision with root package name */
    public final Na f8813e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8814f;

    /* renamed from: O1.za$a */
    public static final class a implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f8815d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f8816e = C0054a.f8820i;

        /* renamed from: a, reason: collision with root package name */
        public final Expression f8817a;

        /* renamed from: b, reason: collision with root package name */
        public final Expression f8818b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8819c;

        /* renamed from: O1.za$a$a, reason: collision with other inner class name */
        static final class C0054a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0054a f8820i = new C0054a();

            C0054a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return a.f8815d.a(env, it);
            }
        }

        /* renamed from: O1.za$a$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((Ga.b) BuiltInParserKt.getBuiltInParserComponent().c6().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public a(Expression color, Expression position) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f8817a = color;
            this.f8818b = position;
        }

        public final boolean a(a aVar, ExpressionResolver resolver, ExpressionResolver otherResolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
            return aVar != null && ((Number) this.f8817a.evaluate(resolver)).intValue() == ((Number) aVar.f8817a.evaluate(otherResolver)).intValue() && ((Number) this.f8818b.evaluate(resolver)).doubleValue() == ((Number) aVar.f8818b.evaluate(otherResolver)).doubleValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f8819c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(a.class).hashCode() + this.f8817a.hashCode() + this.f8818b.hashCode();
            this.f8819c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Ga.b) BuiltInParserKt.getBuiltInParserComponent().c6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* renamed from: O1.za$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8821i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1171za invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1171za.f8804g.a(env, it);
        }
    }

    /* renamed from: O1.za$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1171za a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ma.b) BuiltInParserKt.getBuiltInParserComponent().i6().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        f8805h = new Aa.d(new Sa(companion.constant(valueOf)));
        f8806i = new Aa.d(new Sa(companion.constant(valueOf)));
        f8807j = new Na.d(new Xa(companion.constant(Xa.c.FARTHEST_CORNER)));
        f8808k = b.f8821i;
    }

    public C1171za(Aa centerX, Aa centerY, List list, ExpressionList expressionList, Na radius) {
        Intrinsics.checkNotNullParameter(centerX, "centerX");
        Intrinsics.checkNotNullParameter(centerY, "centerY");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.f8809a = centerX;
        this.f8810b = centerY;
        this.f8811c = list;
        this.f8812d = expressionList;
        this.f8813e = radius;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        if (r7.f8812d == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0062, code lost:
    
        if (r7.f8811c == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C1171za c1171za, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        List evaluate;
        List evaluate2;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1171za != null && this.f8809a.a(c1171za.f8809a, resolver, otherResolver) && this.f8810b.a(c1171za.f8810b, resolver, otherResolver)) {
            List list = this.f8811c;
            if (list != null) {
                List list2 = c1171za.f8811c;
                if (list2 != null && list.size() == list2.size()) {
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((a) obj).a((a) list2.get(i4), resolver, otherResolver)) {
                            break;
                        }
                        i4 = i5;
                    }
                    ExpressionList expressionList = this.f8812d;
                    if (expressionList != null && (evaluate = expressionList.evaluate(resolver)) != null) {
                        ExpressionList expressionList2 = c1171za.f8812d;
                        if (expressionList2 != null && (evaluate2 = expressionList2.evaluate(otherResolver)) != null && evaluate.size() == evaluate2.size()) {
                            int i6 = 0;
                            for (Object obj2 : evaluate) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((Number) obj2).intValue() != ((Number) evaluate2.get(i6)).intValue()) {
                                    break;
                                }
                                i6 = i7;
                            }
                            if (this.f8813e.a(c1171za.f8813e, resolver, otherResolver)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        Integer num = this.f8814f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1171za.class).hashCode() + this.f8809a.hash() + this.f8810b.hash();
        List list = this.f8811c;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((a) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i5 = hashCode + i4;
        ExpressionList expressionList = this.f8812d;
        int hashCode2 = i5 + (expressionList != null ? expressionList.hashCode() : 0) + this.f8813e.hash();
        this.f8814f = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ma.b) BuiltInParserKt.getBuiltInParserComponent().i6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
