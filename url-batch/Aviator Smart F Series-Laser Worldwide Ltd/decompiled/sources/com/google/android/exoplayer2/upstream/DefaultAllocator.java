package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;

    @Nullable
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z7, int i8) {
        this(z7, i8, 0);
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        try {
            this.allocatedCount++;
            int i8 = this.availableCount;
            if (i8 > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i9 = i8 - 1;
                this.availableCount = i9;
                allocation = (Allocation) Assertions.checkNotNull(allocationArr[i9]);
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i10 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i10 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i8 = this.availableCount;
        this.availableCount = i8 + 1;
        allocationArr[i8] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i8) {
        boolean z7 = i8 < this.targetBufferSize;
        this.targetBufferSize = i8;
        if (z7) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
        try {
            int i8 = 0;
            int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i9 = this.availableCount;
            if (max >= i9) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i10 = i9 - 1;
                while (i8 <= i10) {
                    Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i8]);
                    if (allocation.data == this.initialAllocationBlock) {
                        i8++;
                    } else {
                        Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i10]);
                        if (allocation2.data != this.initialAllocationBlock) {
                            i10--;
                        } else {
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i8] = allocation2;
                            allocationArr[i10] = allocation;
                            i10--;
                            i8++;
                        }
                    }
                }
                max = Math.max(max, i8);
                if (max >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
            this.availableCount = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    public DefaultAllocator(boolean z7, int i8, int i9) {
        Assertions.checkArgument(i8 > 0);
        Assertions.checkArgument(i9 >= 0);
        this.trimOnReset = z7;
        this.individualAllocationSize = i8;
        this.availableCount = i9;
        this.availableAllocations = new Allocation[i9 + 100];
        if (i9 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i9 * i8];
        for (int i10 = 0; i10 < i9; i10++) {
            this.availableAllocations[i10] = new Allocation(this.initialAllocationBlock, i10 * i8);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(@Nullable Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.availableAllocations;
                int i8 = this.availableCount;
                this.availableCount = i8 + 1;
                allocationArr[i8] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }
}
