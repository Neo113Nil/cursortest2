package kotlin.collections;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class ArraysKt__ArraysJVMKt {
    public static final void copyOfRangeToIndexCheck(int i, int i2) {
        if (i <= i2) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m(i, i2, "toIndex (", ") is greater than size (", ")."));
    }
}
