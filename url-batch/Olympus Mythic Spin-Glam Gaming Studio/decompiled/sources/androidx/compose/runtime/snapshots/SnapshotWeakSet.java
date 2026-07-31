package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* compiled from: SnapshotWeakSet.kt */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR0\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "T", "<init>", "()V", "value", "", "hash", "find", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "findExactIndex", "(ILjava/lang/Object;I)I", "", m.l, "(Ljava/lang/Object;)Z", "size", "I", "getSize$runtime", "()I", "setSize$runtime", "(I)V", "", "hashes", "[I", "getHashes$runtime", "()[I", "setHashes$runtime", "([I)V", "", "Landroidx/compose/runtime/internal/WeakReference;", "values", "[Landroidx/compose/runtime/internal/WeakReference;", "getValues$runtime", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime", "([Landroidx/compose/runtime/internal/WeakReference;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SnapshotWeakSet<T> {
    private int size;
    private int[] hashes = new int[16];
    private WeakReference[] values = new WeakReference[16];

    /* renamed from: getSize$runtime, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void setSize$runtime(int i) {
        this.size = i;
    }

    /* renamed from: getHashes$runtime, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* renamed from: getValues$runtime, reason: from getter */
    public final WeakReference[] getValues() {
        return this.values;
    }

    public final boolean add(Object value) {
        int i;
        int i2 = this.size;
        int identityHashCode = System_jvmKt.identityHashCode(value);
        if (i2 > 0) {
            i = find(value, identityHashCode);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        WeakReference[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 != length) {
            int i4 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr, i4, i2 - i3);
            int[] iArr = this.hashes;
            ArraysKt.copyInto(iArr, iArr, i4, i3, i2);
        } else {
            int i5 = length * 2;
            WeakReference[] weakReferenceArr2 = new WeakReference[i5];
            int[] iArr2 = new int[i5];
            int i6 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr2, i6, i2 - i3);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i3);
            ArraysKt.copyInto(this.hashes, iArr2, i6, i3, i2);
            ArraysKt.copyInto$default(this.hashes, iArr2, 0, 0, i3, 6, (Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr2;
        }
        this.values[i3] = new WeakReference(value);
        this.hashes[i3] = identityHashCode;
        this.size++;
        return true;
    }

    private final int find(Object value, int hash) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.hashes[i3];
            if (i4 < hash) {
                i2 = i3 + 1;
            } else {
                if (i4 <= hash) {
                    WeakReference weakReference = this.values[i3];
                    return value == (weakReference != null ? weakReference.get() : null) ? i3 : findExactIndex(i3, value, hash);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int findExactIndex(int midIndex, Object value, int valueHash) {
        int i = midIndex - 1;
        while (true) {
            if (-1 >= i || this.hashes[i] != valueHash) {
                break;
            }
            WeakReference weakReference = this.values[i];
            if ((weakReference != null ? weakReference.get() : null) == value) {
                return i;
            }
            i--;
        }
        int i2 = midIndex + 1;
        int i3 = this.size;
        while (true) {
            if (i2 < i3) {
                if (this.hashes[i2] != valueHash) {
                    break;
                }
                WeakReference weakReference2 = this.values[i2];
                if ((weakReference2 != null ? weakReference2.get() : null) == value) {
                    return i2;
                }
                i2++;
            } else {
                i2 = this.size;
                break;
            }
        }
    }
}
