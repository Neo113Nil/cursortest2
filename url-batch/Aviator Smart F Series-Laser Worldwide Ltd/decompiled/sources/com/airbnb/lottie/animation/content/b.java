package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    private final List<u> contents = new ArrayList();

    void addTrimPath(u uVar) {
        this.contents.add(uVar);
    }

    public void apply(Path path) {
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.j.applyTrimPathIfNeeded(path, this.contents.get(size));
        }
    }
}
