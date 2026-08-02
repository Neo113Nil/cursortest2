package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import c3.C0292d;
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

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056wg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12937a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f12938b;

    /* renamed from: c, reason: collision with root package name */
    public final Ra f12939c;

    /* renamed from: d, reason: collision with root package name */
    public final Dc f12940d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12941e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12942f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12943g;

    public C1056wg(Context context, SafePackageManager safePackageManager, Ra ra) {
        this.f12937a = context;
        this.f12938b = safePackageManager;
        this.f12939c = ra;
        Dc dc = new Dc(0);
        dc.a(EnumC0797mg.f12363d, 1);
        dc.a(EnumC0797mg.f12362c, 2);
        this.f12940d = dc;
        this.f12941e = TimeUnit.DAYS.toSeconds(1L);
        this.f12942f = "com.android.vending";
        this.f12943g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f12941e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0823ng a(List list) {
        C0823ng c0823ng;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0823ng) list.get(0);
        }
        SafePackageManager safePackageManager = this.f12938b;
        Context context = this.f12937a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0823ng c0823ng2 = (C0823ng) it.next();
            C0292d c0292d = new C0292d(c0823ng2, Long.valueOf(Math.abs(c0823ng2.f12466c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = c0292d.f5725b;
                if (!hasNext) {
                    break;
                }
                C0823ng c0823ng3 = (C0823ng) it.next();
                Long valueOf = Long.valueOf(Math.abs(c0823ng3.f12466c - seconds));
                C0292d c0292d2 = new C0292d(c0823ng3, valueOf);
                Comparable comparable = (Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0292d = c0292d2;
                }
            }
            c0823ng = (C0823ng) c0292d.f5724a;
        }
        c0823ng = null;
        if (c0823ng == null) {
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0823ng c0823ng4 = (C0823ng) it2.next();
            while (it2.hasNext()) {
                C0823ng c0823ng5 = (C0823ng) it2.next();
                if (a(this, c0823ng4, c0823ng5) < 0) {
                    c0823ng4 = c0823ng5;
                }
            }
            c0823ng = c0823ng4;
        }
        Ra ra = this.f12939c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(d3.k.Y(list));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0823ng c0823ng6 = (C0823ng) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0823ng6.f12464a).put("install_timestamp_seconds", c0823ng6.f12466c).put("click_timestamp_seconds", c0823ng6.f12465b).put(AdRevenueConstants.SOURCE_KEY, c0823ng6.f12467d.f12365a));
        }
        ra.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC0779lo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0823ng.f12464a).put("install_timestamp_seconds", c0823ng.f12466c).put("click_timestamp_seconds", c0823ng.f12465b).put(AdRevenueConstants.SOURCE_KEY, c0823ng.f12467d.f12365a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0823ng;
    }

    public /* synthetic */ C1056wg(Context context) {
        this(context, new SafePackageManager(), AbstractC1067x1.a());
    }

    public static final int a(C1056wg c1056wg, C0823ng c0823ng, C0823ng c0823ng2) {
        int signum = Long.signum(c0823ng.f12466c - c0823ng2.f12466c);
        return signum == 0 ? ((Number) c1056wg.f12940d.a(c0823ng.f12467d)).intValue() - ((Number) c1056wg.f12940d.a(c0823ng2.f12467d)).intValue() : signum;
    }
}
