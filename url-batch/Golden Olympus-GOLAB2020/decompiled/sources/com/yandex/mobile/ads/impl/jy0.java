package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gs;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jy0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f27898a;

    public /* synthetic */ jy0() {
        this(CollectionsKt.listOf((Object[]) new String[]{"AppOpenAd", "Banner", "Interstitial", "Rewarded", "Native"}));
    }

    @Nullable
    public final gs a(@NotNull xy0 mediationNetwork) {
        Object obj;
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        String w02 = StringsKt.w0(StringsKt.R0(mediationNetwork.e(), JwtParser.SEPARATOR_CHAR, null, 2, null), "Adapter");
        if (w02.length() <= 0) {
            w02 = null;
        }
        if (w02 == null) {
            return null;
        }
        Iterator<T> it = this.f27898a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.v(w02, (String) obj, false, 2, null)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        gs.a aVar = gs.f26279c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.getClass();
        return gs.a.a(lowerCase);
    }

    @Nullable
    public final String b(@NotNull xy0 mediationNetwork) {
        Object obj;
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        String w02 = StringsKt.w0(StringsKt.R0(mediationNetwork.e(), JwtParser.SEPARATOR_CHAR, null, 2, null), "Adapter");
        if (w02.length() <= 0) {
            w02 = null;
        }
        if (w02 == null) {
            return null;
        }
        Iterator<T> it = this.f27898a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.v(w02, (String) obj, false, 2, null)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            String w03 = StringsKt.w0(w02, str);
            if (w03.length() > 0) {
                return w03;
            }
        }
        return null;
    }

    public jy0(@NotNull List<String> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f27898a = adFormats;
    }
}
