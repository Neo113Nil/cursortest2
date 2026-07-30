package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3826r2 implements F2, ZG {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f33933w = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f33934x = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, com.anythink.core.common.s.a.c.f16474a, -69, 0, 0, 0, 0, 0};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f33935y = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: n, reason: collision with root package name */
    public int f33936n;

    /* renamed from: u, reason: collision with root package name */
    public int f33937u;

    /* renamed from: v, reason: collision with root package name */
    public Object f33938v;

    public C3826r2(int i) {
        switch (i) {
            case 5:
                this.f33938v = new C4164xG(4);
                this.f33936n = 8000;
                this.f33937u = 8000;
                break;
            default:
                this.f33938v = new byte[8];
                break;
        }
    }

    public static final void f(ByteBuffer byteBuffer, long j9, int i, int i4, boolean z8) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z8 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j9);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(XC.a(i4));
    }

    public static long g(int i, boolean z8, byte[] bArr) {
        long j9 = bArr[0] & 255;
        if (z8) {
            j9 &= ~f33933w[i - 1];
        }
        for (int i4 = 1; i4 < i; i4++) {
            j9 = (j9 << 8) | (bArr[i4] & 255);
        }
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int a() {
        return this.f33937u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        if (r3.size() < r12) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b(ArrayList arrayList, ArrayList arrayList2) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        Collections.sort(arrayList2, new C2959b(16));
        HashSet hashSet = new HashSet();
        int i = 0;
        loop0: while (i < arrayList2.size()) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((A8) arrayList2.get(i)).f23837e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                int i4 = 0;
                while (i4 < split.length) {
                    String str = split[i4];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        ?? r12 = z11;
                        boolean z12 = false;
                        while (true) {
                            int i9 = (r12 == true ? 1 : 0) + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(r12 == true ? 1 : 0) == '\'') {
                                if (sb.charAt((r12 == true ? 1 : 0) - 1) != ' ') {
                                    int i10 = (r12 == true ? 1 : 0) + 1;
                                    z10 = z11;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(r12 == true ? 1 : 0, ' ');
                                        r12 = i9;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z11;
                                }
                                sb.setCharAt(r12 == true ? 1 : 0, ' ');
                                r12 = r12;
                                z12 = z10;
                            } else {
                                z10 = z11;
                            }
                            z11 = z10;
                            r12++;
                        }
                        z8 = z11;
                        String sb2 = z12 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    } else {
                        z8 = z11;
                    }
                    String[] B8 = AbstractC3217fl.B(str, z8);
                    int length = B8.length;
                    int i11 = this.f33937u;
                    if (length >= i11) {
                        int i12 = 0;
                        while (true) {
                            int length2 = B8.length;
                            int i13 = this.f33936n;
                            if (i12 >= length2) {
                                break;
                            }
                            String str2 = "";
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = i12 + i14;
                                if (i15 >= B8.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(B8[i15]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= i13) {
                                break loop0;
                            }
                            i12++;
                        }
                    } else {
                        z9 = true;
                    }
                    i4++;
                    z11 = z9;
                }
            }
            i++;
            z11 = z11;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((E8) this.f33938v).v1((String) it.next()));
            } catch (IOException e6) {
                int i16 = t2.C.f40822b;
                u2.i.d("Error while writing hash to byteStream", e6);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e9) {
            int i17 = t2.C.f40822b;
            u2.i.d("HashManager: Unable to convert to Base64.", e9);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e10) {
            int i18 = t2.C.f40822b;
            u2.i.d("HashManager: Unable to convert to Base64.", e10);
            return "";
        }
    }

    public void c(IN in, List list) {
        int i;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = in.f25552e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - in.f25552e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f33936n == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = in.f25552e;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i4 = limit - position;
        int i9 = this.f33936n;
        int i10 = (i4 + com.anythink.basead.exoplayer.k.p.f8630b) / com.anythink.basead.exoplayer.k.p.f8630b;
        int i11 = i10 + 27 + i4;
        if (i9 == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i11 += i + 44;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.f33938v).capacity() < i11) {
            this.f33938v = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f33938v).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f33938v;
        if (this.f33936n == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                f(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(XC.a(length));
                byteBuffer.put(bArr);
                int i12 = length + 28;
                byteBuffer.putInt(22, AbstractC3548lu.h(byteBuffer.arrayOffset(), i12, 0, byteBuffer.array()));
                byteBuffer.position(i12);
            } else {
                byteBuffer = byteBuffer4;
                byteBuffer.put(f33934x);
            }
            byteBuffer.put(f33935y);
        } else {
            byteBuffer = byteBuffer4;
        }
        int E8 = this.f33937u + ((int) ((AbstractC3035cL.E(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f33937u = E8;
        ByteBuffer byteBuffer5 = byteBuffer;
        f(byteBuffer5, E8, this.f33936n, i10, false);
        for (int i13 = 0; i13 < i10; i13++) {
            if (i4 >= 255) {
                byteBuffer5.put((byte) -1);
                i4 -= 255;
            } else {
                byteBuffer5.put((byte) i4);
                i4 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f33936n == 2) {
            byteBuffer5.putInt(i + 66, AbstractC3548lu.h(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(22, AbstractC3548lu.h(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f33936n++;
        this.f33938v = byteBuffer5;
        in.i();
        in.j(((ByteBuffer) this.f33938v).remaining());
        in.f25552e.put((ByteBuffer) this.f33938v);
        in.l();
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int d() {
        return this.f33936n;
    }

    public long e(J0 j02, boolean z8, boolean z9, int i) {
        int i4;
        int i9 = this.f33936n;
        byte[] bArr = (byte[]) this.f33938v;
        if (i9 == 0) {
            if (!j02.E(bArr, 0, 1, z8)) {
                return -1L;
            }
            int i10 = bArr[0] & 255;
            int i11 = 0;
            while (true) {
                if (i11 >= 8) {
                    i4 = -1;
                    break;
                }
                i4 = i11 + 1;
                if ((f33933w[i11] & i10) != 0) {
                    break;
                }
                i11 = i4;
            }
            this.f33937u = i4;
            if (i4 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f33936n = 1;
        }
        int i12 = this.f33937u;
        if (i12 > i) {
            this.f33936n = 0;
            return -2L;
        }
        if (i12 != 1) {
            j02.E(bArr, 1, i12 - 1, false);
        }
        this.f33936n = 0;
        return g(this.f33937u, z9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public int i() {
        int i = this.f33936n;
        return i == -1 ? ((Lr) this.f33938v).h() : i;
    }

    @Override // com.google.android.gms.internal.ads.ZG
    /* renamed from: a, reason: collision with other method in class */
    public InterfaceC3572mH mo9a() {
        return new AK(null, this.f33936n, this.f33937u, false, (C4164xG) this.f33938v);
    }
}
