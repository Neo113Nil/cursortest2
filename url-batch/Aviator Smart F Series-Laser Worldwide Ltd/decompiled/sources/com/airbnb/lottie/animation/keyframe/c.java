package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;

/* loaded from: classes.dex */
public class c implements a.b {
    private static final double DEG_TO_RAD = 0.017453292519943295d;
    private final com.airbnb.lottie.animation.keyframe.a color;
    private final com.airbnb.lottie.animation.keyframe.a direction;
    private final com.airbnb.lottie.animation.keyframe.a distance;
    private boolean isDirty = true;
    private final a.b listener;
    private final com.airbnb.lottie.animation.keyframe.a opacity;
    private final com.airbnb.lottie.animation.keyframe.a radius;

    class a extends com.airbnb.lottie.value.c {
        final /* synthetic */ com.airbnb.lottie.value.c val$callback;

        a(com.airbnb.lottie.value.c cVar) {
            this.val$callback = cVar;
        }

        @Override // com.airbnb.lottie.value.c
        @Nullable
        public Float getValue(com.airbnb.lottie.value.b bVar) {
            Float f8 = (Float) this.val$callback.getValue(bVar);
            if (f8 == null) {
                return null;
            }
            return Float.valueOf(f8.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, com.airbnb.lottie.parser.j jVar) {
        this.listener = bVar;
        com.airbnb.lottie.animation.keyframe.a createAnimation = jVar.getColor().createAnimation();
        this.color = createAnimation;
        createAnimation.addUpdateListener(this);
        bVar2.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = jVar.getOpacity().createAnimation();
        this.opacity = createAnimation2;
        createAnimation2.addUpdateListener(this);
        bVar2.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = jVar.getDirection().createAnimation();
        this.direction = createAnimation3;
        createAnimation3.addUpdateListener(this);
        bVar2.addAnimation(createAnimation3);
        com.airbnb.lottie.animation.keyframe.a createAnimation4 = jVar.getDistance().createAnimation();
        this.distance = createAnimation4;
        createAnimation4.addUpdateListener(this);
        bVar2.addAnimation(createAnimation4);
        com.airbnb.lottie.animation.keyframe.a createAnimation5 = jVar.getRadius().createAnimation();
        this.radius = createAnimation5;
        createAnimation5.addUpdateListener(this);
        bVar2.addAnimation(createAnimation5);
    }

    public void applyTo(Paint paint) {
        if (this.isDirty) {
            this.isDirty = false;
            double floatValue = ((Float) this.direction.getValue()).floatValue() * 0.017453292519943295d;
            float floatValue2 = ((Float) this.distance.getValue()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.color.getValue()).intValue();
            paint.setShadowLayer(((Float) this.radius.getValue()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.opacity.getValue()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.isDirty = true;
        this.listener.onValueChanged();
    }

    public void setColorCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        this.color.setValueCallback(cVar);
    }

    public void setDirectionCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        this.direction.setValueCallback(cVar);
    }

    public void setDistanceCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        this.distance.setValueCallback(cVar);
    }

    public void setOpacityCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        if (cVar == null) {
            this.opacity.setValueCallback(null);
        } else {
            this.opacity.setValueCallback(new a(cVar));
        }
    }

    public void setRadiusCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        this.radius.setValueCallback(cVar);
    }
}
