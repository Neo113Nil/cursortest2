package com.yandex.div.core.util.mask;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TextDiff {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int added;
    private final int removed;
    private final int start;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextDiff build(@NotNull String left, @NotNull String right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if (left.length() > right.length()) {
                TextDiff build = build(right, left);
                return new TextDiff(build.getStart(), build.getRemoved(), build.getAdded());
            }
            int length = right.length() - 1;
            int length2 = right.length() - left.length();
            int i4 = 0;
            while (i4 < length && i4 < left.length() && left.charAt(i4) == right.charAt(i4)) {
                i4++;
            }
            while (true) {
                int i5 = length - length2;
                if (i5 < i4 || left.charAt(i5) != right.charAt(length)) {
                    break;
                }
                length--;
            }
            int i6 = (length + 1) - i4;
            return new TextDiff(i4, i6, i6 - length2);
        }

        private Companion() {
        }
    }

    public TextDiff(int i4, int i5, int i6) {
        this.start = i4;
        this.added = i5;
        this.removed = i6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        return this.start == textDiff.start && this.added == textDiff.added && this.removed == textDiff.removed;
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.added)) * 31) + Integer.hashCode(this.removed);
    }

    @NotNull
    public String toString() {
        return "TextDiff(start=" + this.start + ", added=" + this.added + ", removed=" + this.removed + ')';
    }
}
