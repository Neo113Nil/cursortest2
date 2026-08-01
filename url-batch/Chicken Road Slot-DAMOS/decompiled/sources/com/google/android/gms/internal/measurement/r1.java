package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2724a;

    static {
        byte[] bArr = new byte[0];
        f2724a = bArr;
        ByteBuffer.wrap(bArr);
        int i3 = 0 + 0;
        try {
            if (i3 < 0) {
                throw new v1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i3 > Integer.MAX_VALUE) {
                throw new v1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (v1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(int i3, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i3 = (i3 * 31) + bArr[i12];
        }
        return i3;
    }
}
