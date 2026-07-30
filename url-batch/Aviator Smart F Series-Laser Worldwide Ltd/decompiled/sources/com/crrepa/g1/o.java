package com.crrepa.g1;

import android.os.Build;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12933a = 8192;

    private o() {
    }

    public static File a(File file) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        File file2 = new File(file.getParentFile().getPath(), name.substring(0, name.lastIndexOf(46)));
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name2 = nextElement.getName();
                InputStream inputStream = zipFile.getInputStream(nextElement);
                File file3 = new File(file2, name2);
                if (!file3.getParentFile().exists()) {
                    file3.getParentFile().mkdirs();
                }
                if (!file3.isDirectory()) {
                    if (!file3.getCanonicalPath().startsWith(file2.getCanonicalPath())) {
                        BleLog.e("unzip SecurityException");
                        return null;
                    }
                    a(inputStream, file3);
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return file2;
    }

    private static void a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                inputStream.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    public static void a(String str, String str2) {
        ZipOutputStream zipOutputStream;
        Path path;
        OutputStream newOutputStream;
        if (24 < Build.VERSION.SDK_INT) {
            path = Paths.get(str2, new String[0]);
            newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
            zipOutputStream = new ZipOutputStream(newOutputStream);
        } else {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
        }
        File file = new File(str);
        a(file.getParent() + File.separator, file.getName(), zipOutputStream);
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    private static void a(String str, String str2, ZipOutputStream zipOutputStream) {
        if (zipOutputStream == null) {
            return;
        }
        File file = new File(str + str2);
        if (!file.isFile()) {
            String[] list = file.list();
            if (list.length <= 0) {
                zipOutputStream.putNextEntry(new ZipEntry(str2 + File.separator));
                zipOutputStream.closeEntry();
            }
            for (String str3 : list) {
                a(str, str2 + File.separator + str3, zipOutputStream);
            }
            return;
        }
        ZipEntry zipEntry = new ZipEntry(str2);
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(zipEntry);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArr, 0, read);
        }
    }
}
