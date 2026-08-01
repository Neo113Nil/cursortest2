package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: RingBufferCapacity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010!R&\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028Æ\u0002@Â\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R&\u0010,\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028Æ\u0002@Â\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010'\"\u0004\b+\u0010\u0006R&\u0010/\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010'\"\u0004\b.\u0010\u0006R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lio/ktor/utils/io/internal/RingBufferCapacity;", "", "", "n", "", "completeRead", "(I)V", "remaining", "update", "", "completeReadOverflow", "(III)Ljava/lang/Void;", "completeWrite", "pending", "completeWriteOverflow", "(II)Ljava/lang/Void;", "", "flush", "()Z", "forceLockForRelease", "()V", "isEmpty", "isFull", "resetForRead", "resetForWrite", "", "toString", "()Ljava/lang/String;", "tryLockForRelease", "tryReadAtLeast", "(I)I", "tryReadAtMost", "tryReadExact", "(I)Z", "tryWriteAtLeast", "tryWriteAtMost", "tryWriteExact", "value", "getAvailableForRead", "()I", "setAvailableForRead", "availableForRead", "getAvailableForWrite", "setAvailableForWrite", "availableForWrite", "getPendingToFlush", "setPendingToFlush", "pendingToFlush", "totalCapacity", "I", "<init>", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RingBufferCapacity {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForWrite$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");
    static final /* synthetic */ AtomicIntegerFieldUpdater _pendingToFlush$FU = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;
    private final int totalCapacity;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i) {
        this.totalCapacity = i;
        this._availableForWrite$internal = i;
    }

    /* renamed from: getAvailableForRead, reason: from getter */
    public final int get_availableForRead$internal() {
        return this._availableForRead$internal;
    }

    private final void setAvailableForRead(int i) {
        this._availableForRead$internal = i;
    }

    /* renamed from: getAvailableForWrite, reason: from getter */
    public final int get_availableForWrite$internal() {
        return this._availableForWrite$internal;
    }

    private final void setAvailableForWrite(int i) {
        this._availableForWrite$internal = i;
    }

    /* renamed from: getPendingToFlush, reason: from getter */
    public final int get_pendingToFlush() {
        return this._pendingToFlush;
    }

    public final void setPendingToFlush(int i) {
        this._pendingToFlush = i;
    }

    public final void resetForWrite() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.totalCapacity;
    }

    public final void resetForRead() {
        this._availableForRead$internal = this.totalCapacity;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    private final Void completeReadOverflow(int remaining, int update, int n) {
        throw new IllegalArgumentException("Completed read overflow: " + remaining + " + " + n + " = " + update + " > " + this.totalCapacity);
    }

    private final Void completeWriteOverflow(int pending, int n) {
        throw new IllegalArgumentException("Complete write overflow: " + pending + " + " + n + " > " + this.totalCapacity);
    }

    public final boolean flush() {
        int andSet = _pendingToFlush$FU.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : _availableForRead$FU$internal.addAndGet(this, andSet) > 0;
    }

    public final void forceLockForRelease() {
        _availableForWrite$FU$internal.getAndSet(this, 0);
    }

    public final boolean isEmpty() {
        return this._availableForWrite$internal == this.totalCapacity;
    }

    public final boolean isFull() {
        return this._availableForWrite$internal == 0;
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.totalCapacity + AbstractJsonLexerKt.END_LIST;
    }

    public final int tryReadAtLeast(int n) {
        int i;
        do {
            i = this._availableForRead$internal;
            if (i < n) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, 0));
        return i;
    }

    public final boolean tryReadExact(int n) {
        int i;
        do {
            i = this._availableForRead$internal;
            if (i < n) {
                return false;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryReadAtMost(int n) {
        int i;
        int min;
        do {
            i = this._availableForRead$internal;
            min = Math.min(n, i);
            if (min == 0) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i, i - min));
        return Math.min(n, i);
    }

    public final int tryWriteAtLeast(int n) {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (i < n) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return i;
    }

    public final boolean tryWriteExact(int n) {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (i < n) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i - n));
        return true;
    }

    public final int tryWriteAtMost(int n) {
        int i;
        int min;
        do {
            i = this._availableForWrite$internal;
            min = Math.min(n, i);
            if (min == 0) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i - min));
        return Math.min(n, i);
    }

    public final void completeRead(int n) {
        int i;
        int i2;
        do {
            i = this._availableForWrite$internal;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeReadOverflow(i, i2, n);
                throw new KotlinNothingValueException();
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, i2));
    }

    public final void completeWrite(int n) {
        int i;
        int i2;
        do {
            i = this._pendingToFlush;
            i2 = i + n;
            if (i2 > this.totalCapacity) {
                completeWriteOverflow(i, n);
                throw new KotlinNothingValueException();
            }
        } while (!_pendingToFlush$FU.compareAndSet(this, i, i2));
    }

    public final boolean tryLockForRelease() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.totalCapacity) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i, 0));
        return true;
    }
}
