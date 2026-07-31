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

/* renamed from: O1.xe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1139xe implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f8493b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8494c = a.f8496i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8495a;

    /* renamed from: O1.xe$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8496i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1139xe invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1139xe.f8493b.a(env, it);
        }
    }

    /* renamed from: O1.xe$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1139xe a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Be) BuiltInParserKt.getBuiltInParserComponent().x8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.xe$c */
    public static final class c extends AbstractC1139xe {

        /* renamed from: d, reason: collision with root package name */
        private final Ee f8497d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ee value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8497d = value;
        }

        public final Ee c() {
            return this.f8497d;
        }
    }

    /* renamed from: O1.xe$d */
    public static final class d extends AbstractC1139xe {

        /* renamed from: d, reason: collision with root package name */
        private final Ie f8498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ie value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8498d = value;
        }

        public final Ie c() {
            return this.f8498d;
        }
    }

    public /* synthetic */ AbstractC1139xe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1139xe abstractC1139xe, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1139xe == null) {
            return false;
        }
        if (this instanceof c) {
            Ee c4 = ((c) this).c();
            Object b4 = abstractC1139xe.b();
            return c4.a(b4 instanceof Ee ? (Ee) b4 : null, resolver, otherResolver);
        }
        if (!(this instanceof d)) {
            throw new W1.m();
        }
        Ie c5 = ((d) this).c();
        Object b5 = abstractC1139xe.b();
        return c5.a(b5 instanceof Ie ? (Ie) b5 : null, resolver, otherResolver);
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
        Integer num = this.f8495a;
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
        this.f8495a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Be) BuiltInParserKt.getBuiltInParserComponent().x8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1139xe() {
    }
}
