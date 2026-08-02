package com.squareup.workflow1;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class Workflows__WorkflowActionKt$action$1 extends Lambda implements Function0 {
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Workflows__WorkflowActionKt$action$1(String str, int i) {
        super(0);
        this.$r8$classId = i;
        this.$name = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.$name;
        switch (i) {
            case 0:
            case 1:
                return str;
            case 2:
                return Recorder$$ExternalSyntheticOutline2.m("[ViewNetworkSettledMetric] The view was not yet created for this viewId:", str);
            case 3:
                return Recorder$$ExternalSyntheticOutline2.m("[ViewNetworkSettledMetric] The difference between the last interaction and the current view is negative for viewId:", str);
            case 4:
                return Recorder$$ExternalSyntheticOutline2.m("No telemetry found for viewId=", str);
            case 5:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 6:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 7:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 8:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 9:
            default:
                return str;
        }
    }
}
