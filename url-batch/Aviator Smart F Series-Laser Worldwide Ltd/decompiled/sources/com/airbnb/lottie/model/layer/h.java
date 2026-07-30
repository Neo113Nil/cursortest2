package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.t0;
import com.airbnb.lottie.utils.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends com.airbnb.lottie.model.layer.b {
    private final LongSparseArray<String> codePointCache;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorCallbackAnimation;
    private final com.airbnb.lottie.h composition;
    private final Map<com.airbnb.lottie.model.c, List<com.airbnb.lottie.animation.content.d>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private final RectF rectF;
    private final StringBuilder stringBuilder;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a strokeColorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a strokeColorCallbackAnimation;
    private final Paint strokePaint;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a strokeWidthAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a strokeWidthCallbackAnimation;
    private final o textAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a textSizeCallbackAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a trackingAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a trackingCallbackAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a typefaceCallbackAnimation;

    class a extends Paint {
        a(int i8) {
            super(i8);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i8) {
            super(i8);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    h(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        this.stringBuilder = new StringBuilder(2);
        this.rectF = new RectF();
        this.matrix = new Matrix();
        this.fillPaint = new a(1);
        this.strokePaint = new b(1);
        this.contentsForCharacter = new HashMap();
        this.codePointCache = new LongSparseArray<>();
        this.lottieDrawable = lottieDrawable;
        this.composition = layer.getComposition();
        o createAnimation = layer.getText().createAnimation();
        this.textAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        k textProperties = layer.getTextProperties();
        if (textProperties != null && (aVar2 = textProperties.color) != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation2 = aVar2.createAnimation();
            this.colorAnimation = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (textProperties != null && (aVar = textProperties.stroke) != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation3 = aVar.createAnimation();
            this.strokeColorAnimation = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (textProperties != null && (bVar2 = textProperties.strokeWidth) != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation4 = bVar2.createAnimation();
            this.strokeWidthAnimation = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties == null || (bVar = textProperties.tracking) == null) {
            return;
        }
        com.airbnb.lottie.animation.keyframe.a createAnimation5 = bVar.createAnimation();
        this.trackingAnimation = createAnimation5;
        createAnimation5.addUpdateListener(this);
        addAnimation(this.trackingAnimation);
    }

    private void applyJustification(DocumentData.Justification justification, Canvas canvas, float f8) {
        int i8 = c.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[justification.ordinal()];
        if (i8 == 2) {
            canvas.translate(-f8, 0.0f);
        } else {
            if (i8 != 3) {
                return;
            }
            canvas.translate((-f8) / 2.0f, 0.0f);
        }
    }

    private String codePointToString(String str, int i8) {
        int codePointAt = str.codePointAt(i8);
        int charCount = Character.charCount(codePointAt) + i8;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!isModifier(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j8 = codePointAt;
        if (this.codePointCache.containsKey(j8)) {
            return this.codePointCache.get(j8);
        }
        this.stringBuilder.setLength(0);
        while (i8 < charCount) {
            int codePointAt3 = str.codePointAt(i8);
            this.stringBuilder.appendCodePoint(codePointAt3);
            i8 += Character.charCount(codePointAt3);
        }
        String sb = this.stringBuilder.toString();
        this.codePointCache.put(j8, sb);
        return sb;
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void drawCharacterAsGlyph(com.airbnb.lottie.model.c cVar, Matrix matrix, float f8, DocumentData documentData, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> contentsForCharacter = getContentsForCharacter(cVar);
        for (int i8 = 0; i8 < contentsForCharacter.size(); i8++) {
            Path path = contentsForCharacter.get(i8).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.set(matrix);
            this.matrix.preTranslate(0.0f, (-documentData.baselineShift) * j.dpScale());
            this.matrix.preScale(f8, f8);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                drawGlyph(path, this.strokePaint, canvas);
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                drawGlyph(path, this.fillPaint, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            drawCharacter(str, this.strokePaint, canvas);
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            drawCharacter(str, this.fillPaint, canvas);
        }
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f8) {
        int i8 = 0;
        while (i8 < str.length()) {
            String codePointToString = codePointToString(str, i8);
            i8 += codePointToString.length();
            drawCharacterFromFont(codePointToString, documentData, canvas);
            canvas.translate(this.fillPaint.measureText(codePointToString) + f8, 0.0f);
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas, float f8, float f9) {
        float floatValue;
        for (int i8 = 0; i8 < str.length(); i8++) {
            com.airbnb.lottie.model.c cVar = this.composition.getCharacters().get(com.airbnb.lottie.model.c.hashFor(str.charAt(i8), bVar.getFamily(), bVar.getStyle()));
            if (cVar != null) {
                drawCharacterAsGlyph(cVar, matrix, f9, documentData, canvas);
                float width = ((float) cVar.getWidth()) * f9 * j.dpScale() * f8;
                float f10 = documentData.tracking / 10.0f;
                com.airbnb.lottie.animation.keyframe.a aVar = this.trackingCallbackAnimation;
                if (aVar != null) {
                    floatValue = ((Float) aVar.getValue()).floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.a aVar2 = this.trackingAnimation;
                    if (aVar2 != null) {
                        floatValue = ((Float) aVar2.getValue()).floatValue();
                    }
                    canvas.translate(width + (f10 * f8), 0.0f);
                }
                f10 += floatValue;
                canvas.translate(width + (f10 * f8), 0.0f);
            }
        }
    }

    private void drawTextGlyphs(DocumentData documentData, Matrix matrix, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        com.airbnb.lottie.animation.keyframe.a aVar = this.textSizeCallbackAnimation;
        float floatValue = (aVar != null ? ((Float) aVar.getValue()).floatValue() : documentData.size) / 100.0f;
        float scale = j.getScale(matrix);
        String str = documentData.text;
        float dpScale = documentData.lineHeight * j.dpScale();
        List<String> textLines = getTextLines(str);
        int size = textLines.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = textLines.get(i8);
            float textLineWidthForGlyphs = getTextLineWidthForGlyphs(str2, bVar, floatValue, scale);
            canvas.save();
            applyJustification(documentData.justification, canvas, textLineWidthForGlyphs);
            canvas.translate(0.0f, (i8 * dpScale) - (((size - 1) * dpScale) / 2.0f));
            drawGlyphTextLine(str2, documentData, matrix, bVar, canvas, scale, floatValue);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[LOOP:0: B:16:0x0091->B:17:0x0093, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawTextWithFont(DocumentData documentData, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        float floatValue;
        int size;
        int i8;
        Typeface typeface = getTypeface(bVar);
        if (typeface == null) {
            return;
        }
        String str = documentData.text;
        t0 textDelegate = this.lottieDrawable.getTextDelegate();
        if (textDelegate != null) {
            str = textDelegate.getTextInternal(getName(), str);
        }
        this.fillPaint.setTypeface(typeface);
        com.airbnb.lottie.animation.keyframe.a aVar = this.textSizeCallbackAnimation;
        float floatValue2 = aVar != null ? ((Float) aVar.getValue()).floatValue() : documentData.size;
        this.fillPaint.setTextSize(j.dpScale() * floatValue2);
        this.strokePaint.setTypeface(this.fillPaint.getTypeface());
        this.strokePaint.setTextSize(this.fillPaint.getTextSize());
        float dpScale = documentData.lineHeight * j.dpScale();
        float f8 = documentData.tracking / 10.0f;
        com.airbnb.lottie.animation.keyframe.a aVar2 = this.trackingCallbackAnimation;
        if (aVar2 == null) {
            com.airbnb.lottie.animation.keyframe.a aVar3 = this.trackingAnimation;
            if (aVar3 != null) {
                floatValue = ((Float) aVar3.getValue()).floatValue();
            }
            float dpScale2 = ((f8 * j.dpScale()) * floatValue2) / 100.0f;
            List<String> textLines = getTextLines(str);
            size = textLines.size();
            for (i8 = 0; i8 < size; i8++) {
                String str2 = textLines.get(i8);
                float measureText = this.strokePaint.measureText(str2) + ((str2.length() - 1) * dpScale2);
                canvas.save();
                applyJustification(documentData.justification, canvas, measureText);
                canvas.translate(0.0f, (i8 * dpScale) - (((size - 1) * dpScale) / 2.0f));
                drawFontTextLine(str2, documentData, canvas, dpScale2);
                canvas.restore();
            }
        }
        floatValue = ((Float) aVar2.getValue()).floatValue();
        f8 += floatValue;
        float dpScale22 = ((f8 * j.dpScale()) * floatValue2) / 100.0f;
        List<String> textLines2 = getTextLines(str);
        size = textLines2.size();
        while (i8 < size) {
        }
    }

    private List<com.airbnb.lottie.animation.content.d> getContentsForCharacter(com.airbnb.lottie.model.c cVar) {
        if (this.contentsForCharacter.containsKey(cVar)) {
            return this.contentsForCharacter.get(cVar);
        }
        List<l> shapes = cVar.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.lottieDrawable, this, shapes.get(i8)));
        }
        this.contentsForCharacter.put(cVar, arrayList);
        return arrayList;
    }

    private float getTextLineWidthForGlyphs(String str, com.airbnb.lottie.model.b bVar, float f8, float f9) {
        float f10 = 0.0f;
        for (int i8 = 0; i8 < str.length(); i8++) {
            com.airbnb.lottie.model.c cVar = this.composition.getCharacters().get(com.airbnb.lottie.model.c.hashFor(str.charAt(i8), bVar.getFamily(), bVar.getStyle()));
            if (cVar != null) {
                f10 = (float) (f10 + (cVar.getWidth() * f8 * j.dpScale() * f9));
            }
        }
        return f10;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Nullable
    private Typeface getTypeface(com.airbnb.lottie.model.b bVar) {
        Typeface typeface;
        com.airbnb.lottie.animation.keyframe.a aVar = this.typefaceCallbackAnimation;
        if (aVar != null && (typeface = (Typeface) aVar.getValue()) != null) {
            return typeface;
        }
        Typeface typeface2 = this.lottieDrawable.getTypeface(bVar.getFamily(), bVar.getStyle());
        return typeface2 != null ? typeface2 : bVar.getTypeface();
    }

    private boolean isModifier(int i8) {
        return Character.getType(i8) == 16 || Character.getType(i8) == 27 || Character.getType(i8) == 6 || Character.getType(i8) == 28 || Character.getType(i8) == 8 || Character.getType(i8) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.COLOR) {
            com.airbnb.lottie.animation.keyframe.a aVar = this.colorCallbackAnimation;
            if (aVar != null) {
                removeAnimation(aVar);
            }
            if (cVar == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            q qVar = new q(cVar);
            this.colorCallbackAnimation = qVar;
            qVar.addUpdateListener(this);
            addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t7 == n0.STROKE_COLOR) {
            com.airbnb.lottie.animation.keyframe.a aVar2 = this.strokeColorCallbackAnimation;
            if (aVar2 != null) {
                removeAnimation(aVar2);
            }
            if (cVar == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.strokeColorCallbackAnimation = qVar2;
            qVar2.addUpdateListener(this);
            addAnimation(this.strokeColorCallbackAnimation);
            return;
        }
        if (t7 == n0.STROKE_WIDTH) {
            com.airbnb.lottie.animation.keyframe.a aVar3 = this.strokeWidthCallbackAnimation;
            if (aVar3 != null) {
                removeAnimation(aVar3);
            }
            if (cVar == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.strokeWidthCallbackAnimation = qVar3;
            qVar3.addUpdateListener(this);
            addAnimation(this.strokeWidthCallbackAnimation);
            return;
        }
        if (t7 == n0.TEXT_TRACKING) {
            com.airbnb.lottie.animation.keyframe.a aVar4 = this.trackingCallbackAnimation;
            if (aVar4 != null) {
                removeAnimation(aVar4);
            }
            if (cVar == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.trackingCallbackAnimation = qVar4;
            qVar4.addUpdateListener(this);
            addAnimation(this.trackingCallbackAnimation);
            return;
        }
        if (t7 == n0.TEXT_SIZE) {
            com.airbnb.lottie.animation.keyframe.a aVar5 = this.textSizeCallbackAnimation;
            if (aVar5 != null) {
                removeAnimation(aVar5);
            }
            if (cVar == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.textSizeCallbackAnimation = qVar5;
            qVar5.addUpdateListener(this);
            addAnimation(this.textSizeCallbackAnimation);
            return;
        }
        if (t7 != n0.TYPEFACE) {
            if (t7 == n0.TEXT) {
                this.textAnimation.setStringValueCallback(cVar);
                return;
            }
            return;
        }
        com.airbnb.lottie.animation.keyframe.a aVar6 = this.typefaceCallbackAnimation;
        if (aVar6 != null) {
            removeAnimation(aVar6);
        }
        if (cVar == null) {
            this.typefaceCallbackAnimation = null;
            return;
        }
        q qVar6 = new q(cVar);
        this.typefaceCallbackAnimation = qVar6;
        qVar6.addUpdateListener(this);
        addAnimation(this.typefaceCallbackAnimation);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        canvas.save();
        if (!this.lottieDrawable.useTextGlyphs()) {
            canvas.concat(matrix);
        }
        DocumentData documentData = (DocumentData) this.textAnimation.getValue();
        com.airbnb.lottie.model.b bVar = this.composition.getFonts().get(documentData.fontName);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        com.airbnb.lottie.animation.keyframe.a aVar = this.colorCallbackAnimation;
        if (aVar != null) {
            this.fillPaint.setColor(((Integer) aVar.getValue()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a aVar2 = this.colorAnimation;
            if (aVar2 != null) {
                this.fillPaint.setColor(((Integer) aVar2.getValue()).intValue());
            } else {
                this.fillPaint.setColor(documentData.color);
            }
        }
        com.airbnb.lottie.animation.keyframe.a aVar3 = this.strokeColorCallbackAnimation;
        if (aVar3 != null) {
            this.strokePaint.setColor(((Integer) aVar3.getValue()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a aVar4 = this.strokeColorAnimation;
            if (aVar4 != null) {
                this.strokePaint.setColor(((Integer) aVar4.getValue()).intValue());
            } else {
                this.strokePaint.setColor(documentData.strokeColor);
            }
        }
        int intValue = ((this.transform.getOpacity() == null ? 100 : ((Integer) this.transform.getOpacity().getValue()).intValue()) * 255) / 100;
        this.fillPaint.setAlpha(intValue);
        this.strokePaint.setAlpha(intValue);
        com.airbnb.lottie.animation.keyframe.a aVar5 = this.strokeWidthCallbackAnimation;
        if (aVar5 != null) {
            this.strokePaint.setStrokeWidth(((Float) aVar5.getValue()).floatValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a aVar6 = this.strokeWidthAnimation;
            if (aVar6 != null) {
                this.strokePaint.setStrokeWidth(((Float) aVar6.getValue()).floatValue());
            } else {
                this.strokePaint.setStrokeWidth(documentData.strokeWidth * j.dpScale() * j.getScale(matrix));
            }
        }
        if (this.lottieDrawable.useTextGlyphs()) {
            drawTextGlyphs(documentData, matrix, bVar, canvas);
        } else {
            drawTextWithFont(documentData, bVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        super.getBounds(rectF, matrix, z7);
        rectF.set(0.0f, 0.0f, this.composition.getBounds().width(), this.composition.getBounds().height());
    }
}
