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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h {
    public String A;
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public long I;
    public int J;
    public int K;
    public int L;
    public float M;
    public String N;
    public String O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float[] T;
    public float[] U;
    public h V;
    public ArrayList Y;
    public g Z;

    /* renamed from: a, reason: collision with root package name */
    public final i f572a;

    /* renamed from: a0, reason: collision with root package name */
    public g f573a0;

    /* renamed from: c, reason: collision with root package name */
    public long f575c;

    /* renamed from: c0, reason: collision with root package name */
    public float[] f576c0;

    /* renamed from: d, reason: collision with root package name */
    public int f577d;

    /* renamed from: e, reason: collision with root package name */
    public int f579e;

    /* renamed from: e0, reason: collision with root package name */
    public float[] f580e0;

    /* renamed from: f, reason: collision with root package name */
    public int f581f;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f582f0;

    /* renamed from: g, reason: collision with root package name */
    public int f583g;

    /* renamed from: h, reason: collision with root package name */
    public int f584h;

    /* renamed from: i, reason: collision with root package name */
    public int f585i;

    /* renamed from: j, reason: collision with root package name */
    public int f586j;

    /* renamed from: k, reason: collision with root package name */
    public int f587k;

    /* renamed from: l, reason: collision with root package name */
    public float f588l;
    public float m;

    /* renamed from: n, reason: collision with root package name */
    public float f589n;

    /* renamed from: o, reason: collision with root package name */
    public String f590o;

    /* renamed from: p, reason: collision with root package name */
    public String f591p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f592q;

    /* renamed from: r, reason: collision with root package name */
    public String f593r;

    /* renamed from: s, reason: collision with root package name */
    public List f594s;

    /* renamed from: t, reason: collision with root package name */
    public String f595t;
    public ArrayList u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f596w;

    /* renamed from: x, reason: collision with root package name */
    public String f597x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f598y;

    /* renamed from: z, reason: collision with root package name */
    public String f599z;

    /* renamed from: b, reason: collision with root package name */
    public int f574b = -1;
    public int G = -1;
    public boolean H = false;
    public final ArrayList W = new ArrayList();
    public final ArrayList X = new ArrayList();
    public boolean b0 = true;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f578d0 = true;

    public h(i iVar) {
        this.f572a = iVar;
    }

    public static boolean a(h hVar, f fVar) {
        return (hVar.f577d & fVar.f566b) != 0;
    }

    public static CharSequence b(h hVar) {
        c0.e eVar = new c0.e();
        eVar.f70a = hVar.f593r;
        eVar.f71b = hVar.f594s;
        eVar.f72c = hVar.d();
        SpannableString a2 = eVar.a();
        c0.e eVar2 = new c0.e();
        eVar2.f70a = hVar.f591p;
        eVar2.f71b = hVar.f592q;
        eVar2.f73d = hVar.A;
        eVar2.f72c = hVar.d();
        SpannableString a3 = eVar2.a();
        c0.e eVar3 = new c0.e();
        eVar3.f70a = hVar.f597x;
        eVar3.f71b = hVar.f598y;
        eVar3.f72c = hVar.d();
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

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            int i6 = o.d.b(2)[byteBuffer.getInt()];
            int a2 = o.d.a(i6);
            if (a2 == 0) {
                byteBuffer.getInt();
                k kVar = new k();
                kVar.f622a = i4;
                kVar.f623b = i5;
                kVar.f624c = i6;
                arrayList.add(kVar);
            } else if (a2 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                j jVar = new j();
                jVar.f622a = i4;
                jVar.f623b = i5;
                jVar.f624c = i6;
                jVar.f621d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(jVar);
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

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        ArrayList arrayList2 = this.W;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((h) obj).c(arrayList);
        }
    }

    public final String d() {
        String str = this.B;
        return (str == null || str.isEmpty()) ? this.f572a.f612l : this.B;
    }

    public final String e() {
        String str;
        if (h(13) && (str = this.f591p) != null && !str.isEmpty()) {
            return this.f591p;
        }
        ArrayList arrayList = this.W;
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
        return (this.I & ((long) e0.j.d(i2))) != 0;
    }

    public final boolean h(int i2) {
        return (this.f575c & ((long) e0.j.d(i2))) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f2 = fArr[3];
        boolean z3 = false;
        float f3 = fArr[0] / f2;
        float f4 = fArr[1] / f2;
        if (f3 < this.P || f3 >= this.R || f4 < this.Q || f4 >= this.S) {
            return null;
        }
        float[] fArr2 = new float[4];
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            h hVar = (h) arrayList.get(i2);
            if (!hVar.h(14)) {
                if (hVar.b0) {
                    hVar.b0 = false;
                    if (hVar.f576c0 == null) {
                        hVar.f576c0 = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f576c0, 0, hVar.U, 0)) {
                        Arrays.fill(hVar.f576c0, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f576c0, 0, fArr3, 0);
                h i4 = hVar.i(fArr2, z2);
                if (i4 != null) {
                    return i4;
                }
                fArr = fArr3;
            }
            i2 = i3;
        }
        if (z2 && this.f585i != -1) {
            z3 = true;
        }
        if (j() || z3) {
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
        int i2 = this.f577d;
        int i3 = i.f600x;
        if ((i2 & (-61)) != 0 || (this.f575c & 10682871) != 0) {
            return true;
        }
        String str = this.f591p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f593r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f597x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f578d0) {
            z2 = true;
        }
        int i2 = 0;
        if (z2) {
            if (this.f580e0 == null) {
                this.f580e0 = new float[16];
            }
            if (this.T == null) {
                this.T = new float[16];
            }
            Matrix.multiplyMM(this.f580e0, 0, fArr, 0, this.T, 0);
            float[] fArr2 = {this.P, this.Q, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f580e0, fArr2);
            fArr2[0] = this.R;
            fArr2[1] = this.Q;
            k(fArr4, this.f580e0, fArr2);
            fArr2[0] = this.R;
            fArr2[1] = this.S;
            k(fArr5, this.f580e0, fArr2);
            fArr2[0] = this.P;
            fArr2[1] = this.S;
            k(fArr6, this.f580e0, fArr2);
            if (this.f582f0 == null) {
                this.f582f0 = new Rect();
            }
            this.f582f0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f578d0 = false;
        }
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        int i3 = -1;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            h hVar = (h) obj;
            hVar.G = i3;
            i3 = hVar.f574b;
            hVar.l(this.f580e0, hashSet, z2);
        }
    }
}
