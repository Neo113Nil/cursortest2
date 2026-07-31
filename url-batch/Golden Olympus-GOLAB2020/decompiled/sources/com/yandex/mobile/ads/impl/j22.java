package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.EnumC2325wi;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j22 {
    @NotNull
    public static final ms a(@NotNull Context context, int i4) {
        InterfaceC2188qi irVar;
        InterfaceC2188qi irVar2;
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        EnumC2325wi.a aVar = EnumC2325wi.f34073c;
        EnumC2325wi bannerSizeCalculationType = null;
        String k4 = a4 != null ? a4.k() : null;
        aVar.getClass();
        EnumC2325wi[] values = EnumC2325wi.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            EnumC2325wi enumC2325wi = values[i6];
            if (Intrinsics.areEqual(enumC2325wi.a(), k4)) {
                bannerSizeCalculationType = enumC2325wi;
                break;
            }
            i6++;
        }
        if (bannerSizeCalculationType == null) {
            bannerSizeCalculationType = EnumC2325wi.f34074d;
        }
        cf1 cf1Var = cf1.f24193d;
        Intrinsics.checkNotNullParameter(bannerSizeCalculationType, "bannerSizeCalculationType");
        int ordinal = bannerSizeCalculationType.ordinal();
        if (ordinal == 0) {
            irVar = new ir();
        } else if (ordinal == 1) {
            irVar = new ln1();
        } else if (ordinal == 2) {
            irVar = new jt1();
        } else if (ordinal == 3) {
            irVar = new kt1();
        } else {
            if (ordinal != 4) {
                throw new W1.m();
            }
            irVar = new ry0();
        }
        int a5 = irVar.a(context, i4, cf1Var);
        vy1.a aVar2 = vy1.a.f33824e;
        gb0 gb0Var = new gb0(i4, a5, aVar2);
        cf1 cf1Var2 = cf1.f24192c;
        Intrinsics.checkNotNullParameter(bannerSizeCalculationType, "bannerSizeCalculationType");
        int ordinal2 = bannerSizeCalculationType.ordinal();
        if (ordinal2 == 0) {
            irVar2 = new ir();
        } else if (ordinal2 == 1) {
            irVar2 = new ln1();
        } else if (ordinal2 == 2) {
            irVar2 = new jt1();
        } else if (ordinal2 == 3) {
            irVar2 = new kt1();
        } else {
            if (ordinal2 != 4) {
                throw new W1.m();
            }
            irVar2 = new ry0();
        }
        gb0 gb0Var2 = new gb0(i4, irVar2.a(context, i4, cf1Var2), aVar2);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        return new ms(new hf1(applicationContext, gb0Var, gb0Var2));
    }
}
