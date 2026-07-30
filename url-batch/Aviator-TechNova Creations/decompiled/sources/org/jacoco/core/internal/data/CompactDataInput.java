package org.jacoco.core.internal.data;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class CompactDataInput extends DataInputStream {
    public CompactDataInput(InputStream inputStream) {
        super(inputStream);
    }

    public int readVarInt() throws IOException {
        byte readByte = readByte();
        return (readByte & 128) == 0 ? readByte & 255 : (readByte & Byte.MAX_VALUE) | (readVarInt() << 7);
    }

    public boolean[] readBooleanArray() throws IOException {
        int readVarInt = readVarInt();
        boolean[] zArr = new boolean[readVarInt];
        int i = 0;
        for (int i2 = 0; i2 < readVarInt; i2++) {
            if (i2 % 8 == 0) {
                i = readByte();
            }
            zArr[i2] = (i & 1) != 0;
            i >>>= 1;
        }
        return zArr;
    }
}
