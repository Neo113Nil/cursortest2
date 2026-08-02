package com.stripe.android.model;

import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.enums.EnumEntriesList;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class TokenizationMethod {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ TokenizationMethod[] $VALUES;
    public static final POPMatchingFactory Companion;
    public final Set code;

    static {
        TokenizationMethod[] tokenizationMethodArr = {new TokenizationMethod("ApplePay", 0, SetsKt__SetsJVMKt.setOf("apple_pay")), new TokenizationMethod("GooglePay", 1, ArraysKt___ArraysKt.toSet(new String[]{"android_pay", "google"})), new TokenizationMethod("Masterpass", 2, SetsKt__SetsJVMKt.setOf("masterpass")), new TokenizationMethod("VisaCheckout", 3, SetsKt__SetsJVMKt.setOf("visa_checkout"))};
        $VALUES = tokenizationMethodArr;
        $ENTRIES = new EnumEntriesList(tokenizationMethodArr);
        Companion = new POPMatchingFactory(15);
    }

    public TokenizationMethod(String str, int i, Set set) {
        this.code = set;
    }

    public static TokenizationMethod valueOf(String str) {
        return (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, str);
    }

    public static TokenizationMethod[] values() {
        return (TokenizationMethod[]) $VALUES.clone();
    }
}
