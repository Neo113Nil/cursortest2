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

/* renamed from: O1.b7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0738b7 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5788b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5789c = a.f5791i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5790a;

    /* renamed from: O1.b7$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5791i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0738b7 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0738b7.f5788b.a(env, it);
        }
    }

    /* renamed from: O1.b7$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0738b7 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0756c7) BuiltInParserKt.getBuiltInParserComponent().X3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.b7$c */
    public static final class c extends AbstractC0738b7 {

        /* renamed from: d, reason: collision with root package name */
        private final G4 f5792d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G4 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5792d = value;
        }

        public final G4 c() {
            return this.f5792d;
        }
    }

    /* renamed from: O1.b7$d */
    public static final class d extends AbstractC0738b7 {

        /* renamed from: d, reason: collision with root package name */
        private final Mc f5793d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Mc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5793d = value;
        }

        public final Mc c() {
            return this.f5793d;
        }
    }

    public /* synthetic */ AbstractC0738b7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0738b7 abstractC0738b7, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0738b7 == null) {
            return false;
        }
        if (this instanceof c) {
            G4 c4 = ((c) this).c();
            Object b4 = abstractC0738b7.b();
            return c4.a(b4 instanceof G4 ? (G4) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        Mc c5 = ((d) this).c();
        Object b5 = abstractC0738b7.b();
        return c5.a(b5 instanceof Mc ? (Mc) b5 : null, resolver, otherResolver);
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
        Integer num = this.f5790a;
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
        this.f5790a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0756c7) BuiltInParserKt.getBuiltInParserComponent().X3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0738b7() {
    }
}
