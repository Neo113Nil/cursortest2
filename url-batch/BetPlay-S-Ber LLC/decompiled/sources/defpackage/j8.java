package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class j8 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object[] b = new Object[0];
    public static final Object c = new Object();
    public static final ix d = new ix(2);
    public static final ix e = new ix(8);
    public static final ix f = new ix(9);
    public static final ix g = new ix(7);
    public static boolean h = true;
    public static Field i;
    public static boolean j;

    public static boolean A(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int B(g7 g7Var, Object obj, int i2) {
        int i3 = g7Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int e2 = op.e(i3, i2, g7Var.f);
            if (e2 < 0 || op.d(obj, g7Var.g[e2])) {
                return e2;
            }
            int i4 = e2 + 1;
            while (i4 < i3 && g7Var.f[i4] == i2) {
                if (op.d(obj, g7Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = e2 - 1; i5 >= 0 && g7Var.f[i5] == i2; i5--) {
                if (op.d(obj, g7Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static boolean C(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = nb.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length != 3) {
            o8.j("outXyz must have a length of 3.");
            return false;
        }
        double d2 = red / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = green / 255.0d;
        double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = blue / 255.0d;
        double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static int D(int i2, int i3, float f2) {
        return nb.b(nb.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static void E(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static TypedArray F(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static long I(String str, int i2) {
        int k = k(str, 0, i2, false);
        Matcher matcher = pd.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (k < i2) {
            int k2 = k(str, k + 1, i2, true);
            matcher.region(k, k2);
            if (i4 == -1 && matcher.usePattern(pd.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(pd.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = pd.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = l40.h0(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(pd.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            k = k(str, k2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            o8.j("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            o8.j("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            o8.j("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            o8.j("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            o8.j("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            o8.j("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(y70.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static String J(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        t8 t8Var = t8.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        op.g(encoded.length, 0L, length);
        op.m(length, encoded.length);
        int i2 = 0;
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        copyOfRange.getClass();
        t8 t8Var2 = new t8(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, t8Var2.a());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        new t8(digest);
        byte[] bArr = a.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = digest[i2];
            int i4 = i2 + 2;
            byte b3 = digest[i2 + 1];
            i2 += 3;
            byte b4 = digest[i4];
            bArr2[i3] = bArr[(b2 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i2];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b5 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = digest[i2];
            byte b7 = digest[i6];
            bArr2[i3] = bArr[(b6 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, v9.a));
        return sb.toString();
    }

    public static void K(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static int L(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static final int M(h20 h20Var, int i2) {
        int i3;
        int[] iArr = h20Var.k;
        int i4 = i2 + 1;
        int length = h20Var.j.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static void N(TextView textView, int i2) {
        vw.m(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            rf.h(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void O(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void P(TextView textView, int i2) {
        vw.m(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void Q(TextView textView, int i2) {
        vw.m(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void R(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            wf.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                vf.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            vf.a(outline, path);
        }
    }

    public static int T(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object[] U(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return b;
    }

    public static final Object[] V(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static void W(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static ActionMode.Callback X(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof x50) || callback == null) ? callback : new x50(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(Context context, Executor executor, wx wxVar, boolean z) {
        boolean z2;
        ?? r7;
        kf[] kfVarArr;
        kf[] kfVarArr2;
        kf[] kfVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        jf jfVar;
        String str;
        String str2;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                wxVar.b(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        yx.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = op.k;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            jf jfVar2 = new jf(assets, executor, wxVar, name, file2);
            byte[] bArr3 = jfVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        jfVar2.b(4, null);
                    }
                    jfVar2.f = true;
                    try {
                        try {
                            r7 = jfVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            wxVar.b(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            kfVarArr2 = jfVar2.g;
                            if (kfVarArr2 != null) {
                            }
                            wx wxVar2 = jfVar2.b;
                            kfVarArr3 = jfVar2.g;
                            byte[] bArr4 = jfVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (kfVarArr3 != null) {
                            }
                            bArr = jfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            yx.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            wxVar.b(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            kfVarArr2 = jfVar2.g;
                            if (kfVarArr2 != null) {
                            }
                            wx wxVar22 = jfVar2.b;
                            kfVarArr3 = jfVar2.g;
                            byte[] bArr42 = jfVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (kfVarArr3 != null) {
                            }
                            bArr = jfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            yx.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    wxVar.b(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        wxVar.b(7, e5);
                                    }
                                    kfVarArr = null;
                                    jfVar2.g = kfVarArr;
                                    kfVarArr2 = jfVar2.g;
                                    if (kfVarArr2 != null) {
                                    }
                                    wx wxVar222 = jfVar2.b;
                                    kfVarArr3 = jfVar2.g;
                                    byte[] bArr422 = jfVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (kfVarArr3 != null) {
                                    }
                                    bArr = jfVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yx.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                wxVar.b(7, e6);
                                r7.close();
                                kfVarArr = null;
                                jfVar2.g = kfVarArr;
                                kfVarArr2 = jfVar2.g;
                                if (kfVarArr2 != null) {
                                }
                                wx wxVar2222 = jfVar2.b;
                                kfVarArr3 = jfVar2.g;
                                byte[] bArr4222 = jfVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (kfVarArr3 != null) {
                                }
                                bArr = jfVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                yx.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, l70.L(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            kfVarArr = op.M(r7, l70.L(r7, 4), jfVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                wxVar.b(7, e7);
                            }
                            jfVar2.g = kfVarArr;
                        }
                        kfVarArr2 = jfVar2.g;
                        if (kfVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = jfVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                wxVar.b(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                wxVar.b(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                jfVar2.g = null;
                                wxVar.b(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(op.l, l70.L(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] L = l70.L(a2, 4);
                                    jfVar2.g = op.J(a2, L, bArr3, kfVarArr2);
                                    a2.close();
                                    jfVar = jfVar2;
                                    r7 = L;
                                    if (jfVar != null) {
                                        jfVar2 = jfVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                jfVar = null;
                                r7 = str;
                                if (jfVar != null) {
                                }
                            }
                        }
                        wx wxVar22222 = jfVar2.b;
                        kfVarArr3 = jfVar2.g;
                        byte[] bArr42222 = jfVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (kfVarArr3 != null && bArr42222 != null) {
                            z7 = jfVar2.f;
                            if (z7) {
                                o8.t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                wxVar22222.b(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                wxVar22222.b(8, e12);
                                z8 = z7;
                            }
                            if (op.V(byteArrayOutputStream, bArr42222, kfVarArr3)) {
                                jfVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                jfVar2.g = null;
                                z112222 = z8;
                            } else {
                                wxVar22222.b(5, null);
                                jfVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = jfVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!jfVar2.f) {
                                    o8.t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(jfVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                jfVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                jfVar2.h = null;
                                                                                jfVar2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        z112222 = true;
                                        jfVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        yx.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        jfVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        yx.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    jfVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yx.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    jfVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    yx.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                jfVar2.h = null;
                                jfVar2.g = null;
                            }
                        }
                        if (z4) {
                            E(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            jfVar2.b(4, null);
                        }
                        jfVar2.f = true;
                        r7 = jfVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        kfVarArr2 = jfVar2.g;
                        if (kfVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = jfVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        wx wxVar222222 = jfVar2.b;
                        kfVarArr3 = jfVar2.g;
                        byte[] bArr422222 = jfVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (kfVarArr3 != null) {
                            z7 = jfVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = jfVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        jfVar2.b(4, null);
                    }
                }
                yx.c(context, (z6 || !z) ? false : z9);
            }
            jfVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            yx.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            wxVar.b(7, e17);
            yx.c(context, false);
        }
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void b(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = qp.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = kx.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void c(StringBuilder sb, Object obj, gm gmVar) {
        if (gmVar != null) {
            sb.append((CharSequence) gmVar.a(obj));
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

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void e(m90 m90Var, v10 v10Var, iq iqVar) {
        Object obj;
        v10Var.getClass();
        iqVar.getClass();
        HashMap hashMap = m90Var.a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = m90Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.c(iqVar, v10Var);
        hq hqVar = ((a) iqVar).c;
        if (hqVar == hq.g || hqVar.compareTo(hq.i) >= 0) {
            v10Var.d();
        } else {
            iqVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(iqVar, v10Var));
        }
    }

    public static ImageView.ScaleType f(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static float[] g(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static q10 h(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new q10();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                hashMap.put(str, bundle2.get(str));
            }
            return new q10(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            o8.t("Invalid bundle passed as restored state");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new q10(linkedHashMap);
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
    public static ex[] i(String str) {
        int i2;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char charAt = str.charAt(i5);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i5++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i4, i5).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i3) == 'z' || trim.charAt(i3) == 'Z') {
                            fArr = new float[i3];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i6 = i3;
                                int i7 = 1;
                                while (i7 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i7; i12 < trim.length(); i12++) {
                                        char charAt2 = trim.charAt(i12);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i12 != i7 && i8 == 0) {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                            break;
                                                        }
                                                        i8 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 == 0) {
                                                if (i7 < i12) {
                                                    fArr2[i6] = Float.parseFloat(trim.substring(i7, i12));
                                                    i6++;
                                                }
                                                i7 = i11 == 0 ? i12 : i12 + 1;
                                                i3 = 0;
                                            }
                                        }
                                        i8 = 0;
                                        i10 = 1;
                                        if (i10 == 0) {
                                        }
                                    }
                                    if (i7 < i12) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    i3 = 0;
                                }
                                fArr = g(fArr2, i6);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new ex(trim.charAt(i3), fArr));
                    }
                    i4 = i5;
                    i5++;
                    i3 = 0;
                }
                i5++;
            }
            trim = str.substring(i4, i5).trim();
            if (!trim.isEmpty()) {
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new ex(str.charAt(i4), new float[0]));
        }
        return (ex[]) arrayList.toArray(new ex[i2]);
    }

    public static final q10 j(ev evVar) {
        LinkedHashMap linkedHashMap = evVar.a;
        x10 x10Var = (x10) linkedHashMap.get(e);
        if (x10Var == null) {
            o8.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        r90 r90Var = (r90) linkedHashMap.get(f);
        if (r90Var == null) {
            o8.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(g);
        String str = (String) linkedHashMap.get(vg.o);
        if (str == null) {
            o8.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        u10 b2 = x10Var.getSavedStateRegistry().b();
        r10 r10Var = b2 instanceof r10 ? (r10) b2 : null;
        if (r10Var == null) {
            o8.t("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = u(r90Var).d;
        q10 q10Var = (q10) linkedHashMap2.get(str);
        if (q10Var != null) {
            return q10Var;
        }
        Class[] clsArr = q10.f;
        r10Var.b();
        Bundle bundle2 = r10Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = r10Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = r10Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            r10Var.c = null;
        }
        q10 h2 = h(bundle3, bundle);
        linkedHashMap2.put(str, h2);
        return h2;
    }

    public static int k(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final void l(x10 x10Var) {
        hq hqVar = ((a) x10Var.getLifecycle()).c;
        if (hqVar != hq.g && hqVar != hq.h) {
            o8.j("Failed requirement.");
        } else if (x10Var.getSavedStateRegistry().b() == null) {
            r10 r10Var = new r10(x10Var.getSavedStateRegistry(), (r90) x10Var);
            x10Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", r10Var);
            x10Var.getLifecycle().a(new SavedStateHandleAttacher(r10Var));
        }
    }

    public static View m(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static wt n(String str) {
        str.getClass();
        Matcher matcher = wt.c.matcher(str);
        if (!matcher.lookingAt()) {
            o8.i(str, "No subtype found for: \"");
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        group.toLowerCase(locale).getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        group2.toLowerCase(locale).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = wt.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (t40.e0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new wt(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static dy o(String str) {
        if (str.equals("http/1.0")) {
            return dy.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return dy.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return dy.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return dy.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return dy.SPDY_3;
        }
        if (str.equals("quic")) {
            return dy.QUIC;
        }
        o8.x("Unexpected protocol: ".concat(str));
        return null;
    }

    public static Integer p(Context context, int i2) {
        TypedValue P = l70.P(context.getTheme(), i2);
        if (P != null) {
            return Integer.valueOf(L(context, P));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList q(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        t00 t00Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        u00 u00Var = new u00(resources, theme);
        synchronized (v00.c) {
            try {
                SparseArray sparseArray = (SparseArray) v00.b.get(u00Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (t00Var = (t00) sparseArray.get(i2)) != null) {
                    if (t00Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (t00Var.c != 0) {
                            }
                            colorStateList2 = t00Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = v00.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = mb.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (v00.c) {
            try {
                WeakHashMap weakHashMap = v00.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(u00Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(u00Var, sparseArray2);
                }
                sparseArray2.append(i2, new t00(colorStateList, u00Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList r(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !y.r(drawable)) {
            return null;
        }
        colorStateList = y.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static ob s(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        ob obVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new ob((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                obVar = ob.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                obVar = null;
            }
            if (obVar != null) {
                return obVar;
            }
        }
        return new ob((Shader) null, (ColorStateList) null, 0);
    }

    public static Object t(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return e0.b(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (w1.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final s10 u(r90 r90Var) {
        ArrayList arrayList = new ArrayList();
        g00.a.getClass();
        Class a2 = new qa(s10.class).a();
        a2.getClass();
        arrayList.add(new n90(a2));
        n90[] n90VarArr = (n90[]) arrayList.toArray(new n90[0]);
        return (s10) new r6(r90Var.getViewModelStore(), new j1(22, (n90[]) Arrays.copyOf(n90VarArr, n90VarArr.length)), r90Var instanceof ln ? ((ln) r90Var).getDefaultViewModelCreationExtras() : yd.b).g("androidx.lifecycle.internal.SavedStateHandlesVM", s10.class);
    }

    public static ox w(i6 i6Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new ox(rf.g(i6Var));
        }
        TextPaint textPaint = new TextPaint(i6Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = i6Var.getBreakStrategy();
        int hyphenationFrequency = i6Var.getHyphenationFrequency();
        if (i6Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (i6Var.getInputType() & 15) != 3) {
                boolean z = i6Var.getLayoutDirection() == 1;
                switch (i6Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
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
                byte directionality = Character.getDirectionality(rf.a(DecimalFormatSymbols.getInstance(i6Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new ox(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public abstract void G(Throwable th);

    public abstract void H(h8 h8Var);

    public void S(View view, float f2) {
        if (h) {
            try {
                da0.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f2);
    }

    public abstract int v(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public float x(View view) {
        if (h) {
            try {
                return da0.a(view);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    public abstract int y();

    public abstract ViewPropertyAnimator z(View view, int i2);
}
