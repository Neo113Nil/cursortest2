package io.flutter.view;

import E.AbstractC0008i;
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
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public String f781A;

    /* renamed from: B, reason: collision with root package name */
    public String f782B;

    /* renamed from: C, reason: collision with root package name */
    public int f783C;

    /* renamed from: F, reason: collision with root package name */
    public long f786F;

    /* renamed from: G, reason: collision with root package name */
    public int f787G;

    /* renamed from: H, reason: collision with root package name */
    public int f788H;

    /* renamed from: I, reason: collision with root package name */
    public int f789I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public String f790K;
    public String L;

    /* renamed from: M, reason: collision with root package name */
    public float f791M;

    /* renamed from: N, reason: collision with root package name */
    public float f792N;

    /* renamed from: O, reason: collision with root package name */
    public float f793O;
    public float P;

    /* renamed from: Q, reason: collision with root package name */
    public float[] f794Q;
    public f R;

    /* renamed from: U, reason: collision with root package name */
    public ArrayList f797U;

    /* renamed from: V, reason: collision with root package name */
    public e f798V;

    /* renamed from: W, reason: collision with root package name */
    public e f799W;

    /* renamed from: Y, reason: collision with root package name */
    public float[] f801Y;

    /* renamed from: a, reason: collision with root package name */
    public final g f803a;

    /* renamed from: a0, reason: collision with root package name */
    public float[] f804a0;

    /* renamed from: b0, reason: collision with root package name */
    public Rect f806b0;

    /* renamed from: c, reason: collision with root package name */
    public long f807c;

    /* renamed from: d, reason: collision with root package name */
    public int f808d;

    /* renamed from: e, reason: collision with root package name */
    public int f809e;

    /* renamed from: f, reason: collision with root package name */
    public int f810f;

    /* renamed from: g, reason: collision with root package name */
    public int f811g;

    /* renamed from: h, reason: collision with root package name */
    public int f812h;

    /* renamed from: i, reason: collision with root package name */
    public int f813i;

    /* renamed from: j, reason: collision with root package name */
    public int f814j;

    /* renamed from: k, reason: collision with root package name */
    public int f815k;

    /* renamed from: l, reason: collision with root package name */
    public float f816l;

    /* renamed from: m, reason: collision with root package name */
    public float f817m;

    /* renamed from: n, reason: collision with root package name */
    public float f818n;

    /* renamed from: o, reason: collision with root package name */
    public String f819o;

    /* renamed from: p, reason: collision with root package name */
    public String f820p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f821q;

    /* renamed from: r, reason: collision with root package name */
    public String f822r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f823s;
    public String t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f824u;

    /* renamed from: v, reason: collision with root package name */
    public String f825v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f826w;

    /* renamed from: x, reason: collision with root package name */
    public String f827x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f828y;
    public String z;

    /* renamed from: b, reason: collision with root package name */
    public int f805b = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f784D = -1;

    /* renamed from: E, reason: collision with root package name */
    public boolean f785E = false;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f795S = new ArrayList();

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f796T = new ArrayList();

    /* renamed from: X, reason: collision with root package name */
    public boolean f800X = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f802Z = true;

    public f(g gVar) {
        this.f803a = gVar;
    }

    public static ArrayList C(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = AbstractC0068d.b(2)[byteBuffer.getInt()];
            int a2 = AbstractC0068d.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f854a = i4;
                iVar.f855b = i5;
                iVar.f856c = i6;
                arrayList.add(iVar);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                h hVar = new h();
                hVar.f854a = i4;
                hVar.f855b = i5;
                hVar.f856c = i6;
                hVar.f853d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static void G(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public static Rect d(f fVar) {
        return fVar.f806b0;
    }

    public static boolean j(f fVar, d dVar) {
        return (fVar.f808d & dVar.f775b) != 0;
    }

    public static SpannableString r(f fVar) {
        A.e eVar = new A.e();
        eVar.f7b = fVar.f822r;
        eVar.f8c = fVar.f823s;
        eVar.f9d = fVar.A();
        return eVar.a();
    }

    public static CharSequence s(f fVar) {
        A.e eVar = new A.e();
        eVar.f7b = fVar.f820p;
        eVar.f8c = fVar.f821q;
        eVar.f10e = fVar.f781A;
        eVar.f9d = fVar.A();
        SpannableString a2 = eVar.a();
        A.e eVar2 = new A.e();
        eVar2.f7b = fVar.f827x;
        eVar2.f8c = fVar.f828y;
        eVar2.f9d = fVar.A();
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

    public static CharSequence t(f fVar) {
        A.e eVar = new A.e();
        eVar.f7b = fVar.f822r;
        eVar.f8c = fVar.f823s;
        eVar.f9d = fVar.A();
        SpannableString a2 = eVar.a();
        A.e eVar2 = new A.e();
        eVar2.f7b = fVar.f820p;
        eVar2.f8c = fVar.f821q;
        eVar2.f10e = fVar.f781A;
        eVar2.f9d = fVar.A();
        SpannableString a3 = eVar2.a();
        A.e eVar3 = new A.e();
        eVar3.f7b = fVar.f827x;
        eVar3.f8c = fVar.f828y;
        eVar3.f9d = fVar.A();
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

    public static boolean y(f fVar, d dVar) {
        return (fVar.f787G & dVar.f775b) != 0;
    }

    public final String A() {
        String str = this.f782B;
        return (str == null || str.isEmpty()) ? this.f803a.f841l : this.f782B;
    }

    public final String B() {
        String str;
        if (D(13) && (str = this.f820p) != null && !str.isEmpty()) {
            return this.f820p;
        }
        Iterator it = this.f795S.iterator();
        while (it.hasNext()) {
            String B2 = ((f) it.next()).B();
            if (B2 != null && !B2.isEmpty()) {
                return B2;
            }
        }
        return null;
    }

    public final boolean D(int i2) {
        return (this.f807c & ((long) AbstractC0008i.d(i2))) != 0;
    }

    public final f E(float[] fArr, boolean z) {
        float f2 = fArr[3];
        boolean z2 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.f791M || f3 >= this.f793O || f4 < this.f792N || f4 >= this.P) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f796T.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!fVar.D(14)) {
                if (fVar.f800X) {
                    fVar.f800X = false;
                    if (fVar.f801Y == null) {
                        fVar.f801Y = new float[16];
                    }
                    if (!Matrix.invertM(fVar.f801Y, 0, fVar.f794Q, 0)) {
                        Arrays.fill(fVar.f801Y, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, fVar.f801Y, 0, fArr, 0);
                f E2 = fVar.E(fArr2, z);
                if (E2 != null) {
                    return E2;
                }
            }
        }
        if (z && this.f813i != -1) {
            z2 = true;
        }
        if (F() || z2) {
            return this;
        }
        return null;
    }

    public final boolean F() {
        String str;
        String str2;
        String str3;
        if (D(12)) {
            return false;
        }
        if (D(22)) {
            return true;
        }
        int i2 = this.f808d;
        int i3 = g.f829y;
        return ((i2 & (-61)) == 0 && (this.f807c & ((long) 10682871)) == 0 && ((str = this.f820p) == null || str.isEmpty()) && (((str2 = this.f822r) == null || str2.isEmpty()) && ((str3 = this.f827x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void H(float[] fArr, HashSet hashSet, boolean z) {
        hashSet.add(this);
        if (this.f802Z) {
            z = true;
        }
        if (z) {
            if (this.f804a0 == null) {
                this.f804a0 = new float[16];
            }
            if (this.f794Q == null) {
                this.f794Q = new float[16];
            }
            Matrix.multiplyMM(this.f804a0, 0, fArr, 0, this.f794Q, 0);
            float[] fArr2 = {this.f791M, this.f792N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            G(fArr3, this.f804a0, fArr2);
            fArr2[0] = this.f793O;
            fArr2[1] = this.f792N;
            G(fArr4, this.f804a0, fArr2);
            fArr2[0] = this.f793O;
            fArr2[1] = this.P;
            G(fArr5, this.f804a0, fArr2);
            fArr2[0] = this.f791M;
            fArr2[1] = this.P;
            G(fArr6, this.f804a0, fArr2);
            if (this.f806b0 == null) {
                this.f806b0 = new Rect();
            }
            this.f806b0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f802Z = false;
        }
        Iterator it = this.f795S.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.f784D = i2;
            i2 = fVar.f805b;
            fVar.H(this.f804a0, hashSet, z);
        }
    }

    public final void z(ArrayList arrayList) {
        if (D(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f795S.iterator();
        while (it.hasNext()) {
            ((f) it.next()).z(arrayList);
        }
    }
}
