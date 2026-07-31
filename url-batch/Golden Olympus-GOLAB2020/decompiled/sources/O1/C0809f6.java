package O1;

import O1.AbstractC0934m6;
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

/* renamed from: O1.f6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0809f6 implements JSONSerializable, Hashable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6173f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f6174g = a.f6180i;

    /* renamed from: a, reason: collision with root package name */
    public final List f6175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6177c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0915l5 f6178d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f6179e;

    /* renamed from: O1.f6$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6180i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0809f6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0809f6.f6173f.a(env, it);
        }
    }

    /* renamed from: O1.f6$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0809f6 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0934m6.b) BuiltInParserKt.getBuiltInParserComponent().F3().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public C0809f6(List arguments, String body, String name, EnumC0915l5 returnType) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        this.f6175a = arguments;
        this.f6176b = body;
        this.f6177c = name;
        this.f6178d = returnType;
    }

    public final boolean a(C0809f6 c0809f6, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0809f6 == null) {
            return false;
        }
        List list = this.f6175a;
        List list2 = c0809f6.f6175a;
        if (list.size() == list2.size()) {
            Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (!Intrinsics.areEqual(this.f6176b, c0809f6.f6176b) || !Intrinsics.areEqual(this.f6177c, c0809f6.f6177c) || this.f6178d != c0809f6.f6178d) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((C0827g6) next).a((C0827g6) list2.get(i4), resolver, otherResolver)) {
                    break;
                }
                i4 = i5;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6179e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0809f6.class).hashCode();
        Iterator it = this.f6175a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((C0827g6) it.next()).hash();
        }
        int hashCode2 = hashCode + i4 + this.f6176b.hashCode() + this.f6177c.hashCode() + this.f6178d.hashCode();
        this.f6179e = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0934m6.b) BuiltInParserKt.getBuiltInParserComponent().F3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
