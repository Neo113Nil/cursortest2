package com.moat.analytics.mobile.you;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoatAdEvent {

    /* renamed from: b, reason: collision with root package name */
    Integer f7442b;

    /* renamed from: c, reason: collision with root package name */
    Double f7443c;

    /* renamed from: d, reason: collision with root package name */
    MoatAdEventType f7444d;
    private final Double f;
    private final Long g;

    /* renamed from: a, reason: collision with root package name */
    static final Integer f7441a = Integer.MIN_VALUE;
    private static final Double e = Double.valueOf(Double.NaN);
    public static final Double VOLUME_MUTED = Double.valueOf(0.0d);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, f7441a, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d2) {
        this.g = Long.valueOf(System.currentTimeMillis());
        this.f7444d = moatAdEventType;
        this.f7443c = d2;
        this.f7442b = num;
        this.f = Double.valueOf(s.a());
    }

    Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_AD_VOLUME, this.f7443c);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_PLAY_HEAD, this.f7442b);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_TS, this.g);
        hashMap.put("type", this.f7444d.toString());
        hashMap.put("deviceVolume", this.f);
        return hashMap;
    }
}
