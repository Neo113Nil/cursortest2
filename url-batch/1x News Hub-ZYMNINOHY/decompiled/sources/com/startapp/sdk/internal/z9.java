package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4873b;

    /* renamed from: c, reason: collision with root package name */
    public String f4874c;

    /* renamed from: d, reason: collision with root package name */
    public AdUnitConfig f4875d;

    /* renamed from: e, reason: collision with root package name */
    public String f4876e;
    public Point f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4877g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f4878h;

    /* renamed from: i, reason: collision with root package name */
    public String f4879i;

    public z9(Context context, AdPreferences preferences, AdPreferences.Placement placement, ib httpClient, ib networkApiExecutor, ib eventTracer, ib motionProcessor) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(preferences, "preferences");
        kotlin.jvm.internal.j.e(placement, "placement");
        kotlin.jvm.internal.j.e(httpClient, "httpClient");
        kotlin.jvm.internal.j.e(networkApiExecutor, "networkApiExecutor");
        kotlin.jvm.internal.j.e(eventTracer, "eventTracer");
        kotlin.jvm.internal.j.e(motionProcessor, "motionProcessor");
        this.f4878h = 1;
    }
}
