package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class Mask {
    private final boolean inverted;
    private final MaskMode maskMode;
    private final com.airbnb.lottie.model.animatable.h maskPath;
    private final com.airbnb.lottie.model.animatable.d opacity;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z7) {
        this.maskMode = maskMode;
        this.maskPath = hVar;
        this.opacity = dVar;
        this.inverted = z7;
    }

    public MaskMode getMaskMode() {
        return this.maskMode;
    }

    public com.airbnb.lottie.model.animatable.h getMaskPath() {
        return this.maskPath;
    }

    public com.airbnb.lottie.model.animatable.d getOpacity() {
        return this.opacity;
    }

    public boolean isInverted() {
        return this.inverted;
    }
}
