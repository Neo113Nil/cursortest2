package com.squareup.util.cash;

import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes6.dex */
public abstract class Cashtags {
    public static final Set SUPPORTED_SYMBOLS;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.CAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Region.GBR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Region.AUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Region.XXL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LinkedHashSet linkedHashSet = Moneys.SUPPORTED_CURRENCIES;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (((CurrencyCode) obj) != CurrencyCode.BTC) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Moneys.symbol((CurrencyCode) it.next()));
        }
        SUPPORTED_SYMBOLS = CollectionsKt.toSet(arrayList2);
    }

    public static final String fromString(String str, Region region) {
        CurrencyCode guessCashtagCurrency = region != null ? guessCashtagCurrency(region) : null;
        if (str != null) {
            return symbol(guessCashtagCurrency).concat(str);
        }
        return null;
    }

    public static CurrencyCode guessCashtagCurrency(Region region) {
        int i = region == null ? -1 : WhenMappings.$EnumSwitchMapping$0[region.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? CurrencyCode.USD : CurrencyCode.USD : CurrencyCode.AUD : CurrencyCode.GBP : CurrencyCode.CAD;
    }

    public static final boolean isCashtag(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            if (SUPPORTED_SYMBOLS.contains(String.valueOf(charSequence.charAt(0)))) {
                return true;
            }
        }
        return false;
    }

    public static final String symbol(CurrencyCode currencyCode) {
        return currencyCode == CurrencyCode.BTC ? Moneys.symbol(CurrencyCode.USD) : currencyCode != null ? Moneys.symbol(currencyCode) : "";
    }
}
