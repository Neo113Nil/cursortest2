package com.tapjoy.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class bg {
    public static String a(File file, Charset charset) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return jz.a(new InputStreamReader(fileInputStream, charset));
        } finally {
            ka.a(fileInputStream);
        }
    }

    public static void a(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, ak.f7827c);
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
    }

    @Nullable
    public static String a(File file) {
        try {
            return a(file, ak.f7827c);
        } catch (IOException unused) {
            return null;
        }
    }
}
