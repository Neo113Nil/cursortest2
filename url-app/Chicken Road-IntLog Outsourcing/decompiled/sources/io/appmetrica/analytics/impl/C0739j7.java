package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739j7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0979se f8520a;

    /* renamed from: b, reason: collision with root package name */
    public final C0946r7 f8521b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0739j7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1024u7 fromModel(C0791l7 c0791l7) {
        C1024u7 c1024u7 = new C1024u7();
        Integer num = c0791l7.f8659a;
        if (num != null) {
            c1024u7.f9344a = num.intValue();
        }
        String str = c0791l7.f8660b;
        if (str != null) {
            c1024u7.f9345b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0791l7.f8661c;
        if (str2 != null) {
            c1024u7.f9346c = StringUtils.correctIllFormedString(str2);
        }
        Long l2 = c0791l7.f8662d;
        if (l2 != null) {
            c1024u7.f9347d = l2.longValue();
        }
        C0921q7 c0921q7 = c0791l7.f8663e;
        if (c0921q7 != null) {
            c1024u7.f9348e = this.f8521b.fromModel(c0921q7);
        }
        String str3 = c0791l7.f8664f;
        if (str3 != null) {
            c1024u7.f9349f = str3;
        }
        String str4 = c0791l7.f8665g;
        if (str4 != null) {
            c1024u7.f9350g = str4;
        }
        Long l6 = c0791l7.f8666h;
        if (l6 != null) {
            c1024u7.f9351h = l6.longValue();
        }
        Integer num2 = c0791l7.f8667i;
        if (num2 != null) {
            c1024u7.f9352i = num2.intValue();
        }
        Integer num3 = c0791l7.f8668j;
        if (num3 != null) {
            c1024u7.f9353j = num3.intValue();
        }
        String str5 = c0791l7.f8669k;
        if (str5 != null) {
            c1024u7.f9354k = str5;
        }
        N8 n8 = c0791l7.f8670l;
        if (n8 != null) {
            c1024u7.f9355l = n8.f7176a;
        }
        String str6 = c0791l7.f8671m;
        if (str6 != null) {
            c1024u7.f9356m = str6;
        }
        EnumC0768ka enumC0768ka = c0791l7.f8672n;
        if (enumC0768ka != null) {
            c1024u7.f9357n = enumC0768ka.f8618a;
        }
        EnumC1000t9 enumC1000t9 = c0791l7.f8673o;
        if (enumC1000t9 != null) {
            c1024u7.f9358o = enumC1000t9.f9307a;
        }
        Boolean bool = c0791l7.f8674p;
        if (bool != null) {
            c1024u7.f9359p = this.f8520a.fromModel(bool).intValue();
        }
        Integer num4 = c0791l7.f8675q;
        if (num4 != null) {
            c1024u7.f9360q = num4.intValue();
        }
        byte[] bArr = c0791l7.f8676r;
        if (bArr != null) {
            c1024u7.f9361r = bArr;
        }
        return c1024u7;
    }

    public C0739j7(C0979se c0979se, C0946r7 c0946r7) {
        this.f8520a = c0979se;
        this.f8521b = c0946r7;
    }

    public /* synthetic */ C0739j7(C0979se c0979se, C0946r7 c0946r7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0979se() : c0979se, (i2 & 2) != 0 ? new C0946r7(null, 1, null) : c0946r7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0791l7 toModel(C1024u7 c1024u7) {
        EnumC1000t9 enumC1000t9;
        C1024u7 c1024u72 = new C1024u7();
        int i2 = c1024u7.f9344a;
        Integer valueOf = i2 != c1024u72.f9344a ? Integer.valueOf(i2) : null;
        String str = c1024u7.f9345b;
        String str2 = !kotlin.jvm.internal.i.a(str, c1024u72.f9345b) ? str : null;
        String str3 = c1024u7.f9346c;
        String str4 = !kotlin.jvm.internal.i.a(str3, c1024u72.f9346c) ? str3 : null;
        long j2 = c1024u7.f9347d;
        Long valueOf2 = j2 != c1024u72.f9347d ? Long.valueOf(j2) : null;
        C0921q7 model = this.f8521b.toModel(c1024u7.f9348e);
        String str5 = c1024u7.f9349f;
        String str6 = !kotlin.jvm.internal.i.a(str5, c1024u72.f9349f) ? str5 : null;
        String str7 = c1024u7.f9350g;
        String str8 = !kotlin.jvm.internal.i.a(str7, c1024u72.f9350g) ? str7 : null;
        long j6 = c1024u7.f9351h;
        Long valueOf3 = Long.valueOf(j6);
        if (j6 == c1024u72.f9351h) {
            valueOf3 = null;
        }
        int i3 = c1024u7.f9352i;
        Integer valueOf4 = i3 != c1024u72.f9352i ? Integer.valueOf(i3) : null;
        int i6 = c1024u7.f9353j;
        Integer valueOf5 = i6 != c1024u72.f9353j ? Integer.valueOf(i6) : null;
        String str9 = c1024u7.f9354k;
        String str10 = !kotlin.jvm.internal.i.a(str9, c1024u72.f9354k) ? str9 : null;
        int i7 = c1024u7.f9355l;
        Integer valueOf6 = Integer.valueOf(i7);
        if (i7 == c1024u72.f9355l) {
            valueOf6 = null;
        }
        N8 a6 = valueOf6 != null ? N8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c1024u7.f9356m;
        String str12 = !kotlin.jvm.internal.i.a(str11, c1024u72.f9356m) ? str11 : null;
        int i8 = c1024u7.f9357n;
        Integer valueOf7 = Integer.valueOf(i8);
        if (i8 == c1024u72.f9357n) {
            valueOf7 = null;
        }
        EnumC0768ka a7 = valueOf7 != null ? EnumC0768ka.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i9 = c1024u7.f9358o;
        Integer valueOf8 = Integer.valueOf(i9);
        if (i9 == c1024u72.f9358o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC1000t9[] values = EnumC1000t9.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    EnumC1000t9 enumC1000t92 = values[i10];
                    EnumC1000t9[] enumC1000t9Arr = values;
                    if (enumC1000t92.f9307a == intValue) {
                        enumC1000t9 = enumC1000t92;
                        break;
                    }
                    i10++;
                    values = enumC1000t9Arr;
                } else {
                    enumC1000t9 = EnumC1000t9.NATIVE;
                    break;
                }
            }
        } else {
            enumC1000t9 = null;
        }
        Boolean a8 = this.f8520a.a(c1024u7.f9359p);
        int i11 = c1024u7.f9360q;
        Integer valueOf9 = i11 != c1024u72.f9360q ? Integer.valueOf(i11) : null;
        byte[] bArr = c1024u7.f9361r;
        return new C0791l7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a6, str12, a7, enumC1000t9, a8, valueOf9, !Arrays.equals(bArr, c1024u72.f9361r) ? bArr : null);
    }
}
