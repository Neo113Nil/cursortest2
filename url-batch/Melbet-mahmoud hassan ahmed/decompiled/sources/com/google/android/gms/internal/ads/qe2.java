package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class qe2 {
    public static void a(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void b(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i7);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i7)));
        }
    }
}
