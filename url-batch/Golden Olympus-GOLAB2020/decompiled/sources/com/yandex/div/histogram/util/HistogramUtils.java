package com.yandex.div.histogram.util;

import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class HistogramUtils {

    @NotNull
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final boolean shouldRecordHistogram(@NotNull String callType, @NotNull HistogramRecordConfiguration configuration) {
        Intrinsics.checkNotNullParameter(callType, "callType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int hashCode = callType.hashCode();
        if (hashCode != 2106116) {
            if (hashCode != 2106217) {
                if (hashCode == 2688677 && callType.equals("Warm")) {
                    return configuration.isWarmRecordingEnabled();
                }
            } else if (callType.equals("Cool")) {
                return configuration.isCoolRecordingEnabled();
            }
        } else if (callType.equals("Cold")) {
            return configuration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (!Assert.isEnabled()) {
            return false;
        }
        Assert.fail("Unknown histogram call type: " + callType);
        return false;
    }
}
