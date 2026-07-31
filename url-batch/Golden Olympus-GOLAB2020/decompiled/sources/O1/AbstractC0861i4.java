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

/* renamed from: O1.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0861i4 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6466b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6467c = a.f6469i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6468a;

    /* renamed from: O1.i4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6469i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0861i4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0861i4.f6466b.a(env, it);
        }
    }

    /* renamed from: O1.i4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0861i4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0878j4) BuiltInParserKt.getBuiltInParserComponent().s2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.i4$c */
    public static final class c extends AbstractC0861i4 {

        /* renamed from: d, reason: collision with root package name */
        private final H5 f6470d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(H5 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6470d = value;
        }

        public final H5 c() {
            return this.f6470d;
        }
    }

    /* renamed from: O1.i4$d */
    public static final class d extends AbstractC0861i4 {

        /* renamed from: d, reason: collision with root package name */
        private final C0971o7 f6471d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0971o7 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6471d = value;
        }

        public final C0971o7 c() {
            return this.f6471d;
        }
    }

    public /* synthetic */ AbstractC0861i4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0861i4 abstractC0861i4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0861i4 == null) {
            return false;
        }
        if (this instanceof d) {
            C0971o7 c4 = ((d) this).c();
            Object b4 = abstractC0861i4.b();
            return c4.a(b4 instanceof C0971o7 ? (C0971o7) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        H5 c5 = ((c) this).c();
        Object b5 = abstractC0861i4.b();
        return c5.a(b5 instanceof H5 ? (H5) b5 : null, resolver, otherResolver);
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
        Integer num = this.f6468a;
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
        this.f6468a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0878j4) BuiltInParserKt.getBuiltInParserComponent().s2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0861i4() {
    }
}
