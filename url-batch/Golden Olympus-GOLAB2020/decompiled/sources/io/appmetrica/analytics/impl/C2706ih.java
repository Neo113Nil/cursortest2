package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2706ih extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f39205b;

    public C2706ih(C2953s5 c2953s5) {
        this(c2953s5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:14:0x0069, B:16:0x008e, B:18:0x0093, B:21:0x0097), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:14:0x0069, B:16:0x008e, B:18:0x0093, B:21:0x0097), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull C2773l6 c2773l6) {
        HashSet hashSet;
        ArrayList b4;
        C2953s5 c2953s5 = this.f38930a;
        if (c2953s5.f39784t.c() && c2953s5.x()) {
            C2756kf c2756kf = c2953s5.f39767c;
            String e4 = this.f38930a.f39767c.e();
            try {
                if (!TextUtils.isEmpty(e4)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e4);
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            hashSet.add(new C2803ma(jSONArray.getJSONObject(i4)));
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
                            C2803ma c2803ma = (C2803ma) obj;
                            c2803ma.getClass();
                            JSONObject put = new JSONObject().put("name", c2803ma.f39442a).put("required", c2803ma.f39444c);
                            int i6 = c2803ma.f39443b;
                            if (i6 != -1) {
                                put.put("version", i6);
                            }
                            jSONArray2.put(put);
                        }
                        C2773l6 a4 = C2773l6.a(c2773l6, new JSONObject().put("features", jSONArray2).toString());
                        F9 f9 = c2953s5.f39778n;
                        f9.a(a4, Sk.a(f9.f37519c.b(a4), a4.f39384i));
                        int i7 = f9.f37527k;
                        f9.f37529m = i7;
                        f9.f37517a.a(i7).b();
                        c2756kf.i(jSONArray2.toString());
                    } else {
                        F9 f92 = c2953s5.f39778n;
                        int i8 = f92.f37527k;
                        f92.f37529m = i8;
                        f92.f37517a.a(i8).b();
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
            C2953s5 c2953s5 = this.f38930a;
            SafePackageManager safePackageManager = this.f39205b;
            Context context = c2953s5.f39765a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC2777la c2725ja = AndroidUtils.isApiAchieved(24) ? new C2725ja() : new C2751ka();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c2725ja.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C2706ih(C2953s5 c2953s5, @NonNull SafePackageManager safePackageManager) {
        super(c2953s5);
        this.f39205b = safePackageManager;
    }
}
