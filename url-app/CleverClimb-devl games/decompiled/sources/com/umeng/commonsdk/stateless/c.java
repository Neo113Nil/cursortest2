package com.umeng.commonsdk.stateless;

import android.content.Context;
import com.umeng.commonsdk.proguard.r;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: UMSLEnvelopeManager.java */
/* loaded from: classes2.dex */
public class c {
    private String e;
    private int j;
    private int k;
    private byte[] l;
    private byte[] m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9108a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private final int f9109b = 1;

    /* renamed from: c, reason: collision with root package name */
    private final int f9110c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f9111d = "1.0";
    private byte[] f = null;
    private byte[] g = null;
    private byte[] h = null;
    private int i = 0;
    private boolean n = false;

    private c(byte[] bArr, String str, byte[] bArr2) throws Exception {
        this.e = null;
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = null;
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.e = str;
        this.k = bArr.length;
        this.l = f.a(bArr);
        this.j = (int) (System.currentTimeMillis() / 1000);
        this.m = bArr2;
    }

    public static c a(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("[stateless] build envelope, raw is  ");
            sb.append(bArr == null);
            sb.append("m app key is ");
            sb.append(str);
            sb.append("device id is ");
            sb.append(deviceId);
            sb.append(", mac is ");
            sb.append(mac);
            objArr[0] = sb.toString();
            com.umeng.commonsdk.statistics.common.d.a("walle", objArr);
            c cVar = new c(bArr, str, (deviceId + mac).getBytes());
            cVar.a();
            return cVar;
        } catch (Exception e) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, e is " + e.getMessage());
            com.umeng.commonsdk.proguard.b.a(context, e);
            return null;
        }
    }

    public static c b(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            c cVar = new c(bArr, str, (DeviceConfig.getDeviceId(context) + mac).getBytes());
            cVar.a(true);
            cVar.a();
            return cVar;
        } catch (Exception e) {
            com.umeng.commonsdk.proguard.b.a(context, e);
            return null;
        }
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a() {
        if (this.f == null) {
            this.f = c();
        }
        if (this.n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f, 1, bArr, 0, 16);
                this.l = f.a(this.l, bArr);
            } catch (Exception unused) {
            }
        }
        this.g = a(this.f, this.j);
        this.h = d();
    }

    private byte[] a(byte[] bArr, int i) {
        byte[] b2 = f.b(this.m);
        byte[] b3 = f.b(this.l);
        int length = b2.length;
        byte[] bArr2 = new byte[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr2[i3] = b3[i2];
            bArr2[i3 + 1] = b2[i2];
        }
        for (int i4 = 0; i4 < 2; i4++) {
            bArr2[i4] = bArr[i4];
            bArr2[(bArr2.length - i4) - 1] = bArr[(bArr.length - i4) - 1];
        }
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) (i >>> 24)};
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            bArr2[i5] = (byte) (bArr2[i5] ^ bArr3[i5 % 4]);
        }
        return bArr2;
    }

    private byte[] c() {
        return a(this.f9108a, (int) (System.currentTimeMillis() / 1000));
    }

    private byte[] d() {
        return f.b((f.c(this.f) + this.i + this.j + this.k + f.c(this.g)).getBytes());
    }

    public byte[] b() {
        b bVar = new b();
        bVar.a(this.f9111d);
        bVar.b(this.e);
        bVar.c(f.c(this.f));
        bVar.a(this.i);
        bVar.b(this.j);
        bVar.c(this.k);
        bVar.a(this.l);
        bVar.d(this.n ? 1 : 0);
        bVar.d(f.c(this.g));
        bVar.e(f.c(this.h));
        try {
            return new r().a(bVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
