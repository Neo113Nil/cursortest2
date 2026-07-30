package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.t;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements c {
    private final LineCapType capType;
    private final com.airbnb.lottie.model.animatable.a color;
    private final boolean hidden;
    private final LineJoinType joinType;
    private final List<com.airbnb.lottie.model.animatable.b> lineDashPattern;
    private final float miterLimit;
    private final String name;

    @Nullable
    private final com.airbnb.lottie.model.animatable.b offset;
    private final com.airbnb.lottie.model.animatable.d opacity;
    private final com.airbnb.lottie.model.animatable.b width;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i8 = a.$SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[ordinal()];
            return i8 != 1 ? i8 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i8 = a.$SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[ordinal()];
            if (i8 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i8 == 2) {
                return Paint.Join.MITER;
            }
            if (i8 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType;
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f8, boolean z7) {
        this.name = str;
        this.offset = bVar;
        this.lineDashPattern = list;
        this.color = aVar;
        this.opacity = dVar;
        this.width = bVar2;
        this.capType = lineCapType;
        this.joinType = lineJoinType;
        this.miterLimit = f8;
        this.hidden = z7;
    }

    public LineCapType getCapType() {
        return this.capType;
    }

    public com.airbnb.lottie.model.animatable.a getColor() {
        return this.color;
    }

    public com.airbnb.lottie.model.animatable.b getDashOffset() {
        return this.offset;
    }

    public LineJoinType getJoinType() {
        return this.joinType;
    }

    public List<com.airbnb.lottie.model.animatable.b> getLineDashPattern() {
        return this.lineDashPattern;
    }

    public float getMiterLimit() {
        return this.miterLimit;
    }

    public String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.animatable.d getOpacity() {
        return this.opacity;
    }

    public com.airbnb.lottie.model.animatable.b getWidth() {
        return this.width;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c toContent(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new t(lottieDrawable, bVar, this);
    }
}
