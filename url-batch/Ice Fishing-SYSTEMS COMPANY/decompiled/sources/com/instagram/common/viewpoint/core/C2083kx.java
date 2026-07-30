package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2083kx implements LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C2083kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C2083kx(int i, int i4, boolean z8, boolean z9, boolean z10) {
        this.A01 = i;
        this.A00 = i4;
        this.A05 = z8;
        this.A03 = z9;
        this.A04 = z10;
    }

    public static LT<Bitmap> A00(Throwable th) {
        return new LT<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC1059Ln.A07(byteArrayOutputStream);
            AbstractC1059Ln.A07(fileOutputStream);
            AbstractC1059Ln.A07(fileInputStream);
            AbstractC1059Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.LU
    public final LT<Bitmap> A3x(File file, InterfaceC1058Lm interfaceC1058Lm) {
        if (!this.A04) {
            return new LT<>(true, null);
        }
        try {
            Bitmap A03 = AbstractC1059Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new LT<>(true, A03);
            }
            interfaceC1058Lm.AB4(new C2074kn(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t9) {
            file.delete();
            interfaceC1058Lm.AB4(t9);
            return A00(t9);
        }
    }

    @Override // com.instagram.common.viewpoint.core.LU
    public final void A5D(File file, InterfaceC1058Lm interfaceC1058Lm) throws C2074kn {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC1059Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C2074kn(A01(4, 14, 118));
                }
            } catch (C2074kn e6) {
                interfaceC1058Lm.ABI(e6);
                throw e6;
            } catch (Throwable th) {
                interfaceC1058Lm.ABI(th);
                Throwable t9 = new C2074kn(A01(18, 33, 57), th);
                throw t9;
            }
        }
    }
}
