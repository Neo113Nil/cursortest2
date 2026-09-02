package B1;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d3.q;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.i.e(sidecarDeviceState, "sidecarDeviceState");
        int a3 = a(sidecarDeviceState);
        if (a3 < 0 || a3 > 4) {
            return 0;
        }
        return a3;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        List list;
        q qVar = q.f8333a;
        kotlin.jvm.internal.i.e(info, "info");
        try {
            try {
                list = info.displayFeatures;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return list == null ? qVar : list;
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i4) {
        try {
            try {
                sidecarDeviceState.posture = i4;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i4));
        }
    }
}
