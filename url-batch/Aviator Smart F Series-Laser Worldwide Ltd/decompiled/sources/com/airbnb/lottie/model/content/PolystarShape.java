package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.n;

/* loaded from: classes.dex */
public class PolystarShape implements c {
    private final boolean hidden;
    private final com.airbnb.lottie.model.animatable.b innerRadius;
    private final com.airbnb.lottie.model.animatable.b innerRoundedness;
    private final boolean isReversed;
    private final String name;
    private final com.airbnb.lottie.model.animatable.b outerRadius;
    private final com.airbnb.lottie.model.animatable.b outerRoundedness;
    private final com.airbnb.lottie.model.animatable.b points;
    private final com.airbnb.lottie.model.animatable.m position;
    private final com.airbnb.lottie.model.animatable.b rotation;
    private final Type type;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i8) {
            this.value = i8;
        }

        public static Type forValue(int i8) {
            for (Type type : values()) {
                if (type.value == i8) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z7, boolean z8) {
        this.name = str;
        this.type = type;
        this.points = bVar;
        this.position = mVar;
        this.rotation = bVar2;
        this.innerRadius = bVar3;
        this.outerRadius = bVar4;
        this.innerRoundedness = bVar5;
        this.outerRoundedness = bVar6;
        this.hidden = z7;
        this.isReversed = z8;
    }

    public com.airbnb.lottie.model.animatable.b getInnerRadius() {
        return this.innerRadius;
    }

    public com.airbnb.lottie.model.animatable.b getInnerRoundedness() {
        return this.innerRoundedness;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.b getOuterRadius() {
        return this.outerRadius;
    }

    public com.airbnb.lottie.model.animatable.b getOuterRoundedness() {
        return this.outerRoundedness;
    }

    public com.airbnb.lottie.model.animatable.b getPoints() {
        return this.points;
    }

    public com.airbnb.lottie.model.animatable.m getPosition() {
        return this.position;
    }

    public com.airbnb.lottie.model.animatable.b getRotation() {
        return this.rotation;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isReversed() {
        return this.isReversed;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new n(lottieDrawable, bVar, this);
    }
}
