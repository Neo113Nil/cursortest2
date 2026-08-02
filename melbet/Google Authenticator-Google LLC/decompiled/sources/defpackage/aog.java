package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aog extends aoh {
    public volatile aoi a;
    public volatile aoi b;
    private final qm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aog(aoj aojVar) {
        super(aojVar);
        aob.a();
        int i = qn.a;
        this.d = new qm(6);
        long[] jArr = qw.a;
        new qv(6);
        boolean z = aojVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r6 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r0 = r3.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r3.f != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (((r3.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        r0 = r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        r21 = 128;
        r25 = 255;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (java.lang.Long.compare((r3.e * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r32 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01f9, code lost:
    
        r29 = r14;
        r15 = 7;
        r14 = r4;
        r0 = defpackage.qw.b(r3.d);
        r1 = r3.a;
        r2 = r3.b;
        r4 = r3.c;
        r5 = r3.d;
        r3.d(r0);
        r0 = r3.a;
        r6 = r3.b;
        r8 = r3.c;
        r9 = r3.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0218, code lost:
    
        if (r10 >= r5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0227, code lost:
    
        if (((r1[r10 >> 3] >> ((r10 & 7) << 3)) & r25) >= r21) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0229, code lost:
    
        r11 = r2[r10];
        r13 = defpackage.ow.m(r11) * r38;
        r16 = r15;
        r15 = r3.b((r13 ^ (r13 << 16)) >>> 7);
        r17 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r27 = r0;
        r19 = r1;
        r0 = (r0[r17] & (~(r25 << r18))) | ((r13 & 127) << r18);
        r27[r17] = r0;
        r27[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r0;
        r6[r15] = r11;
        r8[r15] = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0271, code lost:
    
        r10 = r10 + 1;
        r15 = r16;
        r1 = r19;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x026b, code lost:
    
        r27 = r0;
        r19 = r1;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x027a, code lost:
    
        r0 = r3.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x028c, code lost:
    
        r3.e++;
        r1 = r3.f;
        r2 = r3.a;
        r4 = r0 >> 3;
        r5 = r2[r4];
        r7 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02a4, code lost:
    
        if (((r5 >> r7) & r25) != r21) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02a6, code lost:
    
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02ab, code lost:
    
        r3.f = r1 - r9;
        r1 = r3.d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r2[r4] = r5;
        r2[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r0 = ~r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02a9, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        r0 = r3.a;
        r8 = r3.d;
        r9 = r3.b;
        r10 = r3.c;
        r11 = (r8 + 7) >> 3;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        if (r12 >= r11) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r32 = r5;
        r5 = r0[r12] & (-9187201950435737472L);
        r0[r12] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r12 = r12 + 1;
        r14 = r14;
        r6 = r6;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        r32 = r5;
        r29 = r14;
        r15 = 7;
        r5 = defpackage.ixc.H(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r5 == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        r6 = r5 >> 3;
        r16 = (r5 & 7) << 3;
        r11 = (r0[r6] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        if (r11 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        if (r11 == 254) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r11 = defpackage.ow.m(r9[r5]) * r38;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 >>> 7;
        r17 = r3.b(r12);
        r12 = r12 & r8;
        r34 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        if ((((r17 - r12) & r8) / 8) != (((r5 - r12) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        r2 = r0;
        r14 = r4;
        r2[r6] = ((~(255 << r16)) & r0[r6]) | ((r11 & 127) << r16);
        r2[defpackage.ixc.H(r2)] = (r2[0] & r34) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0184, code lost:
    
        r0 = r2;
        r4 = r14;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018b, code lost:
    
        r2 = r0;
        r14 = r4;
        r33 = r5;
        r0 = r17 >> 3;
        r4 = r2[r0];
        r1 = r11 & 127;
        r11 = (r17 & 7) << 3;
        r12 = ~(255 << r11);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a5, code lost:
    
        if (((r4 >> r11) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a7, code lost:
    
        r2[r0] = (r0 << r11) | (r4 & r12);
        r2[r6] = (r2[r6] & (~(255 << r16))) | (128 << r16);
        r9[r17] = r9[r33];
        r9[r33] = 0;
        r10[r17] = r10[r33];
        r10[r33] = null;
        r5 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01de, code lost:
    
        r2[defpackage.ixc.H(r2)] = (r2[0] & r34) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c7, code lost:
    
        r2[r0] = (r0 << r11) | (r4 & r12);
        r0 = r9[r17];
        r9[r17] = r9[r33];
        r9[r33] = r0;
        r0 = r10[r17];
        r10[r17] = r10[r33];
        r10[r33] = r0;
        r5 = r33 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ed, code lost:
    
        r14 = r4;
        r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f3, code lost:
    
        r25 = 255;
        r21 = 128;
        r32 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0281, code lost:
    
        r25 = 255;
        r29 = r14;
        r21 = 128;
        r32 = 1;
        r14 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aoi a(long j) {
        aoi aoiVar;
        aoi aoiVar2;
        int i;
        long j2 = j;
        qm qmVar = this.d;
        synchronized (qmVar) {
            Object a = qmVar.a(j2);
            if (a == null) {
                aoi aoiVar3 = new aoi(j2, this);
                int i2 = -862048943;
                int m = ow.m(j2) * (-862048943);
                int i3 = qmVar.d;
                int i4 = m ^ (m << 16);
                int i5 = i4 >>> 7;
                int i6 = i5 & i3;
                int i7 = 0;
                loop0: while (true) {
                    long[] jArr = qmVar.a;
                    int i8 = i6 >> 3;
                    int i9 = (i6 & 7) << 3;
                    long j3 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                    long j4 = i4 & 127;
                    int i10 = i2;
                    int i11 = i3;
                    long j5 = j3 ^ (72340172838076673L * j4);
                    long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                    while (true) {
                        if (j6 == 0) {
                            break;
                        }
                        int numberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
                        if (qmVar.b[numberOfTrailingZeros] == j2) {
                            aoiVar2 = aoiVar3;
                            i = numberOfTrailingZeros;
                            break loop0;
                        }
                        j6 &= j6 - 1;
                    }
                    i7 += 8;
                    i6 = (i6 + i7) & i11;
                    i2 = i10;
                    j2 = j;
                    i3 = i11;
                }
                if (i < 0) {
                    i = ~i;
                }
                qmVar.b[i] = j;
                qmVar.c[i] = aoiVar2;
                a = aoiVar2;
            }
            aoiVar = (aoi) a;
        }
        return aoiVar;
    }
}
