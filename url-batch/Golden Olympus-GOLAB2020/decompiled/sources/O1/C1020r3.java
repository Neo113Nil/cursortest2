package O1;

import O1.AbstractC1056t3;
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

/* renamed from: O1.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1020r3 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7755d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7756e = a.f7760i;

    /* renamed from: a, reason: collision with root package name */
    public final List f7757a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f7758b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7759c;

    /* renamed from: O1.r3$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7760i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1020r3 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1020r3.f7755d.a(env, it);
        }
    }

    /* renamed from: O1.r3$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1020r3 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1056t3.b) BuiltInParserKt.getBuiltInParserComponent().O1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C1020r3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f7757a = items;
    }

    public final boolean a(C1020r3 c1020r3, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1020r3 == null) {
            return false;
        }
        List list = this.f7757a;
        List list2 = c1020r3.f7757a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((AbstractC1092v3) obj).a((AbstractC1092v3) list2.get(i4), resolver, otherResolver)) {
                return false;
            }
            i4 = i5;
        }
        return true;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7759c;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator it = this.f7757a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((AbstractC1092v3) it.next()).hash();
        }
        int i5 = propertiesHash + i4;
        this.f7759c = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f7758b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1020r3.class).hashCode();
        this.f7758b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1056t3.b) BuiltInParserKt.getBuiltInParserComponent().O1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
