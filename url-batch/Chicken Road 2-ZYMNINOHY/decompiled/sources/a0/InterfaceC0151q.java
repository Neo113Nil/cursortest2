package a0;

import android.os.Build;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* renamed from: a0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0151q extends T.N {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4232a;

    static {
        String str = W.J.f3263a;
        String D3 = U.i.D(Build.DEVICE);
        f4232a = (D3.contains("emulator") || D3.contains("emu64a") || D3.contains("emu64x") || D3.contains("generic")) ? 30000 : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
