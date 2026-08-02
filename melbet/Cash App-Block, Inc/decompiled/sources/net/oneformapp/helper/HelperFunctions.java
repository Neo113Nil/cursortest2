package net.oneformapp.helper;

import android.content.SharedPreferences;
import android.util.Base64;
import com.miteksystems.misnap.core.LicenseException;
import com.miteksystems.misnap.core.LicenseStatus;
import com.miteksystems.misnap.core.LicenseUtil;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.viewmodels.FollowingStockMetricType;
import com.squareup.cash.util.cache.Cache;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public abstract class HelperFunctions {
    public static LicenseStatus checkLicenseStatus(String str, String str2) {
        str.getClass();
        if (LicenseUtil.a) {
            return LicenseUtil.b.b(decode(str), str2);
        }
        throw new LicenseException("Unable to load the licensing library");
    }

    public static String decode(String str) {
        Object failure;
        str.getClass();
        try {
            Result.Companion companion = Result.Companion;
            byte[] decode = Base64.decode(str, 0);
            decode.getClass();
            failure = new String(decode, Charsets.UTF_8);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            throw new LicenseException("License Signature Invalid");
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str2 = (String) failure;
        if (str2 != null) {
            return str2;
        }
        throw new LicenseException("License Signature Invalid");
    }

    public static FilterConfigurationCacheMap filterConfigurationCacheForCategoryDetail(Flow flow, CoroutineScope coroutineScope) {
        return new FilterConfigurationCacheMap(new LinkedHashMap(), flow, coroutineScope);
    }

    public static String maskValuesIfNecessary(int i, String str) {
        if (str == null || str.equals("") || str.length() <= 0) {
            return str;
        }
        if (i < 0) {
            i = str.length() - Math.abs(i);
        } else if (i == 0) {
            i = str.length();
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < charArray.length) {
                charArray[i2] = 8226;
            }
        }
        return new String(charArray);
    }

    public static EnumPreference metricTypePreferenceForFollowing(SharedPreferences sharedPreferences) {
        return new EnumPreference(sharedPreferences, FollowingStockMetricType.class, "metric_type_for_following_stocks", FollowingStockMetricType.DEFAULT);
    }

    public static BooleanPreference provideFirstCustomBuyOrderSetting$presenters(SharedPreferences sharedPreferences) {
        return new BooleanPreference(sharedPreferences, "investing_first_purchase_custom_order", false);
    }

    public static BooleanPreference provideFirstCustomSellOrderSetting$presenters(SharedPreferences sharedPreferences) {
        return new BooleanPreference(sharedPreferences, "investing_first_sell_custom_order", false);
    }

    public static Cache provideInvestingViewModelCache(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }

    public static Cache rangeSelectionCacheForStock(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }
}
