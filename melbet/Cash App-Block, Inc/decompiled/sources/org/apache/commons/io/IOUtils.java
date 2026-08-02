package org.apache.commons.io;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import org.apache.commons.io.output.StringBuilderWriter;

/* loaded from: classes4.dex */
public abstract class IOUtils {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        char c = File.separatorChar;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(0);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        try {
            printWriter.println();
            stringBuilderWriter.toString();
            printWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static String toString(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        int i = Charsets.$r8$clinit;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringBuilderWriter.builder.toString();
            }
            stringBuilderWriter.write(cArr, 0, read);
        }
    }
}
