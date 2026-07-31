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

/* renamed from: O1.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1130x5 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f8445b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8446c = b.f8449i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8447a;

    /* renamed from: O1.x5$a */
    public static final class a extends AbstractC1130x5 {

        /* renamed from: d, reason: collision with root package name */
        private final C0788e3 f8448d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0788e3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8448d = value;
        }

        public final C0788e3 c() {
            return this.f8448d;
        }
    }

    /* renamed from: O1.x5$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8449i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1130x5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1130x5.f8445b.a(env, it);
        }
    }

    /* renamed from: O1.x5$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1130x5 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1148y5) BuiltInParserKt.getBuiltInParserComponent().e3().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.x5$d */
    public static final class d extends AbstractC1130x5 {

        /* renamed from: d, reason: collision with root package name */
        private final B5 f8450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(B5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8450d = value;
        }

        public final B5 c() {
            return this.f8450d;
        }
    }

    public /* synthetic */ AbstractC1130x5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1130x5 abstractC1130x5, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1130x5 == null) {
            return false;
        }
        if (this instanceof a) {
            C0788e3 c4 = ((a) this).c();
            Object b4 = abstractC1130x5.b();
            return c4.a(b4 instanceof C0788e3 ? (C0788e3) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        B5 c5 = ((d) this).c();
        Object b5 = abstractC1130x5.b();
        return c5.a(b5 instanceof B5 ? (B5) b5 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f8447a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof a) {
            hash = ((a) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new W1.m();
            }
            hash = ((d) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f8447a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1148y5) BuiltInParserKt.getBuiltInParserComponent().e3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1130x5() {
    }
}
