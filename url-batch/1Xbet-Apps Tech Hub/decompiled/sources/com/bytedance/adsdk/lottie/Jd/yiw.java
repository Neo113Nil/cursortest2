package com.bytedance.adsdk.lottie.Jd;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* loaded from: classes.dex */
public class yiw {
    private final NB pvs;

    public yiw(NB nb) {
        this.pvs = nb;
    }

    Pair<vG, InputStream> pvs(String str) {
        vG vGVar;
        try {
            File icD = icD(str);
            if (icD == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(icD);
            if (icD.getAbsolutePath().endsWith(".zip")) {
                vGVar = vG.ZIP;
            } else {
                vGVar = vG.JSON;
            }
            icD.getAbsolutePath();
            return new Pair<>(vGVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File pvs(String str, InputStream inputStream, vG vGVar) throws IOException {
        File file = new File(pvs(), pvs(str, vGVar, true));
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
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void pvs(String str, vG vGVar) {
        File file = new File(pvs(), pvs(str, vGVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        new StringBuilder("Copying temp file to real file (").append(file2);
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File icD(String str) throws FileNotFoundException {
        File file = new File(pvs(), pvs(str, vG.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(pvs(), pvs(str, vG.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File pvs() {
        File pvs = this.pvs.pvs();
        if (pvs.isFile()) {
            pvs.delete();
        }
        if (!pvs.exists()) {
            pvs.mkdirs();
        }
        return pvs;
    }

    private static String pvs(String str, vG vGVar, boolean z) {
        return "lottie_cache_" + str.replaceAll("\\W+", "") + (z ? vGVar.pvs() : vGVar.vG);
    }
}
