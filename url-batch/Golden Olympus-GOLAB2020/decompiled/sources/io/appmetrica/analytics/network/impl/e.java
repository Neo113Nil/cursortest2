package io.appmetrica.analytics.network.impl;

import f2.AbstractC2420c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class e {
    public static byte[] a(int i4, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i5 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (-1 == read || i5 > i4) {
                                    break;
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    i5 += read;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            AbstractC2420c.a(byteArrayOutputStream, null);
                            AbstractC2420c.a(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            Unit unit = Unit.f41027a;
                            AbstractC2420c.a(byteArrayOutputStream, null);
                            AbstractC2420c.a(inputStream, null);
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
