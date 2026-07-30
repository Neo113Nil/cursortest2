package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {
    private d contentGroup;
    private final com.airbnb.lottie.animation.keyframe.a copies;
    private final boolean hidden;
    private final com.airbnb.lottie.model.layer.b layer;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a offset;
    private final com.airbnb.lottie.animation.keyframe.p transform;
    private final Matrix matrix = new Matrix();
    private final Path path = new Path();

    public p(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.h hVar) {
        this.lottieDrawable = lottieDrawable;
        this.layer = bVar;
        this.name = hVar.getName();
        this.hidden = hVar.isHidden();
        com.airbnb.lottie.animation.keyframe.a createAnimation = hVar.getCopies().createAnimation();
        this.copies = createAnimation;
        bVar.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = hVar.getOffset().createAnimation();
        this.offset = createAnimation2;
        bVar.addAnimation(createAnimation2);
        createAnimation2.addUpdateListener(this);
        com.airbnb.lottie.animation.keyframe.p createAnimation3 = hVar.getTransform().createAnimation();
        this.transform = createAnimation3;
        createAnimation3.addAnimationsToLayer(bVar);
        createAnimation3.addListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void absorbContent(ListIterator<c> listIterator) {
        if (this.contentGroup != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.contentGroup = new d(this.lottieDrawable, this.layer, "Repeater", this.hidden, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        if (this.transform.applyValueCallback(t7, cVar)) {
            return;
        }
        if (t7 == n0.REPEATER_COPIES) {
            this.copies.setValueCallback(cVar);
        } else if (t7 == n0.REPEATER_OFFSET) {
            this.offset.setValueCallback(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        float floatValue = ((Float) this.copies.getValue()).floatValue();
        float floatValue2 = ((Float) this.offset.getValue()).floatValue();
        float floatValue3 = ((Float) this.transform.getStartOpacity().getValue()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.transform.getEndOpacity().getValue()).floatValue() / 100.0f;
        for (int i9 = ((int) floatValue) - 1; i9 >= 0; i9--) {
            this.matrix.set(matrix);
            float f8 = i9;
            this.matrix.preConcat(this.transform.getMatrixForRepeater(f8 + floatValue2));
            this.contentGroup.draw(canvas, this.matrix, (int) (i8 * com.airbnb.lottie.utils.i.lerp(floatValue3, floatValue4, f8 / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        this.contentGroup.getBounds(rectF, matrix, z7);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path getPath() {
        Path path = this.contentGroup.getPath();
        this.path.reset();
        float floatValue = ((Float) this.copies.getValue()).floatValue();
        float floatValue2 = ((Float) this.offset.getValue()).floatValue();
        for (int i8 = ((int) floatValue) - 1; i8 >= 0; i8--) {
            this.matrix.set(this.transform.getMatrixForRepeater(i8 + floatValue2));
            this.path.addPath(path, this.matrix);
        }
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.resolveKeyPath(dVar, i8, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        this.contentGroup.setContents(list, list2);
    }
}
