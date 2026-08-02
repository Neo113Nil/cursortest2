package G1;

import B1.j;
import E.AbstractC0005f;
import F3.g;
import K.C0054c;
import K.C0060i;
import K.C0063l;
import K.M;
import K.b0;
import K.g0;
import K3.i;
import R1.o;
import S1.d;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.InterfaceC0113f;
import W.J;
import W.t;
import W.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import b3.InterfaceC0264a;
import c0.C0270c;
import c3.C0297i;
import e0.C0392b;
import g3.EnumC0441a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.impl.Zo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.Build;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import p.e;
import q0.j0;
import t1.h;
import v2.G;
import v2.I;
import v2.a0;
import v2.r;
import x3.C1540O;
import x3.C1552l;
import x3.C1559t;
import x3.InterfaceC1538M;
import x3.InterfaceC1560u;
import x3.T;
import x3.d0;

/* loaded from: classes.dex */
public final class c implements N1.b, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f834a;

    /* renamed from: b, reason: collision with root package name */
    public Object f835b;

    /* renamed from: c, reason: collision with root package name */
    public Object f836c;

    /* renamed from: d, reason: collision with root package name */
    public Object f837d;

    /* renamed from: e, reason: collision with root package name */
    public Object f838e;

    public c(InterfaceC0264a interfaceC0264a, InterfaceC0264a interfaceC0264a2, j jVar, InterfaceC0264a interfaceC0264a3) {
        this.f834a = 5;
        this.f835b = interfaceC0264a;
        this.f836c = interfaceC0264a2;
        this.f837d = jVar;
        this.f838e = interfaceC0264a3;
    }

    public static void i(long j4, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j4) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hashMap.remove(arrayList.get(i4));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027b  */
    @Override // V0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        boolean z;
        V.b bVar;
        int i6;
        int i7;
        V.b bVar2;
        int C4;
        V.b bVar3;
        a0 a0Var;
        boolean z4;
        boolean z5;
        Object[] objArr;
        Rect rect;
        int i8 = this.f834a;
        int i9 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i10 = 4;
        boolean z6 = false;
        int i11 = 2;
        boolean z7 = true;
        switch (i8) {
            case 7:
                Y0.a aVar = (Y0.a) this.f837d;
                u uVar = (u) this.f836c;
                u uVar2 = (u) this.f835b;
                uVar2.K(i4 + i5, bArr);
                uVar2.M(i4);
                if (((Inflater) this.f838e) == null) {
                    this.f838e = new Inflater();
                }
                if (J.L(uVar2, uVar, (Inflater) this.f838e)) {
                    uVar2.K(uVar.f3353c, uVar.f3351a);
                }
                aVar.f3759d = 0;
                int[] iArr = aVar.f3757b;
                u uVar3 = aVar.f3756a;
                aVar.f3760e = 0;
                aVar.f3761f = 0;
                aVar.f3762g = 0;
                aVar.f3763h = 0;
                aVar.f3764i = 0;
                uVar3.J(0);
                aVar.f3758c = false;
                ArrayList arrayList = new ArrayList();
                for (int i12 = 3; uVar2.a() >= i12; i12 = 3) {
                    int i13 = uVar2.f3353c;
                    int z8 = uVar2.z();
                    int G4 = uVar2.G();
                    int i14 = uVar2.f3352b + G4;
                    if (i14 > i13) {
                        uVar2.M(i13);
                        z = z7;
                        bVar2 = null;
                    } else {
                        char c4 = 128;
                        if (z8 != 128) {
                            switch (z8) {
                                case C0583e9.f11744D /* 20 */:
                                    if (G4 % 5 == i11) {
                                        uVar2.N(i11);
                                        Arrays.fill(iArr, 0);
                                        int i15 = G4 / 5;
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            int z9 = uVar2.z();
                                            char c5 = c4;
                                            double z10 = uVar2.z();
                                            double z11 = uVar2.z() - 128;
                                            double z12 = uVar2.z() - 128;
                                            iArr[z9] = J.j((int) ((z12 * 1.772d) + z10), 0, KotlinVersion.MAX_COMPONENT_VALUE) | (uVar2.z() << 24) | (J.j((int) ((1.402d * z11) + z10), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (J.j((int) ((z10 - (0.34414d * z12)) - (z11 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8);
                                            i16++;
                                            c4 = c5;
                                            i15 = i15;
                                            z7 = true;
                                        }
                                        z = z7;
                                        aVar.f3758c = z;
                                        break;
                                    }
                                    z = z7;
                                case 21:
                                    if (G4 >= 4) {
                                        uVar2.N(3);
                                        int i17 = G4 - 4;
                                        if ((128 & uVar2.z()) != 0 ? z7 : false) {
                                            if (i17 >= 7 && (C4 = uVar2.C()) >= 4) {
                                                aVar.f3763h = uVar2.G();
                                                aVar.f3764i = uVar2.G();
                                                uVar3.J(C4 - 4);
                                                i17 = G4 - 11;
                                            }
                                        }
                                        int i18 = uVar3.f3352b;
                                        int i19 = uVar3.f3353c;
                                        if (i18 < i19 && i17 > 0) {
                                            int min = Math.min(i17, i19 - i18);
                                            uVar2.k(uVar3.f3351a, i18, min);
                                            uVar3.M(i18 + min);
                                        }
                                    }
                                    z = z7;
                                    break;
                                case Build.API_LEVELS.API_22 /* 22 */:
                                    if (G4 >= 19) {
                                        aVar.f3759d = uVar2.G();
                                        aVar.f3760e = uVar2.G();
                                        uVar2.N(11);
                                        aVar.f3761f = uVar2.G();
                                        aVar.f3762g = uVar2.G();
                                    }
                                    z = z7;
                                default:
                                    z = z7;
                            }
                            bVar = null;
                        } else {
                            z = z7;
                            if (aVar.f3759d == 0 || aVar.f3760e == 0 || aVar.f3763h == 0 || aVar.f3764i == 0 || (i6 = uVar3.f3353c) == 0 || uVar3.f3352b != i6 || !aVar.f3758c) {
                                bVar = null;
                            } else {
                                uVar3.M(0);
                                int i20 = aVar.f3763h * aVar.f3764i;
                                int[] iArr2 = new int[i20];
                                int i21 = 0;
                                while (i21 < i20) {
                                    int z13 = uVar3.z();
                                    if (z13 != 0) {
                                        i7 = i21 + 1;
                                        iArr2[i21] = iArr[z13];
                                    } else {
                                        int z14 = uVar3.z();
                                        if (z14 != 0) {
                                            i7 = ((z14 & 64) == 0 ? z14 & 63 : ((z14 & 63) << 8) | uVar3.z()) + i21;
                                            Arrays.fill(iArr2, i21, i7, (z14 & 128) == 0 ? iArr[0] : iArr[uVar3.z()]);
                                        }
                                    }
                                    i21 = i7;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.f3763h, aVar.f3764i, Bitmap.Config.ARGB_8888);
                                float f4 = aVar.f3761f;
                                float f5 = aVar.f3759d;
                                float f6 = f4 / f5;
                                float f7 = aVar.f3762g;
                                float f8 = aVar.f3760e;
                                bVar = new V.b(null, null, null, createBitmap, f7 / f8, 0, 0, f6, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f3763h / f5, aVar.f3764i / f8, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                            }
                            aVar.f3759d = 0;
                            aVar.f3760e = 0;
                            aVar.f3761f = 0;
                            aVar.f3762g = 0;
                            aVar.f3763h = 0;
                            aVar.f3764i = 0;
                            uVar3.J(0);
                            aVar.f3758c = false;
                        }
                        uVar2.M(i14);
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    z7 = z;
                    i11 = 2;
                }
                interfaceC0113f.accept(new V0.a(-9223372036854775807L, -9223372036854775807L, arrayList));
                break;
            default:
                u uVar4 = (u) this.f835b;
                uVar4.K(i4 + i5, bArr);
                uVar4.M(i4);
                u uVar5 = (u) this.f836c;
                d1.a aVar2 = (d1.a) this.f837d;
                if (((Inflater) this.f838e) == null) {
                    this.f838e = new Inflater();
                }
                if (J.L(uVar4, uVar5, (Inflater) this.f838e)) {
                    uVar4.K(uVar5.f3353c, uVar5.f3351a);
                }
                aVar2.f8208c = false;
                aVar2.f8212g = null;
                aVar2.f8213h = -1;
                aVar2.f8214i = -1;
                int a3 = uVar4.a();
                if (a3 >= 2 && uVar4.G() == a3) {
                    if (aVar2.f8209d == null) {
                        AbstractC0108a.s("VobsubParser", "Skipping SPU (no palette)");
                    } else if (aVar2.f8207b) {
                        int i22 = uVar4.f3352b - 2;
                        uVar4.M(uVar4.G() + i22);
                        while (true) {
                            if (uVar4.a() < i10) {
                                z4 = z6;
                                z5 = z4;
                            } else {
                                int i23 = uVar4.f3352b;
                                uVar4.N(2);
                                int G5 = uVar4.G() + i22;
                                z4 = (G5 == i23 || G5 >= uVar4.f3353c) ? z6 : true;
                                int i24 = z4 ? G5 : uVar4.f3353c;
                                Object[] objArr2 = true;
                                while (uVar4.f3352b < i24 && objArr2 != false) {
                                    int[] iArr3 = aVar2.f8206a;
                                    boolean z15 = z6;
                                    int z16 = uVar4.z();
                                    if (z16 != i9) {
                                        switch (z16) {
                                            case 0:
                                            case 1:
                                            case 2:
                                                objArr = true;
                                                break;
                                            case 3:
                                                if (uVar4.a() < 2) {
                                                    AbstractC0108a.s("VobsubParser", "Incomplete color command");
                                                    break;
                                                } else {
                                                    int z17 = uVar4.z();
                                                    int z18 = uVar4.z();
                                                    iArr3[3] = d1.a.a(aVar2.f8209d, z17 >> 4);
                                                    iArr3[2] = d1.a.a(aVar2.f8209d, z17 & 15);
                                                    iArr3[1] = d1.a.a(aVar2.f8209d, z18 >> 4);
                                                    iArr3[z15 ? 1 : 0] = d1.a.a(aVar2.f8209d, z18 & 15);
                                                    aVar2.f8208c = true;
                                                    objArr = true;
                                                    break;
                                                }
                                            case 4:
                                                if (uVar4.a() < 2) {
                                                    AbstractC0108a.s("VobsubParser", "Incomplete alpha command");
                                                    break;
                                                } else if (aVar2.f8208c) {
                                                    int z19 = uVar4.z();
                                                    int z20 = uVar4.z();
                                                    iArr3[3] = d1.a.c(iArr3[3], z19 >> 4);
                                                    iArr3[2] = d1.a.c(iArr3[2], z19 & 15);
                                                    iArr3[1] = d1.a.c(iArr3[1], z20 >> 4);
                                                    iArr3[z15 ? 1 : 0] = d1.a.c(iArr3[z15 ? 1 : 0], z20 & 15);
                                                    objArr = true;
                                                    break;
                                                } else {
                                                    AbstractC0108a.s("VobsubParser", "Ignoring alpha command before color command");
                                                    break;
                                                }
                                            case 5:
                                                if (uVar4.a() < 6) {
                                                    AbstractC0108a.s("VobsubParser", "Incomplete area command");
                                                    break;
                                                } else {
                                                    int z21 = uVar4.z();
                                                    int z22 = uVar4.z();
                                                    int i25 = (z21 << i10) | (z22 >> 4);
                                                    int z23 = ((z22 & 15) << 8) | uVar4.z();
                                                    int z24 = uVar4.z();
                                                    int z25 = uVar4.z();
                                                    aVar2.f8212g = new Rect(i25, (z24 << 4) | (z25 >> 4), z23 + 1, (((z25 & 15) << 8) | uVar4.z()) + 1);
                                                    objArr = true;
                                                    break;
                                                }
                                            case 6:
                                                if (uVar4.a() < i10) {
                                                    AbstractC0108a.s("VobsubParser", "Incomplete offsets command");
                                                    break;
                                                } else {
                                                    aVar2.f8213h = uVar4.G();
                                                    aVar2.f8214i = uVar4.G();
                                                    objArr = true;
                                                    break;
                                                }
                                            default:
                                                AbstractC0005f.u(z16, "Unrecognized command: ", "VobsubParser");
                                                break;
                                        }
                                        z6 = z15 ? 1 : 0;
                                        i9 = KotlinVersion.MAX_COMPONENT_VALUE;
                                        i10 = 4;
                                        objArr2 = objArr;
                                    }
                                    objArr = z15 ? 1 : 0;
                                    z6 = z15 ? 1 : 0;
                                    i9 = KotlinVersion.MAX_COMPONENT_VALUE;
                                    i10 = 4;
                                    objArr2 = objArr;
                                }
                                z5 = z6;
                                if (z4) {
                                    uVar4.M(G5);
                                }
                            }
                            if (z4) {
                                i9 = KotlinVersion.MAX_COMPONENT_VALUE;
                                i10 = 4;
                                z6 = false;
                            } else if (aVar2.f8209d != null && aVar2.f8207b && aVar2.f8208c && (rect = aVar2.f8212g) != null && aVar2.f8213h != -1 && aVar2.f8214i != -1 && rect.width() >= 2 && aVar2.f8212g.height() >= 2) {
                                Rect rect2 = aVar2.f8212g;
                                int[] iArr4 = new int[rect2.height() * rect2.width()];
                                t tVar = new t();
                                uVar4.M(aVar2.f8213h);
                                tVar.p(uVar4);
                                aVar2.b(tVar, true, rect2, iArr4);
                                uVar4.M(aVar2.f8214i);
                                tVar.p(uVar4);
                                aVar2.b(tVar, z5, rect2, iArr4);
                                bVar3 = new V.b(null, null, null, Bitmap.createBitmap(iArr4, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.f8211f, 0, 0, rect2.left / aVar2.f8210e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar2.f8210e, rect2.height() / aVar2.f8211f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                                if (bVar3 != null) {
                                    a0Var = I.o(bVar3);
                                } else {
                                    G g4 = I.f15571b;
                                    a0Var = a0.f15605e;
                                }
                                interfaceC0113f.accept(new V0.a(-9223372036854775807L, 5000000L, a0Var));
                                break;
                            }
                        }
                    } else {
                        AbstractC0108a.s("VobsubParser", "Skipping SPU (no plane)");
                    }
                    z5 = false;
                    if (aVar2.f8209d != null) {
                        Rect rect22 = aVar2.f8212g;
                        int[] iArr42 = new int[rect22.height() * rect22.width()];
                        t tVar2 = new t();
                        uVar4.M(aVar2.f8213h);
                        tVar2.p(uVar4);
                        aVar2.b(tVar2, true, rect22, iArr42);
                        uVar4.M(aVar2.f8214i);
                        tVar2.p(uVar4);
                        aVar2.b(tVar2, z5, rect22, iArr42);
                        bVar3 = new V.b(null, null, null, Bitmap.createBitmap(iArr42, rect22.width(), rect22.height(), Bitmap.Config.ARGB_8888), rect22.top / aVar2.f8211f, 0, 0, rect22.left / aVar2.f8210e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect22.width() / aVar2.f8210e, rect22.height() / aVar2.f8211f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                        if (bVar3 != null) {
                        }
                        interfaceC0113f.accept(new V0.a(-9223372036854775807L, 5000000L, a0Var));
                    }
                }
                bVar3 = null;
                if (bVar3 != null) {
                }
                interfaceC0113f.accept(new V0.a(-9223372036854775807L, 5000000L, a0Var));
                break;
        }
    }

    @Override // V0.l
    public int c() {
        switch (this.f834a) {
        }
        return 2;
    }

    public ArrayList d(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f835b;
        i(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f836c;
        i(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0392b c0392b = (C0392b) list.get(i4);
            if (!hashMap.containsKey(c0392b.f8343b) && !hashMap2.containsKey(Integer.valueOf(c0392b.f8344c))) {
                arrayList.add(c0392b);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(h3.c cVar) {
        C0060i c0060i;
        int i4;
        c cVar2;
        C0054c c0054c;
        M m4 = (M) this.f838e;
        if (cVar instanceof C0060i) {
            c0060i = (C0060i) cVar;
            int i5 = c0060i.f1369d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0060i.f1369d = i5 - Integer.MIN_VALUE;
                Object obj = c0060i.f1367b;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = c0060i.f1369d;
                if (i4 != 0) {
                    O3.l.w(obj);
                    List list = (List) this.f837d;
                    if (list == null || list.isEmpty()) {
                        c0060i.f1366a = this;
                        c0060i.f1369d = 1;
                        obj = M.f(m4, false, c0060i);
                        if (obj != enumC0441a) {
                            cVar2 = this;
                            c0054c = (C0054c) obj;
                        }
                    } else {
                        g0 g4 = m4.g();
                        C0063l c0063l = new C0063l(m4, this, null);
                        c0060i.f1366a = this;
                        c0060i.f1369d = 2;
                        obj = g4.b(c0063l, c0060i);
                        if (obj != enumC0441a) {
                            cVar2 = this;
                            c0054c = (C0054c) obj;
                        }
                    }
                    return enumC0441a;
                }
                if (i4 == 1) {
                    cVar2 = c0060i.f1366a;
                    O3.l.w(obj);
                    c0054c = (C0054c) obj;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = c0060i.f1366a;
                    O3.l.w(obj);
                    c0054c = (C0054c) obj;
                }
                ((M) cVar2.f838e).f1280h.o(c0054c);
                return C0297i.f5732a;
            }
        }
        c0060i = new C0060i(this, cVar);
        Object obj2 = c0060i.f1367b;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = c0060i.f1369d;
        if (i4 != 0) {
        }
        ((M) cVar2.f838e).f1280h.o(c0054c);
        return C0297i.f5732a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f838e;
        synchronized (this) {
            if (!arrayDeque.remove(iVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            byte[] bArr = H3.b.f1103a;
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = ((ArrayDeque) this.f836c).iterator();
                    kotlin.jvm.internal.i.d(it, "readyAsyncCalls.iterator()");
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        int size = ((ArrayDeque) this.f837d).size();
                        synchronized (this) {
                            if (size < 64) {
                                throw null;
                            }
                        }
                        if (arrayList.size() <= 0) {
                            if (arrayList.get(0) != null) {
                                throw new ClassCastException();
                            }
                            synchronized (this) {
                                try {
                                    if (((ThreadPoolExecutor) this.f835b) == null) {
                                        TimeUnit timeUnit = TimeUnit.SECONDS;
                                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                                        String name = kotlin.jvm.internal.i.h(" Dispatcher", H3.b.f1108f);
                                        kotlin.jvm.internal.i.e(name, "name");
                                        this.f835b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new H3.a(name, false));
                                    }
                                    kotlin.jvm.internal.i.b((ThreadPoolExecutor) this.f835b);
                                } finally {
                                }
                            }
                            throw null;
                        }
                        return;
                    }
                    synchronized (this) {
                        ((ArrayDeque) this.f837d).size();
                        ((ArrayDeque) this.f838e).size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList.size() <= 0) {
            }
        }
        byte[] bArr2 = H3.b.f1103a;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
        }
    }

    public File g(Context context) {
        ((a2.i) this.f836c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        return new o((Executor) ((InterfaceC0264a) this.f835b).get(), (d) ((InterfaceC0264a) this.f836c).get(), (R1.d) ((j) this.f837d).get(), (T1.c) ((InterfaceC0264a) this.f838e).get());
    }

    public void h(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((Zo) this.f838e) != null) {
            Log.d(FlutterJNI.TAG, format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0094, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [F3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(h3.c cVar) {
        K.a0 a0Var;
        int i4;
        F3.d dVar;
        c cVar2;
        F3.a aVar;
        Throwable th;
        c cVar3;
        try {
            if (cVar instanceof K.a0) {
                a0Var = (K.a0) cVar;
                int i5 = a0Var.f1330e;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    a0Var.f1330e = i5 - Integer.MIN_VALUE;
                    Object obj = a0Var.f1328c;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = a0Var.f1330e;
                    C0297i c0297i = C0297i.f5732a;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        if (!(((C1552l) this.f836c).A() instanceof InterfaceC1538M)) {
                            return c0297i;
                        }
                        dVar = (F3.d) this.f835b;
                        a0Var.f1326a = this;
                        a0Var.f1327b = dVar;
                        a0Var.f1330e = 1;
                        if (dVar.c(a0Var) != enumC0441a) {
                            cVar2 = this;
                        }
                        return enumC0441a;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = a0Var.f1327b;
                        cVar3 = a0Var.f1326a;
                        try {
                            O3.l.w(obj);
                            ((C1552l) cVar3.f836c).G(c0297i);
                            ((F3.d) aVar).e(null);
                            return c0297i;
                        } catch (Throwable th2) {
                            th = th2;
                            ((F3.d) aVar).e(null);
                            throw th;
                        }
                    }
                    ?? r22 = a0Var.f1327b;
                    cVar2 = a0Var.f1326a;
                    O3.l.w(obj);
                    dVar = r22;
                    if (((C1552l) cVar2.f836c).A() instanceof InterfaceC1538M) {
                        dVar.e(null);
                        return c0297i;
                    }
                    a0Var.f1326a = cVar2;
                    a0Var.f1327b = dVar;
                    a0Var.f1330e = 2;
                    if (cVar2.e(a0Var) != enumC0441a) {
                        aVar = dVar;
                        cVar3 = cVar2;
                        ((C1552l) cVar3.f836c).G(c0297i);
                        ((F3.d) aVar).e(null);
                        return c0297i;
                    }
                    return enumC0441a;
                }
            }
            if (((C1552l) cVar2.f836c).A() instanceof InterfaceC1538M) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((F3.d) aVar).e(null);
            throw th;
        }
        a0Var = new K.a0(this, cVar);
        Object obj2 = a0Var.f1328c;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = a0Var.f1330e;
        C0297i c0297i2 = C0297i.f5732a;
        if (i4 != 0) {
        }
    }

    public C0392b k(List list) {
        C0392b c0392b;
        HashMap hashMap = (HashMap) this.f837d;
        ArrayList d4 = d(list);
        if (d4.size() < 2) {
            return (C0392b) r.i(d4, null);
        }
        Collections.sort(d4, new B.c(2));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = ((C0392b) d4.get(0)).f8344c;
        int i6 = 0;
        while (true) {
            if (i6 >= d4.size()) {
                break;
            }
            C0392b c0392b2 = (C0392b) d4.get(i6);
            if (i5 == c0392b2.f8344c) {
                arrayList.add(new Pair(c0392b2.f8343b, Integer.valueOf(c0392b2.f8345d)));
                i6++;
            } else if (arrayList.size() == 1) {
                return (C0392b) d4.get(0);
            }
        }
        C0392b c0392b3 = (C0392b) hashMap.get(arrayList);
        if (c0392b3 != null) {
            return c0392b3;
        }
        List subList = d4.subList(0, arrayList.size());
        int i7 = 0;
        for (int i8 = 0; i8 < subList.size(); i8++) {
            i7 += ((C0392b) subList.get(i8)).f8345d;
        }
        int nextInt = ((Random) this.f838e).nextInt(i7);
        int i9 = 0;
        while (true) {
            if (i4 >= subList.size()) {
                c0392b = (C0392b) r.j(subList);
                break;
            }
            c0392b = (C0392b) subList.get(i4);
            i9 += c0392b.f8345d;
            if (nextInt < i9) {
                break;
            }
            i4++;
        }
        hashMap.put(arrayList, c0392b);
        return c0392b;
    }

    public c(InterfaceC1560u interfaceC1560u, g gVar, K.J j4) {
        this.f834a = 3;
        this.f835b = interfaceC1560u;
        this.f836c = j4;
        this.f837d = z3.j.a(Integer.MAX_VALUE, null, 6);
        this.f838e = new h(8);
        T t4 = (T) interfaceC1560u.g().n(C1559t.f16059b);
        if (t4 != null) {
            ((d0) t4).E(false, true, new C1540O(new b0(gVar, this)));
        }
    }

    public c(int i4) {
        this.f834a = i4;
        switch (i4) {
            case 1:
                this.f836c = new ArrayDeque();
                this.f837d = new ArrayDeque();
                this.f838e = new ArrayDeque();
                break;
            case 4:
                break;
            case 7:
                this.f835b = new u();
                this.f836c = new u();
                this.f837d = new Y0.a();
                break;
            case 10:
                Random random = new Random();
                this.f837d = new HashMap();
                this.f838e = random;
                this.f835b = new HashMap();
                this.f836c = new HashMap();
                break;
            case 12:
                this.f835b = new e(0);
                this.f836c = new SparseArray();
                this.f837d = new p.g();
                this.f838e = new e(0);
                break;
            default:
                a2.i iVar = new a2.i(6);
                a2.i iVar2 = new a2.i(5);
                this.f835b = new HashSet();
                this.f836c = iVar;
                this.f837d = iVar2;
                break;
        }
    }

    public c(List list) {
        int i4;
        this.f834a = 11;
        this.f835b = new u();
        this.f836c = new u();
        d1.a aVar = new d1.a();
        this.f837d = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = J.f3263a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(StringUtils.COMMA, -1);
                aVar.f8209d = new int[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int[] iArr = aVar.f8209d;
                    try {
                        i4 = Integer.parseInt(split[i5].trim(), 16);
                    } catch (RuntimeException e4) {
                        AbstractC0108a.t("VobsubParser", "Parsing color failed", e4);
                        i4 = 0;
                    }
                    iArr[i5] = i4;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    AbstractC0108a.s("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.f8210e = Integer.parseInt(split2[0]);
                        aVar.f8211f = Integer.parseInt(split2[1]);
                        aVar.f8207b = true;
                    } catch (RuntimeException e5) {
                        AbstractC0108a.t("VobsubParser", "Parsing IDX failed", e5);
                    }
                }
            }
        }
    }

    public c(Context context) {
        this.f834a = 9;
        this.f835b = context != null ? context.getApplicationContext() : null;
        this.f837d = c0.J.f5500a;
        if (context == null) {
            this.f838e = C0270c.f5542c;
        }
    }

    public c(a0 a0Var, X.j jVar, X.j jVar2, X.j jVar3) {
        Object obj;
        this.f834a = 6;
        if (a0Var != null) {
            obj = I.k(a0Var);
        } else {
            G g4 = I.f15571b;
            obj = a0.f15605e;
        }
        this.f835b = obj;
        this.f836c = jVar;
        this.f837d = jVar2;
        this.f838e = jVar3;
    }

    public c(M m4, List list) {
        this.f834a = 2;
        this.f838e = m4;
        this.f835b = new F3.d();
        C1552l c1552l = new C1552l(true);
        c1552l.D(null);
        this.f836c = c1552l;
        this.f837d = d3.i.n0(list);
    }

    public c(AudioTrack audioTrack, h hVar) {
        this.f834a = 8;
        this.f835b = audioTrack;
        this.f836c = hVar;
        Handler o = J.o(null);
        this.f837d = o;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: c0.x
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                G1.c cVar = G1.c.this;
                if (((x) cVar.f838e) == null) {
                    return;
                }
                AbstractC0108a.g().execute(new R1.e(cVar, 20, audioRouting));
            }
        };
        this.f838e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, o);
    }

    public c(j0 j0Var, boolean[] zArr) {
        this.f834a = 13;
        this.f835b = j0Var;
        this.f836c = zArr;
        int i4 = j0Var.f15034a;
        this.f837d = new boolean[i4];
        this.f838e = new boolean[i4];
    }
}
