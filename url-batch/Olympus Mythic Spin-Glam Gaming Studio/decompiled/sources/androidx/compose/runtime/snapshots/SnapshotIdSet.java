package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

/* compiled from: SnapshotIdSet.kt */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 #2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001#B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "id", "", "get", "(J)Z", "set", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "ids", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "bits", "or", "", "iterator", "()Ljava/util/Iterator;", "default", "lowest", "(J)J", "", "toString", "()Ljava/lang/String;", "J", "[J", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    public final boolean get(long id) {
        long[] jArr;
        long j = id - this.lowerBound;
        long j2 = 0;
        return Intrinsics.compare(j, j2) < 0 || Intrinsics.compare(j, (long) 64) >= 0 ? Intrinsics.compare(j, (long) 64) < 0 || Intrinsics.compare(j, (long) 128) >= 0 ? Intrinsics.compare(j, j2) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, id) >= 0 : ((1 << (((int) j) - 64)) & this.upperSet) != 0 : ((1 << ((int) j)) & this.lowerSet) != 0;
    }

    public final SnapshotIdSet set(long id) {
        long j;
        long j2;
        long[] jArr;
        long j3 = id - this.lowerBound;
        long j4 = 0;
        if (Intrinsics.compare(j3, j4) < 0 || Intrinsics.compare(j3, 64) >= 0) {
            long j5 = 64;
            if (Intrinsics.compare(j3, j5) < 0 || Intrinsics.compare(j3, 128) >= 0) {
                long j6 = 128;
                if (Intrinsics.compare(j3, j6) < 0) {
                    long[] jArr2 = this.belowBound;
                    if (jArr2 == null) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id});
                    }
                    int binarySearch = SnapshotId_jvmKt.binarySearch(jArr2, id);
                    if (binarySearch < 0) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr2, -(binarySearch + 1), id));
                    }
                } else if (!get(id)) {
                    long j7 = this.upperSet;
                    long j8 = this.lowerSet;
                    long j9 = this.lowerBound;
                    long j10 = j8;
                    long j11 = 1;
                    long j12 = ((id + j11) / j5) * j5;
                    if (Intrinsics.compare(j12, j4) < 0) {
                        j12 = (Long.MAX_VALUE - j6) + j11;
                    }
                    SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                    long j13 = j7;
                    while (true) {
                        if (Intrinsics.compare(j9, j12) >= 0) {
                            j = j9;
                            j2 = j10;
                            break;
                        }
                        if (j10 != 0) {
                            if (snapshotIdArrayBuilder == null) {
                                snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                            }
                            for (int i = 0; i < 64; i++) {
                                if ((j10 & (1 << i)) != 0) {
                                    snapshotIdArrayBuilder.add(i + j9);
                                }
                            }
                        }
                        if (j13 == 0) {
                            j = j12;
                            j2 = 0;
                            break;
                        }
                        j9 += j5;
                        j10 = j13;
                        j13 = 0;
                    }
                    if (snapshotIdArrayBuilder == null || (jArr = snapshotIdArrayBuilder.toArray()) == null) {
                        jArr = this.belowBound;
                    }
                    return new SnapshotIdSet(j13, j2, j, jArr).set(id);
                }
            } else {
                long j14 = 1 << (((int) j3) - 64);
                long j15 = this.upperSet;
                if ((j15 & j14) == 0) {
                    return new SnapshotIdSet(j15 | j14, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j16 = 1 << ((int) j3);
            long j17 = this.lowerSet;
            if ((j17 & j16) == 0) {
                return new SnapshotIdSet(this.upperSet, j17 | j16, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(long id) {
        long[] jArr;
        int binarySearch;
        long j = id - this.lowerBound;
        long j2 = 0;
        if (Intrinsics.compare(j, j2) < 0 || Intrinsics.compare(j, 64) >= 0) {
            if (Intrinsics.compare(j, 64) < 0 || Intrinsics.compare(j, 128) >= 0) {
                if (Intrinsics.compare(j, j2) < 0 && (jArr = this.belowBound) != null && (binarySearch = SnapshotId_jvmKt.binarySearch(jArr, id)) >= 0) {
                    return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, binarySearch));
                }
            } else {
                long j3 = 1 << (((int) j) - 64);
                long j4 = this.upperSet;
                if ((j4 & j3) != 0) {
                    return new SnapshotIdSet(j4 & (~j3), this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j5 = 1 << ((int) j);
            long j6 = this.lowerSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(this.upperSet, j6 & (~j5), this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet ids) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (ids == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j = ids.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j2, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            snapshotIdSet = this;
            for (long j3 : jArr3) {
                snapshotIdSet = snapshotIdSet.clear(j3);
            }
        } else {
            snapshotIdSet = this;
        }
        if (ids.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((ids.lowerSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(ids.lowerBound + i);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((ids.upperSet & (1 << i2)) != 0) {
                    snapshotIdSet = snapshotIdSet.clear(ids.lowerBound + i2 + 64);
                }
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (bits == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return bits;
        }
        long j = bits.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j2, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    bits = bits.set(j3);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        bits = bits.set(this.lowerBound + i2);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        bits = bits.set(this.lowerBound + i + 64);
                    }
                    i++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j4 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j4);
            }
        } else {
            snapshotIdSet = this;
        }
        if (bits.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((bits.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i3);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i < 64) {
                if ((bits.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(bits.lowerBound + i + 64);
                }
                i++;
            }
        }
        return snapshotIdSet;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final long lowest(long r6) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : r6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }
}
