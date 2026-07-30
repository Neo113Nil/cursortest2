package com.crrepa.y;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class c extends com.crrepa.y.a {
    private String mDestFileDir;
    private String mdestFileName;

    class a implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f14045h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f14046i;

        a(long j8, long j9) {
            this.f14045h = j8;
            this.f14046i = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j8 = this.f14046i;
            c.this.onProgress((this.f14045h * 100.0f) / j8, j8);
        }
    }

    public c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[Catch: IOException -> 0x0077, TRY_LEAVE, TryCatch #0 {IOException -> 0x0077, blocks: (B:33:0x006e, B:35:0x0073), top: B:32:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b A[Catch: IOException -> 0x008f, TRY_LEAVE, TryCatch #7 {IOException -> 0x008f, blocks: (B:51:0x0086, B:53:0x008b), top: B:50:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    @Override // com.crrepa.y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File onParseResponse(com.crrepa.x.c cVar) {
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        byte[] bArr = new byte[8192];
        try {
            inputStream2 = cVar.f13988a;
        } catch (Exception e8) {
            e = e8;
            inputStream2 = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            long j8 = cVar.f13991d;
            File file = new File(this.mDestFileDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, this.mdestFileName);
            fileOutputStream2 = new FileOutputStream(file2);
            long j9 = 0;
            while (true) {
                try {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    long j10 = j9 + read;
                    fileOutputStream2.write(bArr, 0, read);
                    com.crrepa.y.a.mMainHandler.post(new a(j10, j8));
                    j9 = j10;
                } catch (Exception e9) {
                    e = e9;
                    try {
                        e.printStackTrace();
                        try {
                            fileOutputStream2.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (IOException unused) {
                        }
                        if (fileOutputStream2 != null) {
                            return null;
                        }
                        try {
                            fileOutputStream2.close();
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        fileOutputStream = fileOutputStream2;
                        inputStream2 = inputStream;
                        fileOutputStream2 = fileOutputStream;
                        try {
                            fileOutputStream2.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (IOException unused3) {
                        }
                        if (fileOutputStream2 == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2.close();
                    if (inputStream2 != null) {
                    }
                    if (fileOutputStream2 == null) {
                    }
                }
            }
            fileOutputStream2.flush();
            try {
                fileOutputStream2.close();
                inputStream2.close();
            } catch (IOException unused5) {
            }
            try {
                fileOutputStream2.close();
            } catch (IOException unused6) {
            }
            return file2;
        } catch (Exception e10) {
            e = e10;
            fileOutputStream2 = null;
            e.printStackTrace();
            fileOutputStream2.close();
            if (inputStream2 != null) {
            }
            if (fileOutputStream2 != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = inputStream2;
            fileOutputStream = null;
            inputStream2 = inputStream;
            fileOutputStream2 = fileOutputStream;
            fileOutputStream2.close();
            if (inputStream2 != null) {
            }
            if (fileOutputStream2 == null) {
            }
        }
    }

    public void setMdestFileName(String str) {
        this.mdestFileName = str;
    }

    public void setmDestFileDir(String str) {
        this.mDestFileDir = str;
    }

    public c(String str, String str2) {
        this.mDestFileDir = str;
        this.mdestFileName = str2;
    }
}
