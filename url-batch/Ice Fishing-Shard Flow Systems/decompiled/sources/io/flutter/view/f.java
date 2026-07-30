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

/* loaded from: classes.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public String f5822A;

    /* renamed from: B, reason: collision with root package name */
    public String f5823B;

    /* renamed from: C, reason: collision with root package name */
    public String f5824C;

    /* renamed from: D, reason: collision with root package name */
    public String f5825D;

    /* renamed from: E, reason: collision with root package name */
    public int f5826E;

    /* renamed from: F, reason: collision with root package name */
    public int f5827F;

    /* renamed from: I, reason: collision with root package name */
    public long f5830I;

    /* renamed from: J, reason: collision with root package name */
    public int f5831J;

    /* renamed from: K, reason: collision with root package name */
    public int f5832K;

    /* renamed from: L, reason: collision with root package name */
    public int f5833L;

    /* renamed from: M, reason: collision with root package name */
    public float f5834M;

    /* renamed from: N, reason: collision with root package name */
    public String f5835N;

    /* renamed from: O, reason: collision with root package name */
    public String f5836O;

    /* renamed from: P, reason: collision with root package name */
    public float f5837P;
    public float Q;

    /* renamed from: R, reason: collision with root package name */
    public float f5838R;

    /* renamed from: S, reason: collision with root package name */
    public float f5839S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f5840T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f5841U;

    /* renamed from: V, reason: collision with root package name */
    public f f5842V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f5845Y;

    /* renamed from: Z, reason: collision with root package name */
    public e f5846Z;

    /* renamed from: a, reason: collision with root package name */
    public final g f5847a;

    /* renamed from: a0, reason: collision with root package name */
    public e f5848a0;

    /* renamed from: c, reason: collision with root package name */
    public long f5851c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f5852c0;

    /* renamed from: d, reason: collision with root package name */
    public int f5853d;

    /* renamed from: e, reason: collision with root package name */
    public int f5855e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f5856e0;

    /* renamed from: f, reason: collision with root package name */
    public int f5857f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f5858f0;

    /* renamed from: g, reason: collision with root package name */
    public int f5859g;

    /* renamed from: h, reason: collision with root package name */
    public int f5860h;

    /* renamed from: i, reason: collision with root package name */
    public int f5861i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f5862k;

    /* renamed from: l, reason: collision with root package name */
    public float f5863l;

    /* renamed from: m, reason: collision with root package name */
    public float f5864m;

    /* renamed from: n, reason: collision with root package name */
    public float f5865n;

    /* renamed from: o, reason: collision with root package name */
    public String f5866o;

    /* renamed from: p, reason: collision with root package name */
    public String f5867p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f5868q;

    /* renamed from: r, reason: collision with root package name */
    public String f5869r;

    /* renamed from: s, reason: collision with root package name */
    public List f5870s;

    /* renamed from: t, reason: collision with root package name */
    public String f5871t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f5872u;

    /* renamed from: v, reason: collision with root package name */
    public String f5873v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f5874w;

    /* renamed from: x, reason: collision with root package name */
    public String f5875x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f5876y;

    /* renamed from: z, reason: collision with root package name */
    public String f5877z;

    /* renamed from: b, reason: collision with root package name */
    public int f5849b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f5828G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5829H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f5843W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f5844X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f5850b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5854d0 = true;

    public f(g gVar) {
        this.f5847a = gVar;
    }

    public static boolean a(f fVar, d dVar) {
        return (fVar.f5853d & dVar.f5816d) != 0;
    }

    public static CharSequence b(f fVar) {
        P0.i iVar = new P0.i();
        iVar.f2200a = fVar.f5869r;
        iVar.f2201b = fVar.f5870s;
        iVar.f2202c = fVar.d();
        SpannableString b7 = iVar.b();
        P0.i iVar2 = new P0.i();
        iVar2.f2200a = fVar.f5867p;
        iVar2.f2201b = fVar.f5868q;
        iVar2.f2203d = fVar.f5822A;
        iVar2.f2202c = fVar.d();
        SpannableString b8 = iVar2.b();
        P0.i iVar3 = new P0.i();
        iVar3.f2200a = fVar.f5875x;
        iVar3.f2201b = fVar.f5876y;
        iVar3.f2202c = fVar.d();
        CharSequence[] charSequenceArr = {b7, b8, iVar3.b()};
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
        for (int i5 = 0; i5 < i2; i5++) {
            int i7 = byteBuffer.getInt();
            int i8 = byteBuffer.getInt();
            int i9 = S.i.c(2)[byteBuffer.getInt()];
            int b7 = S.i.b(i9);
            if (b7 == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f5903a = i7;
                iVar.f5904b = i8;
                iVar.f5905c = i9;
                arrayList.add(iVar);
            } else if (b7 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                h hVar = new h();
                hVar.f5903a = i7;
                hVar.f5904b = i8;
                hVar.f5905c = i9;
                hVar.f5902d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(hVar);
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
        ArrayList arrayList2 = this.f5843W;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((f) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f5823B;
        return (str == null || str.isEmpty()) ? this.f5847a.f5890m : this.f5823B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f5867p) != null && !str.isEmpty()) {
            return this.f5867p;
        }
        ArrayList arrayList = this.f5843W;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String e7 = ((f) obj).e();
            if (e7 != null && !e7.isEmpty()) {
                return e7;
            }
        }
        return null;
    }

    public final boolean g(int i2) {
        return (this.f5830I & ((long) C4.p.d(i2))) != 0;
    }

    public final boolean h(int i2) {
        return (this.f5851c & ((long) C4.p.d(i2))) != 0;
    }

    public final f i(float[] fArr, boolean z7) {
        float f7 = fArr[3];
        boolean z8 = false;
        float f8 = fArr[0] / f7;
        float f9 = fArr[1] / f7;
        if (f8 < this.f5837P || f8 >= this.f5838R || f9 < this.Q || f9 >= this.f5839S) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.f5844X;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i5 = i2 + 1;
            f fVar = (f) arrayList.get(i2);
            if (!fVar.h(14)) {
                if (fVar.f5850b0) {
                    fVar.f5850b0 = false;
                    if (fVar.f5852c0 == null) {
                        fVar.f5852c0 = new float[16];
                    }
                    if (!Matrix.invertM(fVar.f5852c0, 0, fVar.f5841U, 0)) {
                        Arrays.fill(fVar.f5852c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, fVar.f5852c0, 0, fArr3, 0);
                f i7 = fVar.i(fArr2, z7);
                if (i7 != null) {
                    return i7;
                }
                fArr = fArr3;
            }
            i2 = i5;
        }
        if (z7 && this.f5861i != -1) {
            z8 = true;
        }
        if (j() || z8) {
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
        int i2 = this.f5853d;
        int i5 = g.f5878y;
        if ((i2 & (-61)) != 0 || (this.f5851c & 10682871) != 0) {
            return true;
        }
        String str = this.f5867p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f5869r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f5875x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z7) {
        hashSet.add(this);
        if (this.f5854d0) {
            z7 = true;
        }
        int i2 = 0;
        if (z7) {
            if (this.f5856e0 == null) {
                this.f5856e0 = new float[16];
            }
            if (this.f5840T == null) {
                this.f5840T = new float[16];
            }
            Matrix.multiplyMM(this.f5856e0, 0, fArr, 0, this.f5840T, 0);
            float[] fArr2 = {this.f5837P, this.Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f5856e0, fArr2);
            fArr2[0] = this.f5838R;
            fArr2[1] = this.Q;
            k(fArr4, this.f5856e0, fArr2);
            fArr2[0] = this.f5838R;
            fArr2[1] = this.f5839S;
            k(fArr5, this.f5856e0, fArr2);
            fArr2[0] = this.f5837P;
            fArr2[1] = this.f5839S;
            k(fArr6, this.f5856e0, fArr2);
            if (this.f5858f0 == null) {
                this.f5858f0 = new Rect();
            }
            this.f5858f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f5854d0 = false;
        }
        ArrayList arrayList = this.f5843W;
        int size = arrayList.size();
        int i5 = -1;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f fVar = (f) obj;
            fVar.f5828G = i5;
            i5 = fVar.f5849b;
            fVar.l(this.f5856e0, hashSet, z7);
        }
    }
}
