package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vd {
    public static final vl a;
    public static final qs b;
    private static Paint c;

    static {
        yk.f("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            a = new vi();
        } else if (Build.VERSION.SDK_INT >= 29) {
            a = new vh();
        } else {
            a = new vg();
        }
        b = new qs(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = a.d(context, resources, i, str, i3);
        if (d != null) {
            b.b(d(resources, i, str, i2, i3), d);
        }
        return d;
    }

    public static Typeface b(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font c(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
