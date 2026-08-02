package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504b7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0769le f11483a;

    /* renamed from: b, reason: collision with root package name */
    public final C0710j7 f11484b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0504b7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0788m7 fromModel(C0556d7 c0556d7) {
        C0788m7 c0788m7 = new C0788m7();
        Integer num = c0556d7.f11653a;
        if (num != null) {
            c0788m7.f12329a = num.intValue();
        }
        String str = c0556d7.f11654b;
        if (str != null) {
            c0788m7.f12330b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0556d7.f11655c;
        if (str2 != null) {
            c0788m7.f12331c = StringUtils.correctIllFormedString(str2);
        }
        Long l4 = c0556d7.f11656d;
        if (l4 != null) {
            c0788m7.f12332d = l4.longValue();
        }
        C0685i7 c0685i7 = c0556d7.f11657e;
        if (c0685i7 != null) {
            c0788m7.f12333e = this.f11484b.fromModel(c0685i7);
        }
        String str3 = c0556d7.f11658f;
        if (str3 != null) {
            c0788m7.f12334f = str3;
        }
        String str4 = c0556d7.f11659g;
        if (str4 != null) {
            c0788m7.f12335g = str4;
        }
        Long l5 = c0556d7.f11660h;
        if (l5 != null) {
            c0788m7.f12336h = l5.longValue();
        }
        Integer num2 = c0556d7.f11661i;
        if (num2 != null) {
            c0788m7.f12337i = num2.intValue();
        }
        Integer num3 = c0556d7.f11662j;
        if (num3 != null) {
            c0788m7.f12338j = num3.intValue();
        }
        String str5 = c0556d7.f11663k;
        if (str5 != null) {
            c0788m7.f12339k = str5;
        }
        I8 i8 = c0556d7.f11664l;
        if (i8 != null) {
            c0788m7.f12340l = i8.f10432a;
        }
        String str6 = c0556d7.f11665m;
        if (str6 != null) {
            c0788m7.f12341m = str6;
        }
        EnumC0559da enumC0559da = c0556d7.n;
        if (enumC0559da != null) {
            c0788m7.n = enumC0559da.f11678a;
        }
        EnumC0790m9 enumC0790m9 = c0556d7.o;
        if (enumC0790m9 != null) {
            c0788m7.o = enumC0790m9.f12352a;
        }
        Boolean bool = c0556d7.f11666p;
        if (bool != null) {
            c0788m7.f12342p = this.f11483a.fromModel(bool).intValue();
        }
        Integer num4 = c0556d7.f11667q;
        if (num4 != null) {
            c0788m7.f12343q = num4.intValue();
        }
        byte[] bArr = c0556d7.f11668r;
        if (bArr != null) {
            c0788m7.f12344r = bArr;
        }
        return c0788m7;
    }

    public C0504b7(C0769le c0769le, C0710j7 c0710j7) {
        this.f11483a = c0769le;
        this.f11484b = c0710j7;
    }

    public /* synthetic */ C0504b7(C0769le c0769le, C0710j7 c0710j7, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C0769le() : c0769le, (i4 & 2) != 0 ? new C0710j7(null, 1, null) : c0710j7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0556d7 toModel(C0788m7 c0788m7) {
        EnumC0790m9 enumC0790m9;
        C0788m7 c0788m72 = new C0788m7();
        int i4 = c0788m7.f12329a;
        Integer valueOf = i4 != c0788m72.f12329a ? Integer.valueOf(i4) : null;
        String str = c0788m7.f12330b;
        String str2 = !kotlin.jvm.internal.i.a(str, c0788m72.f12330b) ? str : null;
        String str3 = c0788m7.f12331c;
        String str4 = !kotlin.jvm.internal.i.a(str3, c0788m72.f12331c) ? str3 : null;
        long j4 = c0788m7.f12332d;
        Long valueOf2 = j4 != c0788m72.f12332d ? Long.valueOf(j4) : null;
        C0685i7 model = this.f11484b.toModel(c0788m7.f12333e);
        String str5 = c0788m7.f12334f;
        String str6 = !kotlin.jvm.internal.i.a(str5, c0788m72.f12334f) ? str5 : null;
        String str7 = c0788m7.f12335g;
        String str8 = !kotlin.jvm.internal.i.a(str7, c0788m72.f12335g) ? str7 : null;
        long j5 = c0788m7.f12336h;
        Long valueOf3 = Long.valueOf(j5);
        if (j5 == c0788m72.f12336h) {
            valueOf3 = null;
        }
        int i5 = c0788m7.f12337i;
        Integer valueOf4 = i5 != c0788m72.f12337i ? Integer.valueOf(i5) : null;
        int i6 = c0788m7.f12338j;
        Integer valueOf5 = i6 != c0788m72.f12338j ? Integer.valueOf(i6) : null;
        String str9 = c0788m7.f12339k;
        String str10 = !kotlin.jvm.internal.i.a(str9, c0788m72.f12339k) ? str9 : null;
        int i7 = c0788m7.f12340l;
        Integer valueOf6 = Integer.valueOf(i7);
        if (i7 == c0788m72.f12340l) {
            valueOf6 = null;
        }
        I8 a3 = valueOf6 != null ? I8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0788m7.f12341m;
        String str12 = !kotlin.jvm.internal.i.a(str11, c0788m72.f12341m) ? str11 : null;
        int i8 = c0788m7.n;
        Integer valueOf7 = Integer.valueOf(i8);
        if (i8 == c0788m72.n) {
            valueOf7 = null;
        }
        EnumC0559da a4 = valueOf7 != null ? EnumC0559da.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i9 = c0788m7.o;
        Integer valueOf8 = Integer.valueOf(i9);
        if (i9 == c0788m72.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0790m9[] values = EnumC0790m9.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    enumC0790m9 = values[i10];
                    EnumC0790m9[] enumC0790m9Arr = values;
                    if (enumC0790m9.f12352a == intValue) {
                        break;
                    }
                    i10++;
                    values = enumC0790m9Arr;
                } else {
                    enumC0790m9 = EnumC0790m9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0790m9 = null;
        }
        Boolean a5 = this.f11483a.a(c0788m7.f12342p);
        int i11 = c0788m7.f12343q;
        Integer valueOf9 = i11 != c0788m72.f12343q ? Integer.valueOf(i11) : null;
        byte[] bArr = c0788m7.f12344r;
        return new C0556d7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a3, str12, a4, enumC0790m9, a5, valueOf9, !Arrays.equals(bArr, c0788m72.f12344r) ? bArr : null);
    }
}
