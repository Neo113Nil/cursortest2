package com.baidu.platform.comapi.map;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.baidu.platform.comapi.map.MapController;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class y extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private MapController f9792a;

    /* renamed from: b, reason: collision with root package name */
    private OnLongPressListener f9793b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Set<GestureDetector.SimpleOnGestureListener> f9794c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    private Object f9795d = new Object();

    OnLongPressListener a() {
        return this.f9793b;
    }

    public void b(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        synchronized (this.f9795d) {
            this.f9794c.remove(simpleOnGestureListener);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onDoubleTap(motionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MapController mapController = this.f9792a;
        if (mapController == null) {
            return true;
        }
        mapController.handleDoubleDownClick(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        MapController mapController;
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onDoubleTapEvent(motionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (motionEvent.getAction() == 1 && (mapController = this.f9792a) != null) {
            mapController.handleDoubleTouch(motionEvent);
        }
        return super.onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onDown(motionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onFling(motionEvent, motionEvent2, f8, f9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MapController mapController = this.f9792a;
        if (mapController == null) {
            return false;
        }
        if (mapController.getMapControlMode() == MapController.MapControlMode.STREET) {
            this.f9792a.handleTouchUp(motionEvent2);
        }
        return this.f9792a.handleFling(motionEvent, motionEvent2, f8, f9);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        OnLongPressListener onLongPressListener;
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    for (GestureDetector.SimpleOnGestureListener simpleOnGestureListener : set) {
                        if (simpleOnGestureListener != null) {
                            simpleOnGestureListener.onLongPress(motionEvent);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MapController mapController = this.f9792a;
        if (mapController == null || mapController.isEnableDMoveZoom() || this.f9792a.isNaviMode() || (onLongPressListener = this.f9793b) == null) {
            return;
        }
        onLongPressListener.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onScroll(motionEvent, motionEvent2, f8, f9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f8, f9);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    for (GestureDetector.SimpleOnGestureListener simpleOnGestureListener : set) {
                        if (simpleOnGestureListener != null) {
                            simpleOnGestureListener.onShowPress(motionEvent);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    for (GestureDetector.SimpleOnGestureListener simpleOnGestureListener : set) {
                        if (simpleOnGestureListener != null) {
                            simpleOnGestureListener.onSingleTapConfirmed(motionEvent);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MapController mapController = this.f9792a;
        return mapController != null && mapController.handleTouchSingleClick(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        synchronized (this.f9795d) {
            try {
                Set<GestureDetector.SimpleOnGestureListener> set = this.f9794c;
                if (set != null) {
                    Iterator<GestureDetector.SimpleOnGestureListener> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().onSingleTapUp(motionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return super.onSingleTapUp(motionEvent);
    }

    public void a(MapController mapController) {
        this.f9792a = mapController;
    }

    void a(OnLongPressListener onLongPressListener) {
        this.f9793b = onLongPressListener;
    }

    public void a(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        synchronized (this.f9795d) {
            this.f9794c.add(simpleOnGestureListener);
        }
    }
}
