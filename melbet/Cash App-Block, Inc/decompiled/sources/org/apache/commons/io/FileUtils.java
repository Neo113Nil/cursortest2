package org.apache.commons.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class FileUtils {
    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf)))));
        valueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static String readFileToString(File file) {
        int i = Charsets.$r8$clinit;
        Charset forName = Charset.forName("UTF-8");
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (!file.canRead()) {
            throw new IOException("File '" + file + "' cannot be read");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        if (forName == null) {
            try {
                forName = Charset.defaultCharset();
            } finally {
            }
        }
        String iOUtils = IOUtils.toString(fileInputStream, forName);
        fileInputStream.close();
        return iOUtils;
    }
}
