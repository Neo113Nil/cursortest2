package com.baidu.platform.comapi.walknavi.g.i.j;

import android.os.AsyncTask;
import android.text.TextUtils;
import cn.hutool.core.util.g1;
import com.baidu.platform.comapi.walknavi.g.i.k.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class b extends AsyncTask<String, Integer, String> {

    /* renamed from: a, reason: collision with root package name */
    private String f10062a;

    /* renamed from: b, reason: collision with root package name */
    private int f10063b;

    /* renamed from: c, reason: collision with root package name */
    private a<String> f10064c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10065d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10066e;

    /* renamed from: f, reason: collision with root package name */
    private String f10067f;

    public b(String str, int i8, boolean z7, a<String> aVar) {
        this.f10062a = str;
        this.f10063b = i8;
        this.f10064c = aVar;
        this.f10066e = z7;
    }

    private boolean b(String str) {
        return (str == null || str.length() <= 0 || str.contains("../")) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d(String str) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        ZipFile zipFile;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        BufferedInputStream bufferedInputStream5;
        BufferedInputStream bufferedInputStream6;
        BufferedInputStream bufferedInputStream7;
        ?? r12;
        ZipFile zipFile2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (str.length() <= 4) {
            return null;
        }
        String substring = str.substring(0, str.length() - 4);
        File file2 = new File(substring);
        String a8 = j.a(str);
        if (this.f10066e) {
            if (file2.exists()) {
                com.baidu.platform.comapi.walknavi.g.i.k.f.a(file2);
            }
        } else {
            if (!a(a8, file2)) {
                return substring;
            }
            if (file2.exists()) {
                com.baidu.platform.comapi.walknavi.g.i.k.f.a(file2);
            }
        }
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                ?? r62 = 0;
                bufferedOutputStream = null;
                while (entries.hasMoreElements()) {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        if (!nextElement.isDirectory()) {
                            if (!b(nextElement.getName())) {
                                try {
                                    zipFile.close();
                                } catch (IOException unused) {
                                }
                                if (r62 != 0) {
                                    try {
                                        r62.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                return null;
                            }
                            File file3 = new File(file2, nextElement.getName());
                            if (!a(file3.getCanonicalPath(), substring)) {
                                try {
                                    zipFile.close();
                                } catch (IOException unused4) {
                                }
                                if (r62 != 0) {
                                    try {
                                        r62.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                return null;
                            }
                            if (!file3.getParentFile().exists()) {
                                com.baidu.platform.comapi.walknavi.g.i.k.a.a("file path = " + file3.getAbsolutePath() + ", parent path = " + file3.getParentFile().getAbsolutePath());
                                file3.getParentFile().mkdirs();
                            }
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                            byte[] bArr = new byte[8192];
                            r12 = new BufferedInputStream(zipFile.getInputStream(nextElement), 8192);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file3), 8192);
                                while (true) {
                                    try {
                                        int read = r12.read(bArr, 0, 8192);
                                        if (read == -1) {
                                            break;
                                        }
                                        bufferedOutputStream2.write(bArr, 0, read);
                                    } catch (ZipException unused7) {
                                        bufferedOutputStream = bufferedOutputStream2;
                                        bufferedInputStream4 = r12;
                                        if (zipFile != null) {
                                        }
                                        if (bufferedInputStream4 != null) {
                                        }
                                        if (bufferedOutputStream != null) {
                                        }
                                        return null;
                                    } catch (IOException unused8) {
                                        bufferedOutputStream = bufferedOutputStream2;
                                        bufferedInputStream3 = r12;
                                        if (zipFile != null) {
                                        }
                                        if (bufferedInputStream3 != null) {
                                        }
                                        if (bufferedOutputStream != null) {
                                        }
                                        return null;
                                    } catch (Exception unused9) {
                                        bufferedOutputStream = bufferedOutputStream2;
                                        bufferedInputStream2 = r12;
                                        if (zipFile != null) {
                                        }
                                        if (bufferedInputStream2 != null) {
                                        }
                                        if (bufferedOutputStream != null) {
                                        }
                                        return null;
                                    } catch (Throwable th) {
                                        th = th;
                                        zipFile2 = zipFile;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        bufferedInputStream = r12;
                                        if (zipFile2 != null) {
                                        }
                                        if (bufferedInputStream != null) {
                                        }
                                        if (bufferedOutputStream == null) {
                                        }
                                    }
                                }
                                bufferedOutputStream2.flush();
                                bufferedOutputStream = bufferedOutputStream2;
                                r62 = r12;
                            } catch (ZipException unused10) {
                                bufferedInputStream4 = r12;
                            } catch (IOException unused11) {
                                bufferedInputStream3 = r12;
                            } catch (Exception unused12) {
                                bufferedInputStream2 = r12;
                            } catch (Throwable th2) {
                                th = th2;
                                zipFile2 = zipFile;
                                bufferedInputStream = r12;
                                if (zipFile2 != null) {
                                    try {
                                        zipFile2.close();
                                    } catch (IOException unused13) {
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused14) {
                                    }
                                }
                                if (bufferedOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    bufferedOutputStream.close();
                                    throw th;
                                } catch (IOException unused15) {
                                    throw th;
                                }
                            }
                        }
                    } catch (ZipException unused16) {
                        bufferedInputStream7 = r62;
                        bufferedInputStream4 = bufferedInputStream7;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused17) {
                            }
                        }
                        if (bufferedInputStream4 != null) {
                            try {
                                bufferedInputStream4.close();
                            } catch (IOException unused18) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused19) {
                            }
                        }
                        return null;
                    } catch (IOException unused20) {
                        bufferedInputStream6 = r62;
                        bufferedInputStream3 = bufferedInputStream6;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused21) {
                            }
                        }
                        if (bufferedInputStream3 != null) {
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException unused22) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused23) {
                            }
                        }
                        return null;
                    } catch (Exception unused24) {
                        bufferedInputStream5 = r62;
                        bufferedInputStream2 = bufferedInputStream5;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused25) {
                            }
                        }
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused26) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused27) {
                            }
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        zipFile2 = r62;
                        r12 = zipFile2;
                        zipFile2 = zipFile;
                        bufferedInputStream = r12;
                        if (zipFile2 != null) {
                        }
                        if (bufferedInputStream != null) {
                        }
                        if (bufferedOutputStream == null) {
                        }
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException unused28) {
                }
                if (r62 != 0) {
                    try {
                        r62.close();
                    } catch (IOException unused29) {
                    }
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused30) {
                    }
                }
                if (!this.f10066e) {
                    com.baidu.platform.comapi.walknavi.g.i.k.f.b(a8, ".successUnzip.txt");
                }
                return substring;
            } catch (ZipException unused31) {
                bufferedInputStream7 = null;
                bufferedOutputStream = null;
            } catch (IOException unused32) {
                bufferedInputStream6 = null;
                bufferedOutputStream = null;
            } catch (Exception unused33) {
                bufferedInputStream5 = null;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (ZipException unused34) {
            zipFile = null;
            bufferedOutputStream = null;
            bufferedInputStream4 = null;
        } catch (IOException unused35) {
            zipFile = null;
            bufferedOutputStream = null;
            bufferedInputStream3 = null;
        } catch (Exception unused36) {
            zipFile = null;
            bufferedOutputStream = null;
            bufferedInputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        a<String> aVar = this.f10064c;
        if (aVar != null) {
            aVar.a(numArr[0].intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a<String> aVar;
        if (TextUtils.isEmpty(str)) {
            a<String> aVar2 = this.f10064c;
            if (aVar2 != null) {
                aVar2.a("download error!");
                return;
            }
            return;
        }
        if ("true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str) || (aVar = this.f10064c) == null) {
            return;
        }
        aVar.a(100);
        this.f10064c.onResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0191, code lost:
    
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("cancelled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0196, code lost:
    
        r8.close();
        r4.close();
     */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String doInBackground(String... strArr) {
        RandomAccessFile randomAccessFile;
        BufferedInputStream bufferedInputStream = null;
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.f10067f = str;
            String a8 = com.baidu.platform.comapi.walknavi.g.i.k.f.a(this.f10062a, this.f10063b);
            if (TextUtils.isEmpty(a8)) {
                return null;
            }
            File file = new File(a8);
            if (!file.exists() || !file.isDirectory()) {
                file.mkdirs();
            }
            String str2 = a8 + File.separator + (j.a(str) + "." + g1.URL_PROTOCOL_ZIP);
            File file2 = new File(str2);
            if (file2.exists()) {
                try {
                    new ZipFile(str2);
                    if (com.baidu.platform.comapi.walknavi.g.i.b.f9991a) {
                        return d(str2);
                    }
                    a<String> aVar = this.f10064c;
                    if (aVar == null) {
                        return "false";
                    }
                    aVar.a(false, a(str));
                    return "false";
                } catch (Exception unused) {
                    file2.delete();
                    if (!com.baidu.platform.comapi.walknavi.g.i.b.f9991a) {
                        a<String> aVar2 = this.f10064c;
                        if (aVar2 != null) {
                            aVar2.a(true, a(str));
                        }
                        return "true";
                    }
                }
            } else {
                if (!com.baidu.platform.comapi.walknavi.g.i.b.f9991a) {
                    a<String> aVar3 = this.f10064c;
                    if (aVar3 != null) {
                        aVar3.a(true, a(str));
                    }
                    return "true";
                }
                if (com.baidu.platform.comapi.walknavi.g.i.k.c.a(file2.getParentFile())) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        com.baidu.platform.comapi.walknavi.g.i.k.a.a("create zip file error!");
                        return null;
                    }
                } else {
                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("create file error!");
                }
            }
            int a9 = a(str);
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("download length = " + a9);
            try {
                if (a9 == 0) {
                    return null;
                }
                try {
                    URLConnection openConnection = new URL(str).openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setRequestProperty("Range", "bytes=0-" + a9);
                    randomAccessFile = new RandomAccessFile(str2, "rw");
                    try {
                        randomAccessFile.seek(0L);
                        byte[] bArr = new byte[8192];
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(openConnection.getInputStream(), 8192);
                        int i8 = 0;
                        while (true) {
                            try {
                                int read = bufferedInputStream2.read(bArr, 0, 8192);
                                if (read != -1) {
                                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("one while read start n =" + read);
                                    randomAccessFile.write(bArr, 0, read);
                                    i8 += read;
                                    int i9 = (int) ((((float) i8) * 100.0f) / ((float) a9));
                                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("percentProgress = " + i9);
                                    publishProgress(Integer.valueOf(i9));
                                    while (this.f10065d) {
                                        com.baidu.platform.comapi.walknavi.g.i.k.a.a("mIsPause = " + this.f10065d);
                                        try {
                                            Thread.currentThread();
                                            Thread.sleep(500L);
                                        } catch (InterruptedException unused3) {
                                        }
                                    }
                                    if (isCancelled()) {
                                        break;
                                    }
                                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("one while read end count = " + i8);
                                } else {
                                    bufferedInputStream2.close();
                                    randomAccessFile.close();
                                    break;
                                }
                            } catch (IOException unused4) {
                                bufferedInputStream = bufferedInputStream2;
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                return d(str2);
                            } catch (Throwable th) {
                                th = th;
                                bufferedInputStream = bufferedInputStream2;
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused5) {
                                        throw th;
                                    }
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                throw th;
                            }
                        }
                    } catch (IOException unused6) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused7) {
                    randomAccessFile = null;
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = null;
                }
            } catch (IOException unused8) {
            }
        }
        return null;
        return null;
    }

    private int a(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(10000);
            return openConnection.getContentLength();
        } catch (MalformedURLException | IOException unused) {
            return 0;
        }
    }

    private boolean a(String str, String str2) {
        return str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str.startsWith(str2);
    }

    private boolean a(String str, File file) {
        String[] list;
        return (file.exists() && file.isDirectory() && (list = file.list()) != null && list.length != 0 && com.baidu.platform.comapi.walknavi.g.i.k.f.a(str, ".successUnzip.txt")) ? false : true;
    }
}
