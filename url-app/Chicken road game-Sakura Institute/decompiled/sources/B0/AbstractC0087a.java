package B0;

import android.adservices.measurement.MeasurementManager;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0087a {
    public static /* bridge */ /* synthetic */ Class A() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder f(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder g(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture h(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture i(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture j(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture k(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof InsertGesture;
    }
}
