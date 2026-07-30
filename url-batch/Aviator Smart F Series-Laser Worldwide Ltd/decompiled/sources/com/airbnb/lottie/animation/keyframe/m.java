package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.s;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a {
    private List<s> shapeModifiers;
    private final Path tempPath;
    private final com.airbnb.lottie.model.content.j tempShapeData;

    public m(List<com.airbnb.lottie.value.a> list) {
        super(list);
        this.tempShapeData = new com.airbnb.lottie.model.content.j();
        this.tempPath = new Path();
    }

    public void setShapeModifiers(@Nullable List<s> list) {
        this.shapeModifiers = list;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public Path getValue(com.airbnb.lottie.value.a aVar, float f8) {
        this.tempShapeData.interpolateBetween((com.airbnb.lottie.model.content.j) aVar.startValue, (com.airbnb.lottie.model.content.j) aVar.endValue, f8);
        com.airbnb.lottie.model.content.j jVar = this.tempShapeData;
        List<s> list = this.shapeModifiers;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                jVar = this.shapeModifiers.get(size).modifyShape(jVar);
            }
        }
        com.airbnb.lottie.utils.i.getPathFromData(jVar, this.tempPath);
        return this.tempPath;
    }
}
