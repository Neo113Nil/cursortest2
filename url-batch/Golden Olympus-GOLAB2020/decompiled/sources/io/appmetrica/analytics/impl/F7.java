package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class F7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ae f37513a;

    /* JADX WARN: Multi-variable type inference failed */
    public F7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J7 fromModel(@NotNull E7 e7) {
        J7 j7 = new J7();
        Boolean bool = e7.f37407a;
        if (bool != null) {
            j7.f37811a = this.f37513a.fromModel(bool).intValue();
        }
        Double d4 = e7.f37409c;
        if (d4 != null) {
            j7.f37813c = d4.doubleValue();
        }
        Double d5 = e7.f37408b;
        if (d5 != null) {
            j7.f37812b = d5.doubleValue();
        }
        Long l4 = e7.f37414h;
        if (l4 != null) {
            j7.f37818h = l4.longValue();
        }
        Integer num = e7.f37412f;
        if (num != null) {
            j7.f37816f = num.intValue();
        }
        Integer num2 = e7.f37411e;
        if (num2 != null) {
            j7.f37815e = num2.intValue();
        }
        Integer num3 = e7.f37413g;
        if (num3 != null) {
            j7.f37817g = num3.intValue();
        }
        Integer num4 = e7.f37410d;
        if (num4 != null) {
            j7.f37814d = num4.intValue();
        }
        String str = e7.f37415i;
        if (str != null) {
            j7.f37819i = str;
        }
        String str2 = e7.f37416j;
        if (str2 != null) {
            j7.f37820j = str2;
        }
        return j7;
    }

    public F7(@NotNull Ae ae) {
        this.f37513a = ae;
    }

    public /* synthetic */ F7(Ae ae, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Ae() : ae);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E7 toModel(@Nullable J7 j7) {
        if (j7 == null) {
            return new E7(null, null, null, null, null, null, null, null, null, null);
        }
        J7 j72 = new J7();
        Boolean a4 = this.f37513a.a(j7.f37811a);
        double d4 = j7.f37813c;
        Double valueOf = Double.valueOf(d4);
        if (d4 == j72.f37813c) {
            valueOf = null;
        }
        double d5 = j7.f37812b;
        Double valueOf2 = !(d5 == j72.f37812b) ? Double.valueOf(d5) : null;
        long j4 = j7.f37818h;
        Long valueOf3 = j4 != j72.f37818h ? Long.valueOf(j4) : null;
        int i4 = j7.f37816f;
        Integer valueOf4 = i4 != j72.f37816f ? Integer.valueOf(i4) : null;
        int i5 = j7.f37815e;
        Integer valueOf5 = i5 != j72.f37815e ? Integer.valueOf(i5) : null;
        int i6 = j7.f37817g;
        Integer valueOf6 = i6 != j72.f37817g ? Integer.valueOf(i6) : null;
        int i7 = j7.f37814d;
        Integer valueOf7 = i7 != j72.f37814d ? Integer.valueOf(i7) : null;
        String str = j7.f37819i;
        String str2 = !Intrinsics.areEqual(str, j72.f37819i) ? str : null;
        String str3 = j7.f37820j;
        return new E7(a4, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !Intrinsics.areEqual(str3, j72.f37820j) ? str3 : null);
    }
}
