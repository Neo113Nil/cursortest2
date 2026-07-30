package com.crrepa.l0;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    private static final String f13183g = "r";

    /* renamed from: h, reason: collision with root package name */
    private static final int f13184h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f13185i = 4096;

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f13186a;

    /* renamed from: b, reason: collision with root package name */
    private int f13187b;

    /* renamed from: c, reason: collision with root package name */
    private int f13188c;

    /* renamed from: d, reason: collision with root package name */
    private int f13189d;

    /* renamed from: e, reason: collision with root package name */
    private int f13190e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f13191f;

    private h(File file, int i8) {
        this.f13189d = i8;
        try {
            this.f13186a = new RandomAccessFile(file, f13183g);
        } catch (Exception e8) {
            e8.printStackTrace();
            a();
        }
    }

    public static h a(File file, int i8) {
        if (file == null || !file.exists()) {
            return null;
        }
        h hVar = new h(file, i8);
        if (hVar.f13186a == null) {
            return null;
        }
        return hVar;
    }

    public int b() {
        return this.f13188c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[Catch: IOException -> 0x002b, TryCatch #0 {IOException -> 0x002b, blocks: (B:3:0x0001, B:4:0x0012, B:6:0x001a, B:8:0x001e, B:10:0x0023, B:12:0x0027, B:18:0x003d, B:20:0x0037, B:21:0x0039), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c() {
        byte[] bArr;
        try {
            this.f13186a.seek(this.f13189d);
            int i8 = this.f13189d;
            byte[] bArr2 = new byte[4096];
            int i9 = e.f13178a;
            while (true) {
                int read = this.f13186a.read(bArr2);
                if (read == -1) {
                    return i9;
                }
                if (-1 != this.f13190e) {
                    int i10 = this.f13191f;
                    if (i10 <= i8) {
                        return i9;
                    }
                    if (i10 < i8 + 4096) {
                        bArr = new byte[i10 - i8];
                        if (read == 4096 || bArr != null) {
                            if (bArr == null) {
                                bArr = new byte[read];
                            }
                            System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                        } else {
                            bArr = bArr2;
                        }
                        i8 += bArr.length;
                        byte[] a8 = e.a(bArr, i9);
                        i9 = com.crrepa.g1.c.b(a8[0], a8[1]);
                    }
                }
                bArr = null;
                if (read == 4096) {
                }
                if (bArr == null) {
                }
                System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                i8 += bArr.length;
                byte[] a82 = e.a(bArr, i9);
                i9 = com.crrepa.g1.c.b(a82[0], a82[1]);
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public int d() {
        int i8 = this.f13190e;
        if (-1 != i8) {
            return i8;
        }
        try {
            return (int) (this.f13186a.length() - this.f13189d);
        } catch (IOException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public int e() {
        return this.f13187b + 1;
    }

    public void a() {
        try {
            RandomAccessFile randomAccessFile = this.f13186a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.f13186a = null;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public void b(int i8) {
        this.f13188c = i8;
        try {
            this.f13187b = (int) ((this.f13186a.length() - this.f13189d) / this.f13188c);
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public void c(int i8) {
        this.f13190e = i8;
        this.f13187b = i8 / this.f13188c;
        this.f13191f = i8 + this.f13189d;
    }

    public byte[] a(int i8) {
        try {
            int i9 = this.f13188c;
            int i10 = this.f13189d + (i8 * i9);
            if (-1 != this.f13190e) {
                int i11 = this.f13191f;
                if (i11 <= i10) {
                    return null;
                }
                if (i11 < i10 + i9) {
                    i9 = i11 - i10;
                }
            }
            this.f13186a.seek(i10);
            byte[] bArr = new byte[i9];
            int read = this.f13186a.read(bArr);
            if (read == this.f13188c) {
                return bArr;
            }
            if (read == -1) {
                return null;
            }
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, 0, bArr2, 0, read);
            return bArr2;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public byte[] a(int i8, int i9) {
        try {
            this.f13186a.seek(i8);
            byte[] bArr = new byte[i9];
            int read = this.f13186a.read(bArr);
            if (read == i9) {
                return bArr;
            }
            if (read == -1) {
                return null;
            }
            byte[] bArr2 = new byte[read];
            System.arraycopy(bArr, 0, bArr2, 0, read);
            return bArr2;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
