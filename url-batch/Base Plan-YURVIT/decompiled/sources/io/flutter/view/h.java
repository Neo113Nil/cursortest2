package io.flutter.view;

import F.C0032n;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f2544A;

    /* renamed from: B, reason: collision with root package name */
    public String f2545B;

    /* renamed from: C, reason: collision with root package name */
    public int f2546C;

    /* renamed from: F, reason: collision with root package name */
    public long f2549F;
    public int G;

    /* renamed from: H, reason: collision with root package name */
    public int f2550H;

    /* renamed from: I, reason: collision with root package name */
    public int f2551I;

    /* renamed from: J, reason: collision with root package name */
    public float f2552J;

    /* renamed from: K, reason: collision with root package name */
    public String f2553K;

    /* renamed from: L, reason: collision with root package name */
    public String f2554L;

    /* renamed from: M, reason: collision with root package name */
    public float f2555M;

    /* renamed from: N, reason: collision with root package name */
    public float f2556N;

    /* renamed from: O, reason: collision with root package name */
    public float f2557O;

    /* renamed from: P, reason: collision with root package name */
    public float f2558P;

    /* renamed from: Q, reason: collision with root package name */
    public float[] f2559Q;

    /* renamed from: R, reason: collision with root package name */
    public float[] f2560R;

    /* renamed from: S, reason: collision with root package name */
    public h f2561S;
    public ArrayList V;

    /* renamed from: W, reason: collision with root package name */
    public g f2564W;

    /* renamed from: X, reason: collision with root package name */
    public g f2565X;

    /* renamed from: Z, reason: collision with root package name */
    public float[] f2567Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f2568a;
    public float[] b0;

    /* renamed from: c, reason: collision with root package name */
    public long f2571c;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f2572c0;

    /* renamed from: d, reason: collision with root package name */
    public int f2573d;

    /* renamed from: e, reason: collision with root package name */
    public int f2574e;

    /* renamed from: f, reason: collision with root package name */
    public int f2575f;

    /* renamed from: g, reason: collision with root package name */
    public int f2576g;

    /* renamed from: h, reason: collision with root package name */
    public int f2577h;

    /* renamed from: i, reason: collision with root package name */
    public int f2578i;

    /* renamed from: j, reason: collision with root package name */
    public int f2579j;

    /* renamed from: k, reason: collision with root package name */
    public int f2580k;

    /* renamed from: l, reason: collision with root package name */
    public float f2581l;

    /* renamed from: m, reason: collision with root package name */
    public float f2582m;

    /* renamed from: n, reason: collision with root package name */
    public float f2583n;

    /* renamed from: o, reason: collision with root package name */
    public String f2584o;

    /* renamed from: p, reason: collision with root package name */
    public String f2585p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2586q;

    /* renamed from: r, reason: collision with root package name */
    public String f2587r;

    /* renamed from: s, reason: collision with root package name */
    public List f2588s;
    public String t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2589u;

    /* renamed from: v, reason: collision with root package name */
    public String f2590v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2591w;

    /* renamed from: x, reason: collision with root package name */
    public String f2592x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2593y;

    /* renamed from: z, reason: collision with root package name */
    public String f2594z;

    /* renamed from: b, reason: collision with root package name */
    public int f2570b = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f2547D = -1;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2548E = false;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f2562T = new ArrayList();

    /* renamed from: U, reason: collision with root package name */
    public final ArrayList f2563U = new ArrayList();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f2566Y = true;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2569a0 = true;

    public h(i iVar) {
        this.f2568a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f2573d & fVar.f2538e) != 0;
    }

    public static CharSequence b(h hVar) {
        C0032n c0032n = new C0032n();
        c0032n.f409a = hVar.f2587r;
        c0032n.f411c = hVar.f2588s;
        c0032n.f410b = hVar.d();
        SpannableString a2 = c0032n.a();
        C0032n c0032n2 = new C0032n();
        c0032n2.f409a = hVar.f2585p;
        c0032n2.f411c = hVar.f2586q;
        c0032n2.f412d = hVar.f2544A;
        c0032n2.f410b = hVar.d();
        SpannableString a3 = c0032n2.a();
        C0032n c0032n3 = new C0032n();
        c0032n3.f409a = hVar.f2592x;
        c0032n3.f411c = hVar.f2593y;
        c0032n3.f410b = hVar.d();
        CharSequence[] charSequenceArr = {a2, a3, c0032n3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = H.j.b(2)[byteBuffer.getInt()];
            int a2 = H.j.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f2619a = i4;
                kVar.f2620b = i5;
                kVar.f2621c = i6;
                arrayList.add(kVar);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f2619a = i4;
                jVar.f2620b = i5;
                jVar.f2621c = i6;
                jVar.f2618d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(12)) {
            arrayList.add(this);
        }
        ArrayList arrayList2 = this.f2562T;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((h) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f2545B;
        return (str == null || str.isEmpty()) ? this.f2568a.f2607l : this.f2545B;
    }

    public final String e() {
        String str;
        if (g(13) && (str = this.f2585p) != null && !str.isEmpty()) {
            return this.f2585p;
        }
        ArrayList arrayList = this.f2562T;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String e2 = ((h) obj).e();
            if (e2 != null && !e2.isEmpty()) {
                return e2;
            }
        }
        return null;
    }

    public final boolean g(int i2) {
        return (this.f2571c & ((long) L.d.d(i2))) != 0;
    }

    public final h h(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f2555M || f3 >= this.f2557O || f4 < this.f2556N || f4 >= this.f2558P) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.f2563U;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            h hVar = (h) arrayList.get(i2);
            if (!hVar.g(14)) {
                if (hVar.f2566Y) {
                    hVar.f2566Y = false;
                    if (hVar.f2567Z == null) {
                        hVar.f2567Z = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f2567Z, 0, hVar.f2560R, 0)) {
                        Arrays.fill(hVar.f2567Z, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f2567Z, 0, fArr3, 0);
                h h2 = hVar.h(fArr2, z2);
                if (h2 != null) {
                    return h2;
                }
                fArr = fArr3;
            }
            i2 = i3;
        }
        if (z2 && this.f2578i != -1) {
            z3 = true;
        }
        if (i() || z3) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        if (g(12)) {
            return false;
        }
        if (g(22)) {
            return true;
        }
        if (g(32)) {
            return false;
        }
        int i2 = this.f2573d;
        int i3 = i.f2595x;
        if ((i2 & (-61)) != 0 || (this.f2571c & 10682871) != 0) {
            return true;
        }
        String str = this.f2585p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f2587r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f2592x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f2569a0) {
            z2 = true;
        }
        int i2 = 0;
        if (z2) {
            if (this.b0 == null) {
                this.b0 = new float[16];
            }
            if (this.f2559Q == null) {
                this.f2559Q = new float[16];
            }
            Matrix.multiplyMM(this.b0, 0, fArr, 0, this.f2559Q, 0);
            float[] fArr2 = {this.f2555M, this.f2556N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.b0, fArr2);
            fArr2[0] = this.f2557O;
            fArr2[1] = this.f2556N;
            j(fArr4, this.b0, fArr2);
            fArr2[0] = this.f2557O;
            fArr2[1] = this.f2558P;
            j(fArr5, this.b0, fArr2);
            fArr2[0] = this.f2555M;
            fArr2[1] = this.f2558P;
            j(fArr6, this.b0, fArr2);
            if (this.f2572c0 == null) {
                this.f2572c0 = new Rect();
            }
            this.f2572c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f2569a0 = false;
        }
        ArrayList arrayList = this.f2562T;
        int size = arrayList.size();
        int i3 = -1;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            h hVar = (h) obj;
            hVar.f2547D = i3;
            i3 = hVar.f2570b;
            hVar.k(this.b0, hashSet, z2);
        }
    }
}
