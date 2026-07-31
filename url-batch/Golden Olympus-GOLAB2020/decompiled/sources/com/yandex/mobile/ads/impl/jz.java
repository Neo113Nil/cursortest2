package com.yandex.mobile.ads.impl;

import com.google.firebase.FirebaseError;
import com.yandex.mobile.ads.impl.tt0;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class jz implements p40 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27899a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f27900b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final f92 f27901c = new f92();

    /* renamed from: d, reason: collision with root package name */
    private o40 f27902d;

    /* renamed from: e, reason: collision with root package name */
    private int f27903e;

    /* renamed from: f, reason: collision with root package name */
    private int f27904f;

    /* renamed from: g, reason: collision with root package name */
    private long f27905g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f27906a;

        /* renamed from: b, reason: collision with root package name */
        private final long f27907b;

        private a(int i4, long j4) {
            this.f27906a = i4;
            this.f27907b = j4;
        }
    }

    public final void a(o40 o40Var) {
        this.f27902d = o40Var;
    }

    public final boolean a(lz lzVar) {
        int i4;
        String str;
        int a4;
        int a5;
        if (this.f27902d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            a peek = this.f27900b.peek();
            if (peek != null && lzVar.a() >= peek.f27907b) {
                tt0.this.b(this.f27900b.pop().f27906a);
                return true;
            }
            if (this.f27903e == 0) {
                long a6 = this.f27901c.a(lzVar, true, false, 4);
                if (a6 == -2) {
                    lzVar.c();
                    while (true) {
                        lzVar.b(this.f27899a, 0, 4, false);
                        a4 = f92.a(this.f27899a[0]);
                        if (a4 != -1 && a4 <= 4) {
                            a5 = (int) f92.a(this.f27899a, a4, false);
                            tt0.this.getClass();
                            if (a5 == 357149030 || a5 == 524531317 || a5 == 475249515 || a5 == 374648427) {
                            }
                        }
                        lzVar.a(1);
                    }
                    lzVar.a(a4);
                    a6 = a5;
                }
                if (a6 == -1) {
                    return false;
                }
                this.f27904f = (int) a6;
                this.f27903e = 1;
            }
            if (this.f27903e == 1) {
                this.f27905g = this.f27901c.a(lzVar, false, true, 8);
                this.f27903e = 2;
            }
            o40 o40Var = this.f27902d;
            int i5 = this.f27904f;
            tt0.this.getClass();
            switch (i5) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i4 = 2;
                    break;
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    i4 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i4 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i4 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i4 = 5;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != 0) {
                if (i4 == 1) {
                    long a7 = lzVar.a();
                    this.f27900b.push(new a(this.f27904f, this.f27905g + a7));
                    ((tt0.a) this.f27902d).a(this.f27904f, a7, this.f27905g);
                    this.f27903e = 0;
                    return true;
                }
                long j4 = 0;
                if (i4 == 2) {
                    long j5 = this.f27905g;
                    if (j5 > 8) {
                        throw wf1.a("Invalid integer size: " + this.f27905g, (Exception) null);
                    }
                    o40 o40Var2 = this.f27902d;
                    int i6 = this.f27904f;
                    int i7 = (int) j5;
                    lzVar.a(this.f27899a, 0, i7, false);
                    for (int i8 = 0; i8 < i7; i8++) {
                        j4 = (j4 << 8) | (this.f27899a[i8] & 255);
                    }
                    ((tt0.a) o40Var2).a(i6, j4);
                    this.f27903e = 0;
                    return true;
                }
                if (i4 == 3) {
                    long j6 = this.f27905g;
                    if (j6 > 2147483647L) {
                        throw wf1.a("String element size: " + this.f27905g, (Exception) null);
                    }
                    o40 o40Var3 = this.f27902d;
                    int i9 = this.f27904f;
                    int i10 = (int) j6;
                    if (i10 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i10];
                        lzVar.a(bArr, 0, i10, false);
                        while (i10 > 0 && bArr[i10 - 1] == 0) {
                            i10--;
                        }
                        str = new String(bArr, 0, i10);
                    }
                    ((tt0.a) o40Var3).a(i9, str);
                    this.f27903e = 0;
                    return true;
                }
                if (i4 == 4) {
                    ((tt0.a) this.f27902d).a(this.f27904f, (int) this.f27905g, lzVar);
                    this.f27903e = 0;
                    return true;
                }
                if (i4 != 5) {
                    throw wf1.a("Invalid element type " + i4, (Exception) null);
                }
                long j7 = this.f27905g;
                if (j7 != 4 && j7 != 8) {
                    throw wf1.a("Invalid float size: " + this.f27905g, (Exception) null);
                }
                o40 o40Var4 = this.f27902d;
                int i11 = this.f27904f;
                int i12 = (int) j7;
                lzVar.a(this.f27899a, 0, i12, false);
                for (int i13 = 0; i13 < i12; i13++) {
                    j4 = (this.f27899a[i13] & 255) | (j4 << 8);
                }
                ((tt0.a) o40Var4).a(i11, i12 == 4 ? Float.intBitsToFloat((int) j4) : Double.longBitsToDouble(j4));
                this.f27903e = 0;
                return true;
            }
            lzVar.a((int) this.f27905g);
            this.f27903e = 0;
        }
    }

    public final void a() {
        this.f27903e = 0;
        this.f27900b.clear();
        this.f27901c.b();
    }
}
