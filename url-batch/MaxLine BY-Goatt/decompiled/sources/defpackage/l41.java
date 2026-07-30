package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.util.Base64;
import android.util.Xml;
import android.view.DragEvent;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.ServiceStarter;
import com.majelw.libystne.R;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class l41 {
    public static final o30[] a = new o30[0];
    public static final my b = new my(1719107799, new ww(5), false);
    public static final my c = new my(710529295, new ww(6), false);
    public static final cc0 d = new cc0();
    public static final int[][] e = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] g = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, FacebookRequestErrorClassification.EC_INVALID_SESSION, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, FacebookRequestErrorClassification.EC_INVALID_SESSION, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, FacebookRequestErrorClassification.EC_INVALID_SESSION, 126, 150}, new int[]{6, 24, 50, 76, FacebookRequestErrorClassification.EC_INVALID_SESSION, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] h = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final qa2 i = new qa2(0.16f, 0.1f, 0.08f, 0.1f);
    public static final long j = Long.MIN_VALUE;
    public static final /* synthetic */ int k = 0;

    public static void A(int i2, int i3, yq yqVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = e[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                yqVar.s(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void B(int i2, int i3, yq yqVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!M(yqVar.r(i2, i5))) {
                throw new l93();
            }
            yqVar.s(i2, i5, 0);
        }
    }

    public static final void C(CoroutineContext coroutineContext) {
        g61 g61Var = (g61) coroutineContext.m(qb2.U);
        if (g61Var != null && !g61Var.b()) {
            throw g61Var.v();
        }
    }

    public static final CoroutineContext D(lb2 lb2Var, boolean z, r30 r30Var) {
        if (!lb2Var.g()) {
            m30 m30Var = lb2Var.a;
            if (m30Var != null) {
                return m30Var.m;
            }
            Intrinsics.f("coroutineScope");
            throw null;
        }
        sy2 sy2Var = (sy2) r30Var.getContext().m(sy2.o);
        if (sy2Var != null) {
            e eVar = sy2Var.m;
            m30 m30Var2 = lb2Var.a;
            if (m30Var2 == null) {
                Intrinsics.f("coroutineScope");
                throw null;
            }
            CoroutineContext p = m30Var2.m.p(eVar);
            if (p != null) {
                return p;
            }
        }
        if (z) {
            CoroutineContext coroutineContext = lb2Var.b;
            if (coroutineContext != null) {
                return coroutineContext;
            }
            Intrinsics.f("transactionContext");
            throw null;
        }
        m30 m30Var3 = lb2Var.a;
        if (m30Var3 != null) {
            return m30Var3.m;
        }
        Intrinsics.f("coroutineScope");
        throw null;
    }

    public static final g61 E(CoroutineContext coroutineContext) {
        g61 g61Var = (g61) coroutineContext.m(qb2.U);
        if (g61Var != null) {
            return g61Var;
        }
        dm0.i(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final long F(ar0 ar0Var) {
        DragEvent dragEvent = (DragEvent) ar0Var.n;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final int G(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                lh.e("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final int H(ii iiVar, Object obj, int i2) {
        int i3 = iiVar.o;
        if (i3 == 0) {
            return -1;
        }
        try {
            int o = yk3.o(i3, i2, iiVar.m);
            if (o < 0 || Intrinsics.b(obj, iiVar.n[o])) {
                return o;
            }
            int i4 = o + 1;
            while (i4 < i3 && iiVar.m[i4] == i2) {
                if (Intrinsics.b(obj, iiVar.n[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = o - 1; i5 >= 0 && iiVar.m[i5] == i2; i5--) {
                if (Intrinsics.b(obj, iiVar.n[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final float[] I(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final void J(a00 a00Var, Function2 function2) {
        function2.getClass();
        s03.f(2, function2);
        function2.invoke(a00Var, 1);
    }

    public static final ec0 K(g61 g61Var, boolean z, j61 j61Var) {
        if (g61Var instanceof n61) {
            return ((n61) g61Var).S(z, j61Var);
        }
        return g61Var.q(j61Var.r(), z, new rk(1, j61Var, j61.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 4));
    }

    public static final boolean L(CoroutineContext coroutineContext) {
        g61 g61Var = (g61) coroutineContext.m(qb2.U);
        if (g61Var != null) {
            return g61Var.b();
        }
        return true;
    }

    public static boolean M(int i2) {
        return i2 == -1;
    }

    public static final boolean N(k70 k70Var, int i2, int i3) {
        k70Var.getClass();
        if (i2 > i3 && k70Var.j) {
            return false;
        }
        Set set = k70Var.k;
        return k70Var.i && (set == null || !set.contains(Integer.valueOf(i2)));
    }

    public static final boolean O(ub2 ub2Var) {
        long j2 = ub2Var.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == ub2Var.f && j2 == ub2Var.g && j2 == ub2Var.h;
    }

    public static final float[] P(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] Q(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final dq1 R(Function1 function1) {
        eq1 eq1Var = new eq1();
        function1.invoke(eq1Var);
        boolean z = eq1Var.b;
        boolean z2 = eq1Var.c;
        int i2 = eq1Var.d;
        boolean z3 = eq1Var.e;
        ak0 ak0Var = eq1Var.a;
        return new dq1(z, z2, i2, false, z3, ak0Var.m, ak0Var.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.content.res.TypedArray] */
    public static yp0 S(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        String str;
        ArrayList arrayList;
        int i4;
        List list;
        ?? r5;
        long j2;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            b0(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z52.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, ServiceStarter.ERROR_UNKNOWN);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z52.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            b0(xmlResourceParser);
                        }
                        arrayList2.add(new aq0(i7, i9, resourceId2, string7, string6, z));
                    } else {
                        b0(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new zp0((aq0[]) arrayList2.toArray(new aq0[0]));
        }
        List V = V(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), z52.d);
                    int i11 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        try {
                            String string10 = obtainAttributes3.getString(i2);
                            if (string8 == null) {
                                r5 = obtainAttributes3;
                                j2 = 1;
                                throw new XmlPullParserException("query attribute must be set in fallback element");
                            }
                            while (xmlResourceParser.next() != 3) {
                                try {
                                    b0(xmlResourceParser);
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = obtainAttributes3;
                                    j2 = 1;
                                }
                            }
                            str = string5;
                            list = V;
                            r5 = obtainAttributes3;
                            arrayList = arrayList3;
                            i4 = i11;
                            i3 = integer2;
                            j2 = 1;
                            try {
                                rp0 rp0Var = new rp0(string, string2, string8, string9, string10, list);
                                if (r5 instanceof AutoCloseable) {
                                    ((AutoCloseable) r5).close();
                                } else if (r5 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r5;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r5.recycle();
                                }
                                arrayList.add(rp0Var);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            th = th3;
                        } catch (Throwable th4) {
                            th = th4;
                            r5 = obtainAttributes3;
                            j2 = 1;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = obtainAttributes3;
                        j2 = 1;
                    }
                    th = th;
                    typedArray = r5;
                    if (typedArray == null) {
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
                        boolean z3 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j2, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i3 = integer2;
                str = string5;
                arrayList = arrayList3;
                i4 = integer;
                list = V;
                b0(xmlResourceParser);
                arrayList3 = arrayList;
                V = list;
                integer2 = i3;
                string5 = str;
                i2 = 2;
                i6 = 3;
                integer = i4;
                i5 = 0;
            }
        }
        int i12 = integer2;
        String str2 = string5;
        ArrayList arrayList4 = arrayList3;
        int i13 = integer;
        List list2 = V;
        if (!arrayList4.isEmpty()) {
            return new bq0(arrayList4, i13, i12, str2);
        }
        if (string3 == null) {
            lh.e("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new rp0(string, string2, string3, null, null, list2));
        if (string4 != null) {
            arrayList4.add(new rp0(string, string2, string4, null, null, list2));
        }
        return new bq0(arrayList4, i13, i12, str2);
    }

    public static final Object T(lb2 lb2Var, Function1 function1, o30 o30Var) {
        cf cfVar;
        o30 o30Var2 = null;
        if (!lb2Var.g()) {
            m30 m30Var = lb2Var.a;
            if (m30Var != null) {
                return z71.V(m30Var.m, new v(lb2Var, function1, o30Var2, 19), o30Var);
            }
            Intrinsics.f("coroutineScope");
            throw null;
        }
        z62 z62Var = new z62(2, o30Var2, new c60(lb2Var, function1, null));
        sy2 sy2Var = (sy2) o30Var.getContext().m(sy2.o);
        e eVar = sy2Var != null ? sy2Var.m : null;
        if (eVar != null) {
            return z71.V(eVar, z62Var, o30Var);
        }
        CoroutineContext context = o30Var.getContext();
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        try {
            cfVar = lb2Var.d;
        } catch (RejectedExecutionException e2) {
            fsVar.g(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (cfVar == null) {
            Intrinsics.f("internalTransactionExecutor");
            throw null;
        }
        cfVar.execute(new ys(context, fsVar, lb2Var, z62Var, 1, false));
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(o30 o30Var, lb2 lb2Var, Function1 function1, boolean z, boolean z2) {
        e60 e60Var;
        b50 b50Var;
        int i2;
        lb2 lb2Var2;
        Function1 function12;
        boolean z3;
        boolean z4;
        Object V;
        if (o30Var instanceof e60) {
            e60Var = (e60) o30Var;
            int i3 = e60Var.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e60Var.r = i3 - Integer.MIN_VALUE;
                e60 e60Var2 = e60Var;
                Object obj = e60Var2.q;
                b50Var = b50.m;
                i2 = e60Var2.r;
                if (i2 != 0) {
                    ca2.b(obj);
                    if (lb2Var.g() && lb2Var.h() && lb2Var.h()) {
                        ib2 ib2Var = lb2Var.e;
                        if (ib2Var == null) {
                            Intrinsics.f("connectionManager");
                            throw null;
                        }
                        br2 c2 = ib2Var.c();
                        if (c2 == null) {
                            lh.g("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
                            return null;
                        }
                        if (c2.I().m()) {
                            f60 f60Var = new f60(null, lb2Var, function1, z2, z);
                            e60Var2.r = 1;
                            Object i4 = lb2Var.i(z, f60Var, e60Var2);
                            return i4 == b50Var ? b50Var : i4;
                        }
                    }
                    e60Var2.m = lb2Var;
                    e60Var2.n = function1;
                    e60Var2.o = z;
                    e60Var2.p = z2;
                    e60Var2.r = 2;
                    CoroutineContext D = D(lb2Var, z2, e60Var2);
                    if (D != b50Var) {
                        lb2Var2 = lb2Var;
                        function12 = function1;
                        z3 = z2;
                        obj = D;
                        z4 = z;
                    }
                }
                if (i2 == 1) {
                    ca2.b(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = e60Var2.p;
                boolean z6 = e60Var2.o;
                Function1 function13 = e60Var2.n;
                lb2 lb2Var3 = e60Var2.m;
                ca2.b(obj);
                z3 = z5;
                z4 = z6;
                function12 = function13;
                lb2Var2 = lb2Var3;
                d60 d60Var = new d60(null, lb2Var2, function12, z4, z3);
                e60Var2.m = null;
                e60Var2.n = null;
                e60Var2.r = 3;
                V = z71.V((CoroutineContext) obj, d60Var, e60Var2);
                if (V == b50Var) {
                    return V;
                }
            }
        }
        e60Var = new e60(o30Var);
        e60 e60Var22 = e60Var;
        Object obj2 = e60Var22.q;
        b50Var = b50.m;
        i2 = e60Var22.r;
        if (i2 != 0) {
        }
        d60 d60Var2 = new d60(null, lb2Var2, function12, z4, z3);
        e60Var22.m = null;
        e60Var22.n = null;
        e60Var22.r = 3;
        V = z71.V((CoroutineContext) obj2, d60Var2, e60Var22);
        if (V == b50Var) {
        }
    }

    public static List V(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
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
                String[] stringArray2 = resources.getStringArray(i2);
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

    public static final List W(uc2 uc2Var) {
        int m = bd3.m(uc2Var, "id");
        int m2 = bd3.m(uc2Var, "seq");
        int m3 = bd3.m(uc2Var, Constants.MessagePayloadKeys.FROM);
        int m4 = bd3.m(uc2Var, "to");
        le1 b2 = pv.b();
        while (uc2Var.E()) {
            b2.add(new pq0(uc2Var.j(m3), (int) uc2Var.getLong(m), (int) uc2Var.getLong(m2), uc2Var.j(m4)));
        }
        return zv.H(pv.a(b2));
    }

    public static final ls2 X(nc2 nc2Var, String str, boolean z) {
        uc2 M = nc2Var.M("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int m = bd3.m(M, "seqno");
            int m2 = bd3.m(M, "cid");
            int m3 = bd3.m(M, "name");
            int m4 = bd3.m(M, "desc");
            if (m != -1 && m2 != -1 && m3 != -1 && m4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (M.E()) {
                    if (((int) M.getLong(m2)) >= 0) {
                        int i2 = (int) M.getLong(m);
                        String j2 = M.j(m3);
                        String str2 = M.getLong(m4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), j2);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List I = zv.I(linkedHashMap.entrySet(), new zo0(11));
                ArrayList arrayList = new ArrayList(rv.l(I, 10));
                Iterator it = I.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List M2 = zv.M(arrayList);
                List I2 = zv.I(linkedHashMap2.entrySet(), new zo0(12));
                ArrayList arrayList2 = new ArrayList(rv.l(I2, 10));
                Iterator it2 = I2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ls2 ls2Var = new ls2(str, z, M2, zv.M(arrayList2));
                yk3.w(M, null);
                return ls2Var;
            }
            yk3.w(M, null);
            return null;
        } finally {
        }
    }

    public static final void Y(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void Z(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void a(String str, String str2, Function0 function0, a00 a00Var, int i2) {
        a00 a00Var2 = a00Var;
        a00Var2.Z(-2080187446);
        int i3 = (a00Var2.f(str) ? 4 : 2) | i2 | (a00Var2.f(str2) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= a00Var2.h(function0) ? 256 : 128;
        }
        if (a00Var2.P(i3 & 1, (i3 & 147) != 146)) {
            vl1 q = q(1.0f, cw.l, a.b(yk3.u(b.c(sl1.a, 1.0f), zb2.a(16.0f)), cw.k, ap.e), zb2.a(16.0f));
            if (function0 != null) {
                q = a.e(7, q, null, function0, false);
            }
            vl1 h2 = androidx.compose.foundation.layout.a.h(q, 14.0f);
            qw a2 = ow.a(new yh(8.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            long j2 = cw.w;
            jq0 jq0Var = jq0.t;
            bp2 bp2Var = n13.a;
            yv2.b(str, null, j2, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).h, a00Var2, (i3 & 14) | 196992, 0, 65498);
            yv2.b(str2, null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).k, a00Var2, ((i3 >> 3) & 14) | 384, 0, 65530);
            a00Var2 = a00Var2;
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new us(str, str2, function0, i2, 0);
        }
    }

    public static final long a0(long j2, float f2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v63 */
    public static final void b(int i2, a00 a00Var, vl1 vl1Var, final Function1 function1) {
        Function1 function12;
        ?? r2;
        vl1 vl1Var2;
        a00 a00Var2;
        Object ba2Var;
        final iz1 iz1Var;
        boolean z;
        sl1 sl1Var;
        a00 a00Var3;
        boolean z2;
        boolean z3;
        a00 a00Var4;
        boolean z4;
        a00 a00Var5;
        boolean z5;
        a00 a00Var6 = a00Var;
        yn ynVar = qb2.A;
        sc scVar = sc.o;
        function1.getClass();
        a00Var6.Z(42033202);
        int i3 = i2 | (a00Var6.h(function1) ? 4 : 2) | 48;
        if (a00Var6.P(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) a00Var6.j(AndroidCompositionLocals_androidKt.b);
            Object M = a00Var6.M();
            nj njVar = sz.a;
            if (M == njVar) {
                M = ij1.d.i(context);
                a00Var6.i0(M);
            }
            ij1 ij1Var = (ij1) M;
            nh nhVar = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            Object M2 = a00Var6.M();
            if (M2 == njVar) {
                try {
                    aa2.a aVar = aa2.m;
                    ba2Var = z71.I(context);
                } catch (Throwable th) {
                    aa2.a aVar2 = aa2.m;
                    ba2Var = new ba2(th);
                }
                if (ba2Var instanceof ba2) {
                    ba2Var = null;
                }
                M2 = (vs) ba2Var;
                a00Var6.i0(M2);
            }
            vs vsVar = (vs) M2;
            qn0 c2 = ij1Var.c(jk.p);
            nh nhVar2 = nhVar;
            ah0 ah0Var = ah0.m;
            zn1 a2 = ij2.a(c2, ah0Var, null, a00Var6, 48, 2);
            List list = (List) ij2.a(ij1Var.c(null), ah0Var, null, a00Var, 48, 2).getValue();
            int a3 = li1.a(rv.l(list, 10));
            if (a3 < 16) {
                a3 = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(a3);
            for (Object obj : list) {
                linkedHashMap.put(((ik) obj).a, obj);
            }
            Object M3 = a00Var.M();
            if (M3 == njVar) {
                M3 = new iz1(0);
                a00Var.i0(M3);
            }
            iz1 iz1Var2 = (iz1) M3;
            sl1 sl1Var2 = sl1.a;
            vl1 h2 = androidx.compose.foundation.layout.a.h(s03.T(a.a(b.b(sl1Var2, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b)))), s03.G(a00Var)), 16.0f);
            qw a4 = ow.a(new yh(14.0f, true, scVar), ynVar, a00Var, 6);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar2 = oz.f;
            uj2.e(a00Var, a4, scVar2);
            sc scVar3 = oz.e;
            uj2.e(a00Var, l, scVar3);
            sc scVar4 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar4);
            }
            sc scVar5 = oz.d;
            uj2.e(a00Var, E, scVar5);
            yn ynVar2 = ynVar;
            boolean z6 = true;
            boolean z7 = true;
            yv2.b(uj2.f(R.string.care_title, a00Var), null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).c, a00Var, 384, 0, 65530);
            a00 a00Var7 = a00Var;
            sc scVar6 = scVar;
            int i4 = 6;
            fc2 a5 = ec2.a(new yh(8.0f, true, scVar6), qb2.y, a00Var7, 6);
            int D2 = iv1.D(a00Var7);
            v02 l2 = a00Var7.l();
            sl1 sl1Var3 = sl1Var2;
            vl1 E2 = bd3.E(a00Var7, sl1Var3);
            a00Var7.b0();
            if (a00Var7.S) {
                a00Var7.k(o00Var);
            } else {
                a00Var7.l0();
            }
            uj2.e(a00Var7, a5, scVar2);
            uj2.e(a00Var7, l2, scVar3);
            if (a00Var7.S || !Intrinsics.b(a00Var7.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var7, D2, scVar4);
            }
            uj2.e(a00Var7, E2, scVar5);
            String f2 = uj2.f(R.string.care_tab_metals, a00Var7);
            boolean z8 = iz1Var2.h() == 0;
            Object M4 = a00Var7.M();
            if (M4 == njVar) {
                iz1Var = iz1Var2;
                z = false;
                final boolean z9 = false ? 1 : 0;
                M4 = new Function0() { // from class: ps
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = z9;
                        iz1 iz1Var3 = iz1Var;
                        switch (i5) {
                            case 0:
                                iz1Var3.i(0);
                                break;
                            case 1:
                                iz1Var3.i(1);
                                break;
                            default:
                                iz1Var3.i(2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var7.i0(M4);
            } else {
                iz1Var = iz1Var2;
                z = false;
            }
            n(f2, z8, (Function0) M4, a00Var7, 384);
            String f3 = uj2.f(R.string.care_tab_stones, a00Var7);
            boolean z10 = iz1Var.h() == 1 ? true : z;
            Object M5 = a00Var7.M();
            if (M5 == njVar) {
                final boolean z11 = z7 ? 1 : 0;
                M5 = new Function0() { // from class: ps
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = z11;
                        iz1 iz1Var3 = iz1Var;
                        switch (i5) {
                            case 0:
                                iz1Var3.i(0);
                                break;
                            case 1:
                                iz1Var3.i(1);
                                break;
                            default:
                                iz1Var3.i(2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var7.i0(M5);
            }
            n(f3, z10, (Function0) M5, a00Var7, 384);
            String f4 = uj2.f(R.string.care_tab_storage, a00Var7);
            final int i5 = 2;
            boolean z12 = iz1Var.h() == 2 ? true : z;
            Object M6 = a00Var7.M();
            if (M6 == njVar) {
                M6 = new Function0() { // from class: ps
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i52 = i5;
                        iz1 iz1Var3 = iz1Var;
                        switch (i52) {
                            case 0:
                                iz1Var3.i(0);
                                break;
                            case 1:
                                iz1Var3.i(1);
                                break;
                            default:
                                iz1Var3.i(2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var7.i0(M6);
            }
            n(f4, z12, (Function0) M6, a00Var7, 384);
            a00Var7.q(true);
            int h3 = iz1Var.h();
            if (h3 == 0) {
                function12 = function1;
                sl1Var = sl1Var3;
                boolean z13 = z;
                a00Var7.X(-2112869097);
                for (ik ikVar : (List) a2.getValue()) {
                    String c3 = ikVar.c(nhVar2);
                    String F = s03.F(ikVar.p, ikVar.q, nhVar2);
                    boolean h4 = ((i3 & 14) == 4 ? true : z13 ? 1 : 0) | a00Var7.h(ikVar);
                    Object M7 = a00Var7.M();
                    if (h4 || M7 == njVar) {
                        M7 = new qs(function12, ikVar, z13 ? 1 : 0);
                        a00Var7.i0(M7);
                    }
                    a(c3, F, (Function0) M7, a00Var7, z13 ? 1 : 0);
                }
                a00Var7.q(z13);
                Unit unit = Unit.a;
                z2 = z13;
                a00Var3 = a00Var7;
            } else if (h3 != 1) {
                a00Var7.X(-2110848951);
                List<ws> list2 = vsVar != null ? vsVar.b : null;
                if (list2 == null) {
                    a00Var7.X(-2110848952);
                    a00Var7.q(z);
                } else {
                    a00Var7.X(-2110848951);
                    for (ws wsVar : list2) {
                        wsVar.getClass();
                        a(s03.F(wsVar.a, wsVar.b, nhVar2), s03.F(wsVar.c, wsVar.d, nhVar2), null, a00Var7, 384);
                    }
                    a00Var7.q(z);
                    Unit unit2 = Unit.a;
                }
                a00Var7.q(z);
                function12 = function1;
                z3 = true;
                sl1Var = sl1Var3;
                z4 = z;
                a00Var4 = a00Var7;
                a00Var4.q(z3);
                vl1Var2 = sl1Var;
                r2 = z4;
                a00Var2 = a00Var4;
            } else {
                nh nhVar3 = nhVar2;
                a00Var7.X(-2112652562);
                List list3 = vsVar != null ? vsVar.a : null;
                if (list3 == null) {
                    a00Var7.X(-2112652563);
                    a00Var7.q(z);
                    function12 = function1;
                    sl1Var = sl1Var3;
                    z5 = z;
                    a00Var5 = a00Var7;
                } else {
                    a00Var7.X(-2112652562);
                    Iterator it = list3.iterator();
                    a00 a00Var8 = a00Var7;
                    while (it.hasNext()) {
                        final xs xsVar = (xs) it.next();
                        vl1 h5 = androidx.compose.foundation.layout.a.h(q(1.0f, cw.l, a.b(yk3.u(b.c(sl1Var3, 1.0f), zb2.a(16.0f)), cw.k, ap.e), zb2.a(16.0f)), 14.0f);
                        yn ynVar3 = ynVar2;
                        qw a6 = ow.a(new yh(10.0f, z6, scVar6), ynVar3, a00Var8, i4);
                        int D3 = iv1.D(a00Var8);
                        v02 l3 = a00Var8.l();
                        vl1 E3 = bd3.E(a00Var8, h5);
                        pz.b.getClass();
                        o00 o00Var2 = oz.b;
                        a00Var8.b0();
                        if (a00Var8.S) {
                            a00Var8.k(o00Var2);
                        } else {
                            a00Var8.l0();
                        }
                        uj2.e(a00Var8, a6, oz.f);
                        uj2.e(a00Var8, l3, oz.e);
                        sc scVar7 = oz.g;
                        if (a00Var8.S || !Intrinsics.b(a00Var8.M(), Integer.valueOf(D3))) {
                            q40.r(D3, a00Var8, D3, scVar7);
                        }
                        uj2.e(a00Var8, E3, oz.d);
                        xsVar.getClass();
                        String F2 = s03.F(xsVar.b, xsVar.c, nhVar3);
                        long j2 = cw.w;
                        jq0 jq0Var = jq0.t;
                        bp2 bp2Var = n13.a;
                        final nh nhVar4 = nhVar3;
                        ynVar2 = ynVar3;
                        sc scVar8 = scVar6;
                        yv2.b(F2, null, j2, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var8.j(bp2Var)).h, a00Var, 196992, 0, 65498);
                        yv2.b(s03.F(xsVar.d, xsVar.e, nhVar4), null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).k, a00Var, 384, 0, 65530);
                        yv2.b(uj2.f(R.string.care_affected, a00Var), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).o, a00Var, 384, 0, 65530);
                        xn0.a(null, new yh(8.0f, true, scVar8), new yh(8.0f, true, scVar8), 0, 0, null, yj1.H(1790557610, new xt0() { // from class: rs
                            /* JADX WARN: Type inference failed for: r8v0 */
                            /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v3 */
                            @Override // defpackage.xt0
                            public final Object a(Object obj2, Object obj3, Object obj4) {
                                boolean z14;
                                boolean z15;
                                rs rsVar = this;
                                a00 a00Var9 = (a00) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((co0) obj2).getClass();
                                boolean z16 = 0;
                                boolean z17 = true;
                                if (a00Var9.P(intValue & 1, (intValue & 17) != 16)) {
                                    for (String str : xs.this.f) {
                                        ik ikVar2 = (ik) linkedHashMap.get(str);
                                        if (ikVar2 == null) {
                                            z14 = z16;
                                            z15 = z17;
                                        } else {
                                            yb2 a7 = zb2.a(999.0f);
                                            sl1 sl1Var4 = sl1.a;
                                            vl1 b2 = a.b(yk3.u(sl1Var4, a7), ap.c(570425344), ap.e);
                                            Function1 function13 = function1;
                                            boolean f5 = a00Var9.f(function13) | a00Var9.f(str);
                                            Object M8 = a00Var9.M();
                                            if (f5 || M8 == sz.a) {
                                                M8 = new ts(z16, str, function13);
                                                a00Var9.i0(M8);
                                            }
                                            vl1 k2 = androidx.compose.foundation.layout.a.k(a.e(7, b2, null, (Function0) M8, z16), 0.0f, 0.0f, 12.0f, 11);
                                            fc2 a8 = ec2.a(s93.a, qb2.z, a00Var9, 48);
                                            int D4 = iv1.D(a00Var9);
                                            v02 l4 = a00Var9.l();
                                            vl1 E4 = bd3.E(a00Var9, k2);
                                            pz.b.getClass();
                                            o00 o00Var3 = oz.b;
                                            a00Var9.b0();
                                            if (a00Var9.S) {
                                                a00Var9.k(o00Var3);
                                            } else {
                                                a00Var9.l0();
                                            }
                                            uj2.e(a00Var9, a8, oz.f);
                                            uj2.e(a00Var9, l4, oz.e);
                                            sc scVar9 = oz.g;
                                            if (a00Var9.S || !Intrinsics.b(a00Var9.M(), Integer.valueOf(D4))) {
                                                q40.r(D4, a00Var9, D4, scVar9);
                                            }
                                            uj2.e(a00Var9, E4, oz.d);
                                            wj.a(ikVar2, androidx.compose.foundation.layout.a.h(sl1Var4, 4.0f), 28.0f, a00Var9, 432, 0);
                                            a00 a00Var10 = a00Var9;
                                            z14 = z16;
                                            z15 = z17;
                                            yv2.b(ikVar2.c(nhVar4), null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var9.j(n13.a)).n, a00Var10, 384, 0, 65530);
                                            a00Var9 = a00Var10;
                                            a00Var9.q(z15);
                                        }
                                        z17 = z15;
                                        z16 = z14;
                                        rsVar = this;
                                    }
                                } else {
                                    a00Var9.S();
                                }
                                return Unit.a;
                            }
                        }, a00Var), a00Var, 1573296);
                        a00 a00Var9 = a00Var;
                        a00Var9.q(true);
                        nhVar3 = nhVar4;
                        scVar6 = scVar8;
                        z6 = true;
                        sl1Var3 = sl1Var3;
                        i4 = 6;
                        z = false;
                        it = it;
                        a00Var8 = a00Var9;
                    }
                    function12 = function1;
                    sl1Var = sl1Var3;
                    boolean z14 = z;
                    a00Var8.q(z14);
                    Unit unit3 = Unit.a;
                    z5 = z14;
                    a00Var5 = a00Var8;
                }
                a00Var5.q(z5);
                z2 = z5;
                a00Var3 = a00Var5;
            }
            z3 = true;
            z4 = z2;
            a00Var4 = a00Var3;
            a00Var4.q(z3);
            vl1Var2 = sl1Var;
            r2 = z4;
            a00Var2 = a00Var4;
        } else {
            function12 = function1;
            r2 = 0;
            a00Var6.S();
            vl1Var2 = vl1Var;
            a00Var2 = a00Var6;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ss(i2, r2, function12, vl1Var2);
        }
    }

    public static void b0(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final void c(g30 g30Var, Function0 function0, vl1 vl1Var, ih2 ih2Var, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(645832757);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.f(g30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(function0) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= a00Var.h(ih2Var) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            f30 f30Var = (f30) g30Var.a.getValue();
            if (!(f30Var instanceof e30)) {
                n72 s = a00Var.s();
                if (s != null) {
                    s.d = new i9(g30Var, function0, ih2Var, i2);
                    return;
                }
                return;
            }
            boolean f2 = a00Var.f(f30Var);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                M = new a30(yk3.R(((e30) f30Var).a));
                a00Var.i0(M);
            }
            k30.d((a30) M, function0, ih2Var, a00Var, i4 & 8176);
            vl1Var = sl1.a;
        }
        vl1 vl1Var2 = vl1Var;
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new d6(g30Var, function0, vl1Var2, ih2Var, i2);
        }
    }

    public static int c0(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static final void d(g30 g30Var, Function0 function0, ih2 ih2Var, vl1 vl1Var, boolean z, my myVar, a00 a00Var, int i2) {
        int i3;
        ih2 ih2Var2;
        vl1 vl1Var2;
        a00Var.Z(-84584070);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.f(g30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ih2Var2 = ih2Var;
            i3 |= a00Var.h(ih2Var2) ? 256 : 128;
        } else {
            ih2Var2 = ih2Var;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= a00Var.g(z) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i2) == 0) {
            i5 |= a00Var.h(myVar) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((74899 & i5) == 74898 && a00Var.B()) {
            a00Var.S();
            vl1Var2 = vl1Var;
        } else {
            vl1Var2 = sl1.a;
            vl1 k2 = z ? vl1Var2.k(new SuspendPointerInputElement(qb2.K, null, new qr2(new v(i4, null, g30Var)), 6)) : vl1Var2;
            oj1 e2 = fp.e(qb2.p, true);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, k2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.invoke(a00Var, Integer.valueOf((i5 >> 15) & 14));
            c(g30Var, function0, null, ih2Var2, a00Var, ((i5 << 3) & 7168) | (i5 & 126));
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x20(g30Var, function0, ih2Var, vl1Var2, z, myVar, i2);
        }
    }

    public static final void e(Object obj, Object obj2, Function1 function1, a00 a00Var) {
        boolean f2 = a00Var.f(obj) | a00Var.f(obj2);
        Object M = a00Var.M();
        if (f2 || M == sz.a) {
            M = new ac0(function1);
            a00Var.i0(M);
        }
    }

    public static final void f(Object obj, Function1 function1, a00 a00Var) {
        boolean f2 = a00Var.f(obj);
        Object M = a00Var.M();
        if (f2 || M == sz.a) {
            M = new ac0(function1);
            a00Var.i0(M);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(xy1 xy1Var, vl1 vl1Var, f6 f6Var, q20 q20Var, float f2, a00 a00Var, int i2, int i3) {
        q20 q20Var2;
        int D;
        q20 q20Var3;
        float f3;
        n72 s;
        a00Var.Z(1142754848);
        int i4 = (a00Var.h(xy1Var) ? 4 : 2) | i2;
        int i5 = i4 | 3072;
        int i6 = i3 & 16;
        if (i6 != 0) {
            i5 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            q20Var2 = q20Var;
            i5 |= a00Var.f(q20Var2) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
            if (((i5 | 1769472) & 599187) == 599186 || !a00Var.B()) {
                f6Var = qb2.t;
                if (i6 != 0) {
                    q20Var2 = p20.b;
                }
                q20 q20Var4 = q20Var2;
                a00Var.X(1040398089);
                a00Var.q(false);
                vl1 d2 = androidx.compose.ui.draw.a.d(yk3.v(vl1Var.k(sl1.a)), xy1Var, q20Var4, 1.0f, null, 2);
                k9 k9Var = k9.g;
                D = iv1.D(a00Var);
                vl1 E = bd3.E(a00Var, d2);
                v02 l = a00Var.l();
                pz.b.getClass();
                o00 o00Var = oz.b;
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.l0();
                } else {
                    a00Var.k(o00Var);
                }
                uj2.e(a00Var, k9Var, oz.f);
                uj2.e(a00Var, l, oz.e);
                uj2.e(a00Var, E, oz.d);
                sc scVar = oz.g;
                if (!a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                    q40.r(D, a00Var, D, scVar);
                }
                a00Var.q(true);
                q20Var3 = q20Var4;
                f3 = 1.0f;
            } else {
                a00Var.S();
                f3 = f2;
                q20Var3 = q20Var2;
            }
            f6 f6Var2 = f6Var;
            s = a00Var.s();
            if (s == null) {
                s.d = new n01(xy1Var, vl1Var, f6Var2, q20Var3, f3, i2, i3);
                return;
            }
            return;
        }
        q20Var2 = q20Var;
        if (((i5 | 1769472) & 599187) == 599186) {
        }
        f6Var = qb2.t;
        if (i6 != 0) {
        }
        q20 q20Var42 = q20Var2;
        a00Var.X(1040398089);
        a00Var.q(false);
        vl1 d22 = androidx.compose.ui.draw.a.d(yk3.v(vl1Var.k(sl1.a)), xy1Var, q20Var42, 1.0f, null, 2);
        k9 k9Var2 = k9.g;
        D = iv1.D(a00Var);
        vl1 E2 = bd3.E(a00Var, d22);
        v02 l2 = a00Var.l();
        pz.b.getClass();
        o00 o00Var2 = oz.b;
        a00Var.b0();
        if (a00Var.S) {
        }
        uj2.e(a00Var, k9Var2, oz.f);
        uj2.e(a00Var, l2, oz.e);
        uj2.e(a00Var, E2, oz.d);
        sc scVar2 = oz.g;
        if (!a00Var.S) {
        }
        q40.r(D, a00Var, D, scVar2);
        a00Var.q(true);
        q20Var3 = q20Var42;
        f3 = 1.0f;
        f6 f6Var22 = f6Var;
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final void h(a00 a00Var, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = a00Var.R;
        boolean f2 = a00Var.f(obj);
        Object M = a00Var.M();
        if (f2 || M == sz.a) {
            M = new p81(coroutineContext, function2);
            a00Var.i0(M);
        }
    }

    public static final void i(Object obj, Object obj2, Function2 function2, a00 a00Var) {
        CoroutineContext coroutineContext = a00Var.R;
        boolean f2 = a00Var.f(obj) | a00Var.f(obj2);
        Object M = a00Var.M();
        if (f2 || M == sz.a) {
            M = new p81(coroutineContext, function2);
            a00Var.i0(M);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x024e, code lost:
    
        if (r45.g(false) != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0300 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(vl1 vl1Var, va1 va1Var, nw0 nw0Var, zx1 zx1Var, om0 om0Var, boolean z, zh zhVar, xh xhVar, Function1 function1, a00 a00Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean f2;
        Object ua0Var;
        hc1 hc1Var;
        int i7;
        boolean z3;
        boolean z4;
        va1 va1Var2;
        q71 q71Var;
        Object M;
        va1 va1Var3;
        a00Var.Z(-649686062);
        if ((i2 & 6) == 0) {
            i4 = (a00Var.f(vl1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= a00Var.f(va1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? a00Var.f(nw0Var) : a00Var.h(nw0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= a00Var.f(zx1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= a00Var.g(false) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((i2 & 196608) == 0) {
            i4 |= a00Var.g(true) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= a00Var.f(om0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= a00Var.g(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= a00Var.f(zhVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= a00Var.f(xhVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (a00Var.h(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && a00Var.B()) {
            a00Var.S();
            va1Var3 = va1Var;
        } else {
            a00Var.U();
            if ((i2 & 1) != 0 && !a00Var.z()) {
                a00Var.S();
            }
            a00Var.r();
            int i8 = i4 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i5 << 3) & 112);
            zn1 k2 = ij2.k(function1, a00Var);
            int i11 = i4;
            boolean z5 = (((i10 & 14) ^ 6) > 4 && a00Var.f(va1Var)) || (i10 & 6) == 4;
            Object M2 = a00Var.M();
            Object obj = sz.a;
            if (z5 || M2 == obj) {
                by1 by1Var = by1.q;
                i6 = i8;
                M2 = new ga1(0, 0, so2.class, ij2.e(by1Var, new k7(13, ij2.e(by1Var, new x30(k2, 1)), va1Var)), "value", "getValue()Ljava/lang/Object;");
                a00Var.i0(M2);
            } else {
                i6 = i8;
            }
            q71 q71Var2 = (q71) M2;
            int i12 = i11 >> 9;
            int i13 = i9 | (i12 & 112);
            boolean z6 = ((((i13 & 14) ^ 6) > 4 && a00Var.f(va1Var)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && a00Var.g(false)) || (i13 & 48) == 32);
            Object M3 = a00Var.M();
            if (z6 || M3 == obj) {
                M3 = new hc1(va1Var);
                a00Var.i0(M3);
            }
            hc1 hc1Var2 = (hc1) M3;
            Object M4 = a00Var.M();
            if (M4 == obj) {
                Object q00Var = new q00(x(h.m, a00Var));
                a00Var.i0(q00Var);
                M4 = q00Var;
            }
            a50 a50Var = ((q00) M4).m;
            cw0 cw0Var = (cw0) a00Var.j(p00.g);
            int i14 = (i11 & 524272) | (i12 & 3670016) | (i6 & 29360128);
            boolean z7 = ((((i14 & 896) ^ 384) > 256 && a00Var.f(nw0Var)) || (i14 & 384) == 256) | ((((i14 & 112) ^ 48) > 32 && a00Var.f(va1Var)) || (i14 & 48) == 32) | ((((i14 & 7168) ^ 3072) > 2048 && a00Var.f(zx1Var)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) <= 16384) {
            }
            if ((i14 & 24576) != 16384) {
                z2 = false;
                f2 = z7 | z2 | ((((458752 & i14) ^ 196608) <= 131072 && a00Var.g(true)) || (i14 & 196608) == 131072) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && a00Var.f(xhVar)) || (i14 & 1572864) == 1048576) | ((((i14 & 29360128) ^ 12582912) <= 8388608 && a00Var.f(zhVar)) || (i14 & 12582912) == 8388608) | a00Var.f(cw0Var);
                Object M5 = a00Var.M();
                if (!f2 || M5 == obj) {
                    hc1Var = hc1Var2;
                    i7 = i6;
                    z3 = false;
                    z4 = true;
                    ua0Var = new ua0(va1Var, zx1Var, q71Var2, nw0Var, zhVar, xhVar, a50Var, cw0Var);
                    va1Var2 = va1Var;
                    q71Var = q71Var2;
                    a00Var.i0(ua0Var);
                } else {
                    va1Var2 = va1Var;
                    ua0Var = M5;
                    hc1Var = hc1Var2;
                    i7 = i6;
                    q71Var = q71Var2;
                    z3 = false;
                    z4 = true;
                }
                Function2 function2 = (Function2) ua0Var;
                vl1 k3 = vl1Var.k(va1Var2.i).k(va1Var2.j);
                ww1 ww1Var = ww1.m;
                vl1 a2 = c.a(k3, q71Var, hc1Var, ww1Var, z);
                if (((i9 ^ 6) > 4 && a00Var.f(va1Var2)) || (i7 & 6) == 4) {
                    z3 = z4;
                }
                M = a00Var.M();
                if (!z3 || M == obj) {
                    M = new z91(va1Var2);
                    a00Var.i0(M);
                }
                vl1 R = s93.R(iv1.K(a2, (z91) M, va1Var2.l, (u81) a00Var.j(p00.n), ww1Var, z, a00Var, (i7 & 3670016) | (i7 & 7168) | 512).k(va1Var2.k.i), va1Var, ww1Var, z, om0Var, va1Var2.d, null, a00Var, 64);
                va1Var3 = va1Var;
                tk3.n(q71Var, R, va1Var3.m, function2, a00Var, 0);
            }
            z2 = true;
            f2 = z7 | z2 | ((((458752 & i14) ^ 196608) <= 131072 && a00Var.g(true)) || (i14 & 196608) == 131072) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && a00Var.f(xhVar)) || (i14 & 1572864) == 1048576) | ((((i14 & 29360128) ^ 12582912) <= 8388608 && a00Var.f(zhVar)) || (i14 & 12582912) == 8388608) | a00Var.f(cw0Var);
            Object M52 = a00Var.M();
            if (f2) {
            }
            hc1Var = hc1Var2;
            i7 = i6;
            z3 = false;
            z4 = true;
            ua0Var = new ua0(va1Var, zx1Var, q71Var2, nw0Var, zhVar, xhVar, a50Var, cw0Var);
            va1Var2 = va1Var;
            q71Var = q71Var2;
            a00Var.i0(ua0Var);
            Function2 function22 = (Function2) ua0Var;
            vl1 k32 = vl1Var.k(va1Var2.i).k(va1Var2.j);
            ww1 ww1Var2 = ww1.m;
            vl1 a22 = c.a(k32, q71Var, hc1Var, ww1Var2, z);
            if ((i9 ^ 6) > 4) {
                z3 = z4;
                M = a00Var.M();
                if (!z3) {
                }
                M = new z91(va1Var2);
                a00Var.i0(M);
                vl1 R2 = s93.R(iv1.K(a22, (z91) M, va1Var2.l, (u81) a00Var.j(p00.n), ww1Var2, z, a00Var, (i7 & 3670016) | (i7 & 7168) | 512).k(va1Var2.k.i), va1Var, ww1Var2, z, om0Var, va1Var2.d, null, a00Var, 64);
                va1Var3 = va1Var;
                tk3.n(q71Var, R2, va1Var3.m, function22, a00Var, 0);
            }
            z3 = z4;
            M = a00Var.M();
            if (!z3) {
            }
            M = new z91(va1Var2);
            a00Var.i0(M);
            vl1 R22 = s93.R(iv1.K(a22, (z91) M, va1Var2.l, (u81) a00Var.j(p00.n), ww1Var2, z, a00Var, (i7 & 3670016) | (i7 & 7168) | 512).k(va1Var2.k.i), va1Var, ww1Var2, z, om0Var, va1Var2.d, null, a00Var, 64);
            va1Var3 = va1Var;
            tk3.n(q71Var, R22, va1Var3.m, function22, a00Var, 0);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ia1(vl1Var, va1Var3, nw0Var, zx1Var, om0Var, z, zhVar, xhVar, function1, i2, i3);
        }
    }

    public static ja k(String str, pw2 pw2Var, long j2, ca0 ca0Var, hp0 hp0Var, ah0 ah0Var, int i2, int i3) {
        if ((i3 & 32) != 0) {
            ah0Var = ah0.m;
        }
        return new ja(new na(str, pw2Var, ah0Var, ah0.m, hp0Var, ca0Var), i2, 1, j2);
    }

    public static final ub2 l(float f2, float f3, float f4, float f5, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new ub2(f2, f3, f4, f5, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void m(Function0 function0, a00 a00Var) {
        rw1 rw1Var = a00Var.M.b.s;
        rw1Var.Y(hw1.c);
        s03.M(rw1Var, 0, function0);
    }

    public static final void n(String str, boolean z, Function0 function0, a00 a00Var, int i2) {
        a00 a00Var2;
        List g2;
        a00Var.Z(-241624923);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2) | (a00Var.g(z) ? 32 : 16);
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            vl1 u = yk3.u(sl1.a, zb2.a(999.0f));
            if (z) {
                g2 = qv.g(new aw(cw.p), new aw(cw.q));
            } else {
                long j2 = cw.k;
                g2 = qv.g(new aw(j2), new aw(j2));
            }
            vl1 i4 = androidx.compose.foundation.layout.a.i(a.e(7, q(1.0f, z ? aw.f : cw.l, a.a(u, nj.q(g2)), zb2.a(999.0f)), null, function0, false), 16.0f, 8.0f);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, i4);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            yv2.b(str, null, cw.h, 0L, z ? jq0.t : jq0.r, 0L, null, 0L, 0, false, 0, 0, null, a00Var, (i3 & 14) | 384, 0, 131034);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2 = a00Var;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new w4(str, z, function0, i2, 2);
        }
    }

    public static iw o(iw iwVar) {
        q63 q63Var = zm3.d;
        if (o70.v(iwVar.b, 12884901888L)) {
            pa2 pa2Var = (pa2) iwVar;
            q63 q63Var2 = pa2Var.d;
            if (!w(q63Var2, q63Var)) {
                return new pa2(pa2Var.a, pa2Var.h, q63Var, P(v(r4.c.b, q63Var2.a(), q63Var.a()), pa2Var.i), pa2Var.k, pa2Var.n, pa2Var.e, pa2Var.f, pa2Var.g, -1);
            }
        }
        return iwVar;
    }

    public static final void p(ii iiVar, int i2) {
        iiVar.m = new int[i2];
        iiVar.n = new Object[i2];
    }

    public static final vl1 q(float f2, long j2, vl1 vl1Var, fk2 fk2Var) {
        return vl1Var.k(new BorderModifierNodeElement(f2, new nn2(j2), fk2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(co coVar, int i2, m43 m43Var, int i3, yq yqVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        byte[][] bArr = (byte[][]) yqVar.p;
        int i10 = yqVar.n;
        int i11 = yqVar.o;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = e[0].length;
        A(0, 0, yqVar);
        int i12 = i10 - length;
        A(i12, 0, yqVar);
        A(0, i12, yqVar);
        z(0, 7, yqVar);
        int i13 = i10 - 8;
        z(i13, 7, yqVar);
        z(0, i13, yqVar);
        B(7, 0, yqVar);
        int i14 = i11 - 8;
        B(i14, 0, yqVar);
        int i15 = i11 - 7;
        B(7, i15, yqVar);
        if (yqVar.r(8, i14) == 0) {
            throw new l93();
        }
        yqVar.s(8, i14, 1);
        int i16 = m43Var.a;
        if (i16 < 2) {
            i4 = 0;
        } else {
            i4 = 0;
            int[] iArr = g[i16 - 1];
            int length2 = iArr.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = iArr[i17];
                if (i18 >= 0) {
                    int length3 = iArr.length;
                    int i19 = 0;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        if (i20 >= 0 && M(yqVar.r(i20, i18))) {
                            int i21 = i20 - 2;
                            int i22 = i18 - 2;
                            i5 = i17;
                            i6 = i10;
                            int i23 = 0;
                            while (true) {
                                if (i23 >= 5) {
                                    break;
                                }
                                int[] iArr2 = f[i23];
                                int i24 = i23;
                                int i25 = 0;
                                for (int i26 = 5; i25 < i26; i26 = 5) {
                                    int i27 = i25;
                                    yqVar.s(i21 + i25, i22 + i24, iArr2[i27]);
                                    i25 = i27 + 1;
                                    iArr = iArr;
                                }
                                i23 = i24 + 1;
                            }
                        } else {
                            i5 = i17;
                            i6 = i10;
                        }
                        i19++;
                        i17 = i5;
                        i10 = i6;
                        iArr = iArr;
                    }
                }
                i17++;
                i10 = i10;
                iArr = iArr;
            }
        }
        int i28 = i10;
        int i29 = 8;
        while (i29 < i13) {
            int i30 = i29 + 1;
            int i31 = i30 % 2;
            if (M(yqVar.r(i29, 6))) {
                yqVar.s(i29, 6, i31);
            }
            if (M(yqVar.r(6, i29))) {
                yqVar.s(6, i29, i31);
            }
            i29 = i30;
        }
        co coVar2 = new co();
        if (i3 < 0 || i3 >= 8) {
            throw new l93("Invalid mask pattern");
        }
        if (i2 == 1) {
            i7 = 1;
        } else if (i2 == 2) {
            i7 = i4;
        } else if (i2 == 3) {
            i7 = 3;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i7 = 2;
        }
        int i32 = (i7 << 3) | i3;
        coVar2.b(i32, 5);
        coVar2.b(s(i32, 1335), 10);
        co coVar3 = new co();
        coVar3.b(21522, 15);
        if (coVar2.n != coVar3.n) {
            lh.e("Sizes don't match");
            return;
        }
        int i33 = i4;
        while (true) {
            int[] iArr3 = coVar2.m;
            if (i33 >= iArr3.length) {
                break;
            }
            iArr3[i33] = iArr3[i33] ^ coVar3.m[i33];
            i33++;
        }
        if (coVar2.n != 15) {
            throw new l93("should not happen but we got: " + coVar2.n);
        }
        int i34 = i4;
        while (true) {
            int i35 = coVar2.n;
            if (i34 >= i35) {
                break;
            }
            boolean d2 = coVar2.d((i35 - 1) - i34);
            int[] iArr4 = h[i34];
            yqVar.t(iArr4[i4], iArr4[1], d2);
            if (i34 < 8) {
                yqVar.t((i28 - i34) - 1, 8, d2);
            } else {
                yqVar.t(8, (i34 - 8) + i15, d2);
            }
            i34++;
        }
        if (i16 >= 7) {
            co coVar4 = new co();
            coVar4.b(i16, 6);
            coVar4.b(s(i16, 7973), 12);
            if (coVar4.n != 18) {
                throw new l93("should not happen but we got: " + coVar4.n);
            }
            int i36 = 17;
            for (int i37 = i4; i37 < 6; i37++) {
                for (int i38 = i4; i38 < 3; i38++) {
                    boolean d3 = coVar4.d(i36);
                    i36--;
                    int i39 = (i11 - 11) + i38;
                    yqVar.t(i37, i39, d3);
                    yqVar.t(i39, i37, d3);
                }
            }
        }
        int i40 = i28 - 1;
        int i41 = i11 - 1;
        int i42 = i4;
        int i43 = -1;
        while (i40 > 0) {
            if (i40 == 6) {
                i40--;
            }
            while (i41 >= 0 && i41 < i11) {
                for (int i44 = i4; i44 < 2; i44++) {
                    int i45 = i40 - i44;
                    if (M(yqVar.r(i45, i41))) {
                        if (i42 < coVar.n) {
                            z = coVar.d(i42);
                            i42++;
                        } else {
                            z = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i8 = i41 + i45;
                                    i9 = i8 & 1;
                                    if (i9 == 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i9 = i41 & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 2:
                                    i9 = i45 % 3;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 3:
                                    i9 = (i41 + i45) % 3;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 4:
                                    i9 = ((i45 / 3) + (i41 / 2)) & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 5:
                                    int i46 = i41 * i45;
                                    i9 = (i46 % 3) + (i46 & 1);
                                    if (i9 == 0) {
                                    }
                                    break;
                                case 6:
                                    int i47 = i41 * i45;
                                    i9 = ((i47 % 3) + (i47 & 1)) & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i8 = ((i41 * i45) % 3) + ((i41 + i45) & 1);
                                    i9 = i8 & 1;
                                    if (i9 == 0) {
                                    }
                                    break;
                                default:
                                    lh.e("Invalid mask pattern: ".concat(String.valueOf(i3)));
                                    return;
                            }
                        }
                        yqVar.t(i45, i41, z);
                    }
                }
                i41 += i43;
            }
            i43 = -i43;
            i41 += i43;
            i40 -= 2;
        }
        if (i42 == coVar.n) {
            return;
        }
        throw new l93("Not all bits consumed: " + i42 + '/' + coVar.n);
    }

    public static int s(int i2, int i3) {
        if (i3 == 0) {
            lh.e("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - numberOfLeadingZeros;
        int i5 = i2 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i5) >= i4) {
            i5 ^= i3 << ((32 - Integer.numberOfLeadingZeros(i5)) - i4);
        }
        return i5;
    }

    public static final void t(CoroutineContext coroutineContext, CancellationException cancellationException) {
        g61 g61Var = (g61) coroutineContext.m(qb2.U);
        if (g61Var != null) {
            g61Var.f(cancellationException);
        }
    }

    public static final void u(int i2) {
        if (i2 >= 1) {
            return;
        }
        lh.c(in1.k(i2, "Expected positive parallelism level, but got "));
    }

    public static final float[] v(float[] fArr, float[] fArr2, float[] fArr3) {
        Q(fArr, fArr2);
        Q(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] I = I(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return P(I, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean w(q63 q63Var, q63 q63Var2) {
        if (q63Var == q63Var2) {
            return true;
        }
        return Math.abs(q63Var.a - q63Var2.a) < 0.001f && Math.abs(q63Var.b - q63Var2.b) < 0.001f;
    }

    public static final a50 x(h hVar, a00 a00Var) {
        hVar.getClass();
        return new v82(a00Var.R, hVar);
    }

    public static final m10 y(iw iwVar, iw iwVar2) {
        return iwVar == iwVar2 ? new k10(iwVar, iwVar, 1) : (o70.v(iwVar.b, 12884901888L) && o70.v(iwVar2.b, 12884901888L)) ? new l10((pa2) iwVar, (pa2) iwVar2) : new m10(iwVar, iwVar2, 0);
    }

    public static void z(int i2, int i3, yq yqVar) {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!M(yqVar.r(i5, i3))) {
                throw new l93();
            }
            yqVar.s(i5, i3, 0);
        }
    }
}
