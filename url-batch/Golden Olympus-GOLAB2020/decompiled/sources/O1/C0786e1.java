package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0786e1 implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f6064e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f6065f = a.f6070i;

    /* renamed from: a, reason: collision with root package name */
    public final List f6066a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6067b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6068c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6069d;

    /* renamed from: O1.e1$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6070i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0786e1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0786e1.f6064e.a(env, it);
        }
    }

    /* renamed from: O1.e1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0786e1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C0804f1) BuiltInParserKt.getBuiltInParserComponent().l0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0786e1(List list, List list2, Expression url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6066a = list;
        this.f6067b = list2;
        this.f6068c = url;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r7.f6067b == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004e, code lost:
    
        if (r7.f6066a == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C0786e1 c0786e1, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0786e1 == null) {
            return false;
        }
        List list = this.f6066a;
        if (list != null) {
            List list2 = c0786e1.f6066a;
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
                List list3 = this.f6067b;
                if (list3 != null) {
                    List list4 = c0786e1.f6067b;
                    if (list4 != null && list3.size() == list4.size()) {
                        int i6 = 0;
                        for (Object obj2 : list3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (!((C0892k0) obj2).a((C0892k0) list4.get(i6), resolver, otherResolver)) {
                                break;
                            }
                            i6 = i7;
                        }
                        if (Intrinsics.areEqual(this.f6068c.evaluate(resolver), c0786e1.f6068c.evaluate(otherResolver))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        Integer num = this.f6069d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0786e1.class).hashCode();
        List list = this.f6066a;
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
        List list2 = this.f6067b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i5 += ((C0892k0) it2.next()).hash();
            }
        }
        int hashCode2 = i6 + i5 + this.f6068c.hashCode();
        this.f6069d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C0804f1) BuiltInParserKt.getBuiltInParserComponent().l0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
