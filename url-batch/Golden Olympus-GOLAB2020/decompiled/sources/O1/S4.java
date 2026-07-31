package O1;

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
public final class S4 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4705d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f4706e = a.f4710i;

    /* renamed from: a, reason: collision with root package name */
    public final List f4707a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4708b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f4709c;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4710i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return S4.f4705d.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((T4) BuiltInParserKt.getBuiltInParserComponent().P2().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public S4(List list, List list2) {
        this.f4707a = list;
        this.f4708b = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004e, code lost:
    
        if (r7.f4707a == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(S4 s4, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (s4 == null) {
            return false;
        }
        List list = this.f4707a;
        if (list != null) {
            List list2 = s4.f4707a;
            if (list2 != null && list.size() == list2.size()) {
                int i4 = 0;
                for (Object obj : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!((C0892k0) obj).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
                        break;
                    }
                    i4 = i5;
                }
                List list3 = this.f4708b;
                List list4 = s4.f4708b;
                if (list3 != null) {
                    if (list4 != null && list3.size() == list4.size()) {
                        int i6 = 0;
                        for (Object obj2 : list3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((C0892k0) obj2).a((C0892k0) list4.get(i6), resolver, otherResolver)) {
                                i6 = i7;
                            }
                        }
                        return true;
                    }
                } else if (list4 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        Integer num = this.f4709c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(S4.class).hashCode();
        List list = this.f4707a;
        int i5 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0892k0) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i6 = hashCode + i4;
        List list2 = this.f4708b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        }
        int i7 = i6 + i5;
        this.f4709c = Integer.valueOf(i7);
        return i7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((T4) BuiltInParserKt.getBuiltInParserComponent().P2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
