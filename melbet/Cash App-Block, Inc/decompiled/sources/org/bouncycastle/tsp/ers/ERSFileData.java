package org.bouncycastle.tsp.ers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes10.dex */
public class ERSFileData extends ERSCachingData {
    private final File content;

    public ERSFileData(File file) {
        if (file.isDirectory()) {
            a$$ExternalSyntheticBUOutline0.m$3("directory not allowed as ERSFileData");
            throw null;
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " does not exist");
        }
        if (file.canRead()) {
            this.content = file;
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + " is not readable");
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.content);
            byte[] calculateDigest = ERSUtil.calculateDigest(digestCalculator, fileInputStream);
            fileInputStream.close();
            return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, calculateDigest) : calculateDigest;
        } catch (IOException unused) {
            a$$ExternalSyntheticBUOutline0.m$2(this.content.getAbsolutePath(), "unable to process ");
            return null;
        }
    }
}
