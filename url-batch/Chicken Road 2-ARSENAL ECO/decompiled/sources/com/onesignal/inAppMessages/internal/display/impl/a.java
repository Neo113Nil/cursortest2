package com.onesignal.inAppMessages.internal.display.impl;

import D.D;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0032a Companion = new C0032a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private L.c mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(kotlin.jvm.internal.e eVar) {
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
            public /* synthetic */ C0033a(kotlin.jvm.internal.e eVar) {
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

        public final void setDismissingYPos(int i7) {
            this.dismissingYPos = i7;
        }

        public final void setDismissingYVelocity(int i7) {
            this.dismissingYVelocity = i7;
        }

        public final void setDragDirection(int i7) {
            this.dragDirection = i7;
        }

        public final void setDragThresholdY(int i7) {
            this.dragThresholdY = i7;
        }

        public final void setDraggingDisabled(boolean z5) {
            this.draggingDisabled = z5;
        }

        public final void setHeight(int i7) {
            this.height = i7;
        }

        public final void setMaxXPos(int i7) {
            this.maxXPos = i7;
        }

        public final void setMaxYPos(int i7) {
            this.maxYPos = i7;
        }

        public final void setMessageHeight(int i7) {
            this.messageHeight = i7;
        }

        public final void setOffScreenYPos(int i7) {
            this.offScreenYPos = i7;
        }

        public final void setPosY(int i7) {
            this.posY = i7;
        }
    }

    public static final class c extends L.b {
        private int lastYPos;

        public c() {
        }

        public int clampViewPositionHorizontal(View child, int i7, int i8) {
            kotlin.jvm.internal.i.e(child, "child");
            b bVar = a.this.params;
            kotlin.jvm.internal.i.b(bVar);
            return bVar.getMaxXPos();
        }

        public int clampViewPositionVertical(View child, int i7, int i8) {
            kotlin.jvm.internal.i.e(child, "child");
            b bVar = a.this.params;
            kotlin.jvm.internal.i.b(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                kotlin.jvm.internal.i.b(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i7;
            b bVar3 = a.this.params;
            kotlin.jvm.internal.i.b(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                kotlin.jvm.internal.i.b(bVar4);
                if (i7 >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    kotlin.jvm.internal.i.b(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                kotlin.jvm.internal.i.b(bVar6);
                if (i7 < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                kotlin.jvm.internal.i.b(bVar8);
                if (i7 <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    kotlin.jvm.internal.i.b(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                kotlin.jvm.internal.i.b(bVar10);
                if (i7 > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i7;
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
            kotlin.jvm.internal.i.e(releasedChild, "releasedChild");
            b bVar = a.this.params;
            kotlin.jvm.internal.i.b(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                kotlin.jvm.internal.i.b(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i7 = this.lastYPos;
                    b bVar3 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar3);
                    if (i7 <= bVar3.getDismissingYPos()) {
                        kotlin.jvm.internal.i.b(a.this.params);
                    }
                    b bVar4 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar4);
                    maxYPos = bVar4.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                        kotlin.jvm.internal.i.b(bVar5);
                        bVar5.onDismiss();
                    }
                } else {
                    int i8 = this.lastYPos;
                    b bVar6 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar6);
                    if (i8 >= bVar6.getDismissingYPos()) {
                        kotlin.jvm.internal.i.b(a.this.params);
                    }
                    b bVar7 = a.this.params;
                    kotlin.jvm.internal.i.b(bVar7);
                    maxYPos = bVar7.getOffScreenYPos();
                    a.this.dismissing = true;
                    if (a.this.mListener != null) {
                        com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                        kotlin.jvm.internal.i.b(bVar8);
                        bVar8.onDismiss();
                    }
                }
            }
            L.c cVar = a.this.mDragHelper;
            kotlin.jvm.internal.i.b(cVar);
            b bVar9 = a.this.params;
            kotlin.jvm.internal.i.b(bVar9);
            int maxXPos = bVar9.getMaxXPos();
            if (!cVar.f1435s) {
                throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
            }
            if (cVar.d(maxXPos, maxYPos, (int) cVar.f1428l.getXVelocity(cVar.f1419c), (int) cVar.f1428l.getYVelocity(cVar.f1419c))) {
                a aVar = a.this;
                Field field = D.f240a;
                aVar.postInvalidateOnAnimation();
            }
        }

        public boolean tryCaptureView(View child, int i7) {
            kotlin.jvm.internal.i.e(child, "child");
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
        L.c cVar = new L.c(getContext(), this, new c());
        cVar.f1418b = (int) (1.0f * cVar.f1418b);
        this.mDragHelper = cVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        L.c cVar = this.mDragHelper;
        kotlin.jvm.internal.i.b(cVar);
        OverScroller overScroller = cVar.f1432p;
        if (cVar.f1417a == 2) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - cVar.f1434r.getLeft();
            int top = currY - cVar.f1434r.getTop();
            if (left != 0) {
                View view = cVar.f1434r;
                Field field = D.f240a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = cVar.f1434r;
                Field field2 = D.f240a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.f1433q.onViewPositionChanged(cVar.f1434r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                cVar.f1436t.post(cVar.f1437u);
            }
        }
        if (cVar.f1417a == 2) {
            Field field3 = D.f240a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        L.c cVar = this.mDragHelper;
        kotlin.jvm.internal.i.b(cVar);
        int left = getLeft();
        b bVar = this.params;
        kotlin.jvm.internal.i.b(bVar);
        int offScreenYPos = bVar.getOffScreenYPos();
        cVar.f1434r = this;
        cVar.f1419c = -1;
        if (!cVar.d(left, offScreenYPos, 0, 0) && cVar.f1417a == 0 && cVar.f1434r != null) {
            cVar.f1434r = null;
        }
        Field field = D.f240a;
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
        boolean z5;
        int i7;
        kotlin.jvm.internal.i.e(event, "event");
        if (this.dismissing) {
            return true;
        }
        int action = event.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            bVar.onDragEnd();
        }
        L.c cVar = this.mDragHelper;
        kotlin.jvm.internal.i.b(cVar);
        c cVar2 = cVar.f1433q;
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            cVar.a();
        }
        if (cVar.f1428l == null) {
            cVar.f1428l = VelocityTracker.obtain();
        }
        cVar.f1428l.addMovement(event);
        if (actionMasked == 0) {
            float x6 = event.getX();
            float y = event.getY();
            int pointerId = event.getPointerId(0);
            View c7 = cVar.c((int) x6, (int) y);
            cVar.g(x6, y, pointerId);
            cVar.j(c7, pointerId);
            int i8 = cVar.f1424h[pointerId];
            return false;
        }
        if (actionMasked == 1) {
            if (cVar.f1417a == 1) {
                cVar.f();
            }
            cVar.a();
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (cVar.f1417a == 1) {
                    cVar.f1435s = true;
                    cVar2.onViewReleased(cVar.f1434r, 0.0f, 0.0f);
                    cVar.f1435s = false;
                    if (cVar.f1417a == 1) {
                        cVar.i(0);
                    }
                }
                cVar.a();
                return false;
            }
            if (actionMasked == 5) {
                int pointerId2 = event.getPointerId(actionIndex);
                float x7 = event.getX(actionIndex);
                float y6 = event.getY(actionIndex);
                cVar.g(x7, y6, pointerId2);
                if (cVar.f1417a == 0) {
                    cVar.j(cVar.c((int) x7, (int) y6), pointerId2);
                    int i9 = cVar.f1424h[pointerId2];
                    return false;
                }
                int i10 = (int) x7;
                int i11 = (int) y6;
                View view = cVar.f1434r;
                if (view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom()) {
                    cVar.j(cVar.f1434r, pointerId2);
                    return false;
                }
            } else if (actionMasked == 6) {
                int pointerId3 = event.getPointerId(actionIndex);
                if (cVar.f1417a == 1 && pointerId3 == cVar.f1419c) {
                    int pointerCount = event.getPointerCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= pointerCount) {
                            i7 = -1;
                            break;
                        }
                        int pointerId4 = event.getPointerId(i12);
                        if (pointerId4 != cVar.f1419c) {
                            View c8 = cVar.c((int) event.getX(i12), (int) event.getY(i12));
                            View view2 = cVar.f1434r;
                            if (c8 == view2 && cVar.j(view2, pointerId4)) {
                                i7 = cVar.f1419c;
                                break;
                            }
                        }
                        i12++;
                    }
                    if (i7 == -1) {
                        cVar.f();
                    }
                }
                float[] fArr = cVar.f1420d;
                if (fArr != null) {
                    int i13 = cVar.f1427k;
                    int i14 = 1 << pointerId3;
                    if ((i13 & i14) != 0) {
                        fArr[pointerId3] = 0.0f;
                        cVar.f1421e[pointerId3] = 0.0f;
                        cVar.f1422f[pointerId3] = 0.0f;
                        cVar.f1423g[pointerId3] = 0.0f;
                        cVar.f1424h[pointerId3] = 0;
                        cVar.f1425i[pointerId3] = 0;
                        cVar.f1426j[pointerId3] = 0;
                        cVar.f1427k = (~i14) & i13;
                        return false;
                    }
                }
            }
        } else {
            if (cVar.f1417a != 1) {
                int pointerCount2 = event.getPointerCount();
                for (int i15 = 0; i15 < pointerCount2; i15++) {
                    int pointerId5 = event.getPointerId(i15);
                    if (cVar.e(pointerId5)) {
                        float x8 = event.getX(i15);
                        float y7 = event.getY(i15);
                        float f7 = x8 - cVar.f1420d[pointerId5];
                        float f8 = y7 - cVar.f1421e[pointerId5];
                        Math.abs(f7);
                        Math.abs(f8);
                        int i16 = cVar.f1424h[pointerId5];
                        Math.abs(f8);
                        Math.abs(f7);
                        int i17 = cVar.f1424h[pointerId5];
                        Math.abs(f7);
                        Math.abs(f8);
                        int i18 = cVar.f1424h[pointerId5];
                        Math.abs(f8);
                        Math.abs(f7);
                        int i19 = cVar.f1424h[pointerId5];
                        if (cVar.f1417a == 1) {
                            break;
                        }
                        View c9 = cVar.c((int) x8, (int) y7);
                        if (c9 != null) {
                            boolean z6 = cVar2.getViewHorizontalDragRange(c9) > 0;
                            boolean z7 = cVar2.getViewVerticalDragRange(c9) > 0;
                            if (z6 && z7) {
                                float f9 = (f8 * f8) + (f7 * f7);
                                int i20 = cVar.f1418b;
                            } else if (!z6) {
                            }
                            if (z5 && cVar.j(c9, pointerId5)) {
                                break;
                            }
                        }
                        z5 = false;
                        if (z5) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                cVar.h(event);
                return false;
            }
            if (cVar.e(cVar.f1419c)) {
                int findPointerIndex = event.findPointerIndex(cVar.f1419c);
                float x9 = event.getX(findPointerIndex);
                float y8 = event.getY(findPointerIndex);
                float[] fArr2 = cVar.f1422f;
                int i21 = cVar.f1419c;
                int i22 = (int) (x9 - fArr2[i21]);
                int i23 = (int) (y8 - cVar.f1423g[i21]);
                int left = cVar.f1434r.getLeft() + i22;
                int top = cVar.f1434r.getTop() + i23;
                int left2 = cVar.f1434r.getLeft();
                int top2 = cVar.f1434r.getTop();
                if (i22 != 0) {
                    left = cVar2.clampViewPositionHorizontal(cVar.f1434r, left, i22);
                    Field field = D.f240a;
                    cVar.f1434r.offsetLeftAndRight(left - left2);
                }
                if (i23 != 0) {
                    top = cVar2.clampViewPositionVertical(cVar.f1434r, top, i23);
                    Field field2 = D.f240a;
                    cVar.f1434r.offsetTopAndBottom(top - top2);
                }
                if (i22 != 0 || i23 != 0) {
                    cVar2.onViewPositionChanged(cVar.f1434r, left, top, left - left2, top - top2);
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
        kotlin.jvm.internal.i.e(params, "params");
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
