package com.crrepa.v1;

import android.graphics.Bitmap;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected int f13917a;

    /* renamed from: b, reason: collision with root package name */
    protected int f13918b;

    /* renamed from: d, reason: collision with root package name */
    protected OutputStream f13920d;

    /* renamed from: e, reason: collision with root package name */
    protected byte[] f13921e;

    /* renamed from: f, reason: collision with root package name */
    protected byte[] f13922f;

    /* renamed from: g, reason: collision with root package name */
    protected byte[] f13923g;

    /* renamed from: c, reason: collision with root package name */
    protected int f13919c = 0;

    /* renamed from: h, reason: collision with root package name */
    protected boolean[] f13924h = new boolean[256];

    protected void a() {
        byte[] bArr = this.f13921e;
        int length = bArr.length;
        int i8 = length / 3;
        this.f13922f = new byte[i8];
        c cVar = new c(bArr, length, 10);
        this.f13923g = cVar.d();
        int i9 = 0;
        while (true) {
            byte[] bArr2 = this.f13923g;
            if (i9 >= bArr2.length) {
                break;
            }
            byte b8 = bArr2[i9];
            int i10 = i9 + 2;
            bArr2[i9] = bArr2[i10];
            bArr2[i10] = b8;
            this.f13924h[i9 / 3] = false;
            i9 += 3;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            byte[] bArr3 = this.f13921e;
            int i13 = bArr3[i11] & 255;
            int i14 = i11 + 2;
            int i15 = bArr3[i11 + 1] & 255;
            i11 += 3;
            int b9 = cVar.b(i13, i15, bArr3[i14] & 255);
            this.f13924h[b9] = true;
            this.f13922f[i12] = (byte) b9;
        }
        this.f13921e = null;
    }

    protected void b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f13921e = new byte[width * height * 3];
        for (int i8 = 0; i8 < height; i8++) {
            int i9 = width * 3 * i8;
            for (int i10 = 0; i10 < width; i10++) {
                int pixel = bitmap.getPixel(i10, i8);
                int i11 = (i10 * 3) + i9;
                byte[] bArr = this.f13921e;
                bArr[i11] = (byte) (pixel & 255);
                bArr[i11 + 1] = (byte) ((65280 & pixel) >> 8);
                bArr[i11 + 2] = (byte) ((pixel & 16711680) >> 16);
            }
        }
    }

    protected void c() {
        this.f13920d.write(33);
        this.f13920d.write(249);
        this.f13920d.write(4);
        this.f13920d.write(0);
        a(this.f13919c);
        this.f13920d.write(0);
        this.f13920d.write(0);
    }

    protected void d() {
        b("GIF89a");
    }

    protected void e() {
        this.f13920d.write(44);
        a(0);
        a(0);
        a(this.f13917a);
        a(this.f13918b);
        this.f13920d.write(135);
    }

    protected void f() {
        a(this.f13917a);
        a(this.f13918b);
        this.f13920d.write(SerialTrans.MTU_MAX);
        this.f13920d.write(0);
        this.f13920d.write(0);
    }

    protected void g() {
        OutputStream outputStream = this.f13920d;
        byte[] bArr = this.f13923g;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f13923g.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f13920d.write(0);
        }
    }

    protected void h() {
        new b(this.f13917a, this.f13918b, this.f13922f, 8).b(this.f13920d);
    }

    public void a(float f8) {
        if (f8 != 0.0f) {
            this.f13919c = Math.round(100.0f / f8);
        }
    }

    protected void b(String str) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            this.f13920d.write((byte) str.charAt(i8));
        }
    }

    public void c(Bitmap bitmap) {
        this.f13917a = bitmap.getWidth();
        this.f13918b = bitmap.getHeight();
        b(bitmap);
        a();
    }

    protected void a(int i8) {
        this.f13920d.write(i8 & 255);
        this.f13920d.write((i8 >> 8) & 255);
    }

    public boolean b() {
        try {
            this.f13920d.write(59);
            this.f13920d.flush();
            this.f13920d.close();
            this.f13920d = null;
            this.f13921e = null;
            this.f13922f = null;
            this.f13923g = null;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean a(Bitmap bitmap) {
        try {
            b(bitmap);
            a();
            c();
            e();
            g();
            h();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean a(OutputStream outputStream) {
        if (outputStream == null) {
            return false;
        }
        this.f13920d = outputStream;
        try {
            d();
            f();
            g();
            c();
            e();
            g();
            h();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean a(String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            this.f13920d = bufferedOutputStream;
            return a(bufferedOutputStream);
        } catch (FileNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
