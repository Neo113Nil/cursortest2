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

/* renamed from: O1.he, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0853he implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6408b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6409c = b.f6412i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6410a;

    /* renamed from: O1.he$a */
    public static final class a extends AbstractC0853he {

        /* renamed from: d, reason: collision with root package name */
        private final D3 f6411d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6411d = value;
        }

        public final D3 c() {
            return this.f6411d;
        }
    }

    /* renamed from: O1.he$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6412i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0853he invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0853he.f6408b.a(env, it);
        }
    }

    /* renamed from: O1.he$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0853he a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0871ie) BuiltInParserKt.getBuiltInParserComponent().m8().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.he$d */
    public static final class d extends AbstractC0853he {

        /* renamed from: d, reason: collision with root package name */
        private final C1119wc f6413d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1119wc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6413d = value;
        }

        public final C1119wc c() {
            return this.f6413d;
        }
    }

    public /* synthetic */ AbstractC0853he(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0853he abstractC0853he, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0853he == null) {
            return false;
        }
        if (this instanceof d) {
            C1119wc c4 = ((d) this).c();
            Object b4 = abstractC0853he.b();
            return c4.a(b4 instanceof C1119wc ? (C1119wc) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof a)) {
            throw new W1.m();
        }
        D3 c5 = ((a) this).c();
        Object b5 = abstractC0853he.b();
        return c5.a(b5 instanceof D3 ? (D3) b5 : null, resolver, otherResolver);
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

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f6410a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new W1.m();
            }
            hash = ((a) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f6410a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0871ie) BuiltInParserKt.getBuiltInParserComponent().m8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0853he() {
    }
}
