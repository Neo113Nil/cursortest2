package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import b2.AbstractC1372b;
import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28461a = new a(0);

    public static final class a {
        private a() {
        }

        @Nullable
        public static String a(@NotNull String url) {
            Object m243constructorimpl;
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Uri.parse(d(url)).getHost());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            return (String) m243constructorimpl;
        }

        public static boolean b(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() != 0) {
                String f4 = new Regex("http(s?)://").f(url, "");
                for (b bVar : b.values()) {
                    if (StringsKt.K(f4, bVar.a(), false, 2, null)) {
                        break;
                    }
                }
            }
            return URLUtil.isNetworkUrl(url);
        }

        public static boolean c(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() == 0) {
                return false;
            }
            String f4 = new Regex("http(s?)://").f(url, "");
            b.f28462c.getClass();
            b[] bVarArr = {b.f28463d, b.f28464e, b.f28465f, b.f28466g};
            for (int i4 = 0; i4 < 4; i4++) {
                if (StringsKt.K(f4, bVarArr[i4].a(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        private static String d(String str) {
            if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
                return str;
            }
            return "https://" + str;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f28462c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f28463d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f28464e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f28465f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f28466g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ b[] f28467h;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f28468b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i4) {
                this();
            }
        }

        static {
            b bVar = new b(0, "SMS_SCHEME", "sms:");
            b bVar2 = new b(1, "MAIL_SCHEME", "mailto:");
            b bVar3 = new b(2, "VOICE_MAIL_SCHEME", "voicemail:");
            b bVar4 = new b(3, "TEL_SCHEME", "tel:");
            b bVar5 = new b(4, "CALLTO", "callto:");
            b bVar6 = new b(5, "FAX", "fax:");
            b bVar7 = new b(6, "GEO_SCHEME", "geo:");
            b bVar8 = new b(7, "MAP_SCHEME", "map:");
            b bVar9 = new b(8, "MAPS_SCHEME", "maps:");
            b bVar10 = new b(9, "GOOGLE_MARKET_SCHEME", "market:");
            f28463d = bVar10;
            b bVar11 = new b(10, "GOOGLE_PLAY_SCHEME", "play:");
            f28464e = bVar11;
            b bVar12 = new b(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
            b bVar13 = new b(12, "GOOGLE_MARKET_HOST", "market.android");
            f28465f = bVar13;
            b bVar14 = new b(13, "GOOGLE_PLAY_HOST", "play.google");
            f28466g = bVar14;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, new b(14, "MAP_HOST", "map"), new b(15, "MAPS_HOST", "maps"), new b(16, "MOBMAPS", "mobile.maps"), new b(17, "SHORTMOBMAPS", "m.maps"), new b(18, "MESSAGE", "message:"), new b(19, "SIP", "sip:"), new b(20, "SKYPE", "skype:"), new b(21, "SMS", "sms:"), new b(22, "GTALK", "gtalk:"), new b(23, "SPOTIFY", "spotify:"), new b(24, "LASTFM", "lastfm:")};
            f28467h = bVarArr;
            AbstractC1372b.a(bVarArr);
            f28462c = new a(0);
        }

        private b(int i4, String str, String str2) {
            this.f28468b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28467h.clone();
        }

        @NotNull
        public final String a() {
            return this.f28468b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(@Nullable String str) {
        Object m243constructorimpl;
        boolean z4;
        try {
            Result.Companion companion = Result.Companion;
            new URI(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (str != null && str.length() != 0) {
            z4 = true;
            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(z4));
            Boolean bool = Boolean.FALSE;
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = bool;
            }
            return ((Boolean) m243constructorimpl).booleanValue();
        }
        z4 = false;
        m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(z4));
        Boolean bool2 = Boolean.FALSE;
        if (Result.m244isFailureimpl(m243constructorimpl)) {
        }
        return ((Boolean) m243constructorimpl).booleanValue();
    }
}
