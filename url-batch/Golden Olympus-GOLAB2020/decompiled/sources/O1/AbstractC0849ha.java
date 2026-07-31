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

/* renamed from: O1.ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0849ha implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6383b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6384c = a.f6386i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6385a;

    /* renamed from: O1.ha$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6386i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0849ha invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0849ha.f6383b.a(env, it);
        }
    }

    /* renamed from: O1.ha$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0849ha a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0920la) BuiltInParserKt.getBuiltInParserComponent().Q5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.ha$c */
    public static final class c extends AbstractC0849ha {

        /* renamed from: d, reason: collision with root package name */
        private final C0867ia f6387d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0867ia value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6387d = value;
        }

        public final C0867ia c() {
            return this.f6387d;
        }
    }

    /* renamed from: O1.ha$d */
    public static final class d extends AbstractC0849ha {

        /* renamed from: d, reason: collision with root package name */
        private final C0974oa f6388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0974oa value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6388d = value;
        }

        public final C0974oa c() {
            return this.f6388d;
        }
    }

    public /* synthetic */ AbstractC0849ha(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0849ha abstractC0849ha, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0849ha == null) {
            return false;
        }
        if (this instanceof c) {
            C0867ia c4 = ((c) this).c();
            Object b4 = abstractC0849ha.b();
            return c4.a(b4 instanceof C0867ia ? (C0867ia) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        C0974oa c5 = ((d) this).c();
        Object b5 = abstractC0849ha.b();
        return c5.a(b5 instanceof C0974oa ? (C0974oa) b5 : null, resolver, otherResolver);
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

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f6385a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new W1.m();
            }
            hash = ((d) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f6385a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0920la) BuiltInParserKt.getBuiltInParserComponent().Q5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0849ha() {
    }
}
