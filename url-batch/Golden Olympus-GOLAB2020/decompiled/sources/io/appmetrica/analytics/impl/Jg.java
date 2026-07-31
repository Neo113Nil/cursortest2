package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Jg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37832a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f37833b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2804mb f37834c;

    /* renamed from: d, reason: collision with root package name */
    public final Yc f37835d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37836e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37837f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37838g;

    public Jg(Context context, SafePackageManager safePackageManager, InterfaceC2804mb interfaceC2804mb) {
        this.f37832a = context;
        this.f37833b = safePackageManager;
        this.f37834c = interfaceC2804mb;
        Yc yc = new Yc(0);
        yc.a(EnumC3146zg.f40386d, 1);
        yc.a(EnumC3146zg.f40385c, 2);
        this.f37835d = yc;
        this.f37836e = TimeUnit.DAYS.toSeconds(1L);
        this.f37837f = "com.android.vending";
        this.f37838g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (((java.lang.Number) r5.component2()).longValue() < r13.f37836e) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ag a(List list) {
        Ag ag;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (Ag) list.get(0);
        }
        SafePackageManager safePackageManager = this.f37833b;
        Context context = this.f37832a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Ag ag2 = (Ag) it.next();
            Pair pair = TuplesKt.to(ag2, Long.valueOf(Math.abs(ag2.f37185c - seconds)));
            while (it.hasNext()) {
                Ag ag3 = (Ag) it.next();
                Pair pair2 = TuplesKt.to(ag3, Long.valueOf(Math.abs(ag3.f37185c - seconds)));
                if (Z1.a.d((Comparable) pair.getSecond(), (Comparable) pair2.getSecond()) > 0) {
                    pair = pair2;
                }
            }
            ag = (Ag) pair.component1();
        }
        ag = null;
        if (ag == null) {
            Comparator comparator = new Comparator() { // from class: io.appmetrica.analytics.impl.Qo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Jg.a(Jg.this, (Ag) obj, (Ag) obj2);
                }
            };
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Ag ag4 = (Ag) it2.next();
            while (it2.hasNext()) {
                Ag ag5 = (Ag) it2.next();
                if (comparator.compare(ag4, ag5) < 0) {
                    ag4 = ag5;
                }
            }
            ag = ag4;
        }
        InterfaceC2804mb interfaceC2804mb = this.f37834c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Ag ag6 = (Ag) it3.next();
            arrayList.add(new JSONObject().put("referrer", ag6.f37183a).put("install_timestamp_seconds", ag6.f37185c).put("click_timestamp_seconds", ag6.f37184b).put("source", ag6.f37186d.f40388a));
        }
        interfaceC2804mb.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC2713io.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", ag.f37183a).put("install_timestamp_seconds", ag.f37185c).put("click_timestamp_seconds", ag.f37184b).put("source", ag.f37186d.f40388a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return ag;
    }

    public /* synthetic */ Jg(Context context) {
        this(context, new SafePackageManager(), AbstractC2975t1.a());
    }

    public static final int a(Jg jg, Ag ag, Ag ag2) {
        int a4 = AbstractC3185a.a(ag.f37185c - ag2.f37185c);
        return a4 == 0 ? ((Number) jg.f37835d.a(ag.f37186d)).intValue() - ((Number) jg.f37835d.a(ag2.f37186d)).intValue() : a4;
    }
}
