package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {
    private final List<a> maskAnimations;
    private final List<Mask> masks;
    private final List<a> opacityAnimations;

    public h(List<Mask> list) {
        this.masks = list;
        this.maskAnimations = new ArrayList(list.size());
        this.opacityAnimations = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.maskAnimations.add(list.get(i8).getMaskPath().createAnimation());
            this.opacityAnimations.add(list.get(i8).getOpacity().createAnimation());
        }
    }

    public List<a> getMaskAnimations() {
        return this.maskAnimations;
    }

    public List<Mask> getMasks() {
        return this.masks;
    }

    public List<a> getOpacityAnimations() {
        return this.opacityAnimations;
    }
}
