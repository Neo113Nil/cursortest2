package papa.internal;

import android.app.ActivityManager;
import java.util.ArrayList;
import okio.Okio;

/* loaded from: classes3.dex */
public final class MyProcess$MyProcessData extends Okio {
    public final ArrayList appTasks;
    public final ActivityManager.RunningAppProcessInfo info;
    public final long processStartRealtimeMillis;

    public MyProcess$MyProcessData(ActivityManager.RunningAppProcessInfo runningAppProcessInfo, long j, ArrayList arrayList) {
        this.info = runningAppProcessInfo;
        this.processStartRealtimeMillis = j;
        this.appTasks = arrayList;
    }
}
