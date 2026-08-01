package i8;

import android.os.Bundle;
import b8.s;
import c7.c0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f4670b;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f4671a;

    public b(AppMeasurementSdk appMeasurementSdk) {
        c0.g(appMeasurementSdk);
        this.f4671a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        if (j8.a.f5106b.contains("fcm") || j8.a.f5105a.contains(str)) {
            return;
        }
        s sVar = j8.a.f5107c;
        int i3 = sVar.f1442r;
        int i10 = 0;
        int i11 = 0;
        while (i11 < i3) {
            boolean containsKey = bundle.containsKey((String) sVar.get(i11));
            i11++;
            if (containsKey) {
                return;
            }
        }
        if ("_cmp".equals(str)) {
            if (j8.a.f5106b.contains("fcm")) {
                return;
            }
            s sVar2 = j8.a.f5107c;
            int i12 = sVar2.f1442r;
            while (i10 < i12) {
                boolean containsKey2 = bundle.containsKey((String) sVar2.get(i10));
                i10++;
                if (containsKey2) {
                    return;
                }
            }
            bundle.putString("_cis", "fcm_integration");
        }
        this.f4671a.logEvent("fcm", str, bundle);
    }
}
