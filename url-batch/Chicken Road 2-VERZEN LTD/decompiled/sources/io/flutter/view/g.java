package io.flutter.view;

import D.AbstractC0009j;
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
import n.AbstractC0077d;

/* loaded from: classes.dex */
public final class g {
    public String A;

    /* renamed from: B, reason: collision with root package name */
    public String f728B;

    /* renamed from: C, reason: collision with root package name */
    public int f729C;

    /* renamed from: F, reason: collision with root package name */
    public long f732F;

    /* renamed from: G, reason: collision with root package name */
    public int f733G;

    /* renamed from: H, reason: collision with root package name */
    public int f734H;

    /* renamed from: I, reason: collision with root package name */
    public int f735I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public String f736K;
    public String L;

    /* renamed from: M, reason: collision with root package name */
    public float f737M;

    /* renamed from: N, reason: collision with root package name */
    public float f738N;

    /* renamed from: O, reason: collision with root package name */
    public float f739O;
    public float P;

    /* renamed from: Q, reason: collision with root package name */
    public float[] f740Q;

    /* renamed from: R, reason: collision with root package name */
    public float[] f741R;

    /* renamed from: S, reason: collision with root package name */
    public g f742S;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f745V;

    /* renamed from: W, reason: collision with root package name */
    public f f746W;

    /* renamed from: X, reason: collision with root package name */
    public f f747X;

    /* renamed from: Z, reason: collision with root package name */
    public float[] f749Z;

    /* renamed from: a, reason: collision with root package name */
    public final h f750a;

    /* renamed from: b0, reason: collision with root package name */
    public float[] f753b0;

    /* renamed from: c, reason: collision with root package name */
    public long f754c;
    public Rect c0;

    /* renamed from: d, reason: collision with root package name */
    public int f755d;

    /* renamed from: e, reason: collision with root package name */
    public int f756e;

    /* renamed from: f, reason: collision with root package name */
    public int f757f;

    /* renamed from: g, reason: collision with root package name */
    public int f758g;

    /* renamed from: h, reason: collision with root package name */
    public int f759h;

    /* renamed from: i, reason: collision with root package name */
    public int f760i;

    /* renamed from: j, reason: collision with root package name */
    public int f761j;

    /* renamed from: k, reason: collision with root package name */
    public int f762k;

    /* renamed from: l, reason: collision with root package name */
    public float f763l;

    /* renamed from: m, reason: collision with root package name */
    public float f764m;

    /* renamed from: n, reason: collision with root package name */
    public float f765n;

    /* renamed from: o, reason: collision with root package name */
    public String f766o;

    /* renamed from: p, reason: collision with root package name */
    public String f767p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f768q;

    /* renamed from: r, reason: collision with root package name */
    public String f769r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f770s;

    /* renamed from: t, reason: collision with root package name */
    public String f771t;
    public ArrayList u;

    /* renamed from: v, reason: collision with root package name */
    public String f772v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f773w;

    /* renamed from: x, reason: collision with root package name */
    public String f774x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f775y;

    /* renamed from: z, reason: collision with root package name */
    public String f776z;

    /* renamed from: b, reason: collision with root package name */
    public int f752b = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f730D = -1;

    /* renamed from: E, reason: collision with root package name */
    public boolean f731E = false;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f743T = new ArrayList();

    /* renamed from: U, reason: collision with root package name */
    public final ArrayList f744U = new ArrayList();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f748Y = true;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f751a0 = true;

    public g(h hVar) {
        this.f750a = hVar;
    }

    public static ArrayList D(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = AbstractC0077d.b(2)[byteBuffer.getInt()];
            int a2 = AbstractC0077d.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f801a = i4;
                jVar.f802b = i5;
                jVar.f803c = i6;
                arrayList.add(jVar);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                i iVar = new i();
                iVar.f801a = i4;
                iVar.f802b = i5;
                iVar.f803c = i6;
                iVar.f800d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static void H(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public static Rect f(g gVar) {
        return gVar.c0;
    }

    public static boolean k(g gVar, e eVar) {
        return (gVar.f755d & eVar.f722b) != 0;
    }

    public static boolean o(g gVar) {
        if (gVar.E(4)) {
            return true;
        }
        String str = gVar.A;
        if (str == null || str.isEmpty()) {
            return gVar.E(23);
        }
        return false;
    }

    public static SpannableString t(g gVar) {
        B.e eVar = new B.e();
        eVar.f7a = gVar.f769r;
        eVar.f8b = gVar.f770s;
        eVar.f9c = gVar.B();
        return eVar.a();
    }

    public static CharSequence u(g gVar) {
        B.e eVar = new B.e();
        eVar.f7a = gVar.f767p;
        eVar.f8b = gVar.f768q;
        eVar.f10d = gVar.A;
        eVar.f9c = gVar.B();
        SpannableString a2 = eVar.a();
        B.e eVar2 = new B.e();
        eVar2.f7a = gVar.f774x;
        eVar2.f8b = gVar.f775y;
        eVar2.f9c = gVar.B();
        CharSequence[] charSequenceArr = {a2, eVar2.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 2; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static CharSequence v(g gVar) {
        B.e eVar = new B.e();
        eVar.f7a = gVar.f769r;
        eVar.f8b = gVar.f770s;
        eVar.f9c = gVar.B();
        SpannableString a2 = eVar.a();
        B.e eVar2 = new B.e();
        eVar2.f7a = gVar.f767p;
        eVar2.f8b = gVar.f768q;
        eVar2.f10d = gVar.A;
        eVar2.f9c = gVar.B();
        SpannableString a3 = eVar2.a();
        B.e eVar3 = new B.e();
        eVar3.f7a = gVar.f774x;
        eVar3.f8b = gVar.f775y;
        eVar3.f9c = gVar.B();
        CharSequence[] charSequenceArr = {a2, a3, eVar3.a()};
        CharSequence charSequence = null;
        for (int i2 = 0; i2 < 3; i2++) {
            CharSequence charSequence2 = charSequenceArr[i2];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static boolean z(g gVar, e eVar) {
        return (gVar.f733G & eVar.f722b) != 0;
    }

    public final void A(ArrayList arrayList) {
        if (E(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f743T.iterator();
        while (it.hasNext()) {
            ((g) it.next()).A(arrayList);
        }
    }

    public final String B() {
        String str = this.f728B;
        return (str == null || str.isEmpty()) ? this.f750a.f789l : this.f728B;
    }

    public final String C() {
        String str;
        if (E(13) && (str = this.f767p) != null && !str.isEmpty()) {
            return this.f767p;
        }
        Iterator it = this.f743T.iterator();
        while (it.hasNext()) {
            String C2 = ((g) it.next()).C();
            if (C2 != null && !C2.isEmpty()) {
                return C2;
            }
        }
        return null;
    }

    public final boolean E(int i2) {
        return (this.f754c & ((long) AbstractC0009j.d(i2))) != 0;
    }

    public final g F(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f737M || f3 >= this.f739O || f4 < this.f738N || f4 >= this.P) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f744U.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!gVar.E(14)) {
                if (gVar.f748Y) {
                    gVar.f748Y = false;
                    if (gVar.f749Z == null) {
                        gVar.f749Z = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f749Z, 0, gVar.f741R, 0)) {
                        Arrays.fill(gVar.f749Z, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f749Z, 0, fArr, 0);
                g F2 = gVar.F(fArr2, z2);
                if (F2 != null) {
                    return F2;
                }
            }
        }
        if (z2 && this.f760i != -1) {
            z3 = true;
        }
        if (G() || z3) {
            return this;
        }
        return null;
    }

    public final boolean G() {
        String str;
        String str2;
        String str3;
        if (E(12)) {
            return false;
        }
        if (E(22)) {
            return true;
        }
        if (E(32)) {
            return false;
        }
        int i2 = this.f755d;
        int i3 = h.f777x;
        return ((i2 & (-61)) == 0 && (this.f754c & ((long) 10682871)) == 0 && ((str = this.f767p) == null || str.isEmpty()) && (((str2 = this.f769r) == null || str2.isEmpty()) && ((str3 = this.f774x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void I(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f751a0) {
            z2 = true;
        }
        if (z2) {
            if (this.f753b0 == null) {
                this.f753b0 = new float[16];
            }
            if (this.f740Q == null) {
                this.f740Q = new float[16];
            }
            Matrix.multiplyMM(this.f753b0, 0, fArr, 0, this.f740Q, 0);
            float[] fArr2 = {this.f737M, this.f738N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            H(fArr3, this.f753b0, fArr2);
            fArr2[0] = this.f739O;
            fArr2[1] = this.f738N;
            H(fArr4, this.f753b0, fArr2);
            fArr2[0] = this.f739O;
            fArr2[1] = this.P;
            H(fArr5, this.f753b0, fArr2);
            fArr2[0] = this.f737M;
            fArr2[1] = this.P;
            H(fArr6, this.f753b0, fArr2);
            if (this.c0 == null) {
                this.c0 = new Rect();
            }
            this.c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f751a0 = false;
        }
        Iterator it = this.f743T.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.f730D = i2;
            i2 = gVar.f752b;
            gVar.I(this.f753b0, hashSet, z2);
        }
    }
}
