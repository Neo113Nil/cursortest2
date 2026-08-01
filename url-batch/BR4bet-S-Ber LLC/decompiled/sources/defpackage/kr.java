package defpackage;

import android.animation.TimeInterpolator;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.moontiko.really.admiralcasino.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class kr {
    public static final xj c;
    public static final xj d;
    public static final xj e;
    public static final xj f;
    public static final xj g;
    public static final Object a = new Object();
    public static final cb b = new cb(2);
    public static final ek h = new ek(false);
    public static final ek i = new ek(true);
    public static final boolean[] j = new boolean[3];
    public static final ky k = new ky(10);
    public static final ky l = new ky(11);
    public static final ky m = new ky(9);
    public static final ky n = new ky(15);

    static {
        int i2 = 1;
        c = new xj("COMPLETING_ALREADY", i2);
        d = new xj("COMPLETING_WAITING_CHILDREN", i2);
        e = new xj("COMPLETING_RETRY", i2);
        f = new xj("TOO_LATE_TO_CANCEL", i2);
        g = new xj("SEALED", i2);
    }

    public static rc0 A(Application application) {
        if (rc0.h == null) {
            rc0.h = new rc0(0, application);
        }
        rc0 rc0Var = rc0.h;
        rc0Var.getClass();
        return rc0Var;
    }

    public static float B(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final j40 C(uc0 uc0Var) {
        h40 h40Var = new h40();
        tc0 d2 = uc0Var.d();
        nf c2 = uc0Var instanceof fp ? ((fp) uc0Var).c() : mf.b;
        d2.getClass();
        c2.getClass();
        return (j40) new k6(d2, h40Var, c2).v(u20.a(j40.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static File D(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final tb E(ry ryVar) {
        tb tbVar;
        ye yeVar;
        AutoCloseable autoCloseable;
        synchronized (n) {
            tbVar = (tb) ryVar.b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (tbVar == null) {
                try {
                    og ogVar = zh.a;
                    yeVar = ou.a.j;
                } catch (IllegalStateException unused) {
                    yeVar = gk.f;
                }
                tb tbVar2 = new tb(yeVar.g(new r70()));
                qc0 qc0Var = ryVar.a;
                if (qc0Var != null) {
                    if (qc0Var.d) {
                        qc0.a(tbVar2);
                    } else {
                        synchronized (qc0Var.a) {
                            autoCloseable = (AutoCloseable) qc0Var.b.put("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", tbVar2);
                        }
                        qc0.a(autoCloseable);
                    }
                }
                tbVar = tbVar2;
            }
        }
        return tbVar;
    }

    public static final void F(ye yeVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = cf.a.iterator();
        while (it.hasNext()) {
            try {
                ((r2) it.next()).q(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    la0.f(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            la0.f(th, new kh(yeVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static int G(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        g9.i(f60.e("type needs to be >= FIRST and <= LAST, type=", i2));
        return 0;
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static List J(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
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

    public static kp L(String... strArr) {
        if (strArr.length % 2 != 0) {
            g9.i("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                g9.i("Headers cannot be null");
                return null;
            }
            strArr2[i3] = f70.g0(str).toString();
        }
        int t = xf.t(0, strArr2.length - 1, 2);
        if (t >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                h(str2);
                j(str3, str2);
                if (i2 == t) {
                    break;
                }
                i2 += 2;
            }
        }
        return new kp(strArr2);
    }

    public static void M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float N(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return vi.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static dm O(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
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
            d0(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), v00.b);
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
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), v00.c);
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
                            d0(xmlResourceParser);
                        }
                        arrayList.add(new fm(string7, i7, z, string6, i9, resourceId2));
                    } else {
                        d0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new em((fm[]) arrayList.toArray(new fm[0]));
        }
        List T = T(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), v00.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            d0(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                wl wlVar = new wl(string, string2, string8, T, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(wlVar);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                d0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new gm(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            g9.i("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new wl(string, string2, string3, T, null, null));
        if (string4 != null) {
            arrayList2.add(new wl(string, string2, string4, T, null, null));
        }
        return new gm(arrayList2, i11, integer2, string5);
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
    public static void P(Context context, String str) {
        synchronized (a) {
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
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static String Q(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        l9 l9Var = l9.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        b9.g(encoded.length, 0L, length);
        b9.k(length, encoded.length);
        int i2 = 0;
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        copyOfRange.getClass();
        l9 l9Var2 = new l9(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, l9Var2.a());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        new l9(digest);
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
        sb.append(new String(bArr2, la.a));
        return sb.toString();
    }

    public static List T(Resources resources, int i2) {
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
    public static String U(Context context) {
        String str;
        synchronized (a) {
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

    public static void V(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static int W(Context context, int i2, int i3) {
        TypedValue K = b9.K(context.getTheme(), i2);
        return (K == null || K.type != 16) ? i3 : K.data;
    }

    public static TimeInterpolator X(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            g9.i("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!I(valueOf, "cubic-bezier") && !I(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (I(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(B(split, 0), B(split, 1), B(split, 2), B(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!I(valueOf, "path")) {
            g9.i("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            vz.b(mz.k(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static o60 Y(Context context) {
        TypedValue K = b9.K(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = y00.B;
        TypedArray obtainStyledAttributes = K == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(K.resourceId, iArr);
        o60 o60Var = new o60();
        try {
            float f2 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            o60Var.a = Math.sqrt(f2);
            o60Var.c = false;
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            o60Var.b = f3;
            o60Var.c = false;
            obtainStyledAttributes.recycle();
            return o60Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void Z(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(long j2, h9 h9Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            g9.i("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((l9) arrayList4.get(i9)).a() < i8) {
                g9.i("Failed requirement.");
                return;
            }
        }
        l9 l9Var = (l9) arrayList.get(i3);
        l9 l9Var2 = (l9) arrayList4.get(i4 - 1);
        if (i8 == l9Var.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            l9 l9Var3 = (l9) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            l9Var = l9Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (l9Var.d(i8) == l9Var2.d(i8)) {
            int min = Math.min(l9Var.a(), l9Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && l9Var.d(i12) == l9Var2.d(i12); i12++) {
                i11++;
            }
            long j4 = (h9Var.g / 4) + j2 + 2 + i11 + 1;
            h9Var.y(-i11);
            h9Var.y(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                h9Var.y(l9Var.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((l9) arrayList4.get(i5)).a()) {
                    h9Var.y(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    g9.s("Check failed.");
                    return;
                }
            }
            h9 h9Var2 = new h9();
            h9Var.y(((int) ((h9Var2.g / 4) + j4)) * (-1));
            c(j4, h9Var2, i13, arrayList4, i5, i4, arrayList5);
            h9Var.v(h9Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((l9) arrayList4.get(i15 - 1)).d(i8) != ((l9) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j5 = (h9Var.g / 4) + j2 + 2 + (i14 * 2);
        h9Var.y(i14);
        h9Var.y(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d2 = ((l9) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d2 != ((l9) arrayList4.get(i16 - 1)).d(i8)) {
                h9Var.y(d2 & 255);
            }
        }
        h9 h9Var3 = new h9();
        int i17 = i5;
        while (i17 < i4) {
            byte d3 = ((l9) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d3 != ((l9) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((l9) arrayList4.get(i17)).a()) {
                h9Var.y(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                h9Var.y(((int) ((h9Var3.g / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                c(j3, h9Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        h9Var.v(h9Var3);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void d0(XmlPullParser xmlPullParser) {
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

    public static final long e0(String str, long j2, long j3, long j4) {
        String str2;
        boolean z;
        int i2 = f80.a;
        Long l2 = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int i3 = 10;
        la0.k(10);
        int length = str2.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (k(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i4 = 1;
                    } else if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (true) {
                if (i4 < length) {
                    int digit = Character.digit((int) str2.charAt(i4), i3);
                    if (digit < 0) {
                        break;
                    }
                    if (j6 < j7) {
                        if (j7 != -256204778801521550L) {
                            break;
                        }
                        j7 = j5 / 10;
                        if (j6 < j7) {
                            break;
                        }
                    }
                    long j8 = j6 * 10;
                    int i5 = length;
                    long j9 = digit;
                    if (j8 < j5 + j9) {
                        break;
                    }
                    j6 = j8 - j9;
                    i4++;
                    length = i5;
                    i3 = 10;
                } else {
                    l2 = z ? Long.valueOf(j6) : Long.valueOf(-j6);
                }
            }
        }
        if (l2 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l2.longValue();
        if (j3 <= longValue && longValue <= j4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
    }

    public static int f0(String str, int i2, int i3) {
        return (int) e0(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static void g(be beVar, ys ysVar, ae aeVar) {
        aeVar.o = -1;
        ld ldVar = aeVar.M;
        int[] iArr = aeVar.p0;
        ld ldVar2 = aeVar.L;
        ld ldVar3 = aeVar.J;
        ld ldVar4 = aeVar.K;
        ld ldVar5 = aeVar.I;
        aeVar.p = -1;
        int[] iArr2 = beVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = ldVar5.g;
            int q = beVar.q() - ldVar4.g;
            ldVar5.i = ysVar.k(ldVar5);
            ldVar4.i = ysVar.k(ldVar4);
            ysVar.d(ldVar5.i, i2);
            ysVar.d(ldVar4.i, q);
            aeVar.o = 2;
            aeVar.Y = i2;
            int i3 = q - i2;
            aeVar.U = i3;
            int i4 = aeVar.b0;
            if (i3 < i4) {
                aeVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = ldVar3.g;
        int k2 = beVar.k() - ldVar2.g;
        ldVar3.i = ysVar.k(ldVar3);
        ldVar2.i = ysVar.k(ldVar2);
        ysVar.d(ldVar3.i, i5);
        ysVar.d(ldVar2.i, k2);
        if (aeVar.a0 > 0 || aeVar.g0 == 8) {
            g60 k3 = ysVar.k(ldVar);
            ldVar.i = k3;
            ysVar.d(k3, aeVar.a0 + i5);
        }
        aeVar.p = 2;
        aeVar.Z = i5;
        int i6 = k2 - i5;
        aeVar.V = i6;
        int i7 = aeVar.c0;
        if (i6 < i7) {
            aeVar.V = i7;
        }
    }

    public static void g0(String str) {
        lc lcVar = new lc(f60.f("lateinit property ", str, " has not been initialized"));
        Z(lcVar, kr.class.getName());
        throw lcVar;
    }

    public static void h(String str) {
        if (str.length() <= 0) {
            g9.i("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                g9.d(cb0.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void h0(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static final void i(int i2) {
        if (i2 >= 1) {
            return;
        }
        g9.d(f60.e("Expected positive parallelism level, but got ", i2));
    }

    public static void j(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                g9.d(cb0.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2).concat(cb0.n(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int l(n20 n20Var, ij ijVar, View view, View view2, b20 b20Var, boolean z) {
        if (b20Var.v() == 0 || n20Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(b20.H(view) - b20.H(view2)) + 1;
        }
        return Math.min(ijVar.l(), ijVar.b(view2) - ijVar.e(view));
    }

    public static int m(n20 n20Var, ij ijVar, View view, View view2, b20 b20Var, boolean z, boolean z2) {
        if (b20Var.v() == 0 || n20Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (n20Var.b() - Math.max(b20.H(view), b20.H(view2))) - 1) : Math.max(0, Math.min(b20.H(view), b20.H(view2)));
        if (z) {
            return Math.round((max * (Math.abs(ijVar.b(view2) - ijVar.e(view)) / (Math.abs(b20.H(view) - b20.H(view2)) + 1))) + (ijVar.k() - ijVar.e(view)));
        }
        return max;
    }

    public static int n(n20 n20Var, ij ijVar, View view, View view2, b20 b20Var, boolean z) {
        if (b20Var.v() == 0 || n20Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return n20Var.b();
        }
        return (int) (((ijVar.b(view2) - ijVar.e(view)) / (Math.abs(b20.H(view) - b20.H(view2)) + 1)) * n20Var.b());
    }

    public static ImageView.ScaleType o(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean p(File file, InputStream inputStream) {
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
        } catch (IOException e3) {
            e = e3;
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

    public static boolean q(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = q(file2) && z;
        }
        return z;
    }

    public static final void r(n40 n40Var) {
        l40 l40Var;
        hs hsVar = n40Var.e().c;
        if (hsVar != hs.g && hsVar != hs.h) {
            g9.i("Failed requirement.");
            return;
        }
        Iterator it = ((e40) n40Var.a().f).iterator();
        while (true) {
            a40 a40Var = (a40) it;
            if (!a40Var.hasNext()) {
                l40Var = null;
                break;
            }
            Map.Entry entry = (Map.Entry) a40Var.next();
            entry.getClass();
            String str = (String) entry.getKey();
            l40Var = (l40) entry.getValue();
            if (b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (l40Var == null) {
            i40 i40Var = new i40(n40Var.a(), (uc0) n40Var);
            n40Var.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", i40Var);
            n40Var.e().a(new p10(4, i40Var));
        }
    }

    public static final boolean s(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static j90 t(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return j90.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return j90.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return j90.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return j90.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return j90.SSL_3_0;
        }
        g9.i("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static q00 u(String str) {
        if (str.equals("http/1.0")) {
            return q00.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return q00.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return q00.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return q00.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return q00.SPDY_3;
        }
        if (str.equals("quic")) {
            return q00.QUIC;
        }
        g9.w("Unexpected protocol: ".concat(str));
        return null;
    }

    public static ColorStateList v(Context context, k6 k6Var, int i2) {
        int resourceId;
        ColorStateList w;
        TypedArray typedArray = (TypedArray) k6Var.g;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (w = la0.w(context, resourceId)) == null) ? k6Var.n(i2) : w;
    }

    public static ColorStateList w(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList w;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (w = la0.w(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : w;
    }

    public static float x(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return vi.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable y(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable m2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m2 = mz.m(context, resourceId)) == null) ? typedArray.getDrawable(i2) : m2;
    }

    public abstract void R(u uVar, u uVar2);

    public abstract void S(u uVar, Thread thread);

    public abstract void a0(boolean z);

    public abstract void b0(boolean z);

    public abstract boolean d(v vVar, r rVar);

    public abstract boolean e(v vVar, Object obj, Object obj2);

    public abstract boolean f(v vVar, u uVar, u uVar2);

    public abstract InputFilter[] z(InputFilter[] inputFilterArr);
}
