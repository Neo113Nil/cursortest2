package com.baidu.ar.content;

import android.content.Context;
import com.baidu.ar.af;
import com.baidu.ar.h;
import com.baidu.ar.j4;
import com.baidu.ar.x7;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class ARResourceManager {

    /* renamed from: b, reason: collision with root package name */
    public static String f2000b = File.separator;

    /* renamed from: a, reason: collision with root package name */
    public String f2001a;

    public ARResourceManager(Context context) {
        File file = new File(j4.a(context), "sticker");
        if (!file.exists()) {
            file.mkdir();
        }
        this.f2001a = file.getAbsolutePath();
    }

    public final String a(String str) {
        return this.f2001a.concat(f2000b).concat(str);
    }

    public String getCaseDirPath(String str) {
        return a(String.format("bar_%s", str));
    }

    public String getCaseMainZipFile(ARResourceInfo aRResourceInfo) {
        return getCaseDirPath(aRResourceInfo.arKey) + String.format("/temp/main_%s.zip", aRResourceInfo.versionCode);
    }

    public String getCaseResourceDirPath(ARResourceInfo aRResourceInfo) {
        return getCaseDirPath(aRResourceInfo.arKey) + "/ar";
    }

    public boolean hasValidResource(ARResourceInfo aRResourceInfo, int i8) {
        String caseMainZipFile = getCaseMainZipFile(aRResourceInfo);
        File file = new File(caseMainZipFile);
        return file.exists() && file.length() == ((long) i8) && af.a(caseMainZipFile);
    }

    public String unzipResource(ARResourceInfo aRResourceInfo) {
        String caseMainZipFile = getCaseMainZipFile(aRResourceInfo);
        String caseDirPath = getCaseDirPath(aRResourceInfo.arKey);
        a(caseMainZipFile, caseDirPath);
        return caseDirPath;
    }

    public String unzipStepRes(String str, String str2) {
        String caseDirPath = getCaseDirPath(str2);
        a(str, caseDirPath);
        return caseDirPath;
    }

    public ARResourceManager(String str) {
        this.f2001a = str;
    }

    public final void a(String str, String str2) {
        ZipFile zipFile;
        InputStream inputStream;
        File file = new File(str2);
        File file2 = new File(str);
        File file3 = new File(file + File.separator + "succeed.txt");
        if (file3.exists()) {
            file3.delete();
        }
        if (af.a(file2.getAbsolutePath())) {
            j4.e(file);
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (ZipException e8) {
                e = e8;
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                h.b("ARResourceManager", "unzip start");
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!nextElement.getName().contains("../") && !nextElement.isDirectory()) {
                        File file4 = new File(str2, nextElement.getName());
                        if (!file4.getParentFile().exists()) {
                            file4.getParentFile().mkdirs();
                        }
                        h.b("ARResourceManager", "file path =" + file4.getAbsolutePath() + ", parent path = " + file4.getParentFile().getAbsolutePath() + ", exists:" + file4.exists());
                        try {
                            try {
                                inputStream = zipFile.getInputStream(nextElement);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                        }
                        try {
                            x7.a(inputStream, file4);
                            x7.a((Closeable) inputStream);
                        } catch (IOException e10) {
                            e = e10;
                            zipFile2 = inputStream;
                            e.printStackTrace();
                            x7.a(zipFile2);
                            af.a(zipFile);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            zipFile2 = inputStream;
                            x7.a(zipFile2);
                            throw th;
                        }
                    }
                }
                af.a(zipFile);
                try {
                    h.b("ARResourceManager", "unzip end");
                    file3.createNewFile();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } catch (ZipException e12) {
                e = e12;
                zipFile2 = zipFile;
                e.printStackTrace();
                h.b("ARResourceManager", "unzip break !!!" + e.getMessage());
                af.a(zipFile2);
            } catch (Throwable th4) {
                th = th4;
                zipFile2 = zipFile;
                af.a(zipFile2);
                throw th;
            }
        }
    }
}
