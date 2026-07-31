package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
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
import kotlin.comparisons.ComparisonsKt;
import kotlin.math.MathKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0631xg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1566a;
    public final SafePackageManager b;
    public final Sa c;
    public final Ec d;
    public final long e;
    public final String f;
    public final String g;

    public C0631xg(Context context, SafePackageManager safePackageManager, Sa sa) {
        this.f1566a = context;
        this.b = safePackageManager;
        this.c = sa;
        Ec ec = new Ec(0);
        ec.a(EnumC0382ng.d, 1);
        ec.a(EnumC0382ng.c, 2);
        this.d = ec;
        this.e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (((java.lang.Number) r5.component2()).longValue() < r13.e) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0407og a(List list) {
        C0407og c0407og;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C0407og) list.get(0);
        }
        SafePackageManager safePackageManager = this.b;
        Context context = this.f1566a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0407og c0407og2 = (C0407og) it.next();
            Pair pair = TuplesKt.to(c0407og2, Long.valueOf(Math.abs(c0407og2.c - seconds)));
            while (it.hasNext()) {
                C0407og c0407og3 = (C0407og) it.next();
                Pair pair2 = TuplesKt.to(c0407og3, Long.valueOf(Math.abs(c0407og3.c - seconds)));
                if (ComparisonsKt.compareValues((Comparable) pair.getSecond(), (Comparable) pair2.getSecond()) > 0) {
                    pair = pair2;
                }
            }
            c0407og = (C0407og) pair.component1();
        }
        c0407og = null;
        if (c0407og == null) {
            Comparator comparator = new Comparator() { // from class: io.appmetrica.analytics.impl.xg$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C0631xg.a(C0631xg.this, (C0407og) obj, (C0407og) obj2);
                }
            };
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C0407og c0407og4 = (C0407og) it2.next();
            while (it2.hasNext()) {
                C0407og c0407og5 = (C0407og) it2.next();
                if (comparator.compare(c0407og4, c0407og5) < 0) {
                    c0407og4 = c0407og5;
                }
            }
            c0407og = c0407og4;
        }
        Sa sa = this.c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0407og c0407og6 = (C0407og) it3.next();
            arrayList.add(new JSONObject().put("referrer", c0407og6.f1416a).put("install_timestamp_seconds", c0407og6.c).put("click_timestamp_seconds", c0407og6.b).put("source", c0407og6.d.f1397a));
        }
        sa.reportEvent("several_filled_referrers", jSONObject.put("candidates", mo.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c0407og.f1416a).put("install_timestamp_seconds", c0407og.c).put("click_timestamp_seconds", c0407og.b).put("source", c0407og.d.f1397a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0407og;
    }

    public /* synthetic */ C0631xg(Context context) {
        this(context, new SafePackageManager(), AbstractC0641y1.a());
    }

    public static final int a(C0631xg c0631xg, C0407og c0407og, C0407og c0407og2) {
        int sign = MathKt.getSign(c0407og.c - c0407og2.c);
        return sign == 0 ? ((Number) c0631xg.d.a(c0407og.d)).intValue() - ((Number) c0631xg.d.a(c0407og2.d)).intValue() : sign;
    }
}
