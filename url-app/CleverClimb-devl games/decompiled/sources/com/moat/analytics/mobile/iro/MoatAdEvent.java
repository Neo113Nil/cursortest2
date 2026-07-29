package com.moat.analytics.mobile.iro;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoatAdEvent {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Long f1056;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Double f1057;

    /* renamed from: ˊ, reason: contains not printable characters */
    Integer f1058;

    /* renamed from: ˎ, reason: contains not printable characters */
    Double f1059;

    /* renamed from: ॱ, reason: contains not printable characters */
    MoatAdEventType f1060;

    /* renamed from: ˏ, reason: contains not printable characters */
    static final Integer f1055 = Integer.MIN_VALUE;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Double f1054 = Double.valueOf(Double.NaN);
    public static final Double VOLUME_MUTED = Double.valueOf(0.0d);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d2) {
        this.f1056 = Long.valueOf(System.currentTimeMillis());
        this.f1060 = moatAdEventType;
        this.f1059 = d2;
        this.f1058 = num;
        this.f1057 = Double.valueOf(p.m1301());
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, f1054);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, f1055, f1054);
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final Map<String, Object> m1167() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_AD_VOLUME, this.f1059);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_PLAY_HEAD, this.f1058);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_TS, this.f1056);
        hashMap.put("type", this.f1060.toString());
        hashMap.put("deviceVolume", this.f1057);
        return hashMap;
    }
}
