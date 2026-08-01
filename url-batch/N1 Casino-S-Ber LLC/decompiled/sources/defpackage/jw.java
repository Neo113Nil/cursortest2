package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.aq;
import defpackage.up;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class jw {
    public static final Object f = new Object();
    public static final int[] g = new int[0];
    public static final Object[] h = new Object[0];
    public static final Object i = new Object();
    public static final vw j = new vw(2);
    public static final vw k = new vw(8);
    public static final vw l = new vw(9);
    public static final vw m = new vw(7);
    public static final int[] n = {R.attr.stateListAnimator};

    public static bx B(r5 r5Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new bx(zf.g(r5Var));
        }
        TextPaint textPaint = new TextPaint(r5Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = r5Var.getBreakStrategy();
        int hyphenationFrequency = r5Var.getHyphenationFrequency();
        if (r5Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (r5Var.getInputType() & 15) != 3) {
                boolean z = r5Var.getLayoutDirection() == 1;
                switch (r5Var.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(zf.a(DecimalFormatSymbols.getInstance(r5Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new bx(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean F(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int G(p6 p6Var, Object obj, int i2) {
        int i3 = p6Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int i4 = i(i3, i2, p6Var.f);
            if (i4 < 0 || zo.b(obj, p6Var.g[i4])) {
                return i4;
            }
            int i5 = i4 + 1;
            while (i5 < i3 && p6Var.f[i5] == i2) {
                if (zo.b(obj, p6Var.g[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = i4 - 1; i6 >= 0 && p6Var.f[i6] == i2; i6--) {
                if (zo.b(obj, p6Var.g[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static boolean H(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = lb.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length != 3) {
            t8.k("outXyz must have a length of 3.");
            return false;
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int I(int i2, int i3, float f2) {
        return lb.b(lb.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static void J(PackageInfo packageInfo, File file) {
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

    public static TypedArray K(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static float P(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ug.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z8 Q(ym ymVar) {
        int i2;
        int i3;
        int i4;
        String str;
        ym ymVar2 = ymVar;
        int size = ymVar2.size();
        int i5 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < size) {
            String b = ymVar2.b(i5);
            String d = ymVar2.d(i5);
            if (k40.j0(b, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d;
                    i2 = 0;
                    while (i2 < d.length()) {
                        int length = d.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d.length();
                                break;
                            }
                            i3 = size;
                            if (c40.n0("=,;", d.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = c40.y0(d.substring(i2, i10)).toString();
                        if (i10 == d.length() || d.charAt(i10) == ',' || d.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = r70.a;
                            int length2 = d.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d.length();
                                    break;
                                }
                            }
                            if (i11 >= d.length() || d.charAt(i11) != '\"') {
                                int length3 = d.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (c40.n0(",;", d.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = c40.y0(d.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int r0 = c40.r0(d, '\"', i15, 4);
                                str = d.substring(i15, r0);
                                i4 = r0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = r70.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = r70.v(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = r70.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = r70.v(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z9 = true;
                            }
                            i2 = i4;
                        }
                        size = i3;
                    }
                    i5++;
                    ymVar2 = ymVar;
                    size = size;
                }
            } else if (!k40.j0(b, "Pragma")) {
                i5++;
                ymVar2 = ymVar;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d.length()) {
            }
            i5++;
            ymVar2 = ymVar;
            size = size;
        }
        return new z8(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, !z ? null : str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(Context context, String str) {
        synchronized (f) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String V(Context context) {
        String str;
        synchronized (f) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    public static void W(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static int X(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static void Y(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.derinko.gbini.n1casino.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.derinko.gbini.n1casino.R.attr.state_liftable, -2130904209}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static void Z(TextView textView, int i2) {
        zo.d(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            zf.h(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void b0(TextView textView, int i2) {
        zo.d(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void c(StringBuilder sb, Object obj, xl xlVar) {
        if (xlVar != null) {
            sb.append((CharSequence) xlVar.a(obj));
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

    public static void c0(TextView textView, int i2) {
        zo.d(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void e0(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(bd bdVar, kq kqVar, ArrayList arrayList, int i2) {
        int i3;
        s9[] s9VarArr;
        int i4;
        int i5;
        lc[] lcVarArr;
        boolean z;
        ad adVar;
        float f2;
        boolean z2;
        boolean z3;
        int i6;
        ad adVar2;
        kq kqVar2;
        ad adVar3;
        e30 e30Var;
        lc lcVar;
        e30 e30Var2;
        ad adVar4;
        int i7;
        lc[] lcVarArr2;
        lc lcVar2;
        e30 e30Var3;
        ad adVar5;
        ad adVar6;
        int i8;
        lc lcVar3;
        lc[] lcVarArr3;
        int i9;
        lc lcVar4;
        e30 e30Var4;
        e30 e30Var5;
        int size;
        ArrayList arrayList2;
        int i10;
        ad adVar7;
        int i11;
        float f3;
        int i12;
        float f4;
        ad adVar8;
        int i13;
        int i14;
        int i15;
        ad adVar9;
        lc lcVar5;
        ad adVar10;
        bd bdVar2 = bdVar;
        kq kqVar3 = kqVar;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = bdVar2.z0;
            s9VarArr = bdVar2.C0;
            i4 = 0;
        } else {
            i3 = bdVar2.A0;
            s9VarArr = bdVar2.B0;
            i4 = 2;
        }
        int i16 = i3;
        s9[] s9VarArr2 = s9VarArr;
        int i17 = 0;
        while (i17 < i16) {
            s9 s9Var = s9VarArr2[i17];
            boolean z4 = s9Var.q;
            ad adVar11 = s9Var.a;
            lc[] lcVarArr4 = adVar11.Q;
            int i18 = 3;
            int i19 = 8;
            float f5 = 0.0f;
            if (z4) {
                i5 = i17;
            } else {
                int i20 = s9Var.l;
                int i21 = i20 * 2;
                ad adVar12 = adVar11;
                ad adVar13 = adVar12;
                boolean z5 = false;
                while (!z5) {
                    s9Var.i++;
                    ad[] adVarArr = adVar12.m0;
                    lc[] lcVarArr5 = adVar12.Q;
                    adVarArr[i20] = null;
                    adVar12.l0[i20] = null;
                    if (adVar12.g0 != i19) {
                        adVar12.j(i20);
                        lcVarArr5[i21].e();
                        int i22 = i21 + 1;
                        lcVarArr5[i22].e();
                        lcVarArr5[i21].e();
                        lcVarArr5[i22].e();
                        if (s9Var.b == null) {
                            s9Var.b = adVar12;
                        }
                        s9Var.d = adVar12;
                        int i23 = adVar12.p0[i20];
                        if (i23 == i18) {
                            int i24 = adVar12.t[i20];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                s9Var.j++;
                                float f6 = adVar12.k0[i20];
                                if (f6 > 0.0f) {
                                    i14 = i17;
                                    s9Var.k += f6;
                                } else {
                                    i14 = i17;
                                }
                                i15 = i20;
                                if (adVar12.g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f6 < 0.0f) {
                                        s9Var.n = true;
                                    } else {
                                        s9Var.o = true;
                                    }
                                    if (s9Var.h == null) {
                                        s9Var.h = new ArrayList();
                                    }
                                    s9Var.h.add(adVar12);
                                }
                                if (s9Var.f == null) {
                                    s9Var.f = adVar12;
                                }
                                ad adVar14 = s9Var.g;
                                if (adVar14 != null) {
                                    adVar14.l0[i15] = adVar12;
                                }
                                s9Var.g = adVar12;
                            } else {
                                i14 = i17;
                                i15 = i20;
                            }
                            if (i15 == 0) {
                                if (adVar12.r == 0 && adVar12.u == 0) {
                                    int i25 = adVar12.v;
                                }
                            } else if (adVar12.s == 0 && adVar12.x == 0) {
                                int i26 = adVar12.y;
                            }
                            adVar9 = adVar13;
                            if (adVar9 != adVar12) {
                                adVar9.m0[i15] = adVar12;
                            }
                            lcVar5 = lcVarArr5[i21 + 1].f;
                            if (lcVar5 != null) {
                                adVar10 = lcVar5.d;
                                lc lcVar6 = adVar10.Q[i21].f;
                                if (lcVar6 != null) {
                                }
                            }
                            adVar10 = null;
                            if (adVar10 != null) {
                                adVar10 = adVar12;
                                z5 = true;
                            }
                            adVar13 = adVar12;
                            i20 = i15;
                            i18 = 3;
                            i19 = 8;
                            adVar12 = adVar10;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i20;
                    adVar9 = adVar13;
                    if (adVar9 != adVar12) {
                    }
                    lcVar5 = lcVarArr5[i21 + 1].f;
                    if (lcVar5 != null) {
                    }
                    adVar10 = null;
                    if (adVar10 != null) {
                    }
                    adVar13 = adVar12;
                    i20 = i15;
                    i18 = 3;
                    i19 = 8;
                    adVar12 = adVar10;
                    i17 = i14;
                }
                i5 = i17;
                int i27 = i20;
                ad adVar15 = s9Var.b;
                if (adVar15 != null) {
                    adVar15.Q[i21].e();
                }
                ad adVar16 = s9Var.d;
                if (adVar16 != null) {
                    adVar16.Q[i21 + 1].e();
                }
                s9Var.c = adVar12;
                if (i27 == 0 && s9Var.m) {
                    s9Var.e = adVar12;
                } else {
                    s9Var.e = adVar11;
                }
                s9Var.p = s9Var.o && s9Var.n;
            }
            s9Var.q = true;
            if (arrayList3 == null || arrayList3.contains(adVar11)) {
                ad adVar17 = s9Var.c;
                ad adVar18 = s9Var.b;
                ad adVar19 = s9Var.d;
                ad adVar20 = s9Var.e;
                float f7 = s9Var.k;
                int[] iArr = bdVar2.p0;
                lc[] lcVarArr6 = bdVar2.Q;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i28 = adVar20.i0;
                    boolean z7 = i28 == 0;
                    lcVarArr = lcVarArr4;
                    boolean z8 = i28 == 1;
                    z = i28 == 2;
                    adVar = adVar11;
                    f2 = f7;
                    z3 = z8;
                    z2 = z7;
                } else {
                    lcVarArr = lcVarArr4;
                    int i29 = adVar20.j0;
                    boolean z9 = i29 == 0;
                    boolean z10 = i29 == 1;
                    z = i29 == 2;
                    adVar = adVar11;
                    f2 = f7;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    lc[] lcVarArr7 = adVar.Q;
                    int[] iArr2 = adVar.p0;
                    lc lcVar7 = lcVarArr7[i4];
                    int i30 = z ? 1 : 4;
                    int e = lcVar7.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && adVar.t[i2] == 0;
                    lc lcVar8 = lcVar7.f;
                    if (lcVar8 != null && adVar != adVar11) {
                        e = lcVar8.e() + e;
                    }
                    int i31 = e;
                    if (z13 && adVar != adVar11 && adVar != adVar18) {
                        i30 = 8;
                    }
                    ad adVar21 = adVar11;
                    lc lcVar9 = lcVar7.f;
                    if (lcVar9 != null) {
                        boolean z15 = z14;
                        e30 e30Var6 = lcVar7.i;
                        e30 e30Var7 = lcVar9.i;
                        if (adVar == adVar18) {
                            kqVar3.f(e30Var6, e30Var7, i31, 6);
                        } else {
                            kqVar3.f(e30Var6, e30Var7, i31, 8);
                        }
                        if (z15 && !z13) {
                            i30 = 5;
                        }
                        kqVar3.e(lcVar7.i, lcVar7.f.i, i31, (adVar == adVar18 && z13 && adVar.S[i2]) ? 5 : i30);
                    }
                    if (z12) {
                        if (adVar.g0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            kqVar3.f(lcVarArr7[i4 + 1].i, lcVarArr7[i4].i, 0, 5);
                        }
                        kqVar3.f(lcVarArr7[i4].i, lcVarArr6[i4].i, i13, 8);
                    }
                    lc lcVar10 = lcVarArr7[i4 + 1].f;
                    if (lcVar10 != null) {
                        adVar8 = lcVar10.d;
                        lc lcVar11 = adVar8.Q[i4].f;
                        if (lcVar11 != null) {
                        }
                    }
                    adVar8 = null;
                    if (adVar8 != null) {
                        adVar = adVar8;
                    } else {
                        z11 = true;
                    }
                    adVar11 = adVar21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (adVar19 != null) {
                    int i32 = i4 + 1;
                    if (adVar17.Q[i32].f != null) {
                        lc lcVar12 = adVar19.Q[i32];
                        if (adVar19.p0[i2] == 3 && adVar19.t[i2] == 0 && !z17) {
                            lc lcVar13 = lcVar12.f;
                            if (lcVar13.d == bdVar2) {
                                kqVar3.e(lcVar12.i, lcVar13.i, -lcVar12.e(), 5);
                                kqVar3.g(lcVar12.i, adVar17.Q[i32].f.i, -lcVar12.e(), 6);
                            }
                        }
                        if (z17) {
                            lc lcVar14 = lcVar12.f;
                            if (lcVar14.d == bdVar2) {
                                kqVar3.e(lcVar12.i, lcVar14.i, -lcVar12.e(), 4);
                            }
                        }
                        kqVar3.g(lcVar12.i, adVar17.Q[i32].f.i, -lcVar12.e(), 6);
                    }
                }
                if (z16) {
                    int i33 = i4 + 1;
                    e30 e30Var8 = lcVarArr6[i33].i;
                    lc lcVar15 = adVar17.Q[i33];
                    kqVar3.f(e30Var8, lcVar15.i, lcVar15.e(), 8);
                }
                ArrayList arrayList4 = s9Var.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (s9Var.n && !s9Var.p) {
                        f2 = s9Var.j;
                    }
                    ad adVar22 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        ad adVar23 = (ad) arrayList4.get(i34);
                        float[] fArr = adVar23.k0;
                        lc[] lcVarArr8 = adVar23.Q;
                        float f9 = fArr[i2];
                        if (f9 < f5) {
                            if (s9Var.p) {
                                arrayList2 = arrayList4;
                                i10 = size;
                                kqVar3.e(lcVarArr8[i4 + 1].i, lcVarArr8[i4].i, 0, 4);
                                f4 = f8;
                                i11 = i16;
                                f3 = f5;
                                f8 = f4;
                                i12 = i34;
                                i34 = i12 + 1;
                                i16 = i11;
                                arrayList4 = arrayList2;
                                size = i10;
                                f5 = f3;
                            } else {
                                f9 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i10 = size;
                        if (f9 == f5) {
                            f4 = f8;
                            kqVar3.e(lcVarArr8[i4 + 1].i, lcVarArr8[i4].i, 0, 8);
                            i11 = i16;
                            f3 = f5;
                            f8 = f4;
                            i12 = i34;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        } else {
                            float f10 = f8;
                            if (adVar22 != null) {
                                lc[] lcVarArr9 = adVar22.Q;
                                e30 e30Var9 = lcVarArr9[i4].i;
                                int i35 = i4 + 1;
                                e30 e30Var10 = lcVarArr9[i35].i;
                                e30 e30Var11 = lcVarArr8[i4].i;
                                e30 e30Var12 = lcVarArr8[i35].i;
                                o6 l2 = kqVar3.l();
                                adVar7 = adVar23;
                                float f11 = f5;
                                l2.b = f11;
                                f3 = f11;
                                if (f2 == f11 || f10 == f9) {
                                    i12 = i34;
                                    i11 = i16;
                                    l2.d.g(e30Var9, 1.0f);
                                    l2.d.g(e30Var10, -1.0f);
                                    l2.d.g(e30Var12, 1.0f);
                                    l2.d.g(e30Var11, -1.0f);
                                } else {
                                    h6 h6Var = l2.d;
                                    if (f10 == f3) {
                                        i12 = i34;
                                        h6Var.g(e30Var9, 1.0f);
                                        l2.d.g(e30Var10, -1.0f);
                                        i11 = i16;
                                    } else {
                                        i12 = i34;
                                        i11 = i16;
                                        if (f9 == f5) {
                                            h6Var.g(e30Var11, 1.0f);
                                            l2.d.g(e30Var12, -1.0f);
                                        } else {
                                            float f12 = (f10 / f2) / (f9 / f2);
                                            h6Var.g(e30Var9, 1.0f);
                                            l2.d.g(e30Var10, -1.0f);
                                            l2.d.g(e30Var12, f12);
                                            l2.d.g(e30Var11, -f12);
                                        }
                                    }
                                }
                                kqVar3.c(l2);
                            } else {
                                adVar7 = adVar23;
                                i11 = i16;
                                f3 = f5;
                                i12 = i34;
                            }
                            f8 = f9;
                            adVar22 = adVar7;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        }
                    }
                }
                i6 = i16;
                if (adVar18 == null || !(adVar18 == adVar19 || z17)) {
                    adVar2 = adVar19;
                    if (z2 && adVar18 != null) {
                        int i36 = s9Var.j;
                        boolean z18 = i36 > 0 && s9Var.i == i36;
                        ad adVar24 = adVar18;
                        ad adVar25 = adVar24;
                        while (true) {
                            lc[] lcVarArr10 = adVar25.Q;
                            if (adVar24 == null) {
                                break;
                            }
                            lc[] lcVarArr11 = adVar24.Q;
                            ad adVar26 = adVar24.m0[i2];
                            while (true) {
                                if (adVar26 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (adVar26.g0 != 8) {
                                    break;
                                } else {
                                    adVar26 = adVar26.m0[i2];
                                }
                            }
                            if (adVar26 != null || adVar24 == adVar2) {
                                lc lcVar16 = lcVarArr11[i4];
                                e30 e30Var13 = lcVar16.i;
                                lc lcVar17 = lcVar16.f;
                                e30 e30Var14 = lcVar17 != null ? lcVar17.i : null;
                                if (adVar25 != adVar24) {
                                    e30Var14 = lcVarArr10[i4 + 1].i;
                                } else if (adVar24 == adVar18) {
                                    lc lcVar18 = lcVarArr[i4].f;
                                    e30Var14 = lcVar18 != null ? lcVar18.i : null;
                                }
                                int e2 = lcVar16.e();
                                int i37 = i4 + 1;
                                int e3 = lcVarArr11[i37].e();
                                if (adVar26 != null) {
                                    lcVar2 = adVar26.Q[i4];
                                    lcVarArr2 = lcVarArr10;
                                    e30Var3 = lcVar2.i;
                                } else {
                                    lcVarArr2 = lcVarArr10;
                                    lcVar2 = adVar17.Q[i37].f;
                                    e30Var3 = lcVar2 != null ? lcVar2.i : null;
                                }
                                e30 e30Var15 = lcVarArr11[i37].i;
                                if (lcVar2 != null) {
                                    e3 += lcVar2.e();
                                }
                                int e4 = lcVarArr2[i37].e() + e2;
                                if (e30Var13 == null || e30Var14 == null || e30Var3 == null || e30Var15 == null) {
                                    adVar5 = adVar26;
                                    adVar6 = adVar25;
                                    i8 = 8;
                                } else {
                                    if (adVar24 == adVar18) {
                                        e4 = adVar18.Q[i4].e();
                                    }
                                    int i38 = e4;
                                    if (adVar24 == adVar2) {
                                        e3 = adVar2.Q[i37].e();
                                    }
                                    adVar5 = adVar26;
                                    adVar6 = adVar25;
                                    i8 = 8;
                                    kqVar.b(e30Var13, e30Var14, i38, 0.5f, e30Var3, e30Var15, e3, z18 ? 8 : 5);
                                }
                            } else {
                                adVar5 = adVar26;
                                adVar6 = adVar25;
                                i8 = i7;
                            }
                            if (adVar24.g0 != i8) {
                                adVar6 = adVar24;
                            }
                            adVar24 = adVar5;
                            adVar25 = adVar6;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && adVar18 != null) {
                            int i40 = s9Var.j;
                            boolean z19 = i40 > 0 && s9Var.i == i40;
                            ad adVar27 = adVar18;
                            ad adVar28 = adVar27;
                            while (true) {
                                lc[] lcVarArr12 = adVar27.Q;
                                if (adVar28 == null) {
                                    break;
                                }
                                lc[] lcVarArr13 = adVar28.Q;
                                ad adVar29 = adVar28.m0[i2];
                                while (adVar29 != null && adVar29.g0 == i39) {
                                    adVar29 = adVar29.m0[i2];
                                }
                                if (adVar28 == adVar18 || adVar28 == adVar2 || adVar29 == null) {
                                    adVar3 = adVar27;
                                } else {
                                    if (adVar29 == adVar2) {
                                        adVar29 = null;
                                    }
                                    lc lcVar19 = lcVarArr13[i4];
                                    e30 e30Var16 = lcVar19.i;
                                    int i41 = i4 + 1;
                                    e30 e30Var17 = lcVarArr12[i41].i;
                                    int e5 = lcVar19.e();
                                    int e6 = lcVarArr13[i41].e();
                                    if (adVar29 != null) {
                                        lcVar = adVar29.Q[i4];
                                        e30Var = lcVar.i;
                                        adVar3 = adVar27;
                                        lc lcVar20 = lcVar.f;
                                        e30Var2 = lcVar20 != null ? lcVar20.i : null;
                                    } else {
                                        adVar3 = adVar27;
                                        lc lcVar21 = adVar2.Q[i4];
                                        e30Var = lcVar21 != null ? lcVar21.i : null;
                                        e30 e30Var18 = lcVarArr13[i41].i;
                                        lcVar = lcVar21;
                                        e30Var2 = e30Var18;
                                    }
                                    if (lcVar != null) {
                                        e6 += lcVar.e();
                                    }
                                    int e7 = lcVarArr12[i41].e() + e5;
                                    ad adVar30 = adVar29;
                                    int i42 = e6;
                                    int i43 = z19 ? 8 : 4;
                                    if (e30Var16 == null || e30Var17 == null || e30Var == null || e30Var2 == null) {
                                        adVar4 = adVar30;
                                    } else {
                                        e30 e30Var19 = e30Var;
                                        adVar4 = adVar30;
                                        kqVar.b(e30Var16, e30Var17, e7, 0.5f, e30Var19, e30Var2, i42, i43);
                                    }
                                    adVar29 = adVar4;
                                }
                                if (adVar28.g0 != 8) {
                                    adVar3 = adVar28;
                                }
                                adVar28 = adVar29;
                                i39 = 8;
                                adVar27 = adVar3;
                            }
                            kqVar2 = kqVar;
                            lc lcVar22 = adVar18.Q[i4];
                            lc lcVar23 = lcVarArr[i4].f;
                            int i44 = i4 + 1;
                            lc lcVar24 = adVar2.Q[i44];
                            lc lcVar25 = adVar17.Q[i44].f;
                            if (lcVar23 != null) {
                                if (adVar18 != adVar2) {
                                    kqVar2.e(lcVar22.i, lcVar23.i, lcVar22.e(), 5);
                                } else if (lcVar25 != null) {
                                    kqVar2.b(lcVar22.i, lcVar23.i, lcVar22.e(), 0.5f, lcVar24.i, lcVar25.i, lcVar24.e(), 5);
                                }
                            }
                            if (lcVar25 != null && adVar18 != adVar2) {
                                kqVar2.e(lcVar24.i, lcVar25.i, -lcVar24.e(), 5);
                            }
                            if ((!z2 || z3) && adVar18 != null && adVar18 != adVar2) {
                                lc[] lcVarArr14 = adVar18.Q;
                                lcVar3 = lcVarArr14[i4];
                                if (adVar2 == null) {
                                    adVar2 = adVar18;
                                }
                                lcVarArr3 = adVar2.Q;
                                i9 = i4 + 1;
                                lcVar4 = lcVarArr3[i9];
                                lc lcVar26 = lcVar3.f;
                                e30Var4 = lcVar26 == null ? lcVar26.i : null;
                                lc lcVar27 = lcVar4.f;
                                e30Var5 = lcVar27 == null ? lcVar27.i : null;
                                if (adVar17 != adVar2) {
                                    lc lcVar28 = adVar17.Q[i9].f;
                                    e30Var5 = lcVar28 != null ? lcVar28.i : null;
                                }
                                if (adVar18 == adVar2) {
                                    lcVar4 = lcVarArr14[i9];
                                }
                                if (e30Var4 != null && e30Var5 != null) {
                                    kqVar2.b(lcVar3.i, e30Var4, lcVar3.e(), 0.5f, e30Var5, lcVar4.i, lcVarArr3[i9].e(), 5);
                                }
                            }
                        }
                    }
                } else {
                    lc lcVar29 = lcVarArr[i4];
                    int i45 = i4 + 1;
                    lc lcVar30 = adVar17.Q[i45];
                    lc lcVar31 = lcVar29.f;
                    e30 e30Var20 = lcVar31 != null ? lcVar31.i : null;
                    lc lcVar32 = lcVar30.f;
                    e30 e30Var21 = lcVar32 != null ? lcVar32.i : null;
                    lc lcVar33 = adVar18.Q[i4];
                    if (adVar19 != null) {
                        lcVar30 = adVar19.Q[i45];
                    }
                    if (e30Var20 == null || e30Var21 == null) {
                        adVar2 = adVar19;
                    } else {
                        float f13 = i2 == 0 ? adVar20.d0 : adVar20.e0;
                        int e8 = lcVar33.e();
                        int e9 = lcVar30.e();
                        e30 e30Var22 = lcVar33.i;
                        e30 e30Var23 = lcVar30.i;
                        e30 e30Var24 = e30Var20;
                        adVar2 = adVar19;
                        kqVar3.b(e30Var22, e30Var24, e8, f13, e30Var21, e30Var23, e9, 7);
                    }
                }
                kqVar2 = kqVar;
                if (!z2) {
                }
                lc[] lcVarArr142 = adVar18.Q;
                lcVar3 = lcVarArr142[i4];
                if (adVar2 == null) {
                }
                lcVarArr3 = adVar2.Q;
                i9 = i4 + 1;
                lcVar4 = lcVarArr3[i9];
                lc lcVar262 = lcVar3.f;
                if (lcVar262 == null) {
                }
                lc lcVar272 = lcVar4.f;
                if (lcVar272 == null) {
                }
                if (adVar17 != adVar2) {
                }
                if (adVar18 == adVar2) {
                }
                if (e30Var4 != null) {
                    kqVar2.b(lcVar3.i, e30Var4, lcVar3.e(), 0.5f, e30Var5, lcVar4.i, lcVarArr3[i9].e(), 5);
                }
            } else {
                i6 = i16;
            }
            i17 = i5 + 1;
            bdVar2 = bdVar;
            kqVar3 = kqVar;
            arrayList3 = arrayList;
            i16 = i6;
        }
    }

    public static ActionMode.Callback f0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof p50) || callback == null) ? callback : new p50(callback, textView);
    }

    public static void g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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
    public static void g0(Context context, Executor executor, ix ixVar, boolean z) {
        boolean z2;
        ?? r7;
        mf[] mfVarArr;
        mf[] mfVarArr2;
        mf[] mfVarArr3;
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
        lf lfVar;
        String str;
        String str2;
        FileInputStream a;
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
                                ixVar.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        kx.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = e70.f;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            lf lfVar2 = new lf(assets, executor, ixVar, name, file2);
            byte[] bArr3 = lfVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        lfVar2.b(4, null);
                    }
                    lfVar2.f = true;
                    try {
                        try {
                            r7 = lfVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            ixVar.c(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            mfVarArr2 = lfVar2.g;
                            if (mfVarArr2 != null) {
                            }
                            ix ixVar2 = lfVar2.b;
                            mfVarArr3 = lfVar2.g;
                            byte[] bArr4 = lfVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (mfVarArr3 != null) {
                            }
                            bArr = lfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            kx.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            ixVar.c(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            mfVarArr2 = lfVar2.g;
                            if (mfVarArr2 != null) {
                            }
                            ix ixVar22 = lfVar2.b;
                            mfVarArr3 = lfVar2.g;
                            byte[] bArr42 = lfVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (mfVarArr3 != null) {
                            }
                            bArr = lfVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            kx.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e3) {
                                    ixVar.c(8, e3);
                                    try {
                                        r7.close();
                                    } catch (IOException e4) {
                                        ixVar.c(7, e4);
                                    }
                                    mfVarArr = null;
                                    lfVar2.g = mfVarArr;
                                    mfVarArr2 = lfVar2.g;
                                    if (mfVarArr2 != null) {
                                    }
                                    ix ixVar222 = lfVar2.b;
                                    mfVarArr3 = lfVar2.g;
                                    byte[] bArr422 = lfVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (mfVarArr3 != null) {
                                    }
                                    bArr = lfVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    kx.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e5) {
                                ixVar.c(7, e5);
                                r7.close();
                                mfVarArr = null;
                                lfVar2.g = mfVarArr;
                                mfVarArr2 = lfVar2.g;
                                if (mfVarArr2 != null) {
                                }
                                ix ixVar2222 = lfVar2.b;
                                mfVarArr3 = lfVar2.g;
                                byte[] bArr4222 = lfVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (mfVarArr3 != null) {
                                }
                                bArr = lfVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                kx.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, o8.e0(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            mfVarArr = e70.M(r7, o8.e0(r7, 4), lfVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                ixVar.c(7, e6);
                            }
                            lfVar2.g = mfVarArr;
                        }
                        mfVarArr2 = lfVar2.g;
                        if (mfVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a = lfVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                ixVar.c(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                ixVar.c(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                lfVar2.g = null;
                                ixVar.c(8, e9);
                                str = r7;
                            }
                            if (a == null) {
                                try {
                                    if (!Arrays.equals(e70.g, o8.e0(a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] e0 = o8.e0(a, 4);
                                    lfVar2.g = e70.J(a, e0, bArr3, mfVarArr2);
                                    a.close();
                                    lfVar = lfVar2;
                                    r7 = e0;
                                    if (lfVar != null) {
                                        lfVar2 = lfVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a != null) {
                                    a.close();
                                    str = str2;
                                }
                                lfVar = null;
                                r7 = str;
                                if (lfVar != null) {
                                }
                            }
                        }
                        ix ixVar22222 = lfVar2.b;
                        mfVarArr3 = lfVar2.g;
                        byte[] bArr42222 = lfVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (mfVarArr3 != null && bArr42222 != null) {
                            z7 = lfVar2.f;
                            if (z7) {
                                t8.t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                ixVar22222.c(7, e10);
                                z8 = z7;
                            } catch (IllegalStateException e11) {
                                ixVar22222.c(8, e11);
                                z8 = z7;
                            }
                            if (e70.T(byteArrayOutputStream, bArr42222, mfVarArr3)) {
                                lfVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                lfVar2.g = null;
                                z112222 = z8;
                            } else {
                                ixVar22222.c(5, null);
                                lfVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = lfVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!lfVar2.f) {
                                    t8.t("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(lfVar2.d);
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
                                                                                lfVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                lfVar2.h = null;
                                                                                lfVar2.g = null;
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
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        z112222 = true;
                                        lfVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        kx.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z112222 = true;
                                        lfVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        kx.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    lfVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    kx.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    lfVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    kx.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                lfVar2.h = null;
                                lfVar2.g = null;
                            }
                        }
                        if (z4) {
                            J(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            lfVar2.b(4, null);
                        }
                        lfVar2.f = true;
                        r7 = lfVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        mfVarArr2 = lfVar2.g;
                        if (mfVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a = lfVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a == null) {
                            }
                        }
                        ix ixVar222222 = lfVar2.b;
                        mfVarArr3 = lfVar2.g;
                        byte[] bArr422222 = lfVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (mfVarArr3 != null) {
                            z7 = lfVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = lfVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        lfVar2.b(4, null);
                    }
                }
                kx.c(context, (z6 || !z) ? false : z9);
            }
            lfVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            kx.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            ixVar.c(7, e16);
            kx.c(context, false);
        }
    }

    public static final void h(f90 f90Var, final i3 i3Var, final a aVar) {
        Object obj;
        i3Var.getClass();
        aVar.getClass();
        HashMap hashMap = f90Var.a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = f90Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.a) {
            return;
        }
        i3Var.getClass();
        aVar.getClass();
        if (savedStateHandleController.a) {
            t8.t("Already attached to lifecycleOwner");
        } else {
            savedStateHandleController.a = true;
            aVar.a(savedStateHandleController);
            i3Var.e(null, null);
        }
        vp vpVar = aVar.c;
        if (vpVar == vp.g || vpVar.compareTo(vp.i) >= 0) {
            i3Var.f();
        } else {
            aVar.a(new yp() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // defpackage.yp
                public final void b(aq aqVar, up upVar) {
                    if (upVar == up.ON_START) {
                        a.this.f(this);
                        i3Var.f();
                    }
                }
            });
        }
    }

    public static final int i(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int j(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void k(long j2, u8 u8Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            t8.k("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((y8) arrayList4.get(i9)).a() < i8) {
                t8.k("Failed requirement.");
                return;
            }
        }
        y8 y8Var = (y8) arrayList.get(i3);
        y8 y8Var2 = (y8) arrayList4.get(i4 - 1);
        if (i8 == y8Var.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            y8 y8Var3 = (y8) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            y8Var = y8Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (y8Var.d(i8) == y8Var2.d(i8)) {
            int min = Math.min(y8Var.a(), y8Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && y8Var.d(i12) == y8Var2.d(i12); i12++) {
                i11++;
            }
            long j4 = (u8Var.g / 4) + j2 + 2 + i11 + 1;
            u8Var.y(-i11);
            u8Var.y(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                u8Var.y(y8Var.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((y8) arrayList4.get(i5)).a()) {
                    u8Var.y(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    t8.t("Check failed.");
                    return;
                }
            }
            u8 u8Var2 = new u8();
            u8Var.y(((int) ((u8Var2.g / 4) + j4)) * (-1));
            k(j4, u8Var2, i13, arrayList4, i5, i4, arrayList5);
            u8Var.v(u8Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((y8) arrayList4.get(i15 - 1)).d(i8) != ((y8) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j5 = (u8Var.g / 4) + j2 + 2 + (i14 * 2);
        u8Var.y(i14);
        u8Var.y(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d = ((y8) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d != ((y8) arrayList4.get(i16 - 1)).d(i8)) {
                u8Var.y(d & 255);
            }
        }
        u8 u8Var3 = new u8();
        int i17 = i5;
        while (i17 < i4) {
            byte d2 = ((y8) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d2 != ((y8) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((y8) arrayList4.get(i17)).a()) {
                u8Var.y(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                u8Var.y(((int) ((u8Var3.g / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                k(j3, u8Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        u8Var.v(u8Var3);
    }

    public static ImageView.ScaleType p(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void q(g10 g10Var) {
        e10 e10Var;
        vp vpVar = g10Var.e().c;
        if (vpVar != vp.g && vpVar != vp.h) {
            t8.k("Failed requirement.");
            return;
        }
        Iterator it = ((z00) g10Var.a().f).iterator();
        while (true) {
            v00 v00Var = (v00) it;
            if (!v00Var.hasNext()) {
                e10Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) v00Var.next();
            entry.getClass();
            String str = (String) entry.getKey();
            e10Var = (e10) entry.getValue();
            if (zo.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (e10Var == null) {
            b10 b10Var = new b10(g10Var.a(), (j90) g10Var);
            g10Var.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", b10Var);
            g10Var.e().a(new SavedStateHandleAttacher(b10Var));
        }
    }

    public static View r(View view, int i2) {
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

    public static ht s(String str) {
        str.getClass();
        Matcher matcher = ht.c.matcher(str);
        if (!matcher.lookingAt()) {
            t8.j(str, "No subtype found for: \"");
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
        Matcher matcher2 = ht.d.matcher(str);
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
                } else if (k40.m0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new ht(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static Integer t(Context context, int i2) {
        TypedValue I = zo.I(context.getTheme(), i2);
        if (I != null) {
            return Integer.valueOf(X(context, I));
        }
        return null;
    }

    public static float v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ug.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Set w() {
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

    public static m4 x(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        m4 m4Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new m4((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                m4Var = m4.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                m4Var = null;
            }
            if (m4Var != null) {
                return m4Var;
            }
        }
        return new m4((Shader) null, (ColorStateList) null, 0);
    }

    public static final int y(int i2, int i3, int i4) {
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
                t8.k("Step is zero.");
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

    public static final c10 z(j90 j90Var) {
        ArrayList arrayList = new ArrayList();
        rz.a.getClass();
        arrayList.add(new g90());
        g90[] g90VarArr = (g90[]) arrayList.toArray(new g90[0]);
        return (c10) new a6(j90Var.d(), new k0(26, (g90[]) Arrays.copyOf(g90VarArr, g90VarArr.length)), j90Var instanceof tm ? ((tm) j90Var).c() : ud.b).g("androidx.lifecycle.internal.SavedStateHandlesVM", c10.class);
    }

    public abstract int A(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float C(o20 o20Var);

    public abstract int D();

    public abstract ViewPropertyAnimator E(View view, int i2);

    public abstract View L(int i2);

    public abstract void M(int i2);

    public abstract void N(Typeface typeface);

    public abstract boolean O();

    public abstract Object R(Intent intent, int i2);

    public abstract void T(s sVar, s sVar2);

    public abstract void U(s sVar, Thread thread);

    public abstract void d0(o20 o20Var, float f2);

    public void l(int i2) {
        new Handler(Looper.getMainLooper()).post(new zr(i2, 1, this));
    }

    public abstract boolean m(t tVar, p pVar);

    public abstract boolean n(t tVar, Object obj, Object obj2);

    public abstract boolean o(t tVar, s sVar, s sVar2);

    public abstract void u(n20 n20Var, float f2, float f3);
}
