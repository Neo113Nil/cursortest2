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
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517ah extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f7879b;

    public C0517ah(C0608e5 c0608e5) {
        this(c0608e5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Wg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(W5 w5) {
        HashSet hashSet;
        ArrayList b6;
        C0608e5 c0608e5 = this.f7670a;
        if (c0608e5.f8104t.c() && c0608e5.y()) {
            C0541bf c0541bf = c0608e5.f8087c;
            String e3 = this.f7670a.f8087c.e();
            try {
                if (!TextUtils.isEmpty(e3)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e3);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(new Y9(jSONArray.getJSONObject(i2)));
                        }
                    } catch (Throwable unused) {
                    }
                    b6 = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b6)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b6.iterator();
                        while (it.hasNext()) {
                            Y9 y9 = (Y9) it.next();
                            y9.getClass();
                            JSONObject put = new JSONObject().put("name", y9.f7737a).put("required", y9.f7739c);
                            int i3 = y9.f7738b;
                            if (i3 != -1) {
                                put.put("version", i3);
                            }
                            jSONArray2.put(put);
                        }
                        W5 a6 = W5.a(w5, new JSONObject().put("features", jSONArray2).toString());
                        C0948r9 c0948r9 = c0608e5.f8098n;
                        c0948r9.a(a6, Wk.a(c0948r9.f9150c.b(a6), a6.f7656i));
                        int i6 = c0948r9.f9158k;
                        c0948r9.f9160m = i6;
                        c0948r9.f9148a.a(i6).b();
                        c0541bf.i(jSONArray2.toString());
                    } else {
                        C0948r9 c0948r92 = c0608e5.f8098n;
                        int i7 = c0948r92.f9158k;
                        c0948r92.f9160m = i7;
                        c0948r92.f9148a.a(i7).b();
                    }
                }
                b6 = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b6)) {
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
            C0608e5 c0608e5 = this.f7670a;
            SafePackageManager safePackageManager = this.f7879b;
            Context context = c0608e5.f8085a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            X9 v9 = AndroidUtils.isApiAchieved(24) ? new V9() : new W9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(v9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0517ah(C0608e5 c0608e5, SafePackageManager safePackageManager) {
        super(c0608e5);
        this.f7879b = safePackageManager;
    }
}
