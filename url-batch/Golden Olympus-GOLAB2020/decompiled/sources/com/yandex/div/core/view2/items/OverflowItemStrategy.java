package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class OverflowItemStrategy {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int itemCount;

    @Metadata
    public static final class Clamp extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Clamp(int i4, int i5, int i6, int i7, @NotNull DisplayMetrics metrics) {
            super(i5, null);
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            this.currentItem = i4;
            this.itemCount = i5;
            this.scrollRange = i6;
            this.scrollOffset = i7;
            this.metrics = metrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i4) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.min(this.currentItem + i4, this.itemCount - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i4) {
            return Math.min(Math.max(0, this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i4), this.metrics)), this.scrollRange);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i4) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.max(0, this.currentItem - i4);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OverflowItemStrategy create$div_release(@Nullable String str, int i4, int i5, int i6, int i7, @NotNull DisplayMetrics metrics) {
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            if (str == null ? true : Intrinsics.areEqual(str, "clamp")) {
                return new Clamp(i4, i5, i6, i7, metrics);
            }
            if (Intrinsics.areEqual(str, "ring")) {
                return new Ring(i4, i5, i6, i7, metrics);
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported overflow " + str);
            }
            return new Clamp(i4, i5, i6, i7, metrics);
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Ring extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ring(int i4, int i5, int i6, int i7, @NotNull DisplayMetrics metrics) {
            super(i5, null);
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            this.currentItem = i4;
            this.itemCount = i5;
            this.scrollRange = i6;
            this.scrollOffset = i7;
            this.metrics = metrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i4) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return (this.currentItem + i4) % this.itemCount;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i4) {
            int dpToPx = this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i4), this.metrics);
            int i5 = this.scrollRange;
            int i6 = dpToPx % i5;
            return i6 < 0 ? i6 + i5 : i6;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i4) {
            if (super.itemCount <= 0) {
                return -1;
            }
            int i5 = this.currentItem - i4;
            int i6 = this.itemCount;
            int i7 = i5 % i6;
            return i7 + (i6 & (((i7 ^ i6) & ((-i7) | i7)) >> 31));
        }
    }

    public /* synthetic */ OverflowItemStrategy(int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4);
    }

    public abstract int nextItem(int i4);

    public abstract int positionAfterScrollBy(int i4);

    public abstract int previousItem(int i4);

    private OverflowItemStrategy(int i4) {
        this.itemCount = i4;
    }
}
