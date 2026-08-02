package papa;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AppTask {
    public final String baseIntent;
    public final Long elapsedSinceLastActiveRealtimeMillis;
    public final Integer numActivities;
    public final String topActivity;

    public AppTask(String str, Long l, Integer num, String str2) {
        this.topActivity = str;
        this.elapsedSinceLastActiveRealtimeMillis = l;
        this.numActivities = num;
        this.baseIntent = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTask)) {
            return false;
        }
        AppTask appTask = (AppTask) obj;
        return Intrinsics.areEqual(this.topActivity, appTask.topActivity) && this.elapsedSinceLastActiveRealtimeMillis.equals(appTask.elapsedSinceLastActiveRealtimeMillis) && this.numActivities.equals(appTask.numActivities) && Intrinsics.areEqual(this.baseIntent, appTask.baseIntent);
    }

    public final int hashCode() {
        String str = this.topActivity;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.elapsedSinceLastActiveRealtimeMillis, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.numActivities);
        String str2 = this.baseIntent;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppTask(topActivity=");
        sb.append(this.topActivity);
        sb.append(", elapsedSinceLastActiveRealtimeMillis=");
        sb.append(this.elapsedSinceLastActiveRealtimeMillis);
        sb.append(", numActivities=");
        sb.append(this.numActivities);
        sb.append(", baseIntent=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.baseIntent, ')');
    }
}
