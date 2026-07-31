package io.flutter.view;

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
import u0.C0679i;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f4639A;

    /* renamed from: B, reason: collision with root package name */
    public String f4640B;

    /* renamed from: C, reason: collision with root package name */
    public String f4641C;

    /* renamed from: D, reason: collision with root package name */
    public String f4642D;

    /* renamed from: E, reason: collision with root package name */
    public int f4643E;

    /* renamed from: F, reason: collision with root package name */
    public int f4644F;

    /* renamed from: I, reason: collision with root package name */
    public long f4647I;

    /* renamed from: J, reason: collision with root package name */
    public int f4648J;

    /* renamed from: K, reason: collision with root package name */
    public int f4649K;

    /* renamed from: L, reason: collision with root package name */
    public int f4650L;

    /* renamed from: M, reason: collision with root package name */
    public float f4651M;

    /* renamed from: N, reason: collision with root package name */
    public String f4652N;

    /* renamed from: O, reason: collision with root package name */
    public String f4653O;

    /* renamed from: P, reason: collision with root package name */
    public float f4654P;

    /* renamed from: Q, reason: collision with root package name */
    public float f4655Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4656R;

    /* renamed from: S, reason: collision with root package name */
    public float f4657S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f4658T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f4659U;

    /* renamed from: V, reason: collision with root package name */
    public h f4660V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f4663Y;

    /* renamed from: Z, reason: collision with root package name */
    public g f4664Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f4665a;

    /* renamed from: a0, reason: collision with root package name */
    public g f4666a0;

    /* renamed from: c, reason: collision with root package name */
    public long f4669c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f4670c0;

    /* renamed from: d, reason: collision with root package name */
    public int f4671d;

    /* renamed from: e, reason: collision with root package name */
    public int f4673e;
    public float[] e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4674f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f4675f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4676g;

    /* renamed from: h, reason: collision with root package name */
    public int f4677h;

    /* renamed from: i, reason: collision with root package name */
    public int f4678i;

    /* renamed from: j, reason: collision with root package name */
    public int f4679j;

    /* renamed from: k, reason: collision with root package name */
    public int f4680k;

    /* renamed from: l, reason: collision with root package name */
    public float f4681l;

    /* renamed from: m, reason: collision with root package name */
    public float f4682m;

    /* renamed from: n, reason: collision with root package name */
    public float f4683n;

    /* renamed from: o, reason: collision with root package name */
    public String f4684o;

    /* renamed from: p, reason: collision with root package name */
    public String f4685p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4686q;

    /* renamed from: r, reason: collision with root package name */
    public String f4687r;

    /* renamed from: s, reason: collision with root package name */
    public List f4688s;

    /* renamed from: t, reason: collision with root package name */
    public String f4689t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4690u;

    /* renamed from: v, reason: collision with root package name */
    public String f4691v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f4692w;

    /* renamed from: x, reason: collision with root package name */
    public String f4693x;
    public ArrayList y;

    /* renamed from: z, reason: collision with root package name */
    public String f4694z;

    /* renamed from: b, reason: collision with root package name */
    public int f4667b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f4645G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4646H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f4661W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f4662X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4668b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4672d0 = true;

    public h(i iVar) {
        this.f4665a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f4671d & fVar.f4633f) != 0;
    }

    public static CharSequence b(h hVar) {
        C0679i c0679i = new C0679i();
        c0679i.f5981f = hVar.f4687r;
        c0679i.f5982g = hVar.f4688s;
        c0679i.f5983h = hVar.d();
        SpannableString a7 = c0679i.a();
        C0679i c0679i2 = new C0679i();
        c0679i2.f5981f = hVar.f4685p;
        c0679i2.f5982g = hVar.f4686q;
        c0679i2.f5984i = hVar.f4639A;
        c0679i2.f5983h = hVar.d();
        SpannableString a8 = c0679i2.a();
        C0679i c0679i3 = new C0679i();
        c0679i3.f5981f = hVar.f4693x;
        c0679i3.f5982g = hVar.y;
        c0679i3.f5983h = hVar.d();
        CharSequence[] charSequenceArr = {a7, a8, c0679i3.a()};
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < 3; i7++) {
            CharSequence charSequence2 = charSequenceArr[i7];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i7 = byteBuffer.getInt();
        if (i7 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            int i11 = N.p.d(2)[byteBuffer.getInt()];
            int c7 = N.p.c(i11);
            if (c7 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f4720a = i9;
                kVar.f4721b = i10;
                kVar.f4722c = i11;
                arrayList.add(kVar);
            } else if (c7 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f4720a = i9;
                jVar.f4721b = i10;
                jVar.f4722c = i11;
                jVar.f4719d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f7 = fArr[3];
        fArr[0] = fArr[0] / f7;
        fArr[1] = fArr[1] / f7;
        fArr[2] = fArr[2] / f7;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        ArrayList arrayList2 = this.f4661W;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((h) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f4640B;
        return (str == null || str.isEmpty()) ? this.f4665a.f4707l : this.f4640B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f4685p) != null && !str.isEmpty()) {
            return this.f4685p;
        }
        ArrayList arrayList = this.f4661W;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String e4 = ((h) obj).e();
            if (e4 != null && !e4.isEmpty()) {
                return e4;
            }
        }
        return null;
    }

    public final boolean g(int i7) {
        return (this.f4647I & ((long) W4.o.b(i7))) != 0;
    }

    public final boolean h(int i7) {
        return (this.f4669c & ((long) W4.o.b(i7))) != 0;
    }

    public final h i(float[] fArr, boolean z5) {
        float f7 = fArr[3];
        boolean z6 = false;
        float f8 = fArr[0] / f7;
        float f9 = fArr[1] / f7;
        if (f8 < this.f4654P || f8 >= this.f4656R || f9 < this.f4655Q || f9 >= this.f4657S) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.f4662X;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            h hVar = (h) arrayList.get(i7);
            if (!hVar.h(14)) {
                if (hVar.f4668b0) {
                    hVar.f4668b0 = false;
                    if (hVar.f4670c0 == null) {
                        hVar.f4670c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f4670c0, 0, hVar.f4659U, 0)) {
                        Arrays.fill(hVar.f4670c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f4670c0, 0, fArr3, 0);
                h i9 = hVar.i(fArr2, z5);
                if (i9 != null) {
                    return i9;
                }
                fArr = fArr3;
            }
            i7 = i8;
        }
        if (z5 && this.f4678i != -1) {
            z6 = true;
        }
        if (j() || z6) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        if (h(32)) {
            return false;
        }
        int i7 = this.f4671d;
        int i8 = i.f4695x;
        if ((i7 & (-61)) != 0 || (this.f4669c & 10682871) != 0) {
            return true;
        }
        String str = this.f4685p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f4687r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f4693x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z5) {
        hashSet.add(this);
        if (this.f4672d0) {
            z5 = true;
        }
        int i7 = 0;
        if (z5) {
            if (this.e0 == null) {
                this.e0 = new float[16];
            }
            if (this.f4658T == null) {
                this.f4658T = new float[16];
            }
            Matrix.multiplyMM(this.e0, 0, fArr, 0, this.f4658T, 0);
            float[] fArr2 = {this.f4654P, this.f4655Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.e0, fArr2);
            fArr2[0] = this.f4656R;
            fArr2[1] = this.f4655Q;
            k(fArr4, this.e0, fArr2);
            fArr2[0] = this.f4656R;
            fArr2[1] = this.f4657S;
            k(fArr5, this.e0, fArr2);
            fArr2[0] = this.f4654P;
            fArr2[1] = this.f4657S;
            k(fArr6, this.e0, fArr2);
            if (this.f4675f0 == null) {
                this.f4675f0 = new Rect();
            }
            this.f4675f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f4672d0 = false;
        }
        ArrayList arrayList = this.f4661W;
        int size = arrayList.size();
        int i8 = -1;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h hVar = (h) obj;
            hVar.f4645G = i8;
            i8 = hVar.f4667b;
            hVar.l(this.e0, hashSet, z5);
        }
    }
}
