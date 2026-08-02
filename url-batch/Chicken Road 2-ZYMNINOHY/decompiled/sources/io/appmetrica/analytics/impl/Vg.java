package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Vg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f11145b;

    public Vg(X4 x4) {
        this(x4, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:14:0x0069, B:16:0x008e, B:18:0x0093, B:21:0x0097), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:14:0x0069, B:16:0x008e, B:18:0x0093, B:21:0x0097), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Rg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(P5 p5) {
        HashSet hashSet;
        ArrayList b4;
        X4 x4 = this.f10886a;
        if (x4.f11239t.c() && x4.y()) {
            We we = x4.f11224c;
            String e4 = this.f10886a.f11224c.e();
            try {
                if (!TextUtils.isEmpty(e4)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e4);
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            hashSet.add(new R9(jSONArray.getJSONObject(i4)));
                        }
                    } catch (Throwable unused) {
                    }
                    b4 = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b4)) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size = b4.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = b4.get(i5);
                            i5++;
                            R9 r9 = (R9) obj;
                            r9.getClass();
                            JSONObject put = new JSONObject().put("name", r9.f10879a).put("required", r9.f10881c);
                            int i6 = r9.f10880b;
                            if (i6 != -1) {
                                put.put("version", i6);
                            }
                            jSONArray2.put(put);
                        }
                        P5 a3 = P5.a(p5, new JSONObject().put("features", jSONArray2).toString());
                        C0738k9 c0738k9 = x4.n;
                        c0738k9.a(a3, Rk.a(c0738k9.f12204c.b(a3), a3.f10802i));
                        int i7 = c0738k9.f12211j;
                        c0738k9.f12213l = i7;
                        c0738k9.f12202a.a(i7).b();
                        we.i(jSONArray2.toString());
                    } else {
                        C0738k9 c0738k92 = x4.n;
                        int i8 = c0738k92.f12211j;
                        c0738k92.f12213l = i8;
                        c0738k92.f12202a.a(i8).b();
                    }
                }
                b4 = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b4)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            X4 x4 = this.f10886a;
            SafePackageManager safePackageManager = this.f11145b;
            Context context = x4.f11222a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            Q9 o9 = AndroidUtils.isApiAchieved(24) ? new O9() : new P9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(o9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Vg(X4 x4, SafePackageManager safePackageManager) {
        super(x4);
        this.f11145b = safePackageManager;
    }
}
