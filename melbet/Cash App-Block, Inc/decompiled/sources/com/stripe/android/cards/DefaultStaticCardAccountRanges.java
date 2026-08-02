package com.stripe.android.cards;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.CardFunding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes8.dex */
public final class DefaultStaticCardAccountRanges {
    public static final ArrayList AMEX_ACCOUNTS;
    public static final ArrayList DINERSCLUB14_ACCOUNT_RANGES;
    public static final ArrayList DINERSCLUB16_ACCOUNT_RANGES;
    public static final ArrayList DISCOVER_ACCOUNTS;
    public static final ArrayList JCB_ACCOUNTS;
    public static final ArrayList MASTERCARD_ACCOUNTS;
    public static final ArrayList UNIONPAY16_ACCOUNTS;
    public static final ArrayList UNIONPAY19_ACCOUNTS;
    public static final ArrayList VISA_ACCOUNTS;

    static {
        Set<BinRange> of = SetsKt__SetsJVMKt.setOf(new BinRange("4000000000000000", "4999999999999999", true));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10));
        for (BinRange binRange : of) {
            AccountRange.BrandInfo brandInfo = AccountRange.BrandInfo.Visa;
            KClasses$$Lambda$1 kClasses$$Lambda$1 = CardFunding.Companion;
            arrayList.add(new AccountRange(binRange, 16, brandInfo));
        }
        VISA_ACCOUNTS = arrayList;
        Set<BinRange> set = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("2221000000000000", "2720999999999999", true), new BinRange("5100000000000000", "5599999999999999", true)});
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (BinRange binRange2 : set) {
            AccountRange.BrandInfo brandInfo2 = AccountRange.BrandInfo.Mastercard;
            KClasses$$Lambda$1 kClasses$$Lambda$12 = CardFunding.Companion;
            arrayList2.add(new AccountRange(binRange2, 16, brandInfo2));
        }
        MASTERCARD_ACCOUNTS = arrayList2;
        Set<BinRange> set2 = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("340000000000000", "349999999999999", true), new BinRange("370000000000000", "379999999999999", true)});
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        for (BinRange binRange3 : set2) {
            AccountRange.BrandInfo brandInfo3 = AccountRange.BrandInfo.AmericanExpress;
            KClasses$$Lambda$1 kClasses$$Lambda$13 = CardFunding.Companion;
            arrayList3.add(new AccountRange(binRange3, 15, brandInfo3));
        }
        AMEX_ACCOUNTS = arrayList3;
        Set<BinRange> set3 = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("6000000000000000", "6099999999999999", true), new BinRange("6400000000000000", "6499999999999999", true), new BinRange("6500000000000000", "6599999999999999", true)});
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set3, 10));
        for (BinRange binRange4 : set3) {
            AccountRange.BrandInfo brandInfo4 = AccountRange.BrandInfo.Discover;
            KClasses$$Lambda$1 kClasses$$Lambda$14 = CardFunding.Companion;
            arrayList4.add(new AccountRange(binRange4, 16, brandInfo4));
        }
        DISCOVER_ACCOUNTS = arrayList4;
        Set<BinRange> of2 = SetsKt__SetsJVMKt.setOf(new BinRange("3528000000000000", "3589999999999999", true));
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of2, 10));
        for (BinRange binRange5 : of2) {
            AccountRange.BrandInfo brandInfo5 = AccountRange.BrandInfo.JCB;
            KClasses$$Lambda$1 kClasses$$Lambda$15 = CardFunding.Companion;
            arrayList5.add(new AccountRange(binRange5, 16, brandInfo5));
        }
        JCB_ACCOUNTS = arrayList5;
        Set<BinRange> set4 = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("6200000000000000", "6216828049999999", true), new BinRange("6216828060000000", "6299999999999999", true), new BinRange("8100000000000000", "8199999999999999", true)});
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10));
        for (BinRange binRange6 : set4) {
            AccountRange.BrandInfo brandInfo6 = AccountRange.BrandInfo.UnionPay;
            KClasses$$Lambda$1 kClasses$$Lambda$16 = CardFunding.Companion;
            arrayList6.add(new AccountRange(binRange6, 16, brandInfo6));
        }
        UNIONPAY16_ACCOUNTS = arrayList6;
        Set<BinRange> of3 = SetsKt__SetsJVMKt.setOf(new BinRange("6216828050000000000", "6216828059999999999", true));
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of3, 10));
        for (BinRange binRange7 : of3) {
            AccountRange.BrandInfo brandInfo7 = AccountRange.BrandInfo.UnionPay;
            KClasses$$Lambda$1 kClasses$$Lambda$17 = CardFunding.Companion;
            arrayList7.add(new AccountRange(binRange7, 19, brandInfo7));
        }
        UNIONPAY19_ACCOUNTS = arrayList7;
        Set<BinRange> set5 = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("3000000000000000", "3059999999999999", true), new BinRange("3095000000000000", "3095999999999999", true), new BinRange("3800000000000000", "3999999999999999", true)});
        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set5, 10));
        for (BinRange binRange8 : set5) {
            AccountRange.BrandInfo brandInfo8 = AccountRange.BrandInfo.DinersClub;
            KClasses$$Lambda$1 kClasses$$Lambda$18 = CardFunding.Companion;
            arrayList8.add(new AccountRange(binRange8, 16, brandInfo8));
        }
        DINERSCLUB16_ACCOUNT_RANGES = arrayList8;
        Set<BinRange> of4 = SetsKt__SetsJVMKt.setOf(new BinRange("36000000000000", "36999999999999", true));
        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of4, 10));
        for (BinRange binRange9 : of4) {
            AccountRange.BrandInfo brandInfo9 = AccountRange.BrandInfo.DinersClub;
            KClasses$$Lambda$1 kClasses$$Lambda$19 = CardFunding.Companion;
            arrayList9.add(new AccountRange(binRange9, 14, brandInfo9));
        }
        DINERSCLUB14_ACCOUNT_RANGES = arrayList9;
        Set<BinRange> set6 = ArraysKt___ArraysKt.toSet(new BinRange[]{new BinRange("4000002500001001", "4000002500001001", true), new BinRange("5555552500001001", "5555552500001001", true)});
        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set6, 10));
        for (BinRange binRange10 : set6) {
            AccountRange.BrandInfo brandInfo10 = AccountRange.BrandInfo.CartesBancaires;
            KClasses$$Lambda$1 kClasses$$Lambda$110 = CardFunding.Companion;
            arrayList10.add(new AccountRange(binRange10, 16, brandInfo10));
        }
        CollectionsKt.plus((Iterable) arrayList10, (Collection) CollectionsKt.plus((Iterable) DINERSCLUB14_ACCOUNT_RANGES, (Collection) CollectionsKt.plus((Iterable) DINERSCLUB16_ACCOUNT_RANGES, (Collection) CollectionsKt.plus((Iterable) UNIONPAY19_ACCOUNTS, (Collection) CollectionsKt.plus((Iterable) UNIONPAY16_ACCOUNTS, (Collection) CollectionsKt.plus((Iterable) JCB_ACCOUNTS, (Collection) CollectionsKt.plus((Iterable) DISCOVER_ACCOUNTS, (Collection) CollectionsKt.plus((Iterable) AMEX_ACCOUNTS, (Collection) CollectionsKt.plus((Iterable) MASTERCARD_ACCOUNTS, (Collection) VISA_ACCOUNTS)))))))));
    }
}
