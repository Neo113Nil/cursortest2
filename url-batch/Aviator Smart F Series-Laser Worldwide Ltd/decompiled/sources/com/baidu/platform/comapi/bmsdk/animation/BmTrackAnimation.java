package com.baidu.platform.comapi.bmsdk.animation;

import com.baidu.mapapi.map.TrackAnimationUpdateListener;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BmTrackAnimation extends BmAnimation {
    public static final int TRACK_BACKWARD = 64;
    public static final int TRACK_FORWARD = 32;
    public static final int TRACK_MOVE_BACKWARD = 256;
    public static final int TRACK_MOVE_FORWARD = 128;
    public static final int TRACK_NONE = 0;
    public static final int TRACK_X = 1;
    public static final int TRACK_XY = 3;
    public static final int TRACK_Y = 2;
    private static Object sync = new Object();
    private static List<WeakReference<BmTrackAnimation>> wkListenerAnimations = new ArrayList();
    private b mFromPt;
    private float mFromRadio;
    private b mToPt;
    private float mToRadio;
    private a mTrackListener;
    public TrackAnimationUpdateListener trackAnimationUpdateListener;

    public interface a {
        void a(b bVar, float f8, float f9);
    }

    public BmTrackAnimation() {
        super(85, nativeCreate());
        this.mTrackListener = null;
        this.trackAnimationUpdateListener = null;
    }

    private static void addAnimation(BmTrackAnimation bmTrackAnimation) {
        synchronized (sync) {
            try {
                boolean z7 = false;
                for (int size = wkListenerAnimations.size() - 1; size >= 0; size--) {
                    BmTrackAnimation bmTrackAnimation2 = wkListenerAnimations.get(size).get();
                    if (bmTrackAnimation2 == null) {
                        wkListenerAnimations.remove(size);
                    } else if (bmTrackAnimation2 == bmTrackAnimation) {
                        z7 = true;
                    }
                }
                if (!z7) {
                    wkListenerAnimations.add(new WeakReference<>(bmTrackAnimation));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean dispatchTrackUpdateListener(long j8, double d8, double d9, float f8, float f9) {
        a aVar;
        synchronized (sync) {
            try {
                for (int size = wkListenerAnimations.size() - 1; size >= 0; size--) {
                    BmTrackAnimation bmTrackAnimation = wkListenerAnimations.get(size).get();
                    if (bmTrackAnimation == null) {
                        wkListenerAnimations.remove(size);
                    } else if (bmTrackAnimation.getNativeInstance() == j8 && (aVar = bmTrackAnimation.mTrackListener) != null) {
                        aVar.a(new b(d8, d9), f8, f9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetSdkTrack(long j8, long j9);

    private static native boolean nativeSetTrackEndPos(long j8, double d8, double d9);

    private static native boolean nativeSetTrackEndRadio(long j8, float f8);

    private static native boolean nativeSetTrackLine(long j8, long j9);

    private static native boolean nativeSetTrackPath(long j8, long j9);

    private static native boolean nativeSetTrackPos(long j8, double d8, double d9, double d10, double d11);

    private static native boolean nativeSetTrackPosRadio(long j8, float f8, float f9);

    private static native boolean nativeSetTrackUpdateListener(long j8, boolean z7);

    private static void removeAnimation(BmTrackAnimation bmTrackAnimation) {
        synchronized (sync) {
            try {
                for (int size = wkListenerAnimations.size() - 1; size >= 0; size--) {
                    BmTrackAnimation bmTrackAnimation2 = wkListenerAnimations.get(size).get();
                    if (bmTrackAnimation2 == null) {
                        wkListenerAnimations.remove(size);
                    } else if (bmTrackAnimation2 == bmTrackAnimation) {
                        wkListenerAnimations.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setSdkTrack(BmDrawItem bmDrawItem) {
        if (bmDrawItem == null || bmDrawItem.getObjType() == 25) {
            return nativeSetSdkTrack(this.nativeInstance, bmDrawItem == null ? 0L : bmDrawItem.getNativeInstance());
        }
        return false;
    }

    public void setTrackAnimationUpdateListener(TrackAnimationUpdateListener trackAnimationUpdateListener) {
        this.trackAnimationUpdateListener = trackAnimationUpdateListener;
    }

    public boolean setTrackLine(BmDrawItem bmDrawItem) {
        int objType;
        if (bmDrawItem == null || (objType = bmDrawItem.getObjType()) == 8 || objType == 9 || objType == 10) {
            return nativeSetTrackLine(this.nativeInstance, bmDrawItem == null ? 0L : bmDrawItem.getNativeInstance());
        }
        return false;
    }

    public boolean setTrackPath(BmGeoElement bmGeoElement) {
        return nativeSetTrackPath(this.nativeInstance, bmGeoElement == null ? 0L : bmGeoElement.getNativeInstance());
    }

    public boolean setTrackPos(b bVar, b bVar2) {
        this.mFromPt = bVar;
        this.mToPt = bVar2;
        this.mFromRadio = -1.0f;
        this.mToRadio = -1.0f;
        return nativeSetTrackPos(this.nativeInstance, bVar.f8938a, bVar.f8939b, bVar2.f8938a, bVar2.f8939b);
    }

    public boolean setTrackPosRadio(float f8, float f9) {
        this.mFromRadio = f8;
        this.mToRadio = f9;
        this.mFromPt = null;
        this.mToPt = null;
        return nativeSetTrackPosRadio(this.nativeInstance, f8, f9);
    }

    public boolean setTrackUpdateListener(a aVar) {
        this.mTrackListener = aVar;
        if (aVar != null) {
            addAnimation(this);
        } else {
            removeAnimation(this);
        }
        return nativeSetTrackUpdateListener(this.nativeInstance, aVar != null);
    }

    public boolean setTrackPos(b bVar) {
        this.mToPt = bVar;
        this.mFromRadio = -1.0f;
        this.mToRadio = -1.0f;
        return nativeSetTrackEndPos(this.nativeInstance, bVar.f8938a, bVar.f8939b);
    }

    public boolean setTrackPosRadio(float f8) {
        this.mToRadio = f8;
        this.mFromPt = null;
        this.mToPt = null;
        return nativeSetTrackEndRadio(this.nativeInstance, f8);
    }
}
