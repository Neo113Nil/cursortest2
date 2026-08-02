package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;
import operations.array.Map$evaluateLogic$1;

/* loaded from: classes9.dex */
public final class ElementMarker {
    public static final long[] EMPTY_HIGH_MARKS = new long[0];
    public final SerialDescriptor descriptor;
    public final long[] highMarksArray;
    public long lowerMarks;
    public final Map$evaluateLogic$1 readIfAbsent;

    public ElementMarker(SerialDescriptor serialDescriptor, Map$evaluateLogic$1 map$evaluateLogic$1) {
        serialDescriptor.getClass();
        this.descriptor = serialDescriptor;
        this.readIfAbsent = map$evaluateLogic$1;
        int elementsCount = serialDescriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = EMPTY_HIGH_MARKS;
            return;
        }
        this.lowerMarks = 0L;
        int i = (elementsCount - 1) >>> 6;
        long[] jArr = new long[i];
        if ((elementsCount & 63) != 0) {
            jArr[i - 1] = (-1) << elementsCount;
        }
        this.highMarksArray = jArr;
    }
}
