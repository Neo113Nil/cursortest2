package O1;

import O1.B4;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1165z4 implements JSONSerializable, Hashable {

    /* renamed from: j, reason: collision with root package name */
    public static final b f8706j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f8707k = Expression.Companion.constant(EnumC0979of.NONE);

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f8708l = a.f8718i;

    /* renamed from: a, reason: collision with root package name */
    public final List f8709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8710b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8711c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8712d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f8713e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8714f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8715g;

    /* renamed from: h, reason: collision with root package name */
    public final List f8716h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f8717i;

    /* renamed from: O1.z4$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8718i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1165z4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1165z4.f8706j.a(env, it);
        }
    }

    /* renamed from: O1.z4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1165z4 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B4.c) BuiltInParserKt.getBuiltInParserComponent().B2().getValue()).a(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.z4$c */
    public static final class c implements JSONSerializable, Hashable {

        /* renamed from: d, reason: collision with root package name */
        public static final b f8719d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f8720e = a.f8724i;

        /* renamed from: a, reason: collision with root package name */
        public final Z f8721a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8722b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8723c;

        /* renamed from: O1.z4$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8724i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return c.f8719d.a(env, it);
            }
        }

        /* renamed from: O1.z4$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment env, JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                return ((C4) BuiltInParserKt.getBuiltInParserComponent().D2().getValue()).deserialize(env, json);
            }

            private b() {
            }
        }

        public c(Z div, long j4) {
            Intrinsics.checkNotNullParameter(div, "div");
            this.f8721a = div;
            this.f8722b = j4;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f8723c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = kotlin.jvm.internal.H.b(c.class).hashCode() + this.f8721a.hash() + Long.hashCode(this.f8722b);
            this.f8723c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C4) BuiltInParserKt.getBuiltInParserComponent().D2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public C1165z4(List list, String logId, List states, List list2, Expression transitionAnimationSelector, List list3, List list4, List list5) {
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        this.f8709a = list;
        this.f8710b = logId;
        this.f8711c = states;
        this.f8712d = list2;
        this.f8713e = transitionAnimationSelector;
        this.f8714f = list3;
        this.f8715g = list4;
        this.f8716h = list5;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int i4;
        int i5;
        int i6;
        Integer num = this.f8717i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1165z4.class).hashCode();
        List list = this.f8709a;
        int i7 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i4 = 0;
            while (it.hasNext()) {
                i4 += ((C0809f6) it.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int hashCode2 = hashCode + i4 + this.f8710b.hashCode();
        Iterator it2 = this.f8711c.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            i8 += ((c) it2.next()).hash();
        }
        int i9 = hashCode2 + i8;
        List list2 = this.f8712d;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            i5 = 0;
            while (it3.hasNext()) {
                i5 += ((Ne) it3.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hashCode3 = i9 + i5 + this.f8713e.hashCode();
        List list3 = this.f8714f;
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            i6 = 0;
            while (it4.hasNext()) {
                i6 += ((C1015qf) it4.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i10 = hashCode3 + i6;
        List list4 = this.f8715g;
        if (list4 != null) {
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                i7 += ((AbstractC1176zf) it5.next()).hash();
            }
        }
        int i11 = i10 + i7;
        this.f8717i = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B4.c) BuiltInParserKt.getBuiltInParserComponent().B2().getValue()).b(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C1165z4(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, str, list2, (i4 & 8) != 0 ? null : list3, (i4 & 16) != 0 ? f8707k : expression, (i4 & 32) != 0 ? null : list4, (i4 & 64) != 0 ? null : list5, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list6);
    }
}
