package com.onesignal.inAppMessages.internal.display.impl;

import I.T;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0032a Companion = new C0032a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private O.c mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0032a() {
        }
    }

    public static final class b {
        public static final C0033a Companion = new C0033a(null);
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

        /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0033a {
            public /* synthetic */ C0033a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0033a() {
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

        public final void setDraggingDisabled(boolean z7) {
            this.draggingDisabled = z7;
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

    public static final class c extends O.b {
        private int lastYPos;

        public c() {
        }

        public int clampViewPositionHorizontal(View child, int i2, int i5) {
            Intrinsics.checkNotNullParameter(child, "child");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            return bVar.getMaxXPos();
        }

        public int clampViewPositionVertical(View child, int i2, int i5) {
            Intrinsics.checkNotNullParameter(child, "child");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                Intrinsics.b(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i2;
            b bVar3 = a.this.params;
            Intrinsics.b(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                Intrinsics.b(bVar4);
                if (i2 >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    Intrinsics.b(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                Intrinsics.b(bVar6);
                if (i2 < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    Intrinsics.b(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                Intrinsics.b(bVar8);
                if (i2 <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    Intrinsics.b(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                Intrinsics.b(bVar10);
                if (i2 > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    Intrinsics.b(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        
            if (r6 < r5.getDismissingYVelocity()) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
        
            if (r6 > r5.getDismissingYVelocity()) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View releasedChild, float f7, float f8) {
            Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
            b bVar = a.this.params;
            Intrinsics.b(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                Intrinsics.b(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i2 = this.lastYPos;
                    b bVar3 = a.this.params;
                    Intrinsics.b(bVar3);
                    if (i2 <= bVar3.getDismissingYPos()) {
                        Intrinsics.b(a.this.params);
                    }
                    b bVar4 = a.this.params;
                    Intrinsics.b(bVar4);
                    maxYPos = bVar4.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                        Intrinsics.b(bVar5);
                        bVar5.onDismiss();
                    }
                } else {
                    int i5 = this.lastYPos;
                    b bVar6 = a.this.params;
                    Intrinsics.b(bVar6);
                    if (i5 >= bVar6.getDismissingYPos()) {
                        Intrinsics.b(a.this.params);
                    }
                    b bVar7 = a.this.params;
                    Intrinsics.b(bVar7);
                    maxYPos = bVar7.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                        Intrinsics.b(bVar8);
                        bVar8.onDismiss();
                    }
                }
            }
            O.c cVar = a.this.mDragHelper;
            Intrinsics.b(cVar);
            b bVar9 = a.this.params;
            Intrinsics.b(bVar9);
            int maxXPos = bVar9.getMaxXPos();
            if (!cVar.f1900s) {
                throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            }
            if (cVar.d(maxXPos, maxYPos, (int) cVar.f1893l.getXVelocity(cVar.f1885c), (int) cVar.f1893l.getYVelocity(cVar.f1885c))) {
                a aVar = a.this;
                WeakHashMap weakHashMap = T.f1153a;
                aVar.postInvalidateOnAnimation();
            }
        }

        public boolean tryCaptureView(View child, int i2) {
            Intrinsics.checkNotNullParameter(child, "child");
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
        O.c cVar = new O.c(getContext(), this, new c());
        cVar.f1884b = (int) (1.0f * cVar.f1884b);
        this.mDragHelper = cVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        O.c cVar = this.mDragHelper;
        Intrinsics.b(cVar);
        OverScroller overScroller = cVar.f1897p;
        if (cVar.f1883a == 2) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - cVar.f1899r.getLeft();
            int top = currY - cVar.f1899r.getTop();
            if (left != 0) {
                View view = cVar.f1899r;
                WeakHashMap weakHashMap = T.f1153a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = cVar.f1899r;
                WeakHashMap weakHashMap2 = T.f1153a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.f1898q.onViewPositionChanged(cVar.f1899r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                cVar.f1901t.post(cVar.f1902u);
            }
        }
        if (cVar.f1883a == 2) {
            WeakHashMap weakHashMap3 = T.f1153a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        O.c cVar = this.mDragHelper;
        Intrinsics.b(cVar);
        int left = getLeft();
        b bVar = this.params;
        Intrinsics.b(bVar);
        int offScreenYPos = bVar.getOffScreenYPos();
        cVar.f1899r = this;
        cVar.f1885c = -1;
        if (!cVar.d(left, offScreenYPos, 0, 0) && cVar.f1883a == 0 && cVar.f1899r != null) {
            cVar.f1899r = null;
        }
        WeakHashMap weakHashMap = T.f1153a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x021d, code lost:
    
        if (r10 > (r7 * r7)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021f, code lost:
    
        r7 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent event) {
        com.onesignal.inAppMessages.internal.display.impl.b bVar;
        boolean z7;
        int i2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            bVar.onDragEnd();
        }
        O.c cVar = this.mDragHelper;
        Intrinsics.b(cVar);
        c cVar2 = cVar.f1898q;
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            cVar.a();
        }
        if (cVar.f1893l == null) {
            cVar.f1893l = VelocityTracker.obtain();
        }
        cVar.f1893l.addMovement(event);
        if (actionMasked == 0) {
            float x7 = event.getX();
            float y7 = event.getY();
            int pointerId = event.getPointerId(0);
            View c7 = cVar.c((int) x7, (int) y7);
            cVar.g(x7, y7, pointerId);
            cVar.j(c7, pointerId);
            int i5 = cVar.f1890h[pointerId];
            return false;
        }
        if (actionMasked == 1) {
            if (cVar.f1883a == 1) {
                cVar.f();
            }
            cVar.a();
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (cVar.f1883a == 1) {
                    cVar.f1900s = true;
                    cVar2.onViewReleased(cVar.f1899r, 0.0f, 0.0f);
                    cVar.f1900s = false;
                    if (cVar.f1883a == 1) {
                        cVar.i(0);
                    }
                }
                cVar.a();
                return false;
            }
            if (actionMasked == 5) {
                int pointerId2 = event.getPointerId(actionIndex);
                float x8 = event.getX(actionIndex);
                float y8 = event.getY(actionIndex);
                cVar.g(x8, y8, pointerId2);
                if (cVar.f1883a == 0) {
                    cVar.j(cVar.c((int) x8, (int) y8), pointerId2);
                    int i7 = cVar.f1890h[pointerId2];
                    return false;
                }
                int i8 = (int) x8;
                int i9 = (int) y8;
                View view = cVar.f1899r;
                if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                    cVar.j(cVar.f1899r, pointerId2);
                    return false;
                }
            } else if (actionMasked == 6) {
                int pointerId3 = event.getPointerId(actionIndex);
                if (cVar.f1883a == 1 && pointerId3 == cVar.f1885c) {
                    int pointerCount = event.getPointerCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = event.getPointerId(i10);
                        if (pointerId4 != cVar.f1885c) {
                            View c8 = cVar.c((int) event.getX(i10), (int) event.getY(i10));
                            View view2 = cVar.f1899r;
                            if (c8 == view2 && cVar.j(view2, pointerId4)) {
                                i2 = cVar.f1885c;
                                break;
                            }
                        }
                        i10++;
                    }
                    if (i2 == -1) {
                        cVar.f();
                    }
                }
                float[] fArr = cVar.f1886d;
                if (fArr != null) {
                    int i11 = cVar.f1892k;
                    int i12 = 1 << pointerId3;
                    if ((i11 & i12) != 0) {
                        fArr[pointerId3] = 0.0f;
                        cVar.f1887e[pointerId3] = 0.0f;
                        cVar.f1888f[pointerId3] = 0.0f;
                        cVar.f1889g[pointerId3] = 0.0f;
                        cVar.f1890h[pointerId3] = 0;
                        cVar.f1891i[pointerId3] = 0;
                        cVar.j[pointerId3] = 0;
                        cVar.f1892k = (~i12) & i11;
                        return false;
                    }
                }
            }
        } else {
            if (cVar.f1883a != 1) {
                int pointerCount2 = event.getPointerCount();
                for (int i13 = 0; i13 < pointerCount2; i13++) {
                    int pointerId5 = event.getPointerId(i13);
                    if (cVar.e(pointerId5)) {
                        float x9 = event.getX(i13);
                        float y9 = event.getY(i13);
                        float f7 = x9 - cVar.f1886d[pointerId5];
                        float f8 = y9 - cVar.f1887e[pointerId5];
                        Math.abs(f7);
                        Math.abs(f8);
                        int i14 = cVar.f1890h[pointerId5];
                        Math.abs(f8);
                        Math.abs(f7);
                        int i15 = cVar.f1890h[pointerId5];
                        Math.abs(f7);
                        Math.abs(f8);
                        int i16 = cVar.f1890h[pointerId5];
                        Math.abs(f8);
                        Math.abs(f7);
                        int i17 = cVar.f1890h[pointerId5];
                        if (cVar.f1883a == 1) {
                            break;
                        }
                        View c9 = cVar.c((int) x9, (int) y9);
                        if (c9 != null) {
                            boolean z8 = cVar2.getViewHorizontalDragRange(c9) > 0;
                            boolean z9 = cVar2.getViewVerticalDragRange(c9) > 0;
                            if (z8 && z9) {
                                float f9 = (f8 * f8) + (f7 * f7);
                                int i18 = cVar.f1884b;
                            } else if (!z8) {
                            }
                            if (z7 && cVar.j(c9, pointerId5)) {
                                break;
                            }
                        }
                        z7 = false;
                        if (z7) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                cVar.h(event);
                return false;
            }
            if (cVar.e(cVar.f1885c)) {
                int findPointerIndex = event.findPointerIndex(cVar.f1885c);
                float x10 = event.getX(findPointerIndex);
                float y10 = event.getY(findPointerIndex);
                float[] fArr2 = cVar.f1888f;
                int i19 = cVar.f1885c;
                int i20 = (int) (x10 - fArr2[i19]);
                int i21 = (int) (y10 - cVar.f1889g[i19]);
                int left = cVar.f1899r.getLeft() + i20;
                int top = cVar.f1899r.getTop() + i21;
                int left2 = cVar.f1899r.getLeft();
                int top2 = cVar.f1899r.getTop();
                if (i20 != 0) {
                    left = cVar2.clampViewPositionHorizontal(cVar.f1899r, left, i20);
                    WeakHashMap weakHashMap = T.f1153a;
                    cVar.f1899r.offsetLeftAndRight(left - left2);
                }
                if (i21 != 0) {
                    top = cVar2.clampViewPositionVertical(cVar.f1899r, top, i21);
                    WeakHashMap weakHashMap2 = T.f1153a;
                    cVar.f1899r.offsetTopAndBottom(top - top2);
                }
                if (i20 != 0 || i21 != 0) {
                    cVar2.onViewPositionChanged(cVar.f1899r, left, top, left - left2, top - top2);
                }
                cVar.h(event);
                return false;
            }
        }
        return false;
    }

    public final void setListener(com.onesignal.inAppMessages.internal.display.impl.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        params.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - params.getMessageHeight()) - params.getPosY()) + params.getPosY() + params.getMessageHeight() + EXTRA_PX_DISMISS);
        params.setDismissingYVelocity(com.onesignal.common.m.INSTANCE.dpToPx(3000));
        if (params.getDragDirection() != 0) {
            params.setDismissingYPos((params.getMaxYPos() * 2) + (params.getMessageHeight() / 3));
        } else {
            params.setOffScreenYPos((-params.getMessageHeight()) - MARGIN_PX_SIZE);
            params.setDismissingYVelocity(-params.getDismissingYVelocity());
            params.setDismissingYPos(params.getOffScreenYPos() / 3);
        }
    }
}
