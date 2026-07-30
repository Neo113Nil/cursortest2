package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tj1 extends vj1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tj1(Context context, int i) {
        super(r1);
        context.getClass();
        switch (i) {
            case 1:
                Object systemService = context.getSystemService((Class<Object>) b71.e());
                systemService.getClass();
                super(b71.d(systemService));
                break;
            default:
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                break;
        }
    }
}
