package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rt {
    protected final byo f;
    private final ru g;
    int a = 0;
    private int h = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    private int i = -1;
    private boolean j = false;

    public rt(ru ruVar, byo byoVar) {
        this.g = ruVar;
        this.f = byoVar;
    }

    public final float a(ry ryVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == ryVar.c) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return 0.0f;
    }

    public final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final float c(ry ryVar, boolean z) {
        int i = this.e;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.b[i] == ryVar.c) {
                int i4 = this.e;
                int[] iArr = this.c;
                if (i == i4) {
                    this.e = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    ryVar.b(this.g);
                }
                ryVar.l--;
                this.a--;
                this.b[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.d[i];
            }
            i2++;
            i3 = i;
            i = this.c[i];
        }
        return 0.0f;
    }

    public final ry d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((ry[]) this.f.b)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(ry ryVar, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.e;
            if (i == -1) {
                this.e = 0;
                this.d[0] = f;
                this.b[0] = ryVar.c;
                this.c[0] = -1;
                ryVar.l++;
                ryVar.a(this.g);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int length = this.b.length;
                if (i2 >= length) {
                    this.j = true;
                    this.i = length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.b[i];
                int i6 = ryVar.c;
                if (i5 == i6) {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.e;
                        int[] iArr2 = this.c;
                        if (i == i7) {
                            this.e = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            ryVar.b(this.g);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        ryVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.c[i];
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr3 = this.b;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.b;
            int length2 = iArr4.length;
            if (i8 >= length2 && this.a < length2) {
                int i10 = 0;
                while (true) {
                    iArr = this.b;
                    if (i10 >= iArr.length) {
                        iArr4 = iArr;
                        break;
                    } else {
                        if (iArr[i10] == -1) {
                            i8 = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            iArr = iArr4;
            int length3 = iArr.length;
            if (i8 >= length3) {
                int i11 = this.h;
                int i12 = i11 + i11;
                this.h = i12;
                this.j = false;
                this.i = length3 - 1;
                this.d = Arrays.copyOf(this.d, i12);
                this.b = Arrays.copyOf(this.b, this.h);
                this.c = Arrays.copyOf(this.c, this.h);
                i8 = length3;
            }
            this.b[i8] = ryVar.c;
            this.d[i8] = f;
            int[] iArr5 = this.c;
            if (i3 != -1) {
                iArr5[i8] = iArr5[i3];
                iArr5[i3] = i8;
            } else {
                iArr5[i8] = this.e;
                this.e = i8;
            }
            ryVar.l++;
            ryVar.a(this.g);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i13 = this.i;
            int length4 = this.b.length;
            if (i13 >= length4) {
                this.j = true;
                this.i = length4 - 1;
            }
        }
    }

    public final void f() {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            ry ryVar = ((ry[]) this.f.b)[this.b[i]];
            if (ryVar != null) {
                ryVar.b(this.g);
            }
            i = this.c[i];
        }
        this.e = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(ry ryVar, float f) {
        int[] iArr;
        int length;
        int i;
        int length2;
        if (f == 0.0f) {
            c(ryVar, true);
            return;
        }
        int i2 = this.e;
        if (i2 == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = ryVar.c;
            this.c[0] = -1;
            ryVar.l++;
            ryVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i3 = this.i + 1;
            this.i = i3;
            int length3 = this.b.length;
            if (i3 >= length3) {
                this.j = true;
                this.i = length3 - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
            int i6 = this.b[i2];
            int i7 = ryVar.c;
            if (i6 == i7) {
                this.d[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.c[i2];
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr2 = this.b;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.b;
        int length4 = iArr3.length;
        if (i8 >= length4 && this.a < length4) {
            int i10 = 0;
            while (true) {
                iArr = this.b;
                if (i10 >= iArr.length) {
                    iArr3 = iArr;
                    break;
                } else {
                    if (iArr[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            length = iArr.length;
            if (i8 >= length) {
                int i11 = this.h;
                int i12 = i11 + i11;
                this.h = i12;
                this.j = false;
                this.i = length - 1;
                this.d = Arrays.copyOf(this.d, i12);
                this.b = Arrays.copyOf(this.b, this.h);
                this.c = Arrays.copyOf(this.c, this.h);
                i8 = length;
            }
            this.b[i8] = ryVar.c;
            this.d[i8] = f;
            int[] iArr4 = this.c;
            if (i4 == -1) {
                iArr4[i8] = iArr4[i4];
                iArr4[i4] = i8;
            } else {
                iArr4[i8] = this.e;
                this.e = i8;
            }
            ryVar.l++;
            ryVar.a(this.g);
            i = this.a + 1;
            this.a = i;
            if (!this.j) {
                this.i++;
            }
            length2 = this.b.length;
            if (i >= length2) {
                this.j = true;
            }
            if (this.i < length2) {
                this.j = true;
                this.i = length2 - 1;
                return;
            }
            return;
        }
        iArr = iArr3;
        length = iArr.length;
        if (i8 >= length) {
        }
        this.b[i8] = ryVar.c;
        this.d[i8] = f;
        int[] iArr42 = this.c;
        if (i4 == -1) {
        }
        ryVar.l++;
        ryVar.a(this.g);
        i = this.a + 1;
        this.a = i;
        if (!this.j) {
        }
        length2 = this.b.length;
        if (i >= length2) {
        }
        if (this.i < length2) {
        }
    }

    public final String toString() {
        int i = this.e;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = (str.concat(" -> ") + this.d[i] + " : ").concat(String.valueOf(String.valueOf(((ry[]) this.f.b)[this.b[i]])));
            i = this.c[i];
        }
        return str;
    }
}
