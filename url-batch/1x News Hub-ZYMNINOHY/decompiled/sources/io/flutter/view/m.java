package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Method f9447a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f9448b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f9449c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f9450d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f9451e;
    public final Method f;

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Field field;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        Class cls = Integer.TYPE;
        if (i3 > 26) {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                field = declaredField;
                method4 = null;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method4 = null;
                field = null;
            }
            this.f9447a = method;
            this.f9448b = method6;
            this.f9449c = method2;
            this.f9450d = method4;
            this.f9451e = field;
            this.f = method5;
        }
        try {
            method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
        } catch (NoSuchMethodException unused4) {
            Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
            method3 = null;
        }
        try {
            method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
            field = null;
        } catch (NoSuchMethodException unused5) {
            Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
            method4 = null;
            field = null;
        }
        method6 = method3;
        method5 = field;
        this.f9447a = method;
        this.f9448b = method6;
        this.f9449c = method2;
        this.f9450d = method4;
        this.f9451e = field;
        this.f = method5;
    }

    public static Long a(m mVar, AccessibilityRecord accessibilityRecord) {
        Method method = mVar.f9449c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, new Object[0]);
        } catch (IllegalAccessException e3) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e4);
            return null;
        }
    }

    public static boolean b(int i3, long j3) {
        return (j3 & (1 << i3)) != 0;
    }
}
