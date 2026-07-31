package a;

import A0.i;
import A0.v;
import B.C0000a;
import B.T;
import B2.b;
import C0.G;
import C0.H;
import F.C0113p;
import F.j1;
import I.C0143d;
import I.C0159l;
import I.C0163n;
import I.C0167p;
import I.C0173s0;
import I.C0174t;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import M1.c;
import M1.g;
import N0.h;
import O0.k;
import O2.d;
import Q.f;
import R.o;
import R0.C0213b;
import R0.C0214c;
import R0.C0216e;
import R0.u;
import R0.x;
import T2.C0230e;
import a0.AbstractC0236a;
import a0.C0239d;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.AbstractC0398w;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import f2.j;
import g1.C0438a;
import h0.C0463f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l2.InterfaceC0601b;
import n2.AbstractC0730j;
import r0.C0929z;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.D;
import t0.InterfaceC0997j;
import t1.AbstractC1019G;
import t1.C1013A;
import t1.C1028h;
import u0.AbstractC1101g0;
import u1.q;
import z.C1256t;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0235a implements Encoder, b {

    /* renamed from: b, reason: collision with root package name */
    public static C0463f f4714b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4715a = 2;

    public static final Object A(i iVar, v vVar) {
        Object obj = iVar.f129d.get(vVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final C0438a B(View view) {
        C0438a c0438a = (C0438a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0438a != null) {
            return c0438a;
        }
        C0438a c0438a2 = new C0438a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0438a2);
        return c0438a2;
    }

    public static final h C(H h3, int i3) {
        G g3 = h3.f557a;
        if (g3.f547a.f596a.length() != 0) {
            int e3 = h3.e(i3);
            if ((i3 != 0 && e3 == h3.e(i3 - 1)) || (i3 != g3.f547a.f596a.length() && e3 == h3.e(i3 + 1))) {
                return h3.a(i3);
            }
        }
        return h3.i(i3);
    }

    public static boolean D(int i3) {
        int type = Character.getType(i3);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static MappedByteBuffer E(Context context, Uri uri) {
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

    public static long F(String str, int i3) {
        int s3 = s(str, 0, i3, false);
        Matcher matcher = G2.i.f2189m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (s3 < i3) {
            int s4 = s(str, s3 + 1, i3, true);
            matcher.region(s3, s4);
            if (i5 == -1 && matcher.usePattern(G2.i.f2189m).matches()) {
                String group = matcher.group(1);
                j.e(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                j.e(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                j.e(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 == -1 && matcher.usePattern(G2.i.f2188l).matches()) {
                String group4 = matcher.group(1);
                j.e(group4, "matcher.group(1)");
                i6 = Integer.parseInt(group4);
            } else {
                if (i7 == -1) {
                    Pattern pattern = G2.i.f2187k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        j.e(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        j.e(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        j.e(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = AbstractC0730j.I(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(G2.i.f2186j).matches()) {
                    String group6 = matcher.group(1);
                    j.e(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
            }
            s3 = s(str, s4 + 1, i3, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i6 || i6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0 || i5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(H2.b.f2636e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i5);
        gregorianCalendar.set(12, i8);
        gregorianCalendar.set(13, i9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 C0.K, still in use, count: 2, list:
          (r2v0 C0.K) from 0x00d0: MOVE (r25v0 C0.K) = (r2v0 C0.K) (LINE:209)
          (r2v0 C0.K) from 0x007f: MOVE (r25v2 C0.K) = (r2v0 C0.K) (LINE:128)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final C0.K G(C0.K r26, O0.k r27) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0235a.G(C0.K, O0.k):C0.K");
    }

    public static void H(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0398w.a(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final long b(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = AbstractC0236a.f4717b;
        return floatToRawIntBits;
    }

    public static final void c(InterfaceC0422a interfaceC0422a, R0.v vVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        c0167p.S(-2032877254);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(vVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        int i7 = i4;
        if ((i7 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            View view = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
            O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
            k kVar = (k) c0167p.k(AbstractC1101g0.f9360l);
            C0163n M3 = C0143d.M(c0167p);
            InterfaceC0142c0 N3 = C0143d.N(aVar, c0167p);
            UUID uuid = (UUID) d.c0(new Object[0], null, C0216e.f4076f, c0167p, 3072, 6);
            boolean f3 = c0167p.f(view) | c0167p.f(bVar);
            Object G3 = c0167p.G();
            Object obj2 = C0159l.f2829a;
            if (f3 || G3 == obj2) {
                i5 = i7;
                i6 = 32;
                x xVar = new x(interfaceC0422a, vVar, view, kVar, bVar, uuid);
                Q.a aVar2 = new Q.a(488261145, new C0113p(N3, 2), true);
                u uVar = xVar.f4132j;
                uVar.setParentCompositionContext(M3);
                uVar.f4119m.setValue(aVar2);
                uVar.f4121o = true;
                if (uVar.f9301g == null && !uVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                uVar.c();
                c0167p.a0(xVar);
                obj = xVar;
            } else {
                i5 = i7;
                i6 = 32;
                obj = G3;
            }
            x xVar2 = (x) obj;
            boolean h3 = c0167p.h(xVar2);
            Object G4 = c0167p.G();
            if (h3 || G4 == obj2) {
                G4 = new C0213b(xVar2, 0);
                c0167p.a0(G4);
            }
            C0143d.c(xVar2, (InterfaceC0424c) G4, c0167p);
            boolean h4 = c0167p.h(xVar2) | ((i5 & 14) == 4) | ((i5 & 112) == i6) | c0167p.f(kVar);
            Object G5 = c0167p.G();
            if (h4 || G5 == obj2) {
                G5 = new C0214c(xVar2, interfaceC0422a, vVar, kVar, 0);
                c0167p.a0(G5);
            }
            C0143d.g((InterfaceC0422a) G5, c0167p);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(interfaceC0422a, vVar, aVar, i3, 3);
        }
    }

    public static final long d(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final long e(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void f(C0174t c0174t, C0167p c0167p, int i3) {
        int i4;
        int i5;
        j.f(c0174t, "container");
        c0167p.S(-255773054);
        int i6 = 6;
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(c0174t) : c0167p.h(c0174t) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
            i5 = i3;
        } else {
            Q1.k kVar = new Q1.k(c0174t);
            Context context = (Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b);
            Object[] copyOf = Arrays.copyOf(new AbstractC1019G[0], 0);
            q qVar = q.f9617e;
            C0929z c0929z = new C0929z(12, context);
            C1256t c1256t = o.f4037a;
            C1256t c1256t2 = new C1256t(qVar, i6, c0929z);
            boolean h3 = c0167p.h(context);
            Object G3 = c0167p.G();
            if (h3 || G3 == C0159l.f2829a) {
                G3 = new D(9, context);
                c0167p.a0(G3);
            }
            C1013A c1013a = (C1013A) d.c0(copyOf, c1256t2, (InterfaceC0422a) G3, c0167p, 0, 4);
            C1028h c1028h = (C1028h) C0143d.v(c1013a.D, null, null, c0167p, 48, 2).getValue();
            t1.u uVar = c1028h != null ? c1028h.f8874e : null;
            i5 = i3;
            j1.a(null, f.b(-1965234626, new M1.d(1, uVar), c0167p), f.b(-129391779, new g(uVar, c1013a), c0167p), null, null, 0, 0L, 0L, null, f.b(-207365677, new M1.f(c1013a, kVar), c0167p), c0167p, 805306800);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new c(i5, 0, c0174t);
        }
    }

    public static final long g(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void h(U.q qVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1177876616);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            R0.f fVar = R0.f.f4080b;
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, qVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            int i6 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, fVar);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            aVar.h(c0167p, Integer.valueOf((i6 >> 6) & 14));
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new T(qVar, aVar, i3, 1);
        }
    }

    public static final void i(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            throw new IndexOutOfBoundsException("Index " + i3 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void j(List list, int i3, int i4) {
        int size = list.size();
        if (i3 > i4) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(A.k.g(i3, "fromIndex (", ") is less than 0."));
        }
        if (i4 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + size + ')');
    }

    public static C0230e k() {
        C0230e c0230e = C0230e.f4404l;
        j.c(c0230e);
        C0230e c0230e2 = c0230e.f4406f;
        if (c0230e2 == null) {
            long nanoTime = System.nanoTime();
            C0230e.f4401i.await(C0230e.f4402j, TimeUnit.MILLISECONDS);
            C0230e c0230e3 = C0230e.f4404l;
            j.c(c0230e3);
            if (c0230e3.f4406f != null || System.nanoTime() - nanoTime < C0230e.f4403k) {
                return null;
            }
            return C0230e.f4404l;
        }
        long nanoTime2 = c0230e2.f4407g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0230e.f4401i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0230e c0230e4 = C0230e.f4404l;
        j.c(c0230e4);
        c0230e4.f4406f = c0230e2.f4406f;
        c0230e2.f4406f = null;
        return c0230e2;
    }

    public static final void l(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "index: ", ", size: "));
        }
    }

    public static final void m(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "index: ", ", size: "));
        }
    }

    public static final void n(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(A.k.f(i3, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static int o(Context context, String str) {
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : U0.c.a(new U0.d(context).f4510a) ? 0 : -1;
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean q(C0239d c0239d, float f3, float f4) {
        return f3 <= c0239d.f4726c && c0239d.f4724a <= f3 && f4 <= c0239d.f4727d && c0239d.f4725b <= f4;
    }

    public static boolean r(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
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
        } catch (IOException e4) {
            e = e4;
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

    public static int s(String str, int i3, int i4, boolean z3) {
        while (i3 < i4) {
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    public static final boolean u(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean v(int i3, int i4) {
        return i3 == i4;
    }

    public static final long w(long j3) {
        if (j3 != 9205357640488583168L) {
            return l0.c.e(Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static Set x() {
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

    public static final Class y(InterfaceC0601b interfaceC0601b) {
        j.f(interfaceC0601b, "<this>");
        Class a3 = ((f2.c) interfaceC0601b).a();
        j.d(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class z(InterfaceC0601b interfaceC0601b) {
        j.f(interfaceC0601b, "<this>");
        Class a3 = ((f2.c) interfaceC0601b).a();
        if (!a3.isPrimitive()) {
            return a3;
        }
        String name = a3.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a3;
    }

    public int hashCode() {
        switch (this.f4715a) {
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract void t(SerialDescriptor serialDescriptor, int i3, Object obj);

    public String toString() {
        switch (this.f4715a) {
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                String b3 = f2.v.a(getClass()).b();
                j.c(b3);
                return b3;
            default:
                return super.toString();
        }
    }
}
