package defpackage;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yv2 {
    public static final r00 a = new r00(o00.O);

    public static final void a(pw2 pw2Var, my myVar, a00 a00Var, int i) {
        a00Var.Z(-460300127);
        int i2 = (a00Var.f(pw2Var) ? 4 : 2) | i | (a00Var.h(myVar) ? 32 : 16);
        if ((i2 & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            r00 r00Var = a;
            yk3.a(r00Var.a(((pw2) a00Var.j(r00Var)).d(pw2Var)), myVar, a00Var, (i2 & 112) | 8);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new n8(i, 23, pw2Var, myVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, vl1 vl1Var, long j, long j2, jq0 jq0Var, long j3, ut2 ut2Var, long j4, int i, boolean z, int i2, int i3, pw2 pw2Var, a00 a00Var, int i4, int i5, int i6) {
        int i7;
        int i8;
        long j5;
        int i9;
        long j6;
        int i10;
        jq0 jq0Var2;
        int i11;
        int i12;
        ut2 ut2Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        vl1 vl1Var2;
        long j7;
        ut2 ut2Var3;
        pw2 pw2Var2;
        int i19;
        int i20;
        int i21;
        boolean z2;
        long j8;
        long b;
        int i22;
        boolean z3;
        boolean z4;
        long j9;
        int i23;
        pw2 pw2Var3;
        int i24;
        int i25;
        vl1 vl1Var3;
        jq0 jq0Var3;
        long j10;
        ut2 ut2Var4;
        long j11;
        long j12;
        n72 s;
        a00Var.Z(-2055108902);
        if ((i4 & 6) == 0) {
            i7 = (a00Var.f(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i26 = i6 & 2;
        if (i26 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= a00Var.f(vl1Var) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                j5 = j;
                i7 |= a00Var.e(j5) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i4 & 3072) == 0) {
                        i7 |= a00Var.e(j6) ? 2048 : 1024;
                    }
                }
                int i27 = i7 | 24576;
                i10 = i6 & 32;
                if (i10 != 0) {
                    i27 = i7 | 221184;
                } else if ((196608 & i4) == 0) {
                    jq0Var2 = jq0Var;
                    i27 |= a00Var.f(jq0Var2) ? 131072 : 65536;
                    i11 = i27 | 114819072;
                    i12 = i6 & 512;
                    if (i12 == 0) {
                        i11 = i27 | 920125440;
                    } else if ((805306368 & i4) == 0) {
                        ut2Var2 = ut2Var;
                        i11 |= a00Var.f(ut2Var2) ? 536870912 : 268435456;
                        int i28 = i5 | 6;
                        i13 = i6 & 2048;
                        if (i13 != 0) {
                            i28 = i5 | 54;
                        } else if ((i5 & 48) == 0) {
                            i28 |= a00Var.d(i) ? 32 : 16;
                        }
                        int i29 = i28;
                        i14 = i6 & 4096;
                        if (i14 != 0) {
                            i15 = i29 | 384;
                        } else {
                            int i30 = i29;
                            if ((i5 & 384) == 0) {
                                i30 |= a00Var.g(z) ? 256 : 128;
                            }
                            i15 = i30;
                        }
                        i16 = i6 & Utility.DEFAULT_STREAM_BUFFER_SIZE;
                        if (i16 != 0) {
                            i17 = i15 | 3072;
                        } else {
                            int i31 = i15;
                            if ((i5 & 3072) == 0) {
                                i17 = i31 | (a00Var.d(i2) ? 2048 : 1024);
                            } else {
                                i17 = i31;
                            }
                        }
                        i18 = i17 | 221184 | (((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == 0 || !a00Var.f(pw2Var)) ? 524288 : 1048576);
                        if ((i11 & 306783379) != 306783378 && (i18 & 599187) == 599186 && a00Var.B()) {
                            a00Var.S();
                            vl1Var3 = vl1Var;
                            j10 = j4;
                            i24 = i2;
                            i25 = i3;
                            pw2Var3 = pw2Var;
                            ut2Var4 = ut2Var2;
                            j9 = j5;
                            i23 = i;
                            z4 = z;
                            jq0Var3 = jq0Var2;
                            j11 = j6;
                            j12 = j3;
                        } else {
                            a00Var.U();
                            if ((i4 & 1) != 0 || a00Var.z()) {
                                vl1Var2 = i26 != 0 ? sl1.a : vl1Var;
                                if (i8 != 0) {
                                    j5 = aw.g;
                                }
                                if (i9 != 0) {
                                    j6 = sw2.c;
                                }
                                if (i10 != 0) {
                                    jq0Var2 = null;
                                }
                                j7 = sw2.c;
                                ut2Var3 = i12 == 0 ? ut2Var2 : null;
                                int i32 = i13 != 0 ? 1 : i;
                                boolean z5 = i14 != 0 ? true : z;
                                int i33 = i16 != 0 ? Integer.MAX_VALUE : i2;
                                if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
                                    i18 &= -3670017;
                                    i20 = i32;
                                    pw2Var2 = (pw2) a00Var.j(a);
                                    i19 = 1;
                                } else {
                                    pw2Var2 = pw2Var;
                                    i19 = 1;
                                    i20 = i32;
                                }
                                i21 = i33;
                                z2 = z5;
                                j8 = j7;
                            } else {
                                a00Var.S();
                                if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
                                    i18 &= -3670017;
                                }
                                vl1Var2 = vl1Var;
                                j7 = j3;
                                j8 = j4;
                                i20 = i;
                                z2 = z;
                                i19 = i3;
                                pw2Var2 = pw2Var;
                                ut2Var3 = ut2Var2;
                                i21 = i2;
                            }
                            a00Var.r();
                            vl1 vl1Var4 = vl1Var2;
                            a00Var.X(-1827892941);
                            if (j5 != 16) {
                                i22 = i20;
                                b = j5;
                                z3 = false;
                            } else {
                                a00Var.X(-1827892168);
                                b = pw2Var2.b();
                                if (b != 16) {
                                    i22 = i20;
                                } else {
                                    i22 = i20;
                                    b = ((aw) a00Var.j(e20.a)).a;
                                }
                                z3 = false;
                                a00Var.q(false);
                            }
                            a00Var.q(z3);
                            pw2 pw2Var4 = pw2Var2;
                            int i34 = i18 << 9;
                            int i35 = i22;
                            ll3.a(str, vl1Var4, pw2.e(pw2Var4, b, j6, jq0Var2, j7, ut2Var3 != null ? ut2Var3.a : Integer.MIN_VALUE, j8, 16609104), i35, z2, i21, i19, a00Var, (i11 & 126) | 3072 | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016) | 12582912, 256);
                            z4 = z2;
                            j9 = j5;
                            i23 = i35;
                            pw2Var3 = pw2Var4;
                            i24 = i21;
                            i25 = i19;
                            vl1Var3 = vl1Var4;
                            jq0Var3 = jq0Var2;
                            j10 = j8;
                            ut2Var4 = ut2Var3;
                            j11 = j6;
                            j12 = j7;
                        }
                        s = a00Var.s();
                        if (s != null) {
                            s.d = new xv2(str, vl1Var3, j9, j11, jq0Var3, j12, ut2Var4, j10, i23, z4, i24, i25, pw2Var3, i4, i5, i6);
                            return;
                        }
                        return;
                    }
                    ut2Var2 = ut2Var;
                    int i282 = i5 | 6;
                    i13 = i6 & 2048;
                    if (i13 != 0) {
                    }
                    int i292 = i282;
                    i14 = i6 & 4096;
                    if (i14 != 0) {
                    }
                    i16 = i6 & Utility.DEFAULT_STREAM_BUFFER_SIZE;
                    if (i16 != 0) {
                    }
                    i18 = i17 | 221184 | (((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == 0 || !a00Var.f(pw2Var)) ? 524288 : 1048576);
                    if ((i11 & 306783379) != 306783378) {
                    }
                    a00Var.U();
                    if ((i4 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    j7 = sw2.c;
                    if (i12 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
                    }
                    i21 = i33;
                    z2 = z5;
                    j8 = j7;
                    a00Var.r();
                    vl1 vl1Var42 = vl1Var2;
                    a00Var.X(-1827892941);
                    if (j5 != 16) {
                    }
                    a00Var.q(z3);
                    pw2 pw2Var42 = pw2Var2;
                    int i342 = i18 << 9;
                    int i352 = i22;
                    ll3.a(str, vl1Var42, pw2.e(pw2Var42, b, j6, jq0Var2, j7, ut2Var3 != null ? ut2Var3.a : Integer.MIN_VALUE, j8, 16609104), i352, z2, i21, i19, a00Var, (i11 & 126) | 3072 | (i342 & 57344) | (i342 & 458752) | (i342 & 3670016) | 12582912, 256);
                    z4 = z2;
                    j9 = j5;
                    i23 = i352;
                    pw2Var3 = pw2Var42;
                    i24 = i21;
                    i25 = i19;
                    vl1Var3 = vl1Var42;
                    jq0Var3 = jq0Var2;
                    j10 = j8;
                    ut2Var4 = ut2Var3;
                    j11 = j6;
                    j12 = j7;
                    s = a00Var.s();
                    if (s != null) {
                    }
                }
                jq0Var2 = jq0Var;
                i11 = i27 | 114819072;
                i12 = i6 & 512;
                if (i12 == 0) {
                }
                ut2Var2 = ut2Var;
                int i2822 = i5 | 6;
                i13 = i6 & 2048;
                if (i13 != 0) {
                }
                int i2922 = i2822;
                i14 = i6 & 4096;
                if (i14 != 0) {
                }
                i16 = i6 & Utility.DEFAULT_STREAM_BUFFER_SIZE;
                if (i16 != 0) {
                }
                i18 = i17 | 221184 | (((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == 0 || !a00Var.f(pw2Var)) ? 524288 : 1048576);
                if ((i11 & 306783379) != 306783378) {
                }
                a00Var.U();
                if ((i4 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                j7 = sw2.c;
                if (i12 == 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
                }
                i21 = i33;
                z2 = z5;
                j8 = j7;
                a00Var.r();
                vl1 vl1Var422 = vl1Var2;
                a00Var.X(-1827892941);
                if (j5 != 16) {
                }
                a00Var.q(z3);
                pw2 pw2Var422 = pw2Var2;
                int i3422 = i18 << 9;
                int i3522 = i22;
                ll3.a(str, vl1Var422, pw2.e(pw2Var422, b, j6, jq0Var2, j7, ut2Var3 != null ? ut2Var3.a : Integer.MIN_VALUE, j8, 16609104), i3522, z2, i21, i19, a00Var, (i11 & 126) | 3072 | (i3422 & 57344) | (i3422 & 458752) | (i3422 & 3670016) | 12582912, 256);
                z4 = z2;
                j9 = j5;
                i23 = i3522;
                pw2Var3 = pw2Var422;
                i24 = i21;
                i25 = i19;
                vl1Var3 = vl1Var422;
                jq0Var3 = jq0Var2;
                j10 = j8;
                ut2Var4 = ut2Var3;
                j11 = j6;
                j12 = j7;
                s = a00Var.s();
                if (s != null) {
                }
            }
            j5 = j;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            int i272 = i7 | 24576;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            jq0Var2 = jq0Var;
            i11 = i272 | 114819072;
            i12 = i6 & 512;
            if (i12 == 0) {
            }
            ut2Var2 = ut2Var;
            int i28222 = i5 | 6;
            i13 = i6 & 2048;
            if (i13 != 0) {
            }
            int i29222 = i28222;
            i14 = i6 & 4096;
            if (i14 != 0) {
            }
            i16 = i6 & Utility.DEFAULT_STREAM_BUFFER_SIZE;
            if (i16 != 0) {
            }
            i18 = i17 | 221184 | (((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == 0 || !a00Var.f(pw2Var)) ? 524288 : 1048576);
            if ((i11 & 306783379) != 306783378) {
            }
            a00Var.U();
            if ((i4 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            j7 = sw2.c;
            if (i12 == 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
            }
            i21 = i33;
            z2 = z5;
            j8 = j7;
            a00Var.r();
            vl1 vl1Var4222 = vl1Var2;
            a00Var.X(-1827892941);
            if (j5 != 16) {
            }
            a00Var.q(z3);
            pw2 pw2Var4222 = pw2Var2;
            int i34222 = i18 << 9;
            int i35222 = i22;
            ll3.a(str, vl1Var4222, pw2.e(pw2Var4222, b, j6, jq0Var2, j7, ut2Var3 != null ? ut2Var3.a : Integer.MIN_VALUE, j8, 16609104), i35222, z2, i21, i19, a00Var, (i11 & 126) | 3072 | (i34222 & 57344) | (i34222 & 458752) | (i34222 & 3670016) | 12582912, 256);
            z4 = z2;
            j9 = j5;
            i23 = i35222;
            pw2Var3 = pw2Var4222;
            i24 = i21;
            i25 = i19;
            vl1Var3 = vl1Var4222;
            jq0Var3 = jq0Var2;
            j10 = j8;
            ut2Var4 = ut2Var3;
            j11 = j6;
            j12 = j7;
            s = a00Var.s();
            if (s != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        j5 = j;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        int i2722 = i7 | 24576;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        jq0Var2 = jq0Var;
        i11 = i2722 | 114819072;
        i12 = i6 & 512;
        if (i12 == 0) {
        }
        ut2Var2 = ut2Var;
        int i282222 = i5 | 6;
        i13 = i6 & 2048;
        if (i13 != 0) {
        }
        int i292222 = i282222;
        i14 = i6 & 4096;
        if (i14 != 0) {
        }
        i16 = i6 & Utility.DEFAULT_STREAM_BUFFER_SIZE;
        if (i16 != 0) {
        }
        i18 = i17 | 221184 | (((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) == 0 || !a00Var.f(pw2Var)) ? 524288 : 1048576);
        if ((i11 & 306783379) != 306783378) {
        }
        a00Var.U();
        if ((i4 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        j7 = sw2.c;
        if (i12 == 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        if ((i6 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0) {
        }
        i21 = i33;
        z2 = z5;
        j8 = j7;
        a00Var.r();
        vl1 vl1Var42222 = vl1Var2;
        a00Var.X(-1827892941);
        if (j5 != 16) {
        }
        a00Var.q(z3);
        pw2 pw2Var42222 = pw2Var2;
        int i342222 = i18 << 9;
        int i352222 = i22;
        ll3.a(str, vl1Var42222, pw2.e(pw2Var42222, b, j6, jq0Var2, j7, ut2Var3 != null ? ut2Var3.a : Integer.MIN_VALUE, j8, 16609104), i352222, z2, i21, i19, a00Var, (i11 & 126) | 3072 | (i342222 & 57344) | (i342222 & 458752) | (i342222 & 3670016) | 12582912, 256);
        z4 = z2;
        j9 = j5;
        i23 = i352222;
        pw2Var3 = pw2Var42222;
        i24 = i21;
        i25 = i19;
        vl1Var3 = vl1Var42222;
        jq0Var3 = jq0Var2;
        j10 = j8;
        ut2Var4 = ut2Var3;
        j11 = j6;
        j12 = j7;
        s = a00Var.s();
        if (s != null) {
        }
    }
}
