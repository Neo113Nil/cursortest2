package a;

import A.AbstractC0017m;
import A.C0005a;
import A.T;
import A.U;
import A0.K;
import B0.E;
import B0.G;
import D0.d;
import G.C0192d;
import G.C0208l;
import G.C0212n;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import M0.b;
import M0.k;
import M2.F;
import M2.J;
import P0.C0260b;
import P0.C0261c;
import P0.C0263e;
import P0.C0264f;
import P0.v;
import P0.w;
import P0.y;
import S.c;
import S.g;
import S.o;
import W2.B;
import W2.C0294p;
import Z.C0306c;
import Z.C0310g;
import Z.C0316m;
import Z1.i;
import Z1.j;
import Z1.t;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0494b;
import b3.q;
import e0.AbstractC0557b;
import f0.C0585f;
import i3.V;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m.O;
import m.P;
import m3.s;
import p0.C0949J;
import p0.C0973i;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;
import u3.l;
import w2.C1294c;
import z2.AbstractC1428l;
import z2.C1436t;
import z3.AbstractC1443a;
import z3.C1451i;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345a {

    /* renamed from: a, reason: collision with root package name */
    public static C0310g f4743a;

    /* renamed from: b, reason: collision with root package name */
    public static C0306c f4744b;

    /* renamed from: c, reason: collision with root package name */
    public static C0494b f4745c;

    /* renamed from: d, reason: collision with root package name */
    public static C0585f f4746d;

    /* renamed from: e, reason: collision with root package name */
    public static C0585f f4747e;

    /* renamed from: f, reason: collision with root package name */
    public static C0585f f4748f;

    /* renamed from: g, reason: collision with root package name */
    public static String f4749g;

    /* renamed from: h, reason: collision with root package name */
    public static int f4750h;

    public AbstractC0345a() {
        new ConcurrentHashMap();
    }

    public static final boolean A(long j4) {
        return (j4 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static String C(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        StringBuilder sb = new StringBuilder("sha256/");
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        C1451i c1451i = C1451i.f12000j;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        int length = encoded.length;
        int i2 = 0;
        s.g(encoded.length, 0, length);
        byte[] i4 = C1436t.i(encoded, 0, length);
        C1451i c1451i2 = new C1451i(i4);
        Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(i4, 0, c1451i2.c());
        byte[] digest = messageDigest.digest();
        Intrinsics.c(digest);
        new C1451i(digest);
        byte[] map = AbstractC1443a.f11983a;
        Intrinsics.checkNotNullParameter(digest, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i5 = 0;
        while (i2 < length2) {
            byte b4 = digest[i2];
            int i6 = i2 + 2;
            byte b5 = digest[i2 + 1];
            i2 += 3;
            byte b6 = digest[i6];
            bArr[i5] = map[(b4 & 255) >> 2];
            bArr[i5 + 1] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr[i5 + 2] = map[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i5 += 4;
            bArr[i7] = map[b6 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b7 = digest[i2];
            bArr[i5] = map[(b7 & 255) >> 2];
            bArr[1 + i5] = map[(b7 & 3) << 4];
            bArr[2 + i5] = 61;
            bArr[i5 + 3] = 61;
        } else if (length3 == 2) {
            int i8 = i2 + 1;
            byte b8 = digest[i2];
            byte b9 = digest[i8];
            bArr[i5] = map[(b8 & 255) >> 2];
            bArr[1 + i5] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr[i5 + 2] = map[(b9 & 15) << 2];
            bArr[i5 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        sb.append(new String(bArr, Charsets.UTF_8));
        return sb.toString();
    }

    public static final void D(Object[] objArr, int i2, int i4) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i2 < i4) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i2] = null;
            i2++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 A0.L, still in use, count: 2, list:
          (r2v0 A0.L) from 0x00d6: MOVE (r25v0 A0.L) = (r2v0 A0.L)
          (r2v0 A0.L) from 0x0085: MOVE (r25v2 A0.L) = (r2v0 A0.L)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final A0.L E(A0.L r26, M0.k r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0345a.E(A0.L, M0.k):A0.L");
    }

    public static final Object H(q qVar, q qVar2, Function2 function2) {
        Object c0294p;
        Object V3;
        try {
            J.d(2, function2);
            c0294p = function2.h(qVar2, qVar);
        } catch (Throwable th) {
            c0294p = new C0294p(th, false);
        }
        D2.a aVar = D2.a.f2163d;
        if (c0294p == aVar || (V3 = qVar.V(c0294p)) == B.f4212e) {
            return aVar;
        }
        if (V3 instanceof C0294p) {
            throw ((C0294p) V3).f4291a;
        }
        return B.p(V3);
    }

    public static final void I(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final long J(long j4, long j5) {
        int c4;
        int e4 = K.e(j4);
        int d4 = K.d(j4);
        if (K.e(j5) >= K.d(j4) || K.e(j4) >= K.d(j5)) {
            if (d4 > K.e(j5)) {
                e4 -= K.c(j5);
                c4 = K.c(j5);
                d4 -= c4;
            }
        } else if (K.e(j5) > K.e(j4) || K.d(j4) > K.d(j5)) {
            if (K.e(j4) > K.e(j5) || K.d(j5) > K.d(j4)) {
                int e5 = K.e(j5);
                if (e4 >= K.d(j5) || e5 > e4) {
                    d4 = K.e(j5);
                } else {
                    e4 = K.e(j5);
                    c4 = K.c(j5);
                }
            } else {
                c4 = K.c(j5);
            }
            d4 -= c4;
        } else {
            e4 = K.e(j5);
            d4 = e4;
        }
        return M1.a.j(e4, d4);
    }

    public static void K(Parcel parcel, int i2, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int N3 = N(parcel, i2);
        parcelable.writeToParcel(parcel, i4);
        O(parcel, N3);
    }

    public static void L(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int N3 = N(parcel, i2);
        parcel.writeString(str);
        O(parcel, N3);
    }

    public static void M(Parcel parcel, int i2, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int N3 = N(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        O(parcel, N3);
    }

    public static int N(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void O(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void P(Parcel parcel, int i2, int i4) {
        parcel.writeInt(i2 | (i4 << 16));
    }

    public static final void a(Function0 function0, w wVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        int i5;
        int i6;
        Object obj;
        c0216p.U(-2032877254);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(wVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        int i7 = i4;
        if ((i7 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            View view = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
            b bVar = (b) c0216p.k(AbstractC1144g0.f10218f);
            k kVar = (k) c0216p.k(AbstractC1144g0.f10224l);
            C0212n M3 = C0192d.M(c0216p);
            InterfaceC0191c0 N3 = C0192d.N(aVar, c0216p);
            UUID uuid = (UUID) l.s0(new Object[0], null, C0264f.f3722e, c0216p, 3072, 6);
            boolean f4 = c0216p.f(view) | c0216p.f(bVar);
            Object I3 = c0216p.I();
            Object obj2 = C0208l.f2826a;
            if (f4 || I3 == obj2) {
                i5 = i7;
                i6 = 32;
                y yVar = new y(function0, wVar, view, kVar, bVar, uuid);
                O.a aVar2 = new O.a(488261145, true, new C0263e(1, N3));
                v vVar = yVar.f3778m;
                vVar.setParentCompositionContext(M3);
                vVar.f3765p.setValue(aVar2);
                vVar.f3767r = true;
                if (vVar.f10164j == null && !vVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                vVar.c();
                c0216p.c0(yVar);
                obj = yVar;
            } else {
                i5 = i7;
                i6 = 32;
                obj = I3;
            }
            y yVar2 = (y) obj;
            boolean h4 = c0216p.h(yVar2);
            Object I4 = c0216p.I();
            if (h4 || I4 == obj2) {
                I4 = new C0260b(yVar2, 0);
                c0216p.c0(I4);
            }
            C0192d.d(yVar2, (Function1) I4, c0216p);
            boolean h5 = c0216p.h(yVar2) | ((i5 & 14) == 4) | ((i5 & 112) == i6) | c0216p.f(kVar);
            Object I5 = c0216p.I();
            if (h5 || I5 == obj2) {
                I5 = new C0261c(yVar2, function0, wVar, kVar, 0);
                c0216p.c0(I5);
            }
            C0192d.g((Function0) I5, c0216p);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(function0, wVar, aVar, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC0557b abstractC0557b, o oVar, c cVar, C0949J c0949j, float f4, C0316m c0316m, C0216p c0216p, int i2, int i4) {
        int i5;
        C0949J c0949j2;
        float f5;
        C0316m c0316m2;
        int i6;
        C0949J c0949j3;
        c cVar2;
        C0222s0 s4;
        c0216p.U(1142754848);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.h(abstractC0557b) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.f(oVar) ? 256 : 128;
        }
        int i7 = i5 | 3072;
        int i8 = i4 & 16;
        if (i8 != 0) {
            i7 = i5 | 27648;
        } else if ((i2 & 24576) == 0) {
            c0949j2 = c0949j;
            i7 |= c0216p.f(c0949j2) ? 16384 : 8192;
            if (((i7 | 1769472) & 599187) == 599186 || !c0216p.z()) {
                g gVar = S.b.f3956k;
                if (i8 != 0) {
                    c0949j2 = C0973i.f9043b;
                }
                c0216p.S(1040398089);
                c0216p.q(false);
                f5 = 1.0f;
                c0316m2 = null;
                o d4 = androidx.compose.ui.draw.a.d(l.V(oVar.h(S.l.f3977a)), abstractC0557b, gVar, c0949j2, 1.0f, null, 2);
                O o4 = O.f8037a;
                i6 = c0216p.f2861P;
                o d5 = S.a.d(c0216p, d4);
                InterfaceC0213n0 m4 = c0216p.m();
                InterfaceC1070k.f9822h.getClass();
                C1068i c1068i = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.f0();
                } else {
                    c0216p.l(c1068i);
                }
                C0192d.R(c0216p, o4, C1069j.f9820f);
                C0192d.R(c0216p, m4, C1069j.f9819e);
                C0192d.R(c0216p, d5, C1069j.f9818d);
                C1067h c1067h = C1069j.f9821g;
                if (!c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                    AbstractC0017m.r(i6, c0216p, i6, c1067h);
                }
                c0216p.q(true);
                c0949j3 = c0949j2;
                cVar2 = gVar;
            } else {
                c0216p.N();
                f5 = f4;
                c0316m2 = c0316m;
                c0949j3 = c0949j2;
                cVar2 = cVar;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new P(abstractC0557b, oVar, cVar2, c0949j3, f5, c0316m2, i2, i4);
                return;
            }
            return;
        }
        c0949j2 = c0949j;
        if (((i7 | 1769472) & 599187) == 599186) {
        }
        g gVar2 = S.b.f3956k;
        if (i8 != 0) {
        }
        c0216p.S(1040398089);
        c0216p.q(false);
        f5 = 1.0f;
        c0316m2 = null;
        o d42 = androidx.compose.ui.draw.a.d(l.V(oVar.h(S.l.f3977a)), abstractC0557b, gVar2, c0949j2, 1.0f, null, 2);
        O o42 = O.f8037a;
        i6 = c0216p.f2861P;
        o d52 = S.a.d(c0216p, d42);
        InterfaceC0213n0 m42 = c0216p.m();
        InterfaceC1070k.f9822h.getClass();
        C1068i c1068i2 = C1069j.f9816b;
        c0216p.W();
        if (c0216p.f2860O) {
        }
        C0192d.R(c0216p, o42, C1069j.f9820f);
        C0192d.R(c0216p, m42, C1069j.f9819e);
        C0192d.R(c0216p, d52, C1069j.f9818d);
        C1067h c1067h2 = C1069j.f9821g;
        if (!c0216p.f2860O) {
        }
        AbstractC0017m.r(i6, c0216p, i6, c1067h2);
        c0216p.q(true);
        c0949j3 = c0949j2;
        cVar2 = gVar2;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final long c(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final void d(o oVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-2105228848);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            T t4 = T.f55a;
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, oVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            int i6 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, t4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            aVar.h(c0216p, Integer.valueOf((i6 >> 6) & 14));
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new U(oVar, aVar, i2, 0);
        }
    }

    public static final void e(o oVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1177876616);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            P0.g gVar = P0.g.f3726b;
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, oVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            int i6 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, gVar, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            aVar.h(c0216p, Integer.valueOf((i6 >> 6) & 14));
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new U(oVar, aVar, i2, 1);
        }
    }

    public static final boolean f(Object[] objArr, int i2, int i4, List list) {
        if (i4 != list.size()) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!Intrinsics.a(objArr[i2 + i5], list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public static final String g(Object[] objArr, int i2, int i4, AbstractC1428l abstractC1428l) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i5];
            if (obj == abstractC1428l) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final j3.k h(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        j3.k kVar = decoder instanceof j3.k ? (j3.k) decoder : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + F.a(decoder.getClass()));
    }

    public static final Bundle i(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f7485d;
            Object obj = pair.f7486e;
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
                Intrinsics.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                X0.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                X0.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void j(int i2, int i4) {
        if (i2 < 0 || i2 >= i4) {
            throw new IndexOutOfBoundsException(r0.B.b(i2, i4, "index: ", ", size: "));
        }
    }

    public static final void k(int i2, int i4) {
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException(r0.B.b(i2, i4, "index: ", ", size: "));
        }
    }

    public static final void l(int i2, int i4, int i5) {
        if (i2 >= 0 && i4 <= i5) {
            if (i2 > i4) {
                throw new IllegalArgumentException(r0.B.b(i2, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static void p(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (i iVar : (Set) it2.next()) {
                        for (Z1.k kVar : iVar.f4581a.f4563c) {
                            if (kVar.f4588c == 0) {
                                Set<i> set = (Set) hashMap.get(new j(kVar.f4586a, kVar.f4587b == 2));
                                if (set != null) {
                                    for (i iVar2 : set) {
                                        iVar.f4582b.add(iVar2);
                                        iVar2.f4583c.add(iVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    i iVar3 = (i) it4.next();
                    if (iVar3.f4583c.isEmpty()) {
                        hashSet2.add(iVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    i iVar4 = (i) hashSet2.iterator().next();
                    hashSet2.remove(iVar4);
                    i2++;
                    Iterator it5 = iVar4.f4582b.iterator();
                    while (it5.hasNext()) {
                        i iVar5 = (i) it5.next();
                        iVar5.f4583c.remove(iVar4);
                        if (iVar5.f4583c.isEmpty()) {
                            hashSet2.add(iVar5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    i iVar6 = (i) it6.next();
                    if (!iVar6.f4583c.isEmpty() && !iVar6.f4582b.isEmpty()) {
                        arrayList2.add(iVar6.f4581a);
                    }
                }
                throw new Z1.l("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            Z1.b bVar = (Z1.b) it.next();
            i iVar7 = new i(bVar);
            for (t tVar : bVar.f4562b) {
                boolean z4 = bVar.f4564d == 0;
                j jVar = new j(tVar, !z4);
                if (!hashMap.containsKey(jVar)) {
                    hashMap.put(jVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(jVar);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set2.add(iVar7);
            }
        }
    }

    public static final boolean q(int i2, int i4) {
        return i2 == i4;
    }

    public static final S2.b s(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof g3.b) {
            ((g3.b) serialDescriptor).getClass();
            return null;
        }
        if (serialDescriptor instanceof V) {
            return s(((V) serialDescriptor).f7047a);
        }
        return null;
    }

    public static final float t(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        E e4 = G.f917a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : d.f2136a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float u(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        E e4 = G.f917a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? d.f2136a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static Set v() {
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String w() {
        BufferedReader bufferedReader;
        String processName;
        if (f4749g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f4749g = processName;
            } else {
                int i2 = f4750h;
                if (i2 == 0) {
                    i2 = Process.myPid();
                    f4750h = i2;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i2 > 0) {
                    try {
                        String str2 = "/proc/" + i2 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                H1.o.d(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f4749g = str;
            }
        }
        return f4749g;
    }

    public static final boolean y(long j4) {
        long j5 = (j4 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j5) & (j5 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean z(long j4) {
        return (j4 & 9223372034707292159L) != 9205357640488583168L;
    }

    public abstract Object B(Intent intent, int i2);

    public abstract void F(boolean z4);

    public abstract void G(boolean z4);

    public abstract Typeface m(Context context, Y0.c[] cVarArr);

    public abstract Intent n(Context context, Object obj);

    public Y0.c r(Y0.c[] cVarArr) {
        Y0.c cVar = null;
        int i2 = Integer.MAX_VALUE;
        for (Y0.c cVar2 : cVarArr) {
            int abs = (cVar2.f4396d ? 1 : 0) + (Math.abs(cVar2.f4395c - 400) * 2);
            if (cVar == null || i2 > abs) {
                cVar = cVar2;
                i2 = abs;
            }
        }
        return cVar;
    }

    public C1294c x(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }
}
