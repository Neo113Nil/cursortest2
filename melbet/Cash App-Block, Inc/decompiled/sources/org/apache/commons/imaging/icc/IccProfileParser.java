package org.apache.commons.imaging.icc;

import java.awt.color.ICC_Profile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;

/* loaded from: classes9.dex */
public class IccProfileParser extends BinaryFileParser {
    private static final Logger LOGGER = Logger.getLogger(IccProfileParser.class.getName());

    public IccProfileParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    private IccTagType getIccTagType(int i) {
        for (IccTagTypes iccTagTypes : IccTagTypes.values()) {
            if (iccTagTypes.getSignature() == i) {
                return iccTagTypes;
            }
        }
        return null;
    }

    private IccProfileInfo readICCProfileInfo(InputStream inputStream) {
        String str;
        CachingInputStream cachingInputStream = new CachingInputStream(inputStream);
        try {
            int read4Bytes = BinaryFunctions.read4Bytes("ProfileSize", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            int read4Bytes2 = BinaryFunctions.read4Bytes("Signature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            Logger logger = LOGGER;
            Level level = Level.FINEST;
            if (logger.isLoggable(level)) {
                str = "]";
                BinaryFunctions.printCharQuad("CMMTypeSignature", read4Bytes2);
            } else {
                str = "]";
            }
            int read4Bytes3 = BinaryFunctions.read4Bytes("ProfileVersion", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            int read4Bytes4 = BinaryFunctions.read4Bytes("ProfileDeviceClassSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ProfileDeviceClassSignature", read4Bytes4);
            }
            int read4Bytes5 = BinaryFunctions.read4Bytes("ColorSpace", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ColorSpace", read4Bytes5);
            }
            int read4Bytes6 = BinaryFunctions.read4Bytes("ProfileConnectionSpace", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ProfileConnectionSpace", read4Bytes6);
            }
            BinaryFunctions.skipBytes(cachingInputStream, 12L, "Not a Valid ICC Profile");
            int read4Bytes7 = BinaryFunctions.read4Bytes("ProfileFileSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ProfileFileSignature", read4Bytes7);
            }
            int read4Bytes8 = BinaryFunctions.read4Bytes("PrimaryPlatformSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("PrimaryPlatformSignature", read4Bytes8);
            }
            int read4Bytes9 = BinaryFunctions.read4Bytes("VariousFlags", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("VariousFlags", read4Bytes7);
            }
            int read4Bytes10 = BinaryFunctions.read4Bytes("DeviceManufacturer", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("DeviceManufacturer", read4Bytes10);
            }
            int read4Bytes11 = BinaryFunctions.read4Bytes("DeviceModel", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("DeviceModel", read4Bytes11);
            }
            BinaryFunctions.skipBytes(cachingInputStream, 8L, "Not a Valid ICC Profile");
            int read4Bytes12 = BinaryFunctions.read4Bytes("RenderingIntent", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("RenderingIntent", read4Bytes12);
            }
            BinaryFunctions.skipBytes(cachingInputStream, 12L, "Not a Valid ICC Profile");
            int read4Bytes13 = BinaryFunctions.read4Bytes("ProfileCreatorSignature", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ProfileCreatorSignature", read4Bytes13);
            }
            BinaryFunctions.skipBytes(cachingInputStream, 16L, "Not a Valid ICC Profile");
            BinaryFunctions.skipBytes(cachingInputStream, 28L, "Not a Valid ICC Profile");
            int read4Bytes14 = BinaryFunctions.read4Bytes("TagCount", cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
            IccTag[] iccTagArr = new IccTag[read4Bytes14];
            int i = 0;
            while (i < read4Bytes14) {
                StringBuilder sb = new StringBuilder();
                sb.append("TagSignature[");
                sb.append(i);
                String str2 = str;
                sb.append(str2);
                int read4Bytes15 = BinaryFunctions.read4Bytes(sb.toString(), cachingInputStream, "Not a Valid ICC Profile", getByteOrder());
                StringBuilder sb2 = new StringBuilder();
                int i2 = read4Bytes14;
                sb2.append("OffsetToData[");
                sb2.append(i);
                sb2.append(str2);
                iccTagArr[i] = new IccTag(read4Bytes15, BinaryFunctions.read4Bytes(sb2.toString(), cachingInputStream, "Not a Valid ICC Profile", getByteOrder()), BinaryFunctions.read4Bytes("ElementSize[" + i + str2, cachingInputStream, "Not a Valid ICC Profile", getByteOrder()), getIccTagType(read4Bytes15));
                i++;
                read4Bytes14 = i2;
                str = str2;
                read4Bytes11 = read4Bytes11;
                read4Bytes12 = read4Bytes12;
                read4Bytes13 = read4Bytes13;
            }
            int i3 = read4Bytes13;
            int i4 = read4Bytes12;
            int i5 = read4Bytes11;
            while (cachingInputStream.read() >= 0) {
            }
            byte[] cache = cachingInputStream.getCache();
            if (cache.length < read4Bytes) {
                throw new IOException("Couldn't read ICC Profile.");
            }
            IccProfileInfo iccProfileInfo = new IccProfileInfo(cache, read4Bytes, read4Bytes2, read4Bytes3, read4Bytes4, read4Bytes5, read4Bytes6, read4Bytes7, read4Bytes8, read4Bytes9, read4Bytes10, i5, i4, i3, null, iccTagArr);
            Logger logger2 = LOGGER;
            if (logger2.isLoggable(Level.FINEST)) {
                logger2.finest("issRGB: " + iccProfileInfo.issRGB());
            }
            return iccProfileInfo;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IccProfileInfo getICCProfileInfo(ByteSource byteSource) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = byteSource.getInputStream();
            try {
                try {
                    IccProfileInfo readICCProfileInfo = readICCProfileInfo(inputStream);
                    if (readICCProfileInfo == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                return null;
                            } catch (Exception e) {
                                LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
                            }
                        }
                        return null;
                    }
                    inputStream.close();
                    for (IccTag iccTag : readICCProfileInfo.getTags()) {
                        iccTag.setData(byteSource.getBlock(iccTag.offset, iccTag.length));
                    }
                    return readICCProfileInfo;
                } catch (Exception e2) {
                    e = e2;
                    LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            LOGGER.log(Level.SEVERE, e3.getMessage(), (Throwable) e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e4) {
                        LOGGER.log(Level.SEVERE, e4.getMessage(), (Throwable) e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public boolean issRGB(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            BinaryFunctions.read4Bytes("ProfileSize", inputStream, "Not a Valid ICC Profile", getByteOrder());
            BinaryFunctions.skipBytes(inputStream, 20L);
            BinaryFunctions.skipBytes(inputStream, 12L, "Not a Valid ICC Profile");
            BinaryFunctions.skipBytes(inputStream, 12L);
            int read4Bytes = BinaryFunctions.read4Bytes("ProfileFileSignature", inputStream, "Not a Valid ICC Profile", getByteOrder());
            Logger logger = LOGGER;
            Level level = Level.FINEST;
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("DeviceManufacturer", read4Bytes);
            }
            int read4Bytes2 = BinaryFunctions.read4Bytes("DeviceModel", inputStream, "Not a Valid ICC Profile", getByteOrder());
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("DeviceModel", read4Bytes2);
            }
            boolean z = read4Bytes == 1229275936 && read4Bytes2 == 1934772034;
            if (inputStream != null) {
                inputStream.close();
            }
            return z;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public boolean issRGB(byte[] bArr) {
        return issRGB(new ByteSourceArray(bArr));
    }

    public boolean issRGB(File file) {
        return issRGB(new ByteSourceFile(file));
    }

    public boolean issRGB(ICC_Profile iCC_Profile) {
        return issRGB(new ByteSourceArray(iCC_Profile.getData()));
    }

    public IccProfileInfo getICCProfileInfo(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return getICCProfileInfo(new ByteSourceArray(bArr));
    }

    public IccProfileInfo getICCProfileInfo(File file) {
        if (file == null) {
            return null;
        }
        return getICCProfileInfo(new ByteSourceFile(file));
    }

    public IccProfileInfo getICCProfileInfo(ICC_Profile iCC_Profile) {
        if (iCC_Profile == null) {
            return null;
        }
        return getICCProfileInfo(new ByteSourceArray(iCC_Profile.getData()));
    }
}
