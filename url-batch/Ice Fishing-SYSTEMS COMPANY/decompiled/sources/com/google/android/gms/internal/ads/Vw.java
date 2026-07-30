package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Vw {

    /* renamed from: a, reason: collision with root package name */
    public final C3077d8 f28322a;

    /* renamed from: b, reason: collision with root package name */
    public final File f28323b;

    /* renamed from: c, reason: collision with root package name */
    public final File f28324c;

    /* renamed from: d, reason: collision with root package name */
    public final File f28325d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f28326e;

    public Vw(C3077d8 c3077d8, File file, File file2, File file3) {
        this.f28322a = c3077d8;
        this.f28323b = file;
        this.f28324c = file3;
        this.f28325d = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.f28326e == null) {
            try {
                fileInputStream = new FileInputStream(this.f28325d);
                try {
                    QK qk = SK.f27529u;
                    ArrayList arrayList = new ArrayList();
                    int i = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i];
                        int i4 = 0;
                        while (i4 < i) {
                            int read = fileInputStream.read(bArr3, i4, i - i4);
                            if (read == -1) {
                                break;
                            }
                            i4 += read;
                        }
                        QK s3 = i4 == 0 ? null : SK.s(bArr3, 0, i4);
                        if (s3 == null) {
                            break;
                        }
                        arrayList.add(s3);
                        i = Math.min(i + i, 8192);
                    }
                    bArr2 = SK.u(arrayList).a();
                    S2.b.c(fileInputStream);
                } catch (IOException unused) {
                    S2.b.c(fileInputStream);
                    bArr2 = null;
                    this.f28326e = bArr2;
                    bArr = this.f28326e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    S2.b.c(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f28326e = bArr2;
        }
        bArr = this.f28326e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
