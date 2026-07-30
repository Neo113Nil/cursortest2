package defpackage;

import com.facebook.internal.AnalyticsEvents;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l01 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof l01) {
            return this.a == ((l01) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
