package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8022a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8023b;

    /* renamed from: c, reason: collision with root package name */
    public String f8024c;

    /* renamed from: d, reason: collision with root package name */
    public AdUnitConfig f8025d;

    /* renamed from: e, reason: collision with root package name */
    public String f8026e;

    /* renamed from: f, reason: collision with root package name */
    public Point f8027f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f8028g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f8029h;

    /* renamed from: i, reason: collision with root package name */
    public String f8030i;

    public z9(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(preferences, "preferences");
        kotlin.jvm.internal.i.e(placement, "placement");
        kotlin.jvm.internal.i.e(httpClient, "httpClient");
        kotlin.jvm.internal.i.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.i.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.i.e(motionProcessor, "motionProcessor");
        this.f8029h = 1;
    }
}
