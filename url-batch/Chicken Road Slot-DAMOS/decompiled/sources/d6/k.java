package d6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3637a = t5.o.f("ProcessUtils");

    public static final boolean a(Context context, t5.b bVar) {
        String str;
        Object obj;
        context.getClass();
        bVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f3620a.a();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, t5.u.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                invoke.getClass();
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                if (t5.o.d().f9314a <= 3) {
                    Log.d(f3637a, "Unable to check ActivityThread for processName", th);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return Intrinsics.a(str, context.getApplicationInfo().processName);
    }
}
