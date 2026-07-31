package ru.rustore.sdk.pay.internal;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.j4;

/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final u4 f44503a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f44504b;

    public l4(@NotNull u4 currencyFormatter, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(currencyFormatter, "currencyFormatter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44503a = currencyFormatter;
        this.f44504b = context;
    }

    @NotNull
    public final m4 a(@NotNull b3 coupon) {
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        String str = coupon.f43845a;
        u4 u4Var = this.f44503a;
        long j4 = coupon.f43846b;
        u4Var.getClass();
        String a4 = u4.a(j4);
        String str2 = coupon.f43850f;
        String format = new SimpleDateFormat("dd MMM yyyy", new Locale("ru", "RU")).format(coupon.f43848d);
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(DATE_FO…         .format(endDate)");
        String string = this.f44504b.getString(R.string.sdk_pay_coupon_end_date_title, StringsKt.G(format, ". ", " ", false, 4, null));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…upon_end_date_title, end)");
        return new m4(str, a4, str2, string, coupon.f43851g, Intrinsics.areEqual(coupon.f43849e, j4.c.f44360a));
    }
}
