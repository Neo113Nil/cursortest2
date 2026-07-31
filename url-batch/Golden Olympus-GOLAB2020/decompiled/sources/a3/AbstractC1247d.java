package a3;

import java.io.ByteArrayOutputStream;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1247d {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1245b f9771a = new e();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f9771a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e4) {
            throw new C1244a("exception decoding Hex string: " + e4.getMessage(), e4);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i4, int i5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f9771a.b(bArr, i4, i5, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e4) {
            throw new C1246c("exception encoding Hex string: " + e4.getMessage(), e4);
        }
    }
}
