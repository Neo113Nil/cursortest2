package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import com.google.android.material.appbar.AppBarLayout;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class mz implements yc0 {
    public static ExecutorService b;
    public static long h;
    public static Method i;
    public static final Object a = new Object();
    public static final i8 c = new i8();
    public static final Object d = new Object();
    public static final ky e = new ky(4);
    public static final Object f = new Object();
    public static final int[] g = {R.attr.stateListAnimator};

    public static Typeface A(Configuration configuration, Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, la0.o(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static void B(PackageInfo packageInfo, File file) {
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

    public static long C(String str, int i2) {
        int l = l(str, 0, i2, false);
        Matcher matcher = me.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (l < i2) {
            int l2 = l(str, l + 1, i2, true);
            matcher.region(l, l2);
            if (i4 == -1 && matcher.usePattern(me.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(me.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = me.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = f70.X(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(me.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            l = l(str, l2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            g9.i("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            g9.i("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            g9.i("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            g9.i("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            g9.i("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            g9.i("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(cb0.e);
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

    public static byte[] D(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                g9.s(f60.e("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] E(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long F(InputStream inputStream, int i2) {
        byte[] D = D(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (D[i3] & 255) << (i3 * 8);
        }
        return j;
    }

    public static void I(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.moontiko.really.admiralcasino.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.moontiko.really.admiralcasino.R.attr.state_liftable, -2130904209}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static void J(View view, dw dwVar) {
        fj fjVar = dwVar.g.b;
        if (fjVar == null || !fjVar.a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        bw bwVar = dwVar.g;
        if (bwVar.l != f2) {
            bwVar.l = f2;
            dwVar.y();
        }
    }

    public static void K(int i2, qd qdVar, ae aeVar, boolean z) {
        float f2 = aeVar.d0;
        ld ldVar = aeVar.I;
        int d2 = ldVar.f.d();
        ld ldVar2 = aeVar.K;
        int d3 = ldVar2.f.d();
        int e2 = ldVar.e() + d2;
        int e3 = d3 - ldVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = aeVar.q();
        int i3 = (d3 - d2) - q;
        if (d2 > d3) {
            i3 = (d2 - d3) - q;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + q;
        if (d2 > d3) {
            i5 = i4 - q;
        }
        aeVar.J(i4, i5);
        u(i2 + 1, qdVar, aeVar, z);
    }

    public static void L(int i2, ae aeVar, qd qdVar, ae aeVar2, boolean z) {
        float f2 = aeVar2.d0;
        ld ldVar = aeVar2.I;
        int e2 = ldVar.e() + ldVar.f.d();
        ld ldVar2 = aeVar2.K;
        int d2 = ldVar2.f.d() - ldVar2.e();
        if (d2 >= e2) {
            int q = aeVar2.q();
            if (aeVar2.g0 != 8) {
                int i3 = aeVar2.r;
                if (i3 == 2) {
                    q = (int) (aeVar2.d0 * 0.5f * (aeVar instanceof be ? aeVar.q() : aeVar.T.q()));
                } else if (i3 == 0) {
                    q = d2 - e2;
                }
                q = Math.max(aeVar2.u, q);
                int i4 = aeVar2.v;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - q)) + 0.5f));
            aeVar2.J(i5, q + i5);
            u(i2 + 1, qdVar, aeVar2, z);
        }
    }

    public static void M(int i2, qd qdVar, ae aeVar) {
        float f2 = aeVar.e0;
        ld ldVar = aeVar.J;
        int d2 = ldVar.f.d();
        ld ldVar2 = aeVar.L;
        int d3 = ldVar2.f.d();
        int e2 = ldVar.e() + d2;
        int e3 = d3 - ldVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k = aeVar.k();
        int i3 = (d3 - d2) - k;
        if (d2 > d3) {
            i3 = (d2 - d3) - k;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d2 + i4;
        int i6 = i5 + k;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k;
        }
        aeVar.K(i5, i6);
        R(i2 + 1, qdVar, aeVar);
    }

    public static void N(int i2, ae aeVar, qd qdVar, ae aeVar2) {
        float f2 = aeVar2.e0;
        ld ldVar = aeVar2.J;
        int e2 = ldVar.e() + ldVar.f.d();
        ld ldVar2 = aeVar2.L;
        int d2 = ldVar2.f.d() - ldVar2.e();
        if (d2 >= e2) {
            int k = aeVar2.k();
            if (aeVar2.g0 != 8) {
                int i3 = aeVar2.s;
                if (i3 == 2) {
                    k = (int) (f2 * 0.5f * (aeVar instanceof be ? aeVar.k() : aeVar.T.k()));
                } else if (i3 == 0) {
                    k = d2 - e2;
                }
                k = Math.max(aeVar2.x, k);
                int i4 = aeVar2.y;
                if (i4 > 0) {
                    k = Math.min(i4, k);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - k)) + 0.5f));
            aeVar2.K(i5, k + i5);
            R(i2 + 1, qdVar, aeVar2);
        }
    }

    public static gr O(ir irVar, int i2) {
        irVar.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = irVar.f;
        int i4 = irVar.g;
        if (irVar.h <= 0) {
            i2 = -i2;
        }
        return new gr(i3, i4, i2);
    }

    public static int P(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ir Q(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new ir(i2, i3 - 1, 1);
        }
        ir irVar = ir.i;
        return ir.i;
    }

    public static void R(int i2, qd qdVar, ae aeVar) {
        boolean z;
        ld ldVar;
        ld ldVar2;
        ld ldVar3;
        ld ldVar4;
        if (aeVar.n) {
            return;
        }
        if (!(aeVar instanceof be) && aeVar.z() && g(aeVar)) {
            be.V(aeVar, qdVar, new i8());
        }
        ld i3 = aeVar.i(3);
        ld i4 = aeVar.i(5);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ld ldVar5 = (ld) it.next();
                ae aeVar2 = ldVar5.d;
                int i5 = i2 + 1;
                boolean g2 = g(aeVar2);
                ld ldVar6 = aeVar2.J;
                ld ldVar7 = aeVar2.L;
                if (aeVar2.z() && g2) {
                    be.V(aeVar2, qdVar, new i8());
                }
                boolean z2 = (ldVar5 == ldVar6 && (ldVar4 = ldVar7.f) != null && ldVar4.c) || (ldVar5 == ldVar7 && (ldVar3 = ldVar6.f) != null && ldVar3.c);
                int i6 = aeVar2.p0[1];
                if (i6 != 3 || g2) {
                    if (!aeVar2.z()) {
                        if (ldVar5 == ldVar6 && ldVar7.f == null) {
                            int e2 = ldVar6.e() + d2;
                            aeVar2.K(e2, aeVar2.k() + e2);
                            R(i5, qdVar, aeVar2);
                        } else if (ldVar5 == ldVar7 && ldVar6.f == null) {
                            int e3 = d2 - ldVar7.e();
                            aeVar2.K(e3 - aeVar2.k(), e3);
                            R(i5, qdVar, aeVar2);
                        } else if (z2 && !aeVar2.y()) {
                            M(i5, qdVar, aeVar2);
                        }
                    }
                } else if (i6 == 3 && aeVar2.y >= 0 && aeVar2.x >= 0 && (aeVar2.g0 == 8 || (aeVar2.s == 0 && aeVar2.W == 0.0f))) {
                    if (!aeVar2.y() && !aeVar2.F && z2 && !aeVar2.y()) {
                        N(i5, aeVar, qdVar, aeVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (aeVar instanceof yo) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ld ldVar8 = (ld) it2.next();
                ae aeVar3 = ldVar8.d;
                int i7 = i2 + 1;
                boolean g3 = g(aeVar3);
                ld ldVar9 = aeVar3.J;
                ld ldVar10 = aeVar3.L;
                if (aeVar3.z() && g3) {
                    be.V(aeVar3, qdVar, new i8());
                }
                boolean z4 = (ldVar8 == ldVar9 && (ldVar2 = ldVar10.f) != null && ldVar2.c) || (ldVar8 == ldVar10 && (ldVar = ldVar9.f) != null && ldVar.c);
                int i8 = aeVar3.p0[1];
                if (i8 != 3 || g3) {
                    if (!aeVar3.z()) {
                        if (ldVar8 == ldVar9 && ldVar10.f == null) {
                            int e4 = ldVar9.e() + d3;
                            aeVar3.K(e4, aeVar3.k() + e4);
                            R(i7, qdVar, aeVar3);
                        } else if (ldVar8 == ldVar10 && ldVar9.f == null) {
                            int e5 = d3 - ldVar10.e();
                            aeVar3.K(e5 - aeVar3.k(), e5);
                            R(i7, qdVar, aeVar3);
                        } else if (z4 && !aeVar3.y()) {
                            M(i7, qdVar, aeVar3);
                        }
                    }
                } else if (i8 == 3 && aeVar3.y >= 0 && aeVar3.x >= 0 && (aeVar3.g0 == 8 || (aeVar3.s == 0 && aeVar3.W == 0.0f))) {
                    if (!aeVar3.y() && !aeVar3.F && z4 && !aeVar3.y()) {
                        N(i7, aeVar, qdVar, aeVar3);
                    }
                }
            }
        }
        ld i9 = aeVar.i(6);
        if (i9.a != null && i9.c) {
            int d4 = i9.d();
            Iterator it3 = i9.a.iterator();
            while (it3.hasNext()) {
                ld ldVar11 = (ld) it3.next();
                ae aeVar4 = ldVar11.d;
                int i10 = i2 + 1;
                boolean g4 = g(aeVar4);
                ld ldVar12 = aeVar4.M;
                if (aeVar4.z() && g4) {
                    be.V(aeVar4, qdVar, new i8());
                }
                if (aeVar4.p0[z3 ? 1 : 0] != 3 || g4) {
                    if (!aeVar4.z()) {
                        if (ldVar11 == ldVar12) {
                            int e6 = ldVar11.e() + d4;
                            if (aeVar4.E) {
                                int i11 = e6 - aeVar4.a0;
                                int i12 = aeVar4.V + i11;
                                aeVar4.Z = i11;
                                aeVar4.J.l(i11);
                                aeVar4.L.l(i12);
                                ldVar12.l(e6);
                                z = z3 ? 1 : 0;
                                aeVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            R(i10, qdVar, aeVar4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        aeVar.n = z3;
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
    public static void S(Context context, Executor executor, l00 l00Var, boolean z) {
        boolean z2;
        ?? r7;
        jh[] jhVarArr;
        jh[] jhVarArr2;
        jh[] jhVarArr3;
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
        ih ihVar;
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
                                l00Var.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        n00.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = la0.n;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ih ihVar2 = new ih(assets, executor, l00Var, name, file2);
            byte[] bArr3 = ihVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        ihVar2.b(4, null);
                    }
                    ihVar2.f = true;
                    try {
                        try {
                            r7 = ihVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            l00Var.c(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            jhVarArr2 = ihVar2.g;
                            if (jhVarArr2 != null) {
                            }
                            l00 l00Var2 = ihVar2.b;
                            jhVarArr3 = ihVar2.g;
                            byte[] bArr4 = ihVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (jhVarArr3 != null) {
                            }
                            bArr = ihVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            n00.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            l00Var.c(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            jhVarArr2 = ihVar2.g;
                            if (jhVarArr2 != null) {
                            }
                            l00 l00Var22 = ihVar2.b;
                            jhVarArr3 = ihVar2.g;
                            byte[] bArr42 = ihVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (jhVarArr3 != null) {
                            }
                            bArr = ihVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            n00.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    l00Var.c(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        l00Var.c(7, e5);
                                    }
                                    jhVarArr = null;
                                    ihVar2.g = jhVarArr;
                                    jhVarArr2 = ihVar2.g;
                                    if (jhVarArr2 != null) {
                                    }
                                    l00 l00Var222 = ihVar2.b;
                                    jhVarArr3 = ihVar2.g;
                                    byte[] bArr422 = ihVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (jhVarArr3 != null) {
                                    }
                                    bArr = ihVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    n00.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                l00Var.c(7, e6);
                                r7.close();
                                jhVarArr = null;
                                ihVar2.g = jhVarArr;
                                jhVarArr2 = ihVar2.g;
                                if (jhVarArr2 != null) {
                                }
                                l00 l00Var2222 = ihVar2.b;
                                jhVarArr3 = ihVar2.g;
                                byte[] bArr4222 = ihVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (jhVarArr3 != null) {
                                }
                                bArr = ihVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                n00.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, D(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            jhVarArr = la0.X(r7, D(r7, 4), ihVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                l00Var.c(7, e7);
                            }
                            ihVar2.g = jhVarArr;
                        }
                        jhVarArr2 = ihVar2.g;
                        if (jhVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = ihVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                l00Var.c(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                l00Var.c(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                ihVar2.g = null;
                                l00Var.c(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(la0.o, D(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] D = D(a2, 4);
                                    ihVar2.g = la0.U(a2, D, bArr3, jhVarArr2);
                                    a2.close();
                                    ihVar = ihVar2;
                                    r7 = D;
                                    if (ihVar != null) {
                                        ihVar2 = ihVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                ihVar = null;
                                r7 = str;
                                if (ihVar != null) {
                                }
                            }
                        }
                        l00 l00Var22222 = ihVar2.b;
                        jhVarArr3 = ihVar2.g;
                        byte[] bArr42222 = ihVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (jhVarArr3 != null && bArr42222 != null) {
                            z7 = ihVar2.f;
                            if (z7) {
                                g9.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
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
                                l00Var22222.c(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                l00Var22222.c(8, e12);
                                z8 = z7;
                            }
                            if (la0.f0(byteArrayOutputStream, bArr42222, jhVarArr3)) {
                                ihVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                ihVar2.g = null;
                                z112222 = z8;
                            } else {
                                l00Var22222.c(5, null);
                                ihVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = ihVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!ihVar2.f) {
                                    g9.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(ihVar2.d);
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
                                                                                ihVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                ihVar2.h = null;
                                                                                ihVar2.g = null;
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
                                        ihVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        n00.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        ihVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        n00.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    ihVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    n00.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    ihVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    n00.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                ihVar2.h = null;
                                ihVar2.g = null;
                            }
                        }
                        if (z4) {
                            B(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            ihVar2.b(4, null);
                        }
                        ihVar2.f = true;
                        r7 = ihVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        jhVarArr2 = ihVar2.g;
                        if (jhVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = ihVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        l00 l00Var222222 = ihVar2.b;
                        jhVarArr3 = ihVar2.g;
                        byte[] bArr422222 = ihVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (jhVarArr3 != null) {
                            z7 = ihVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = ihVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        ihVar2.b(4, null);
                    }
                }
                n00.c(context, (z6 || !z) ? false : z9);
            }
            ihVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            n00.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            l00Var.c(7, e17);
            n00.c(context, false);
        }
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, long j, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        T(byteArrayOutputStream, i2, 2);
    }

    public static final String d(Object[] objArr, int i2, int i3, n nVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == nVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
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
    public static void e(be beVar, ys ysVar, ArrayList arrayList, int i2) {
        int i3;
        fa[] faVarArr;
        int i4;
        int i5;
        ld[] ldVarArr;
        boolean z;
        ae aeVar;
        float f2;
        boolean z2;
        boolean z3;
        int i6;
        ae aeVar2;
        ys ysVar2;
        ae aeVar3;
        g60 g60Var;
        ld ldVar;
        g60 g60Var2;
        ae aeVar4;
        int i7;
        ld[] ldVarArr2;
        ld ldVar2;
        g60 g60Var3;
        ae aeVar5;
        ae aeVar6;
        int i8;
        ld ldVar3;
        ld[] ldVarArr3;
        int i9;
        ld ldVar4;
        g60 g60Var4;
        g60 g60Var5;
        int size;
        ArrayList arrayList2;
        int i10;
        ae aeVar7;
        int i11;
        float f3;
        int i12;
        float f4;
        ae aeVar8;
        int i13;
        int i14;
        int i15;
        ae aeVar9;
        ld ldVar5;
        ae aeVar10;
        be beVar2 = beVar;
        ys ysVar3 = ysVar;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = beVar2.z0;
            faVarArr = beVar2.C0;
            i4 = 0;
        } else {
            i3 = beVar2.A0;
            faVarArr = beVar2.B0;
            i4 = 2;
        }
        int i16 = i3;
        fa[] faVarArr2 = faVarArr;
        int i17 = 0;
        while (i17 < i16) {
            fa faVar = faVarArr2[i17];
            boolean z4 = faVar.q;
            ae aeVar11 = faVar.a;
            ld[] ldVarArr4 = aeVar11.Q;
            int i18 = 3;
            int i19 = 8;
            float f5 = 0.0f;
            if (z4) {
                i5 = i17;
            } else {
                int i20 = faVar.l;
                int i21 = i20 * 2;
                ae aeVar12 = aeVar11;
                ae aeVar13 = aeVar12;
                boolean z5 = false;
                while (!z5) {
                    faVar.i++;
                    ae[] aeVarArr = aeVar12.m0;
                    ld[] ldVarArr5 = aeVar12.Q;
                    aeVarArr[i20] = null;
                    aeVar12.l0[i20] = null;
                    if (aeVar12.g0 != i19) {
                        aeVar12.j(i20);
                        ldVarArr5[i21].e();
                        int i22 = i21 + 1;
                        ldVarArr5[i22].e();
                        ldVarArr5[i21].e();
                        ldVarArr5[i22].e();
                        if (faVar.b == null) {
                            faVar.b = aeVar12;
                        }
                        faVar.d = aeVar12;
                        int i23 = aeVar12.p0[i20];
                        if (i23 == i18) {
                            int i24 = aeVar12.t[i20];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                faVar.j++;
                                float f6 = aeVar12.k0[i20];
                                if (f6 > 0.0f) {
                                    i14 = i17;
                                    faVar.k += f6;
                                } else {
                                    i14 = i17;
                                }
                                i15 = i20;
                                if (aeVar12.g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f6 < 0.0f) {
                                        faVar.n = true;
                                    } else {
                                        faVar.o = true;
                                    }
                                    if (faVar.h == null) {
                                        faVar.h = new ArrayList();
                                    }
                                    faVar.h.add(aeVar12);
                                }
                                if (faVar.f == null) {
                                    faVar.f = aeVar12;
                                }
                                ae aeVar14 = faVar.g;
                                if (aeVar14 != null) {
                                    aeVar14.l0[i15] = aeVar12;
                                }
                                faVar.g = aeVar12;
                            } else {
                                i14 = i17;
                                i15 = i20;
                            }
                            if (i15 == 0) {
                                if (aeVar12.r == 0 && aeVar12.u == 0) {
                                    int i25 = aeVar12.v;
                                }
                            } else if (aeVar12.s == 0 && aeVar12.x == 0) {
                                int i26 = aeVar12.y;
                            }
                            aeVar9 = aeVar13;
                            if (aeVar9 != aeVar12) {
                                aeVar9.m0[i15] = aeVar12;
                            }
                            ldVar5 = ldVarArr5[i21 + 1].f;
                            if (ldVar5 != null) {
                                aeVar10 = ldVar5.d;
                                ld ldVar6 = aeVar10.Q[i21].f;
                                if (ldVar6 != null) {
                                }
                            }
                            aeVar10 = null;
                            if (aeVar10 != null) {
                                aeVar10 = aeVar12;
                                z5 = true;
                            }
                            aeVar13 = aeVar12;
                            i20 = i15;
                            i18 = 3;
                            i19 = 8;
                            aeVar12 = aeVar10;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i20;
                    aeVar9 = aeVar13;
                    if (aeVar9 != aeVar12) {
                    }
                    ldVar5 = ldVarArr5[i21 + 1].f;
                    if (ldVar5 != null) {
                    }
                    aeVar10 = null;
                    if (aeVar10 != null) {
                    }
                    aeVar13 = aeVar12;
                    i20 = i15;
                    i18 = 3;
                    i19 = 8;
                    aeVar12 = aeVar10;
                    i17 = i14;
                }
                i5 = i17;
                int i27 = i20;
                ae aeVar15 = faVar.b;
                if (aeVar15 != null) {
                    aeVar15.Q[i21].e();
                }
                ae aeVar16 = faVar.d;
                if (aeVar16 != null) {
                    aeVar16.Q[i21 + 1].e();
                }
                faVar.c = aeVar12;
                if (i27 == 0 && faVar.m) {
                    faVar.e = aeVar12;
                } else {
                    faVar.e = aeVar11;
                }
                faVar.p = faVar.o && faVar.n;
            }
            faVar.q = true;
            if (arrayList3 == null || arrayList3.contains(aeVar11)) {
                ae aeVar17 = faVar.c;
                ae aeVar18 = faVar.b;
                ae aeVar19 = faVar.d;
                ae aeVar20 = faVar.e;
                float f7 = faVar.k;
                int[] iArr = beVar2.p0;
                ld[] ldVarArr6 = beVar2.Q;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i28 = aeVar20.i0;
                    boolean z7 = i28 == 0;
                    ldVarArr = ldVarArr4;
                    boolean z8 = i28 == 1;
                    z = i28 == 2;
                    aeVar = aeVar11;
                    f2 = f7;
                    z3 = z8;
                    z2 = z7;
                } else {
                    ldVarArr = ldVarArr4;
                    int i29 = aeVar20.j0;
                    boolean z9 = i29 == 0;
                    boolean z10 = i29 == 1;
                    z = i29 == 2;
                    aeVar = aeVar11;
                    f2 = f7;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    ld[] ldVarArr7 = aeVar.Q;
                    int[] iArr2 = aeVar.p0;
                    ld ldVar7 = ldVarArr7[i4];
                    int i30 = z ? 1 : 4;
                    int e2 = ldVar7.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && aeVar.t[i2] == 0;
                    ld ldVar8 = ldVar7.f;
                    if (ldVar8 != null && aeVar != aeVar11) {
                        e2 = ldVar8.e() + e2;
                    }
                    int i31 = e2;
                    if (z13 && aeVar != aeVar11 && aeVar != aeVar18) {
                        i30 = 8;
                    }
                    ae aeVar21 = aeVar11;
                    ld ldVar9 = ldVar7.f;
                    if (ldVar9 != null) {
                        boolean z15 = z14;
                        g60 g60Var6 = ldVar7.i;
                        g60 g60Var7 = ldVar9.i;
                        if (aeVar == aeVar18) {
                            ysVar3.f(g60Var6, g60Var7, i31, 6);
                        } else {
                            ysVar3.f(g60Var6, g60Var7, i31, 8);
                        }
                        if (z15 && !z13) {
                            i30 = 5;
                        }
                        ysVar3.e(ldVar7.i, ldVar7.f.i, i31, (aeVar == aeVar18 && z13 && aeVar.S[i2]) ? 5 : i30);
                    }
                    if (z12) {
                        if (aeVar.g0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            ysVar3.f(ldVarArr7[i4 + 1].i, ldVarArr7[i4].i, 0, 5);
                        }
                        ysVar3.f(ldVarArr7[i4].i, ldVarArr6[i4].i, i13, 8);
                    }
                    ld ldVar10 = ldVarArr7[i4 + 1].f;
                    if (ldVar10 != null) {
                        aeVar8 = ldVar10.d;
                        ld ldVar11 = aeVar8.Q[i4].f;
                        if (ldVar11 != null) {
                        }
                    }
                    aeVar8 = null;
                    if (aeVar8 != null) {
                        aeVar = aeVar8;
                    } else {
                        z11 = true;
                    }
                    aeVar11 = aeVar21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (aeVar19 != null) {
                    int i32 = i4 + 1;
                    if (aeVar17.Q[i32].f != null) {
                        ld ldVar12 = aeVar19.Q[i32];
                        if (aeVar19.p0[i2] == 3 && aeVar19.t[i2] == 0 && !z17) {
                            ld ldVar13 = ldVar12.f;
                            if (ldVar13.d == beVar2) {
                                ysVar3.e(ldVar12.i, ldVar13.i, -ldVar12.e(), 5);
                                ysVar3.g(ldVar12.i, aeVar17.Q[i32].f.i, -ldVar12.e(), 6);
                            }
                        }
                        if (z17) {
                            ld ldVar14 = ldVar12.f;
                            if (ldVar14.d == beVar2) {
                                ysVar3.e(ldVar12.i, ldVar14.i, -ldVar12.e(), 4);
                            }
                        }
                        ysVar3.g(ldVar12.i, aeVar17.Q[i32].f.i, -ldVar12.e(), 6);
                    }
                }
                if (z16) {
                    int i33 = i4 + 1;
                    g60 g60Var8 = ldVarArr6[i33].i;
                    ld ldVar15 = aeVar17.Q[i33];
                    ysVar3.f(g60Var8, ldVar15.i, ldVar15.e(), 8);
                }
                ArrayList arrayList4 = faVar.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (faVar.n && !faVar.p) {
                        f2 = faVar.j;
                    }
                    ae aeVar22 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        ae aeVar23 = (ae) arrayList4.get(i34);
                        float[] fArr = aeVar23.k0;
                        ld[] ldVarArr8 = aeVar23.Q;
                        float f9 = fArr[i2];
                        if (f9 < f5) {
                            if (faVar.p) {
                                arrayList2 = arrayList4;
                                i10 = size;
                                ysVar3.e(ldVarArr8[i4 + 1].i, ldVarArr8[i4].i, 0, 4);
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
                            ysVar3.e(ldVarArr8[i4 + 1].i, ldVarArr8[i4].i, 0, 8);
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
                            if (aeVar22 != null) {
                                ld[] ldVarArr9 = aeVar22.Q;
                                g60 g60Var9 = ldVarArr9[i4].i;
                                int i35 = i4 + 1;
                                g60 g60Var10 = ldVarArr9[i35].i;
                                g60 g60Var11 = ldVarArr8[i4].i;
                                g60 g60Var12 = ldVarArr8[i35].i;
                                y6 l = ysVar3.l();
                                aeVar7 = aeVar23;
                                float f11 = f5;
                                l.b = f11;
                                f3 = f11;
                                if (f2 == f11 || f10 == f9) {
                                    i12 = i34;
                                    i11 = i16;
                                    l.d.g(g60Var9, 1.0f);
                                    l.d.g(g60Var10, -1.0f);
                                    l.d.g(g60Var12, 1.0f);
                                    l.d.g(g60Var11, -1.0f);
                                } else {
                                    r6 r6Var = l.d;
                                    if (f10 == f3) {
                                        i12 = i34;
                                        r6Var.g(g60Var9, 1.0f);
                                        l.d.g(g60Var10, -1.0f);
                                        i11 = i16;
                                    } else {
                                        i12 = i34;
                                        i11 = i16;
                                        if (f9 == f5) {
                                            r6Var.g(g60Var11, 1.0f);
                                            l.d.g(g60Var12, -1.0f);
                                        } else {
                                            float f12 = (f10 / f2) / (f9 / f2);
                                            r6Var.g(g60Var9, 1.0f);
                                            l.d.g(g60Var10, -1.0f);
                                            l.d.g(g60Var12, f12);
                                            l.d.g(g60Var11, -f12);
                                        }
                                    }
                                }
                                ysVar3.c(l);
                            } else {
                                aeVar7 = aeVar23;
                                i11 = i16;
                                f3 = f5;
                                i12 = i34;
                            }
                            f8 = f9;
                            aeVar22 = aeVar7;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList4 = arrayList2;
                            size = i10;
                            f5 = f3;
                        }
                    }
                }
                i6 = i16;
                if (aeVar18 == null || !(aeVar18 == aeVar19 || z17)) {
                    aeVar2 = aeVar19;
                    if (z2 && aeVar18 != null) {
                        int i36 = faVar.j;
                        boolean z18 = i36 > 0 && faVar.i == i36;
                        ae aeVar24 = aeVar18;
                        ae aeVar25 = aeVar24;
                        while (true) {
                            ld[] ldVarArr10 = aeVar25.Q;
                            if (aeVar24 == null) {
                                break;
                            }
                            ld[] ldVarArr11 = aeVar24.Q;
                            ae aeVar26 = aeVar24.m0[i2];
                            while (true) {
                                if (aeVar26 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (aeVar26.g0 != 8) {
                                    break;
                                } else {
                                    aeVar26 = aeVar26.m0[i2];
                                }
                            }
                            if (aeVar26 != null || aeVar24 == aeVar2) {
                                ld ldVar16 = ldVarArr11[i4];
                                g60 g60Var13 = ldVar16.i;
                                ld ldVar17 = ldVar16.f;
                                g60 g60Var14 = ldVar17 != null ? ldVar17.i : null;
                                if (aeVar25 != aeVar24) {
                                    g60Var14 = ldVarArr10[i4 + 1].i;
                                } else if (aeVar24 == aeVar18) {
                                    ld ldVar18 = ldVarArr[i4].f;
                                    g60Var14 = ldVar18 != null ? ldVar18.i : null;
                                }
                                int e3 = ldVar16.e();
                                int i37 = i4 + 1;
                                int e4 = ldVarArr11[i37].e();
                                if (aeVar26 != null) {
                                    ldVar2 = aeVar26.Q[i4];
                                    ldVarArr2 = ldVarArr10;
                                    g60Var3 = ldVar2.i;
                                } else {
                                    ldVarArr2 = ldVarArr10;
                                    ldVar2 = aeVar17.Q[i37].f;
                                    g60Var3 = ldVar2 != null ? ldVar2.i : null;
                                }
                                g60 g60Var15 = ldVarArr11[i37].i;
                                if (ldVar2 != null) {
                                    e4 += ldVar2.e();
                                }
                                int e5 = ldVarArr2[i37].e() + e3;
                                if (g60Var13 == null || g60Var14 == null || g60Var3 == null || g60Var15 == null) {
                                    aeVar5 = aeVar26;
                                    aeVar6 = aeVar25;
                                    i8 = 8;
                                } else {
                                    if (aeVar24 == aeVar18) {
                                        e5 = aeVar18.Q[i4].e();
                                    }
                                    int i38 = e5;
                                    if (aeVar24 == aeVar2) {
                                        e4 = aeVar2.Q[i37].e();
                                    }
                                    aeVar5 = aeVar26;
                                    aeVar6 = aeVar25;
                                    i8 = 8;
                                    ysVar.b(g60Var13, g60Var14, i38, 0.5f, g60Var3, g60Var15, e4, z18 ? 8 : 5);
                                }
                            } else {
                                aeVar5 = aeVar26;
                                aeVar6 = aeVar25;
                                i8 = i7;
                            }
                            if (aeVar24.g0 != i8) {
                                aeVar6 = aeVar24;
                            }
                            aeVar24 = aeVar5;
                            aeVar25 = aeVar6;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && aeVar18 != null) {
                            int i40 = faVar.j;
                            boolean z19 = i40 > 0 && faVar.i == i40;
                            ae aeVar27 = aeVar18;
                            ae aeVar28 = aeVar27;
                            while (true) {
                                ld[] ldVarArr12 = aeVar27.Q;
                                if (aeVar28 == null) {
                                    break;
                                }
                                ld[] ldVarArr13 = aeVar28.Q;
                                ae aeVar29 = aeVar28.m0[i2];
                                while (aeVar29 != null && aeVar29.g0 == i39) {
                                    aeVar29 = aeVar29.m0[i2];
                                }
                                if (aeVar28 == aeVar18 || aeVar28 == aeVar2 || aeVar29 == null) {
                                    aeVar3 = aeVar27;
                                } else {
                                    if (aeVar29 == aeVar2) {
                                        aeVar29 = null;
                                    }
                                    ld ldVar19 = ldVarArr13[i4];
                                    g60 g60Var16 = ldVar19.i;
                                    int i41 = i4 + 1;
                                    g60 g60Var17 = ldVarArr12[i41].i;
                                    int e6 = ldVar19.e();
                                    int e7 = ldVarArr13[i41].e();
                                    if (aeVar29 != null) {
                                        ldVar = aeVar29.Q[i4];
                                        g60Var = ldVar.i;
                                        aeVar3 = aeVar27;
                                        ld ldVar20 = ldVar.f;
                                        g60Var2 = ldVar20 != null ? ldVar20.i : null;
                                    } else {
                                        aeVar3 = aeVar27;
                                        ld ldVar21 = aeVar2.Q[i4];
                                        g60Var = ldVar21 != null ? ldVar21.i : null;
                                        g60 g60Var18 = ldVarArr13[i41].i;
                                        ldVar = ldVar21;
                                        g60Var2 = g60Var18;
                                    }
                                    if (ldVar != null) {
                                        e7 += ldVar.e();
                                    }
                                    int e8 = ldVarArr12[i41].e() + e6;
                                    ae aeVar30 = aeVar29;
                                    int i42 = e7;
                                    int i43 = z19 ? 8 : 4;
                                    if (g60Var16 == null || g60Var17 == null || g60Var == null || g60Var2 == null) {
                                        aeVar4 = aeVar30;
                                    } else {
                                        g60 g60Var19 = g60Var;
                                        aeVar4 = aeVar30;
                                        ysVar.b(g60Var16, g60Var17, e8, 0.5f, g60Var19, g60Var2, i42, i43);
                                    }
                                    aeVar29 = aeVar4;
                                }
                                if (aeVar28.g0 != 8) {
                                    aeVar3 = aeVar28;
                                }
                                aeVar28 = aeVar29;
                                i39 = 8;
                                aeVar27 = aeVar3;
                            }
                            ysVar2 = ysVar;
                            ld ldVar22 = aeVar18.Q[i4];
                            ld ldVar23 = ldVarArr[i4].f;
                            int i44 = i4 + 1;
                            ld ldVar24 = aeVar2.Q[i44];
                            ld ldVar25 = aeVar17.Q[i44].f;
                            if (ldVar23 != null) {
                                if (aeVar18 != aeVar2) {
                                    ysVar2.e(ldVar22.i, ldVar23.i, ldVar22.e(), 5);
                                } else if (ldVar25 != null) {
                                    ysVar2.b(ldVar22.i, ldVar23.i, ldVar22.e(), 0.5f, ldVar24.i, ldVar25.i, ldVar24.e(), 5);
                                }
                            }
                            if (ldVar25 != null && aeVar18 != aeVar2) {
                                ysVar2.e(ldVar24.i, ldVar25.i, -ldVar24.e(), 5);
                            }
                            if ((!z2 || z3) && aeVar18 != null && aeVar18 != aeVar2) {
                                ld[] ldVarArr14 = aeVar18.Q;
                                ldVar3 = ldVarArr14[i4];
                                if (aeVar2 == null) {
                                    aeVar2 = aeVar18;
                                }
                                ldVarArr3 = aeVar2.Q;
                                i9 = i4 + 1;
                                ldVar4 = ldVarArr3[i9];
                                ld ldVar26 = ldVar3.f;
                                g60Var4 = ldVar26 == null ? ldVar26.i : null;
                                ld ldVar27 = ldVar4.f;
                                g60Var5 = ldVar27 == null ? ldVar27.i : null;
                                if (aeVar17 != aeVar2) {
                                    ld ldVar28 = aeVar17.Q[i9].f;
                                    g60Var5 = ldVar28 != null ? ldVar28.i : null;
                                }
                                if (aeVar18 == aeVar2) {
                                    ldVar4 = ldVarArr14[i9];
                                }
                                if (g60Var4 != null && g60Var5 != null) {
                                    ysVar2.b(ldVar3.i, g60Var4, ldVar3.e(), 0.5f, g60Var5, ldVar4.i, ldVarArr3[i9].e(), 5);
                                }
                            }
                        }
                    }
                } else {
                    ld ldVar29 = ldVarArr[i4];
                    int i45 = i4 + 1;
                    ld ldVar30 = aeVar17.Q[i45];
                    ld ldVar31 = ldVar29.f;
                    g60 g60Var20 = ldVar31 != null ? ldVar31.i : null;
                    ld ldVar32 = ldVar30.f;
                    g60 g60Var21 = ldVar32 != null ? ldVar32.i : null;
                    ld ldVar33 = aeVar18.Q[i4];
                    if (aeVar19 != null) {
                        ldVar30 = aeVar19.Q[i45];
                    }
                    if (g60Var20 == null || g60Var21 == null) {
                        aeVar2 = aeVar19;
                    } else {
                        float f13 = i2 == 0 ? aeVar20.d0 : aeVar20.e0;
                        int e9 = ldVar33.e();
                        int e10 = ldVar30.e();
                        g60 g60Var22 = ldVar33.i;
                        g60 g60Var23 = ldVar30.i;
                        g60 g60Var24 = g60Var20;
                        aeVar2 = aeVar19;
                        ysVar3.b(g60Var22, g60Var24, e9, f13, g60Var21, g60Var23, e10, 7);
                    }
                }
                ysVar2 = ysVar;
                if (!z2) {
                }
                ld[] ldVarArr142 = aeVar18.Q;
                ldVar3 = ldVarArr142[i4];
                if (aeVar2 == null) {
                }
                ldVarArr3 = aeVar2.Q;
                i9 = i4 + 1;
                ldVar4 = ldVarArr3[i9];
                ld ldVar262 = ldVar3.f;
                if (ldVar262 == null) {
                }
                ld ldVar272 = ldVar4.f;
                if (ldVar272 == null) {
                }
                if (aeVar17 != aeVar2) {
                }
                if (aeVar18 == aeVar2) {
                }
                if (g60Var4 != null) {
                    ysVar2.b(ldVar3.i, g60Var4, ldVar3.e(), 0.5f, g60Var5, ldVar4.i, ldVarArr3[i9].e(), 5);
                }
            } else {
                i6 = i16;
            }
            i17 = i5 + 1;
            beVar2 = beVar;
            ysVar3 = ysVar;
            arrayList3 = arrayList;
            i16 = i6;
        }
    }

    public static void f(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean g(ae aeVar) {
        int[] iArr = aeVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ae aeVar2 = aeVar.T;
        be beVar = aeVar2 != null ? (be) aeVar2 : null;
        if (beVar != null) {
            int i4 = beVar.p0[0];
        }
        if (beVar != null) {
            int i5 = beVar.p0[1];
        }
        boolean z = i2 == 1 || aeVar.A() || i2 == 2 || (i2 == 3 && aeVar.r == 0 && aeVar.W == 0.0f && aeVar.t(0)) || (i2 == 3 && aeVar.r == 1 && aeVar.u(0, aeVar.q()));
        boolean z2 = i3 == 1 || aeVar.B() || i3 == 2 || (i3 == 3 && aeVar.s == 0 && aeVar.W == 0.0f && aeVar.t(1)) || (i3 == 3 && aeVar.s == 1 && aeVar.u(1, aeVar.k()));
        return (aeVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static byte[] h(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static float[] i(float[] fArr, int i2) {
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

    public static la0 j(int i2) {
        return i2 != 0 ? i2 != 1 ? new v30() : new pf() : new v30();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vz[] k(String str) {
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
                                fArr = i(fArr2, i6);
                                i3 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException(f60.f("error in parsing \"", trim, "\""), e2);
                            }
                        }
                        arrayList.add(new vz(trim.charAt(i3), fArr));
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
            arrayList.add(new vz(str.charAt(i4), new float[0]));
        }
        return (vz[]) arrayList.toArray(new vz[i2]);
    }

    public static int l(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static Drawable m(Context context, int i2) {
        return h30.b().c(context, i2);
    }

    public static Intent n(m3 m3Var) {
        Intent parentActivityIntent = m3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String p = p(m3Var, m3Var.getComponentName());
            if (p == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(m3Var, p);
            try {
                return p(m3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + p + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent o(m3 m3Var, ComponentName componentName) {
        String p = p(m3Var, componentName);
        if (p == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), p);
        return p(m3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String p(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void t(ye yeVar, Throwable th) {
        try {
            r2 r2Var = (r2) yeVar.h(ej.j);
            if (r2Var != null) {
                r2Var.q(th);
            } else {
                kr.F(yeVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                la0.f(runtimeException, th);
                th = runtimeException;
            }
            kr.F(yeVar, th);
        }
    }

    public static void u(int i2, qd qdVar, ae aeVar, boolean z) {
        ld ldVar;
        ld ldVar2;
        boolean z2;
        ld ldVar3;
        ld ldVar4;
        if (aeVar.m) {
            return;
        }
        if (!(aeVar instanceof be) && aeVar.z() && g(aeVar)) {
            be.V(aeVar, qdVar, new i8());
        }
        ld i3 = aeVar.i(2);
        ld i4 = aeVar.i(4);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ld ldVar5 = (ld) it.next();
                ae aeVar2 = ldVar5.d;
                int i5 = i2 + 1;
                boolean g2 = g(aeVar2);
                ld ldVar6 = aeVar2.I;
                ld ldVar7 = aeVar2.K;
                if (aeVar2.z() && g2) {
                    z2 = true;
                    be.V(aeVar2, qdVar, new i8());
                } else {
                    z2 = true;
                }
                boolean z3 = ((ldVar5 == ldVar6 && (ldVar4 = ldVar7.f) != null && ldVar4.c) || (ldVar5 == ldVar7 && (ldVar3 = ldVar6.f) != null && ldVar3.c)) ? z2 : false;
                int i6 = aeVar2.p0[0];
                if (i6 != 3 || g2) {
                    if (!aeVar2.z()) {
                        if (ldVar5 == ldVar6 && ldVar7.f == null) {
                            int e2 = ldVar6.e() + d2;
                            aeVar2.J(e2, aeVar2.q() + e2);
                            u(i5, qdVar, aeVar2, z);
                        } else if (ldVar5 == ldVar7 && ldVar6.f == null) {
                            int e3 = d2 - ldVar7.e();
                            aeVar2.J(e3 - aeVar2.q(), e3);
                            u(i5, qdVar, aeVar2, z);
                        } else if (z3 && !aeVar2.x()) {
                            K(i5, qdVar, aeVar2, z);
                        }
                    }
                } else if (i6 == 3 && aeVar2.v >= 0 && aeVar2.u >= 0 && (aeVar2.g0 == 8 || (aeVar2.r == 0 && aeVar2.W == 0.0f))) {
                    if (!aeVar2.x() && !aeVar2.F && z3 && !aeVar2.x()) {
                        L(i5, aeVar, qdVar, aeVar2, z);
                    }
                }
            }
        }
        if (aeVar instanceof yo) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ld ldVar8 = (ld) it2.next();
                ae aeVar3 = ldVar8.d;
                int i7 = i2 + 1;
                boolean g3 = g(aeVar3);
                ld ldVar9 = aeVar3.I;
                ld ldVar10 = aeVar3.K;
                if (aeVar3.z() && g3) {
                    be.V(aeVar3, qdVar, new i8());
                }
                boolean z4 = (ldVar8 == ldVar9 && (ldVar2 = ldVar10.f) != null && ldVar2.c) || (ldVar8 == ldVar10 && (ldVar = ldVar9.f) != null && ldVar.c);
                int i8 = aeVar3.p0[0];
                if (i8 != 3 || g3) {
                    if (!aeVar3.z()) {
                        if (ldVar8 == ldVar9 && ldVar10.f == null) {
                            int e4 = ldVar9.e() + d3;
                            aeVar3.J(e4, aeVar3.q() + e4);
                            u(i7, qdVar, aeVar3, z);
                        } else if (ldVar8 == ldVar10 && ldVar9.f == null) {
                            int e5 = d3 - ldVar10.e();
                            aeVar3.J(e5 - aeVar3.q(), e5);
                            u(i7, qdVar, aeVar3, z);
                        } else if (z4 && !aeVar3.x()) {
                            K(i7, qdVar, aeVar3, z);
                        }
                    }
                } else if (i8 == 3 && aeVar3.v >= 0 && aeVar3.u >= 0) {
                    if (aeVar3.g0 == 8 || (aeVar3.r == 0 && aeVar3.W == 0.0f)) {
                        if (!aeVar3.x() && !aeVar3.F && z4 && !aeVar3.x()) {
                            L(i7, aeVar, qdVar, aeVar3, z);
                        }
                    }
                }
            }
        }
        aeVar.m = true;
    }

    public static le v(le leVar) {
        leVar.getClass();
        x70 x70Var = leVar instanceof x70 ? (x70) leVar : null;
        if (x70Var == null || (leVar = x70Var.h) != null) {
            return leVar;
        }
        ye yeVar = x70Var.g;
        yeVar.getClass();
        bf bfVar = (bf) yeVar.h(ej.h);
        le yhVar = bfVar != null ? new yh(bfVar, x70Var) : x70Var;
        x70Var.h = yhVar;
        return yhVar;
    }

    public static boolean x(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean y() {
        if (Build.VERSION.SDK_INT >= 29) {
            return u90.a();
        }
        try {
            if (i == null) {
                h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) i.invoke(null, Long.valueOf(h))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u60 z(tb tbVar, ye yeVar, ho hoVar) {
        ye g2;
        ye yeVar2 = tbVar.f;
        Boolean bool = Boolean.FALSE;
        int i2 = 4;
        boolean booleanValue = ((Boolean) yeVar2.f(bool, new hc(i2))).booleanValue();
        boolean booleanValue2 = ((Boolean) yeVar.f(bool, new hc(i2))).booleanValue();
        int i3 = 3;
        int i4 = 2;
        if (booleanValue || booleanValue2) {
            hc hcVar = new hc(i4);
            gk gkVar = gk.f;
            ye yeVar3 = (ye) yeVar2.f(gkVar, hcVar);
            Object obj = yeVar;
            if (booleanValue2) {
                obj = yeVar.f(gkVar, new hc(i3));
            }
            g2 = yeVar3.g((ye) obj);
        } else {
            g2 = yeVar2.g(yeVar);
        }
        og ogVar = zh.a;
        if (g2 != ogVar && g2.h(ej.h) == null) {
            g2 = g2.g(ogVar);
        }
        u60 u60Var = new u60(g2, true);
        ej ejVar = ej.q;
        int ordinal = kf.f.ordinal();
        if (ordinal == 0) {
            try {
                la0.Z(v(((x70) hoVar).h(u60Var)));
                return u60Var;
            } finally {
                u60Var.e(new q30(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                v(((x70) hoVar).h(u60Var)).e(ejVar);
            } else {
                if (ordinal != 3) {
                    throw new lc();
                }
                try {
                    ye yeVar4 = u60Var.h;
                    Object V = b9.V(yeVar4, null);
                    try {
                        la0.g((x70) hoVar);
                        Object f2 = hoVar.f(u60Var, u60Var);
                        if (f2 != hf.f) {
                            u60Var.e(f2);
                            return u60Var;
                        }
                    } finally {
                        b9.O(yeVar4, V);
                    }
                } catch (Throwable th) {
                    return u60Var;
                }
            }
        }
        return u60Var;
    }

    public abstract void G(boolean z);

    public abstract void H(boolean z);

    public abstract int q(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int r();

    public abstract ViewPropertyAnimator s(View view, int i2);

    public abstract boolean w();

    @Override // defpackage.yc0
    public void b() {
    }

    @Override // defpackage.yc0
    public void c() {
    }
}
