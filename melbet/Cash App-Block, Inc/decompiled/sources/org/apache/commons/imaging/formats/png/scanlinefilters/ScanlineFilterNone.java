package org.apache.commons.imaging.formats.png.scanlinefilters;

/* loaded from: classes9.dex */
public class ScanlineFilterNone implements ScanlineFilter {
    @Override // org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter
    public void unfilter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
