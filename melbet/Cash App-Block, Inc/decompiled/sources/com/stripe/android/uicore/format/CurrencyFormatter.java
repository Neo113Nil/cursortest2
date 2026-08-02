package com.stripe.android.uicore.format;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes4.dex */
public abstract class CurrencyFormatter {
    public static final Map SERVER_DECIMAL_DIGITS = MapsKt__MapsJVMKt.mapOf(new Pair(ArraysKt___ArraysKt.toSet(new String[]{"UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"}), 2));

    public static int getDefaultDecimalDigits(Currency currency) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : SERVER_DECIMAL_DIGITS.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            currencyCode.getClass();
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) CollectionsKt.firstOrNull((List) arrayList);
        return num != null ? num.intValue() : currency.getDefaultFractionDigits();
    }
}
