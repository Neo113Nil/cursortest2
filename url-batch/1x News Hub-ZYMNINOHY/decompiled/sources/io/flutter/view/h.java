package io.flutter.view;

import E1.AbstractC0033i;
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
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f9368A;

    /* renamed from: B, reason: collision with root package name */
    public String f9369B;

    /* renamed from: C, reason: collision with root package name */
    public String f9370C;

    /* renamed from: D, reason: collision with root package name */
    public String f9371D;

    /* renamed from: E, reason: collision with root package name */
    public int f9372E;

    /* renamed from: F, reason: collision with root package name */
    public int f9373F;

    /* renamed from: I, reason: collision with root package name */
    public long f9376I;

    /* renamed from: J, reason: collision with root package name */
    public int f9377J;

    /* renamed from: K, reason: collision with root package name */
    public int f9378K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public float f9379M;

    /* renamed from: N, reason: collision with root package name */
    public String f9380N;

    /* renamed from: O, reason: collision with root package name */
    public String f9381O;

    /* renamed from: P, reason: collision with root package name */
    public float f9382P;

    /* renamed from: Q, reason: collision with root package name */
    public float f9383Q;

    /* renamed from: R, reason: collision with root package name */
    public float f9384R;

    /* renamed from: S, reason: collision with root package name */
    public float f9385S;

    /* renamed from: T, reason: collision with root package name */
    public float[] f9386T;

    /* renamed from: U, reason: collision with root package name */
    public float[] f9387U;

    /* renamed from: V, reason: collision with root package name */
    public h f9388V;

    /* renamed from: Y, reason: collision with root package name */
    public ArrayList f9391Y;

    /* renamed from: Z, reason: collision with root package name */
    public g f9392Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f9393a;

    /* renamed from: a0, reason: collision with root package name */
    public g f9394a0;

    /* renamed from: c, reason: collision with root package name */
    public long f9397c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f9398c0;

    /* renamed from: d, reason: collision with root package name */
    public int f9399d;

    /* renamed from: e, reason: collision with root package name */
    public int f9401e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f9402e0;
    public int f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f9403f0;

    /* renamed from: g, reason: collision with root package name */
    public int f9404g;

    /* renamed from: h, reason: collision with root package name */
    public int f9405h;

    /* renamed from: i, reason: collision with root package name */
    public int f9406i;

    /* renamed from: j, reason: collision with root package name */
    public int f9407j;

    /* renamed from: k, reason: collision with root package name */
    public int f9408k;

    /* renamed from: l, reason: collision with root package name */
    public float f9409l;

    /* renamed from: m, reason: collision with root package name */
    public float f9410m;

    /* renamed from: n, reason: collision with root package name */
    public float f9411n;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f9412p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f9413q;

    /* renamed from: r, reason: collision with root package name */
    public String f9414r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f9415s;

    /* renamed from: t, reason: collision with root package name */
    public String f9416t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f9417u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f9418w;

    /* renamed from: x, reason: collision with root package name */
    public String f9419x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f9420y;
    public String z;

    /* renamed from: b, reason: collision with root package name */
    public int f9395b = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f9374G = -1;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9375H = false;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9389W = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f9390X = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9396b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9400d0 = true;

    public h(i iVar) {
        this.f9393a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f9399d & fVar.f9362a) != 0;
    }

    public static CharSequence b(h hVar) {
        B0.p pVar = new B0.p();
        pVar.f162a = hVar.f9414r;
        pVar.f163b = hVar.f9415s;
        pVar.f164c = hVar.d();
        SpannableString a3 = pVar.a();
        B0.p pVar2 = new B0.p();
        pVar2.f162a = hVar.f9412p;
        pVar2.f163b = hVar.f9413q;
        pVar2.f165d = hVar.f9368A;
        pVar2.f164c = hVar.d();
        SpannableString a4 = pVar2.a();
        B0.p pVar3 = new B0.p();
        pVar3.f162a = hVar.f9419x;
        pVar3.f163b = hVar.f9420y;
        pVar3.f164c = hVar.d();
        CharSequence[] charSequenceArr = {a3, a4, pVar3.a()};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            int i7 = M.j.c(2)[byteBuffer.getInt()];
            int b3 = M.j.b(i7);
            if (b3 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f9444a = i5;
                kVar.f9445b = i6;
                kVar.f9446c = i7;
                arrayList.add(kVar);
            } else if (b3 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f9444a = i5;
                jVar.f9445b = i6;
                jVar.f9446c = i7;
                jVar.f9443d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f9389W.iterator();
        while (it.hasNext()) {
            ((h) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.f9369B;
        return (str == null || str.isEmpty()) ? this.f9393a.f9433m : this.f9369B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f9412p) != null && !str.isEmpty()) {
            return this.f9412p;
        }
        Iterator it = this.f9389W.iterator();
        while (it.hasNext()) {
            String e3 = ((h) it.next()).e();
            if (e3 != null && !e3.isEmpty()) {
                return e3;
            }
        }
        return null;
    }

    public final boolean g(int i3) {
        return (this.f9376I & ((long) AbstractC0033i.d(i3))) != 0;
    }

    public final boolean h(int i3) {
        return (this.f9397c & ((long) AbstractC0033i.d(i3))) != 0;
    }

    public final h i(float[] fArr, boolean z) {
        float f = fArr[3];
        boolean z2 = false;
        float f3 = fArr[0] / f;
        float f4 = fArr[1] / f;
        if (f3 < this.f9382P || f3 >= this.f9384R || f4 < this.f9383Q || f4 >= this.f9385S) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f9390X.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!hVar.h(14)) {
                if (hVar.f9396b0) {
                    hVar.f9396b0 = false;
                    if (hVar.f9398c0 == null) {
                        hVar.f9398c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f9398c0, 0, hVar.f9387U, 0)) {
                        Arrays.fill(hVar.f9398c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f9398c0, 0, fArr3, 0);
                h i3 = hVar.i(fArr2, z);
                if (i3 != null) {
                    return i3;
                }
                fArr = fArr3;
            }
        }
        if (z && this.f9406i != -1) {
            z2 = true;
        }
        if (j() || z2) {
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
        int i3 = this.f9399d;
        int i4 = i.f9421y;
        if ((i3 & (-61)) != 0 || (this.f9397c & 10682871) != 0) {
            return true;
        }
        String str = this.f9412p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f9414r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f9419x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z) {
        hashSet.add(this);
        if (this.f9400d0) {
            z = true;
        }
        if (z) {
            if (this.f9402e0 == null) {
                this.f9402e0 = new float[16];
            }
            if (this.f9386T == null) {
                this.f9386T = new float[16];
            }
            Matrix.multiplyMM(this.f9402e0, 0, fArr, 0, this.f9386T, 0);
            float[] fArr2 = {this.f9382P, this.f9383Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f9402e0, fArr2);
            fArr2[0] = this.f9384R;
            fArr2[1] = this.f9383Q;
            k(fArr4, this.f9402e0, fArr2);
            fArr2[0] = this.f9384R;
            fArr2[1] = this.f9385S;
            k(fArr5, this.f9402e0, fArr2);
            fArr2[0] = this.f9382P;
            fArr2[1] = this.f9385S;
            k(fArr6, this.f9402e0, fArr2);
            if (this.f9403f0 == null) {
                this.f9403f0 = new Rect();
            }
            this.f9403f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f9400d0 = false;
        }
        Iterator it = this.f9389W.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.f9374G = i3;
            i3 = hVar.f9395b;
            hVar.l(this.f9402e0, hashSet, z);
        }
    }
}
