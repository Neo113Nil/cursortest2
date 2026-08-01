package H1;

import G1.AbstractC0001b;
import K.F;
import K.Q;
import K.W;
import K.a0;
import U.s;
import U.t;
import android.animation.TimeInterpolator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import b1.C0082b;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import u0.C0372k;
import z.AbstractC0401d;
import z1.q;

/* loaded from: classes.dex */
public abstract class l implements a0 {
    public static int A(View view, int i) {
        Context context = view.getContext();
        TypedValue f02 = d.f0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = f02.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : f02.data;
    }

    public static ColorStateList B(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList z2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = d.z(context, resourceId)) == null) ? typedArray.getColorStateList(i) : z2;
    }

    public static ColorStateList C(Context context, C0372k c0372k, int i) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) c0372k.f4191b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = d.z(context, resourceId)) == null) ? c0372k.c(i) : z2;
    }

    public static ColorStateList D(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C.b.q(drawable)) {
            return null;
        }
        colorStateList = C.b.e(drawable).getColorStateList();
        return colorStateList;
    }

    public static float E(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Q.e.b(edgeEffect) : RecyclerView.f1937A0;
    }

    public static Drawable F(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable j2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (j2 = AbstractC0091d.j(context, resourceId)) == null) ? typedArray.getDrawable(i) : j2;
    }

    public static Set G() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static float I(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.f1937A0 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File J(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int K(int i) {
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
        throw new IllegalArgumentException(AbstractC0001b.f("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean L(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean M(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f66a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = green / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = blue / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean N(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean O(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean P(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int Q(float f2, int i, int i2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static int R(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static Typeface S(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, d.m(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static int T(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static MappedByteBuffer U(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static float X(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static B.d Y(String str) {
        int i;
        String str2;
        k1.e.e(str, "statusLine");
        boolean C2 = r1.l.C(str, "HTTP/1.", false);
        q qVar = q.HTTP_1_0;
        if (C2) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                qVar = q.HTTP_1_1;
            }
        } else {
            if (!r1.l.C(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                k1.e.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new B.d(qVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static b1.j Z(b1.j jVar, b1.j jVar2) {
        k1.e.e(jVar2, "context");
        return jVar2 == b1.k.f2050a ? jVar : (b1.j) jVar2.k(jVar, C0082b.d);
    }

    public static final void a0(Object[] objArr, int i, int i2) {
        k1.e.e(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static int b0(Context context, int i, int i2) {
        TypedValue d02 = d.d0(context, i);
        return (d02 == null || d02.type != 16) ? i2 : d02.data;
    }

    public static TimeInterpolator c0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!P(valueOf, "cubic-bezier") && !P(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (P(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return M.a.b(I(split, 0), I(split, 1), I(split, 2), I(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!P(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C.g.b(x(substring), path);
            return M.a.c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static void f0(View view, R0.g gVar) {
        K0.a aVar = gVar.f917a.f904b;
        if (aVar == null || !aVar.f679a) {
            return;
        }
        float f2 = RecyclerView.f1937A0;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = Q.f578a;
            f2 += F.i((View) parent);
        }
        R0.f fVar = gVar.f917a;
        if (fVar.f911l != f2) {
            fVar.f911l = f2;
            gVar.m();
        }
    }

    public static void g0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static final boolean h(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!k1.e.a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final void h0(Object obj) {
        if (obj instanceof X0.d) {
            throw ((X0.d) obj).f1272a;
        }
    }

    public static final String i(Object[] objArr, int i, int i2, Y0.e eVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == eVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        k1.e.d(sb2, "toString(...)");
        return sb2;
    }

    public static M1.e j() {
        M1.e eVar = M1.e.f794l;
        k1.e.b(eVar);
        M1.e eVar2 = eVar.f796f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            M1.e.i.await(M1.e.f792j, TimeUnit.MILLISECONDS);
            M1.e eVar3 = M1.e.f794l;
            k1.e.b(eVar3);
            if (eVar3.f796f != null || System.nanoTime() - nanoTime < M1.e.f793k) {
                return null;
            }
            return M1.e.f794l;
        }
        long nanoTime2 = eVar2.f797g - System.nanoTime();
        if (nanoTime2 > 0) {
            M1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        M1.e eVar4 = M1.e.f794l;
        k1.e.b(eVar4);
        eVar4.f796f = eVar2.f796f;
        eVar2.f796f = null;
        return eVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = R(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean l2 = l(i, rect, rect2);
        if (l(i, rect, rect3) || !l2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean l(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void m(long j2, M1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        M1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((M1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        M1.i iVar = (M1.i) arrayList.get(i2);
        M1.i iVar2 = (M1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            M1.i iVar3 = (M1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f799b / j3) + j2 + 2 + i12 + 1;
            fVar.C(-i12);
            fVar.C(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.C(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((M1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.C(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                M1.f fVar3 = new M1.f();
                fVar.C(((int) ((fVar3.f799b / j3) + j4)) * (-1));
                m(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.z(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((M1.i) arrayList.get(i16 - 1)).d(i8) != ((M1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f799b / j5) + j2 + 2 + (i15 * 2);
        fVar.C(i15);
        fVar.C(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((M1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((M1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.C(d & 255);
            }
        }
        M1.f fVar4 = new M1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((M1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((M1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((M1.i) arrayList.get(i18)).a()) {
                fVar.C(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.C(((int) ((fVar4.f799b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                m(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.z(fVar4);
    }

    public static final void n(View view) {
        k1.e.e(view, "<this>");
        W w2 = new W(view, null);
        q1.e eVar = new q1.e();
        eVar.d = AbstractC0091d.e(eVar, eVar, w2);
        while (eVar.hasNext()) {
            View view2 = (View) eVar.next();
            R.a aVar = (R.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new R.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f897a;
            int y02 = Y0.k.y0(arrayList);
            if (-1 < y02) {
                arrayList.get(y02).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static int o(Context context, String str) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d = AbstractC0401d.d(str);
        if (d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                c2 = AbstractC0401d.c((AppOpsManager) AbstractC0401d.a(context, AppOpsManager.class), d, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = z.e.c(context);
                c2 = z.e.a(c3, d, Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = z.e.a(c3, d, myUid, z.e.b(context));
                }
            } else {
                c2 = AbstractC0401d.c((AppOpsManager) AbstractC0401d.a(context, AppOpsManager.class), d, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] q(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static final void r(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static boolean s(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean t2 = t(file, inputStream);
                p(inputStream);
                return t2;
            } catch (Throwable th) {
                th = th;
                p(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean t(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            p(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t u(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        R0.e cVar = Build.VERSION.SDK_INT >= 28 ? new U.c(7) : new R0.e(7);
        PackageManager packageManager = context.getPackageManager();
        d.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] k2 = cVar.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : k2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new t(new s(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static d v(int i) {
        if (i != 0 && i == 1) {
            return new R0.d();
        }
        return new R0.i();
    }

    public static final X0.d w(Throwable th) {
        k1.e.e(th, "exception");
        return new X0.d(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C.g[] x(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = q(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new C.g(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C.g(str.charAt(i3), new float[0]));
        }
        return (C.g[]) arrayList.toArray(new C.g[i]);
    }

    public static C.g[] y(C.g[] gVarArr) {
        C.g[] gVarArr2 = new C.g[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            gVarArr2[i] = new C.g(gVarArr[i]);
        }
        return gVarArr2;
    }

    public static int z(Context context, int i, int i2) {
        Integer num;
        TypedValue d02 = d.d0(context, i);
        if (d02 != null) {
            int i3 = d02.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : d02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public abstract InputFilter[] H(InputFilter[] inputFilterArr);

    public abstract View V(int i);

    public abstract boolean W();

    @Override // K.a0
    public void d() {
    }

    public abstract void d0(boolean z2);

    public abstract void e0(boolean z2);

    @Override // K.a0
    public void g() {
    }
}
