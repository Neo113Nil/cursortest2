package com.onesignal.inAppMessages.internal.display.impl;

import E.G;
import L.c;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import com.onesignal.common.ViewUtils;
import java.lang.reflect.Field;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DraggableRelativeLayout extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private c mDragHelper;
    private DraggableListener mListener;
    private Params params;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface DraggableListener {
        void onDismiss();

        void onDragEnd();

        void onDragStart();
    }

    public static final class Params {
        public static final Companion Companion = new Companion(null);
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        public static final class Companion {
            public /* synthetic */ Companion(e eVar) {
                this();
            }

            private Companion() {
            }
        }

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i2) {
            this.dismissingYPos = i2;
        }

        public final void setDismissingYVelocity(int i2) {
            this.dismissingYVelocity = i2;
        }

        public final void setDragDirection(int i2) {
            this.dragDirection = i2;
        }

        public final void setDragThresholdY(int i2) {
            this.dragThresholdY = i2;
        }

        public final void setDraggingDisabled(boolean z) {
            this.draggingDisabled = z;
        }

        public final void setHeight(int i2) {
            this.height = i2;
        }

        public final void setMaxXPos(int i2) {
            this.maxXPos = i2;
        }

        public final void setMaxYPos(int i2) {
            this.maxYPos = i2;
        }

        public final void setMessageHeight(int i2) {
            this.messageHeight = i2;
        }

        public final void setOffScreenYPos(int i2) {
            this.offScreenYPos = i2;
        }

        public final void setPosY(int i2) {
            this.posY = i2;
        }
    }

    static {
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        MARGIN_PX_SIZE = viewUtils.dpToPx(28);
        EXTRA_PX_DISMISS = viewUtils.dpToPx(64);
    }

    public DraggableRelativeLayout(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        c cVar = new c(getContext(), this, new DraggableRelativeLayout$createDragHelper$1(this));
        cVar.f1462b = (int) (1.0f * cVar.f1462b);
        this.mDragHelper = cVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        c cVar = this.mDragHelper;
        i.b(cVar);
        if (cVar.f1461a == 2) {
            OverScroller overScroller = cVar.f1476p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - cVar.f1478r.getLeft();
            int top = currY - cVar.f1478r.getTop();
            if (left != 0) {
                View view = cVar.f1478r;
                Field field = G.f566a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = cVar.f1478r;
                Field field2 = G.f566a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.f1477q.onViewPositionChanged(cVar.f1478r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                cVar.f1480t.post(cVar.f1481u);
            }
        }
        if (cVar.f1461a == 2) {
            Field field3 = G.f566a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        c cVar = this.mDragHelper;
        i.b(cVar);
        int left = getLeft();
        Params params = this.params;
        i.b(params);
        int offScreenYPos = params.getOffScreenYPos();
        cVar.f1478r = this;
        cVar.f1463c = -1;
        if (!cVar.d(left, offScreenYPos, 0, 0) && cVar.f1461a == 0 && cVar.f1478r != null) {
            cVar.f1478r = null;
        }
        Field field = G.f566a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0221, code lost:
    
        if (r10 > (r8 * r8)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0223, code lost:
    
        r8 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent event) {
        DraggableListener draggableListener;
        boolean z;
        int i2;
        int i3;
        i.e(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (draggableListener = this.mListener) != null) {
            draggableListener.onDragEnd();
        }
        c cVar = this.mDragHelper;
        i.b(cVar);
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            cVar.a();
        }
        if (cVar.f1472l == null) {
            cVar.f1472l = VelocityTracker.obtain();
        }
        cVar.f1472l.addMovement(event);
        if (actionMasked == 0) {
            float x5 = event.getX();
            float y5 = event.getY();
            int pointerId = event.getPointerId(0);
            View c2 = cVar.c((int) x5, (int) y5);
            cVar.g(x5, y5, pointerId);
            cVar.j(c2, pointerId);
            int i6 = cVar.f1468h[pointerId];
        } else if (actionMasked != 1) {
            DraggableRelativeLayout$createDragHelper$1 draggableRelativeLayout$createDragHelper$1 = cVar.f1477q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (cVar.f1461a == 1) {
                        cVar.f1479s = true;
                        draggableRelativeLayout$createDragHelper$1.onViewReleased(cVar.f1478r, 0.0f, 0.0f);
                        cVar.f1479s = false;
                        if (cVar.f1461a == 1) {
                            cVar.i(0);
                        }
                    }
                    cVar.a();
                } else if (actionMasked == 5) {
                    int pointerId2 = event.getPointerId(actionIndex);
                    float x6 = event.getX(actionIndex);
                    float y6 = event.getY(actionIndex);
                    cVar.g(x6, y6, pointerId2);
                    if (cVar.f1461a == 0) {
                        cVar.j(cVar.c((int) x6, (int) y6), pointerId2);
                        int i7 = cVar.f1468h[pointerId2];
                    } else {
                        int i8 = (int) x6;
                        int i9 = (int) y6;
                        View view = cVar.f1478r;
                        if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                            cVar.j(cVar.f1478r, pointerId2);
                        }
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = event.getPointerId(actionIndex);
                    if (cVar.f1461a == 1 && pointerId3 == cVar.f1463c) {
                        int pointerCount = event.getPointerCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= pointerCount) {
                                i3 = -1;
                                break;
                            }
                            int pointerId4 = event.getPointerId(i10);
                            if (pointerId4 != cVar.f1463c) {
                                View c6 = cVar.c((int) event.getX(i10), (int) event.getY(i10));
                                View view2 = cVar.f1478r;
                                if (c6 == view2 && cVar.j(view2, pointerId4)) {
                                    i3 = cVar.f1463c;
                                    break;
                                }
                            }
                            i10++;
                        }
                        if (i3 == -1) {
                            cVar.f();
                        }
                    }
                    float[] fArr = cVar.f1464d;
                    if (fArr != null) {
                        int i11 = cVar.f1471k;
                        int i12 = 1 << pointerId3;
                        if ((i11 & i12) != 0) {
                            fArr[pointerId3] = 0.0f;
                            cVar.f1465e[pointerId3] = 0.0f;
                            cVar.f1466f[pointerId3] = 0.0f;
                            cVar.f1467g[pointerId3] = 0.0f;
                            cVar.f1468h[pointerId3] = 0;
                            cVar.f1469i[pointerId3] = 0;
                            cVar.f1470j[pointerId3] = 0;
                            cVar.f1471k = (~i12) & i11;
                        }
                    }
                }
            } else if (cVar.f1461a != 1) {
                int pointerCount2 = event.getPointerCount();
                for (int i13 = 0; i13 < pointerCount2; i13++) {
                    int pointerId5 = event.getPointerId(i13);
                    if (cVar.e(pointerId5)) {
                        float x7 = event.getX(i13);
                        float y7 = event.getY(i13);
                        float f3 = x7 - cVar.f1464d[pointerId5];
                        float f6 = y7 - cVar.f1465e[pointerId5];
                        Math.abs(f3);
                        Math.abs(f6);
                        int i14 = cVar.f1468h[pointerId5];
                        Math.abs(f6);
                        Math.abs(f3);
                        int i15 = cVar.f1468h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f6);
                        int i16 = cVar.f1468h[pointerId5];
                        Math.abs(f6);
                        Math.abs(f3);
                        int i17 = cVar.f1468h[pointerId5];
                        if (cVar.f1461a == 1) {
                            break;
                        }
                        View c7 = cVar.c((int) x7, (int) y7);
                        if (c7 != null) {
                            boolean z5 = draggableRelativeLayout$createDragHelper$1.getViewHorizontalDragRange(c7) > 0;
                            boolean z6 = draggableRelativeLayout$createDragHelper$1.getViewVerticalDragRange(c7) > 0;
                            if (z5 && z6) {
                                float f7 = (f6 * f6) + (f3 * f3);
                                int i18 = cVar.f1462b;
                            } else if (!z5) {
                            }
                            if (z && cVar.j(c7, pointerId5)) {
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                cVar.h(event);
            } else if (cVar.e(cVar.f1463c)) {
                int findPointerIndex = event.findPointerIndex(cVar.f1463c);
                float x8 = event.getX(findPointerIndex);
                float y8 = event.getY(findPointerIndex);
                float[] fArr2 = cVar.f1466f;
                int i19 = cVar.f1463c;
                int i20 = (int) (x8 - fArr2[i19]);
                int i21 = (int) (y8 - cVar.f1467g[i19]);
                int left = cVar.f1478r.getLeft() + i20;
                int top = cVar.f1478r.getTop() + i21;
                int left2 = cVar.f1478r.getLeft();
                int top2 = cVar.f1478r.getTop();
                if (i20 != 0) {
                    left = draggableRelativeLayout$createDragHelper$1.clampViewPositionHorizontal(cVar.f1478r, left, i20);
                    Field field = G.f566a;
                    cVar.f1478r.offsetLeftAndRight(left - left2);
                }
                int i22 = left;
                if (i21 != 0) {
                    int clampViewPositionVertical = draggableRelativeLayout$createDragHelper$1.clampViewPositionVertical(cVar.f1478r, top, i21);
                    Field field2 = G.f566a;
                    cVar.f1478r.offsetTopAndBottom(clampViewPositionVertical - top2);
                    i2 = clampViewPositionVertical;
                } else {
                    i2 = top;
                }
                if (i20 != 0 || i21 != 0) {
                    draggableRelativeLayout$createDragHelper$1.onViewPositionChanged(cVar.f1478r, i22, i2, i22 - left2, i2 - top2);
                }
                cVar.h(event);
            }
        } else {
            if (cVar.f1461a == 1) {
                cVar.f();
            }
            cVar.a();
        }
        return false;
    }

    public final void setListener(DraggableListener draggableListener) {
        this.mListener = draggableListener;
    }

    public final void setParams(Params params) {
        i.e(params, "params");
        this.params = params;
        params.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + params.getPosY() + params.getMessageHeight() + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(ViewUtils.INSTANCE.dpToPx(3000));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMaxYPos() * 2) + (params.getMessageHeight() / 3));
        } else {
            params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
            params.setDismissingYVelocity(-params.getDismissingYVelocity());
            params.setDismissingYPos(params.getOffScreenYPos() / 3);
        }
    }
}
