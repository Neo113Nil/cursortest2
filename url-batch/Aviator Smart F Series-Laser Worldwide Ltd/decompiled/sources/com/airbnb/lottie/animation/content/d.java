package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, com.airbnb.lottie.model.e {
    private final List<c> contents;
    private final boolean hidden;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private final String name;
    private final Paint offScreenPaint;
    private final RectF offScreenRectF;
    private final Path path;

    @Nullable
    private List<m> pathContents;
    private final RectF rect;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.p transformAnimation;

    public d(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this(lottieDrawable, bVar, lVar.getName(), lVar.isHidden(), contentsFromModels(lottieDrawable, bVar, lVar.getItems()), findTransform(lVar.getItems()));
    }

    private static List<c> contentsFromModels(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, List<com.airbnb.lottie.model.content.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            c content = list.get(i8).toContent(lottieDrawable, bVar);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    @Nullable
    static com.airbnb.lottie.model.animatable.l findTransform(List<com.airbnb.lottie.model.content.c> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.airbnb.lottie.model.content.c cVar = list.get(i8);
            if (cVar instanceof com.airbnb.lottie.model.animatable.l) {
                return (com.airbnb.lottie.model.animatable.l) cVar;
            }
        }
        return null;
    }

    private boolean hasTwoOrMoreDrawableContent() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.contents.size(); i9++) {
            if ((this.contents.get(i9) instanceof e) && (i8 = i8 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.animation.keyframe.p pVar = this.transformAnimation;
        if (pVar != null) {
            pVar.applyValueCallback(t7, cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.hidden) {
            return;
        }
        this.matrix.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.transformAnimation;
        if (pVar != null) {
            this.matrix.preConcat(pVar.getMatrix());
            i8 = (int) (((((this.transformAnimation.getOpacity() == null ? 100 : ((Integer) this.transformAnimation.getOpacity().getValue()).intValue()) / 100.0f) * i8) / 255.0f) * 255.0f);
        }
        boolean z7 = this.lottieDrawable.isApplyingOpacityToLayersEnabled() && hasTwoOrMoreDrawableContent() && i8 != 255;
        if (z7) {
            this.offScreenRectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.offScreenRectF, this.matrix, true);
            this.offScreenPaint.setAlpha(i8);
            com.airbnb.lottie.utils.j.saveLayerCompat(canvas, this.offScreenRectF, this.offScreenPaint);
        }
        if (z7) {
            i8 = 255;
        }
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            c cVar = this.contents.get(size);
            if (cVar instanceof e) {
                ((e) cVar).draw(canvas, this.matrix, i8);
            }
        }
        if (z7) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        this.matrix.set(matrix);
        com.airbnb.lottie.animation.keyframe.p pVar = this.transformAnimation;
        if (pVar != null) {
            this.matrix.preConcat(pVar.getMatrix());
        }
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            c cVar = this.contents.get(size);
            if (cVar instanceof e) {
                ((e) cVar).getBounds(this.rect, this.matrix, z7);
                rectF.union(this.rect);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path getPath() {
        this.matrix.reset();
        com.airbnb.lottie.animation.keyframe.p pVar = this.transformAnimation;
        if (pVar != null) {
            this.matrix.set(pVar.getMatrix());
        }
        this.path.reset();
        if (this.hidden) {
            return this.path;
        }
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            c cVar = this.contents.get(size);
            if (cVar instanceof m) {
                this.path.addPath(((m) cVar).getPath(), this.matrix);
            }
        }
        return this.path;
    }

    List<m> getPathList() {
        if (this.pathContents == null) {
            this.pathContents = new ArrayList();
            for (int i8 = 0; i8 < this.contents.size(); i8++) {
                c cVar = this.contents.get(i8);
                if (cVar instanceof m) {
                    this.pathContents.add((m) cVar);
                }
            }
        }
        return this.pathContents;
    }

    Matrix getTransformationMatrix() {
        com.airbnb.lottie.animation.keyframe.p pVar = this.transformAnimation;
        if (pVar != null) {
            return pVar.getMatrix();
        }
        this.matrix.reset();
        return this.matrix;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (dVar.matches(getName(), i8) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.addKey(getName());
                if (dVar.fullyResolvesTo(getName(), i8)) {
                    list.add(dVar2.resolve(this));
                }
            }
            if (dVar.propagateToChildren(getName(), i8)) {
                int incrementDepthBy = i8 + dVar.incrementDepthBy(getName(), i8);
                for (int i9 = 0; i9 < this.contents.size(); i9++) {
                    c cVar = this.contents.get(i9);
                    if (cVar instanceof com.airbnb.lottie.model.e) {
                        ((com.airbnb.lottie.model.e) cVar).resolveKeyPath(dVar, incrementDepthBy, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.contents.size());
        arrayList.addAll(list);
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            c cVar = this.contents.get(size);
            cVar.setContents(arrayList, this.contents.subList(0, size));
            arrayList.add(cVar);
        }
    }

    d(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, String str, boolean z7, List<c> list, @Nullable com.airbnb.lottie.model.animatable.l lVar) {
        this.offScreenPaint = new v.a();
        this.offScreenRectF = new RectF();
        this.matrix = new Matrix();
        this.path = new Path();
        this.rect = new RectF();
        this.name = str;
        this.lottieDrawable = lottieDrawable;
        this.hidden = z7;
        this.contents = list;
        if (lVar != null) {
            com.airbnb.lottie.animation.keyframe.p createAnimation = lVar.createAnimation();
            this.transformAnimation = createAnimation;
            createAnimation.addAnimationsToLayer(bVar);
            this.transformAnimation.addListener(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }
}
