package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.fragment.app.b;
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
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class mv {
    public static final lm h;
    public static final lm i;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final Object[] g = new Object[0];
    public static final int[] j = {R.attr.theme, com.trembin.nirefon.betfury.R.attr.theme};
    public static final int[] k = {com.trembin.nirefon.betfury.R.attr.materialThemeOverlay};
    public static final xy l = new xy(7);
    public static final Object m = new Object();
    public static final xy n = new xy(27);

    static {
        int i2 = 1;
        h = new lm("UNDEFINED", i2);
        i = new lm("REUSABLE_CLAIMED", i2);
    }

    public static boolean A(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean B(vh vhVar, int i2, int i3) {
        vhVar.getClass();
        if (i2 > i3 && vhVar.l) {
            return false;
        }
        Set set = vhVar.m;
        return vhVar.k && (set == null || !set.contains(Integer.valueOf(i2)));
    }

    public static int C(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        s9.w(r7.a(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static qg D(og ogVar, pg pgVar) {
        pgVar.getClass();
        return c(ogVar.getKey(), pgVar) ? um.f : ogVar;
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

    public static void F(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z9 G(bt btVar) {
        int i2;
        int i3;
        int i4;
        String str;
        bt btVar2 = btVar;
        int size = btVar2.size();
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
            String b2 = btVar2.b(i5);
            String d2 = btVar2.d(i5);
            if (uf0.o(b2, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d2;
                    i2 = 0;
                    while (i2 < d2.length()) {
                        int length = d2.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d2.length();
                                break;
                            }
                            i3 = size;
                            if (mf0.s("=,;", d2.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = mf0.E(d2.substring(i2, i10)).toString();
                        if (i10 == d2.length() || d2.charAt(i10) == ',' || d2.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = zk0.a;
                            int length2 = d2.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d2.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d2.length();
                                    break;
                                }
                            }
                            if (i11 >= d2.length() || d2.charAt(i11) != '\"') {
                                int length3 = d2.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d2.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (mf0.s(",;", d2.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = mf0.E(d2.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int w = mf0.w(d2, '\"', i15, 4);
                                str = d2.substring(i15, w);
                                i4 = w + 1;
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
                                i6 = zk0.v(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = zk0.v(str, -1);
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
                                i8 = zk0.v(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = zk0.v(str, -1);
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
                    btVar2 = btVar;
                    size = size;
                }
            } else if (!uf0.o(b2, "Pragma")) {
                i5++;
                btVar2 = btVar;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d2.length()) {
            }
            i5++;
            btVar2 = btVar;
            size = size;
        }
        return new z9(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, !z ? null : str2);
    }

    public static qg I(og ogVar, qg qgVar) {
        qgVar.getClass();
        return bi.U(ogVar, qgVar);
    }

    public static final void L(dg dgVar, Object obj) {
        if (!(dgVar instanceof ek)) {
            dgVar.e(obj);
            return;
        }
        ek ekVar = (ek) dgVar;
        tg tgVar = ekVar.i;
        eg egVar = ekVar.j;
        qg qgVar = egVar.g;
        Throwable a2 = aa0.a(obj);
        Object ldVar = a2 == null ? obj : new ld(a2, false);
        qgVar.getClass();
        if (tgVar.P(qgVar)) {
            ekVar.k = ldVar;
            ekVar.h = 1;
            qgVar.getClass();
            tgVar.O(qgVar, ekVar);
            return;
        }
        ln a3 = ai0.a();
        if (a3.h >= 4294967296L) {
            ekVar.k = ldVar;
            ekVar.h = 1;
            z6 z6Var = a3.j;
            if (z6Var == null) {
                z6Var = new z6();
                a3.j = z6Var;
            }
            z6Var.addLast(ekVar);
            return;
        }
        a3.S(true);
        try {
            qgVar.getClass();
            mw mwVar = (mw) qgVar.w(sl.k);
            if (mwVar == null || mwVar.C()) {
                Object obj2 = ekVar.l;
                qgVar.getClass();
                Object U = gk0.U(qgVar, obj2);
                qk0 c0 = U != gk0.o ? d50.c0(egVar, qgVar, U) : null;
                try {
                    egVar.e(obj);
                } finally {
                    if (c0 == null || c0.S()) {
                        gk0.J(qgVar, U);
                    }
                }
            } else {
                ekVar.e(new z90(mwVar.s()));
            }
            while (a3.U()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void M(RuntimeException runtimeException, String str) {
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

    public static final void O(Object obj) {
        if (obj instanceof z90) {
            throw ((z90) obj).f;
        }
    }

    public static void P(String str) {
        md mdVar = new md(r7.c("lateinit property ", str, " has not been initialized"));
        M(mdVar, mv.class.getName());
        throw mdVar;
    }

    public static final Object[] Q(Collection collection) {
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
        return g;
    }

    public static final Object[] R(Collection collection, Object[] objArr) {
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

    public static final long S(long j2, gl glVar) {
        glVar.getClass();
        gl glVar2 = gl.NANOSECONDS;
        glVar2.getClass();
        long convert = glVar.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, glVar2.getTimeUnit$kotlin_stdlib());
        if ((-convert) > j2 || j2 > convert) {
            gl glVar3 = gl.MILLISECONDS;
            glVar3.getClass();
            return n(d50.i(glVar3.getTimeUnit$kotlin_stdlib().convert(j2, glVar.getTimeUnit$kotlin_stdlib())));
        }
        long convert2 = glVar2.getTimeUnit$kotlin_stdlib().convert(j2, glVar.getTimeUnit$kotlin_stdlib()) << 1;
        int i2 = el.h;
        int i3 = fl.a;
        return convert2;
    }

    public static boolean T(qf qfVar, qf qfVar2, qf qfVar3, qf qfVar4) {
        qf qfVar5;
        qf qfVar6;
        qf qfVar7 = qf.FIXED;
        return (qfVar3 == qfVar7 || qfVar3 == (qfVar6 = qf.WRAP_CONTENT) || (qfVar3 == qf.MATCH_PARENT && qfVar != qfVar6)) || (qfVar4 == qfVar7 || qfVar4 == (qfVar5 = qf.WRAP_CONTENT) || (qfVar4 == qf.MATCH_PARENT && qfVar2 != qfVar5));
    }

    public static Context U(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof cg) && ((cg) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        cg cgVar = new cg(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                cgVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, j);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cgVar.getTheme().applyStyle(resourceId, true);
        }
        return cgVar;
    }

    public static Context V(Context context, AttributeSet attributeSet, int i2, int i3) {
        return U(i2, i3, context, attributeSet, new int[0]);
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
    public static void W(Context context, Executor executor, o60 o60Var, boolean z) {
        boolean z2;
        ?? r7;
        pj[] pjVarArr;
        pj[] pjVarArr2;
        pj[] pjVarArr3;
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
        oj ojVar;
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
                                o60Var.h(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        q60.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = d50.f;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            oj ojVar2 = new oj(assets, executor, o60Var, name, file2);
            byte[] bArr3 = ojVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        ojVar2.b(4, null);
                    }
                    ojVar2.f = true;
                    try {
                        try {
                            r7 = ojVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            o60Var.h(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            pjVarArr2 = ojVar2.g;
                            if (pjVarArr2 != null) {
                            }
                            o60 o60Var2 = ojVar2.b;
                            pjVarArr3 = ojVar2.g;
                            byte[] bArr4 = ojVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (pjVarArr3 != null) {
                            }
                            bArr = ojVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            q60.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            o60Var.h(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            pjVarArr2 = ojVar2.g;
                            if (pjVarArr2 != null) {
                            }
                            o60 o60Var22 = ojVar2.b;
                            pjVarArr3 = ojVar2.g;
                            byte[] bArr42 = ojVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (pjVarArr3 != null) {
                            }
                            bArr = ojVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            q60.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    o60Var.h(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        o60Var.h(7, e5);
                                    }
                                    pjVarArr = null;
                                    ojVar2.g = pjVarArr;
                                    pjVarArr2 = ojVar2.g;
                                    if (pjVarArr2 != null) {
                                    }
                                    o60 o60Var222 = ojVar2.b;
                                    pjVarArr3 = ojVar2.g;
                                    byte[] bArr422 = ojVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (pjVarArr3 != null) {
                                    }
                                    bArr = ojVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    q60.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                o60Var.h(7, e6);
                                r7.close();
                                pjVarArr = null;
                                ojVar2.g = pjVarArr;
                                pjVarArr2 = ojVar2.g;
                                if (pjVarArr2 != null) {
                                }
                                o60 o60Var2222 = ojVar2.b;
                                pjVarArr3 = ojVar2.g;
                                byte[] bArr4222 = ojVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (pjVarArr3 != null) {
                                }
                                bArr = ojVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                q60.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, gk0.C(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            pjVarArr = d50.N(r7, gk0.C(r7, 4), ojVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                o60Var.h(7, e7);
                            }
                            ojVar2.g = pjVarArr;
                        }
                        pjVarArr2 = ojVar2.g;
                        if (pjVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = ojVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                o60Var.h(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                o60Var.h(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                ojVar2.g = null;
                                o60Var.h(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(d50.g, gk0.C(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] C = gk0.C(a2, 4);
                                    ojVar2.g = d50.K(a2, C, bArr3, pjVarArr2);
                                    a2.close();
                                    ojVar = ojVar2;
                                    r7 = C;
                                    if (ojVar != null) {
                                        ojVar2 = ojVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                ojVar = null;
                                r7 = str;
                                if (ojVar != null) {
                                }
                            }
                        }
                        o60 o60Var22222 = ojVar2.b;
                        pjVarArr3 = ojVar2.g;
                        byte[] bArr42222 = ojVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (pjVarArr3 != null && bArr42222 != null) {
                            z7 = ojVar2.f;
                            if (z7) {
                                s9.u("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
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
                                o60Var22222.h(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                o60Var22222.h(8, e12);
                                z8 = z7;
                            }
                            if (d50.a0(byteArrayOutputStream, bArr42222, pjVarArr3)) {
                                ojVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                ojVar2.g = null;
                                z112222 = z8;
                            } else {
                                o60Var22222.h(5, null);
                                ojVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = ojVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!ojVar2.f) {
                                    s9.u("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(ojVar2.d);
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
                                                                                ojVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                ojVar2.h = null;
                                                                                ojVar2.g = null;
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
                                        ojVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        q60.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        ojVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        q60.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    ojVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    q60.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    ojVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    q60.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                ojVar2.h = null;
                                ojVar2.g = null;
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
                            ojVar2.b(4, null);
                        }
                        ojVar2.f = true;
                        r7 = ojVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        pjVarArr2 = ojVar2.g;
                        if (pjVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = ojVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        o60 o60Var222222 = ojVar2.b;
                        pjVarArr3 = ojVar2.g;
                        byte[] bArr422222 = ojVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (pjVarArr3 != null) {
                            z7 = ojVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = ojVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        ojVar2.b(4, null);
                    }
                }
                q60.c(context, (z6 || !z) ? false : z9);
            }
            ojVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            q60.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            o60Var.h(7, e17);
            q60.c(context, false);
        }
    }

    public static final void a(ne0 ne0Var) {
        int i2 = ne0Var.i;
        int[] iArr = ne0Var.g;
        Object[] objArr = ne0Var.h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != m) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        ne0Var.f = false;
        ne0Var.i = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0295, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (r4.d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06f1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0649 A[EDGE_INSN: B:410:0x0649->B:411:0x0649 BREAK  A[LOOP:6: B:365:0x05a4->B:398:0x0644], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(sf sfVar, xx xxVar, ArrayList arrayList, int i2) {
        int i3;
        ya[] yaVarArr;
        int i4;
        int i5;
        xe[] xeVarArr;
        float f2;
        float f3;
        boolean z;
        boolean z2;
        rf rfVar;
        boolean z3;
        boolean z4;
        int i6;
        ArrayList arrayList2;
        rf rfVar2;
        rf rfVar3;
        rf rfVar4;
        xx xxVar2;
        xe xeVar;
        xe xeVar2;
        xe xeVar3;
        rf rfVar5;
        je0 je0Var;
        xe xeVar4;
        je0 je0Var2;
        rf rfVar6;
        int i7;
        xe[] xeVarArr2;
        xe xeVar5;
        xe xeVar6;
        je0 je0Var3;
        je0 je0Var4;
        rf rfVar7;
        rf rfVar8;
        int i8;
        xe xeVar7;
        xe[] xeVarArr3;
        int i9;
        xe xeVar8;
        je0 je0Var5;
        je0 je0Var6;
        int size;
        int i10;
        ArrayList arrayList3;
        int i11;
        rf rfVar9;
        float f4;
        float f5;
        int i12;
        float f6;
        int i13;
        rf rfVar10;
        int i14;
        int i15;
        int i16;
        xe[] xeVarArr4;
        xe xeVar9;
        rf rfVar11;
        float f7;
        sf sfVar2 = sfVar;
        xx xxVar3 = xxVar;
        ArrayList arrayList4 = arrayList;
        if (i2 == 0) {
            i3 = sfVar2.z0;
            yaVarArr = sfVar2.C0;
            i4 = 0;
        } else {
            i3 = sfVar2.A0;
            yaVarArr = sfVar2.B0;
            i4 = 2;
        }
        int i17 = i3;
        ya[] yaVarArr2 = yaVarArr;
        int i18 = 0;
        while (i18 < i17) {
            ya yaVar = yaVarArr2[i18];
            boolean z5 = yaVar.q;
            rf rfVar12 = yaVar.a;
            xe[] xeVarArr5 = rfVar12.Q;
            int i19 = 8;
            if (z5) {
                i5 = i18;
                xeVarArr = xeVarArr5;
                f2 = 0.0f;
            } else {
                int i20 = yaVar.l;
                int i21 = i20 * 2;
                rf rfVar13 = rfVar12;
                rf rfVar14 = rfVar13;
                boolean z6 = false;
                f2 = 0.0f;
                while (!z6) {
                    yaVar.i++;
                    rf[] rfVarArr = rfVar13.n0;
                    xe[] xeVarArr6 = rfVar13.Q;
                    rfVarArr[i20] = null;
                    rfVar13.m0[i20] = null;
                    if (rfVar13.h0 != i19) {
                        rfVar13.j(i20);
                        qf qfVar = qf.MATCH_CONSTRAINT;
                        xeVarArr6[i21].e();
                        int i22 = i21 + 1;
                        xeVarArr6[i22].e();
                        xeVarArr6[i21].e();
                        xeVarArr6[i22].e();
                        if (yaVar.b == null) {
                            yaVar.b = rfVar13;
                        }
                        yaVar.d = rfVar13;
                        qf qfVar2 = rfVar13.T[i20];
                        if (qfVar2 == qfVar) {
                            i15 = i18;
                            int i23 = rfVar13.t[i20];
                            i16 = i20;
                            if (i23 == 0 || i23 == 3 || i23 == 2) {
                                yaVar.j++;
                                float f8 = rfVar13.l0[i16];
                                if (f8 > 0.0f) {
                                    f7 = f8;
                                    yaVar.k += f7;
                                } else {
                                    f7 = f8;
                                }
                                xeVarArr4 = xeVarArr5;
                                if (rfVar13.h0 != 8 && qfVar2 == qfVar && (i23 == 0 || i23 == 3)) {
                                    if (f7 < 0.0f) {
                                        yaVar.n = true;
                                    } else {
                                        yaVar.o = true;
                                    }
                                    if (yaVar.h == null) {
                                        yaVar.h = new ArrayList();
                                    }
                                    yaVar.h.add(rfVar13);
                                }
                                if (yaVar.f == null) {
                                    yaVar.f = rfVar13;
                                }
                                rf rfVar15 = yaVar.g;
                                if (rfVar15 != null) {
                                    rfVar15.m0[i16] = rfVar13;
                                }
                                yaVar.g = rfVar13;
                            } else {
                                xeVarArr4 = xeVarArr5;
                            }
                            if (i16 == 0) {
                                if (rfVar13.r == 0 && rfVar13.u == 0) {
                                    int i24 = rfVar13.v;
                                }
                            } else if (rfVar13.s == 0 && rfVar13.x == 0) {
                                int i25 = rfVar13.y;
                            }
                            if (rfVar14 != rfVar13) {
                                rfVar14.n0[i16] = rfVar13;
                            }
                            xeVar9 = xeVarArr6[i21 + 1].f;
                            if (xeVar9 != null) {
                                rfVar11 = xeVar9.d;
                                xe xeVar10 = rfVar11.Q[i21].f;
                                if (xeVar10 != null) {
                                }
                            }
                            rfVar11 = null;
                            if (rfVar11 != null) {
                                rfVar11 = rfVar13;
                                z6 = true;
                            }
                            rfVar14 = rfVar13;
                            i20 = i16;
                            xeVarArr5 = xeVarArr4;
                            i19 = 8;
                            rfVar13 = rfVar11;
                            i18 = i15;
                        }
                    }
                    i15 = i18;
                    i16 = i20;
                    xeVarArr4 = xeVarArr5;
                    if (rfVar14 != rfVar13) {
                    }
                    xeVar9 = xeVarArr6[i21 + 1].f;
                    if (xeVar9 != null) {
                    }
                    rfVar11 = null;
                    if (rfVar11 != null) {
                    }
                    rfVar14 = rfVar13;
                    i20 = i16;
                    xeVarArr5 = xeVarArr4;
                    i19 = 8;
                    rfVar13 = rfVar11;
                    i18 = i15;
                }
                i5 = i18;
                int i26 = i20;
                xeVarArr = xeVarArr5;
                rf rfVar16 = yaVar.b;
                if (rfVar16 != null) {
                    rfVar16.Q[i21].e();
                }
                rf rfVar17 = yaVar.d;
                if (rfVar17 != null) {
                    rfVar17.Q[i21 + 1].e();
                }
                yaVar.c = rfVar13;
                if (i26 == 0 && yaVar.m) {
                    yaVar.e = rfVar13;
                } else {
                    yaVar.e = rfVar12;
                }
                yaVar.p = yaVar.o && yaVar.n;
            }
            yaVar.q = true;
            if (arrayList4 == null || arrayList4.contains(rfVar12)) {
                rf rfVar18 = yaVar.c;
                rf rfVar19 = yaVar.b;
                rf rfVar20 = yaVar.d;
                rf rfVar21 = yaVar.e;
                float f9 = yaVar.k;
                qf[] qfVarArr = sfVar2.T;
                xe[] xeVarArr7 = sfVar2.Q;
                boolean z7 = qfVarArr[i2] == qf.WRAP_CONTENT;
                if (i2 == 0) {
                    int i27 = rfVar21.j0;
                    boolean z8 = i27 == 0;
                    f3 = f9;
                    z = i27 == 1;
                    z2 = i27 == 2;
                    rfVar = rfVar12;
                    z3 = z7;
                    z4 = z8;
                } else {
                    f3 = f9;
                    int i28 = rfVar21.k0;
                    boolean z9 = i28 == 0;
                    z = i28 == 1;
                    z2 = i28 == 2;
                    rfVar = rfVar12;
                    z3 = z7;
                    z4 = z9;
                }
                boolean z10 = false;
                while (!z10) {
                    xe[] xeVarArr8 = rfVar.Q;
                    qf[] qfVarArr2 = rfVar.T;
                    xe xeVar11 = xeVarArr8[i4];
                    int i29 = z2 ? 1 : 4;
                    int e2 = xeVar11.e();
                    xe[] xeVarArr9 = xeVarArr7;
                    qf qfVar3 = qfVarArr2[i2];
                    boolean z11 = z2;
                    qf qfVar4 = qf.MATCH_CONSTRAINT;
                    boolean z12 = qfVar3 == qfVar4 && rfVar.t[i2] == 0;
                    xe xeVar12 = xeVar11.f;
                    if (xeVar12 != null && rfVar != rfVar12) {
                        e2 = xeVar12.e() + e2;
                    }
                    int i30 = e2;
                    if (z11 && rfVar != rfVar12 && rfVar != rfVar19) {
                        i29 = 8;
                    }
                    rf rfVar22 = rfVar12;
                    xe xeVar13 = xeVar11.f;
                    if (xeVar13 != null) {
                        je0 je0Var7 = xeVar11.i;
                        je0 je0Var8 = xeVar13.i;
                        if (rfVar == rfVar19) {
                            i13 = i17;
                            xxVar3.f(je0Var7, je0Var8, i30, 6);
                        } else {
                            i13 = i17;
                            xxVar3.f(je0Var7, je0Var8, i30, 8);
                        }
                        if (z12 && !z11) {
                            i29 = 5;
                        }
                        xxVar3.e(xeVar11.i, xeVar11.f.i, i30, (rfVar == rfVar19 && z11 && rfVar.S[i2]) ? 5 : i29);
                    } else {
                        i13 = i17;
                    }
                    if (z3) {
                        if (rfVar.h0 == 8 || qfVarArr2[i2] != qfVar4) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            xxVar3.f(xeVarArr8[i4 + 1].i, xeVarArr8[i4].i, 0, 5);
                        }
                        xxVar3.f(xeVarArr8[i4].i, xeVarArr9[i4].i, i14, 8);
                    }
                    xe xeVar14 = xeVarArr8[i4 + 1].f;
                    if (xeVar14 != null) {
                        rfVar10 = xeVar14.d;
                        xe xeVar15 = rfVar10.Q[i4].f;
                        if (xeVar15 != null) {
                        }
                    }
                    rfVar10 = null;
                    if (rfVar10 != null) {
                        rfVar = rfVar10;
                    } else {
                        z10 = true;
                    }
                    rfVar12 = rfVar22;
                    xeVarArr7 = xeVarArr9;
                    z2 = z11;
                    i17 = i13;
                }
                xe[] xeVarArr10 = xeVarArr7;
                boolean z13 = z2;
                i6 = i17;
                if (rfVar20 != null) {
                    int i31 = i4 + 1;
                    if (rfVar18.Q[i31].f != null) {
                        xe xeVar16 = rfVar20.Q[i31];
                        if (rfVar20.T[i2] == qf.MATCH_CONSTRAINT && rfVar20.t[i2] == 0 && !z13) {
                            xe xeVar17 = xeVar16.f;
                            if (xeVar17.d == sfVar2) {
                                xxVar3.e(xeVar16.i, xeVar17.i, -xeVar16.e(), 5);
                                xxVar3.g(xeVar16.i, rfVar18.Q[i31].f.i, -xeVar16.e(), 6);
                                if (z3) {
                                    int i32 = i4 + 1;
                                    je0 je0Var9 = xeVarArr10[i32].i;
                                    xe xeVar18 = rfVar18.Q[i32];
                                    xxVar3.f(je0Var9, xeVar18.i, xeVar18.e(), 8);
                                }
                                arrayList2 = yaVar.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    if (yaVar.n && !yaVar.p) {
                                        f3 = yaVar.j;
                                    }
                                    rf rfVar23 = null;
                                    float f10 = f2;
                                    i10 = 0;
                                    while (i10 < size) {
                                        rf rfVar24 = (rf) arrayList2.get(i10);
                                        float[] fArr = rfVar24.l0;
                                        xe[] xeVarArr11 = rfVar24.Q;
                                        float f11 = fArr[i2];
                                        if (f11 < f2) {
                                            if (yaVar.p) {
                                                arrayList3 = arrayList2;
                                                xxVar3.e(xeVarArr11[i4 + 1].i, xeVarArr11[i4].i, 0, 4);
                                                f6 = f10;
                                                i11 = size;
                                                f5 = f2;
                                                f10 = f6;
                                                i12 = i10;
                                                i10 = i12 + 1;
                                                arrayList2 = arrayList3;
                                                size = i11;
                                                f2 = f5;
                                            } else {
                                                f11 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        if (f11 == f2) {
                                            f6 = f10;
                                            xxVar3.e(xeVarArr11[i4 + 1].i, xeVarArr11[i4].i, 0, 8);
                                            i11 = size;
                                            f5 = f2;
                                            f10 = f6;
                                            i12 = i10;
                                            i10 = i12 + 1;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f2 = f5;
                                        } else {
                                            float f12 = f10;
                                            if (rfVar23 != null) {
                                                xe[] xeVarArr12 = rfVar23.Q;
                                                je0 je0Var10 = xeVarArr12[i4].i;
                                                int i33 = i4 + 1;
                                                je0 je0Var11 = xeVarArr12[i33].i;
                                                je0 je0Var12 = xeVarArr11[i4].i;
                                                je0 je0Var13 = xeVarArr11[i33].i;
                                                i11 = size;
                                                h7 l2 = xxVar3.l();
                                                rfVar9 = rfVar24;
                                                float f13 = f2;
                                                l2.b = f13;
                                                f5 = f13;
                                                if (f3 == f13 || f12 == f11) {
                                                    i12 = i10;
                                                    f4 = f11;
                                                    l2.d.g(je0Var10, 1.0f);
                                                    l2.d.g(je0Var11, -1.0f);
                                                    l2.d.g(je0Var13, 1.0f);
                                                    l2.d.g(je0Var12, -1.0f);
                                                } else {
                                                    a7 a7Var = l2.d;
                                                    if (f12 == f5) {
                                                        i12 = i10;
                                                        a7Var.g(je0Var10, 1.0f);
                                                        l2.d.g(je0Var11, -1.0f);
                                                        f4 = f11;
                                                    } else {
                                                        i12 = i10;
                                                        f4 = f11;
                                                        if (f11 == f2) {
                                                            a7Var.g(je0Var12, 1.0f);
                                                            l2.d.g(je0Var13, -1.0f);
                                                        } else {
                                                            float f14 = (f12 / f3) / (f4 / f3);
                                                            a7Var.g(je0Var10, 1.0f);
                                                            l2.d.g(je0Var11, -1.0f);
                                                            l2.d.g(je0Var13, f14);
                                                            l2.d.g(je0Var12, -f14);
                                                        }
                                                    }
                                                }
                                                xxVar3.c(l2);
                                            } else {
                                                i11 = size;
                                                rfVar9 = rfVar24;
                                                f4 = f11;
                                                f5 = f2;
                                                i12 = i10;
                                            }
                                            rfVar23 = rfVar9;
                                            f10 = f4;
                                            i10 = i12 + 1;
                                            arrayList2 = arrayList3;
                                            size = i11;
                                            f2 = f5;
                                        }
                                    }
                                }
                                if (rfVar19 != null || (rfVar19 != rfVar20 && !z13)) {
                                    rfVar2 = rfVar20;
                                    if (!z4 && rfVar19 != null) {
                                        int i34 = yaVar.j;
                                        boolean z14 = i34 > 0 && yaVar.i == i34;
                                        rf rfVar25 = rfVar19;
                                        rf rfVar26 = rfVar25;
                                        while (true) {
                                            xe[] xeVarArr13 = rfVar26.Q;
                                            if (rfVar25 == null) {
                                                break;
                                            }
                                            xe[] xeVarArr14 = rfVar25.Q;
                                            rf rfVar27 = rfVar25.n0[i2];
                                            while (true) {
                                                if (rfVar27 == null) {
                                                    i7 = 8;
                                                    break;
                                                }
                                                i7 = 8;
                                                if (rfVar27.h0 != 8) {
                                                    break;
                                                } else {
                                                    rfVar27 = rfVar27.n0[i2];
                                                }
                                            }
                                            if (rfVar27 != null || rfVar25 == rfVar2) {
                                                xe xeVar19 = xeVarArr14[i4];
                                                je0 je0Var14 = xeVar19.i;
                                                xe xeVar20 = xeVar19.f;
                                                je0 je0Var15 = xeVar20 != null ? xeVar20.i : null;
                                                if (rfVar26 != rfVar25) {
                                                    je0Var15 = xeVarArr13[i4 + 1].i;
                                                } else if (rfVar25 == rfVar19) {
                                                    xe xeVar21 = xeVarArr[i4].f;
                                                    je0Var15 = xeVar21 != null ? xeVar21.i : null;
                                                }
                                                int e3 = xeVar19.e();
                                                int i35 = i4 + 1;
                                                int e4 = xeVarArr14[i35].e();
                                                if (rfVar27 != null) {
                                                    xeVar5 = rfVar27.Q[i4];
                                                    xeVarArr2 = xeVarArr13;
                                                    je0Var4 = xeVar5.i;
                                                } else {
                                                    xeVarArr2 = xeVarArr13;
                                                    xeVar5 = rfVar18.Q[i35].f;
                                                    if (xeVar5 != null) {
                                                        je0Var4 = xeVar5.i;
                                                    } else {
                                                        xeVar6 = xeVar5;
                                                        je0Var3 = null;
                                                        je0 je0Var16 = xeVarArr14[i35].i;
                                                        if (xeVar6 != null) {
                                                            e4 += xeVar6.e();
                                                        }
                                                        int e5 = xeVarArr2[i35].e() + e3;
                                                        if (je0Var14 != null || je0Var15 == null || je0Var3 == null || je0Var16 == null) {
                                                            rfVar7 = rfVar27;
                                                            rfVar8 = rfVar26;
                                                            i8 = 8;
                                                        } else {
                                                            if (rfVar25 == rfVar19) {
                                                                e5 = rfVar19.Q[i4].e();
                                                            }
                                                            int i36 = e5;
                                                            if (rfVar25 == rfVar2) {
                                                                e4 = rfVar2.Q[i35].e();
                                                            }
                                                            rfVar7 = rfVar27;
                                                            rfVar8 = rfVar26;
                                                            i8 = 8;
                                                            xxVar.b(je0Var14, je0Var15, i36, 0.5f, je0Var3, je0Var16, e4, z14 ? 8 : 5);
                                                        }
                                                    }
                                                }
                                                xe xeVar22 = xeVar5;
                                                je0Var3 = je0Var4;
                                                xeVar6 = xeVar22;
                                                je0 je0Var162 = xeVarArr14[i35].i;
                                                if (xeVar6 != null) {
                                                }
                                                int e52 = xeVarArr2[i35].e() + e3;
                                                if (je0Var14 != null) {
                                                }
                                                rfVar7 = rfVar27;
                                                rfVar8 = rfVar26;
                                                i8 = 8;
                                            } else {
                                                rfVar7 = rfVar27;
                                                rfVar8 = rfVar26;
                                                i8 = i7;
                                            }
                                            if (rfVar25.h0 != i8) {
                                                rfVar8 = rfVar25;
                                            }
                                            rfVar25 = rfVar7;
                                            rfVar26 = rfVar8;
                                        }
                                    } else {
                                        int i37 = 8;
                                        if (z && rfVar19 != null) {
                                            int i38 = yaVar.j;
                                            boolean z15 = i38 <= 0 && yaVar.i == i38;
                                            rfVar3 = rfVar19;
                                            rfVar4 = rfVar3;
                                            while (true) {
                                                xe[] xeVarArr15 = rfVar3.Q;
                                                if (rfVar4 != null) {
                                                    break;
                                                }
                                                xe[] xeVarArr16 = rfVar4.Q;
                                                rf rfVar28 = rfVar4.n0[i2];
                                                while (rfVar28 != null && rfVar28.h0 == i37) {
                                                    rfVar28 = rfVar28.n0[i2];
                                                }
                                                if (rfVar4 == rfVar19 || rfVar4 == rfVar2 || rfVar28 == null) {
                                                    rfVar5 = rfVar3;
                                                } else {
                                                    if (rfVar28 == rfVar2) {
                                                        rfVar28 = null;
                                                    }
                                                    xe xeVar23 = xeVarArr16[i4];
                                                    je0 je0Var17 = xeVar23.i;
                                                    int i39 = i4 + 1;
                                                    je0 je0Var18 = xeVarArr15[i39].i;
                                                    int e6 = xeVar23.e();
                                                    int e7 = xeVarArr16[i39].e();
                                                    if (rfVar28 != null) {
                                                        xeVar4 = rfVar28.Q[i4];
                                                        je0Var = xeVar4.i;
                                                        rfVar5 = rfVar3;
                                                        xe xeVar24 = xeVar4.f;
                                                        je0Var2 = xeVar24 != null ? xeVar24.i : null;
                                                    } else {
                                                        rfVar5 = rfVar3;
                                                        xe xeVar25 = rfVar2.Q[i4];
                                                        je0Var = xeVar25 != null ? xeVar25.i : null;
                                                        je0 je0Var19 = xeVarArr16[i39].i;
                                                        xeVar4 = xeVar25;
                                                        je0Var2 = je0Var19;
                                                    }
                                                    if (xeVar4 != null) {
                                                        e7 += xeVar4.e();
                                                    }
                                                    int e8 = xeVarArr15[i39].e() + e6;
                                                    int i40 = z15 ? 8 : 4;
                                                    if (je0Var17 == null || je0Var18 == null || je0Var == null || je0Var2 == null) {
                                                        rfVar6 = rfVar28;
                                                    } else {
                                                        je0 je0Var20 = je0Var;
                                                        rfVar6 = rfVar28;
                                                        xxVar.b(je0Var17, je0Var18, e8, 0.5f, je0Var20, je0Var2, e7, i40);
                                                    }
                                                    rfVar28 = rfVar6;
                                                }
                                                i37 = 8;
                                                if (rfVar4.h0 != 8) {
                                                    rfVar5 = rfVar4;
                                                }
                                                rfVar4 = rfVar28;
                                                rfVar3 = rfVar5;
                                            }
                                            xxVar2 = xxVar;
                                            xe xeVar26 = rfVar19.Q[i4];
                                            xeVar = xeVarArr[i4].f;
                                            int i41 = i4 + 1;
                                            xeVar2 = rfVar2.Q[i41];
                                            xeVar3 = rfVar18.Q[i41].f;
                                            if (xeVar != null) {
                                                if (rfVar19 != rfVar2) {
                                                    xxVar2.e(xeVar26.i, xeVar.i, xeVar26.e(), 5);
                                                } else if (xeVar3 != null) {
                                                    xxVar2.b(xeVar26.i, xeVar.i, xeVar26.e(), 0.5f, xeVar2.i, xeVar3.i, xeVar2.e(), 5);
                                                }
                                            }
                                            if (xeVar3 != null && rfVar19 != rfVar2) {
                                                xxVar2.e(xeVar2.i, xeVar3.i, -xeVar2.e(), 5);
                                            }
                                            if ((!z4 || z) && rfVar19 != null && rfVar19 != rfVar2) {
                                                xe[] xeVarArr17 = rfVar19.Q;
                                                xeVar7 = xeVarArr17[i4];
                                                if (rfVar2 == null) {
                                                    rfVar2 = rfVar19;
                                                }
                                                xeVarArr3 = rfVar2.Q;
                                                i9 = i4 + 1;
                                                xeVar8 = xeVarArr3[i9];
                                                xe xeVar27 = xeVar7.f;
                                                je0Var5 = xeVar27 != null ? xeVar27.i : null;
                                                xe xeVar28 = xeVar8.f;
                                                je0Var6 = xeVar28 != null ? xeVar28.i : null;
                                                if (rfVar18 != rfVar2) {
                                                    xe xeVar29 = rfVar18.Q[i9].f;
                                                    je0Var6 = xeVar29 != null ? xeVar29.i : null;
                                                }
                                                if (rfVar19 == rfVar2) {
                                                    xeVar8 = xeVarArr17[i9];
                                                }
                                                if (je0Var5 == null && je0Var6 != null) {
                                                    xxVar2.b(xeVar7.i, je0Var5, xeVar7.e(), 0.5f, je0Var6, xeVar8.i, xeVarArr3[i9].e(), 5);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    xe xeVar30 = xeVarArr[i4];
                                    int i42 = i4 + 1;
                                    xe xeVar31 = rfVar18.Q[i42];
                                    xe xeVar32 = xeVar30.f;
                                    je0 je0Var21 = xeVar32 != null ? xeVar32.i : null;
                                    xe xeVar33 = xeVar31.f;
                                    je0 je0Var22 = xeVar33 != null ? xeVar33.i : null;
                                    xe xeVar34 = rfVar19.Q[i4];
                                    if (rfVar20 != null) {
                                        xeVar31 = rfVar20.Q[i42];
                                    }
                                    if (je0Var21 == null || je0Var22 == null) {
                                        rfVar2 = rfVar20;
                                    } else {
                                        float f15 = i2 == 0 ? rfVar21.e0 : rfVar21.f0;
                                        int e9 = xeVar34.e();
                                        int e10 = xeVar31.e();
                                        je0 je0Var23 = xeVar34.i;
                                        je0 je0Var24 = xeVar31.i;
                                        je0 je0Var25 = je0Var21;
                                        rfVar2 = rfVar20;
                                        xxVar3.b(je0Var23, je0Var25, e9, f15, je0Var22, je0Var24, e10, 7);
                                    }
                                }
                                xxVar2 = xxVar;
                                if (!z4) {
                                }
                                xe[] xeVarArr172 = rfVar19.Q;
                                xeVar7 = xeVarArr172[i4];
                                if (rfVar2 == null) {
                                }
                                xeVarArr3 = rfVar2.Q;
                                i9 = i4 + 1;
                                xeVar8 = xeVarArr3[i9];
                                xe xeVar272 = xeVar7.f;
                                if (xeVar272 != null) {
                                }
                                xe xeVar282 = xeVar8.f;
                                if (xeVar282 != null) {
                                }
                                if (rfVar18 != rfVar2) {
                                }
                                if (rfVar19 == rfVar2) {
                                }
                                if (je0Var5 == null) {
                                    xxVar2.b(xeVar7.i, je0Var5, xeVar7.e(), 0.5f, je0Var6, xeVar8.i, xeVarArr3[i9].e(), 5);
                                }
                            }
                        }
                        if (z13) {
                            xe xeVar35 = xeVar16.f;
                            if (xeVar35.d == sfVar2) {
                                xxVar3.e(xeVar16.i, xeVar35.i, -xeVar16.e(), 4);
                            }
                        }
                        xxVar3.g(xeVar16.i, rfVar18.Q[i31].f.i, -xeVar16.e(), 6);
                        if (z3) {
                        }
                        arrayList2 = yaVar.h;
                        if (arrayList2 != null) {
                            if (yaVar.n) {
                                f3 = yaVar.j;
                            }
                            rf rfVar232 = null;
                            float f102 = f2;
                            i10 = 0;
                            while (i10 < size) {
                            }
                        }
                        if (rfVar19 != null) {
                        }
                        rfVar2 = rfVar20;
                        if (!z4) {
                        }
                        int i372 = 8;
                        if (z) {
                            int i382 = yaVar.j;
                            if (i382 <= 0) {
                            }
                            rfVar3 = rfVar19;
                            rfVar4 = rfVar3;
                            while (true) {
                                xe[] xeVarArr152 = rfVar3.Q;
                                if (rfVar4 != null) {
                                }
                                rfVar4 = rfVar28;
                                rfVar3 = rfVar5;
                            }
                            xxVar2 = xxVar;
                            xe xeVar262 = rfVar19.Q[i4];
                            xeVar = xeVarArr[i4].f;
                            int i412 = i4 + 1;
                            xeVar2 = rfVar2.Q[i412];
                            xeVar3 = rfVar18.Q[i412].f;
                            if (xeVar != null) {
                            }
                            if (xeVar3 != null) {
                                xxVar2.e(xeVar2.i, xeVar3.i, -xeVar2.e(), 5);
                            }
                            if (!z4) {
                            }
                            xe[] xeVarArr1722 = rfVar19.Q;
                            xeVar7 = xeVarArr1722[i4];
                            if (rfVar2 == null) {
                            }
                            xeVarArr3 = rfVar2.Q;
                            i9 = i4 + 1;
                            xeVar8 = xeVarArr3[i9];
                            xe xeVar2722 = xeVar7.f;
                            if (xeVar2722 != null) {
                            }
                            xe xeVar2822 = xeVar8.f;
                            if (xeVar2822 != null) {
                            }
                            if (rfVar18 != rfVar2) {
                            }
                            if (rfVar19 == rfVar2) {
                            }
                            if (je0Var5 == null) {
                            }
                        }
                        xxVar2 = xxVar;
                        if (!z4) {
                        }
                        xe[] xeVarArr17222 = rfVar19.Q;
                        xeVar7 = xeVarArr17222[i4];
                        if (rfVar2 == null) {
                        }
                        xeVarArr3 = rfVar2.Q;
                        i9 = i4 + 1;
                        xeVar8 = xeVarArr3[i9];
                        xe xeVar27222 = xeVar7.f;
                        if (xeVar27222 != null) {
                        }
                        xe xeVar28222 = xeVar8.f;
                        if (xeVar28222 != null) {
                        }
                        if (rfVar18 != rfVar2) {
                        }
                        if (rfVar19 == rfVar2) {
                        }
                        if (je0Var5 == null) {
                        }
                    }
                }
                if (z3) {
                }
                arrayList2 = yaVar.h;
                if (arrayList2 != null) {
                }
                if (rfVar19 != null) {
                }
                rfVar2 = rfVar20;
                if (!z4) {
                }
                int i3722 = 8;
                if (z) {
                }
                xxVar2 = xxVar;
                if (!z4) {
                }
                xe[] xeVarArr172222 = rfVar19.Q;
                xeVar7 = xeVarArr172222[i4];
                if (rfVar2 == null) {
                }
                xeVarArr3 = rfVar2.Q;
                i9 = i4 + 1;
                xeVar8 = xeVarArr3[i9];
                xe xeVar272222 = xeVar7.f;
                if (xeVar272222 != null) {
                }
                xe xeVar282222 = xeVar8.f;
                if (xeVar282222 != null) {
                }
                if (rfVar18 != rfVar2) {
                }
                if (rfVar19 == rfVar2) {
                }
                if (je0Var5 == null) {
                }
            } else {
                i6 = i17;
            }
            i18 = i5 + 1;
            sfVar2 = sfVar;
            xxVar3 = xxVar;
            arrayList4 = arrayList;
            i17 = i6;
        }
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void g(int i2) {
        if (i2 >= 1) {
            return;
        }
        s9.e(r7.b("Expected positive parallelism level, but got ", i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(eb0 eb0Var, Throwable th) {
        boolean isTerminated;
        if (eb0Var != 0) {
            if (th != null) {
                try {
                    r7.e(eb0Var);
                    return;
                } catch (Throwable th2) {
                    bi.f(th, th2);
                    return;
                }
            }
            if (eb0Var instanceof AutoCloseable) {
                eb0Var.close();
                return;
            }
            if (!(eb0Var instanceof ExecutorService)) {
                if (eb0Var instanceof TypedArray) {
                    ((TypedArray) eb0Var).recycle();
                    return;
                } else if (eb0Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) eb0Var).release();
                    return;
                } else {
                    if (!(eb0Var instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) eb0Var).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) eb0Var;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static int i(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ep k(Context context) {
        ProviderInfo providerInfo;
        cp cpVar;
        ApplicationInfo applicationInfo;
        sl eiVar = Build.VERSION.SDK_INT >= 28 ? new ei() : new sl();
        PackageManager packageManager = context.getPackageManager();
        bi.q(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] j2 = eiVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                cpVar = new cp(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (cpVar != null) {
                return null;
            }
            return new ep(new dp(context, cpVar));
        }
        cpVar = null;
        if (cpVar != null) {
        }
    }

    public static lb0 l(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            lb0 lb0Var = new lb0();
            new LinkedHashMap();
            lb0Var.a = new j90(xm.f);
            return lb0Var;
        }
        ClassLoader classLoader = lb0.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        sz szVar = new sz(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            szVar.put(str, bundle.get(str));
        }
        sz b2 = szVar.b();
        lb0 lb0Var2 = new lb0();
        new LinkedHashMap();
        lb0Var2.a = new j90(b2);
        return lb0Var2;
    }

    public static final long n(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = el.h;
        int i3 = fl.a;
        return j3;
    }

    public static sn0 o(rf rfVar, int i2, ArrayList arrayList, sn0 sn0Var) {
        int i3;
        int i4 = i2 == 0 ? rfVar.o0 : rfVar.p0;
        if (i4 != -1 && (sn0Var == null || i4 != sn0Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                sn0 sn0Var2 = (sn0) arrayList.get(i5);
                if (sn0Var2.b == i4) {
                    if (sn0Var != null) {
                        sn0Var.c(i2, sn0Var2);
                        arrayList.remove(sn0Var);
                    }
                    sn0Var = sn0Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return sn0Var;
        }
        if (sn0Var == null) {
            if (rfVar instanceof dt) {
                dt dtVar = (dt) rfVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= dtVar.r0) {
                        i3 = -1;
                        break;
                    }
                    rf rfVar2 = dtVar.q0[i6];
                    if ((i2 == 0 && (i3 = rfVar2.o0) != -1) || (i2 == 1 && (i3 = rfVar2.p0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        sn0 sn0Var3 = (sn0) arrayList.get(i7);
                        if (sn0Var3.b == i3) {
                            sn0Var = sn0Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (sn0Var == null) {
                sn0Var = new sn0();
                sn0Var.a = new ArrayList();
                sn0Var.d = null;
                sn0Var.e = -1;
                int i8 = sn0.f;
                sn0.f = i8 + 1;
                sn0Var.b = i8;
                sn0Var.c = i2;
            }
            arrayList.add(sn0Var);
        }
        ArrayList arrayList2 = sn0Var.a;
        if (arrayList2.contains(rfVar)) {
            return sn0Var;
        }
        arrayList2.add(rfVar);
        if (rfVar instanceof os) {
            os osVar = (os) rfVar;
            osVar.t0.c(osVar.u0 == 0 ? 1 : 0, sn0Var, arrayList);
        }
        int i9 = sn0Var.b;
        if (i2 == 0) {
            rfVar.o0 = i9;
            rfVar.I.c(i2, sn0Var, arrayList);
            rfVar.K.c(i2, sn0Var, arrayList);
        } else {
            rfVar.p0 = i9;
            rfVar.J.c(i2, sn0Var, arrayList);
            rfVar.M.c(i2, sn0Var, arrayList);
            rfVar.L.c(i2, sn0Var, arrayList);
        }
        rfVar.P.c(i2, sn0Var, arrayList);
        return sn0Var;
    }

    public static og p(og ogVar, pg pgVar) {
        pgVar.getClass();
        if (c(ogVar.getKey(), pgVar)) {
            return ogVar;
        }
        return null;
    }

    public static ColorStateList q(Context context, s6 s6Var, int i2) {
        int resourceId;
        ColorStateList A;
        TypedArray typedArray = (TypedArray) s6Var.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (A = bi.A(context, resourceId)) == null) ? s6Var.i(i2) : A;
    }

    public static ColorStateList r(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList A;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (A = bi.A(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : A;
    }

    public static Drawable s(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable v;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (v = d50.v(context, resourceId)) == null) ? typedArray.getDrawable(i2) : v;
    }

    public static Set t() {
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

    public static final Class u(ow owVar) {
        owVar.getClass();
        Class a2 = ((cc) owVar).a();
        a2.getClass();
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class v(ow owVar) {
        owVar.getClass();
        Class a2 = ((cc) owVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
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
        return a2;
    }

    public static final int w(int i2, int i3, int i4) {
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
                s9.k("Step is zero.");
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

    public static final boolean z(AssertionError assertionError) {
        Logger logger = p40.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? mf0.t(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public abstract Object H(Intent intent, int i2);

    public abstract void J(w wVar, w wVar2);

    public abstract void K(w wVar, Thread thread);

    public abstract void N(rd0 rd0Var, float f2);

    public abstract boolean d(x xVar, t tVar);

    public abstract boolean e(x xVar, Object obj, Object obj2);

    public abstract boolean f(x xVar, w wVar, w wVar2);

    public abstract Intent m(b bVar);

    public o0 x(b bVar) {
        return null;
    }

    public abstract float y(rd0 rd0Var);
}
