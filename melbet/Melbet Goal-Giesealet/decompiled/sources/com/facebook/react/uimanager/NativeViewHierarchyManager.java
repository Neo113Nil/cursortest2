package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.yoga.YogaDirection;

@Deprecated(since = "This class is part of Legacy Architecture and will be removed in a future release")
/* loaded from: classes2.dex */
public class NativeViewHierarchyManager {
    @Deprecated
    public void setLayoutAnimationEnabled(boolean z) {
    }

    @Deprecated
    public void updateLayout(int i, int i2, int i3, int i4, int i5) {
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("NativeViewHierarchyManager", LegacyArchitectureLogLevel.ERROR);
    }

    @Deprecated
    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
    }

    @Deprecated
    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
    }

    @Deprecated
    public final synchronized View resolveView(int i) {
        return null;
    }

    @Deprecated
    public final synchronized ViewManager resolveViewManager(int i) {
        return null;
    }

    @Deprecated
    public synchronized void updateInstanceHandle(int i, long j) {
    }

    @Deprecated
    public synchronized void updateProperties(int i, ReactStylesDiffMap reactStylesDiffMap) {
    }

    @Deprecated
    public synchronized void updateViewExtraData(int i, Object obj) {
    }

    @Deprecated
    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, YogaDirection yogaDirection) {
    }

    @Deprecated
    public synchronized long getInstanceHandle(int i) {
        return 0L;
    }

    @Deprecated
    public synchronized void createView(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
    }

    @Deprecated
    public synchronized void manageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
    }

    @Deprecated
    public synchronized void setChildren(int i, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void addRootView(int i, View view) {
    }

    @Deprecated
    protected final synchronized void addRootViewGroup(int i, View view) {
    }

    @Deprecated
    protected synchronized void dropView(View view) {
    }

    @Deprecated
    public synchronized void removeRootView(int i) {
    }

    @Deprecated
    public synchronized int getRootViewNum() {
        return 0;
    }

    @Deprecated
    public synchronized void measure(int i, int[] iArr) {
    }

    @Deprecated
    public synchronized void measureInWindow(int i, int[] iArr) {
    }

    @Deprecated
    public synchronized int findTargetTagForTouch(int i, float f, float f2) {
        return 0;
    }

    @Deprecated
    public synchronized void setJSResponder(int i, int i2, boolean z) {
    }

    @Deprecated
    public synchronized void clearJSResponder() {
    }

    @Deprecated
    public synchronized void dispatchCommand(int i, int i2, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void dispatchCommand(int i, String str, ReadableArray readableArray) {
    }

    @Deprecated
    public synchronized void sendAccessibilityEvent(int i, int i2) {
    }
}
