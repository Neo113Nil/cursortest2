package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Zy {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f29125a;

    /* renamed from: b, reason: collision with root package name */
    public final C4158xA f29126b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f29127c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f29128d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f29129e;

    public Zy(C4158xA c4158xA) {
        this.f29126b = c4158xA;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.wA) VIRTUAL call: com.google.android.gms.internal.ads.wA.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:27:0x0039 */
    public final void a() {
        boolean z8;
        C4104wA c4;
        synchronized (this) {
            z8 = this.f29128d;
        }
        if (z8) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                C4104wA a9 = this.f29126b.a(202);
                try {
                    a9.a();
                    this.f29129e = secureRandom;
                    this.f29125a = MessageDigest.getInstance("MD5");
                    this.f29128d = true;
                } catch (NoSuchAlgorithmException e6) {
                    a9.b(e6);
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
                a9.c();
            } catch (Throwable th2) {
                c4.c();
                throw th2;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z8) {
        int length = bArr.length;
        int i = true != z8 ? 255 : 239;
        PA.n(length <= i);
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i4 = i - length;
            byte[] bArr2 = new byte[i4];
            this.f29129e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i4);
            System.arraycopy(bArr2, 0, bArr, length, i4);
        }
        byte[] array = put.put(bArr).array();
        if (z8) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC2958az[] interfaceC2958azArr = (InterfaceC2958az[]) new C3076d7(1).f29838K2;
        int length2 = interfaceC2958azArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            interfaceC2958azArr[i9].a(array, bArr3);
        }
        if (!AbstractC3217fl.q(str)) {
            C3104dh c3104dh = new C3104dh(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), 1);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                i10 = (i10 + 1) & com.anythink.basead.exoplayer.k.p.f8630b;
                byte[] bArr4 = c3104dh.f30075n;
                byte b9 = bArr4[i10];
                i11 = (i11 + b9) & com.anythink.basead.exoplayer.k.p.f8630b;
                bArr4[i10] = bArr4[i11];
                bArr4[i11] = b9;
                bArr3[i12] = (byte) (bArr4[(bArr4[i10] + b9) & com.anythink.basead.exoplayer.k.p.f8630b] ^ bArr3[i12]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] digest;
        synchronized (this.f29127c) {
            this.f29125a.reset();
            this.f29125a.update(bArr);
            digest = this.f29125a.digest();
        }
        return digest;
    }

    public final O6 d(String str, byte[] bArr) {
        O6 A8 = P6.A();
        byte[] c4 = c(bArr);
        QK qk = SK.f27529u;
        QK s3 = SK.s(c4, 0, c4.length);
        A8.h();
        ((P6) A8.f30000u).C(s3);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / com.anythink.basead.exoplayer.k.p.f8630b) + 1) {
                break;
            }
            int i4 = i * com.anythink.basead.exoplayer.k.p.f8630b;
            int i9 = i4 + com.anythink.basead.exoplayer.k.p.f8630b;
            if (length > i9) {
                length = i9;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i4, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QK s6 = SK.s(b((byte[]) it.next(), str, false), 0, 256);
            A8.h();
            ((P6) A8.f30000u).B(s6);
        }
        return A8;
    }
}
