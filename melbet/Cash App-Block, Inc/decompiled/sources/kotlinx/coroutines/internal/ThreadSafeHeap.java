package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes3.dex */
public class ThreadSafeHeap {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public EventLoopImplBase.DelayedTask[] a;

    public final void addImpl(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.setHeap((EventLoopImplBase.DelayedTaskQueue) this);
        EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _size$volatile$FU;
        if (delayedTaskArr == null) {
            delayedTaskArr = new EventLoopImplBase.DelayedTask[4];
            this.a = delayedTaskArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= delayedTaskArr.length) {
            delayedTaskArr = (EventLoopImplBase.DelayedTask[]) Arrays.copyOf(delayedTaskArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = delayedTaskArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        delayedTaskArr[i] = delayedTask;
        delayedTask.index = i;
        siftUpFrom(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EventLoopImplBase.DelayedTask removeAtImpl(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _size$volatile$FU;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            swap(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                EventLoopImplBase.DelayedTask delayedTask = objArr[i];
                delayedTask.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (delayedTask.compareTo(obj) < 0) {
                    swap(i, i2);
                    siftUpFrom(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                swap(i, i5);
                i = i5;
            }
        }
        EventLoopImplBase.DelayedTask delayedTask2 = objArr[atomicIntegerFieldUpdater.get(this)];
        delayedTask2.getClass();
        delayedTask2.setHeap(null);
        delayedTask2.index = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return delayedTask2;
    }

    public final void siftUpFrom(int i) {
        while (i > 0) {
            EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
            delayedTaskArr.getClass();
            int i2 = (i - 1) / 2;
            EventLoopImplBase.DelayedTask delayedTask = delayedTaskArr[i2];
            delayedTask.getClass();
            EventLoopImplBase.DelayedTask delayedTask2 = delayedTaskArr[i];
            delayedTask2.getClass();
            if (delayedTask.compareTo(delayedTask2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    public final void swap(int i, int i2) {
        EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
        delayedTaskArr.getClass();
        EventLoopImplBase.DelayedTask delayedTask = delayedTaskArr[i2];
        delayedTask.getClass();
        EventLoopImplBase.DelayedTask delayedTask2 = delayedTaskArr[i];
        delayedTask2.getClass();
        delayedTaskArr[i] = delayedTask;
        delayedTaskArr[i2] = delayedTask2;
        delayedTask.index = i;
        delayedTask2.index = i2;
    }
}
