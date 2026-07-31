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

/* renamed from: O1.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0775d8 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6026b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6027c = a.f6029i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6028a;

    /* renamed from: O1.d8$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6029i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0775d8 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0775d8.f6026b.a(env, it);
        }
    }

    /* renamed from: O1.d8$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0775d8 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0900k8) BuiltInParserKt.getBuiltInParserComponent().D4().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.d8$c */
    public static final class c extends AbstractC0775d8 {

        /* renamed from: d, reason: collision with root package name */
        private final C0847h8 f6030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0847h8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6030d = value;
        }

        public final C0847h8 c() {
            return this.f6030d;
        }
    }

    /* renamed from: O1.d8$d */
    public static final class d extends AbstractC0775d8 {

        /* renamed from: d, reason: collision with root package name */
        private final C0954n8 f6031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0954n8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6031d = value;
        }

        public final C0954n8 c() {
            return this.f6031d;
        }
    }

    public /* synthetic */ AbstractC0775d8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0775d8 abstractC0775d8, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0775d8 == null) {
            return false;
        }
        if (this instanceof d) {
            C0954n8 c4 = ((d) this).c();
            Object b4 = abstractC0775d8.b();
            return c4.a(b4 instanceof C0954n8 ? (C0954n8) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        C0847h8 c5 = ((c) this).c();
        Object b5 = abstractC0775d8.b();
        return c5.a(b5 instanceof C0847h8 ? (C0847h8) b5 : null, resolver, otherResolver);
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
        Integer num = this.f6028a;
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
        this.f6028a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0900k8) BuiltInParserKt.getBuiltInParserComponent().D4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0775d8() {
    }
}
