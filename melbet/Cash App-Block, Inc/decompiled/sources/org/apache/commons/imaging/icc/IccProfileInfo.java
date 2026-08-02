package org.apache.commons.imaging.icc;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public class IccProfileInfo {
    private static final Logger LOGGER = Logger.getLogger(IccProfileInfo.class.getName());
    public final int cmmTypeSignature;
    public final int colorSpace;
    private final byte[] data;
    public final int deviceManufacturer;
    public final int deviceModel;
    public final int primaryPlatformSignature;
    public final int profileConnectionSpace;
    public final int profileCreatorSignature;
    public final int profileDeviceClassSignature;
    public final int profileFileSignature;
    private final byte[] profileId;
    public final int profileSize;
    public final int profileVersion;
    public final int renderingIntent;
    private final IccTag[] tags;
    public final int variousFlags;

    public IccProfileInfo(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte[] bArr2, IccTag[] iccTagArr) {
        this.data = bArr;
        this.profileSize = i;
        this.cmmTypeSignature = i2;
        this.profileVersion = i3;
        this.profileDeviceClassSignature = i4;
        this.colorSpace = i5;
        this.profileConnectionSpace = i6;
        this.profileFileSignature = i7;
        this.primaryPlatformSignature = i8;
        this.variousFlags = i9;
        this.deviceManufacturer = i10;
        this.deviceModel = i11;
        this.renderingIntent = i12;
        this.profileCreatorSignature = i13;
        this.profileId = bArr2;
        this.tags = iccTagArr;
    }

    private void printCharQuad(PrintWriter printWriter, String str, int i) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": '");
        m108m.append((char) ((i >> 24) & 255));
        m108m.append((char) ((i >> 16) & 255));
        m108m.append((char) ((i >> 8) & 255));
        m108m.append((char) (i & 255));
        m108m.append("'");
        printWriter.println(m108m.toString());
    }

    public void dump(String str) {
        LOGGER.fine(toString());
    }

    public byte[] getData() {
        return (byte[]) this.data.clone();
    }

    public byte[] getProfileId() {
        return (byte[]) this.profileId.clone();
    }

    public IccTag[] getTags() {
        return this.tags;
    }

    public boolean issRGB() {
        return this.deviceManufacturer == 1229275936 && this.deviceModel == 1934772034;
    }

    public String toString(String str) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": data length: ");
        m108m.append(this.data.length);
        printWriter.println(m108m.toString());
        printCharQuad(printWriter, str + ": ProfileDeviceClassSignature", this.profileDeviceClassSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": CMMTypeSignature"), this.cmmTypeSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ProfileDeviceClassSignature"), this.profileDeviceClassSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ColorSpace"), this.colorSpace);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ProfileConnectionSpace"), this.profileConnectionSpace);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ProfileFileSignature"), this.profileFileSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": PrimaryPlatformSignature"), this.primaryPlatformSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ProfileFileSignature"), this.profileFileSignature);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": DeviceManufacturer"), this.deviceManufacturer);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": DeviceModel"), this.deviceModel);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": RenderingIntent"), this.renderingIntent);
        printCharQuad(printWriter, Recorder$$ExternalSyntheticOutline2.m$1(str, ": ProfileCreatorSignature"), this.profileCreatorSignature);
        int i = 0;
        while (true) {
            IccTag[] iccTagArr = this.tags;
            if (i >= iccTagArr.length) {
                StringBuilder m108m2 = Recorder$$ExternalSyntheticOutline2.m108m(str, ": issRGB: ");
                m108m2.append(issRGB());
                printWriter.println(m108m2.toString());
                printWriter.flush();
                return stringWriter.getBuffer().toString();
            }
            iccTagArr[i].dump(printWriter, "\t" + i + ": ");
            i++;
        }
    }

    public String toString() {
        try {
            return toString("");
        } catch (Exception unused) {
            return "IccProfileInfo: Error";
        }
    }
}
