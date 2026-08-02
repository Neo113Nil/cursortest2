package org.bouncycastle.tsp.ers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes10.dex */
public class ERSInputStreamData extends ERSCachingData {
    private final byte[] contentBytes;
    private final File contentFile;

    public ERSInputStreamData(File file) {
        if (file.isDirectory()) {
            a$$ExternalSyntheticBUOutline0.m$3("directory not allowed");
            throw null;
        }
        if (file.exists()) {
            this.contentBytes = null;
            this.contentFile = file;
        } else {
            throw new FileNotFoundException(file + " not found");
        }
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    public byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        byte[] calculateDigest;
        byte[] bArr2 = this.contentBytes;
        if (bArr2 != null) {
            calculateDigest = ERSUtil.calculateDigest(digestCalculator, bArr2);
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.contentFile);
                calculateDigest = ERSUtil.calculateDigest(digestCalculator, fileInputStream);
                fileInputStream.close();
            } catch (IOException e) {
                throw ExpUtil.createIllegalState(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to open content: ")), e);
            }
        }
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, calculateDigest) : calculateDigest;
    }

    public ERSInputStreamData(InputStream inputStream) {
        try {
            this.contentBytes = Streams.readAll(inputStream);
            this.contentFile = null;
        } catch (IOException e) {
            throw ExpUtil.createIllegalState(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to open content: ")), e);
        }
    }
}
