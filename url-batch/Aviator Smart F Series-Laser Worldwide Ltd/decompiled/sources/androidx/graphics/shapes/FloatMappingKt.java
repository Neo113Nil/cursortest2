package androidx.graphics.shapes;

import androidx.collection.FloatList;
import j6.m;
import j6.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class FloatMappingKt {
    public static final float linearMap(FloatList xValues, FloatList yValues, float f8) {
        m until;
        s.checkNotNullParameter(xValues, "xValues");
        s.checkNotNullParameter(yValues, "yValues");
        if (0.0f > f8 || f8 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f8).toString());
        }
        until = v.until(0, xValues._size);
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((f0) it).nextInt();
            int i8 = nextInt + 1;
            if (progressInRange(f8, xValues.get(nextInt), xValues.get(i8 % xValues.getSize()))) {
                int size = i8 % xValues.getSize();
                float positiveModulo = Utils.positiveModulo(xValues.get(size) - xValues.get(nextInt), 1.0f);
                return Utils.positiveModulo(yValues.get(nextInt) + (Utils.positiveModulo(yValues.get(size) - yValues.get(nextInt), 1.0f) * (positiveModulo < 0.001f ? 0.5f : Utils.positiveModulo(f8 - xValues.get(nextInt), 1.0f) / positiveModulo)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean progressInRange(float f8, float f9, float f10) {
        if (f10 >= f9) {
            if (f9 <= f8 && f8 <= f10) {
                return true;
            }
        } else if (f8 >= f9 || f8 <= f10) {
            return true;
        }
        return false;
    }

    public static final void validateProgress(FloatList p8) {
        Iterable until;
        s.checkNotNullParameter(p8, "p");
        Boolean bool = Boolean.TRUE;
        float[] fArr = p8.content;
        int i8 = p8._size;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            boolean z7 = true;
            if (i10 >= i8) {
                break;
            }
            float f8 = fArr[i10];
            if (!bool.booleanValue() || 0.0f > f8 || f8 > 1.0f) {
                z7 = false;
            }
            bool = Boolean.valueOf(z7);
            i10++;
        }
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + FloatList.joinToString$default(p8, null, null, null, 0, null, 31, null)).toString());
        }
        until = v.until(1, p8.getSize());
        if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
            return;
        }
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((f0) it).nextInt();
            if (p8.get(nextInt) < p8.get(nextInt - 1) && (i9 = i9 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i9 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + FloatList.joinToString$default(p8, null, null, null, 0, null, 31, null)).toString());
    }
}
