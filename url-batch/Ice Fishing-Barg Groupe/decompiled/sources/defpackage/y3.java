package defpackage;

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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y3 {
    public static /* bridge */ /* synthetic */ Class IAToe7bXGz4N() {
        return DeleteRangeGesture.class;
    }

    public static /* synthetic */ void QrzZRwfaDlRX() {
    }

    public static /* bridge */ /* synthetic */ boolean RfyTYNmI9Srp(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class ZbWwgt3aGe7A() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class aF05bpZJlKEP() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class cpQdD2nAriOS() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ SegmentFinder dgRBjINgWbAK(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ Class e6tOsSdd2EFb() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class jyegZNwi31qc() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class kpCQ9veP6n3I() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean pnx5pC0XzaCw(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder wdg6QnbFHrFF(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ InsertGesture x50lh2ztY7Y5(Object obj) {
        return (InsertGesture) obj;
    }
}
