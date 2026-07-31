package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class e {
    public static byte[] a(int i, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i2 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (-1 == read || i2 > i) {
                                    break;
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    i2 += read;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
