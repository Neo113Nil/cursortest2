package com.realsil.sdk.dfu.t;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f16312a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16313b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public List f16314a = new ArrayList();

        public b a(List list) {
            this.f16314a = list;
            return this;
        }

        public c a() {
            int size = this.f16314a.size();
            byte[] bArr = new byte[size * 34];
            int i8 = 0;
            for (C0331c c0331c : this.f16314a) {
                ZLogger.v(c0331c.toString());
                byte[] bArr2 = c0331c.f16317c;
                if (bArr2 != null && bArr2.length >= 34) {
                    System.arraycopy(bArr2, 0, bArr, i8, 34);
                }
                i8 += 34;
            }
            return new c(size, bArr);
        }
    }

    /* renamed from: com.realsil.sdk.dfu.t.c$c, reason: collision with other inner class name */
    public static class C0331c {

        /* renamed from: a, reason: collision with root package name */
        public int f16315a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f16316b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f16317c;

        public C0331c(int i8, byte[] bArr) {
            this.f16315a = i8;
            this.f16316b = bArr;
            byte[] bArr2 = new byte[34];
            this.f16317c = bArr2;
            bArr2[0] = (byte) (i8 & 255);
            bArr2[1] = (byte) ((i8 >> 8) & 255);
            if (bArr.length >= 32) {
                System.arraycopy(bArr, 0, bArr2, 2, 32);
            }
        }

        public String toString() {
            return String.format("imageId=0x%04X, sha256=%s", Integer.valueOf(this.f16315a), DataConverter.bytes2Hex(this.f16316b));
        }
    }

    public c(int i8, byte[] bArr) {
        this.f16312a = i8;
        this.f16313b = bArr;
    }

    public byte[] a() {
        byte[] bArr = this.f16313b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        int i8 = this.f16312a;
        bArr2[0] = (byte) (i8 & 255);
        bArr2[1] = (byte) (i8 >> 8);
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        return bArr2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "\n\tnumber=%d", Integer.valueOf(this.f16312a)));
        byte[] bArr = this.f16313b;
        if (bArr != null) {
            sb.append(String.format(locale, "\n\tsha256=(%d)%s", Integer.valueOf(bArr.length), DataConverter.bytes2Hex(this.f16313b)));
        }
        return sb.toString();
    }
}
