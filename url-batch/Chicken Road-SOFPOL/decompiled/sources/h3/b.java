package h3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f3126a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f3127b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f3128c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f3129d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int b(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f8 = (f6 + 16.0f) / 116.0f;
        float f9 = f6 > 8.0f ? f8 * f8 * f8 : f6 / 903.2963f;
        float f10 = f8 * f8 * f8;
        boolean z3 = f10 > 0.008856452f;
        float f11 = z3 ? f10 : ((f8 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f10 = ((f8 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3128c;
        return i3.a.a(f11 * fArr[0], f9 * fArr[1], f10 * fArr[2]);
    }

    public static float c(int i) {
        float f6 = i / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
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
    public static d f(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i8;
        String str;
        String str2;
        ?? r32;
        long j7;
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
            h(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), e3.a.f2485b);
        int i9 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i10 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), e3.a.f2486c);
                        int i11 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i12 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i13 = obtainAttributes2.getInt(i12, 0);
                        int i14 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i14, 0);
                        String string7 = obtainAttributes2.getString(i14);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            h(xmlResourceParser);
                        }
                        arrayList.add(new f(string7, i11, z3, string6, i13, resourceId2));
                    } else {
                        h(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List g3 = g(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i10) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), e3.a.f2487d);
                    int i15 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i9);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            r32 = obtainAttributes3;
                            j7 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                h(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j7 = 1;
                            }
                        }
                        try {
                            r32 = obtainAttributes3;
                            str2 = string4;
                            i8 = i15;
                            str = string3;
                            j7 = 1;
                            try {
                                n3.c cVar = new n3.c(string, string2, string8, g3, string9, string10);
                                if (r32 instanceof AutoCloseable) {
                                    ((AutoCloseable) r32).close();
                                } else if (r32 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r32;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z7 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z7) {
                                                    executorService.shutdownNow();
                                                    z7 = true;
                                                }
                                            }
                                        }
                                        if (z7) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r32.recycle();
                                }
                                arrayList2.add(cVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r32 = obtainAttributes3;
                            j7 = 1;
                            th = th;
                            typedArray = r32;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r32 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r32;
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
                        boolean z8 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j7, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z8) {
                                    executorService2.shutdownNow();
                                    z8 = true;
                                }
                            }
                        }
                        if (!z8) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i8 = integer;
                str = string3;
                str2 = string4;
                h(xmlResourceParser);
                integer = i8;
                string3 = str;
                string4 = str2;
                i = 2;
                i9 = 0;
                i10 = 3;
            }
        }
        int i16 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i16, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new n3.c(string, string2, str3, g3, null, null));
        if (str4 != null) {
            arrayList2.add(new n3.c(string, string2, str4, g3, null, null));
        }
        return new g(arrayList2, i16, integer2, string5);
    }

    public static List g(Resources resources, int i) {
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
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
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

    public static void h(XmlPullParser xmlPullParser) {
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

    public static float i() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new j(i, 0, this));
    }

    public abstract void d(int i);

    public abstract void e(Typeface typeface);
}
