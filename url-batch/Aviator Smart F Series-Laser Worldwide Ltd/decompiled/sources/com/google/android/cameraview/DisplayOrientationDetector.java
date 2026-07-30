package com.google.android.cameraview;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;
import com.crrepa.band.my.device.customkey.util.c;

/* loaded from: classes3.dex */
abstract class DisplayOrientationDetector {
    static final SparseIntArray DISPLAY_ORIENTATIONS;
    Display mDisplay;
    private int mLastKnownDisplayOrientation = 0;
    private final OrientationEventListener mOrientationEventListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        DISPLAY_ORIENTATIONS = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, c.MAX_GOAL_TIME);
        sparseIntArray.put(3, 270);
    }

    public DisplayOrientationDetector(Context context) {
        this.mOrientationEventListener = new OrientationEventListener(context) { // from class: com.google.android.cameraview.DisplayOrientationDetector.1
            private int mLastKnownRotation = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i8) {
                Display display;
                int rotation;
                if (i8 == -1 || (display = DisplayOrientationDetector.this.mDisplay) == null || this.mLastKnownRotation == (rotation = display.getRotation())) {
                    return;
                }
                this.mLastKnownRotation = rotation;
                DisplayOrientationDetector.this.dispatchOnDisplayOrientationChanged(DisplayOrientationDetector.DISPLAY_ORIENTATIONS.get(rotation));
            }
        };
    }

    public void disable() {
        this.mOrientationEventListener.disable();
        this.mDisplay = null;
    }

    void dispatchOnDisplayOrientationChanged(int i8) {
        this.mLastKnownDisplayOrientation = i8;
        onDisplayOrientationChanged(i8);
    }

    public void enable(Display display) {
        this.mDisplay = display;
        this.mOrientationEventListener.enable();
        dispatchOnDisplayOrientationChanged(DISPLAY_ORIENTATIONS.get(display.getRotation()));
    }

    public int getLastKnownDisplayOrientation() {
        return this.mLastKnownDisplayOrientation;
    }

    public abstract void onDisplayOrientationChanged(int i8);
}
