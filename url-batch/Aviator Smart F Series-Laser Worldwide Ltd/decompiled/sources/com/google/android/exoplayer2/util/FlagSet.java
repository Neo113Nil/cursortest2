package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Deprecated
/* loaded from: classes3.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    public boolean contains(int i8) {
        return this.flags.get(i8);
    }

    public boolean containsAny(int... iArr) {
        for (int i8 : iArr) {
            if (contains(i8)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Util.SDK_INT >= 24) {
            return this.flags.equals(flagSet.flags);
        }
        if (size() != flagSet.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size(); i8++) {
            if (get(i8) != flagSet.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i8) {
        Assertions.checkIndex(i8, 0, size());
        return this.flags.keyAt(i8);
    }

    public int hashCode() {
        if (Util.SDK_INT >= 24) {
            return this.flags.hashCode();
        }
        int size = size();
        for (int i8 = 0; i8 < size(); i8++) {
            size = (size * 31) + get(i8);
        }
        return size;
    }

    public int size() {
        return this.flags.size();
    }

    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        @CanIgnoreReturnValue
        public Builder add(int i8) {
            Assertions.checkState(!this.buildCalled);
            this.flags.append(i8, true);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int... iArr) {
            for (int i8 : iArr) {
                add(i8);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addIf(int i8, boolean z7) {
            return z7 ? add(i8) : this;
        }

        public FlagSet build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        @CanIgnoreReturnValue
        public Builder remove(int i8) {
            Assertions.checkState(!this.buildCalled);
            this.flags.delete(i8);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeAll(int... iArr) {
            for (int i8 : iArr) {
                remove(i8);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder removeIf(int i8, boolean z7) {
            return z7 ? remove(i8) : this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(FlagSet flagSet) {
            for (int i8 = 0; i8 < flagSet.size(); i8++) {
                add(flagSet.get(i8));
            }
            return this;
        }
    }

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }
}
