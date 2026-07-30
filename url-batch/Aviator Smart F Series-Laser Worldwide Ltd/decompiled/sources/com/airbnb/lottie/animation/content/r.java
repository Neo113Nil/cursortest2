package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r implements m, a.b {
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.m shapeAnimation;

    @Nullable
    private List<s> shapeModifierContents;
    private final Path path = new Path();
    private final b trimPaths = new b();

    public r(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.m mVar) {
        this.name = mVar.getName();
        this.hidden = mVar.isHidden();
        this.lottieDrawable = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.m createAnimation = mVar.getShapePath().createAnimation();
        this.shapeAnimation = createAnimation;
        bVar.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.m, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        Path path = (Path) this.shapeAnimation.getValue();
        if (path == null) {
            return this.path;
        }
        this.path.set(path);
        this.path.setFillType(Path.FillType.EVEN_ODD);
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.animation.content.m, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(uVar);
                    uVar.addListener(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.shapeAnimation.setShapeModifiers(arrayList);
    }
}
