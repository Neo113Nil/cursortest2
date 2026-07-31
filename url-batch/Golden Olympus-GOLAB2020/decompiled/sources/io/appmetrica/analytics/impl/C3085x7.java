package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3085x7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ae f40155a;

    /* renamed from: b, reason: collision with root package name */
    public final F7 f40156b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3085x7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I7 fromModel(@NotNull C3137z7 c3137z7) {
        I7 i7 = new I7();
        Integer num = c3137z7.f40304a;
        if (num != null) {
            i7.f37708a = num.intValue();
        }
        String str = c3137z7.f40305b;
        if (str != null) {
            i7.f37709b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c3137z7.f40306c;
        if (str2 != null) {
            i7.f37710c = StringUtils.correctIllFormedString(str2);
        }
        Long l4 = c3137z7.f40307d;
        if (l4 != null) {
            i7.f37711d = l4.longValue();
        }
        E7 e7 = c3137z7.f40308e;
        if (e7 != null) {
            i7.f37712e = this.f40156b.fromModel(e7);
        }
        String str3 = c3137z7.f40309f;
        if (str3 != null) {
            i7.f37713f = str3;
        }
        String str4 = c3137z7.f40310g;
        if (str4 != null) {
            i7.f37714g = str4;
        }
        Long l5 = c3137z7.f40311h;
        if (l5 != null) {
            i7.f37715h = l5.longValue();
        }
        Integer num2 = c3137z7.f40312i;
        if (num2 != null) {
            i7.f37716i = num2.intValue();
        }
        Integer num3 = c3137z7.f40313j;
        if (num3 != null) {
            i7.f37717j = num3.intValue();
        }
        String str5 = c3137z7.f40314k;
        if (str5 != null) {
            i7.f37718k = str5;
        }
        EnumC2513b9 enumC2513b9 = c3137z7.f40315l;
        if (enumC2513b9 != null) {
            i7.f37719l = enumC2513b9.f38715a;
        }
        String str6 = c3137z7.f40316m;
        if (str6 != null) {
            i7.f37720m = str6;
        }
        EnumC3114ya enumC3114ya = c3137z7.f40317n;
        if (enumC3114ya != null) {
            i7.f37721n = enumC3114ya.f40274a;
        }
        H9 h9 = c3137z7.f40318o;
        if (h9 != null) {
            i7.f37722o = h9.f37634a;
        }
        Boolean bool = c3137z7.f40319p;
        if (bool != null) {
            i7.f37723p = this.f40155a.fromModel(bool).intValue();
        }
        Integer num4 = c3137z7.f40320q;
        if (num4 != null) {
            i7.f37724q = num4.intValue();
        }
        byte[] bArr = c3137z7.f40321r;
        if (bArr != null) {
            i7.f37725r = bArr;
        }
        return i7;
    }

    public C3085x7(@NotNull Ae ae, @NotNull F7 f7) {
        this.f40155a = ae;
        this.f40156b = f7;
    }

    public /* synthetic */ C3085x7(Ae ae, F7 f7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Ae() : ae, (i4 & 2) != 0 ? new F7(null, 1, null) : f7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3137z7 toModel(@NotNull I7 i7) {
        H9 h9;
        I7 i72 = new I7();
        int i4 = i7.f37708a;
        Integer valueOf = i4 != i72.f37708a ? Integer.valueOf(i4) : null;
        String str = i7.f37709b;
        String str2 = !Intrinsics.areEqual(str, i72.f37709b) ? str : null;
        String str3 = i7.f37710c;
        String str4 = !Intrinsics.areEqual(str3, i72.f37710c) ? str3 : null;
        long j4 = i7.f37711d;
        Long valueOf2 = j4 != i72.f37711d ? Long.valueOf(j4) : null;
        E7 model = this.f40156b.toModel(i7.f37712e);
        String str5 = i7.f37713f;
        String str6 = !Intrinsics.areEqual(str5, i72.f37713f) ? str5 : null;
        String str7 = i7.f37714g;
        String str8 = !Intrinsics.areEqual(str7, i72.f37714g) ? str7 : null;
        long j5 = i7.f37715h;
        Long valueOf3 = Long.valueOf(j5);
        if (j5 == i72.f37715h) {
            valueOf3 = null;
        }
        int i5 = i7.f37716i;
        Integer valueOf4 = i5 != i72.f37716i ? Integer.valueOf(i5) : null;
        int i6 = i7.f37717j;
        Integer valueOf5 = i6 != i72.f37717j ? Integer.valueOf(i6) : null;
        String str9 = i7.f37718k;
        String str10 = !Intrinsics.areEqual(str9, i72.f37718k) ? str9 : null;
        int i8 = i7.f37719l;
        Integer valueOf6 = Integer.valueOf(i8);
        if (i8 == i72.f37719l) {
            valueOf6 = null;
        }
        EnumC2513b9 a4 = valueOf6 != null ? EnumC2513b9.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = i7.f37720m;
        String str12 = !Intrinsics.areEqual(str11, i72.f37720m) ? str11 : null;
        int i9 = i7.f37721n;
        Integer valueOf7 = Integer.valueOf(i9);
        if (i9 == i72.f37721n) {
            valueOf7 = null;
        }
        EnumC3114ya a5 = valueOf7 != null ? EnumC3114ya.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i10 = i7.f37722o;
        Integer valueOf8 = Integer.valueOf(i10);
        if (i10 == i72.f37722o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            H9[] values = H9.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    h9 = values[i11];
                    H9[] h9Arr = values;
                    if (h9.f37634a == intValue) {
                        break;
                    }
                    i11++;
                    values = h9Arr;
                } else {
                    h9 = H9.NATIVE;
                    break;
                }
            }
        } else {
            h9 = null;
        }
        Boolean a6 = this.f40155a.a(i7.f37723p);
        int i12 = i7.f37724q;
        Integer valueOf9 = i12 != i72.f37724q ? Integer.valueOf(i12) : null;
        byte[] bArr = i7.f37725r;
        return new C3137z7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a4, str12, a5, h9, a6, valueOf9, !Arrays.equals(bArr, i72.f37725r) ? bArr : null);
    }
}
