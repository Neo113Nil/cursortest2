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

/* renamed from: O1.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1092v3 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final c f8205b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8206c = b.f8209i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8207a;

    /* renamed from: O1.v3$a */
    public static final class a extends AbstractC1092v3 {

        /* renamed from: d, reason: collision with root package name */
        private final C0931m3 f8208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0931m3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8208d = value;
        }

        public final C0931m3 c() {
            return this.f8208d;
        }
    }

    /* renamed from: O1.v3$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f8209i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1092v3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1092v3.f8205b.a(env, it);
        }
    }

    /* renamed from: O1.v3$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1092v3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1110w3) BuiltInParserKt.getBuiltInParserComponent().R1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    /* renamed from: O1.v3$d */
    public static final class d extends AbstractC1092v3 {

        /* renamed from: d, reason: collision with root package name */
        private final C1020r3 f8210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1020r3 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8210d = value;
        }

        public final C1020r3 c() {
            return this.f8210d;
        }
    }

    public /* synthetic */ AbstractC1092v3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1092v3 abstractC1092v3, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1092v3 == null) {
            return false;
        }
        if (this instanceof d) {
            C1020r3 c4 = ((d) this).c();
            Object b4 = abstractC1092v3.b();
            return c4.a(b4 instanceof C1020r3 ? (C1020r3) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof a)) {
            throw new W1.m();
        }
        C0931m3 c5 = ((a) this).c();
        Object b5 = abstractC1092v3.b();
        return c5.a(b5 instanceof C0931m3 ? (C0931m3) b5 : null, resolver, otherResolver);
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
        Integer num = this.f8207a;
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
        this.f8207a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1110w3) BuiltInParserKt.getBuiltInParserComponent().R1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1092v3() {
    }
}
