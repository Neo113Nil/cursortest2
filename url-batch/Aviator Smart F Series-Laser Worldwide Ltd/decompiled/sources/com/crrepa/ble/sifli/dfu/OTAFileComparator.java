package com.crrepa.ble.sifli.dfu;

import java.util.Comparator;

/* loaded from: classes3.dex */
public class OTAFileComparator implements Comparator<OTAFile> {
    @Override // java.util.Comparator
    public int compare(OTAFile oTAFile, OTAFile oTAFile2) {
        return Integer.compare(oTAFile.getFileIndex(), oTAFile2.getFileIndex());
    }
}
