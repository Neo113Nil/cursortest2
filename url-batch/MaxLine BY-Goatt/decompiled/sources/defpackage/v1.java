package defpackage;

import android.app.ActivityOptions;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class v1 {
    public static final void a(CursorAnchorInfo.Builder builder, bw2 bw2Var, w72 w72Var) {
        if (w72Var.d()) {
            return;
        }
        float f = w72Var.b;
        sm1 sm1Var = bw2Var.b;
        int c = sm1Var.c(f);
        int c2 = sm1Var.c(w72Var.d);
        if (c > c2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(bw2Var.f(c), sm1Var.d(c), bw2Var.g(c), sm1Var.b(c));
            if (c == c2) {
                return;
            } else {
                c++;
            }
        }
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] f(zv2 zv2Var, RectF rectF, int i, final ia iaVar) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new ke(new tt1(17, zv2Var.f.getText(), zv2Var.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(zv2Var.f.getText(), zv2Var.a);
        }
        return zv2Var.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: z9
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) ia.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int i(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int j(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean l(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final ColorSpace m(iw iwVar) {
        if (Intrinsics.b(iwVar, kw.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.b(iwVar, kw.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void n(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void o(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void p(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void q(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}
