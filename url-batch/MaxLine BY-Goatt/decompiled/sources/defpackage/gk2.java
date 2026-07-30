package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import com.majelw.libystne.R;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gk2 {
    public static x01 a;

    public static oq2 a() {
        return new oq2(null);
    }

    public static final w72 b(ca0 ca0Var, int i, xy2 xy2Var, bw2 bw2Var, boolean z, int i2) {
        w72 c = bw2Var != null ? bw2Var.c(xy2Var.b.g(i)) : w72.e;
        float f = c.a;
        int R = ca0Var.R(eu2.a);
        return new w72(z ? (i2 - f) - R : f, c.b, z ? i2 - f : R + f, c.d);
    }

    public static final Object c(b32 b32Var, String str, r30 r30Var) {
        Object b = b32Var.b(str, new de2(26), r30Var);
        return b == b50.m ? b : Unit.a;
    }

    public static int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        lh.e(in1.k(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final int e(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean f(float f, float f2, oa oaVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        oa a2 = qa.a();
        Path path = a2.a;
        pz1[] pz1VarArr = pz1.m;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            qa.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a2.b == null) {
            a2.b = new RectF();
        }
        RectF rectF = a2.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        oa a3 = qa.a();
        Path path2 = a3.a;
        a3.d(oaVar, a2, 1);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static final boolean g(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static String h(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
