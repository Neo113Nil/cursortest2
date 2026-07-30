package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class l implements c {
    private final boolean hidden;
    private final List<c> items;
    private final String name;

    public l(String str, List<c> list, boolean z7) {
        this.name = str;
        this.items = list;
        this.hidden = z7;
    }

    public List<c> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(lottieDrawable, bVar, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.name + "' Shapes: " + Arrays.toString(this.items.toArray()) + '}';
    }
}
