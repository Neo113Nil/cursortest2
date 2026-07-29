package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.google.android.gms.games.GamesStatusCodes;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public class f implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private float[] f1541a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f1542b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, a.l);
        a(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData == null) {
                throw new InflateException("The path is null, which is created from " + namedString);
            }
            a(createPathFromPathData);
            return;
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
        if (hasAttribute != TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (!hasAttribute) {
            a(namedFloat, namedFloat2);
        } else {
            a(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        }
    }

    private void a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        a(path);
    }

    private void a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        a(path);
    }

    private void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1541a = new float[min];
        this.f1542b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f1541a[i2] = fArr[0];
            this.f1542b[i2] = fArr[1];
        }
        if (Math.abs(this.f1541a[0]) <= 1.0E-5d && Math.abs(this.f1542b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f1541a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f1542b[i3] - 1.0f) <= 1.0E-5d) {
                int i4 = 0;
                float f = 0.0f;
                while (i < min) {
                    int i5 = i4 + 1;
                    float f2 = this.f1541a[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    this.f1541a[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1541a[0]);
        sb.append(",");
        sb.append(this.f1542b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f1541a[i6]);
        sb.append(",");
        sb.append(this.f1542b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f1541a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f1541a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f1541a[length] - this.f1541a[i];
        if (f2 == 0.0f) {
            return this.f1542b[i];
        }
        float f3 = (f - this.f1541a[i]) / f2;
        float f4 = this.f1542b[i];
        return f4 + (f3 * (this.f1542b[length] - f4));
    }
}
