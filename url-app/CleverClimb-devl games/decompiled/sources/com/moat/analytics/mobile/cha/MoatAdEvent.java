package com.moat.analytics.mobile.cha;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoatAdEvent {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Long f831;

    /* renamed from: ˊ, reason: contains not printable characters */
    Double f832;

    /* renamed from: ˏ, reason: contains not printable characters */
    Integer f833;

    /* renamed from: ॱ, reason: contains not printable characters */
    MoatAdEventType f834;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private final Double f835;

    /* renamed from: ˋ, reason: contains not printable characters */
    static final Integer f829 = Integer.MIN_VALUE;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Double f830 = Double.valueOf(Double.NaN);
    public static final Double VOLUME_MUTED = Double.valueOf(0.0d);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d2) {
        this.f831 = Long.valueOf(System.currentTimeMillis());
        this.f834 = moatAdEventType;
        this.f832 = d2;
        this.f833 = num;
        this.f835 = Double.valueOf(r.m1131());
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, f830);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, f829, f830);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final Map<String, Object> m988() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_AD_VOLUME, this.f832);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_PLAY_HEAD, this.f833);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_TS, this.f831);
        hashMap.put("type", this.f834.toString());
        hashMap.put("deviceVolume", this.f835);
        return hashMap;
    }
}
