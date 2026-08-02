package com.squareup.cash.tax.web;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public abstract class TaxUrlsAllowlist {
    public static final List allowedPatterns = CollectionsKt__CollectionsKt.listOf((Object[]) new Regex[]{new Regex("^https://(api\\.|app\\.)?taxes\\.cash(staging)?\\.app[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-._~:/?#\\[\\]@!$&'()*+,;={}%]*"), new Regex("^https://(((.*)(\\.))*)cash(staging)?.app/error/taxes[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-._~:/?#\\[\\]@!$&'()*+,;={}%]*"), new Regex("^https://(((.*)(\\.))*)cash(staging)?.app/taxes/[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-._~:/?#\\[\\]@!$&'()*+,;={}%]*"), new Regex("^https://(((.*)(\\.))*)cash(staging)?.app/login\\?token=(.+)[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-._~:/?#\\[\\]@!$&'()*+,;={}%]*"), new Regex("^https://(((.*)(\\.))*)cash(staging)?.app/cash-app/tes/[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\-._~:/?#\\[\\]@!$&'()*+,;={}%]*")});
}
