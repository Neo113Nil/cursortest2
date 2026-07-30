package com.baidu.platform.comapi.h.h;

import android.text.TextUtils;
import com.baidu.entity.pb.RepHead;
import com.google.protobuf.micro.MessageMicro;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Method> f9089a = new HashMap();

    private static Method a(ClassLoader classLoader, String str) {
        String str2 = str + "@" + classLoader.hashCode();
        Method method = f9089a.get(str2);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, true, classLoader).getDeclaredMethod("parseFrom", byte[].class);
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
            f9089a.put(str2, declaredMethod);
        }
        return declaredMethod;
    }

    public static MessageMicro a(String str, String str2, byte[] bArr, int i8, int i9) {
        if (bArr != null && !TextUtils.isEmpty(str2)) {
            try {
                return (MessageMicro) a(d.class.getClassLoader(), str + "." + str2.replace("\\.", "\\$")).invoke(null, a(new ByteArrayInputStream(bArr, i8, i9)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static List<MessageMicro> a(byte[] bArr, String str) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length != 0) {
            int i8 = ByteBuffer.wrap(bArr, 0, 4).order(ByteOrder.BIG_ENDIAN).getInt();
            RepHead parseFrom = RepHead.parseFrom(a(new ByteArrayInputStream(bArr, 4, i8)));
            int messageHeadCount = parseFrom.getMessageHeadCount();
            int i9 = i8 + 4;
            for (int i10 = 0; i10 < messageHeadCount; i10++) {
                RepHead.MessageHead messageHead = parseFrom.getMessageHead(i10);
                String name = messageHead.getName();
                int length = messageHead.getLength();
                int offset = messageHead.getOffset() + i9;
                if (name.equals("M")) {
                    b bVar = new b();
                    bVar.f9085a = a(new ByteArrayInputStream(bArr, offset, length));
                    arrayList.add(bVar);
                } else {
                    MessageMicro a8 = a(str, name, bArr, offset, length);
                    if (a8 != null) {
                        arrayList.add(a8);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<MessageMicro> a(byte[] bArr) {
        return a(bArr, "com.baidu.entity.pb");
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        byte[] bArr = new byte[512];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                    return;
                }
            } catch (Throwable th) {
                inputStream.close();
                outputStream.close();
                throw th;
            }
        }
    }
}
