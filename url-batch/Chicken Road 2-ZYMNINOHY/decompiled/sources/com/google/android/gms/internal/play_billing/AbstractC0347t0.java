package com.google.android.gms.internal.play_billing;

import E.AbstractC0003d;
import E.AbstractC0005f;
import K.C0056e;
import K.C0058g;
import K.C0062k;
import a.AbstractC0124a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.hardware.display.DisplayManager;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import b1.C0262g;
import c3.C0297i;
import com.rockchicken.pump.up.road.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import f3.C0431i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.C0442b;
import g3.C0443c;
import g3.EnumC0441a;
import i2.AbstractC0457a;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.C1233t;
import o3.InterfaceC1339l;
import w3.AbstractC1504a;

/* renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0347t0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6015a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f6016b;

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, C0062k c0062k, h3.c cVar) {
        C0056e c0056e;
        int i4;
        List list2;
        kotlin.jvm.internal.p pVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0056e) {
            c0056e = (C0056e) cVar;
            int i5 = c0056e.f1349d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0056e.f1349d = i5 - Integer.MIN_VALUE;
                Object obj = c0056e.f1348c;
                Object obj2 = EnumC0441a.f9038a;
                i4 = c0056e.f1349d;
                if (i4 != 0) {
                    O3.l.w(obj);
                    ArrayList arrayList = new ArrayList();
                    C0058g c0058g = new C0058g(list, arrayList, null);
                    c0056e.f1346a = arrayList;
                    c0056e.f1349d = 1;
                    if (c0062k.a(c0058g, c0056e) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0056e.f1347b;
                        pVar = (kotlin.jvm.internal.p) c0056e.f1346a;
                        try {
                            O3.l.w(obj);
                        } catch (Throwable th2) {
                            Object obj3 = pVar.f14159a;
                            if (obj3 == null) {
                                pVar.f14159a = th2;
                            } else {
                                O3.d.c((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            InterfaceC1339l interfaceC1339l = (InterfaceC1339l) it.next();
                            c0056e.f1346a = pVar;
                            c0056e.f1347b = it;
                            c0056e.f1349d = 2;
                            if (interfaceC1339l.invoke(c0056e) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) pVar.f14159a;
                        if (th == null) {
                            return C0297i.f5732a;
                        }
                        throw th;
                    }
                    list2 = (List) c0056e.f1346a;
                    O3.l.w(obj);
                }
                pVar = new kotlin.jvm.internal.p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) pVar.f14159a;
                if (th == null) {
                }
            }
        }
        c0056e = new C0056e(cVar);
        Object obj4 = c0056e.f1348c;
        Object obj22 = EnumC0441a.f9038a;
        i4 = c0056e.f1349d;
        if (i4 != 0) {
        }
        pVar = new kotlin.jvm.internal.p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) pVar.f14159a;
        if (th == null) {
        }
    }

    public static T3.e b() {
        T3.e eVar = T3.e.f2968l;
        kotlin.jvm.internal.i.b(eVar);
        T3.e eVar2 = eVar.f2970f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            T3.e.f2965i.await(T3.e.f2966j, TimeUnit.MILLISECONDS);
            T3.e eVar3 = T3.e.f2968l;
            kotlin.jvm.internal.i.b(eVar3);
            if (eVar3.f2970f != null || System.nanoTime() - nanoTime < T3.e.f2967k) {
                return null;
            }
            return T3.e.f2968l;
        }
        long nanoTime2 = eVar2.f2971g - System.nanoTime();
        if (nanoTime2 > 0) {
            T3.e.f2965i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        T3.e eVar4 = T3.e.f2968l;
        kotlin.jvm.internal.i.b(eVar4);
        eVar4.f2970f = eVar2.f2970f;
        eVar2.f2970f = null;
        return eVar2;
    }

    public static long c(long j4, long j5) {
        long j6 = j4 + j5;
        if (((j4 ^ j5) < 0) || ((j4 ^ j6) >= 0)) {
            return j6;
        }
        StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
        sb.append(j4);
        sb.append(", ");
        throw new ArithmeticException(AbstractC0005f.p(sb, j5, ")"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            jArr[i4] = iArr[i4];
        }
        return jArr;
    }

    public static u0.h e(t0.t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (tVar.a(i5, elapsedRealtime)) {
                i4++;
            }
        }
        return new u0.h(1, 0, length, i4);
    }

    public static Bitmap f(byte[] bArr, int i4, int i5) {
        BitmapFactory.Options options;
        int i6 = 0;
        int i7 = 1;
        if (i5 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i4, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i5; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i4, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw T.G.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            O.g gVar = new O.g(byteArrayInputStream);
            byteArrayInputStream.close();
            O.c c4 = gVar.c("Orientation");
            if (c4 != null) {
                try {
                    i7 = c4.e(gVar.f1995e);
                } catch (NumberFormatException unused) {
                }
            }
            switch (i7) {
                case 3:
                case 4:
                    i6 = 180;
                    break;
                case 5:
                case 8:
                    i6 = 270;
                    break;
                case 6:
                case 7:
                    i6 = 90;
                    break;
            }
            if (i6 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i6);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = E.H.f375a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = E.G.f371d;
        E.G g4 = (E.G) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (g4 == null) {
            g4 = new E.G();
            g4.f372a = null;
            g4.f373b = null;
            g4.f374c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, g4);
        }
        WeakReference weakReference2 = g4.f374c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        g4.f374c = new WeakReference(keyEvent);
        if (g4.f373b == null) {
            g4.f373b = new SparseArray();
        }
        SparseArray sparseArray = g4.f373b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw AbstractC0005f.g(size, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long h(long j4, long j5, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i4 = ((int) ((j4 ^ j5) >> 63)) | 1;
        switch (x2.e.f15986a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0457a.e(j7 == 0);
                return j6;
            case 2:
                return j6;
            case 3:
                if (i4 >= 0) {
                    return j6;
                }
                return j6 + i4;
            case 4:
                return j6 + i4;
            case 5:
                if (i4 <= 0) {
                    return j6;
                }
                return j6 + i4;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j7);
                long abs2 = abs - (Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                return j6 + i4;
            default:
                throw new AssertionError();
        }
    }

    public static boolean i(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr && (hdrCapabilities = display.getHdrCapabilities()) != null) {
                for (int i4 : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i4 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long j(long j4, long j5) {
        AbstractC0457a.c(j4, "a");
        AbstractC0457a.c(j5, "b");
        if (j4 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j8 = j6 - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j7 += j9;
            j6 = j10 >> Long.numberOfTrailingZeros(j10);
        }
        return j6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class k(u3.c cVar) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        Class a3 = ((kotlin.jvm.internal.c) cVar).a();
        if (a3.isPrimitive()) {
            String name = a3.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a3;
    }

    public static C.c l(C1233t c1233t) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new C.c(AbstractC0003d.k(c1233t));
        }
        TextPaint textPaint = new TextPaint(c1233t.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1233t.getBreakStrategy();
        int hyphenationFrequency = c1233t.getHyphenationFrequency();
        if (c1233t.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (c1233t.getInputType() & 15) != 3) {
                boolean z = c1233t.getLayoutDirection() == 1;
                switch (c1233t.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0003d.a(DecimalFormatSymbols.getInstance(c1233t.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static InterfaceC0425c m(InterfaceC0425c interfaceC0425c) {
        InterfaceC0425c intercepted;
        kotlin.jvm.internal.i.e(interfaceC0425c, "<this>");
        h3.c cVar = interfaceC0425c instanceof h3.c ? (h3.c) interfaceC0425c : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? interfaceC0425c : intercepted;
    }

    public static String n(String str, Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e4);
                    str2 = "<" + str3 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i6 = 0;
        while (i4 < objArr.length && (indexOf = valueOf.indexOf("%s", i6)) != -1) {
            sb.append((CharSequence) valueOf, i6, indexOf);
            sb.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) valueOf, i6, valueOf.length());
        if (i4 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String o(X509Certificate certificate) {
        kotlin.jvm.internal.i.e(certificate, "certificate");
        T3.j jVar = T3.j.f2976d;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        kotlin.jvm.internal.i.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i4 = 0;
        AbstractC0124a.p(encoded.length, 0, length);
        V3.b.k(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        T3.j jVar2 = new T3.j(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, jVar2.a());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.i.d(digestBytes, "digestBytes");
        new T3.j(digestBytes);
        byte[] map = T3.a.f2957a;
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr = new byte[((digestBytes.length + 2) / 3) * 4];
        int length2 = digestBytes.length - (digestBytes.length % 3);
        int i5 = 0;
        while (i4 < length2) {
            byte b4 = digestBytes[i4];
            int i6 = i4 + 2;
            byte b5 = digestBytes[i4 + 1];
            i4 += 3;
            byte b6 = digestBytes[i6];
            bArr[i5] = map[(b4 & 255) >> 2];
            bArr[i5 + 1] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr[i5 + 2] = map[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i5 += 4;
            bArr[i7] = map[b6 & 63];
        }
        int length3 = digestBytes.length - length2;
        if (length3 == 1) {
            byte b7 = digestBytes[i4];
            bArr[i5] = map[(b7 & 255) >> 2];
            bArr[i5 + 1] = map[(b7 & 3) << 4];
            bArr[i5 + 2] = 61;
            bArr[i5 + 3] = 61;
        } else if (length3 == 2) {
            int i8 = i4 + 1;
            byte b8 = digestBytes[i4];
            byte b9 = digestBytes[i8];
            bArr[i5] = map[(b8 & 255) >> 2];
            bArr[i5 + 1] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr[i5 + 2] = map[(b9 & 15) << 2];
            bArr[i5 + 3] = 61;
        }
        return kotlin.jvm.internal.i.h(new String(bArr, AbstractC1504a.f15936a), "sha256/");
    }

    public static C0262g p(C0262g c0262g, String[] strArr, Map map) {
        int i4 = 0;
        if (c0262g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C0262g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C0262g c0262g2 = new C0262g();
                int length = strArr.length;
                while (i4 < length) {
                    c0262g2.a((C0262g) map.get(strArr[i4]));
                    i4++;
                }
                return c0262g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c0262g.a((C0262g) map.get(strArr[0]));
                return c0262g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i4 < length2) {
                    c0262g.a((C0262g) map.get(strArr[i4]));
                    i4++;
                }
            }
        }
        return c0262g;
    }

    public static long q(long j4, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        long j6 = ((j4 ^ j5) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j5 == Long.MIN_VALUE) & (j4 < 0)))) {
            long j7 = j4 * j5;
            if (j4 == 0 || j7 / j4 == j5) {
                return j7;
            }
        }
        return j6;
    }

    public static void r(TextView textView, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0003d.n(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void s(TextView textView, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static boolean t(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4] == bArr2[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    public static ActionMode.Callback u(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof H.j) || callback == null) ? callback : new H.j(callback, textView);
    }

    public static Object v(o3.p pVar, Object obj, InterfaceC0425c interfaceC0425c) {
        Object c0443c;
        kotlin.jvm.internal.i.e(pVar, "<this>");
        InterfaceC0430h context = interfaceC0425c.getContext();
        if (context == C0431i.f8817a) {
            c0443c = new C0442b(interfaceC0425c);
            if (interfaceC0425c.getContext() != C0431i.f8817a) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            c0443c = new C0443c(interfaceC0425c, context);
        }
        kotlin.jvm.internal.s.a(2, pVar);
        return pVar.invoke(obj, c0443c);
    }

    public static int w(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static String x(C0336n0 c0336n0) {
        StringBuilder sb = new StringBuilder(c0336n0.d());
        for (int i4 = 0; i4 < c0336n0.d(); i4++) {
            byte b4 = c0336n0.b(i4);
            if (b4 == 34) {
                sb.append("\\\"");
            } else if (b4 == 39) {
                sb.append("\\'");
            } else if (b4 != 92) {
                switch (b4) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b4 < 32 || b4 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b4 >>> 6) & 3) + 48));
                            sb.append((char) (((b4 >>> 3) & 7) + 48));
                            sb.append((char) ((b4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b4);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static AbstractC0340p0 y() {
        String str;
        ClassLoader classLoader = AbstractC0347t0.class.getClassLoader();
        if (AbstractC0340p0.class.equals(AbstractC0340p0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!AbstractC0340p0.class.getPackage().equals(AbstractC0347t0.class.getPackage())) {
                throw new IllegalArgumentException(AbstractC0340p0.class.getName());
            }
            str = AbstractC0340p0.class.getPackage().getName() + ".BlazeGenerated" + AbstractC0340p0.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    AbstractC0005f.x(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e4) {
                    throw new IllegalStateException(e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(e5);
                }
            } catch (InstantiationException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new AbstractC0347t0[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e8) {
                        Logger.getLogger(C0338o0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(AbstractC0340p0.class.getSimpleName()), (Throwable) e8);
                    }
                }
                if (arrayList.size() == 1) {
                    return (AbstractC0340p0) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (AbstractC0340p0) AbstractC0340p0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(e9);
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
