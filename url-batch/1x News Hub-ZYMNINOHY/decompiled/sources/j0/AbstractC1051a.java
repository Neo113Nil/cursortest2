package j0;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c2.m;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1051a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.j.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.j.e(sidecarDeviceState, "sidecarDeviceState");
        int a3 = a(sidecarDeviceState);
        if (a3 < 0 || a3 > 4) {
            return 0;
        }
        return a3;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        List list;
        m mVar = m.f2637a;
        kotlin.jvm.internal.j.e(info, "info");
        try {
            try {
                list = info.displayFeatures;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return list == null ? mVar : list;
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i3) {
        try {
            try {
                sidecarDeviceState.posture = i3;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i3));
        }
    }
}
