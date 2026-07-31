package O1;

import O1.M2;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class K2 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3370d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f3371e = a.f3375i;

    /* renamed from: a, reason: collision with root package name */
    public final List f3372a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f3373b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f3374c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f3375i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return K2.f3370d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final K2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((M2.b) BuiltInParserKt.getBuiltInParserComponent().t1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public K2(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3372a = items;
    }

    public final boolean a(K2 k22, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (k22 == null) {
            return false;
        }
        List list = this.f3372a;
        List list2 = k22.f3372a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((O2) obj).a((O2) list2.get(i4), resolver, otherResolver)) {
                return false;
            }
            i4 = i5;
        }
        return true;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f3374c;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.f3372a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((O2) it.next()).hash();
        }
        int i5 = propertiesHash + i4;
        this.f3374c = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f3373b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(K2.class).hashCode();
        this.f3373b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((M2.b) BuiltInParserKt.getBuiltInParserComponent().t1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
