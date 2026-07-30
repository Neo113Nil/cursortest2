package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes.dex */
public class MergePaths implements c {
    private final boolean hidden;
    private final MergePathsMode mode;
    private final String name;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i8) {
            return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z7) {
        this.name = str;
        this.mode = mergePathsMode;
        this.hidden = z7;
    }

    public MergePathsMode getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        if (lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.f.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.mode + '}';
    }
}
