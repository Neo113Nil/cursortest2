package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f23192a = CollectionsKt.listOf((Object[]) new String[]{"The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version."});

    private static String a(int i4, String str) {
        return "* " + str + StringsKt.C(" ", i4 - str.length()) + " *";
    }

    public static void b() {
        Integer valueOf;
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) f23192a, (Iterable) CollectionsKt.listOf((Object[]) new String[]{"Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html"})), (Iterable) a());
        Iterator it = plus.iterator();
        String str = null;
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((String) it.next()).length());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            String C4 = StringsKt.C("*", intValue + 4);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
            Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(intValue, (String) it2.next()));
            }
            str = CollectionsKt.joinToString$default(CollectionsKt.plus((Collection<? extends String>) CollectionsKt.plus((Collection) CollectionsKt.listOf(C4), (Iterable) arrayList), C4), "\n", null, null, 0, null, null, 62, null);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + str + "\n");
    }

    private static List a() {
        if (C2191ql.a() != null) {
            return CollectionsKt.listOf("Changelog: " + C2191ql.a());
        }
        return CollectionsKt.emptyList();
    }
}
