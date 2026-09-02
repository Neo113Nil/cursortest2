package e0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f1131a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f1132b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f1133c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1134e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f1135f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1136g;

    public static d b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        d dVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVar = d.b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d(null, null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f4 = (f2 + 16.0f) / 116.0f;
        float f5 = f2 > 8.0f ? f4 * f4 * f4 : f2 / 903.2963f;
        float f6 = f4 * f4 * f4;
        boolean z3 = f6 > 0.008856452f;
        float f7 = z3 ? f6 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f6 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1133c;
        return f0.a.a(f7 * fArr[0], f5 * fArr[1], f6 * fArr[2]);
    }

    public static float e(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i4;
        String str;
        String str2;
        ?? r3;
        long j4;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            k(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.f719b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.f720c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            k(xmlResourceParser);
                        }
                        arrayList.add(new g(string7, i7, z3, string6, i9, resourceId2));
                    } else {
                        k(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new f((g[]) arrayList.toArray(new g[0]));
        }
        List j5 = j(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b0.a.d);
                    int i11 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = obtainAttributes3;
                            j4 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                k(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j4 = 1;
                            }
                        }
                        try {
                            r3 = obtainAttributes3;
                            str2 = string4;
                            i4 = i11;
                            str = string3;
                            j4 = 1;
                            try {
                                k0.d dVar = new k0.d(string, string2, string8, j5, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r3;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z4 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z4) {
                                                    executorService.shutdownNow();
                                                    z4 = true;
                                                }
                                            }
                                        }
                                        if (z4) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(dVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = obtainAttributes3;
                            j4 = 1;
                            th = th;
                            typedArray = r3;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r3 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r3;
                    if (typedArray != null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z5 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j4, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z5) {
                                    executorService2.shutdownNow();
                                    z5 = true;
                                }
                            }
                        }
                        if (!z5) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i4 = integer;
                str = string3;
                str2 = string4;
                k(xmlResourceParser);
                integer = i4;
                string3 = str;
                string4 = str2;
                i = 2;
                i5 = 0;
                i6 = 3;
            }
        }
        int i12 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new h(arrayList2, i12, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new k0.d(string, string2, str3, j5, null, null));
        if (str4 != null) {
            arrayList2.add(new k0.d(string, string2, str4, j5, null, null));
        }
        return new h(arrayList2, i12, integer2, string5);
    }

    public static List j(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new k(i, 0, this));
    }

    public abstract void g(int i);

    public abstract void h(Typeface typeface);
}
