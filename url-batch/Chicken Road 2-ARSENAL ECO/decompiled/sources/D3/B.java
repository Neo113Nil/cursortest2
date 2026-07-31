package D3;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    public boolean f385a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Object f386b;

    public B(A.j jVar) {
        this.f386b = jVar;
    }

    public void a() {
        this.f385a = false;
    }

    public void b(boolean z5) {
        if (this.f385a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f385a = true;
        C c7 = (C) this.f386b;
        int i7 = c7.f388b - 1;
        c7.f388b = i7;
        boolean z6 = z5 | c7.f389c;
        c7.f389c = z6;
        if (i7 != 0 || z6) {
            return;
        }
        c7.f390d.s(c7.f387a);
    }

    public void c(byte b7) {
        ((A.j) this.f386b).i(String.valueOf(b7));
    }

    public void d(char c7) {
        A.j jVar = (A.j) this.f386b;
        jVar.b(jVar.f26b, 1);
        char[] cArr = (char[]) jVar.f27c;
        int i7 = jVar.f26b;
        jVar.f26b = i7 + 1;
        cArr[i7] = c7;
    }

    public void e(int i7) {
        ((A.j) this.f386b).i(String.valueOf(i7));
    }

    public void f(long j4) {
        ((A.j) this.f386b).i(String.valueOf(j4));
    }

    public void g(String v5) {
        kotlin.jvm.internal.i.e(v5, "v");
        ((A.j) this.f386b).i(v5);
    }

    public void h(short s6) {
        ((A.j) this.f386b).i(String.valueOf(s6));
    }

    public void i(String value) {
        int i7;
        kotlin.jvm.internal.i.e(value, "value");
        A.j jVar = (A.j) this.f386b;
        jVar.b(jVar.f26b, value.length() + 2);
        char[] cArr = (char[]) jVar.f27c;
        int i8 = jVar.f26b;
        int i9 = i8 + 1;
        cArr[i8] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        int i11 = i9;
        while (i11 < i10) {
            char c7 = cArr[i11];
            byte[] bArr = V5.v.f2774b;
            if (c7 < bArr.length && bArr[c7] != 0) {
                int length2 = value.length();
                for (int i12 = i11 - i9; i12 < length2; i12++) {
                    jVar.b(i11, 2);
                    char charAt = value.charAt(i12);
                    byte[] bArr2 = V5.v.f2774b;
                    if (charAt < bArr2.length) {
                        byte b7 = bArr2[charAt];
                        if (b7 == 0) {
                            i7 = i11 + 1;
                            ((char[]) jVar.f27c)[i11] = charAt;
                        } else {
                            if (b7 == 1) {
                                String str = V5.v.f2773a[charAt];
                                kotlin.jvm.internal.i.b(str);
                                jVar.b(i11, str.length());
                                str.getChars(0, str.length(), (char[]) jVar.f27c, i11);
                                int length3 = str.length() + i11;
                                jVar.f26b = length3;
                                i11 = length3;
                            } else {
                                char[] cArr2 = (char[]) jVar.f27c;
                                cArr2[i11] = '\\';
                                cArr2[i11 + 1] = (char) b7;
                                i11 += 2;
                                jVar.f26b = i11;
                            }
                        }
                    } else {
                        i7 = i11 + 1;
                        ((char[]) jVar.f27c)[i11] = charAt;
                    }
                    i11 = i7;
                }
                jVar.b(i11, 1);
                ((char[]) jVar.f27c)[i11] = '\"';
                jVar.f26b = i11 + 1;
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        jVar.f26b = i10 + 1;
    }

    public B(C c7) {
        this.f386b = c7;
    }

    public void j() {
    }

    public void k() {
    }
}
