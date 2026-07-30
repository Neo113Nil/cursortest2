package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, f6.l lVar) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, f6.l lVar) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f8, float f9, float f10, f6.l lVar) {
        int save = canvas.save();
        canvas.rotate(f8, f9, f10);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f8, float f9, float f10, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f8, f9, f10);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withSave(Canvas canvas, f6.l lVar) {
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withScale(Canvas canvas, float f8, float f9, float f10, float f11, f6.l lVar) {
        int save = canvas.save();
        canvas.scale(f8, f9, f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f8, float f9, float f10, float f11, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i8 & 8) != 0) {
            f11 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f8, f9, f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f8, float f9, f6.l lVar) {
        int save = canvas.save();
        canvas.skew(f8, f9);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f8, float f9, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f8, f9);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f8, float f9, f6.l lVar) {
        int save = canvas.save();
        canvas.translate(f8, f9);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f8, float f9, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f8, f9);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, f6.l lVar) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, int i8, int i9, int i10, int i11, f6.l lVar) {
        int save = canvas.save();
        canvas.clipRect(i8, i9, i10, i11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, float f8, float f9, float f10, float f11, f6.l lVar) {
        int save = canvas.save();
        canvas.clipRect(f8, f9, f10, f11);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, f6.l lVar) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }
}
