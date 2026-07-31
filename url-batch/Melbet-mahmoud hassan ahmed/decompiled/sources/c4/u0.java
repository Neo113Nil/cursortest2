package c4;

import android.util.JsonWriter;

/* loaded from: classes.dex */
public enum u0 {
    DEBUG_PARAM_UNKNOWN,
    ALWAYS_SHOW,
    GEO_OVERRIDE_EEA,
    GEO_OVERRIDE_NON_EEA;

    public final void b(JsonWriter jsonWriter) {
        String str;
        int i7 = s0.f2098b[ordinal()];
        if (i7 == 1) {
            str = "DEBUG_PARAM_UNKNOWN";
        } else if (i7 == 2) {
            str = "ALWAYS_SHOW";
        } else {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                return;
            }
            str = "GEO_OVERRIDE_EEA";
        }
        jsonWriter.value(str);
    }
}
