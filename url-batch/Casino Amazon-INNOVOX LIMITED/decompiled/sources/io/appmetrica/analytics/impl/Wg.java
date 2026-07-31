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

/* loaded from: classes3.dex */
public final class Wg extends Sg {
    public final SafePackageManager b;

    public Wg(Y4 y4) {
        this(y4, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Q5 q5) {
        HashSet hashSet;
        ArrayList b;
        Y4 y4 = this.f1045a;
        if (y4.t.c() && y4.y()) {
            Xe xe = y4.c;
            String e = this.f1045a.c.e();
            try {
                if (!TextUtils.isEmpty(e)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(new S9(jSONArray.getJSONObject(i)));
                        }
                    } catch (Throwable unused) {
                    }
                    b = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            S9 s9 = (S9) it.next();
                            s9.getClass();
                            JSONObject put = new JSONObject().put("name", s9.f1042a).put("required", s9.c);
                            int i2 = s9.b;
                            if (i2 != -1) {
                                put.put("version", i2);
                            }
                            jSONArray2.put(put);
                        }
                        Q5 a2 = Q5.a(q5, new JSONObject().put("features", jSONArray2).toString());
                        C0325l9 c0325l9 = y4.n;
                        c0325l9.a(a2, Sk.a(c0325l9.c.b(a2), a2.i));
                        int i3 = c0325l9.j;
                        c0325l9.l = i3;
                        c0325l9.f1357a.a(i3).b();
                        xe.i(jSONArray2.toString());
                    } else {
                        C0325l9 c0325l92 = y4.n;
                        int i4 = c0325l92.j;
                        c0325l92.l = i4;
                        c0325l92.f1357a.a(i4).b();
                    }
                }
                b = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
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
            Y4 y4 = this.f1045a;
            SafePackageManager safePackageManager = this.b;
            Context context = y4.f1126a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            R9 p9 = AndroidUtils.isApiAchieved(24) ? new P9() : new Q9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(p9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Wg(Y4 y4, SafePackageManager safePackageManager) {
        super(y4);
        this.b = safePackageManager;
    }
}
