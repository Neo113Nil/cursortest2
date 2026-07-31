package m;

import a0.e0;
import a0.g1;
import a0.y;
import a7.q;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b6.c0;
import b6.c2;
import b6.j0;
import b6.r1;
import com.snovikpovik.vuevnxsj.R;
import d6.a0;
import d6.k;
import f7.f;
import g6.c;
import g6.e;
import g6.h;
import j0.j1;
import j0.l;
import j0.o0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import l.j2;
import l.l2;
import l1.b0;
import m0.d1;
import m0.s;
import m0.t1;
import m0.t2;
import m0.v0;
import m0.v1;
import m0.z0;
import n0.l0;
import o.n0;
import o.u0;
import o4.o;
import o4.r;
import o4.t;
import o4.x;
import o4.z;
import p4.m;
import q.m0;
import q3.k0;
import q6.d;
import q6.i;
import q6.v;
import r.m1;
import r.o1;
import r.s0;
import r2.n;
import r2.p;
import r4.g;
import v0.j;
import x1.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4869b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Method f4870c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f4871d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4872a;

    public a(int i) {
        switch (i) {
            case 1:
                this.f4872a = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f4872a = new a(1);
                break;
        }
    }

    public static final Class A(w6.b bVar) {
        i.e(bVar, "<this>");
        Class a8 = ((d) bVar).a();
        i.c(a8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class B(w6.b bVar) {
        i.e(bVar, "<this>");
        Class a8 = ((d) bVar).a();
        if (a8.isPrimitive()) {
            String name = a8.getName();
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
        return a8;
    }

    public static String C(Class cls) {
        LinkedHashMap linkedHashMap = z.f5705b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            x xVar = (x) cls.getAnnotation(x.class);
            str = xVar != null ? xVar.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        i.b(str);
        return str;
    }

    public static File D(Context context) {
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

    public static final int E(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int F(int i, int i8) {
        return (i >> i8) & 31;
    }

    public static c G(c cVar) {
        i.e(cVar, "<this>");
        i6.c cVar2 = cVar instanceof i6.c ? (i6.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.f3461f) != null) {
            return cVar;
        }
        e eVar = (e) cVar2.f().l(g6.d.f3045d);
        c fVar = eVar != null ? new f((q) eVar, cVar2) : cVar2;
        cVar2.f3461f = fVar;
        return fVar;
    }

    public static MappedByteBuffer H(Context context, Uri uri) {
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

    public static final void I(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            t1.a.a("At least one point must be provided");
        }
        int i8 = 2 >= i ? i - 1 : 2;
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i];
        }
        for (int i11 = 0; i11 < i; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9][];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i];
        }
        float[][] fArr6 = new float[i9][];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        int i15 = 0;
        while (i15 < i9) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            i.e(fArr8, "<this>");
            i.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr9 = fArr5[i16];
                float r7 = r(fArr7, fArr9);
                for (int i17 = 0; i17 < i; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr9[i17] * r7);
                }
            }
            float sqrt = (float) Math.sqrt(r(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f6 = 1.0f / sqrt;
            for (int i18 = 0; i18 < i; i18++) {
                fArr7[i18] = fArr7[i18] * f6;
            }
            float[] fArr10 = fArr6[i15];
            int i19 = 0;
            while (i19 < i9) {
                fArr10[i19] = i19 < i15 ? 0.0f : r(fArr7, fArr4[i19]);
                i19++;
            }
            i15++;
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float r8 = r(fArr5[i20], fArr2);
            float[] fArr11 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    r8 -= fArr11[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = r8 / fArr11[i20];
        }
    }

    public static final float J(long j7, float f6, r2.c cVar) {
        float c8;
        long b8 = n.b(j7);
        if (p.a(b8, 4294967296L)) {
            if (cVar.i() <= 1.05d) {
                return cVar.R(j7);
            }
            c8 = n.c(j7) / n.c(cVar.V(f6));
        } else {
            if (!p.a(b8, 8589934592L)) {
                return Float.NaN;
            }
            c8 = n.c(j7);
        }
        return c8 * f6;
    }

    public static final long K(long j7) {
        return (Math.round(Float.intBitsToFloat((int) (j7 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j7 >> 32))) << 32);
    }

    public static final void L(Spannable spannable, long j7, int i, int i8) {
        if (j7 != 16) {
            spannable.setSpan(new ForegroundColorSpan(f1.p.u(j7)), i, i8, 33);
        }
    }

    public static final void M(Spannable spannable, long j7, r2.c cVar, int i, int i8) {
        long b8 = n.b(j7);
        if (p.a(b8, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(s6.a.B(cVar.R(j7)), false), i, i8, 33);
        } else if (p.a(b8, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n.c(j7)), i, i8, 33);
        }
    }

    public static final void N(Spannable spannable, m2.b bVar, int i, int i8) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(d6.n.M(bVar, 10));
            Iterator it = bVar.f5218d.iterator();
            while (it.hasNext()) {
                arrayList.add(((m2.a) it.next()).f5216a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i8, 33);
        }
    }

    public static final void O(l0 l0Var, int i, Object obj) {
        l0Var.f5283f[(l0Var.f5284g - l0Var.f5279b[l0Var.f5280c - 1].f5276b) + i] = obj;
    }

    public static final void P(l0 l0Var, int i, Object obj, int i8, Object obj2) {
        int i9 = l0Var.f5284g - l0Var.f5279b[l0Var.f5280c - 1].f5276b;
        Object[] objArr = l0Var.f5283f;
        objArr[i + i9] = obj;
        objArr[i9 + i8] = obj2;
    }

    public static void Q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j2.a(view, charSequence);
            return;
        }
        l2 l2Var = l2.f4326n;
        if (l2Var != null && l2Var.f4328d == view) {
            l2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l2(view, charSequence);
            return;
        }
        l2 l2Var2 = l2.f4327o;
        if (l2Var2 != null && l2Var2.f4328d == view) {
            l2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final long R(long j7) {
        return (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32);
    }

    public static Object S(p6.e eVar, Object obj, c cVar) {
        i.e(eVar, "<this>");
        h f6 = cVar.f();
        Object dVar = f6 == g6.i.f3046d ? new h6.d(cVar) : new h6.e(cVar, f6);
        v.c(2, eVar);
        return eVar.g(obj, dVar);
    }

    public static final void a(p4.p pVar, s sVar, int i) {
        p4.p pVar2;
        sVar.W(294589392);
        if ((((sVar.h(pVar) ? 4 : 2) | i) & 3) == 2 && sVar.z()) {
            sVar.Q();
            pVar2 = pVar;
        } else {
            v0.d d8 = j.d(sVar);
            z0 k3 = m0.b.k(pVar.b().f5635e, sVar);
            List list = (List) k3.getValue();
            boolean booleanValue = ((Boolean) sVar.j(l1.f8495a)).booleanValue();
            boolean f6 = sVar.f(list);
            Object K = sVar.K();
            Object obj = m0.n.f5019a;
            Object obj2 = K;
            if (f6 || K == obj) {
                w0.p pVar3 = new w0.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    o4.d dVar = (o4.d) obj3;
                    if (booleanValue || dVar.f5626k.f6571j.f871c.compareTo(androidx.lifecycle.p.f850g) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                pVar3.addAll(arrayList);
                sVar.f0(pVar3);
                obj2 = pVar3;
            }
            w0.p pVar4 = (w0.p) obj2;
            f(pVar4, (List) k3.getValue(), sVar, 0);
            z0 k7 = m0.b.k(pVar.b().f5636f, sVar);
            Object K2 = sVar.K();
            if (K2 == obj) {
                K2 = new w0.p();
                sVar.f0(K2);
            }
            w0.p pVar5 = (w0.p) K2;
            sVar.V(-367418626);
            ListIterator listIterator = pVar4.listIterator();
            while (true) {
                e6.a aVar = (e6.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                o4.d dVar2 = (o4.d) aVar.next();
                o oVar = dVar2.f5621e;
                i.c(oVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                p4.o oVar2 = (p4.o) oVar;
                boolean h8 = sVar.h(pVar) | sVar.h(dVar2);
                Object K3 = sVar.K();
                if (h8 || K3 == obj) {
                    K3 = new a0.z0(6, pVar, dVar2);
                    sVar.f0(K3);
                }
                w0.p pVar6 = pVar5;
                p4.p pVar7 = pVar;
                r2.o.b((p6.a) K3, oVar2.i, u0.h.d(1129586364, new m(dVar2, pVar7, d8, pVar6, oVar2), sVar), sVar, 384);
                pVar = pVar7;
                pVar5 = pVar6;
            }
            pVar2 = pVar;
            w0.p pVar8 = pVar5;
            sVar.p(false);
            Set set = (Set) k7.getValue();
            boolean f8 = sVar.f(k7) | sVar.h(pVar2);
            Object K4 = sVar.K();
            if (f8 || K4 == obj) {
                K4 = new p4.n(k7, pVar2, pVar8, null);
                sVar.f0(K4);
            }
            m0.b.e(set, pVar8, (p6.e) K4, sVar);
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new j0(i, 6, pVar2);
        }
    }

    public static final void b(Boolean bool, Object obj, u uVar, p6.c cVar, s sVar, int i) {
        int i8;
        sVar.W(696924721);
        if ((i & 6) == 0) {
            i8 = (sVar.h(bool) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i8 & 1, (i8 & 1171) != 1170)) {
            sVar.S();
            if ((i & 1) == 0 || sVar.x()) {
                uVar = (u) sVar.j(j4.e.f4019a);
            } else {
                sVar.Q();
            }
            int i9 = i8 & (-897);
            sVar.q();
            boolean f6 = sVar.f(bool) | sVar.f(obj) | sVar.f(uVar);
            Object K = sVar.K();
            if (f6 || K == m0.n.f5019a) {
                K = new j4.d(uVar.g());
                sVar.f0(K);
            }
            c(uVar, (j4.d) K, cVar, sVar, (i9 >> 3) & 896);
        } else {
            sVar.Q();
        }
        u uVar2 = uVar;
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new r1(bool, obj, uVar2, cVar, i);
        }
    }

    public static final void c(u uVar, j4.d dVar, p6.c cVar, s sVar, int i) {
        int i8;
        sVar.W(228371534);
        if ((i & 6) == 0) {
            i8 = (sVar.h(uVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            boolean h8 = sVar.h(dVar) | ((i8 & 896) == 256) | sVar.h(uVar);
            Object K = sVar.K();
            if (h8 || K == m0.n.f5019a) {
                K = new c0(uVar, dVar, cVar, 3);
                sVar.f0(K);
            }
            m0.b.c(uVar, dVar, (p6.c) K, sVar);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new y(uVar, dVar, cVar, i, 4);
        }
    }

    public static final void d(final t tVar, final String str, final y0.m mVar, y0.e eVar, p6.c cVar, p6.c cVar2, p6.c cVar3, p6.c cVar4, final p6.c cVar5, s sVar, final int i) {
        y0.e eVar2;
        p6.c cVar6;
        int i8;
        p6.c cVar7;
        p6.c cVar8;
        char c8;
        p6.c cVar9;
        final p6.c cVar10;
        final p6.c cVar11;
        final p6.c cVar12;
        final p6.c cVar13;
        final y0.e eVar3;
        sVar.W(1840250294);
        int i9 = i | (sVar.h(tVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(mVar) ? 256 : 128) | 844852224;
        char c9 = sVar.h(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i9) == 306783378 && (c9 & 3) == 2 && sVar.z()) {
            sVar.Q();
            eVar3 = eVar;
            cVar13 = cVar;
            cVar12 = cVar2;
            cVar11 = cVar3;
            cVar10 = cVar4;
        } else {
            sVar.S();
            int i10 = i & 1;
            v0 v0Var = m0.n.f5019a;
            if (i10 == 0 || sVar.x()) {
                eVar2 = y0.b.f8681d;
                Object K = sVar.K();
                if (K == v0Var) {
                    K = new l(13);
                    sVar.f0(K);
                }
                p6.c cVar14 = (p6.c) K;
                Object K2 = sVar.K();
                if (K2 == v0Var) {
                    K2 = new l(15);
                    sVar.f0(K2);
                }
                cVar6 = (p6.c) K2;
                i8 = i9 & (-264241153);
                cVar7 = cVar14;
                cVar8 = cVar6;
                c8 = c9;
                cVar9 = cVar7;
            } else {
                sVar.Q();
                i8 = i9 & (-264241153);
                eVar2 = eVar;
                cVar7 = cVar;
                cVar6 = cVar2;
                cVar8 = cVar4;
                c8 = c9;
                cVar9 = cVar3;
            }
            sVar.q();
            boolean z3 = ((i8 & 112) == 32) | ((c8 & 14) == 4);
            Object K3 = sVar.K();
            if (z3 || K3 == v0Var) {
                r rVar = new r(tVar.f5685b.f6601s, str);
                cVar5.i(rVar);
                K3 = rVar.c();
                sVar.f0(K3);
            }
            y0.e eVar4 = eVar2;
            p6.c cVar15 = cVar6;
            e(tVar, (o4.q) K3, mVar, eVar4, cVar7, cVar15, cVar9, cVar8, sVar, (i8 & 8078) | 100884480);
            cVar10 = cVar8;
            cVar11 = cVar9;
            cVar12 = cVar15;
            cVar13 = cVar7;
            eVar3 = eVar4;
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(str, mVar, eVar3, cVar13, cVar12, cVar11, cVar10, cVar5, i) { // from class: p4.r

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f5769e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ y0.m f5770f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ y0.e f5771g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ p6.c f5772h;
                public final /* synthetic */ p6.c i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ p6.c f5773j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ p6.c f5774k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ p6.c f5775l;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(1);
                    m.a.d(o4.t.this, this.f5769e, this.f5770f, this.f5771g, this.f5772h, this.i, this.f5773j, this.f5774k, this.f5775l, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0520 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x03e5  */
    /* JADX WARN: Type inference failed for: r12v3, types: [m0.s] */
    /* JADX WARN: Type inference failed for: r14v30, types: [o4.o, o4.q] */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [g6.c] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r23v2, types: [g6.c] */
    /* JADX WARN: Type inference failed for: r23v4, types: [g6.c] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, r.l1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final t tVar, final o4.q qVar, final y0.m mVar, final y0.e eVar, final p6.c cVar, final p6.c cVar2, final p6.c cVar3, final p6.c cVar4, s sVar, final int i) {
        z zVar;
        int i8;
        u uVar;
        Object v1Var;
        z0 z0Var;
        d1 d1Var;
        final z0 z0Var2;
        z zVar2;
        int i9;
        p4.p pVar;
        z zVar3;
        final p4.i iVar;
        boolean z3;
        o4.d dVar;
        o.c0 c0Var;
        p6.c cVar5;
        z0 z0Var3;
        t2 t2Var;
        int i10;
        ?? r15;
        s0 s0Var;
        r.l1 l1Var;
        o4.d dVar2;
        boolean z7;
        p4.p pVar2;
        Object o0Var;
        ?? r152;
        p4.i iVar2;
        z0 z0Var4;
        Object obj;
        p4.p pVar3;
        int[] intArray;
        Bundle bundle;
        int[] iArr;
        o4.n e8;
        int[] iArr2;
        ArrayList arrayList;
        int length;
        int i11;
        String str;
        o j7;
        o4.q qVar2;
        Bundle bundle2;
        o j8;
        o4.q qVar3;
        int i12;
        s sVar2;
        sVar.W(-1964664536);
        int i13 = (i & 6) == 0 ? (sVar.h(tVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i13 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i13 |= sVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i13 |= sVar.f(eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i13 |= sVar.h(cVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i13 |= sVar.h(cVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i13 |= sVar.h(cVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i13 |= sVar.h(cVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i13 |= sVar.h(null) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if ((38347923 & i14) == 38347922 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
        } else {
            sVar.S();
            if ((i & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            u uVar2 = (u) sVar.j(j4.e.f4019a);
            x0 a8 = m4.a.a(sVar);
            if (a8 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            w0 f6 = a8.f();
            tVar.getClass();
            g gVar = tVar.f5685b;
            i.e(f6, "viewModelStore");
            gVar.getClass();
            z zVar4 = gVar.f6601s;
            if (!i.a(gVar.f6597o, z(f6))) {
                if (!gVar.f6589f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                gVar.f6597o = z(f6);
            }
            i.e(qVar, "graph");
            LinkedHashMap linkedHashMap = gVar.f6602t;
            h4.j jVar = qVar.i;
            k kVar = gVar.f6589f;
            if (!kVar.isEmpty() && gVar.h() == androidx.lifecycle.p.f847d) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (i.a(gVar.f6586c, qVar)) {
                zVar = zVar4;
                i8 = i14;
                uVar = uVar2;
                int f8 = ((u0) jVar.f3191d).f();
                for (int i15 = 0; i15 < f8; i15++) {
                    o oVar = (o) ((u0) jVar.f3191d).g(i15);
                    o4.q qVar4 = gVar.f6586c;
                    i.b(qVar4);
                    int d8 = ((u0) qVar4.i.f3191d).d(i15);
                    o4.q qVar5 = gVar.f6586c;
                    i.b(qVar5);
                    u0 u0Var = (u0) qVar5.i.f3191d;
                    if (u0Var.f5547d) {
                        o.r.a(u0Var);
                    }
                    int a9 = p.a.a(u0Var.f5550g, d8, u0Var.f5548e);
                    if (a9 >= 0) {
                        Object[] objArr = u0Var.f5549f;
                        Object obj2 = objArr[a9];
                        objArr[a9] = oVar;
                    }
                }
                Iterator it = kVar.iterator();
                while (it.hasNext()) {
                    o4.d dVar3 = (o4.d) it.next();
                    int i16 = o.f5669h;
                    a0 a0Var = new a0(x6.g.c0(h0.a.G(dVar3.f5621e)));
                    o oVar2 = gVar.f6586c;
                    i.b(oVar2);
                    Iterator it2 = a0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((d6.z) it2).f2330e;
                        if (listIterator.hasPrevious()) {
                            o oVar3 = (o) listIterator.previous();
                            if (i.a(oVar3, gVar.f6586c) && i.a(oVar2, qVar)) {
                            }
                            if (oVar2 instanceof o4.q) {
                                oVar2 = ((o4.q) oVar2).i.j(oVar3.f5671e.f4348a);
                                i.b(oVar2);
                            }
                        }
                    }
                    i.e(oVar2, "<set-?>");
                    dVar3.f5621e = oVar2;
                }
            } else {
                o4.q qVar6 = gVar.f6586c;
                if (qVar6 != null) {
                    ArrayList arrayList2 = new ArrayList(gVar.f6594l.keySet());
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList2.get(i17);
                        int i18 = i17 + 1;
                        Integer num = (Integer) obj3;
                        i.b(num);
                        ArrayList arrayList3 = arrayList2;
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((o4.g) it3.next()).f5634d = true;
                            i18 = i18;
                        }
                        int i19 = i18;
                        o0 o0Var2 = new o0();
                        o0Var2.f3809a = -1;
                        o0Var2.f3810b = -1;
                        boolean q4 = gVar.q(intValue, null, new o4.v(false, true, -1, false, false, o0Var2.f3809a, o0Var2.f3810b));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((o4.g) it4.next()).f5634d = false;
                            it4 = it4;
                            q4 = q4;
                        }
                        if (q4) {
                            gVar.m(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        i17 = i19;
                    }
                    gVar.m(qVar6.f5671e.f4348a, true, false);
                }
                gVar.f6586c = qVar;
                z zVar5 = gVar.f6601s;
                t tVar2 = gVar.f6584a;
                d4.p pVar4 = tVar2.f5686c;
                Bundle bundle3 = gVar.f6587d;
                if (bundle3 != null && bundle3.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        r2.r.F("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        String str2 = stringArrayList.get(i20);
                        i20++;
                        ArrayList<String> arrayList4 = stringArrayList;
                        String str3 = str2;
                        zVar5.b(str3);
                        if (bundle3.containsKey(str3)) {
                            r2.o.M(str3, bundle3);
                        }
                        stringArrayList = arrayList4;
                    }
                }
                Bundle[] bundleArr = gVar.f6588e;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i21 = 0;
                    while (i21 < length2) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle4 = bundleArr2[i21];
                        int i22 = length2;
                        i.e(bundle4, "state");
                        bundle4.setClassLoader(o4.e.class.getClassLoader());
                        String string = bundle4.getString("nav-entry-state:id");
                        if (string == null) {
                            r2.r.F("nav-entry-state:id");
                            throw null;
                        }
                        int i23 = i21;
                        int i24 = bundle4.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
                        if (i24 == Integer.MIN_VALUE) {
                            i12 = i14;
                            if (bundle4.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
                                r2.r.F("nav-entry-state:destination-id");
                                throw null;
                            }
                        } else {
                            i12 = i14;
                        }
                        Bundle M = r2.o.M("nav-entry-state:args", bundle4);
                        Bundle M2 = r2.o.M("nav-entry-state:saved-state", bundle4);
                        o c8 = gVar.c(i24, null);
                        if (c8 == null) {
                            int i25 = o.f5669h;
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + h0.a.C(pVar4, i24) + " cannot be found from the current destination " + gVar.f());
                        }
                        androidx.lifecycle.p h8 = gVar.h();
                        o4.h hVar = gVar.f6597o;
                        i.e(pVar4, "context");
                        i.e(h8, "hostLifecycleState");
                        Context context = pVar4.f2282a;
                        M.setClassLoader(context != null ? context.getClassLoader() : null);
                        o4.d dVar4 = new o4.d(pVar4, c8, M, h8, hVar, string, M2);
                        o4.y b8 = zVar5.b(c8.f5670d);
                        Object obj4 = linkedHashMap.get(b8);
                        if (obj4 == null) {
                            obj4 = new o4.g(tVar2, b8);
                            linkedHashMap.put(b8, obj4);
                        }
                        kVar.addLast(dVar4);
                        ((o4.g) obj4).a(dVar4);
                        o4.q qVar7 = dVar4.f5621e.f5672f;
                        if (qVar7 != null) {
                            gVar.j(dVar4, gVar.e(qVar7.f5671e.f4348a));
                        }
                        i21 = i23 + 1;
                        bundleArr = bundleArr2;
                        length2 = i22;
                        i14 = i12;
                    }
                    i8 = i14;
                    gVar.f6585b.b();
                    gVar.f6588e = null;
                } else {
                    i8 = i14;
                }
                Collection values = d6.y.G(zVar5.f5706a).values();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((o4.y) obj5).f5704b) {
                        arrayList5.add(obj5);
                    }
                }
                int size3 = arrayList5.size();
                int i26 = 0;
                while (i26 < size3) {
                    Object obj6 = arrayList5.get(i26);
                    i26++;
                    o4.y yVar = (o4.y) obj6;
                    Object obj7 = linkedHashMap.get(yVar);
                    if (obj7 == null) {
                        i.e(yVar, "navigator");
                        obj7 = new o4.g(tVar2, yVar);
                        linkedHashMap.put(yVar, obj7);
                    }
                    yVar.getClass();
                    yVar.f5703a = (o4.g) obj7;
                    yVar.f5704b = true;
                }
                if (gVar.f6586c == null || !kVar.isEmpty()) {
                    zVar = zVar4;
                    uVar = uVar2;
                    gVar.b();
                } else {
                    Activity activity = tVar2.f5687d;
                    if (!tVar2.f5688e && activity != null) {
                        Intent intent = activity.getIntent();
                        g gVar2 = tVar2.f5685b;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e9) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e9);
                                }
                                ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                                Bundle j9 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                                bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                                if (bundle != null) {
                                    j9.putAll(bundle);
                                }
                                if (intArray != null || intArray.length == 0) {
                                    ?? i27 = gVar2.i();
                                    iArr = intArray;
                                    uVar = uVar2;
                                    zVar = zVar4;
                                    e8 = i27.e(new g1(intent.getData(), intent.getAction(), intent.getType(), 8), i27);
                                    if (e8 != null) {
                                        o oVar4 = e8.f5664d;
                                        k kVar2 = new k();
                                        o oVar5 = oVar4;
                                        while (true) {
                                            l.n nVar = oVar5.f5671e;
                                            o4.q qVar8 = oVar5.f5672f;
                                            if (qVar8 == null || qVar8.i.f3189b != nVar.f4348a) {
                                                kVar2.addFirst(oVar5);
                                            }
                                            if (!i.a(qVar8, null) && qVar8 != null) {
                                                oVar5 = qVar8;
                                            }
                                        }
                                        List g02 = d6.m.g0(kVar2);
                                        ArrayList arrayList6 = new ArrayList(d6.n.M(g02, 10));
                                        Iterator it5 = g02.iterator();
                                        while (it5.hasNext()) {
                                            arrayList6.add(Integer.valueOf(((o) it5.next()).f5671e.f4348a));
                                        }
                                        int[] iArr3 = new int[arrayList6.size()];
                                        int size4 = arrayList6.size();
                                        int i28 = 0;
                                        int i29 = 0;
                                        while (i29 < size4) {
                                            Object obj8 = arrayList6.get(i29);
                                            i29++;
                                            iArr3[i28] = ((Number) obj8).intValue();
                                            i28++;
                                        }
                                        Bundle a10 = oVar4.a(e8.f5665e);
                                        if (a10 != null) {
                                            j9.putAll(a10);
                                        }
                                        iArr2 = iArr3;
                                        arrayList = null;
                                        if (iArr2 != null && iArr2.length != 0) {
                                            gVar2.getClass();
                                            o4.q qVar9 = gVar2.f6586c;
                                            length = iArr2.length;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < length) {
                                                    str = null;
                                                    break;
                                                }
                                                int i30 = iArr2[i11];
                                                if (i11 == 0) {
                                                    o4.q qVar10 = gVar2.f6586c;
                                                    i.b(qVar10);
                                                    j8 = qVar10.f5671e.f4348a == i30 ? gVar2.f6586c : null;
                                                } else {
                                                    i.b(qVar9);
                                                    j8 = qVar9.i.j(i30);
                                                }
                                                if (j8 == null) {
                                                    int i31 = o.f5669h;
                                                    str = h0.a.C(gVar2.f6584a.f5686c, i30);
                                                    break;
                                                }
                                                if (i11 != iArr2.length - 1 && (j8 instanceof o4.q)) {
                                                    while (true) {
                                                        qVar3 = (o4.q) j8;
                                                        i.b(qVar3);
                                                        h4.j jVar2 = qVar3.i;
                                                        if (!(jVar2.j(jVar2.f3189b) instanceof o4.q)) {
                                                            break;
                                                        } else {
                                                            j8 = jVar2.j(jVar2.f3189b);
                                                        }
                                                    }
                                                    qVar9 = qVar3;
                                                }
                                                i11++;
                                            }
                                            if (str == null) {
                                                String str4 = "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent;
                                                i.e(str4, "message");
                                                Log.i("NavController", str4);
                                            } else {
                                                j9.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                                int length3 = iArr2.length;
                                                Bundle[] bundleArr3 = new Bundle[length3];
                                                for (int i32 = 0; i32 < length3; i32++) {
                                                    Bundle j10 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                                                    j10.putAll(j9);
                                                    if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i32)) != null) {
                                                        j10.putAll(bundle2);
                                                    }
                                                    bundleArr3[i32] = j10;
                                                }
                                                int flags = intent.getFlags();
                                                int i33 = 268435456 & flags;
                                                if (i33 != 0 && (flags & 32768) == 0) {
                                                    intent.addFlags(32768);
                                                    Context context2 = tVar2.f5684a;
                                                    ArrayList arrayList7 = new ArrayList();
                                                    ComponentName component = intent.getComponent();
                                                    if (component == null) {
                                                        component = intent.resolveActivity(context2.getPackageManager());
                                                    }
                                                    if (component != null) {
                                                        int size5 = arrayList7.size();
                                                        try {
                                                            for (Intent l3 = a.a.l(context2, component); l3 != null; l3 = a.a.l(context2, l3.getComponent())) {
                                                                arrayList7.add(size5, l3);
                                                            }
                                                        } catch (PackageManager.NameNotFoundException e10) {
                                                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                            throw new IllegalArgumentException(e10);
                                                        }
                                                    }
                                                    arrayList7.add(intent);
                                                    if (arrayList7.isEmpty()) {
                                                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                    }
                                                    Intent[] intentArr = (Intent[]) arrayList7.toArray(new Intent[0]);
                                                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                                    context2.startActivities(intentArr, null);
                                                    activity.finish();
                                                    activity.overridePendingTransition(0, 0);
                                                } else if (i33 != 0) {
                                                    if (!gVar2.f6589f.isEmpty()) {
                                                        o4.q qVar11 = gVar2.f6586c;
                                                        i.b(qVar11);
                                                        gVar2.m(qVar11.f5671e.f4348a, true, false);
                                                    }
                                                    int i34 = 0;
                                                    while (i34 < iArr2.length) {
                                                        int i35 = iArr2[i34];
                                                        int i36 = i34 + 1;
                                                        Bundle bundle5 = bundleArr3[i34];
                                                        o c9 = gVar2.c(i35, null);
                                                        if (c9 == null) {
                                                            int i37 = o.f5669h;
                                                            throw new IllegalStateException("Deep Linking failed: destination " + h0.a.C(pVar4, i35) + " cannot be found from the current destination " + gVar2.f());
                                                        }
                                                        gVar2.l(c9, bundle5, h0.a.P(new a0.v0(8, c9, tVar2)));
                                                        i34 = i36;
                                                    }
                                                    tVar2.f5688e = true;
                                                } else {
                                                    o4.q qVar12 = gVar2.f6586c;
                                                    int length4 = iArr2.length;
                                                    for (int i38 = 0; i38 < length4; i38++) {
                                                        int i39 = iArr2[i38];
                                                        Bundle bundle6 = bundleArr3[i38];
                                                        if (i38 == 0) {
                                                            j7 = gVar2.f6586c;
                                                        } else {
                                                            i.b(qVar12);
                                                            j7 = qVar12.i.j(i39);
                                                        }
                                                        if (j7 == null) {
                                                            int i40 = o.f5669h;
                                                            throw new IllegalStateException("Deep Linking failed: destination " + h0.a.C(pVar4, i39) + " cannot be found in graph " + qVar12);
                                                        }
                                                        if (i38 == iArr2.length - 1) {
                                                            o4.q qVar13 = gVar2.f6586c;
                                                            i.b(qVar13);
                                                            gVar2.l(j7, bundle6, new o4.v(false, false, qVar13.f5671e.f4348a, true, false, 0, 0));
                                                        } else if (j7 instanceof o4.q) {
                                                            while (true) {
                                                                qVar2 = (o4.q) j7;
                                                                i.b(qVar2);
                                                                h4.j jVar3 = qVar2.i;
                                                                if (!(jVar3.j(jVar3.f3189b) instanceof o4.q)) {
                                                                    break;
                                                                } else {
                                                                    j7 = jVar3.j(jVar3.f3189b);
                                                                }
                                                            }
                                                            qVar12 = qVar2;
                                                        }
                                                    }
                                                    tVar2.f5688e = true;
                                                }
                                            }
                                        }
                                        o4.q qVar14 = gVar.f6586c;
                                        i.b(qVar14);
                                        gVar.l(qVar14, null, null);
                                    }
                                } else {
                                    iArr = intArray;
                                    zVar = zVar4;
                                    uVar = uVar2;
                                }
                                arrayList = parcelableArrayList;
                                iArr2 = iArr;
                                if (iArr2 != null) {
                                    gVar2.getClass();
                                    o4.q qVar92 = gVar2.f6586c;
                                    length = iArr2.length;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < length) {
                                        }
                                        i11++;
                                    }
                                    if (str == null) {
                                    }
                                }
                                o4.q qVar142 = gVar.f6586c;
                                i.b(qVar142);
                                gVar.l(qVar142, null, null);
                            }
                            intArray = null;
                            if (extras == null) {
                            }
                            Bundle j92 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                            if (extras == null) {
                            }
                            if (bundle != null) {
                            }
                            if (intArray != null) {
                            }
                            ?? i272 = gVar2.i();
                            iArr = intArray;
                            uVar = uVar2;
                            zVar = zVar4;
                            e8 = i272.e(new g1(intent.getData(), intent.getAction(), intent.getType(), 8), i272);
                            if (e8 != null) {
                            }
                            arrayList = parcelableArrayList;
                            iArr2 = iArr;
                            if (iArr2 != null) {
                            }
                            o4.q qVar1422 = gVar.f6586c;
                            i.b(qVar1422);
                            gVar.l(qVar1422, null, null);
                        }
                    }
                    zVar = zVar4;
                    uVar = uVar2;
                    o4.q qVar14222 = gVar.f6586c;
                    i.b(qVar14222);
                    gVar.l(qVar14222, null, null);
                }
            }
            z zVar6 = zVar;
            o4.y b9 = zVar6.b("composable");
            p4.i iVar3 = b9 instanceof p4.i ? (p4.i) b9 : null;
            if (iVar3 == null) {
                t1 r7 = sVar.r();
                if (r7 != null) {
                    final int i41 = 2;
                    r7.f5121d = new p6.e() { // from class: p4.s
                        @Override // p6.e
                        public final Object g(Object obj9, Object obj10) {
                            switch (i41) {
                                case 0:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj9, m0.b.w(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj9, m0.b.w(i | 1));
                                    break;
                                default:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj9, m0.b.w(i | 1));
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    };
                    return;
                }
                return;
            }
            ?? r12 = sVar;
            z0 k3 = m0.b.k(iVar3.b().f5635e, r12);
            Object K = r12.K();
            Object obj9 = m0.n.f5019a;
            if (K == obj9) {
                K = new d1(0.0f);
                r12.f0(K);
            }
            d1 d1Var2 = (d1) K;
            Object K2 = r12.K();
            if (K2 == obj9) {
                K2 = m0.b.q(Boolean.FALSE);
                r12.f0(K2);
            }
            z0 z0Var5 = (z0) K2;
            boolean z8 = ((List) k3.getValue()).size() > 1;
            boolean f9 = r12.f(k3) | r12.h(iVar3);
            Object K3 = r12.K();
            if (f9 || K3 == obj9) {
                p4.i iVar4 = iVar3;
                v1Var = new v1(iVar4, k3, d1Var2, z0Var5, null, 1);
                z0Var = k3;
                d1Var = d1Var2;
                z0Var2 = z0Var5;
                iVar3 = iVar4;
                r12.f0(v1Var);
            } else {
                v1Var = K3;
                z0Var = k3;
                d1Var = d1Var2;
                z0Var2 = z0Var5;
            }
            g(z8, (p6.e) v1Var, r12, 0);
            u uVar3 = uVar;
            boolean h9 = r12.h(tVar) | r12.h(uVar3);
            Object K4 = r12.K();
            if (h9 || K4 == obj9) {
                K4 = new a0.v0(10, tVar, uVar3);
                r12.f0(K4);
            }
            m0.b.d(uVar3, (p6.c) K4, r12);
            v0.d d9 = j.d(r12);
            z0 k7 = m0.b.k(gVar.i, r12);
            Object K5 = r12.K();
            if (K5 == obj9) {
                K5 = m0.b.n(new j1(k7, 2));
                r12.f0(K5);
            }
            t2 t2Var2 = (t2) K5;
            o4.d dVar5 = (o4.d) d6.m.Y((List) t2Var2.getValue());
            Object K6 = r12.K();
            if (K6 == obj9) {
                int i42 = n0.f5514a;
                K6 = new o.c0(6);
                r12.f0(K6);
            }
            o.c0 c0Var2 = (o.c0) K6;
            if (dVar5 != null) {
                r12.V(-1797250687);
                boolean h10 = r12.h(iVar3) | ((((i8 & 3670016) ^ 1572864) > 1048576 && r12.f(cVar3)) || (i8 & 1572864) == 1048576) | ((i8 & 57344) == 16384);
                Object K7 = r12.K();
                if (h10 || K7 == obj9) {
                    final int i43 = 1;
                    zVar3 = zVar6;
                    iVar = iVar3;
                    z3 = false;
                    dVar = dVar5;
                    c0Var = c0Var2;
                    p6.c cVar6 = new p6.c() { // from class: p4.q
                        @Override // p6.c
                        public final Object i(Object obj10) {
                            int i44 = i43;
                            z0 z0Var6 = z0Var2;
                            p6.c cVar7 = cVar;
                            p6.c cVar8 = cVar3;
                            i iVar5 = iVar;
                            q.p pVar5 = (q.p) obj10;
                            switch (i44) {
                                case 0:
                                    o4.o oVar6 = ((o4.d) pVar5.b()).f5621e;
                                    q6.i.c(oVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) oVar6;
                                    if (((Boolean) iVar5.f5746c.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) {
                                        int i45 = o4.o.f5669h;
                                        for (o4.o oVar7 : h0.a.G(hVar2)) {
                                        }
                                        return (q.n0) cVar8.i(pVar5);
                                    }
                                    int i46 = o4.o.f5669h;
                                    for (o4.o oVar8 : h0.a.G(hVar2)) {
                                    }
                                    return (q.n0) cVar7.i(pVar5);
                                default:
                                    o4.o oVar9 = ((o4.d) pVar5.c()).f5621e;
                                    q6.i.c(oVar9, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) oVar9;
                                    if (((Boolean) iVar5.f5746c.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) {
                                        int i47 = o4.o.f5669h;
                                        for (o4.o oVar10 : h0.a.G(hVar3)) {
                                        }
                                        return (m0) cVar8.i(pVar5);
                                    }
                                    int i48 = o4.o.f5669h;
                                    for (o4.o oVar11 : h0.a.G(hVar3)) {
                                    }
                                    return (m0) cVar7.i(pVar5);
                            }
                        }
                    };
                    r12.f0(cVar6);
                    K7 = cVar6;
                } else {
                    zVar3 = zVar6;
                    c0Var = c0Var2;
                    iVar = iVar3;
                    z3 = false;
                    dVar = dVar5;
                }
                p6.c cVar7 = (p6.c) K7;
                boolean h11 = r12.h(iVar) | (((((i8 & 29360128) ^ 12582912) <= 8388608 || !r12.f(cVar4)) && (i8 & 12582912) != 8388608) ? z3 : true) | ((i8 & 458752) == 131072 ? true : z3);
                Object K8 = r12.K();
                if (h11 || K8 == obj9) {
                    final int i44 = 0;
                    cVar5 = cVar7;
                    p6.c cVar8 = new p6.c() { // from class: p4.q
                        @Override // p6.c
                        public final Object i(Object obj10) {
                            int i442 = i44;
                            z0 z0Var6 = z0Var2;
                            p6.c cVar72 = cVar2;
                            p6.c cVar82 = cVar4;
                            i iVar5 = iVar;
                            q.p pVar5 = (q.p) obj10;
                            switch (i442) {
                                case 0:
                                    o4.o oVar6 = ((o4.d) pVar5.b()).f5621e;
                                    q6.i.c(oVar6, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar2 = (h) oVar6;
                                    if (((Boolean) iVar5.f5746c.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) {
                                        int i45 = o4.o.f5669h;
                                        for (o4.o oVar7 : h0.a.G(hVar2)) {
                                        }
                                        return (q.n0) cVar82.i(pVar5);
                                    }
                                    int i46 = o4.o.f5669h;
                                    for (o4.o oVar8 : h0.a.G(hVar2)) {
                                    }
                                    return (q.n0) cVar72.i(pVar5);
                                default:
                                    o4.o oVar9 = ((o4.d) pVar5.c()).f5621e;
                                    q6.i.c(oVar9, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    h hVar3 = (h) oVar9;
                                    if (((Boolean) iVar5.f5746c.getValue()).booleanValue() || ((Boolean) z0Var6.getValue()).booleanValue()) {
                                        int i47 = o4.o.f5669h;
                                        for (o4.o oVar10 : h0.a.G(hVar3)) {
                                        }
                                        return (m0) cVar82.i(pVar5);
                                    }
                                    int i48 = o4.o.f5669h;
                                    for (o4.o oVar11 : h0.a.G(hVar3)) {
                                    }
                                    return (m0) cVar72.i(pVar5);
                            }
                        }
                    };
                    r12.f0(cVar8);
                    K8 = cVar8;
                } else {
                    cVar5 = cVar7;
                }
                p6.c cVar9 = (p6.c) K8;
                boolean z9 = (i8 & 234881024) == 67108864 ? true : z3;
                Object K9 = r12.K();
                if (z9 || K9 == obj9) {
                    K9 = new l(14);
                    r12.f0(K9);
                }
                p6.c cVar10 = (p6.c) K9;
                Boolean bool = Boolean.TRUE;
                boolean h12 = r12.h(iVar);
                Object K10 = r12.K();
                int i45 = 9;
                if (h12 || K10 == obj9) {
                    K10 = new a0.v0(i45, t2Var2, iVar);
                    r12.f0(K10);
                }
                m0.b.d(bool, (p6.c) K10, r12);
                Object K11 = r12.K();
                if (K11 == obj9) {
                    K11 = new s0(dVar);
                    r12.f0(K11);
                }
                s0 s0Var2 = (s0) K11;
                l lVar = o1.f6382a;
                boolean f10 = r12.f(s0Var2);
                Object K12 = r12.K();
                if (f10 || K12 == obj9) {
                    w0.f e11 = w0.q.e();
                    p6.c e12 = e11 != null ? e11.e() : null;
                    z0Var3 = z0Var2;
                    w0.f h13 = w0.q.h(e11);
                    t2Var = t2Var2;
                    try {
                        r.l1 l1Var2 = new r.l1(s0Var2, null, "entry");
                        w0.q.k(e11, h13, e12);
                        r12.f0(l1Var2);
                        K12 = l1Var2;
                    } catch (Throwable th) {
                        w0.q.k(e11, h13, e12);
                        throw th;
                    }
                } else {
                    z0Var3 = z0Var2;
                    t2Var = t2Var2;
                }
                ?? r62 = (r.l1) K12;
                if (s0Var2 != null) {
                    r12.V(-1357588631);
                    Object value = s0Var2.f6419c.getValue();
                    Object value2 = s0Var2.f6418b.getValue();
                    boolean f11 = r12.f(s0Var2);
                    Object K13 = r12.K();
                    if (f11 || K13 == obj9) {
                        r15 = null;
                        K13 = new b0.c(s0Var2, (c) r15, 9);
                        r12.f0(K13);
                    } else {
                        r15 = null;
                    }
                    m0.b.e(value, value2, (p6.e) K13, r12);
                    i10 = 0;
                    r12.p(false);
                } else {
                    i10 = 0;
                    r15 = null;
                    r12.V(-1357127072);
                    r62.a(s0Var2.f6418b.getValue(), r12, 0);
                    r12.p(false);
                }
                boolean f12 = r12.f(r62);
                Object K14 = r12.K();
                if (f12 || K14 == obj9) {
                    K14 = new m1(r62, i10);
                    r12.f0(K14);
                }
                m0.b.d(r62, (p6.c) K14, r12);
                if (((Boolean) z0Var3.getValue()).booleanValue()) {
                    r12.V(-1795016672);
                    Float valueOf = Float.valueOf(d1Var.g());
                    boolean f13 = r12.f(z0Var) | r12.h(s0Var2);
                    Object K15 = r12.K();
                    if (f13 || K15 == obj9) {
                        ?? r23 = r15;
                        K15 = new b0.c(s0Var2, z0Var, d1Var, r23, 7);
                        r12.f0(K15);
                        pVar3 = r23;
                    } else {
                        pVar3 = r15;
                    }
                    m0.b.f(valueOf, r12, (p6.e) K15);
                    z7 = false;
                    r12.p(false);
                    s0Var = s0Var2;
                    l1Var = r62;
                    dVar2 = dVar;
                    pVar2 = pVar3;
                } else {
                    ?? r232 = r15;
                    r12.V(-1794598265);
                    boolean h14 = r12.h(s0Var2) | r12.h(dVar) | r12.f(r62);
                    Object K16 = r12.K();
                    if (h14 || K16 == obj9) {
                        s0Var = s0Var2;
                        l1Var = r62;
                        o4.d dVar6 = dVar;
                        K16 = new c2.a(s0Var, dVar6, l1Var, r232, 3);
                        dVar2 = dVar6;
                        r12.f0(K16);
                    } else {
                        s0Var = s0Var2;
                        l1Var = r62;
                        dVar2 = dVar;
                    }
                    m0.b.f(dVar2, r12, (p6.e) K16);
                    z7 = false;
                    r12.p(false);
                    pVar2 = r232;
                }
                boolean h15 = r12.h(c0Var) | r12.h(iVar) | r12.f(cVar5) | r12.f(cVar9) | r12.f(cVar10);
                Object K17 = r12.K();
                if (h15 || K17 == obj9) {
                    p4.i iVar5 = iVar;
                    o.c0 c0Var3 = c0Var;
                    p6.c cVar11 = cVar5;
                    r152 = z7;
                    zVar2 = zVar3;
                    z0 z0Var6 = z0Var3;
                    o0Var = new b6.o0(c0Var3, iVar5, cVar11, cVar9, cVar10, t2Var, z0Var6);
                    iVar2 = iVar5;
                    z0Var4 = z0Var6;
                    c0Var = c0Var3;
                    r12.f0(o0Var);
                } else {
                    iVar2 = iVar;
                    o0Var = K17;
                    r152 = z7;
                    zVar2 = zVar3;
                    z0Var4 = z0Var3;
                }
                p6.c cVar12 = (p6.c) o0Var;
                Object K18 = r12.K();
                if (K18 == obj9) {
                    K18 = new l(16);
                    r12.f0(K18);
                }
                r.l1 l1Var3 = l1Var;
                androidx.compose.animation.a.a(l1Var3, mVar, cVar12, eVar, (p6.c) K18, u0.h.d(820763100, new p4.t(s0Var, dVar2, d9, z0Var4, t2Var), r12), r12, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
                Object b10 = l1Var3.f6346a.b();
                Object value3 = l1Var3.f6349d.getValue();
                boolean f14 = r12.f(l1Var3) | r12.h(tVar) | r12.h(dVar2) | r12.h(iVar2) | r12.h(c0Var);
                Object K19 = r12.K();
                if (f14 || K19 == obj9) {
                    p4.i iVar6 = iVar2;
                    obj = value3;
                    p4.u uVar4 = new p4.u(l1Var3, tVar, dVar2, c0Var, t2Var, iVar6, null);
                    r12.f0(uVar4);
                    K19 = uVar4;
                } else {
                    obj = value3;
                }
                m0.b.e(b10, obj, (p6.e) K19, r12);
                r12.p(r152);
                i9 = r152;
                pVar = pVar2;
            } else {
                zVar2 = zVar6;
                i9 = 0;
                pVar = null;
                r12.V(-1789446406);
                r12.p(false);
            }
            o4.y b11 = zVar2.b("dialog");
            p4.p pVar5 = b11 instanceof p4.p ? (p4.p) b11 : pVar;
            if (pVar5 == null) {
                t1 r8 = r12.r();
                if (r8 != null) {
                    final int i46 = 0;
                    r8.f5121d = new p6.e() { // from class: p4.s
                        @Override // p6.e
                        public final Object g(Object obj92, Object obj10) {
                            switch (i46) {
                                case 0:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                                    break;
                                default:
                                    ((Integer) obj10).getClass();
                                    m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    };
                    return;
                }
                return;
            }
            a(pVar5, r12, i9);
            sVar2 = r12;
        }
        t1 r9 = sVar2.r();
        if (r9 != null) {
            final int i47 = 1;
            r9.f5121d = new p6.e() { // from class: p4.s
                @Override // p6.e
                public final Object g(Object obj92, Object obj10) {
                    switch (i47) {
                        case 0:
                            ((Integer) obj10).getClass();
                            m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                            break;
                        case 1:
                            ((Integer) obj10).getClass();
                            m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                            break;
                        default:
                            ((Integer) obj10).getClass();
                            m.a.e(tVar, qVar, mVar, eVar, cVar, cVar2, cVar3, cVar4, (m0.s) obj92, m0.b.w(i | 1));
                            break;
                    }
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void f(final List list, Collection collection, s sVar, int i) {
        sVar.W(1537894851);
        if ((((sVar.h(list) ? 4 : 2) | i | (sVar.h(collection) ? 32 : 16)) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            final boolean booleanValue = ((Boolean) sVar.j(l1.f8495a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final o4.d dVar = (o4.d) it.next();
                w wVar = dVar.f5626k.f6571j;
                boolean g3 = sVar.g(booleanValue) | sVar.h(list) | sVar.h(dVar);
                Object K = sVar.K();
                if (g3 || K == m0.n.f5019a) {
                    K = new p6.c() { // from class: p4.k
                        @Override // p6.c
                        public final Object i(Object obj) {
                            final List list2 = list;
                            final o4.d dVar2 = dVar;
                            final boolean z3 = booleanValue;
                            androidx.lifecycle.s sVar2 = new androidx.lifecycle.s() { // from class: p4.l
                                @Override // androidx.lifecycle.s
                                public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                                    boolean z7 = z3;
                                    List list3 = list2;
                                    o4.d dVar3 = dVar2;
                                    if (z7 && !list3.contains(dVar3)) {
                                        list3.add(dVar3);
                                    }
                                    if (oVar == androidx.lifecycle.o.ON_START && !list3.contains(dVar3)) {
                                        list3.add(dVar3);
                                    }
                                    if (oVar == androidx.lifecycle.o.ON_STOP) {
                                        list3.remove(dVar3);
                                    }
                                }
                            };
                            dVar2.f5626k.f6571j.a(sVar2);
                            return new a0.x0(2, dVar2, sVar2);
                        }
                    };
                    sVar.f0(K);
                }
                m0.b.d(wVar, (p6.c) K, sVar);
            }
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new e0(i, 10, list, collection);
        }
    }

    public static final void g(boolean z3, p6.e eVar, s sVar, int i) {
        sVar.W(1818896922);
        int i8 = (sVar.g(z3) ? 4 : 2) | i | (sVar.h(eVar) ? 32 : 16);
        if ((i8 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            s6.a.a(z3, eVar, sVar, i8 & 126);
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new c2(z3, eVar, i, 1);
        }
    }

    public static final void h(r1.d dVar, q1.k kVar, long j7) {
        r1.c cVar = dVar.f6512b;
        r1.c cVar2 = dVar.f6511a;
        boolean k3 = h0.a.k(kVar);
        long j8 = kVar.f5995b;
        if (k3) {
            r1.a[] aVarArr = cVar2.f6506d;
            d6.l.L(aVarArr, 0, aVarArr.length);
            cVar2.f6507e = 0;
            r1.a[] aVarArr2 = cVar.f6506d;
            d6.l.L(aVarArr2, 0, aVarArr2.length);
            cVar.f6507e = 0;
            dVar.f6513c = 0L;
        }
        if (!h0.a.l(kVar)) {
            List list = kVar.f6003k;
            if (list == null) {
                list = d6.u.f2326d;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                q1.a aVar = (q1.a) list.get(i);
                long j9 = aVar.f5960a;
                long e8 = e1.b.e(aVar.f5962c, j7);
                cVar2.a(j9, Float.intBitsToFloat((int) (e8 >> 32)));
                cVar.a(j9, Float.intBitsToFloat((int) (e8 & 4294967295L)));
                i++;
            }
            long e9 = e1.b.e(kVar.f6004l, j7);
            cVar2.a(j8, Float.intBitsToFloat((int) (e9 >> 32)));
            cVar.a(j8, Float.intBitsToFloat((int) (e9 & 4294967295L)));
        }
        if (h0.a.l(kVar) && j8 - dVar.f6513c > 40) {
            r1.a[] aVarArr3 = cVar2.f6506d;
            d6.l.L(aVarArr3, 0, aVarArr3.length);
            cVar2.f6507e = 0;
            r1.a[] aVarArr4 = cVar.f6506d;
            d6.l.L(aVarArr4, 0, aVarArr4.length);
            cVar.f6507e = 0;
            dVar.f6513c = 0L;
        }
        dVar.f6513c = j8;
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                s6.a.e(th, th2);
            }
        }
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void k(r rVar, String str, u0.c cVar) {
        z zVar = rVar.f5680f;
        zVar.getClass();
        rVar.f5682h.add(new p4.j((p4.i) zVar.b(C(p4.i.class)), str, cVar).a());
    }

    public static boolean l(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m7 = m(file, inputStream);
                j(inputStream);
                return m7;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean m(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static Handler n(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j3.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c o(c cVar, c cVar2, p6.e eVar) {
        i.e(eVar, "<this>");
        if (eVar instanceof i6.a) {
            return ((i6.a) eVar).l(cVar2, cVar);
        }
        h f6 = cVar2.f();
        return f6 == g6.i.f3046d ? new h6.b(cVar2, cVar, eVar) : new h6.c(cVar2, f6, eVar, cVar);
    }

    public static final void p(l1.b bVar, l1.x xVar) {
        ArrayList arrayList = xVar.f4826e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l1.z zVar = (l1.z) arrayList.get(i);
            if (zVar instanceof b0) {
                l1.g gVar = new l1.g();
                b0 b0Var = (b0) zVar;
                gVar.f4772c = b0Var.f4745d;
                gVar.f4774e = true;
                gVar.c();
                gVar.f4777h.f2669a.setFillType(Path.FillType.WINDING);
                gVar.c();
                gVar.c();
                gVar.f4771b = b0Var.f4746e;
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.c();
                gVar.f4775f = true;
                gVar.c();
                gVar.f4773d = 1.0f;
                gVar.f4775f = true;
                gVar.c();
                gVar.f4775f = true;
                gVar.c();
                bVar.e(i, gVar);
            } else if (zVar instanceof l1.x) {
                l1.b bVar2 = new l1.b();
                l1.x xVar2 = (l1.x) zVar;
                bVar2.f4741k = "";
                bVar2.c();
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4742l = 1.0f;
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4743m = 1.0f;
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4744n = true;
                bVar2.c();
                bVar2.f4737f = xVar2.f4825d;
                bVar2.f4738g = true;
                bVar2.c();
                p(bVar2, xVar2);
                bVar.e(i, bVar2);
            }
        }
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = k0.f6120a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = q3.j0.f6114d;
        q3.j0 j0Var = (q3.j0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (j0Var == null) {
            j0Var = new q3.j0();
            j0Var.f6115a = null;
            j0Var.f6116b = null;
            j0Var.f6117c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, j0Var);
        }
        WeakReference weakReference2 = j0Var.f6117c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        j0Var.f6117c = new WeakReference(keyEvent);
        if (j0Var.f6116b == null) {
            j0Var.f6116b = new SparseArray();
        }
        SparseArray sparseArray = j0Var.f6116b;
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
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final float r(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i = 0; i < length; i++) {
            f6 += fArr[i] * fArr2[i];
        }
        return f6;
    }

    public static final boolean s(long j7, long j8) {
        return j7 == j8;
    }

    public static o t(o4.q qVar) {
        Iterator it = x6.g.b0(qVar, new l(11)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (o) next;
    }

    public static long u(int i, int i8, int i9, int i10) {
        int i11 = 262142;
        int min = Math.min(i9, 262142);
        int min2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i12 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i11 = 65534;
            } else if (i12 < 65535) {
                i11 = 32766;
            } else {
                if (i12 >= 262143) {
                    r2.b.j(i12);
                    throw new a5.c();
                }
                i11 = 8190;
            }
        }
        return r2.b.a(Math.min(i11, i), i8 != Integer.MAX_VALUE ? Math.min(i11, i8) : Integer.MAX_VALUE, min, min2);
    }

    public static long v(int i, int i8, int i9, int i10) {
        int i11 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int i12 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i11 = 65534;
            } else if (i12 < 65535) {
                i11 = 32766;
            } else {
                if (i12 >= 262143) {
                    r2.b.j(i12);
                    throw new a5.c();
                }
                i11 = 8190;
            }
        }
        return r2.b.a(min, min2, Math.min(i11, i9), i10 != Integer.MAX_VALUE ? Math.min(i11, i10) : Integer.MAX_VALUE);
    }

    public static final int w(j2.k kVar, int i) {
        boolean z3 = i.f(kVar.f3998d, j2.k.f3994e.f3998d) >= 0;
        boolean z7 = i == 1;
        if (z7 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return z7 ? 2 : 0;
    }

    public static final String x(q6.e eVar) {
        String d8;
        Map map = q6.e.f6193b;
        Class cls = eVar.f6194a;
        i.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String d9 = v.d(cls.getName());
            return d9 == null ? cls.getCanonicalName() : d9;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (d8 = v.d(componentType.getName())) != null) {
            str = d8.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public static a y() {
        if (f4871d != null) {
            return f4871d;
        }
        synchronized (a.class) {
            try {
                if (f4871d == null) {
                    f4871d = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4871d;
    }

    public static o4.h z(w0 w0Var) {
        l4.c cVar = o4.i.f5640a;
        l4.a aVar = l4.a.f4828b;
        i.e(cVar, "factory");
        i.e(aVar, "extras");
        c5.x xVar = new c5.x(w0Var, cVar, aVar);
        q6.e a8 = q6.t.a(o4.h.class);
        String x7 = x(a8);
        if (x7 != null) {
            return (o4.h) xVar.n(a8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(x7));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
