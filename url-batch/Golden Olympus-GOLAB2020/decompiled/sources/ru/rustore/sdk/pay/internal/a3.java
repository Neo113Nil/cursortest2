package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class a3 {
    @NotNull
    public static final String a(@NotNull Context context, int i4, int i5, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = new Locale("ru", "RU");
        }
        String language = locale.getLanguage();
        if (!Intrinsics.areEqual(language, "en") && !Intrinsics.areEqual(language, "ru")) {
            locale = new Locale("ru", "RU");
        }
        if (!Intrinsics.areEqual(locale.getLanguage(), "ru") || i5 != 1) {
            Object[] copyOf = Arrays.copyOf(formatArgs, formatArgs.length);
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            String quantityString = context.createConfigurationContext(configuration).getResources().getQuantityString(i4, i5, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(quantityString, "localizedContext.resourc…alId, count, *formatArgs)");
            return quantityString;
        }
        if (i4 == R.plurals.sdk_pay_days_count) {
            String string = context.getString(R.string.sdk_pay_day);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sdk_pay_day)");
            return string;
        }
        if (i4 == R.plurals.sdk_pay_months_count) {
            String string2 = context.getString(R.string.sdk_pay_month);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sdk_pay_month)");
            return string2;
        }
        if (i4 == R.plurals.sdk_pay_years_count) {
            String string3 = context.getString(R.string.sdk_pay_year);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.sdk_pay_year)");
            return string3;
        }
        Object[] copyOf2 = Arrays.copyOf(formatArgs, formatArgs.length);
        Configuration configuration2 = new Configuration(context.getResources().getConfiguration());
        configuration2.setLocale(locale);
        String quantityString2 = context.createConfigurationContext(configuration2).getResources().getQuantityString(i4, i5, Arrays.copyOf(copyOf2, copyOf2.length));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "localizedContext.resourc…alId, count, *formatArgs)");
        return quantityString2;
    }
}
