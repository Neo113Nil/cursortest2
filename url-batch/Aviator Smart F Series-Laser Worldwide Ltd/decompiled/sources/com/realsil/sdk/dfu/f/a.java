package com.realsil.sdk.dfu.f;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f15741a;

    /* renamed from: b, reason: collision with root package name */
    public long f15742b;

    /* renamed from: c, reason: collision with root package name */
    public int f15743c;

    /* renamed from: d, reason: collision with root package name */
    public int f15744d;

    public a(String str, int i8, int i9, int i10) {
        this.f15741a = str;
        this.f15742b = i8;
        this.f15743c = i9;
        this.f15744d = i10;
    }

    public int a() {
        return this.f15744d;
    }

    public InputStream b() {
        FileInputStream fileInputStream;
        IOException e8;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(this.f15741a);
            try {
                fileInputStream.skip(this.f15742b);
                return fileInputStream;
            } catch (FileNotFoundException unused) {
                fileInputStream2 = fileInputStream;
                ZLogger.w(String.format(Locale.US, "FileNotFoundException:%s, %d", this.f15741a, Long.valueOf(this.f15742b)));
                return fileInputStream2;
            } catch (IOException e9) {
                e8 = e9;
                ZLogger.w(e8.toString());
                return fileInputStream;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e10) {
            fileInputStream = null;
            e8 = e10;
        }
    }

    public int c() {
        return this.f15743c;
    }

    public long d() {
        return this.f15742b;
    }

    public String toString() {
        return String.format(Locale.US, "skipOffset=%d, length=0x%02X, budRole=0x%02X", Long.valueOf(this.f15742b), Integer.valueOf(this.f15743c), Integer.valueOf(this.f15744d));
    }

    public static a a(String str, int i8, byte[] bArr) {
        a aVar = new a(str, i8, ByteArrayConverter.toInt(bArr, 0), bArr[4] & 1);
        ZLogger.v(aVar.toString());
        return aVar;
    }

    public InputStream a(Context context) {
        String obj;
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(this.f15741a);
            inputStream.skip(this.f15742b);
            return inputStream;
        } catch (FileNotFoundException unused) {
            obj = String.format(Locale.US, "FileNotFoundException:%s, %d", this.f15741a, Long.valueOf(this.f15742b));
            ZLogger.w(obj);
            return inputStream;
        } catch (IOException e8) {
            obj = e8.toString();
            ZLogger.w(obj);
            return inputStream;
        }
    }
}
