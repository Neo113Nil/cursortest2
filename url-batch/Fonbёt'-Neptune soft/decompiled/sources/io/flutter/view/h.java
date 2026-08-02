package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: C, reason: collision with root package name */
    public int f2738C;

    /* renamed from: D, reason: collision with root package name */
    public int f2739D;

    /* renamed from: E, reason: collision with root package name */
    public int f2740E;

    /* renamed from: F, reason: collision with root package name */
    public int f2741F;

    /* renamed from: G, reason: collision with root package name */
    public float f2742G;

    /* renamed from: H, reason: collision with root package name */
    public String f2743H;

    /* renamed from: I, reason: collision with root package name */
    public String f2744I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public float f2745K;

    /* renamed from: L, reason: collision with root package name */
    public float f2746L;

    /* renamed from: M, reason: collision with root package name */
    public float f2747M;

    /* renamed from: N, reason: collision with root package name */
    public float[] f2748N;

    /* renamed from: O, reason: collision with root package name */
    public h f2749O;

    /* renamed from: R, reason: collision with root package name */
    public ArrayList f2752R;

    /* renamed from: S, reason: collision with root package name */
    public f f2753S;

    /* renamed from: T, reason: collision with root package name */
    public f f2754T;

    /* renamed from: V, reason: collision with root package name */
    public float[] f2756V;

    /* renamed from: X, reason: collision with root package name */
    public float[] f2758X;

    /* renamed from: Y, reason: collision with root package name */
    public Rect f2759Y;

    /* renamed from: a, reason: collision with root package name */
    public final k f2760a;

    /* renamed from: c, reason: collision with root package name */
    public int f2762c;

    /* renamed from: d, reason: collision with root package name */
    public int f2763d;

    /* renamed from: e, reason: collision with root package name */
    public int f2764e;

    /* renamed from: f, reason: collision with root package name */
    public int f2765f;

    /* renamed from: g, reason: collision with root package name */
    public int f2766g;

    /* renamed from: h, reason: collision with root package name */
    public int f2767h;

    /* renamed from: i, reason: collision with root package name */
    public int f2768i;

    /* renamed from: j, reason: collision with root package name */
    public int f2769j;

    /* renamed from: k, reason: collision with root package name */
    public int f2770k;

    /* renamed from: l, reason: collision with root package name */
    public float f2771l;

    /* renamed from: m, reason: collision with root package name */
    public float f2772m;

    /* renamed from: n, reason: collision with root package name */
    public float f2773n;

    /* renamed from: o, reason: collision with root package name */
    public String f2774o;

    /* renamed from: p, reason: collision with root package name */
    public String f2775p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2776q;

    /* renamed from: r, reason: collision with root package name */
    public String f2777r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f2778s;

    /* renamed from: t, reason: collision with root package name */
    public String f2779t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2780u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2781w;

    /* renamed from: x, reason: collision with root package name */
    public String f2782x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2783y;

    /* renamed from: z, reason: collision with root package name */
    public String f2784z;

    /* renamed from: b, reason: collision with root package name */
    public int f2761b = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f2736A = -1;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2737B = false;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f2750P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f2751Q = new ArrayList();

    /* renamed from: U, reason: collision with root package name */
    public boolean f2755U = true;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2757W = true;

    public h(k kVar) {
        this.f2760a = kVar;
    }

    public static boolean a(h hVar, e eVar) {
        return (hVar.f2763d & eVar.f2729e) != 0;
    }

    public static CharSequence b(h hVar) {
        CharSequence[] charSequenceArr = {e(hVar.f2777r, hVar.f2778s), e(hVar.f2775p, hVar.f2776q), e(hVar.f2782x, hVar.f2783y)};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static boolean c(h hVar, e eVar) {
        return (hVar.f2739D & eVar.f2729e) != 0;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int b2 = K.j.b(jVar.f2787c);
                if (b2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f2785a, jVar.f2786b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((g) jVar).f2735d)), jVar.f2785a, jVar.f2786b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = K.j.c(2)[byteBuffer.getInt()];
            int b2 = K.j.b(i6);
            if (b2 == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f2785a = i4;
                iVar.f2786b = i5;
                iVar.f2787c = i6;
                arrayList.add(iVar);
            } else if (b2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                g gVar = new g();
                gVar.f2785a = i4;
                gVar.f2786b = i5;
                gVar.f2787c = i6;
                gVar.f2735d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f2750P.iterator();
        while (it.hasNext()) {
            ((h) it.next()).d(arrayList);
        }
    }

    public final String f() {
        String str;
        if (h(13) && (str = this.f2775p) != null && !str.isEmpty()) {
            return this.f2775p;
        }
        Iterator it = this.f2750P.iterator();
        while (it.hasNext()) {
            String f2 = ((h) it.next()).f();
            if (f2 != null && !f2.isEmpty()) {
                return f2;
            }
        }
        return null;
    }

    public final boolean h(int i2) {
        return (A0.b.d(i2) & this.f2762c) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.J || f3 >= this.f2746L || f4 < this.f2745K || f4 >= this.f2747M) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f2751Q.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!hVar.h(14)) {
                if (hVar.f2755U) {
                    hVar.f2755U = false;
                    if (hVar.f2756V == null) {
                        hVar.f2756V = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f2756V, 0, hVar.f2748N, 0)) {
                        Arrays.fill(hVar.f2756V, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, hVar.f2756V, 0, fArr, 0);
                h i2 = hVar.i(fArr2, z2);
                if (i2 != null) {
                    return i2;
                }
            }
        }
        if (z2 && this.f2768i != -1) {
            z3 = true;
        }
        if (j() || z3) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        String str;
        String str2;
        String str3;
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        int i2 = this.f2763d;
        int i3 = k.f2788z;
        return ((i2 & (-61)) == 0 && (this.f2762c & 10682871) == 0 && ((str = this.f2775p) == null || str.isEmpty()) && (((str2 = this.f2777r) == null || str2.isEmpty()) && ((str3 = this.f2782x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f2757W) {
            z2 = true;
        }
        if (z2) {
            if (this.f2758X == null) {
                this.f2758X = new float[16];
            }
            if (this.f2748N == null) {
                this.f2748N = new float[16];
            }
            Matrix.multiplyMM(this.f2758X, 0, fArr, 0, this.f2748N, 0);
            float[] fArr2 = {this.J, this.f2745K, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f2758X, fArr2);
            fArr2[0] = this.f2746L;
            fArr2[1] = this.f2745K;
            k(fArr4, this.f2758X, fArr2);
            fArr2[0] = this.f2746L;
            fArr2[1] = this.f2747M;
            k(fArr5, this.f2758X, fArr2);
            fArr2[0] = this.J;
            fArr2[1] = this.f2747M;
            k(fArr6, this.f2758X, fArr2);
            if (this.f2759Y == null) {
                this.f2759Y = new Rect();
            }
            this.f2759Y.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f2757W = false;
        }
        Iterator it = this.f2750P.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.f2736A = i2;
            i2 = hVar.f2761b;
            hVar.l(this.f2758X, hashSet, z2);
        }
    }
}
