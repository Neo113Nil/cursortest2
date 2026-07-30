package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.u;

/* loaded from: classes.dex */
public class ShapeTrimPath implements c {
    private final com.airbnb.lottie.model.animatable.b end;
    private final boolean hidden;
    private final String name;
    private final com.airbnb.lottie.model.animatable.b offset;
    private final com.airbnb.lottie.model.animatable.b start;
    private final Type type;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i8) {
            if (i8 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i8 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i8);
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z7) {
        this.name = str;
        this.type = type;
        this.start = bVar;
        this.end = bVar2;
        this.offset = bVar3;
        this.hidden = z7;
    }

    public com.airbnb.lottie.model.animatable.b getEnd() {
        return this.end;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.b getOffset() {
        return this.offset;
    }

    public com.airbnb.lottie.model.animatable.b getStart() {
        return this.start;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new u(bVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.start + ", end: " + this.end + ", offset: " + this.offset + "}";
    }
}
