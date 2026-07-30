package u2;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f8970a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f8971b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f8972c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f8973d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int b(float f9) {
        if (f9 < 1.0f) {
            return -16777216;
        }
        if (f9 > 99.0f) {
            return -1;
        }
        float f10 = (f9 + 16.0f) / 116.0f;
        float f11 = f9 > 8.0f ? f10 * f10 * f10 : f9 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z8 = f12 > 0.008856452f;
        float f13 = z8 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z8) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f8972c;
        return v2.a.a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float c(int i7) {
        float f9 = i7 / 255.0f;
        return (f9 <= 0.04045f ? f9 / 12.92f : (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float d() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
