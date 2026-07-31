package com.yandex.div.internal.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Colormap {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Colormap EMPTY = new Colormap(new int[0], 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @NotNull
    private final int[] colors;

    @Nullable
    private final float[] positions;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Colormap(@NotNull int[] colors, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        this.positions = fArr;
        if (colors.length != (fArr != null ? fArr.length : colors.length)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(Colormap.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.div.internal.graphics.Colormap");
        Colormap colormap = (Colormap) obj;
        return Arrays.equals(this.colors, colormap.colors) && Arrays.equals(this.positions, colormap.positions);
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @Nullable
    public final float[] getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.colors) * 31;
        float[] fArr = this.positions;
        return hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    public /* synthetic */ Colormap(int[] iArr, float[] fArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, (i4 & 2) != 0 ? null : fArr);
    }
}
