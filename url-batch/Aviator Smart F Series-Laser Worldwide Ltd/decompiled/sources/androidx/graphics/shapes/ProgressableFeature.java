package androidx.graphics.shapes;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class ProgressableFeature {
    private final Feature feature;
    private final float progress;

    public ProgressableFeature(float f8, Feature feature) {
        s.checkNotNullParameter(feature, "feature");
        this.progress = f8;
        this.feature = feature;
    }

    public static /* synthetic */ ProgressableFeature copy$default(ProgressableFeature progressableFeature, float f8, Feature feature, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = progressableFeature.progress;
        }
        if ((i8 & 2) != 0) {
            feature = progressableFeature.feature;
        }
        return progressableFeature.copy(f8, feature);
    }

    public final float component1() {
        return this.progress;
    }

    public final Feature component2() {
        return this.feature;
    }

    public final ProgressableFeature copy(float f8, Feature feature) {
        s.checkNotNullParameter(feature, "feature");
        return new ProgressableFeature(f8, feature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressableFeature)) {
            return false;
        }
        ProgressableFeature progressableFeature = (ProgressableFeature) obj;
        return Float.compare(this.progress, progressableFeature.progress) == 0 && s.areEqual(this.feature, progressableFeature.feature);
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.progress) * 31) + this.feature.hashCode();
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.progress + ", feature=" + this.feature + ')';
    }
}
