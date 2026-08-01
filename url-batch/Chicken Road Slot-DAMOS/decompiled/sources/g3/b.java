package g3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f4236a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f4237b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f4238c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f4239d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int b(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f10 = (f3 + 16.0f) / 116.0f;
        float f11 = f3 > 8.0f ? f10 * f10 * f10 : f3 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z10 = f12 > 0.008856452f;
        float f13 = z10 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f4238c;
        return h3.a.a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float c(int i3) {
        float f3 = i3 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d d(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i3;
        int i10;
        String str;
        int i11;
        ?? r42;
        long j;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i3 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            f(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d3.a.f3611b);
        int i12 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i13 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d3.a.f3612c);
                        int i14 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i15 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i16 = obtainAttributes2.getInt(i15, 0);
                        int i17 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i17, 0);
                        String string7 = obtainAttributes2.getString(i17);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            f(xmlResourceParser);
                        }
                        arrayList.add(new f(string7, i14, z10, string6, i16, resourceId2));
                    } else {
                        f(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List e2 = e(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i13) {
            if (xmlResourceParser.getEventType() == i3) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d3.a.f3613d);
                    int i18 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i12);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i3);
                        if (string8 == null) {
                            r42 = obtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                f(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            str = string5;
                            r42 = obtainAttributes3;
                            i11 = i18;
                            i10 = integer2;
                            j = 1;
                            try {
                                l3.c cVar = new l3.c(string, string2, string8, e2, string9, string10);
                                if (r42 instanceof AutoCloseable) {
                                    ((AutoCloseable) r42).close();
                                } else if (r42 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r42;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z11 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r42.recycle();
                                }
                                arrayList2.add(cVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r42 = obtainAttributes3;
                            j = 1;
                            th = th;
                            typedArray = r42;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r42 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r42;
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
                        boolean z12 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z12) {
                                    executorService2.shutdownNow();
                                    z12 = true;
                                }
                            }
                        }
                        if (!z12) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i10 = integer2;
                str = string5;
                i11 = integer;
                f(xmlResourceParser);
                integer = i11;
                integer2 = i10;
                string5 = str;
                i3 = 2;
                i12 = 0;
                i13 = 3;
            }
        }
        int i19 = integer2;
        String str2 = string5;
        int i20 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i20, i19, str2);
        }
        if (string3 == null) {
            a1.e("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new l3.c(string, string2, string3, e2, null, null));
        if (string4 != null) {
            arrayList2.add(new l3.c(string, string2, string4, e2, null, null));
        }
        return new g(arrayList2, i20, i19, str2);
    }

    public static List e(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
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
                String[] stringArray2 = resources.getStringArray(i3);
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

    public static void f(XmlPullParser xmlPullParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static float g() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
