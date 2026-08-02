package dev.chrisbanes.haze;

import androidx.collection.MutableScatterSet;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public abstract class PaintKt {
    public static final Pool PaintPool = new Pool(0);

    public static final Paint getOrCreate(Pool pool) {
        pool.getClass();
        MutableScatterSet mutableScatterSet = (MutableScatterSet) pool.pool;
        Object obj = null;
        if (mutableScatterSet.isNotEmpty()) {
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                obj = objArr[(i << 3) + i3];
                                mutableScatterSet.remove(obj);
                                break loop0;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("The ScatterSet is empty");
            return null;
        }
        Paint paint = (Paint) obj;
        return paint == null ? ColorKt.Paint() : paint;
    }
}
