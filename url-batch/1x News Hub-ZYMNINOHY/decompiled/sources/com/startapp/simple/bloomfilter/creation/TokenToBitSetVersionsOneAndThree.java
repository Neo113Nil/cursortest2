package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes.dex */
public class TokenToBitSetVersionsOneAndThree extends TokenToBitSet {
    private void incrementInputStreamForBackwordCompatability(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e3) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e3);
        }
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public DataInput createDataInput(byte[] bArr) {
        DataInput createDataInput = super.createDataInput(bArr);
        incrementInputStreamForBackwordCompatability(createDataInput);
        return createDataInput;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        long readInt = dataInput.readInt();
        OpenBitSet openBitSet = new OpenBitSet(readInt << 6);
        fillBitSet(dataInput, openBitSet, readInt);
        return openBitSet;
    }
}
