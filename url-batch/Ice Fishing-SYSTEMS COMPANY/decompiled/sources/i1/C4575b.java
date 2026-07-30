package i1;

import B0.c;
import B1.y;
import L2.i;
import S0.s;
import com.anythink.core.common.d.j;
import com.google.android.gms.internal.ads.CL;
import java.io.EOFException;
import u8.e;
import u8.h;
import u8.m;
import u8.r;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4575b extends AbstractC4574a {

    /* renamed from: E, reason: collision with root package name */
    public static final h f38281E;

    /* renamed from: F, reason: collision with root package name */
    public static final h f38282F;

    /* renamed from: G, reason: collision with root package name */
    public static final h f38283G;

    /* renamed from: A, reason: collision with root package name */
    public int f38284A;

    /* renamed from: B, reason: collision with root package name */
    public long f38285B;

    /* renamed from: C, reason: collision with root package name */
    public int f38286C;

    /* renamed from: D, reason: collision with root package name */
    public String f38287D;

    /* renamed from: y, reason: collision with root package name */
    public final r f38288y;

    /* renamed from: z, reason: collision with root package name */
    public final e f38289z;

    static {
        h hVar = h.f41278w;
        f38281E = i.n("'\\");
        f38282F = i.n("\"\\");
        f38283G = i.n("{}[]:, \n\t\r\f/\\;#=");
        i.n("\n\r");
        i.n("*/");
    }

    public C4575b(r rVar) {
        this.f38278u = new int[32];
        this.f38279v = new String[32];
        this.f38280w = new int[32];
        this.f38284A = 0;
        this.f38288y = rVar;
        this.f38289z = rVar.f41309u;
        J(6);
    }

    @Override // i1.AbstractC4574a
    public final void B() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i != 2) {
            throw new c("Expected END_OBJECT but was " + CL.x(I()) + " at path " + C());
        }
        int i4 = this.f38277n;
        int i9 = i4 - 1;
        this.f38277n = i9;
        this.f38279v[i9] = null;
        int[] iArr = this.f38280w;
        int i10 = i4 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f38284A = 0;
    }

    @Override // i1.AbstractC4574a
    public final boolean D() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // i1.AbstractC4574a
    public final boolean E() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 5) {
            this.f38284A = 0;
            int[] iArr = this.f38280w;
            int i4 = this.f38277n - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (i == 6) {
            this.f38284A = 0;
            int[] iArr2 = this.f38280w;
            int i9 = this.f38277n - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new c("Expected a boolean but was " + CL.x(I()) + " at path " + C());
    }

    @Override // i1.AbstractC4574a
    public final double F() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 16) {
            this.f38284A = 0;
            int[] iArr = this.f38280w;
            int i4 = this.f38277n - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f38285B;
        }
        if (i == 17) {
            long j9 = this.f38286C;
            e eVar = this.f38289z;
            eVar.getClass();
            this.f38287D = eVar.F(j9, M7.a.f1916a);
        } else if (i == 9) {
            this.f38287D = e0(f38282F);
        } else if (i == 8) {
            this.f38287D = e0(f38281E);
        } else if (i == 10) {
            this.f38287D = f0();
        } else if (i != 11) {
            throw new c("Expected a double but was " + CL.x(I()) + " at path " + C());
        }
        this.f38284A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f38287D);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new y("JSON forbids NaN and infinities: " + parseDouble + " at path " + C());
            }
            this.f38287D = null;
            this.f38284A = 0;
            int[] iArr2 = this.f38280w;
            int i9 = this.f38277n - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new c("Expected a double but was " + this.f38287D + " at path " + C());
        }
    }

    @Override // i1.AbstractC4574a
    public final int G() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 16) {
            long j9 = this.f38285B;
            int i4 = (int) j9;
            if (j9 == i4) {
                this.f38284A = 0;
                int[] iArr = this.f38280w;
                int i9 = this.f38277n - 1;
                iArr[i9] = iArr[i9] + 1;
                return i4;
            }
            throw new c("Expected an int but was " + this.f38285B + " at path " + C());
        }
        if (i == 17) {
            long j10 = this.f38286C;
            e eVar = this.f38289z;
            eVar.getClass();
            this.f38287D = eVar.F(j10, M7.a.f1916a);
        } else if (i == 9 || i == 8) {
            String e02 = i == 9 ? e0(f38282F) : e0(f38281E);
            this.f38287D = e02;
            try {
                int parseInt = Integer.parseInt(e02);
                this.f38284A = 0;
                int[] iArr2 = this.f38280w;
                int i10 = this.f38277n - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new c("Expected an int but was " + CL.x(I()) + " at path " + C());
        }
        this.f38284A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f38287D);
            int i11 = (int) parseDouble;
            if (i11 != parseDouble) {
                throw new c("Expected an int but was " + this.f38287D + " at path " + C());
            }
            this.f38287D = null;
            this.f38284A = 0;
            int[] iArr3 = this.f38280w;
            int i12 = this.f38277n - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        } catch (NumberFormatException unused2) {
            throw new c("Expected an int but was " + this.f38287D + " at path " + C());
        }
    }

    @Override // i1.AbstractC4574a
    public final String H() {
        String F8;
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 10) {
            F8 = f0();
        } else if (i == 9) {
            F8 = e0(f38282F);
        } else if (i == 8) {
            F8 = e0(f38281E);
        } else if (i == 11) {
            F8 = this.f38287D;
            this.f38287D = null;
        } else if (i == 16) {
            F8 = Long.toString(this.f38285B);
        } else {
            if (i != 17) {
                throw new c("Expected a string but was " + CL.x(I()) + " at path " + C());
            }
            long j9 = this.f38286C;
            e eVar = this.f38289z;
            eVar.getClass();
            F8 = eVar.F(j9, M7.a.f1916a);
        }
        this.f38284A = 0;
        int[] iArr = this.f38280w;
        int i4 = this.f38277n - 1;
        iArr[i4] = iArr[i4] + 1;
        return F8;
    }

    @Override // i1.AbstractC4574a
    public final int I() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r6 = -1;
     */
    @Override // i1.AbstractC4574a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K(s sVar) {
        int b9;
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return a0(this.f38287D, sVar);
        }
        m mVar = (m) sVar.f2953v;
        r rVar = this.f38288y;
        if (rVar.f41310v) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            e eVar = rVar.f41309u;
            b9 = v8.a.b(eVar, mVar, true);
            if (b9 != -2) {
                if (b9 != -1) {
                    eVar.H(mVar.f41294n[b9].a());
                }
            } else if (rVar.f41308n.f(8192L, eVar) == -1) {
                break;
            }
        }
        if (b9 != -1) {
            this.f38284A = 0;
            this.f38279v[this.f38277n - 1] = ((String[]) sVar.f2952u)[b9];
            return b9;
        }
        String str = this.f38279v[this.f38277n - 1];
        String c02 = c0();
        int a02 = a0(c02, sVar);
        if (a02 == -1) {
            this.f38284A = 15;
            this.f38287D = c02;
            this.f38279v[this.f38277n - 1] = str;
        }
        return a02;
    }

    @Override // i1.AbstractC4574a
    public final void V() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 14) {
            long i4 = this.f38288y.i(f38283G);
            e eVar = this.f38289z;
            if (i4 == -1) {
                i4 = eVar.f41277u;
            }
            eVar.H(i4);
        } else if (i == 13) {
            h0(f38282F);
        } else if (i == 12) {
            h0(f38281E);
        } else if (i != 15) {
            throw new c("Expected a name but was " + CL.x(I()) + " at path " + C());
        }
        this.f38284A = 0;
        this.f38279v[this.f38277n - 1] = "null";
    }

    @Override // i1.AbstractC4574a
    public final void W() {
        int i = 0;
        do {
            int i4 = this.f38284A;
            if (i4 == 0) {
                i4 = Z();
            }
            if (i4 == 3) {
                J(1);
            } else if (i4 == 1) {
                J(3);
            } else {
                if (i4 == 4) {
                    i--;
                    if (i < 0) {
                        throw new c("Expected a value but was " + CL.x(I()) + " at path " + C());
                    }
                    this.f38277n--;
                } else if (i4 == 2) {
                    i--;
                    if (i < 0) {
                        throw new c("Expected a value but was " + CL.x(I()) + " at path " + C());
                    }
                    this.f38277n--;
                } else {
                    e eVar = this.f38289z;
                    if (i4 == 14 || i4 == 10) {
                        long i9 = this.f38288y.i(f38283G);
                        if (i9 == -1) {
                            i9 = eVar.f41277u;
                        }
                        eVar.H(i9);
                    } else if (i4 == 9 || i4 == 13) {
                        h0(f38282F);
                    } else if (i4 == 8 || i4 == 12) {
                        h0(f38281E);
                    } else if (i4 == 17) {
                        eVar.H(this.f38286C);
                    } else if (i4 == 18) {
                        throw new c("Expected a value but was " + CL.x(I()) + " at path " + C());
                    }
                }
                this.f38284A = 0;
            }
            i++;
            this.f38284A = 0;
        } while (i != 0);
        int[] iArr = this.f38280w;
        int i10 = this.f38277n - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f38279v[i10] = "null";
    }

    public final void Y() {
        X("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.f38286C = r2;
        r9 = 17;
        r22.f38284A = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (b0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r12 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.f38285B = r12;
        r7.H(r2);
        r9 = 16;
        r22.f38284A = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Z() {
        int i;
        String str;
        String str2;
        long j9;
        char k6;
        int i4;
        char c4;
        int[] iArr = this.f38278u;
        int i9 = this.f38277n - 1;
        int i10 = iArr[i9];
        e eVar = this.f38289z;
        if (i10 == 1) {
            iArr[i9] = 2;
        } else if (i10 == 2) {
            int d02 = d0(true);
            eVar.z();
            if (d02 != 44) {
                if (d02 == 59) {
                    Y();
                    throw null;
                }
                if (d02 == 93) {
                    this.f38284A = 4;
                    return 4;
                }
                X("Unterminated array");
                throw null;
            }
        } else {
            if (i10 == 3 || i10 == 5) {
                iArr[i9] = 4;
                if (i10 == 5) {
                    int d03 = d0(true);
                    eVar.z();
                    if (d03 != 44) {
                        if (d03 == 59) {
                            Y();
                            throw null;
                        }
                        if (d03 == 125) {
                            this.f38284A = 2;
                            return 2;
                        }
                        X("Unterminated object");
                        throw null;
                    }
                }
                int d04 = d0(true);
                if (d04 == 34) {
                    eVar.z();
                    this.f38284A = 13;
                    return 13;
                }
                if (d04 == 39) {
                    eVar.z();
                    Y();
                    throw null;
                }
                if (d04 != 125) {
                    Y();
                    throw null;
                }
                if (i10 == 5) {
                    X("Expected name");
                    throw null;
                }
                eVar.z();
                this.f38284A = 2;
                return 2;
            }
            if (i10 == 4) {
                iArr[i9] = 5;
                int d05 = d0(true);
                eVar.z();
                if (d05 != 58) {
                    if (d05 != 61) {
                        X("Expected ':'");
                        throw null;
                    }
                    Y();
                    throw null;
                }
            } else if (i10 == 6) {
                iArr[i9] = 7;
            } else {
                if (i10 == 7) {
                    if (d0(false) == -1) {
                        this.f38284A = 18;
                        return 18;
                    }
                    Y();
                    throw null;
                }
                if (i10 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int d06 = d0(true);
        if (d06 == 34) {
            eVar.z();
            this.f38284A = 9;
            return 9;
        }
        if (d06 == 39) {
            Y();
            throw null;
        }
        if (d06 != 44 && d06 != 59) {
            if (d06 == 91) {
                eVar.z();
                this.f38284A = 3;
                return 3;
            }
            if (d06 != 93) {
                if (d06 == 123) {
                    eVar.z();
                    this.f38284A = 1;
                    return 1;
                }
                byte k9 = eVar.k(0L);
                r rVar = this.f38288y;
                if (k9 == 116 || k9 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else if (k9 == 102 || k9 == 70) {
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (k9 == 110 || k9 == 78) {
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j9 = 0;
                    i = 0;
                    if (i == 0) {
                        return i;
                    }
                    boolean z8 = true;
                    long j10 = j9;
                    char c9 = 0;
                    int i11 = 0;
                    boolean z9 = false;
                    while (true) {
                        int i12 = i11 + 1;
                        if (!rVar.S(i12)) {
                            break;
                        }
                        byte k10 = eVar.k(i11);
                        if (k10 != 43) {
                            if (k10 == 69 || k10 == 101) {
                                c4 = 6;
                                if (c9 != 2 && c9 != 4) {
                                    break;
                                }
                                c9 = 5;
                                i11 = i12;
                            } else if (k10 == 45) {
                                c4 = 6;
                                if (c9 == 0) {
                                    c9 = 1;
                                    z9 = true;
                                    i11 = i12;
                                } else {
                                    if (c9 != 5) {
                                        break;
                                    }
                                    c9 = c4;
                                    i11 = i12;
                                }
                            } else if (k10 == 46) {
                                c4 = 6;
                                if (c9 != 2) {
                                    break;
                                }
                                c9 = 3;
                                i11 = i12;
                            } else {
                                if (k10 < 48 || k10 > 57) {
                                    break;
                                }
                                if (c9 == 1 || c9 == 0) {
                                    c4 = 6;
                                    j10 = -(k10 - 48);
                                    c9 = 2;
                                } else {
                                    if (c9 == 2) {
                                        if (j10 == j9) {
                                            break;
                                        }
                                        long j11 = (10 * j10) - (k10 - 48);
                                        z8 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                        j10 = j11;
                                    } else if (c9 == 3) {
                                        c9 = 4;
                                    } else {
                                        c4 = 6;
                                        if (c9 == 5 || c9 == 6) {
                                            c9 = 7;
                                        }
                                    }
                                    c4 = 6;
                                    i11 = i12;
                                }
                                i11 = i12;
                            }
                            if (i4 == 0) {
                                return i4;
                            }
                            if (b0(eVar.k(j9))) {
                                Y();
                                throw null;
                            }
                            X("Expected value");
                            throw null;
                        }
                        c4 = 6;
                        if (c9 != 5) {
                            break;
                        }
                        c9 = c4;
                        i11 = i12;
                    }
                    i4 = 0;
                    if (i4 == 0) {
                    }
                }
                int length = str2.length();
                j9 = 0;
                int i13 = 1;
                while (true) {
                    if (i13 < length) {
                        int i14 = i13 + 1;
                        if (!rVar.S(i14) || ((k6 = eVar.k(i13)) != str2.charAt(i13) && k6 != str.charAt(i13))) {
                            break;
                        }
                        i13 = i14;
                    } else if (!rVar.S(length + 1) || !b0(eVar.k(length))) {
                        eVar.H(length);
                        this.f38284A = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i10 == 1) {
                eVar.z();
                this.f38284A = 4;
                return 4;
            }
        }
        if (i10 == 1 || i10 == 2) {
            Y();
            throw null;
        }
        X("Unexpected value");
        throw null;
    }

    public final int a0(String str, s sVar) {
        int length = ((String[]) sVar.f2952u).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) sVar.f2952u)[i])) {
                this.f38284A = 0;
                this.f38279v[this.f38277n - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // i1.AbstractC4574a
    public final void b() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 3) {
            J(1);
            this.f38280w[this.f38277n - 1] = 0;
            this.f38284A = 0;
        } else {
            throw new c("Expected BEGIN_ARRAY but was " + CL.x(I()) + " at path " + C());
        }
    }

    public final boolean b0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case j.v.f12735I /* 93 */:
                            return false;
                        case j.v.f12734H /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        Y();
        throw null;
    }

    public final String c0() {
        String str;
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 14) {
            str = f0();
        } else if (i == 13) {
            str = e0(f38282F);
        } else if (i == 12) {
            str = e0(f38281E);
        } else {
            if (i != 15) {
                throw new c("Expected a name but was " + CL.x(I()) + " at path " + C());
            }
            str = this.f38287D;
        }
        this.f38284A = 0;
        this.f38279v[this.f38277n - 1] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38284A = 0;
        this.f38278u[0] = 8;
        this.f38277n = 1;
        e eVar = this.f38289z;
        eVar.H(eVar.f41277u);
        this.f38288y.close();
    }

    public final int d0(boolean z8) {
        int i = 0;
        while (true) {
            int i4 = i + 1;
            r rVar = this.f38288y;
            if (!rVar.S(i4)) {
                if (z8) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j9 = i;
            e eVar = this.f38289z;
            byte k6 = eVar.k(j9);
            if (k6 != 10 && k6 != 32 && k6 != 13 && k6 != 9) {
                eVar.H(j9);
                if (k6 == 47) {
                    if (rVar.S(2L)) {
                        Y();
                        throw null;
                    }
                } else if (k6 == 35) {
                    Y();
                    throw null;
                }
                return k6;
            }
            i = i4;
        }
    }

    public final String e0(h hVar) {
        StringBuilder sb = null;
        while (true) {
            long i = this.f38288y.i(hVar);
            if (i == -1) {
                X("Unterminated string");
                throw null;
            }
            e eVar = this.f38289z;
            if (eVar.k(i) != 92) {
                if (sb == null) {
                    String F8 = eVar.F(i, M7.a.f1916a);
                    eVar.z();
                    return F8;
                }
                sb.append(eVar.F(i, M7.a.f1916a));
                eVar.z();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(eVar.F(i, M7.a.f1916a));
            eVar.z();
            sb.append(g0());
        }
    }

    public final String f0() {
        long i = this.f38288y.i(f38283G);
        e eVar = this.f38289z;
        if (i == -1) {
            return eVar.G();
        }
        eVar.getClass();
        return eVar.F(i, M7.a.f1916a);
    }

    public final char g0() {
        int i;
        r rVar = this.f38288y;
        if (!rVar.S(1L)) {
            X("Unterminated escape sequence");
            throw null;
        }
        e eVar = this.f38289z;
        byte z8 = eVar.z();
        if (z8 == 10 || z8 == 34 || z8 == 39 || z8 == 47 || z8 == 92) {
            return (char) z8;
        }
        if (z8 == 98) {
            return '\b';
        }
        if (z8 == 102) {
            return '\f';
        }
        if (z8 == 110) {
            return '\n';
        }
        if (z8 == 114) {
            return '\r';
        }
        if (z8 == 116) {
            return '\t';
        }
        if (z8 != 117) {
            X("Invalid escape sequence: \\" + ((char) z8));
            throw null;
        }
        if (!rVar.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + C());
        }
        char c4 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            byte k6 = eVar.k(i4);
            char c9 = (char) (c4 << 4);
            if (k6 >= 48 && k6 <= 57) {
                i = k6 - 48;
            } else if (k6 >= 97 && k6 <= 102) {
                i = k6 - 87;
            } else {
                if (k6 < 65 || k6 > 70) {
                    X("\\u".concat(eVar.F(4L, M7.a.f1916a)));
                    throw null;
                }
                i = k6 - 55;
            }
            c4 = (char) (i + c9);
        }
        eVar.H(4L);
        return c4;
    }

    public final void h0(h hVar) {
        while (true) {
            long i = this.f38288y.i(hVar);
            if (i == -1) {
                X("Unterminated string");
                throw null;
            }
            e eVar = this.f38289z;
            if (eVar.k(i) != 92) {
                eVar.H(i + 1);
                return;
            } else {
                eVar.H(i + 1);
                g0();
            }
        }
    }

    @Override // i1.AbstractC4574a
    public final void j() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i == 1) {
            J(3);
            this.f38284A = 0;
        } else {
            throw new c("Expected BEGIN_OBJECT but was " + CL.x(I()) + " at path " + C());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f38288y + ")";
    }

    @Override // i1.AbstractC4574a
    public final void z() {
        int i = this.f38284A;
        if (i == 0) {
            i = Z();
        }
        if (i != 4) {
            throw new c("Expected END_ARRAY but was " + CL.x(I()) + " at path " + C());
        }
        int i4 = this.f38277n;
        this.f38277n = i4 - 1;
        int[] iArr = this.f38280w;
        int i9 = i4 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f38284A = 0;
    }
}
