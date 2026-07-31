package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j23 {

    /* renamed from: a, reason: collision with root package name */
    private final yd f6943a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6944b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6945c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6946d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f6947e;

    public j23(yd ydVar, File file, File file2, File file3) {
        this.f6943a = ydVar;
        this.f6944b = file;
        this.f6945c = file3;
        this.f6946d = file2;
    }

    public final yd a() {
        return this.f6943a;
    }

    public final File b() {
        return this.f6945c;
    }

    public final File c() {
        return this.f6944b;
    }

    public final boolean d(long j7) {
        return this.f6943a.G() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] e() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.f6947e == null) {
            try {
                fileInputStream = new FileInputStream(this.f6946d);
                try {
                    bArr2 = uo3.M(fileInputStream).m();
                    v3.j.a(fileInputStream);
                } catch (IOException unused) {
                    v3.j.a(fileInputStream);
                    bArr2 = null;
                    this.f6947e = bArr2;
                    bArr = this.f6947e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    v3.j.a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f6947e = bArr2;
        }
        bArr = this.f6947e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
