package kotlin.collections;

import app.cash.redwood.lazylayout.widget.SparseList;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class RingBuffer$iterator$1 extends AbstractIterator {
    public final /* synthetic */ int $r8$classId = 1;
    public int count;
    public int index;
    public final /* synthetic */ AbstractList this$0;

    public RingBuffer$iterator$1(RingBuffer ringBuffer) {
        this.this$0 = ringBuffer;
        this.count = ringBuffer.size;
        this.index = ringBuffer.startIndex;
    }

    @Override // kotlin.collections.AbstractIterator
    public final void computeNext() {
        int i = this.$r8$classId;
        AbstractList abstractList = this.this$0;
        switch (i) {
            case 0:
                RingBuffer ringBuffer = (RingBuffer) abstractList;
                int i2 = this.count;
                if (i2 != 0) {
                    Object[] objArr = ringBuffer.buffer;
                    int i3 = this.index;
                    this.nextValue = objArr[i3];
                    this.state = 1;
                    this.index = (i3 + 1) % ringBuffer.capacity;
                    this.count = i2 - 1;
                    break;
                } else {
                    this.state = 2;
                    break;
                }
            default:
                SparseList sparseList = (SparseList) abstractList;
                ArrayList arrayList = sparseList.elements;
                int intValue = ((Number) sparseList.externalIndexes.get(this.index)).intValue();
                int i4 = this.count;
                if (i4 >= intValue) {
                    if (this.index >= arrayList.size()) {
                        this.state = 2;
                        break;
                    } else {
                        this.nextValue = arrayList.get(this.index);
                        this.state = 1;
                        this.index++;
                        this.count++;
                        break;
                    }
                } else {
                    this.nextValue = null;
                    this.state = 1;
                    this.count = i4 + 1;
                    break;
                }
        }
    }

    public RingBuffer$iterator$1(SparseList sparseList) {
        this.this$0 = sparseList;
    }
}
