package b4;

import android.animation.TimeInterpolator;
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
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Display;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.lifecycle.j0;
import com.gdmhkmf.belbet.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k1.w;
import l.z0;
import n0.s;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f851a = true;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s E(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i4;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i4 = 1;
            if (position != 1) {
                i4 = 2;
                if (position != 2) {
                    i4 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(a4.b.f("Invalid position: ", position));
                    }
                }
            }
        } else {
            i4 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new s(i4, radius, center);
    }

    public static File G(Context context) {
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

    public static l0.c H(z0 z0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new l0.c(g0.a.g(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = z0Var.getBreakStrategy();
        int hyphenationFrequency = z0Var.getHyphenationFrequency();
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (z0Var.getInputType() & 15) != 3) {
                boolean z4 = z0Var.getLayoutDirection() == 1;
                switch (z0Var.getTextDirection()) {
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
                        if (z4) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(g0.a.a(DecimalFormatSymbols.getInstance(z0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new l0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean I(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = f0.a.f1413a;
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
        double d5 = green / 255.0d;
        double pow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = blue / 255.0d;
        double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d7 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d7;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d7 / 100.0d > 0.5d;
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean L(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean M(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int P(int i, int i4, float f5) {
        return f0.a.b(f0.a.d(i4, Math.round(Color.alpha(i4) * f5)), i);
    }

    public static Typeface Q(Configuration configuration, Typeface typeface) {
        int i;
        int i4;
        int weight;
        int i5;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i5 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, i(i5 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static MappedByteBuffer R(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
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
    }

    public static void S(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static int U(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static int V(Context context, int i, int i4) {
        TypedValue O = d.O(context.getTheme(), i);
        return (O == null || O.type != 16) ? i4 : O.data;
    }

    public static TimeInterpolator W(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!M(valueOf, "cubic-bezier") && !M(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (M(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(z(split, 0), z(split, 1), z(split, 2), z(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!M(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            f0.d.b(o(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(substring), e4);
        }
    }

    public static v0.f X(Context context) {
        TypedValue N = d.N(context, R.attr.motionSpringFastSpatial);
        int[] iArr = q1.a.f3162z;
        TypedArray obtainStyledAttributes = N == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(N.resourceId, iArr);
        v0.f fVar = new v0.f();
        try {
            float f5 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f5 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f6 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f6 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f5 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar.f3717a = Math.sqrt(f5);
            fVar.f3719c = false;
            if (f6 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar.f3718b = f6;
            fVar.f3719c = false;
            obtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void a(StringBuilder sb, Object obj, h3.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void a0(Window window, boolean z4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            j0.a.d(window, z4);
        } else {
            if (i >= 30) {
                j0.a.c(window, z4);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static g4.e b() {
        g4.e eVar = g4.e.f1930l;
        i3.d.b(eVar);
        g4.e eVar2 = eVar.f1932f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            g4.e.i.await(g4.e.f1928j, TimeUnit.MILLISECONDS);
            g4.e eVar3 = g4.e.f1930l;
            i3.d.b(eVar3);
            if (eVar3.f1932f != null || System.nanoTime() - nanoTime < g4.e.f1929k) {
                return null;
            }
            return g4.e.f1930l;
        }
        long nanoTime2 = eVar2.f1933g - System.nanoTime();
        if (nanoTime2 > 0) {
            g4.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        g4.e eVar4 = g4.e.f1930l;
        i3.d.b(eVar4);
        eVar4.f1932f = eVar2.f1932f;
        eVar2.f1932f = null;
        return eVar2;
    }

    public static void b0(TextView textView, int i) {
        g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            g0.a.h(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(long j2, g4.f fVar, int i, ArrayList arrayList, int i4, int i5, ArrayList arrayList2) {
        int i6;
        int i7;
        ArrayList arrayList3;
        long j4;
        int i8;
        int i9 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i10 = i4; i10 < i5; i10++) {
            if (((g4.i) arrayList4.get(i10)).a() < i9) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        g4.i iVar = (g4.i) arrayList.get(i4);
        g4.i iVar2 = (g4.i) arrayList4.get(i5 - 1);
        if (i9 == iVar.a()) {
            int intValue = ((Number) arrayList5.get(i4)).intValue();
            int i11 = i4 + 1;
            g4.i iVar3 = (g4.i) arrayList4.get(i11);
            i6 = i11;
            i7 = intValue;
            iVar = iVar3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (iVar.d(i9) == iVar2.d(i9)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i9; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j5 = 4;
            long j6 = (fVar.f1935g / j5) + j2 + 2 + i12 + 1;
            fVar.z(-i12);
            fVar.z(i7);
            int i14 = i9 + i12;
            while (i9 < i14) {
                fVar.z(iVar.d(i9) & 255);
                i9++;
            }
            if (i6 + 1 == i5) {
                if (i14 != ((g4.i) arrayList4.get(i6)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.z(((Number) arrayList5.get(i6)).intValue());
                return;
            } else {
                g4.f fVar2 = new g4.f();
                fVar.z(((int) ((fVar2.f1935g / j5) + j6)) * (-1));
                c(j6, fVar2, i14, arrayList4, i6, i5, arrayList5);
                fVar.w(fVar2);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i6 + 1; i16 < i5; i16++) {
            if (((g4.i) arrayList4.get(i16 - 1)).d(i9) != ((g4.i) arrayList4.get(i16)).d(i9)) {
                i15++;
            }
        }
        long j7 = 4;
        long j8 = (fVar.f1935g / j7) + j2 + 2 + (i15 * 2);
        fVar.z(i15);
        fVar.z(i7);
        for (int i17 = i6; i17 < i5; i17++) {
            int d = ((g4.i) arrayList4.get(i17)).d(i9);
            if (i17 == i6 || d != ((g4.i) arrayList4.get(i17 - 1)).d(i9)) {
                fVar.z(d & 255);
            }
        }
        g4.f fVar3 = new g4.f();
        int i18 = i6;
        while (i18 < i5) {
            byte d5 = ((g4.i) arrayList4.get(i18)).d(i9);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i5) {
                    i20 = i5;
                    break;
                } else if (d5 != ((g4.i) arrayList4.get(i20)).d(i9)) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i19 == i20 && i9 + 1 == ((g4.i) arrayList4.get(i18)).a()) {
                fVar.z(((Number) arrayList5.get(i18)).intValue());
                arrayList3 = arrayList5;
                j4 = j8;
                i8 = i20;
            } else {
                fVar.z(((int) ((fVar3.f1935g / j7) + j8)) * (-1));
                arrayList3 = arrayList5;
                j4 = j8;
                i8 = i20;
                c(j4, fVar3, i9 + 1, arrayList, i18, i8, arrayList3);
                arrayList4 = arrayList;
            }
            j8 = j4;
            i18 = i8;
            arrayList5 = arrayList3;
        }
        fVar.w(fVar3);
    }

    public static void c0(TextView textView, int i) {
        g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i4);
        }
    }

    public static void d0(TextView textView, int i) {
        g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void e0(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            d2.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                d2.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            d2.a.a(outline, path);
        }
    }

    public static void f(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f0(View view, o2.j jVar) {
        e2.a aVar = jVar.f2955g.f2941b;
        if (aVar == null || !aVar.f1385a) {
            return;
        }
        float f5 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f5 += ((View) parent).getElevation();
        }
        o2.h hVar = jVar.f2955g;
        if (hVar.f2948l != f5) {
            hVar.f2948l = f5;
            jVar.y();
        }
    }

    public static void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h0(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            w.b(viewGroup, z4);
        } else if (f851a) {
            try {
                w.b(viewGroup, z4);
            } catch (NoSuchMethodError unused) {
                f851a = false;
            }
        }
    }

    public static int i(int i, int i4, int i5) {
        return i < i4 ? i4 : i > i5 ? i5 : i;
    }

    public static int i0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static float[] j(float[] fArr, int i) {
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

    public static boolean k(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean l4 = l(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return l4;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static ActionMode.Callback k0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof r0.g) || callback == null) ? callback : new r0.g(callback, textView);
    }

    public static boolean l(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v m(Context context) {
        ProviderInfo providerInfo;
        k0.d dVar;
        ApplicationInfo applicationInfo;
        o2.f cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new o2.f(2);
        PackageManager packageManager = context.getPackageManager();
        h(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] i = cVar.i(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : i) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new k0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
            if (dVar != null) {
                return null;
            }
            return new v(new u(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }

    public static d n(int i) {
        return i != 0 ? i != 1 ? new o2.l() : new o2.e() : new o2.l();
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
    public static f0.d[] o(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < str.length()) {
            while (i6 < str.length()) {
                char charAt = str.charAt(i6);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i6++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i5, i6).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i4) == 'z' || trim.charAt(i4) == 'Z') {
                            fArr = new float[i4];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i7 = i4;
                                int i8 = 1;
                                while (i8 < length) {
                                    int i9 = i4;
                                    int i10 = i9;
                                    int i11 = i10;
                                    int i12 = i11;
                                    for (int i13 = i8; i13 < trim.length(); i13++) {
                                        char charAt2 = trim.charAt(i13);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i13 != i8 && i9 == 0) {
                                                            i9 = 0;
                                                            i11 = 1;
                                                            i12 = 1;
                                                            break;
                                                        }
                                                        i9 = 0;
                                                        break;
                                                    case '.':
                                                        if (i10 == 0) {
                                                            i9 = 0;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i9 = 0;
                                                        i11 = 1;
                                                        i12 = 1;
                                                        break;
                                                    default:
                                                        i9 = 0;
                                                        break;
                                                }
                                            } else {
                                                i9 = 1;
                                            }
                                            if (i11 == 0) {
                                                if (i8 < i13) {
                                                    fArr2[i7] = Float.parseFloat(trim.substring(i8, i13));
                                                    i7++;
                                                }
                                                i8 = i12 == 0 ? i13 : i13 + 1;
                                                i4 = 0;
                                            }
                                        }
                                        i9 = 0;
                                        i11 = 1;
                                        if (i11 == 0) {
                                        }
                                    }
                                    if (i8 < i13) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    i4 = 0;
                                }
                                fArr = j(fArr2, i7);
                                i4 = 0;
                            } catch (NumberFormatException e4) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e4);
                            }
                        }
                        arrayList.add(new f0.d(trim.charAt(i4), fArr));
                    }
                    i5 = i6;
                    i6++;
                    i4 = 0;
                }
                i6++;
            }
            trim = str.substring(i5, i6).trim();
            if (!trim.isEmpty()) {
            }
            i5 = i6;
            i6++;
            i4 = 0;
        }
        if (i6 - i5 != 1 || i5 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new f0.d(str.charAt(i5), new float[0]));
        }
        return (f0.d[]) arrayList.toArray(new f0.d[i]);
    }

    public static f0.d[] p(f0.d[] dVarArr) {
        f0.d[] dVarArr2 = new f0.d[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            dVarArr2[i] = new f0.d(dVarArr[i]);
        }
        return dVarArr2;
    }

    public static Integer q(Context context, int i) {
        TypedValue N = d.N(context, i);
        if (N != null) {
            return Integer.valueOf(U(context, N));
        }
        return null;
    }

    public static ColorStateList r(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a5;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a5 = c0.c.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a5;
    }

    public static ColorStateList s(Context context, t tVar, int i) {
        int resourceId;
        ColorStateList a5;
        TypedArray typedArray = (TypedArray) tVar.f473b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a5 = c0.c.a(context, resourceId)) == null) ? tVar.c(i) : a5;
    }

    public static ColorStateList t(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !a.v.v(drawable)) {
            return null;
        }
        colorStateList = a.v.f(drawable).getColorStateList();
        return colorStateList;
    }

    public static Drawable u(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable y4;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (y4 = d.y(context, resourceId)) == null) ? typedArray.getDrawable(i) : y4;
    }

    public static Set v() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class y(n3.a aVar) {
        i3.d.e(aVar, "<this>");
        if (j0.class.isPrimitive()) {
            String name = j0.class.getName();
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
        return j0.class;
    }

    public static float z(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public abstract int A();

    public abstract int B();

    public abstract int C(View view);

    public abstract int D(CoordinatorLayout coordinatorLayout);

    public abstract int F();

    public abstract boolean J(float f5);

    public abstract boolean N(View view);

    public abstract boolean O(float f5, float f6);

    public abstract Object T(Intent intent, int i);

    public abstract void Y(boolean z4);

    public abstract void Z(boolean z4);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i);

    public abstract boolean g0(View view, float f5);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4);

    public abstract int w();

    public abstract int x();
}
