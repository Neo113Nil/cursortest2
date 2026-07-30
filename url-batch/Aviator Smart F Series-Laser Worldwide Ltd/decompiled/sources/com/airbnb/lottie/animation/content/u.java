package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u implements c, a.b {
    private final com.airbnb.lottie.animation.keyframe.a endAnimation;
    private final boolean hidden;
    private final List<a.b> listeners = new ArrayList();
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a offsetAnimation;
    private final com.airbnb.lottie.animation.keyframe.a startAnimation;
    private final ShapeTrimPath.Type type;

    public u(com.airbnb.lottie.model.layer.b bVar, ShapeTrimPath shapeTrimPath) {
        this.name = shapeTrimPath.getName();
        this.hidden = shapeTrimPath.isHidden();
        this.type = shapeTrimPath.getType();
        com.airbnb.lottie.animation.keyframe.a createAnimation = shapeTrimPath.getStart().createAnimation();
        this.startAnimation = createAnimation;
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.endAnimation = createAnimation2;
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.offsetAnimation = createAnimation3;
        bVar.addAnimation(createAnimation);
        bVar.addAnimation(createAnimation2);
        bVar.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    void addListener(a.b bVar) {
        this.listeners.add(bVar);
    }

    public com.airbnb.lottie.animation.keyframe.a getEnd() {
        return this.endAnimation;
    }

    @Override // com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.animation.keyframe.a getOffset() {
        return this.offsetAnimation;
    }

    public com.airbnb.lottie.animation.keyframe.a getStart() {
        return this.startAnimation;
    }

    ShapeTrimPath.Type getType() {
        return this.type;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        for (int i8 = 0; i8 < this.listeners.size(); i8++) {
            this.listeners.get(i8).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
    }
}
