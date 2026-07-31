package com.ironsource.mediationsdk;

import com.ironsource.C1513m5;
import com.ironsource.C1550s;
import com.ironsource.bm;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f17667a;

    /* renamed from: b, reason: collision with root package name */
    protected C1550s f17668b;

    /* renamed from: c, reason: collision with root package name */
    protected IronSourceSegment f17669c;

    /* renamed from: d, reason: collision with root package name */
    protected AdInfo f17670d;

    public m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f17667a = hashSet;
        this.f17668b = new C1550s();
        this.f17669c = ironSourceSegment;
    }

    protected void a(C1513m5 c1513m5, String str) {
        HashSet hashSet;
        if (c1513m5 == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData a4 = c1513m5.a(str);
        if (a4 != null) {
            synchronized (this) {
                hashSet = (HashSet) this.f17667a.clone();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a4);
                impressionDataListener.onImpressionSuccess(a4);
            }
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17667a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f17667a.clear();
        }
    }

    protected String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.f17670d = null;
    }

    protected void a(IronSource.AD_UNIT ad_unit) {
        this.f17668b.a(ad_unit, false);
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f17669c = ironSourceSegment;
    }

    public void a(ImpressionData impressionData, bm bmVar) {
        if (impressionData != null) {
            this.f17670d = new AdInfo(impressionData, bmVar);
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17667a.remove(impressionDataListener);
        }
    }

    protected void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f17668b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(d.f17317f, false) : false);
    }
}
