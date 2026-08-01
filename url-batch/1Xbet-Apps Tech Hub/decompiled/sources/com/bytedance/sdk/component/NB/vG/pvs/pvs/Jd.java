package com.bytedance.sdk.component.NB.vG.pvs.pvs;

import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes.dex */
final class Jd {
    static final Charset pvs = Charset.forName("US-ASCII");
    static final Charset icD = Charset.forName(Key.STRING_CHARSET_NAME);

    static void pvs(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                pvs(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }
}
