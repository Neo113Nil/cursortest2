package s;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Comparator;
import s.C3402b;

/* loaded from: classes.dex */
public class h extends C3402b {

    /* renamed from: g, reason: collision with root package name */
    private int f45908g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f45909h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f45910i;

    /* renamed from: j, reason: collision with root package name */
    private int f45911j;

    /* renamed from: k, reason: collision with root package name */
    b f45912k;

    /* renamed from: l, reason: collision with root package name */
    C3403c f45913l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f45921c - iVar2.f45921c;
        }
    }

    class b implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        i f45915b;

        /* renamed from: c, reason: collision with root package name */
        h f45916c;

        public b(h hVar) {
            this.f45916c = hVar;
        }

        public boolean a(i iVar, float f4) {
            boolean z4 = true;
            if (!this.f45915b.f45919a) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f5 = iVar.f45927i[i4];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f4;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        this.f45915b.f45927i[i4] = f6;
                    } else {
                        this.f45915b.f45927i[i4] = 0.0f;
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f45915b.f45927i;
                float f7 = fArr[i5] + (iVar.f45927i[i5] * f4);
                fArr[i5] = f7;
                if (Math.abs(f7) < 1.0E-4f) {
                    this.f45915b.f45927i[i5] = 0.0f;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                h.this.G(this.f45915b);
            }
            return false;
        }

        public void b(i iVar) {
            this.f45915b = iVar;
        }

        public final boolean c() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f45915b.f45927i[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f45915b.f45921c - ((i) obj).f45921c;
        }

        public final boolean d(i iVar) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = iVar.f45927i[i4];
                float f5 = this.f45915b.f45927i[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f45915b.f45927i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f45915b != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.f45915b.f45927i[i4] + " ";
                }
            }
            return str + "] " + this.f45915b;
        }
    }

    public h(C3403c c3403c) {
        super(c3403c);
        this.f45908g = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f45909h = new i[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f45910i = new i[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f45911j = 0;
        this.f45912k = new b(this);
        this.f45913l = c3403c;
    }

    private final void F(i iVar) {
        int i4;
        int i5 = this.f45911j + 1;
        i[] iVarArr = this.f45909h;
        if (i5 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f45909h = iVarArr2;
            this.f45910i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f45909h;
        int i6 = this.f45911j;
        iVarArr3[i6] = iVar;
        int i7 = i6 + 1;
        this.f45911j = i7;
        if (i7 > 1 && iVarArr3[i6].f45921c > iVar.f45921c) {
            int i8 = 0;
            while (true) {
                i4 = this.f45911j;
                if (i8 >= i4) {
                    break;
                }
                this.f45910i[i8] = this.f45909h[i8];
                i8++;
            }
            Arrays.sort(this.f45910i, 0, i4, new a());
            for (int i9 = 0; i9 < this.f45911j; i9++) {
                this.f45909h[i9] = this.f45910i[i9];
            }
        }
        iVar.f45919a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i4 = 0;
        while (i4 < this.f45911j) {
            if (this.f45909h[i4] == iVar) {
                while (true) {
                    int i5 = this.f45911j;
                    if (i4 >= i5 - 1) {
                        this.f45911j = i5 - 1;
                        iVar.f45919a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f45909h;
                        int i6 = i4 + 1;
                        iVarArr[i4] = iVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // s.C3402b
    public void C(C3402b c3402b, boolean z4) {
        i iVar = c3402b.f45875a;
        if (iVar == null) {
            return;
        }
        C3402b.a aVar = c3402b.f45879e;
        int b4 = aVar.b();
        for (int i4 = 0; i4 < b4; i4++) {
            i e4 = aVar.e(i4);
            float h4 = aVar.h(i4);
            this.f45912k.b(e4);
            if (this.f45912k.a(iVar, h4)) {
                F(e4);
            }
            this.f45876b += c3402b.f45876b * h4;
        }
        G(iVar);
    }

    @Override // s.C3402b, s.C3404d.a
    public void a(i iVar) {
        this.f45912k.b(iVar);
        this.f45912k.e();
        iVar.f45927i[iVar.f45923e] = 1.0f;
        F(iVar);
    }

    @Override // s.C3402b, s.C3404d.a
    public i b(C3404d c3404d, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f45911j; i5++) {
            i iVar = this.f45909h[i5];
            if (!zArr[iVar.f45921c]) {
                this.f45912k.b(iVar);
                if (i4 == -1) {
                    if (!this.f45912k.c()) {
                    }
                    i4 = i5;
                } else {
                    if (!this.f45912k.d(this.f45909h[i4])) {
                    }
                    i4 = i5;
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f45909h[i4];
    }

    @Override // s.C3402b, s.C3404d.a
    public void clear() {
        this.f45911j = 0;
        this.f45876b = 0.0f;
    }

    @Override // s.C3402b
    public String toString() {
        String str = " goal -> (" + this.f45876b + ") : ";
        for (int i4 = 0; i4 < this.f45911j; i4++) {
            this.f45912k.b(this.f45909h[i4]);
            str = str + this.f45912k + " ";
        }
        return str;
    }
}
