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

/* renamed from: O1.l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0919l9 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6923b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f6924c = a.f6926i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f6925a;

    /* renamed from: O1.l9$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6926i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0919l9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC0919l9.f6923b.a(env, it);
        }
    }

    /* renamed from: O1.l9$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0919l9 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0937m9) BuiltInParserKt.getBuiltInParserComponent().n5().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.l9$c */
    public static final class c extends AbstractC0919l9 {

        /* renamed from: d, reason: collision with root package name */
        private final C0991p9 f6927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0991p9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6927d = value;
        }

        public final C0991p9 c() {
            return this.f6927d;
        }
    }

    /* renamed from: O1.l9$d */
    public static final class d extends AbstractC0919l9 {

        /* renamed from: d, reason: collision with root package name */
        private final C1116w9 f6928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1116w9 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f6928d = value;
        }

        public final C1116w9 c() {
            return this.f6928d;
        }
    }

    public /* synthetic */ AbstractC0919l9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC0919l9 abstractC0919l9, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC0919l9 == null) {
            return false;
        }
        if (this instanceof d) {
            C1116w9 c4 = ((d) this).c();
            Object b4 = abstractC0919l9.b();
            return c4.a(b4 instanceof C1116w9 ? (C1116w9) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        C0991p9 c5 = ((c) this).c();
        Object b5 = abstractC0919l9.b();
        return c5.a(b5 instanceof C0991p9 ? (C0991p9) b5 : null, resolver, otherResolver);
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
        Integer num = this.f6925a;
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
        this.f6925a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0937m9) BuiltInParserKt.getBuiltInParserComponent().n5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC0919l9() {
    }
}
