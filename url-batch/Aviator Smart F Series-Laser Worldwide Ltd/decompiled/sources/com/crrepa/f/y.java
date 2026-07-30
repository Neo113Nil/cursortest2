package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPElectronicCardInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12802a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12803b = 18;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f12804c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f12805d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f12806e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12807f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12808g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f12809h = 4;

    private y() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{18, 0, 2, 0});
    }

    public static byte[] b(int i8) {
        return g.a(-71, new byte[]{18, 0, 3, (byte) i8});
    }

    public static byte[] a(int i8) {
        return g.a(-71, new byte[]{2, 0, 1, (byte) i8});
    }

    public static byte[] a(CRPElectronicCardInfo cRPElectronicCardInfo) {
        String title = cRPElectronicCardInfo.getTitle();
        String url = cRPElectronicCardInfo.getUrl();
        if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(url)) {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = title.getBytes(charset);
            byte[] bytes2 = url.getBytes(charset);
            if (255 >= bytes.length && 255 >= bytes2.length) {
                byte[] bArr = new byte[bytes.length + 6 + bytes2.length];
                bArr[0] = 2;
                bArr[1] = 0;
                bArr[2] = 0;
                bArr[3] = (byte) cRPElectronicCardInfo.getId();
                bArr[4] = (byte) bytes.length;
                System.arraycopy(bytes, 0, bArr, 5, bytes.length);
                bArr[bytes.length + 5] = (byte) bytes2.length;
                System.arraycopy(bytes2, 0, bArr, bytes.length + 6, bytes2.length);
                return g.a(-71, bArr);
            }
        }
        return null;
    }

    public static byte[] a(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[list.size() + 3];
        bArr[0] = 2;
        bArr[1] = 0;
        bArr[2] = 4;
        int size = list.size();
        byte[] bArr2 = new byte[size];
        for (int i8 = 0; i8 < list.size(); i8++) {
            bArr2[i8] = list.get(i8).byteValue();
        }
        System.arraycopy(bArr2, 0, bArr, 3, size);
        return g.a(-71, bArr);
    }
}
