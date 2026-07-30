package com.baidu.mapapi.search.base;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public enum a {
    AUTO(TtmlNode.TEXT_EMPHASIS_AUTO),
    ENGLISH("en"),
    CANTONESE("yue"),
    CLASSICAL_CHINESE("wyw"),
    JAPANESE("jp"),
    KOREAN("kor"),
    FRENCH("fra"),
    SPANISH("spa"),
    THAI("th"),
    ARABIC("ara"),
    RUSSIAN(u.LANGUAGE_RU),
    PORTUGUESE(u.LANGUAGE_PT),
    GERMAN(u.LANGUAGE_DE),
    ITALIAN(u.LANGUAGE_IT),
    Greek("el"),
    DUTCH("nl"),
    Polish("pl"),
    BULGARIAN("bul"),
    ESTONIAN("est"),
    DANISH("dan"),
    FINNISH("fin"),
    CZECH("cs"),
    ROMANIAN("rom"),
    SLOVENIAN("slo"),
    SWEDISH("swe"),
    HUNGARIAN("hu"),
    TRADITIONAL_CHINESE("cht"),
    VIETNAMESE("vie");

    private final String D;

    a(String str) {
        this.D = str;
    }

    public String a() {
        return this.D;
    }
}
