package io.noties.markwon.utils;

import android.opengl.GLES20;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class ColorUtils {
    public static int applyAlpha(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    public static void checkNonNegative(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void checkRoundingUnnecessary(boolean z) {
        if (z) {
            return;
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("mode was UNNECESSARY, but rounding was necessary");
    }

    public static int compile(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        Timber.Forest forest = Timber.Forest;
        forest.tag("ShadowPassShaders");
        forest.e("Shadow %s shader compile failed: %s", i == 35633 ? "vertex" : BreadcrumbHelper.Category.FRAGMENT, glGetShaderInfoLog);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static int linkProgram(String str) {
        int compile = compile(35633, str);
        int compile2 = compile(35632, "\n    precision mediump float;\n    void main() {}\n  ");
        if (compile == 0 || compile2 == 0) {
            if (compile != 0) {
                GLES20.glDeleteShader(compile);
            }
            if (compile2 != 0) {
                GLES20.glDeleteShader(compile2);
            }
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, compile);
        GLES20.glAttachShader(glCreateProgram, compile2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glDeleteShader(compile);
        GLES20.glDeleteShader(compile2);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        Timber.Forest forest = Timber.Forest;
        forest.tag("ShadowPassShaders");
        forest.e("Shadow program link failed: %s", glGetProgramInfoLog);
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }
}
