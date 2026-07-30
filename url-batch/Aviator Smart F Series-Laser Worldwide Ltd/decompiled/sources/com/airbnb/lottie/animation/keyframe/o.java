package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes.dex */
public class o extends g {

    class a extends com.airbnb.lottie.value.c {
        final /* synthetic */ DocumentData val$documentData;
        final /* synthetic */ com.airbnb.lottie.value.b val$stringFrameInfo;
        final /* synthetic */ com.airbnb.lottie.value.c val$valueCallback;

        a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.c cVar, DocumentData documentData) {
            this.val$stringFrameInfo = bVar;
            this.val$valueCallback = cVar;
            this.val$documentData = documentData;
        }

        @Override // com.airbnb.lottie.value.c
        public DocumentData getValue(com.airbnb.lottie.value.b bVar) {
            this.val$stringFrameInfo.set(bVar.getStartFrame(), bVar.getEndFrame(), ((DocumentData) bVar.getStartValue()).text, ((DocumentData) bVar.getEndValue()).text, bVar.getLinearKeyframeProgress(), bVar.getInterpolatedKeyframeProgress(), bVar.getOverallProgress());
            String str = (String) this.val$valueCallback.getValue(this.val$stringFrameInfo);
            DocumentData documentData = (DocumentData) (bVar.getInterpolatedKeyframeProgress() == 1.0f ? bVar.getEndValue() : bVar.getStartValue());
            this.val$documentData.set(str, documentData.fontName, documentData.size, documentData.justification, documentData.tracking, documentData.lineHeight, documentData.baselineShift, documentData.color, documentData.strokeColor, documentData.strokeWidth, documentData.strokeOverFill);
            return this.val$documentData;
        }
    }

    public o(List<com.airbnb.lottie.value.a> list) {
        super(list);
    }

    public void setStringValueCallback(com.airbnb.lottie.value.c cVar) {
        super.setValueCallback(new a(new com.airbnb.lottie.value.b(), cVar, new DocumentData()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public DocumentData getValue(com.airbnb.lottie.value.a aVar, float f8) {
        Object obj;
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        if (cVar == null) {
            return (f8 != 1.0f || (obj = aVar.endValue) == null) ? (DocumentData) aVar.startValue : (DocumentData) obj;
        }
        float f9 = aVar.startFrame;
        Float f10 = aVar.endFrame;
        float floatValue = f10 == null ? Float.MAX_VALUE : f10.floatValue();
        Object obj2 = aVar.startValue;
        DocumentData documentData = (DocumentData) obj2;
        Object obj3 = aVar.endValue;
        return (DocumentData) cVar.getValueInternal(f9, floatValue, documentData, obj3 == null ? (DocumentData) obj2 : (DocumentData) obj3, f8, getInterpolatedCurrentKeyframeProgress(), getProgress());
    }
}
