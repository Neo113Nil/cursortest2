package com.ironsource.mediationsdk;

import com.ironsource.C1569t5;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.eq;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.tg;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: f, reason: collision with root package name */
    private static final n f17715f = new n();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f17716a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f17717b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private int f17718c;

    /* renamed from: d, reason: collision with root package name */
    private int f17719d;

    /* renamed from: e, reason: collision with root package name */
    private int f17720e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f17721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f17722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17723c;

        a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.f17721a = ad_unit;
            this.f17722b = ironSourceError;
            this.f17723c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f17721a, this.f17722b);
            n.this.f17717b.put(this.f17723c, Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f17719d;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f17718c;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f17720e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    public synchronized void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        if (b(ad_unit)) {
            return;
        }
        String ad_unit2 = ad_unit.toString();
        if (!this.f17716a.containsKey(ad_unit2)) {
            a(ad_unit, ironSourceError);
            return;
        }
        long a4 = a(ad_unit) * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.f17716a.get(ad_unit2).longValue();
        if (currentTimeMillis > a4) {
            a(ad_unit, ironSourceError);
            return;
        }
        this.f17717b.put(ad_unit2, Boolean.TRUE);
        long j4 = a4 - currentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j4);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, ad_unit2), j4);
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            nVar = f17715f;
        }
        return nVar;
    }

    public synchronized boolean b(IronSource.AD_UNIT ad_unit) {
        if (!this.f17717b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f17717b.get(ad_unit.toString()).booleanValue();
    }

    public void a(IronSource.AD_UNIT ad_unit, int i4) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f17719d = i4;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f17718c = i4;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f17720e = i4;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f17716a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            eq.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            tg.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            C1569t5.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }
}
