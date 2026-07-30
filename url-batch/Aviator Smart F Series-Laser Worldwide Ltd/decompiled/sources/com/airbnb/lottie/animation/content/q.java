package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q implements s, a.b {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a roundedCorners;

    @Nullable
    private com.airbnb.lottie.model.content.j shapeData;

    public q(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.i iVar) {
        this.lottieDrawable = lottieDrawable;
        this.name = iVar.getName();
        com.airbnb.lottie.animation.keyframe.a createAnimation = iVar.getCornerRadius().createAnimation();
        this.roundedCorners = createAnimation;
        bVar.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    private static int floorDiv(int i8, int i9) {
        int i10 = i8 / i9;
        return ((i8 ^ i9) >= 0 || i9 * i10 == i8) ? i10 : i10 - 1;
    }

    private static int floorMod(int i8, int i9) {
        return i8 - (floorDiv(i8, i9) * i9);
    }

    @NonNull
    private com.airbnb.lottie.model.content.j getShapeData(com.airbnb.lottie.model.content.j jVar) {
        List<com.airbnb.lottie.model.a> curves = jVar.getCurves();
        boolean isClosed = jVar.isClosed();
        int size = curves.size() - 1;
        int i8 = 0;
        while (size >= 0) {
            com.airbnb.lottie.model.a aVar = curves.get(size);
            com.airbnb.lottie.model.a aVar2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || isClosed) ? aVar2.getVertex() : jVar.getInitialPoint();
            i8 = (((size != 0 || isClosed) ? aVar2.getControlPoint2() : vertex).equals(vertex) && aVar.getControlPoint1().equals(vertex) && !(!jVar.isClosed() && size == 0 && size == curves.size() - 1)) ? i8 + 2 : i8 + 1;
            size--;
        }
        com.airbnb.lottie.model.content.j jVar2 = this.shapeData;
        if (jVar2 == null || jVar2.getCurves().size() != i8) {
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList.add(new com.airbnb.lottie.model.a());
            }
            this.shapeData = new com.airbnb.lottie.model.content.j(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(isClosed);
        return this.shapeData;
    }

    @Override // com.airbnb.lottie.animation.content.s, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.animation.keyframe.a getRoundedCorners() {
        return this.roundedCorners;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // com.airbnb.lottie.animation.content.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.airbnb.lottie.model.content.j modifyShape(com.airbnb.lottie.model.content.j jVar) {
        List<com.airbnb.lottie.model.a> list;
        List<com.airbnb.lottie.model.a> curves = jVar.getCurves();
        if (curves.size() <= 2) {
            return jVar;
        }
        float floatValue = ((Float) this.roundedCorners.getValue()).floatValue();
        if (floatValue == 0.0f) {
            return jVar;
        }
        com.airbnb.lottie.model.content.j shapeData = getShapeData(jVar);
        shapeData.setInitialPoint(jVar.getInitialPoint().x, jVar.getInitialPoint().y);
        List<com.airbnb.lottie.model.a> curves2 = shapeData.getCurves();
        boolean isClosed = jVar.isClosed();
        int i8 = 0;
        int i9 = 0;
        while (i8 < curves.size()) {
            com.airbnb.lottie.model.a aVar = curves.get(i8);
            com.airbnb.lottie.model.a aVar2 = curves.get(floorMod(i8 - 1, curves.size()));
            com.airbnb.lottie.model.a aVar3 = curves.get(floorMod(i8 - 2, curves.size()));
            PointF vertex = (i8 != 0 || isClosed) ? aVar2.getVertex() : jVar.getInitialPoint();
            PointF controlPoint2 = (i8 != 0 || isClosed) ? aVar2.getControlPoint2() : vertex;
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF vertex2 = aVar3.getVertex();
            PointF vertex3 = aVar.getVertex();
            boolean z7 = !jVar.isClosed() && i8 == 0;
            if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z7) {
                float f8 = vertex.x;
                float f9 = f8 - vertex2.x;
                float f10 = vertex.y;
                float f11 = f10 - vertex2.y;
                float f12 = vertex3.x - f8;
                float f13 = vertex3.y - f10;
                list = curves;
                float hypot = (float) Math.hypot(f9, f11);
                float hypot2 = (float) Math.hypot(f12, f13);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f14 = vertex.x;
                float f15 = ((vertex2.x - f14) * min) + f14;
                float f16 = vertex.y;
                float f17 = ((vertex2.y - f16) * min) + f16;
                float f18 = ((vertex3.x - f14) * min2) + f14;
                float f19 = ((vertex3.y - f16) * min2) + f16;
                float f20 = f15 - ((f15 - f14) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f21 = f17 - ((f17 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f22 = f18 - ((f18 - f14) * ROUNDED_CORNER_MAGIC_NUMBER);
                float f23 = f19 - ((f19 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                com.airbnb.lottie.model.a aVar4 = curves2.get(floorMod(i9 - 1, curves2.size()));
                com.airbnb.lottie.model.a aVar5 = curves2.get(i9);
                aVar4.setControlPoint2(f15, f17);
                aVar4.setVertex(f15, f17);
                if (i8 == 0) {
                    shapeData.setInitialPoint(f15, f17);
                }
                aVar5.setControlPoint1(f20, f21);
                com.airbnb.lottie.model.a aVar6 = curves2.get(i9 + 1);
                aVar5.setControlPoint2(f22, f23);
                aVar5.setVertex(f18, f19);
                aVar6.setControlPoint1(f18, f19);
                i9 += 2;
            } else {
                list = curves;
                com.airbnb.lottie.model.a aVar7 = curves2.get(floorMod(i9 - 1, curves2.size()));
                com.airbnb.lottie.model.a aVar8 = curves2.get(i9);
                aVar7.setControlPoint2(aVar2.getVertex().x, aVar2.getVertex().y);
                aVar7.setVertex(aVar2.getVertex().x, aVar2.getVertex().y);
                aVar8.setControlPoint1(aVar.getVertex().x, aVar.getVertex().y);
                i9++;
            }
            i8++;
            curves = list;
        }
        return shapeData;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.s, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
    }
}
