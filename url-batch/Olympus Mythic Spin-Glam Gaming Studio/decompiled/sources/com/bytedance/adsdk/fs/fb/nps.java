package com.bytedance.adsdk.fs.fb;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class nps {
    private final btk zmn;

    public nps(btk btkVar) {
        this.zmn = btkVar;
    }

    Pair<zn, InputStream> zmn(String str) {
        zn znVar;
        try {
            File fs = fs(str);
            if (fs == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fs);
            if (fs.getAbsolutePath().endsWith(".zip")) {
                znVar = zn.ZIP;
            } else {
                znVar = zn.JSON;
            }
            fs.getAbsolutePath();
            return new Pair<>(znVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File zmn(String str, InputStream inputStream, zn znVar) throws IOException {
        File file = new File(zmn(), zmn(str, znVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    void zmn(String str, zn znVar) {
        File file = new File(zmn(), zmn(str, znVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File fs(String str) throws FileNotFoundException {
        File file = new File(zmn(), zmn(str, zn.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(zmn(), zmn(str, zn.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File zmn() {
        File zmn = this.zmn.zmn();
        if (zmn.isFile()) {
            zmn.delete();
        }
        if (!zmn.exists()) {
            zmn.mkdirs();
        }
        return zmn;
    }

    private static String zmn(String str, zn znVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? znVar.zmn() : znVar.zn);
        return sb.toString();
    }
}
