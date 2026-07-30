package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c8, T t7, int i8, A a8);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    private boolean isRemoved(int i8) {
        int i9;
        if (i8 < 64) {
            return ((1 << i8) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i9 = (i8 / 64) - 1) < jArr.length) {
            return ((1 << (i8 % 64)) & jArr[i9]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t7, int i8, A a8) {
        notifyCallbacks(t7, i8, a8, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t7, int i8, A a8) {
        int size = this.mCallbacks.size();
        int length = this.mRemainderRemoved == null ? -1 : r0.length - 1;
        notifyRemainder(t7, i8, a8, length);
        notifyCallbacks(t7, i8, a8, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t7, int i8, A a8, int i9) {
        if (i9 < 0) {
            notifyFirst64(t7, i8, a8);
            return;
        }
        long j8 = this.mRemainderRemoved[i9];
        int i10 = (i9 + 1) * 64;
        int min = Math.min(this.mCallbacks.size(), i10 + 64);
        notifyRemainder(t7, i8, a8, i9 - 1);
        notifyCallbacks(t7, i8, a8, i10, min, j8);
    }

    private void removeRemovedCallbacks(int i8, long j8) {
        long j9 = Long.MIN_VALUE;
        for (int i9 = i8 + 63; i9 >= i8; i9--) {
            if ((j8 & j9) != 0) {
                this.mCallbacks.remove(i9);
            }
            j9 >>>= 1;
        }
    }

    private void setRemovalBit(int i8) {
        if (i8 < 64) {
            this.mFirst64Removed = (1 << i8) | this.mFirst64Removed;
            return;
        }
        int i9 = (i8 / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i9) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j8 = 1 << (i8 % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i9] = j8 | jArr4[i9];
    }

    public synchronized void add(C c8) {
        try {
            if (c8 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int lastIndexOf = this.mCallbacks.lastIndexOf(c8);
            if (lastIndexOf >= 0) {
                if (isRemoved(lastIndexOf)) {
                }
            }
            this.mCallbacks.add(c8);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.clear();
            } else if (!this.mCallbacks.isEmpty()) {
                for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                    setRemovalBit(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!isRemoved(i8)) {
                arrayList.add(this.mCallbacks.get(i8));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!isRemoved(i8)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t7, int i8, A a8) {
        try {
            this.mNotificationLevel++;
            notifyRecurse(t7, i8, a8);
            int i9 = this.mNotificationLevel - 1;
            this.mNotificationLevel = i9;
            if (i9 == 0) {
                long[] jArr = this.mRemainderRemoved;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j8 = this.mRemainderRemoved[length];
                        if (j8 != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j8);
                            this.mRemainderRemoved[length] = 0;
                        }
                    }
                }
                long j9 = this.mFirst64Removed;
                if (j9 != 0) {
                    removeRemovedCallbacks(0, j9);
                    this.mFirst64Removed = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(C c8) {
        try {
            if (this.mNotificationLevel == 0) {
                this.mCallbacks.remove(c8);
            } else {
                int lastIndexOf = this.mCallbacks.lastIndexOf(c8);
                if (lastIndexOf >= 0) {
                    setRemovalBit(lastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m39clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e8;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
        } catch (CloneNotSupportedException e9) {
            callbackRegistry = null;
            e8 = e9;
        }
        try {
            callbackRegistry.mFirst64Removed = 0L;
            callbackRegistry.mRemainderRemoved = null;
            callbackRegistry.mNotificationLevel = 0;
            callbackRegistry.mCallbacks = new ArrayList();
            int size = this.mCallbacks.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (!isRemoved(i8)) {
                    callbackRegistry.mCallbacks.add(this.mCallbacks.get(i8));
                }
            }
        } catch (CloneNotSupportedException e10) {
            e8 = e10;
            e8.printStackTrace();
            return callbackRegistry;
        }
        return callbackRegistry;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!isRemoved(i8)) {
                list.add(this.mCallbacks.get(i8));
            }
        }
    }

    private void notifyCallbacks(T t7, int i8, A a8, int i9, int i10, long j8) {
        long j9 = 1;
        while (i9 < i10) {
            if ((j8 & j9) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i9), t7, i8, a8);
            }
            j9 <<= 1;
            i9++;
        }
    }
}
