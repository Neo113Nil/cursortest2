package com.baidu.ar.arplay.core.engine.rotate;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class OrientationManager extends OrientationEventListener {
    private Orientation mCurrentOrientation;
    private List<OrientationListener> mListeners;
    private static Orientation sGlobalOrientation = Orientation.UNKNOWN;
    private static boolean isScreenOrientationLandscape = false;

    public interface OrientationListener {
        void onRotateOrientation(Orientation orientation);
    }

    public OrientationManager(Context context) {
        super(context);
        this.mCurrentOrientation = Orientation.PORTRAIT;
        this.mListeners = new ArrayList();
    }

    public static Orientation calcOrientation(int i8, Orientation orientation) {
        if (isScreenOrientationLandscape) {
            i8 = (i8 + 90) % 360;
        }
        Orientation certainOrientation = certainOrientation(i8);
        if (certainOrientation != null) {
            return certainOrientation;
        }
        Orientation[] probablyOrientation = probablyOrientation(i8);
        return (orientation == probablyOrientation[0] || orientation == probablyOrientation[1]) ? orientation : nearOrientation(i8);
    }

    private static Orientation certainOrientation(int i8) {
        if ((i8 >= 0 && i8 <= 10) || (i8 >= 350 && i8 <= 359)) {
            return Orientation.PORTRAIT;
        }
        if (i8 >= 80 && i8 <= 100) {
            return Orientation.LANDSCAPE;
        }
        if (i8 >= 170 && i8 <= 190) {
            return Orientation.PORTRAIT_REVERSE;
        }
        if (i8 < 260 || i8 > 280) {
            return null;
        }
        return Orientation.LANDSCAPE_REVERSE;
    }

    public static Orientation getGlobalOrientation() {
        return sGlobalOrientation;
    }

    private static Orientation nearOrientation(int i8) {
        return ((i8 < 0 || i8 > 45) && (i8 < 315 || i8 >= 360)) ? (i8 <= 45 || i8 >= 135) ? (i8 < 135 || i8 > 225) ? (i8 <= 225 || i8 >= 315) ? Orientation.PORTRAIT : Orientation.LANDSCAPE_REVERSE : Orientation.PORTRAIT_REVERSE : Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    private static Orientation[] probablyOrientation(int i8) {
        return (i8 <= 0 || i8 >= 90) ? (i8 <= 90 || i8 >= 180) ? (i8 <= 180 || i8 >= 270) ? new Orientation[]{Orientation.LANDSCAPE_REVERSE, Orientation.PORTRAIT} : new Orientation[]{Orientation.PORTRAIT_REVERSE, Orientation.LANDSCAPE_REVERSE} : new Orientation[]{Orientation.LANDSCAPE, Orientation.PORTRAIT} : new Orientation[]{Orientation.PORTRAIT, Orientation.LANDSCAPE};
    }

    public static void setGlobalOrientation(Orientation orientation) {
        sGlobalOrientation = orientation;
    }

    public void addOrientationListener(OrientationListener orientationListener) {
        if (orientationListener == null || this.mListeners.contains(orientationListener)) {
            return;
        }
        this.mListeners.add(orientationListener);
    }

    public void destroy() {
        sGlobalOrientation = Orientation.UNKNOWN;
        this.mListeners.clear();
    }

    @Override // android.view.OrientationEventListener
    public void disable() {
        try {
            super.disable();
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        try {
            super.enable();
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    public void notifyOrientationChanged() {
        notifyOrientationChanged(this.mCurrentOrientation);
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i8) {
        Orientation calcOrientation;
        if (i8 == -1 || (calcOrientation = calcOrientation(i8, this.mCurrentOrientation)) == null) {
            return;
        }
        if (sGlobalOrientation == Orientation.UNKNOWN) {
            sGlobalOrientation = calcOrientation;
        }
        if (this.mCurrentOrientation != calcOrientation) {
            this.mCurrentOrientation = calcOrientation;
            notifyOrientationChanged(calcOrientation);
        }
    }

    public void removeOrientationListener(OrientationListener orientationListener) {
        if (orientationListener == null || !this.mListeners.contains(orientationListener)) {
            return;
        }
        this.mListeners.remove(orientationListener);
    }

    public void setScreenOrientationLandscape(boolean z7) {
        isScreenOrientationLandscape = z7;
    }

    public void notifyOrientationChanged(Orientation orientation) {
        setGlobalOrientation(orientation);
        Iterator<OrientationListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onRotateOrientation(orientation);
        }
    }
}
