package kotlin.comparisons;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class ComparisonsKt__ComparisonsKt {
    public static VideoCapture$$ExternalSyntheticLambda6 compareBy(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new VideoCapture$$ExternalSyntheticLambda6(function1Arr, 12);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return null;
    }

    public static int compareValues(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
