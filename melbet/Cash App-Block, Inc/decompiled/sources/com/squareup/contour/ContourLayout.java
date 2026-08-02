package com.squareup.contour;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.constraints.Constraint;
import com.squareup.contour.constraints.PositionConstraint;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$matchParent$1;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$wrapContent$1;
import com.squareup.contour.errors.CircularReferenceDetected;
import com.squareup.contour.utils.XYIntUtilsKt$unwrapXIntLambda$1;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionPool;
import okhttp3.internal.http2.Huffman;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public class ContourLayout extends ViewGroup {
    public final boolean constructed;
    public final float density;
    public final LaunchTracker geometry;
    public final Huffman.Node heightConfig;
    public int lastHeightSpec;
    public int lastWidthSpec;
    public boolean respectPadding;
    public final Huffman.Node widthConfig;

    public final class LayoutSpec extends ViewGroup.LayoutParams {
        public ConnectionPool dimen;
        public LaunchTracker parent;
        public View view;
        public final ByteArrayProtoReader32 x;
        public final ByteArrayProtoReader32 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutSpec(ByteArrayProtoReader32 byteArrayProtoReader32, ByteArrayProtoReader32 byteArrayProtoReader322) {
            super(-2, -2);
            byteArrayProtoReader32.getClass();
            byteArrayProtoReader322.getClass();
            this.x = byteArrayProtoReader32;
            this.y = byteArrayProtoReader322;
            byteArrayProtoReader32.source = this;
            ((PositionConstraint) byteArrayProtoReader32.nextFieldEncoding).container = this;
            ((PositionConstraint) byteArrayProtoReader32.bufferStack).container = this;
            ((Constraint) byteArrayProtoReader32.protoReader).container = this;
            byteArrayProtoReader322.source = this;
            ((PositionConstraint) byteArrayProtoReader322.nextFieldEncoding).container = this;
            ((PositionConstraint) byteArrayProtoReader322.bufferStack).container = this;
            ((Constraint) byteArrayProtoReader322.protoReader).container = this;
        }

        /* renamed from: baseline-h0YXg9w$contour_release, reason: not valid java name */
        public final int m3821baselineh0YXg9w$contour_release() {
            ByteArrayProtoReader32 byteArrayProtoReader32 = this.y;
            if (byteArrayProtoReader32.recursionDepth == Integer.MIN_VALUE) {
                PositionConstraint positionConstraint = (PositionConstraint) byteArrayProtoReader32.nextFieldEncoding;
                if (positionConstraint.point == 3) {
                    byteArrayProtoReader32.recursionDepth = positionConstraint.resolve();
                } else {
                    if (byteArrayProtoReader32.pushedLimit == Integer.MIN_VALUE) {
                        LayoutSpec layoutSpec = (LayoutSpec) byteArrayProtoReader32.source;
                        if (layoutSpec == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("parent");
                            throw null;
                        }
                        layoutSpec.measureSelf$contour_release();
                    } else {
                        byteArrayProtoReader32.resolveRange();
                    }
                    byteArrayProtoReader32.resolveAxis();
                }
            }
            return byteArrayProtoReader32.recursionDepth;
        }

        public final LaunchTracker getParent() {
            LaunchTracker launchTracker = this.parent;
            if (launchTracker != null) {
                return launchTracker;
            }
            Intrinsics.throwUninitializedPropertyAccessException("parent");
            throw null;
        }

        public final void measureSelf$contour_release() {
            View view = this.view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                throw null;
            }
            int visibility = view.getVisibility();
            ByteArrayProtoReader32 byteArrayProtoReader32 = this.y;
            ByteArrayProtoReader32 byteArrayProtoReader322 = this.x;
            if (visibility == 8) {
                byteArrayProtoReader322.tag = 0;
                byteArrayProtoReader322.pushedLimit = 0;
                byteArrayProtoReader32.tag = 0;
                byteArrayProtoReader32.pushedLimit = 0;
                return;
            }
            ConnectionPool connectionPool = this.dimen;
            if (connectionPool == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dimen");
                throw null;
            }
            ((View) connectionPool.delegate).measure(byteArrayProtoReader322.measureSpec(), byteArrayProtoReader32.measureSpec());
            ConnectionPool connectionPool2 = this.dimen;
            if (connectionPool2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dimen");
                throw null;
            }
            byteArrayProtoReader322.tag = ((View) connectionPool2.delegate).getMeasuredWidth();
            byteArrayProtoReader322.pushedLimit = 0;
            ConnectionPool connectionPool3 = this.dimen;
            if (connectionPool3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dimen");
                throw null;
            }
            int measuredHeight = ((View) connectionPool3.delegate).getMeasuredHeight();
            ConnectionPool connectionPool4 = this.dimen;
            if (connectionPool4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dimen");
                throw null;
            }
            int baseline = ((View) connectionPool4.delegate).getBaseline();
            byteArrayProtoReader32.tag = measuredHeight;
            byteArrayProtoReader32.pushedLimit = baseline;
        }

        /* renamed from: preferredWidth-blrYgr0$contour_release, reason: not valid java name */
        public final int m3822preferredWidthblrYgr0$contour_release() {
            View view = this.view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
                throw null;
            }
            if (view.getVisibility() == 8) {
                return 0;
            }
            ConnectionPool connectionPool = this.dimen;
            if (connectionPool == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dimen");
                throw null;
            }
            ((View) connectionPool.delegate).measure(0, this.y.measureSpec());
            ConnectionPool connectionPool2 = this.dimen;
            if (connectionPool2 != null) {
                return ((View) connectionPool2.delegate).getMeasuredWidth();
            }
            Intrinsics.throwUninitializedPropertyAccessException("dimen");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContourLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.respectPadding = true;
        Resources resources = context.getResources();
        resources.getClass();
        this.density = resources.getDisplayMetrics().density;
        Huffman.Node node = new Huffman.Node(3);
        this.widthConfig = node;
        Huffman.Node node2 = new Huffman.Node(3);
        this.heightConfig = node2;
        this.geometry = new LaunchTracker(node, node2, new ContourLayout$geometry$1(this, 0));
        this.constructed = true;
    }

    public static ByteArrayProtoReader32 bottomTo(Function1 function1) {
        return new ByteArrayProtoReader32(4, new XYIntUtilsKt$unwrapXIntLambda$1(1, function1));
    }

    public static ByteArrayProtoReader32 centerHorizontallyTo(Function1 function1) {
        return new ByteArrayProtoReader32(2, new XYIntUtilsKt$unwrapXIntLambda$1(0, function1));
    }

    public static ByteArrayProtoReader32 centerVerticallyTo(Function1 function1) {
        return new ByteArrayProtoReader32(2, new XYIntUtilsKt$unwrapXIntLambda$1(1, function1));
    }

    public static void layoutBy$default(ContourLayout contourLayout, View view, ByteArrayProtoReader32 byteArrayProtoReader32, ByteArrayProtoReader32 byteArrayProtoReader322) {
        contourLayout.getClass();
        view.getClass();
        LayoutSpec layoutSpec = new LayoutSpec(byteArrayProtoReader32, byteArrayProtoReader322);
        layoutSpec.dimen = new ConnectionPool(view);
        LaunchTracker launchTracker = contourLayout.geometry;
        launchTracker.getClass();
        layoutSpec.parent = launchTracker;
        layoutSpec.view = view;
        view.setLayoutParams(layoutSpec);
        if (view.getParent() == null) {
            super.addView(view);
        }
    }

    public static ByteArrayProtoReader32 leftTo(Function1 function1) {
        return new ByteArrayProtoReader32(1, new XYIntUtilsKt$unwrapXIntLambda$1(0, function1));
    }

    public static ByteArrayProtoReader32 matchParentX(int i, int i2) {
        ByteArrayProtoReader32 leftTo = leftTo(new ContourLayout$matchParentX$1(i, 0));
        leftTo.rightTo(1, new ContourLayout$matchParentX$1(i2, 6));
        return leftTo;
    }

    public static ByteArrayProtoReader32 matchParentY$default(ContourLayout contourLayout) {
        ByteArrayProtoReader32 byteArrayProtoReader32 = topTo(new ContourLayout$emptyX$1(4));
        HasTop$DefaultImpls.bottomTo$default(byteArrayProtoReader32, new ContourLayout$emptyX$1(5));
        return byteArrayProtoReader32;
    }

    public static ByteArrayProtoReader32 rightTo(Function1 function1) {
        return new ByteArrayProtoReader32(4, new XYIntUtilsKt$unwrapXIntLambda$1(0, function1));
    }

    public static ByteArrayProtoReader32 topTo(Function1 function1) {
        return new ByteArrayProtoReader32(1, new XYIntUtilsKt$unwrapXIntLambda$1(1, function1));
    }

    public static void updateLayoutBy$default(ContourLayout contourLayout, View view, ByteArrayProtoReader32 byteArrayProtoReader32, ByteArrayProtoReader32 byteArrayProtoReader322, int i) {
        if ((i & 1) != 0) {
            if (view.getParent() != contourLayout) {
                a$$ExternalSyntheticBUOutline0.m$3("Referencing view outside of ViewGroup.");
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                return;
            }
            byteArrayProtoReader32 = ((LayoutSpec) layoutParams).x;
        }
        if ((i & 2) != 0) {
            if (view.getParent() != contourLayout) {
                a$$ExternalSyntheticBUOutline0.m$3("Referencing view outside of ViewGroup.");
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                return;
            }
            byteArrayProtoReader322 = ((LayoutSpec) layoutParams2).y;
        }
        contourLayout.updateLayoutBy(view, byteArrayProtoReader32, byteArrayProtoReader322);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        view.getClass();
        layoutParams.getClass();
        if (view.getLayoutParams() instanceof LayoutSpec) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        a$$ExternalSyntheticBUOutline0.m("Incorrectly adding view to ContourLayout");
        return false;
    }

    /* renamed from: bottom-dBGyhoQ, reason: not valid java name */
    public final int m3810bottomdBGyhoQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).y.max();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    /* renamed from: centerX-TENr5nQ, reason: not valid java name */
    public final int m3811centerXTENr5nQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).x.mid();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    /* renamed from: centerY-dBGyhoQ, reason: not valid java name */
    public final int m3812centerYdBGyhoQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).y.mid();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    public final void contourHeightOf(Function1 function1) {
        XYIntUtilsKt$unwrapXIntLambda$1 xYIntUtilsKt$unwrapXIntLambda$1 = new XYIntUtilsKt$unwrapXIntLambda$1(2, function1);
        Huffman.Node node = this.heightConfig;
        node.getClass();
        node.children = xYIntUtilsKt$unwrapXIntLambda$1;
    }

    public final void contourHeightWrapContent() {
        SizeConfigSmartLambdas$wrapContent$1 sizeConfigSmartLambdas$wrapContent$1 = new SizeConfigSmartLambdas$wrapContent$1(this, 1, 0);
        Huffman.Node node = this.heightConfig;
        node.getClass();
        node.children = sizeConfigSmartLambdas$wrapContent$1;
    }

    public final void contourWidthMatchParent() {
        Huffman.Node node = this.widthConfig;
        node.getClass();
        node.children = SizeConfigSmartLambdas$matchParent$1.INSTANCE;
    }

    public final void contourWidthOf(Function1 function1) {
        CacheDrawScope$onDrawBehind$1 cacheDrawScope$onDrawBehind$1 = new CacheDrawScope$onDrawBehind$1(3, function1);
        Huffman.Node node = this.widthConfig;
        node.getClass();
        node.children = cacheDrawScope$onDrawBehind$1;
    }

    public final ByteArrayProtoReader32 emptyY() {
        ByteArrayProtoReader32 byteArrayProtoReader32 = topTo(ContourLayout$emptyX$1.INSTANCE$1);
        byteArrayProtoReader32.heightOf(1, new ContourLayout$emptyX$1(this, 3));
        return byteArrayProtoReader32;
    }

    public final int getDip(int i) {
        return (int) (this.density * i);
    }

    /* renamed from: getXdip-TENr5nQ, reason: not valid java name */
    public final int m3813getXdipTENr5nQ(int i) {
        return (int) (this.density * i);
    }

    /* renamed from: getYdip-dBGyhoQ, reason: not valid java name */
    public final int m3814getYdipdBGyhoQ(int i) {
        return (int) (this.density * i);
    }

    /* renamed from: height-dBGyhoQ, reason: not valid java name */
    public final int m3815heightdBGyhoQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
            }
            ByteArrayProtoReader32 byteArrayProtoReader32 = ((LayoutSpec) layoutParams).y;
            if (byteArrayProtoReader32.tag == Integer.MIN_VALUE) {
                byteArrayProtoReader32.resolveRange();
            }
            return byteArrayProtoReader32.tag;
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    public final void invalidateAll() {
        this.widthConfig.terminalBitCount = PKIFailureInfo.systemUnavail;
        this.heightConfig.terminalBitCount = PKIFailureInfo.systemUnavail;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.getClass();
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (!(layoutParams instanceof LayoutSpec)) {
                layoutParams = null;
            }
            LayoutSpec layoutSpec = (LayoutSpec) layoutParams;
            if (layoutSpec != null) {
                ByteArrayProtoReader32 byteArrayProtoReader32 = layoutSpec.x;
                byteArrayProtoReader32.pos = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader32.limit = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader32.recursionDepth = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader32.state = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader32.tag = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader32.pushedLimit = PKIFailureInfo.systemUnavail;
                ((PositionConstraint) byteArrayProtoReader32.nextFieldEncoding).value = PKIFailureInfo.systemUnavail;
                ((PositionConstraint) byteArrayProtoReader32.bufferStack).value = PKIFailureInfo.systemUnavail;
                ((Constraint) byteArrayProtoReader32.protoReader).value = PKIFailureInfo.systemUnavail;
                ByteArrayProtoReader32 byteArrayProtoReader322 = layoutSpec.y;
                byteArrayProtoReader322.pos = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader322.limit = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader322.recursionDepth = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader322.state = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader322.tag = PKIFailureInfo.systemUnavail;
                byteArrayProtoReader322.pushedLimit = PKIFailureInfo.systemUnavail;
                ((PositionConstraint) byteArrayProtoReader322.nextFieldEncoding).value = PKIFailureInfo.systemUnavail;
                ((PositionConstraint) byteArrayProtoReader322.bufferStack).value = PKIFailureInfo.systemUnavail;
                ((Constraint) byteArrayProtoReader322.protoReader).value = PKIFailureInfo.systemUnavail;
            }
        }
    }

    /* renamed from: left-TENr5nQ, reason: not valid java name */
    public final int m3816leftTENr5nQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).x.min();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.getClass();
            if (childAt.getVisibility() != 8) {
                if (childAt.getParent() != this) {
                    a$$ExternalSyntheticBUOutline0.m$3("Referencing view outside of ViewGroup.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                    return;
                }
                LayoutSpec layoutSpec = (LayoutSpec) layoutParams;
                ByteArrayProtoReader32 byteArrayProtoReader32 = layoutSpec.y;
                ByteArrayProtoReader32 byteArrayProtoReader322 = layoutSpec.x;
                layoutSpec.measureSelf$contour_release();
                childAt.layout(byteArrayProtoReader322.min(), byteArrayProtoReader32.min(), byteArrayProtoReader322.max(), byteArrayProtoReader32.max());
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.lastWidthSpec != i || this.lastHeightSpec != i2) {
            invalidateAll();
        }
        int size = View.MeasureSpec.getSize(i);
        Huffman.Node node = this.widthConfig;
        node.symbol = size;
        int size2 = View.MeasureSpec.getSize(i2);
        Huffman.Node node2 = this.heightConfig;
        node2.symbol = size2;
        setMeasuredDimension(node.resolve(), node2.resolve());
        this.lastWidthSpec = i;
        this.lastHeightSpec = i2;
    }

    /* renamed from: preferredWidth-TENr5nQ, reason: not valid java name */
    public final int m3817preferredWidthTENr5nQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).m3822preferredWidthblrYgr0$contour_release();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.constructed) {
            invalidateAll();
        }
        super.requestLayout();
    }

    /* renamed from: right-TENr5nQ, reason: not valid java name */
    public final int m3818rightTENr5nQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).x.max();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    public final void setRespectPadding(boolean z) {
        this.respectPadding = z;
    }

    /* renamed from: top-dBGyhoQ, reason: not valid java name */
    public final int m3819topdBGyhoQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return ((LayoutSpec) layoutParams).y.min();
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    public final void updateLayoutBy(View view, ByteArrayProtoReader32 byteArrayProtoReader32, ByteArrayProtoReader32 byteArrayProtoReader322) {
        view.getClass();
        byteArrayProtoReader32.getClass();
        byteArrayProtoReader322.getClass();
        LayoutSpec layoutSpec = new LayoutSpec(byteArrayProtoReader32, byteArrayProtoReader322);
        layoutSpec.dimen = new ConnectionPool(view);
        LaunchTracker launchTracker = this.geometry;
        launchTracker.getClass();
        layoutSpec.parent = launchTracker;
        layoutSpec.view = view;
        view.setLayoutParams(layoutSpec);
    }

    /* renamed from: width-TENr5nQ, reason: not valid java name */
    public final int m3820widthTENr5nQ(View view) {
        view.getClass();
        try {
            if (view.getParent() != this) {
                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
            }
            ByteArrayProtoReader32 byteArrayProtoReader32 = ((LayoutSpec) layoutParams).x;
            if (byteArrayProtoReader32.tag == Integer.MIN_VALUE) {
                byteArrayProtoReader32.resolveRange();
            }
            return byteArrayProtoReader32.tag;
        } catch (CircularReferenceDetected e) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            stackTrace.getClass();
            e.list.add(new CircularReferenceDetected.TraceElement(view, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
            throw e;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        view.getClass();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        view.getClass();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContourLayout(Context context) {
        this(context, null);
        context.getClass();
    }
}
