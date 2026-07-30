package io.flutter.view;

import D.C0013n;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public String f2541A;

    /* renamed from: B, reason: collision with root package name */
    public String f2542B;

    /* renamed from: C, reason: collision with root package name */
    public String f2543C;

    /* renamed from: D, reason: collision with root package name */
    public String f2544D;

    /* renamed from: E, reason: collision with root package name */
    public int f2545E;

    /* renamed from: F, reason: collision with root package name */
    public int f2546F;

    /* renamed from: I, reason: collision with root package name */
    public long f2549I;

    /* renamed from: J, reason: collision with root package name */
    public int f2550J;

    /* renamed from: K, reason: collision with root package name */
    public int f2551K;

    /* renamed from: L, reason: collision with root package name */
    public int f2552L;

    /* renamed from: M, reason: collision with root package name */
    public float f2553M;

    /* renamed from: N, reason: collision with root package name */
    public String f2554N;

    /* renamed from: O, reason: collision with root package name */
    public String f2555O;

    /* renamed from: P, reason: collision with root package name */
    public float f2556P;

    /* renamed from: Q, reason: collision with root package name */
    public float f2557Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2558R;

    /* renamed from: S, reason: collision with root package name */
    public float f2559S;
    public float[] T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f2560U;

    /* renamed from: V, reason: collision with root package name */
    public g f2561V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f2564Y;
    public f Z;

    /* renamed from: a, reason: collision with root package name */
    public final h f2565a;

    /* renamed from: a0, reason: collision with root package name */
    public f f2566a0;

    /* renamed from: c, reason: collision with root package name */
    public long f2569c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f2570c0;

    /* renamed from: d, reason: collision with root package name */
    public int f2571d;

    /* renamed from: e, reason: collision with root package name */
    public int f2573e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f2574e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2575f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f2576f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2577g;

    /* renamed from: h, reason: collision with root package name */
    public int f2578h;

    /* renamed from: i, reason: collision with root package name */
    public int f2579i;

    /* renamed from: j, reason: collision with root package name */
    public int f2580j;

    /* renamed from: k, reason: collision with root package name */
    public int f2581k;

    /* renamed from: l, reason: collision with root package name */
    public float f2582l;

    /* renamed from: m, reason: collision with root package name */
    public float f2583m;

    /* renamed from: n, reason: collision with root package name */
    public float f2584n;

    /* renamed from: o, reason: collision with root package name */
    public String f2585o;

    /* renamed from: p, reason: collision with root package name */
    public String f2586p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2587q;
    public String r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f2588s;

    /* renamed from: t, reason: collision with root package name */
    public String f2589t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2590u;

    /* renamed from: v, reason: collision with root package name */
    public String f2591v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2592w;

    /* renamed from: x, reason: collision with root package name */
    public String f2593x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2594y;

    /* renamed from: z, reason: collision with root package name */
    public String f2595z;

    /* renamed from: b, reason: collision with root package name */
    public int f2567b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f2547G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2548H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2562W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f2563X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2568b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2572d0 = true;

    public g(h hVar) {
        this.f2565a = hVar;
    }

    public static boolean C(g gVar, e eVar) {
        return (gVar.f2550J & eVar.f2535e) != 0;
    }

    public static ArrayList G(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = F.j.c(2)[byteBuffer.getInt()];
            int b2 = F.j.b(i6);
            if (b2 == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f2620a = i4;
                jVar.f2621b = i5;
                jVar.f2622c = i6;
                arrayList.add(jVar);
            } else if (b2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                i iVar = new i();
                iVar.f2620a = i4;
                iVar.f2621b = i5;
                iVar.f2622c = i6;
                iVar.f2619d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static void L(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public static Rect f(g gVar) {
        return gVar.f2576f0;
    }

    public static boolean k(g gVar, e eVar) {
        return (gVar.f2571d & eVar.f2535e) != 0;
    }

    public static boolean o(g gVar) {
        if (gVar.I(4)) {
            return true;
        }
        String str = gVar.f2541A;
        if (str == null || str.isEmpty()) {
            return gVar.I(23);
        }
        return false;
    }

    public static SpannableString w(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f244a = gVar.r;
        c0013n.f245b = gVar.f2588s;
        c0013n.f246c = gVar.E();
        return c0013n.a();
    }

    public static CharSequence x(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f244a = gVar.f2586p;
        c0013n.f245b = gVar.f2587q;
        c0013n.f247d = gVar.f2541A;
        c0013n.f246c = gVar.E();
        SpannableString a2 = c0013n.a();
        C0013n c0013n2 = new C0013n();
        c0013n2.f244a = gVar.f2593x;
        c0013n2.f245b = gVar.f2594y;
        c0013n2.f246c = gVar.E();
        CharSequence[] charSequenceArr = {a2, c0013n2.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 2; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static CharSequence y(g gVar) {
        C0013n c0013n = new C0013n();
        c0013n.f244a = gVar.r;
        c0013n.f245b = gVar.f2588s;
        c0013n.f246c = gVar.E();
        SpannableString a2 = c0013n.a();
        C0013n c0013n2 = new C0013n();
        c0013n2.f244a = gVar.f2586p;
        c0013n2.f245b = gVar.f2587q;
        c0013n2.f247d = gVar.f2541A;
        c0013n2.f246c = gVar.E();
        SpannableString a3 = c0013n2.a();
        C0013n c0013n3 = new C0013n();
        c0013n3.f244a = gVar.f2593x;
        c0013n3.f245b = gVar.f2594y;
        c0013n3.f246c = gVar.E();
        CharSequence[] charSequenceArr = {a2, a3, c0013n3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public final void D(ArrayList arrayList) {
        if (I(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f2562W.iterator();
        while (it.hasNext()) {
            ((g) it.next()).D(arrayList);
        }
    }

    public final String E() {
        String str = this.f2542B;
        return (str == null || str.isEmpty()) ? this.f2565a.f2608l : this.f2542B;
    }

    public final String F() {
        String str;
        if (I(13) && (str = this.f2586p) != null && !str.isEmpty()) {
            return this.f2586p;
        }
        Iterator it = this.f2562W.iterator();
        while (it.hasNext()) {
            String F2 = ((g) it.next()).F();
            if (F2 != null && !F2.isEmpty()) {
                return F2;
            }
        }
        return null;
    }

    public final boolean H(int i2) {
        return (this.f2549I & ((long) F0.h.d(i2))) != 0;
    }

    public final boolean I(int i2) {
        return (this.f2569c & ((long) F0.h.d(i2))) != 0;
    }

    public final g J(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f2556P || f3 >= this.f2558R || f4 < this.f2557Q || f4 >= this.f2559S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f2563X.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.I(14)) {
                if (gVar.f2568b0) {
                    gVar.f2568b0 = false;
                    if (gVar.f2570c0 == null) {
                        gVar.f2570c0 = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f2570c0, 0, gVar.f2560U, 0)) {
                        Arrays.fill(gVar.f2570c0, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f2570c0, 0, fArr, 0);
                g J2 = gVar.J(fArr2, z2);
                if (J2 != null) {
                    return J2;
                }
            }
        }
        if (z2 && this.f2579i != -1) {
            z3 = true;
        }
        if (K() || z3) {
            return this;
        }
        return null;
    }

    public final boolean K() {
        String str;
        String str2;
        String str3;
        if (I(12)) {
            return false;
        }
        if (I(22)) {
            return true;
        }
        if (I(32)) {
            return false;
        }
        int i2 = this.f2571d;
        int i3 = h.f2596x;
        return ((i2 & (-61)) == 0 && (this.f2569c & ((long) 10682871)) == 0 && ((str = this.f2586p) == null || str.isEmpty()) && (((str2 = this.r) == null || str2.isEmpty()) && ((str3 = this.f2593x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void M(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f2572d0) {
            z2 = true;
        }
        if (z2) {
            if (this.f2574e0 == null) {
                this.f2574e0 = new float[16];
            }
            if (this.T == null) {
                this.T = new float[16];
            }
            Matrix.multiplyMM(this.f2574e0, 0, fArr, 0, this.T, 0);
            float[] fArr2 = {this.f2556P, this.f2557Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            L(fArr3, this.f2574e0, fArr2);
            fArr2[0] = this.f2558R;
            fArr2[1] = this.f2557Q;
            L(fArr4, this.f2574e0, fArr2);
            fArr2[0] = this.f2558R;
            fArr2[1] = this.f2559S;
            L(fArr5, this.f2574e0, fArr2);
            fArr2[0] = this.f2556P;
            fArr2[1] = this.f2559S;
            L(fArr6, this.f2574e0, fArr2);
            if (this.f2576f0 == null) {
                this.f2576f0 = new Rect();
            }
            this.f2576f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f2572d0 = false;
        }
        Iterator it = this.f2562W.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f2547G = i2;
            i2 = gVar.f2567b;
            gVar.M(this.f2574e0, hashSet, z2);
        }
    }
}
