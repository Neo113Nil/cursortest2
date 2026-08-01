package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import java.lang.reflect.Field;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0025a Companion = new C0025a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private w3.c mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends w3.b {
        private int lastYPos;

        public c() {
        }

        public int clampViewPositionHorizontal(View view, int i3, int i10) {
            view.getClass();
            b bVar = a.this.params;
            bVar.getClass();
            return bVar.getMaxXPos();
        }

        public int clampViewPositionVertical(View view, int i3, int i10) {
            view.getClass();
            b bVar = a.this.params;
            bVar.getClass();
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                bVar2.getClass();
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i3;
            b bVar3 = a.this.params;
            bVar3.getClass();
            int dragDirection = bVar3.getDragDirection();
            a aVar = a.this;
            if (dragDirection == 1) {
                b bVar4 = aVar.params;
                bVar4.getClass();
                if (i3 >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    bVar5.getClass();
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                bVar6.getClass();
                if (i3 < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    bVar7.getClass();
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = aVar.params;
                bVar8.getClass();
                if (i3 <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    bVar9.getClass();
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                bVar10.getClass();
                if (i3 > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    bVar11.getClass();
                    return bVar11.getMaxYPos();
                }
            }
            return i3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
        
            if (r6 < r5.getDismissingYVelocity()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        
            if (r6 > r5.getDismissingYVelocity()) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View view, float f3, float f10) {
            view.getClass();
            b bVar = a.this.params;
            bVar.getClass();
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                bVar2.getClass();
                int dragDirection = bVar2.getDragDirection();
                int i3 = this.lastYPos;
                a aVar = a.this;
                if (dragDirection == 1) {
                    b bVar3 = aVar.params;
                    bVar3.getClass();
                    if (i3 <= bVar3.getDismissingYPos()) {
                        a.this.params.getClass();
                    }
                    b bVar4 = a.this.params;
                    bVar4.getClass();
                    maxYPos = bVar4.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                        bVar5.getClass();
                        bVar5.onDismiss();
                    }
                } else {
                    b bVar6 = aVar.params;
                    bVar6.getClass();
                    if (i3 >= bVar6.getDismissingYPos()) {
                        a.this.params.getClass();
                    }
                    b bVar7 = a.this.params;
                    bVar7.getClass();
                    maxYPos = bVar7.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                        bVar8.getClass();
                        bVar8.onDismiss();
                    }
                }
            }
            w3.c cVar = a.this.mDragHelper;
            cVar.getClass();
            b bVar9 = a.this.params;
            bVar9.getClass();
            int maxXPos = bVar9.getMaxXPos();
            if (!cVar.f10077s) {
                i0.l("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            } else if (cVar.d(maxXPos, maxYPos, (int) cVar.f10070l.getXVelocity(cVar.f10063c), (int) cVar.f10070l.getYVelocity(cVar.f10063c))) {
                a aVar2 = a.this;
                Field field = c0.f7378a;
                aVar2.postInvalidateOnAnimation();
            }
        }

        public boolean tryCaptureView(View view, int i3) {
            view.getClass();
            return true;
        }
    }

    static {
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        MARGIN_PX_SIZE = mVar.dpToPx(28);
        EXTRA_PX_DISMISS = mVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        w3.c cVar = new w3.c(getContext(), this, new c());
        cVar.f10062b = (int) (1.0f * cVar.f10062b);
        this.mDragHelper = cVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        w3.c cVar = this.mDragHelper;
        cVar.getClass();
        OverScroller overScroller = cVar.f10074p;
        if (cVar.f10061a == 2) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - cVar.f10076r.getLeft();
            int top = currY - cVar.f10076r.getTop();
            if (left != 0) {
                View view = cVar.f10076r;
                Field field = c0.f7378a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = cVar.f10076r;
                Field field2 = c0.f7378a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.f10075q.onViewPositionChanged(cVar.f10076r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                cVar.f10078t.post(cVar.f10079u);
            }
        }
        if (cVar.f10061a == 2) {
            Field field3 = c0.f7378a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        w3.c cVar = this.mDragHelper;
        cVar.getClass();
        int left = getLeft();
        b bVar = this.params;
        bVar.getClass();
        int offScreenYPos = bVar.getOffScreenYPos();
        cVar.f10076r = this;
        cVar.f10063c = -1;
        if (!cVar.d(left, offScreenYPos, 0, 0) && cVar.f10061a == 0 && cVar.f10076r != null) {
            cVar.f10076r = null;
        }
        Field field = c0.f7378a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x021b, code lost:
    
        if (r10 > (r7 * r7)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021d, code lost:
    
        r7 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.onesignal.inAppMessages.internal.display.impl.b bVar;
        boolean z10;
        int i3;
        motionEvent.getClass();
        if (this.dismissing) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            bVar.onDragEnd();
        }
        w3.c cVar = this.mDragHelper;
        cVar.getClass();
        c cVar2 = cVar.f10075q;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cVar.a();
        }
        if (cVar.f10070l == null) {
            cVar.f10070l = VelocityTracker.obtain();
        }
        cVar.f10070l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View c10 = cVar.c((int) x10, (int) y3);
            cVar.g(x10, y3, pointerId);
            cVar.j(c10, pointerId);
            int i10 = cVar.f10067h[pointerId];
            return false;
        }
        if (actionMasked == 1) {
            if (cVar.f10061a == 1) {
                cVar.f();
            }
            cVar.a();
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (cVar.f10061a == 1) {
                    cVar.f10077s = true;
                    cVar2.onViewReleased(cVar.f10076r, 0.0f, 0.0f);
                    cVar.f10077s = false;
                    if (cVar.f10061a == 1) {
                        cVar.i(0);
                    }
                }
                cVar.a();
                return false;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                cVar.g(x11, y10, pointerId2);
                if (cVar.f10061a == 0) {
                    cVar.j(cVar.c((int) x11, (int) y10), pointerId2);
                    int i11 = cVar.f10067h[pointerId2];
                    return false;
                }
                int i12 = (int) x11;
                int i13 = (int) y10;
                View view = cVar.f10076r;
                if (view != null && i12 >= view.getLeft() && i12 < view.getRight() && i13 >= view.getTop() && i13 < view.getBottom()) {
                    cVar.j(cVar.f10076r, pointerId2);
                    return false;
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (cVar.f10061a == 1 && pointerId3 == cVar.f10063c) {
                    int pointerCount = motionEvent.getPointerCount();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= pointerCount) {
                            i3 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i14);
                        if (pointerId4 != cVar.f10063c) {
                            View c11 = cVar.c((int) motionEvent.getX(i14), (int) motionEvent.getY(i14));
                            View view2 = cVar.f10076r;
                            if (c11 == view2 && cVar.j(view2, pointerId4)) {
                                i3 = cVar.f10063c;
                                break;
                            }
                        }
                        i14++;
                    }
                    if (i3 == -1) {
                        cVar.f();
                    }
                }
                float[] fArr = cVar.f10064d;
                if (fArr != null) {
                    int i15 = cVar.f10069k;
                    int i16 = 1 << pointerId3;
                    if ((i15 & i16) != 0) {
                        fArr[pointerId3] = 0.0f;
                        cVar.f10065e[pointerId3] = 0.0f;
                        cVar.f10066f[pointerId3] = 0.0f;
                        cVar.g[pointerId3] = 0.0f;
                        cVar.f10067h[pointerId3] = 0;
                        cVar.f10068i[pointerId3] = 0;
                        cVar.j[pointerId3] = 0;
                        cVar.f10069k = (~i16) & i15;
                        return false;
                    }
                }
            }
        } else {
            if (cVar.f10061a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i17 = 0; i17 < pointerCount2; i17++) {
                    int pointerId5 = motionEvent.getPointerId(i17);
                    if (cVar.e(pointerId5)) {
                        float x12 = motionEvent.getX(i17);
                        float y11 = motionEvent.getY(i17);
                        float f3 = x12 - cVar.f10064d[pointerId5];
                        float f10 = y11 - cVar.f10065e[pointerId5];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i18 = cVar.f10067h[pointerId5];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i19 = cVar.f10067h[pointerId5];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i20 = cVar.f10067h[pointerId5];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i21 = cVar.f10067h[pointerId5];
                        if (cVar.f10061a == 1) {
                            break;
                        }
                        View c12 = cVar.c((int) x12, (int) y11);
                        if (c12 != null) {
                            boolean z11 = cVar2.getViewHorizontalDragRange(c12) > 0;
                            boolean z12 = cVar2.getViewVerticalDragRange(c12) > 0;
                            if (z11 && z12) {
                                float f11 = (f10 * f10) + (f3 * f3);
                                int i22 = cVar.f10062b;
                            } else if (!z11) {
                            }
                            if (z10 && cVar.j(c12, pointerId5)) {
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                cVar.h(motionEvent);
                return false;
            }
            if (cVar.e(cVar.f10063c)) {
                int findPointerIndex = motionEvent.findPointerIndex(cVar.f10063c);
                float x13 = motionEvent.getX(findPointerIndex);
                float y12 = motionEvent.getY(findPointerIndex);
                float[] fArr2 = cVar.f10066f;
                int i23 = cVar.f10063c;
                int i24 = (int) (x13 - fArr2[i23]);
                int i25 = (int) (y12 - cVar.g[i23]);
                int left = cVar.f10076r.getLeft() + i24;
                int top = cVar.f10076r.getTop() + i25;
                int left2 = cVar.f10076r.getLeft();
                int top2 = cVar.f10076r.getTop();
                if (i24 != 0) {
                    left = cVar2.clampViewPositionHorizontal(cVar.f10076r, left, i24);
                    Field field = c0.f7378a;
                    cVar.f10076r.offsetLeftAndRight(left - left2);
                }
                if (i25 != 0) {
                    top = cVar2.clampViewPositionVertical(cVar.f10076r, top, i25);
                    Field field2 = c0.f7378a;
                    cVar.f10076r.offsetTopAndBottom(top - top2);
                }
                if (i24 != 0 || i25 != 0) {
                    cVar2.onViewPositionChanged(cVar.f10076r, left, top, left - left2, top - top2);
                }
                cVar.h(motionEvent);
                return false;
            }
        }
        return false;
    }

    public final void setListener(com.onesignal.inAppMessages.internal.display.impl.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b bVar) {
        bVar.getClass();
        this.params = bVar;
        bVar.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.getMessageHeight()) - bVar.getPosY()) + bVar.getPosY() + bVar.getMessageHeight() + EXTRA_PX_DISMISS);
        bVar.setDismissingYVelocity(com.onesignal.common.m.INSTANCE.dpToPx(3000));
        if (bVar.getDragDirection() != 0) {
            bVar.setDismissingYPos((bVar.getMaxYPos() * 2) + (bVar.getMessageHeight() / 3));
        } else {
            bVar.setOffScreenYPos((-bVar.getMessageHeight()) - MARGIN_PX_SIZE);
            bVar.setDismissingYVelocity(-bVar.getDismissingYVelocity());
            bVar.setDismissingYPos(bVar.getOffScreenYPos() / 3);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b {
        public static final C0026a Companion = new C0026a(null);
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

        public final void setDismissingYPos(int i3) {
            this.dismissingYPos = i3;
        }

        public final void setDismissingYVelocity(int i3) {
            this.dismissingYVelocity = i3;
        }

        public final void setDragDirection(int i3) {
            this.dragDirection = i3;
        }

        public final void setDragThresholdY(int i3) {
            this.dragThresholdY = i3;
        }

        public final void setDraggingDisabled(boolean z10) {
            this.draggingDisabled = z10;
        }

        public final void setHeight(int i3) {
            this.height = i3;
        }

        public final void setMaxXPos(int i3) {
            this.maxXPos = i3;
        }

        public final void setMaxYPos(int i3) {
            this.maxYPos = i3;
        }

        public final void setMessageHeight(int i3) {
            this.messageHeight = i3;
        }

        public final void setOffScreenYPos(int i3) {
            this.offScreenYPos = i3;
        }

        public final void setPosY(int i3) {
            this.posY = i3;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0026a {
            public /* synthetic */ C0026a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0026a() {
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0025a {
        public /* synthetic */ C0025a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0025a() {
        }
    }
}
