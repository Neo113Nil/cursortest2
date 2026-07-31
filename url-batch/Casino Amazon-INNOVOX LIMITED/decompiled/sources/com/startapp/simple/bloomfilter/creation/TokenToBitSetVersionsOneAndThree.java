package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes3.dex */
public class TokenToBitSetVersionsOneAndThree extends TokenToBitSet {
    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    protected DataInput createDataInput(byte[] bArr) {
        DataInput createDataInput = super.createDataInput(bArr);
        incrementInputStreamForBackwordCompatability(createDataInput);
        return createDataInput;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    protected OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        long readInt = dataInput.readInt();
        OpenBitSet openBitSet = new OpenBitSet(readInt << 6);
        fillBitSet(dataInput, openBitSet, readInt);
        return openBitSet;
    }

    private void incrementInputStreamForBackwordCompatability(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e);
        }
    }
}
