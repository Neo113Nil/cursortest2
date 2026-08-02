package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588j7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0828se f7626a;

    /* renamed from: b, reason: collision with root package name */
    public final C0795r7 f7627b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0588j7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0873u7 fromModel(C0640l7 c0640l7) {
        C0873u7 c0873u7 = new C0873u7();
        Integer num = c0640l7.f7757a;
        if (num != null) {
            c0873u7.f8400a = num.intValue();
        }
        String str = c0640l7.f7758b;
        if (str != null) {
            c0873u7.f8401b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0640l7.f7759c;
        if (str2 != null) {
            c0873u7.f8402c = StringUtils.correctIllFormedString(str2);
        }
        Long l3 = c0640l7.f7760d;
        if (l3 != null) {
            c0873u7.f8403d = l3.longValue();
        }
        C0770q7 c0770q7 = c0640l7.f7761e;
        if (c0770q7 != null) {
            c0873u7.f8404e = this.f7627b.fromModel(c0770q7);
        }
        String str3 = c0640l7.f;
        if (str3 != null) {
            c0873u7.f = str3;
        }
        String str4 = c0640l7.f7762g;
        if (str4 != null) {
            c0873u7.f8405g = str4;
        }
        Long l4 = c0640l7.f7763h;
        if (l4 != null) {
            c0873u7.f8406h = l4.longValue();
        }
        Integer num2 = c0640l7.f7764i;
        if (num2 != null) {
            c0873u7.f8407i = num2.intValue();
        }
        Integer num3 = c0640l7.f7765j;
        if (num3 != null) {
            c0873u7.f8408j = num3.intValue();
        }
        String str5 = c0640l7.f7766k;
        if (str5 != null) {
            c0873u7.f8409k = str5;
        }
        N8 n8 = c0640l7.f7767l;
        if (n8 != null) {
            c0873u7.f8410l = n8.f6366a;
        }
        String str6 = c0640l7.f7768m;
        if (str6 != null) {
            c0873u7.f8411m = str6;
        }
        EnumC0617ka enumC0617ka = c0640l7.f7769n;
        if (enumC0617ka != null) {
            c0873u7.f8412n = enumC0617ka.f7718a;
        }
        EnumC0849t9 enumC0849t9 = c0640l7.o;
        if (enumC0849t9 != null) {
            c0873u7.o = enumC0849t9.f8364a;
        }
        Boolean bool = c0640l7.f7770p;
        if (bool != null) {
            c0873u7.f8413p = this.f7626a.fromModel(bool).intValue();
        }
        Integer num4 = c0640l7.f7771q;
        if (num4 != null) {
            c0873u7.f8414q = num4.intValue();
        }
        byte[] bArr = c0640l7.f7772r;
        if (bArr != null) {
            c0873u7.f8415r = bArr;
        }
        return c0873u7;
    }

    public C0588j7(C0828se c0828se, C0795r7 c0795r7) {
        this.f7626a = c0828se;
        this.f7627b = c0795r7;
    }

    public /* synthetic */ C0588j7(C0828se c0828se, C0795r7 c0795r7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0828se() : c0828se, (i3 & 2) != 0 ? new C0795r7(null, 1, null) : c0795r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0640l7 toModel(C0873u7 c0873u7) {
        EnumC0849t9 enumC0849t9;
        C0873u7 c0873u72 = new C0873u7();
        int i3 = c0873u7.f8400a;
        Integer valueOf = i3 != c0873u72.f8400a ? Integer.valueOf(i3) : null;
        String str = c0873u7.f8401b;
        String str2 = !kotlin.jvm.internal.j.a(str, c0873u72.f8401b) ? str : null;
        String str3 = c0873u7.f8402c;
        String str4 = !kotlin.jvm.internal.j.a(str3, c0873u72.f8402c) ? str3 : null;
        long j3 = c0873u7.f8403d;
        Long valueOf2 = j3 != c0873u72.f8403d ? Long.valueOf(j3) : null;
        C0770q7 model = this.f7627b.toModel(c0873u7.f8404e);
        String str5 = c0873u7.f;
        String str6 = !kotlin.jvm.internal.j.a(str5, c0873u72.f) ? str5 : null;
        String str7 = c0873u7.f8405g;
        String str8 = !kotlin.jvm.internal.j.a(str7, c0873u72.f8405g) ? str7 : null;
        long j4 = c0873u7.f8406h;
        Long valueOf3 = Long.valueOf(j4);
        if (j4 == c0873u72.f8406h) {
            valueOf3 = null;
        }
        int i4 = c0873u7.f8407i;
        Integer valueOf4 = i4 != c0873u72.f8407i ? Integer.valueOf(i4) : null;
        int i5 = c0873u7.f8408j;
        Integer valueOf5 = i5 != c0873u72.f8408j ? Integer.valueOf(i5) : null;
        String str9 = c0873u7.f8409k;
        String str10 = !kotlin.jvm.internal.j.a(str9, c0873u72.f8409k) ? str9 : null;
        int i6 = c0873u7.f8410l;
        Integer valueOf6 = Integer.valueOf(i6);
        if (i6 == c0873u72.f8410l) {
            valueOf6 = null;
        }
        N8 a3 = valueOf6 != null ? N8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0873u7.f8411m;
        String str12 = !kotlin.jvm.internal.j.a(str11, c0873u72.f8411m) ? str11 : null;
        int i7 = c0873u7.f8412n;
        Integer valueOf7 = Integer.valueOf(i7);
        if (i7 == c0873u72.f8412n) {
            valueOf7 = null;
        }
        EnumC0617ka a4 = valueOf7 != null ? EnumC0617ka.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i8 = c0873u7.o;
        Integer valueOf8 = Integer.valueOf(i8);
        if (i8 == c0873u72.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0849t9[] values = EnumC0849t9.values();
            int length = values.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    enumC0849t9 = values[i9];
                    EnumC0849t9[] enumC0849t9Arr = values;
                    if (enumC0849t9.f8364a == intValue) {
                        break;
                    }
                    i9++;
                    values = enumC0849t9Arr;
                } else {
                    enumC0849t9 = EnumC0849t9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0849t9 = null;
        }
        Boolean a5 = this.f7626a.a(c0873u7.f8413p);
        int i10 = c0873u7.f8414q;
        Integer valueOf9 = i10 != c0873u72.f8414q ? Integer.valueOf(i10) : null;
        byte[] bArr = c0873u7.f8415r;
        return new C0640l7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a3, str12, a4, enumC0849t9, a5, valueOf9, !Arrays.equals(bArr, c0873u72.f8415r) ? bArr : null);
    }
}
