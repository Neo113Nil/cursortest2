package com.tapjoy.internal;

import java.nio.CharBuffer;

/* loaded from: classes2.dex */
public final class jz {
    private static long a(Readable readable, Appendable appendable) {
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j = 0;
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return j;
            }
            allocate.flip();
            appendable.append(allocate, 0, read);
            j += read;
        }
    }

    public static String a(Readable readable) {
        StringBuilder sb = new StringBuilder();
        a(readable, sb);
        return sb.toString();
    }
}
