package com.moat.analytics.mobile.vng;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoatAdEvent {

    /* renamed from: b, reason: collision with root package name */
    Integer f7320b;

    /* renamed from: c, reason: collision with root package name */
    Double f7321c;

    /* renamed from: d, reason: collision with root package name */
    MoatAdEventType f7322d;
    private final Long f;

    /* renamed from: a, reason: collision with root package name */
    static final Integer f7319a = Integer.MIN_VALUE;
    private static final Double e = Double.valueOf(Double.NaN);
    public static final Double VOLUME_MUTED = Double.valueOf(0.0d);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, f7319a, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d2) {
        this.f = Long.valueOf(System.currentTimeMillis());
        this.f7322d = moatAdEventType;
        this.f7321c = d2;
        this.f7320b = num;
    }

    Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_AD_VOLUME, this.f7321c);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_PLAY_HEAD, this.f7320b);
        hashMap.put(com.moat.analytics.mobile.tjy.MoatAdEvent.EVENT_TS, this.f);
        hashMap.put("type", this.f7322d.toString());
        return hashMap;
    }
}
