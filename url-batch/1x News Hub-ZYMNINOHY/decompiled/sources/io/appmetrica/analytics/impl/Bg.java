package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import b2.C0190d;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Bg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final Ya f5820c;

    /* renamed from: d, reason: collision with root package name */
    public final Kc f5821d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5822e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5823g;

    public Bg(Context context, SafePackageManager safePackageManager, Ya ya) {
        this.f5818a = context;
        this.f5819b = safePackageManager;
        this.f5820c = ya;
        Kc kc = new Kc(0);
        kc.a(EnumC0804rg.f8240d, 1);
        kc.a(EnumC0804rg.f8239c, 2);
        this.f5821d = kc;
        this.f5822e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.f5823g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f5822e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0830sg a(List list) {
        C0830sg c0830sg;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0830sg) list.get(0);
        }
        SafePackageManager safePackageManager = this.f5819b;
        Context context = this.f5818a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0830sg c0830sg2 = (C0830sg) it.next();
            C0190d c0190d = new C0190d(c0830sg2, Long.valueOf(Math.abs(c0830sg2.f8317c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = c0190d.f2548b;
                if (!hasNext) {
                    break;
                }
                C0830sg c0830sg3 = (C0830sg) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0830sg3.f8317c - seconds));
                C0190d c0190d2 = new C0190d(c0830sg3, valueOf);
                Comparable comparable = (Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0190d = c0190d2;
                }
            }
            c0830sg = (C0830sg) c0190d.f2547a;
        }
        c0830sg = null;
        if (c0830sg == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0830sg c0830sg4 = (C0830sg) it2.next();
            while (it2.hasNext()) {
                C0830sg c0830sg5 = (C0830sg) it2.next();
                if (a(this, c0830sg4, c0830sg5) < 0) {
                    c0830sg4 = c0830sg5;
                }
            }
            c0830sg = c0830sg4;
        }
        Ya ya = this.f5820c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(c2.g.N(list));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0830sg c0830sg6 = (C0830sg) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0830sg6.f8315a).put("install_timestamp_seconds", c0830sg6.f8317c).put("click_timestamp_seconds", c0830sg6.f8316b).put(AdRevenueConstants.SOURCE_KEY, c0830sg6.f8318d.f8242a));
        }
        ya.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0709no.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0830sg.f8315a).put("install_timestamp_seconds", c0830sg.f8317c).put("click_timestamp_seconds", c0830sg.f8316b).put(AdRevenueConstants.SOURCE_KEY, c0830sg.f8318d.f8242a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0830sg;
    }

    public /* synthetic */ Bg(Context context) {
        this(context, new SafePackageManager(), AbstractC0919w1.a());
    }

    public static final int a(Bg bg, C0830sg c0830sg, C0830sg c0830sg2) {
        int signum = Long.signum(c0830sg.f8317c - c0830sg2.f8317c);
        return signum == 0 ? ((Number) bg.f5821d.a(c0830sg.f8318d)).intValue() - ((Number) bg.f5821d.a(c0830sg2.f8318d)).intValue() : signum;
    }
}
