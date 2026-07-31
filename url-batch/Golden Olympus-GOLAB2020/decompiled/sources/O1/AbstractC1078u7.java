package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.u7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1078u7 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f8137b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8138c = a.f8140i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8139a;

    /* renamed from: O1.u7$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8140i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1078u7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1078u7.f8137b.a(env, it);
        }
    }

    /* renamed from: O1.u7$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1078u7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((A7) BuiltInParserKt.getBuiltInParserComponent().j4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.u7$c */
    public static final class c extends AbstractC1078u7 {

        /* renamed from: d, reason: collision with root package name */
        private final C1096v7 f8141d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1096v7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8141d = value;
        }

        public final C1096v7 c() {
            return this.f8141d;
        }
    }

    /* renamed from: O1.u7$d */
    public static final class d extends AbstractC1078u7 {

        /* renamed from: d, reason: collision with root package name */
        private final D7 f8142d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(D7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8142d = value;
        }

        public final D7 c() {
            return this.f8142d;
        }
    }

    public /* synthetic */ AbstractC1078u7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1078u7 abstractC1078u7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1078u7 == null) {
            return false;
        }
        if (this instanceof d) {
            D7 c4 = ((d) this).c();
            Object b4 = abstractC1078u7.b();
            return c4.a(b4 instanceof D7 ? (D7) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        C1096v7 c5 = ((c) this).c();
        Object b5 = abstractC1078u7.b();
        return c5.a(b5 instanceof C1096v7 ? (C1096v7) b5 : null, resolver, otherResolver);
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

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f8139a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new W1.m();
            }
            hash = ((c) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f8139a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((A7) BuiltInParserKt.getBuiltInParserComponent().j4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1078u7() {
    }
}
