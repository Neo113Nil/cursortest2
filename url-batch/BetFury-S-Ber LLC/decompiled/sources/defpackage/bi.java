package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.window.BackEvent;
import androidx.fragment.app.b;
import androidx.lifecycle.SavedStateHandlesVM;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class bi {
    public static final dg[] f = new dg[0];
    public static final lm g = new lm("RESUME_TOKEN", 1);
    public static final t8 h = new t8();
    public static final Object i = new Object();
    public static final boolean[] j = new boolean[3];
    public static final xy k = new xy(12);
    public static final xy l = new xy(13);
    public static final xy m = new xy(14);
    public static final xy n = new xy(19);

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList A(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        q90 q90Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        r90 r90Var = new r90(resources, theme);
        synchronized (s90.c) {
            try {
                SparseArray sparseArray = (SparseArray) s90.b.get(r90Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (q90Var = (q90) sparseArray.get(i2)) != null) {
                    if (q90Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (q90Var.c != 0) {
                            }
                            colorStateList2 = q90Var.a;
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
        ThreadLocal threadLocal = s90.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = ed.a(resources, resources.getXml(i2), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (s90.c) {
            try {
                WeakHashMap weakHashMap = s90.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r90Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(r90Var, sparseArray2);
                }
                sparseArray2.append(i2, new q90(colorStateList, r90Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList B(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !c0.s(drawable)) {
            return null;
        }
        colorStateList = c0.f(drawable).getColorStateList();
        return colorStateList;
    }

    public static final int C(eb0 eb0Var, String str) {
        eb0Var.getClass();
        int t = t(eb0Var, str);
        if (t >= 0) {
            return t;
        }
        int columnCount = eb0Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(eb0Var.getColumnName(i2));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + uc.k0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final String D(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final SavedStateHandlesVM E(tm0 tm0Var) {
        nb0 nb0Var = new nb0();
        hh c = tm0Var instanceof ws ? ((ws) tm0Var).c() : gh.b;
        c.getClass();
        sm0 d = tm0Var.d();
        d.getClass();
        return (SavedStateHandlesVM) new wi(d, nb0Var, c).j(b90.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final rc F(NotesViewModel notesViewModel) {
        rc rcVar;
        synchronized (n) {
            rcVar = (rc) notesViewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (rcVar == null) {
                qg qgVar = um.f;
                try {
                    si siVar = ik.a;
                    qgVar = oz.a.j;
                } catch (IllegalStateException | x30 unused) {
                }
                rc rcVar2 = new rc(qgVar.r(new ag0(null)));
                notesViewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", rcVar2);
                rcVar = rcVar2;
            }
        }
        return rcVar;
    }

    public static void G(int i2, ef efVar, rf rfVar, boolean z) {
        xe xeVar;
        xe xeVar2;
        char c;
        xe xeVar3;
        xe xeVar4;
        if (rfVar.m) {
            return;
        }
        if (!(rfVar instanceof sf) && rfVar.z() && l(rfVar)) {
            sf.V(rfVar, efVar, new t8());
        }
        xe i3 = rfVar.i(we.LEFT);
        xe i4 = rfVar.i(we.RIGHT);
        int d = i3.d();
        int d2 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xe xeVar5 = (xe) it.next();
                rf rfVar2 = xeVar5.d;
                int i5 = i2 + 1;
                boolean l2 = l(rfVar2);
                xe xeVar6 = rfVar2.I;
                xe xeVar7 = rfVar2.K;
                if (rfVar2.z() && l2) {
                    c = 0;
                    sf.V(rfVar2, efVar, new t8());
                } else {
                    c = 0;
                }
                char c2 = ((xeVar5 == xeVar6 && (xeVar4 = xeVar7.f) != null && xeVar4.c) || (xeVar5 == xeVar7 && (xeVar3 = xeVar6.f) != null && xeVar3.c)) ? (char) 1 : c;
                qf qfVar = rfVar2.T[c];
                qf qfVar2 = qf.MATCH_CONSTRAINT;
                if (qfVar != qfVar2 || l2) {
                    if (!rfVar2.z()) {
                        if (xeVar5 == xeVar6 && xeVar7.f == null) {
                            int e = xeVar6.e() + d;
                            rfVar2.J(e, rfVar2.q() + e);
                            G(i5, efVar, rfVar2, z);
                        } else if (xeVar5 == xeVar7 && xeVar6.f == null) {
                            int e2 = d - xeVar7.e();
                            rfVar2.J(e2 - rfVar2.q(), e2);
                            G(i5, efVar, rfVar2, z);
                        } else if (c2 != 0 && !rfVar2.x()) {
                            Y(i5, efVar, rfVar2, z);
                        }
                    }
                } else if (qfVar == qfVar2 && rfVar2.v >= 0 && rfVar2.u >= 0 && (rfVar2.h0 == 8 || (rfVar2.r == 0 && rfVar2.X == 0.0f))) {
                    if (!rfVar2.x() && !rfVar2.F && c2 != 0 && !rfVar2.x()) {
                        Z(i5, rfVar, efVar, rfVar2, z);
                    }
                }
            }
        }
        if (rfVar instanceof os) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                xe xeVar8 = (xe) it2.next();
                rf rfVar3 = xeVar8.d;
                int i6 = i2 + 1;
                boolean l3 = l(rfVar3);
                xe xeVar9 = rfVar3.I;
                xe xeVar10 = rfVar3.K;
                if (rfVar3.z() && l3) {
                    sf.V(rfVar3, efVar, new t8());
                }
                boolean z2 = (xeVar8 == xeVar9 && (xeVar2 = xeVar10.f) != null && xeVar2.c) || (xeVar8 == xeVar10 && (xeVar = xeVar9.f) != null && xeVar.c);
                qf qfVar3 = rfVar3.T[0];
                qf qfVar4 = qf.MATCH_CONSTRAINT;
                if (qfVar3 != qfVar4 || l3) {
                    if (!rfVar3.z()) {
                        if (xeVar8 == xeVar9 && xeVar10.f == null) {
                            int e3 = xeVar9.e() + d2;
                            rfVar3.J(e3, rfVar3.q() + e3);
                            G(i6, efVar, rfVar3, z);
                        } else if (xeVar8 == xeVar10 && xeVar9.f == null) {
                            int e4 = d2 - xeVar10.e();
                            rfVar3.J(e4 - rfVar3.q(), e4);
                            G(i6, efVar, rfVar3, z);
                        } else if (z2 && !rfVar3.x()) {
                            Y(i6, efVar, rfVar3, z);
                        }
                    }
                } else if (qfVar3 == qfVar4 && rfVar3.v >= 0 && rfVar3.u >= 0) {
                    if (rfVar3.h0 == 8 || (rfVar3.r == 0 && rfVar3.X == 0.0f)) {
                        if (!rfVar3.x() && !rfVar3.F && z2 && !rfVar3.x()) {
                            Z(i6, rfVar, efVar, rfVar3, z);
                        }
                    }
                }
            }
        }
        rfVar.m = true;
    }

    public static final nk H(mw mwVar, boolean z, iw iwVar) {
        if (mwVar instanceof mw) {
            return mwVar.B(z, iwVar);
        }
        boolean k2 = iwVar.k();
        tv tvVar = new tv(1, iwVar, iw.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1);
        return mwVar.B(z, k2 ? new vv(tvVar) : new jb(2, tvVar));
    }

    public static boolean I(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = fd.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length != 3) {
            s9.k("outXyz must have a length of 3.");
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

    public static int J(int i2, int i3, float f2) {
        return fd.b(fd.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static List K(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(dg dgVar, tr trVar, ma0 ma0Var, boolean z, boolean z2) {
        th thVar;
        int i2;
        qg i3;
        tr trVar2;
        ma0 ma0Var2;
        boolean z3;
        boolean z4;
        if (dgVar instanceof th) {
            thVar = (th) dgVar;
            int i4 = thVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                thVar.n = i4 - Integer.MIN_VALUE;
                th thVar2 = thVar;
                Object obj = thVar2.m;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i2 = thVar2.n;
                if (i2 != 0) {
                    mv.O(obj);
                    if (ma0Var.inCompatibilityMode$room_runtime_release() && ma0Var.isOpenInternal() && ma0Var.inTransaction()) {
                        uh uhVar = new uh(null, trVar, ma0Var, z2, z);
                        thVar2.n = 1;
                        Object useConnection$room_runtime_release = ma0Var.useConnection$room_runtime_release(z, uhVar, thVar2);
                        if (useConnection$room_runtime_release != bhVar) {
                            return useConnection$room_runtime_release;
                        }
                    } else {
                        thVar2.i = ma0Var;
                        thVar2.j = trVar;
                        thVar2.k = z;
                        thVar2.l = z2;
                        thVar2.n = 2;
                        if (ma0Var.inCompatibilityMode$room_runtime_release()) {
                            qg qgVar = thVar2.g;
                            qgVar.getClass();
                            if (qgVar.w(cj0.f) != null) {
                                s9.c();
                                return null;
                            }
                            i3 = z2 ? ma0Var.getTransactionContext$room_runtime_release() : ma0Var.getQueryContext();
                        } else {
                            i3 = ma0Var.getCoroutineScope().i();
                        }
                        if (i3 != bhVar) {
                            trVar2 = trVar;
                            ma0Var2 = ma0Var;
                            obj = i3;
                            z3 = z;
                            z4 = z2;
                        }
                    }
                }
                if (i2 == 1) {
                    mv.O(obj);
                    return obj;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        mv.O(obj);
                        return obj;
                    }
                    s9.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = thVar2.l;
                boolean z6 = thVar2.k;
                tr trVar3 = thVar2.j;
                ma0 ma0Var3 = thVar2.i;
                mv.O(obj);
                z4 = z5;
                z3 = z6;
                trVar2 = trVar3;
                ma0Var2 = ma0Var3;
                sh shVar = new sh(null, trVar2, ma0Var2, z3, z4);
                thVar2.i = null;
                thVar2.j = null;
                thVar2.n = 3;
                Object V = gk0.V((qg) obj, shVar, thVar2);
                return V != bhVar ? bhVar : V;
            }
        }
        thVar = new th(dgVar);
        th thVar22 = thVar;
        Object obj2 = thVar22.m;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i2 = thVar22.n;
        if (i2 != 0) {
        }
        sh shVar2 = new sh(null, trVar2, ma0Var2, z3, z4);
        thVar22.i = null;
        thVar22.j = null;
        thVar22.n = 3;
        Object V2 = gk0.V((qg) obj2, shVar2, thVar22);
        if (V2 != bhVar2) {
        }
    }

    public static String S(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        y9 y9Var = y9.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        n9.b(encoded.length, 0L, length);
        n9.h(length, encoded.length);
        int i2 = 0;
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        copyOfRange.getClass();
        y9 y9Var2 = new y9(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, y9Var2.a());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        new y9(digest);
        byte[] bArr = a.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b = digest[i2];
            int i4 = i2 + 2;
            byte b2 = digest[i2 + 1];
            i2 += 3;
            byte b3 = digest[i4];
            bArr2[i3] = bArr[(b & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b3 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b4 = digest[i2];
            bArr2[i3] = bArr[(b4 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b5 = digest[i2];
            byte b6 = digest[i6];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, fb.a));
        return sb.toString();
    }

    public static void T(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static qg U(qg qgVar, qg qgVar2) {
        qgVar2.getClass();
        return qgVar2 == um.f ? qgVar : (qg) qgVar2.n(qgVar, new gd(1));
    }

    public static m20 V(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            s9.w("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    m20 m20Var = new m20();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    m20Var.i = duplicate;
                    m20Var.f = position;
                    int i7 = position - duplicate.getInt(position);
                    m20Var.g = i7;
                    m20Var.h = ((ByteBuffer) m20Var.i).getShort(i7);
                    return m20Var;
                }
            }
        }
        s9.w("Cannot read metadata.");
        return null;
    }

    public static int W(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValue.data;
    }

    public static void X(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            qk.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                pk.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            pk.a(outline, path);
        }
    }

    public static void Y(int i2, ef efVar, rf rfVar, boolean z) {
        float f2 = rfVar.e0;
        xe xeVar = rfVar.I;
        int d = xeVar.f.d();
        xe xeVar2 = rfVar.K;
        int d2 = xeVar2.f.d();
        int e = xeVar.e() + d;
        int e2 = d2 - xeVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int q = rfVar.q();
        int i3 = (d2 - d) - q;
        if (d > d2) {
            i3 = (d - d2) - q;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d;
        int i5 = i4 + q;
        if (d > d2) {
            i5 = i4 - q;
        }
        rfVar.J(i4, i5);
        G(i2 + 1, efVar, rfVar, z);
    }

    public static void Z(int i2, rf rfVar, ef efVar, rf rfVar2, boolean z) {
        float f2 = rfVar2.e0;
        xe xeVar = rfVar2.I;
        int e = xeVar.e() + xeVar.f.d();
        xe xeVar2 = rfVar2.K;
        int d = xeVar2.f.d() - xeVar2.e();
        if (d >= e) {
            int q = rfVar2.q();
            if (rfVar2.h0 != 8) {
                int i3 = rfVar2.r;
                if (i3 == 2) {
                    q = (int) (rfVar2.e0 * 0.5f * (rfVar instanceof sf ? rfVar.q() : rfVar.U.q()));
                } else if (i3 == 0) {
                    q = d - e;
                }
                q = Math.max(rfVar2.u, q);
                int i4 = rfVar2.v;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e + ((int) ((f2 * ((d - e) - q)) + 0.5f));
            rfVar2.J(i5, q + i5);
            G(i2 + 1, efVar, rfVar2, z);
        }
    }

    public static void a0(int i2, ef efVar, rf rfVar) {
        float f2 = rfVar.f0;
        xe xeVar = rfVar.J;
        int d = xeVar.f.d();
        xe xeVar2 = rfVar.L;
        int d2 = xeVar2.f.d();
        int e = xeVar.e() + d;
        int e2 = d2 - xeVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int k2 = rfVar.k();
        int i3 = (d2 - d) - k2;
        if (d > d2) {
            i3 = (d - d2) - k2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d + i4;
        int i6 = i5 + k2;
        if (d > d2) {
            i5 = d - i4;
            i6 = i5 - k2;
        }
        rfVar.K(i5, i6);
        e0(i2 + 1, efVar, rfVar);
    }

    public static void b0(int i2, rf rfVar, ef efVar, rf rfVar2) {
        float f2 = rfVar2.f0;
        xe xeVar = rfVar2.J;
        int e = xeVar.e() + xeVar.f.d();
        xe xeVar2 = rfVar2.L;
        int d = xeVar2.f.d() - xeVar2.e();
        if (d >= e) {
            int k2 = rfVar2.k();
            if (rfVar2.h0 != 8) {
                int i3 = rfVar2.s;
                if (i3 == 2) {
                    k2 = (int) (f2 * 0.5f * (rfVar instanceof sf ? rfVar.k() : rfVar.U.k()));
                } else if (i3 == 0) {
                    k2 = d - e;
                }
                k2 = Math.max(rfVar2.x, k2);
                int i4 = rfVar2.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e + ((int) ((f2 * ((d - e) - k2)) + 0.5f));
            rfVar2.K(i5, k2 + i5);
            e0(i2 + 1, efVar, rfVar2);
        }
    }

    public static final g30 c(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new g30(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final String c0(String str) {
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!mf0.t(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (mv.i(charAt, 31) <= 0 || mv.i(charAt, 127) >= 0 || mf0.w(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress w = (uf0.r(str, "[", false) && str.endsWith("]")) ? w(str, 1, str.length() - 1) : w(str, 0, str.length());
        if (w == null) {
            return null;
        }
        byte[] address = w.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return w.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        t9 t9Var = new t9();
        while (i3 < address.length) {
            if (i3 == i2) {
                t9Var.T(58);
                i3 += i6;
                if (i3 == 16) {
                    t9Var.T(58);
                }
            } else {
                if (i3 > 0) {
                    t9Var.T(58);
                }
                byte b = address[i3];
                byte[] bArr = zk0.a;
                t9Var.U(((b & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return t9Var.O(t9Var.g, fb.a);
    }

    public static final String d0(dg dgVar) {
        Object z90Var;
        if (dgVar instanceof ek) {
            return ((ek) dgVar).toString();
        }
        try {
            z90Var = dgVar + '@' + D(dgVar);
        } catch (Throwable th) {
            z90Var = new z90(th);
        }
        if (aa0.a(z90Var) != null) {
            z90Var = dgVar.getClass().getName() + '@' + D(dgVar);
        }
        return (String) z90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e0(int i2, ef efVar, rf rfVar) {
        char c;
        char c2;
        xe xeVar;
        xe xeVar2;
        float f2;
        xe xeVar3;
        xe xeVar4;
        if (rfVar.n) {
            return;
        }
        if (!(rfVar instanceof sf) && rfVar.z() && l(rfVar)) {
            sf.V(rfVar, efVar, new t8());
        }
        xe i3 = rfVar.i(we.TOP);
        xe i4 = rfVar.i(we.BOTTOM);
        int d = i3.d();
        int d2 = i4.d();
        HashSet hashSet = i3.a;
        char c3 = 1;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xe xeVar5 = (xe) it.next();
                rf rfVar2 = xeVar5.d;
                int i5 = i2 + 1;
                boolean l2 = l(rfVar2);
                xe xeVar6 = rfVar2.J;
                xe xeVar7 = rfVar2.L;
                if (rfVar2.z() && l2) {
                    f2 = 0.0f;
                    sf.V(rfVar2, efVar, new t8());
                } else {
                    f2 = 0.0f;
                }
                char c4 = ((xeVar5 == xeVar6 && (xeVar4 = xeVar7.f) != null && xeVar4.c) || (xeVar5 == xeVar7 && (xeVar3 = xeVar6.f) != null && xeVar3.c)) ? c3 : (char) 0;
                qf qfVar = rfVar2.T[c3];
                char c5 = c3;
                qf qfVar2 = qf.MATCH_CONSTRAINT;
                if (qfVar != qfVar2 || l2) {
                    if (!rfVar2.z()) {
                        if (xeVar5 == xeVar6 && xeVar7.f == null) {
                            int e = xeVar6.e() + d;
                            rfVar2.K(e, rfVar2.k() + e);
                            e0(i5, efVar, rfVar2);
                        } else if (xeVar5 == xeVar7 && xeVar6.f == null) {
                            int e2 = d - xeVar7.e();
                            rfVar2.K(e2 - rfVar2.k(), e2);
                            e0(i5, efVar, rfVar2);
                        } else if (c4 != 0 && !rfVar2.y()) {
                            a0(i5, efVar, rfVar2);
                        }
                    }
                } else if (qfVar == qfVar2 && rfVar2.y >= 0 && rfVar2.x >= 0 && ((rfVar2.h0 == 8 || (rfVar2.s == 0 && rfVar2.X == f2)) && !rfVar2.y() && !rfVar2.F && c4 != 0 && !rfVar2.y())) {
                    b0(i5, rfVar, efVar, rfVar2);
                }
                c3 = c5;
            }
        }
        char c6 = c3;
        if (rfVar instanceof os) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                xe xeVar8 = (xe) it2.next();
                rf rfVar3 = xeVar8.d;
                int i6 = i2 + 1;
                boolean l3 = l(rfVar3);
                xe xeVar9 = rfVar3.J;
                xe xeVar10 = rfVar3.L;
                if (rfVar3.z() && l3) {
                    sf.V(rfVar3, efVar, new t8());
                }
                boolean z = ((xeVar8 == xeVar9 && (xeVar2 = xeVar10.f) != null && xeVar2.c) || (xeVar8 == xeVar10 && (xeVar = xeVar9.f) != null && xeVar.c)) ? c6 == true ? 1 : 0 : false;
                qf qfVar3 = rfVar3.T[c6 == true ? 1 : 0];
                qf qfVar4 = qf.MATCH_CONSTRAINT;
                if (qfVar3 != qfVar4 || l3) {
                    if (!rfVar3.z()) {
                        if (xeVar8 == xeVar9 && xeVar10.f == null) {
                            int e3 = xeVar9.e() + d2;
                            rfVar3.K(e3, rfVar3.k() + e3);
                            e0(i6, efVar, rfVar3);
                        } else if (xeVar8 == xeVar10 && xeVar9.f == null) {
                            int e4 = d2 - xeVar10.e();
                            rfVar3.K(e4 - rfVar3.k(), e4);
                            e0(i6, efVar, rfVar3);
                        } else if (z && !rfVar3.y()) {
                            a0(i6, efVar, rfVar3);
                        }
                    }
                } else if (qfVar3 == qfVar4 && rfVar3.y >= 0 && rfVar3.x >= 0 && (rfVar3.h0 == 8 || (rfVar3.s == 0 && rfVar3.X == 0.0f))) {
                    if (!rfVar3.y() && !rfVar3.F && z && !rfVar3.y()) {
                        b0(i6, rfVar, efVar, rfVar3);
                    }
                }
            }
        }
        xe i7 = rfVar.i(we.BASELINE);
        if (i7.a != null && i7.c) {
            int d3 = i7.d();
            Iterator it3 = i7.a.iterator();
            while (it3.hasNext()) {
                xe xeVar11 = (xe) it3.next();
                rf rfVar4 = xeVar11.d;
                int i8 = i2 + 1;
                boolean l4 = l(rfVar4);
                xe xeVar12 = rfVar4.M;
                if (rfVar4.z() && l4) {
                    sf.V(rfVar4, efVar, new t8());
                }
                if (rfVar4.T[c6 == true ? 1 : 0] != qf.MATCH_CONSTRAINT || l4) {
                    if (!rfVar4.z()) {
                        if (xeVar11 == xeVar12) {
                            int e5 = xeVar11.e() + d3;
                            if (rfVar4.E) {
                                int i9 = e5 - rfVar4.b0;
                                int i10 = rfVar4.W + i9;
                                rfVar4.a0 = i9;
                                rfVar4.J.l(i9);
                                rfVar4.L.l(i10);
                                xeVar12.l(e5);
                                boolean z2 = c6 == true ? 1 : 0;
                                rfVar4.l = z2;
                                c = z2;
                            } else {
                                c = c6 == true ? 1 : 0;
                            }
                            e0(i8, efVar, rfVar4);
                            c2 = c;
                            c6 = c2;
                        }
                    }
                }
                c2 = c6 == true ? 1 : 0;
                c6 = c2;
            }
        }
        rfVar.n = c6;
    }

    public static void f(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = bw.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = r50.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void g(om0 om0Var, i5 i5Var, nx nxVar) {
        i5Var.getClass();
        nxVar.getClass();
        mb0 mb0Var = (mb0) om0Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (mb0Var == null || mb0Var.h) {
            return;
        }
        mb0Var.n(i5Var, nxVar);
        gx gxVar = nxVar.c;
        if (gxVar == gx.INITIALIZED || gxVar.isAtLeast(gx.STARTED)) {
            i5Var.O();
        } else {
            nxVar.a(new ri(nxVar, i5Var, 1));
        }
    }

    public static q7 h() {
        q7 q7Var = q7.l;
        q7Var.getClass();
        q7 q7Var2 = q7Var.f;
        if (q7Var2 == null) {
            long nanoTime = System.nanoTime();
            q7.i.await(q7.j, TimeUnit.MILLISECONDS);
            q7 q7Var3 = q7.l;
            q7Var3.getClass();
            if (q7Var3.f != null || System.nanoTime() - nanoTime < q7.k) {
                return null;
            }
            return q7.l;
        }
        long nanoTime2 = q7Var2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            q7.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        q7 q7Var4 = q7.l;
        q7Var4.getClass();
        q7Var4.f = q7Var2.f;
        q7Var2.f = null;
        return q7Var2;
    }

    public static dy i(dy dyVar) {
        dyVar.f();
        dyVar.h = true;
        return dyVar.g > 0 ? dyVar : dy.i;
    }

    public static final Bundle j(k50... k50VarArr) {
        Bundle bundle = new Bundle(k50VarArr.length);
        for (k50 k50Var : k50VarArr) {
            String str = (String) k50Var.f;
            Object obj = k50Var.g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        s9.p("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\"");
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    s9.p("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\"");
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static boolean l(rf rfVar) {
        qf qfVar;
        qf qfVar2;
        qf[] qfVarArr = rfVar.T;
        qf qfVar3 = qfVarArr[0];
        qf qfVar4 = qfVarArr[1];
        rf rfVar2 = rfVar.U;
        sf sfVar = rfVar2 != null ? (sf) rfVar2 : null;
        if (sfVar != null) {
            qf qfVar5 = sfVar.T[0];
            qf qfVar6 = qf.FIXED;
        }
        if (sfVar != null) {
            qf qfVar7 = sfVar.T[1];
            qf qfVar8 = qf.FIXED;
        }
        qf qfVar9 = qf.FIXED;
        boolean z = qfVar3 == qfVar9 || rfVar.A() || qfVar3 == qf.WRAP_CONTENT || (qfVar3 == (qfVar2 = qf.MATCH_CONSTRAINT) && rfVar.r == 0 && rfVar.X == 0.0f && rfVar.t(0)) || (qfVar3 == qfVar2 && rfVar.r == 1 && rfVar.u(0, rfVar.q()));
        boolean z2 = qfVar4 == qfVar9 || rfVar.B() || qfVar4 == qf.WRAP_CONTENT || (qfVar4 == (qfVar = qf.MATCH_CONSTRAINT) && rfVar.s == 0 && rfVar.X == 0.0f && rfVar.t(1)) || (qfVar4 == qfVar && rfVar.s == 1 && rfVar.u(1, rfVar.k()));
        return (rfVar.X > 0.0f && (z || z2)) || (z && z2);
    }

    public static final void m(qg qgVar, CancellationException cancellationException) {
        mw mwVar = (mw) qgVar.w(sl.k);
        if (mwVar != null) {
            if (cancellationException == null) {
                cancellationException = new gw(mwVar.l(), null, mwVar);
            }
            mwVar.g(cancellationException);
        }
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        s9.k(str);
    }

    public static void o(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p(sf sfVar, xx xxVar, rf rfVar) {
        rfVar.o = -1;
        xe xeVar = rfVar.M;
        qf[] qfVarArr = rfVar.T;
        xe xeVar2 = rfVar.L;
        xe xeVar3 = rfVar.J;
        xe xeVar4 = rfVar.K;
        xe xeVar5 = rfVar.I;
        rfVar.p = -1;
        qf[] qfVarArr2 = sfVar.T;
        qf qfVar = qfVarArr2[0];
        qf qfVar2 = qf.WRAP_CONTENT;
        if (qfVar != qfVar2 && qfVarArr[0] == qf.MATCH_PARENT) {
            int i2 = xeVar5.g;
            int q = sfVar.q() - xeVar4.g;
            xeVar5.i = xxVar.k(xeVar5);
            xeVar4.i = xxVar.k(xeVar4);
            xxVar.d(xeVar5.i, i2);
            xxVar.d(xeVar4.i, q);
            rfVar.o = 2;
            rfVar.Z = i2;
            int i3 = q - i2;
            rfVar.V = i3;
            int i4 = rfVar.c0;
            if (i3 < i4) {
                rfVar.V = i4;
            }
        }
        if (qfVarArr2[1] == qfVar2 || qfVarArr[1] != qf.MATCH_PARENT) {
            return;
        }
        int i5 = xeVar3.g;
        int k2 = sfVar.k() - xeVar2.g;
        xeVar3.i = xxVar.k(xeVar3);
        xeVar2.i = xxVar.k(xeVar2);
        xxVar.d(xeVar3.i, i5);
        xxVar.d(xeVar2.i, k2);
        if (rfVar.b0 > 0 || rfVar.h0 == 8) {
            je0 k3 = xxVar.k(xeVar);
            xeVar.i = k3;
            xxVar.d(k3, rfVar.b0 + i5);
        }
        rfVar.p = 2;
        rfVar.a0 = i5;
        int i6 = k2 - i5;
        rfVar.W = i6;
        int i7 = rfVar.d0;
        if (i6 < i7) {
            rfVar.W = i7;
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void r(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            s9.k(r7.a(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static int s(b bVar, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? bVar.checkPermission(str, Process.myPid(), Process.myUid()) : new f40(bVar).a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final int t(eb0 eb0Var, String str) {
        eb0Var.getClass();
        int columnCount = eb0Var.getColumnCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount) {
                i3 = -1;
                break;
            }
            if (str.equals(eb0Var.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = eb0Var.getColumnCount();
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(eb0Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public static dy u() {
        return new dy(10);
    }

    public static final lb0 v(a30 a30Var) {
        LinkedHashMap linkedHashMap = a30Var.a;
        sb0 sb0Var = (sb0) linkedHashMap.get(k);
        Bundle bundle = null;
        if (sb0Var == null) {
            s9.k("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        tm0 tm0Var = (tm0) linkedHashMap.get(l);
        if (tm0Var == null) {
            s9.k("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(m);
        String str = (String) linkedHashMap.get(mv.n);
        if (str == null) {
            s9.k("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        qb0 x = sb0Var.a().x();
        ob0 ob0Var = x instanceof ob0 ? (ob0) x : null;
        if (ob0Var == null) {
            s9.u("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        SavedStateHandlesVM E = E(tm0Var);
        lb0 lb0Var = E.getHandles().get(str);
        if (lb0Var != null) {
            return lb0Var;
        }
        ob0Var.b();
        Bundle bundle3 = ob0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = j((k50[]) Arrays.copyOf(new k50[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                ob0Var.c = null;
            }
            bundle = bundle4;
        }
        lb0 l2 = mv.l(bundle, bundle2);
        E.getHandles().put(str, l2);
        return l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress w(String str, int i2, int i3) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && uf0.q(str, "::", i5, false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (uf0.q(str, ":", i5, false)) {
                    i5++;
                } else {
                    if (!uf0.q(str, ".", i5, false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (mv.i(charAt, 48) < 0 || mv.i(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int o = zk0.o(str.charAt(i5));
                if (o == -1) {
                    break;
                }
                i102 = (i102 << 4) + o;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final void x(sb0 sb0Var) {
        gx gxVar = sb0Var.e().c;
        if (gxVar != gx.INITIALIZED && gxVar != gx.CREATED) {
            s9.k("Failed requirement.");
        } else if (sb0Var.a().x() == null) {
            ob0 ob0Var = new ob0(sb0Var.a(), (tm0) sb0Var);
            sb0Var.a().N("androidx.lifecycle.internal.SavedStateHandlesProvider", ob0Var);
            sb0Var.e().a(new u70(4, ob0Var));
        }
    }

    public static final boolean y(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static Integer z(Context context, int i2) {
        TypedValue J = n9.J(context.getTheme(), i2);
        if (J != null) {
            return Integer.valueOf(W(context, J));
        }
        return null;
    }

    public abstract void L(Throwable th);

    public abstract View M(int i2);

    public abstract void N(int i2);

    public abstract void O(Typeface typeface);

    public abstract boolean P();

    public abstract void Q(wi wiVar);

    public void k(int i2) {
        new Handler(Looper.getMainLooper()).post(new f00(i2, 1, this));
    }
}
