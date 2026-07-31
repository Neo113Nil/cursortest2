package ru.rustore.sdk.pay.internal;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.ml;

/* loaded from: classes3.dex */
public final class yl {
    @NotNull
    public static final String a(@NotNull ml mlVar, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(mlVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (mlVar instanceof ml.a) {
            String string = resources.getString(R.string.sdk_pay_subs_not_required_period_purchase_button, ((ml.a) mlVar).f44651a);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…d_purchase_button, price)");
            return string;
        }
        if (mlVar instanceof ml.c) {
            String string2 = resources.getString(R.string.sdk_pay_subs_not_required_period_purchase_button, ((ml.c) mlVar).f44655a);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…d_purchase_button, price)");
            return string2;
        }
        if (!(mlVar instanceof ml.b)) {
            throw new W1.m();
        }
        String string3 = resources.getString(R.string.sdk_pay_subs_standard_period_purchase_button, ((ml.b) mlVar).f44653a);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…d_purchase_button, price)");
        return string3;
    }
}
