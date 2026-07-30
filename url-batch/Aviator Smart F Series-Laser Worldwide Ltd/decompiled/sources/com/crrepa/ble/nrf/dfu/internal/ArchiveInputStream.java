package com.crrepa.ble.nrf.dfu.internal;

import androidx.annotation.NonNull;
import cn.hutool.core.util.l;
import com.crrepa.ble.nrf.dfu.internal.manifest.FileInfo;
import com.crrepa.ble.nrf.dfu.internal.manifest.Manifest;
import com.crrepa.ble.nrf.dfu.internal.manifest.ManifestFile;
import com.crrepa.ble.nrf.dfu.internal.manifest.SoftDeviceBootloaderFileInfo;
import com.crrepa.l1.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class ArchiveInputStream extends ZipInputStream {
    private static final String APPLICATION_BIN = "application.bin";
    private static final String APPLICATION_HEX = "application.hex";
    private static final String APPLICATION_INIT = "application.dat";
    private static final String BOOTLOADER_BIN = "bootloader.bin";
    private static final String BOOTLOADER_HEX = "bootloader.hex";
    private static final String MANIFEST = "manifest.json";
    private static final String SOFTDEVICE_BIN = "softdevice.bin";
    private static final String SOFTDEVICE_HEX = "softdevice.hex";
    private static final String SYSTEM_INIT = "system.dat";
    private byte[] applicationBytes;
    private byte[] applicationInitBytes;
    private int applicationSize;
    private byte[] bootloaderBytes;
    private int bootloaderSize;
    private int bytesRead;
    private int bytesReadFromCurrentSource;
    private int bytesReadFromMarkedSource;
    private CRC32 crc32;
    private byte[] currentSource;
    private Map<String, byte[]> entries;
    private Manifest manifest;
    private byte[] markedSource;
    private byte[] softDeviceAndBootloaderBytes;
    private byte[] softDeviceBytes;
    private int softDeviceSize;
    private byte[] systemInitBytes;

    /* JADX WARN: Removed duplicated region for block: B:78:0x0269 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0016, B:5:0x001e, B:11:0x002c, B:13:0x0052, B:14:0x007b, B:17:0x0085, B:19:0x0089, B:21:0x008d, B:23:0x00b3, B:24:0x00ba, B:25:0x00d7, B:27:0x00d8, B:28:0x00df, B:29:0x00e0, B:32:0x00ea, B:34:0x00ee, B:36:0x0114, B:37:0x0139, B:40:0x0143, B:42:0x0147, B:44:0x014b, B:46:0x014f, B:48:0x0175, B:49:0x0262, B:52:0x0187, B:53:0x01a4, B:54:0x01a5, B:55:0x01ac, B:58:0x01b1, B:59:0x01b8, B:60:0x011a, B:61:0x0137, B:63:0x005c, B:64:0x0079, B:67:0x01bb, B:75:0x022d, B:78:0x0269, B:79:0x0270, B:80:0x0230, B:82:0x023e, B:83:0x024a, B:85:0x024e, B:86:0x01fb, B:88:0x0209, B:89:0x0215, B:91:0x0219, B:92:0x01bf, B:94:0x01cd, B:95:0x01d9, B:97:0x01dd), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023e A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0016, B:5:0x001e, B:11:0x002c, B:13:0x0052, B:14:0x007b, B:17:0x0085, B:19:0x0089, B:21:0x008d, B:23:0x00b3, B:24:0x00ba, B:25:0x00d7, B:27:0x00d8, B:28:0x00df, B:29:0x00e0, B:32:0x00ea, B:34:0x00ee, B:36:0x0114, B:37:0x0139, B:40:0x0143, B:42:0x0147, B:44:0x014b, B:46:0x014f, B:48:0x0175, B:49:0x0262, B:52:0x0187, B:53:0x01a4, B:54:0x01a5, B:55:0x01ac, B:58:0x01b1, B:59:0x01b8, B:60:0x011a, B:61:0x0137, B:63:0x005c, B:64:0x0079, B:67:0x01bb, B:75:0x022d, B:78:0x0269, B:79:0x0270, B:80:0x0230, B:82:0x023e, B:83:0x024a, B:85:0x024e, B:86:0x01fb, B:88:0x0209, B:89:0x0215, B:91:0x0219, B:92:0x01bf, B:94:0x01cd, B:95:0x01d9, B:97:0x01dd), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0016, B:5:0x001e, B:11:0x002c, B:13:0x0052, B:14:0x007b, B:17:0x0085, B:19:0x0089, B:21:0x008d, B:23:0x00b3, B:24:0x00ba, B:25:0x00d7, B:27:0x00d8, B:28:0x00df, B:29:0x00e0, B:32:0x00ea, B:34:0x00ee, B:36:0x0114, B:37:0x0139, B:40:0x0143, B:42:0x0147, B:44:0x014b, B:46:0x014f, B:48:0x0175, B:49:0x0262, B:52:0x0187, B:53:0x01a4, B:54:0x01a5, B:55:0x01ac, B:58:0x01b1, B:59:0x01b8, B:60:0x011a, B:61:0x0137, B:63:0x005c, B:64:0x0079, B:67:0x01bb, B:75:0x022d, B:78:0x0269, B:79:0x0270, B:80:0x0230, B:82:0x023e, B:83:0x024a, B:85:0x024e, B:86:0x01fb, B:88:0x0209, B:89:0x0215, B:91:0x0219, B:92:0x01bf, B:94:0x01cd, B:95:0x01d9, B:97:0x01dd), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0016, B:5:0x001e, B:11:0x002c, B:13:0x0052, B:14:0x007b, B:17:0x0085, B:19:0x0089, B:21:0x008d, B:23:0x00b3, B:24:0x00ba, B:25:0x00d7, B:27:0x00d8, B:28:0x00df, B:29:0x00e0, B:32:0x00ea, B:34:0x00ee, B:36:0x0114, B:37:0x0139, B:40:0x0143, B:42:0x0147, B:44:0x014b, B:46:0x014f, B:48:0x0175, B:49:0x0262, B:52:0x0187, B:53:0x01a4, B:54:0x01a5, B:55:0x01ac, B:58:0x01b1, B:59:0x01b8, B:60:0x011a, B:61:0x0137, B:63:0x005c, B:64:0x0079, B:67:0x01bb, B:75:0x022d, B:78:0x0269, B:79:0x0270, B:80:0x0230, B:82:0x023e, B:83:0x024a, B:85:0x024e, B:86:0x01fb, B:88:0x0209, B:89:0x0215, B:91:0x0219, B:92:0x01bf, B:94:0x01cd, B:95:0x01d9, B:97:0x01dd), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0219 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0016, B:5:0x001e, B:11:0x002c, B:13:0x0052, B:14:0x007b, B:17:0x0085, B:19:0x0089, B:21:0x008d, B:23:0x00b3, B:24:0x00ba, B:25:0x00d7, B:27:0x00d8, B:28:0x00df, B:29:0x00e0, B:32:0x00ea, B:34:0x00ee, B:36:0x0114, B:37:0x0139, B:40:0x0143, B:42:0x0147, B:44:0x014b, B:46:0x014f, B:48:0x0175, B:49:0x0262, B:52:0x0187, B:53:0x01a4, B:54:0x01a5, B:55:0x01ac, B:58:0x01b1, B:59:0x01b8, B:60:0x011a, B:61:0x0137, B:63:0x005c, B:64:0x0079, B:67:0x01bb, B:75:0x022d, B:78:0x0269, B:79:0x0270, B:80:0x0230, B:82:0x023e, B:83:0x024a, B:85:0x024e, B:86:0x01fb, B:88:0x0209, B:89:0x0215, B:91:0x0219, B:92:0x01bf, B:94:0x01cd, B:95:0x01d9, B:97:0x01dd), top: B:2:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArchiveInputStream(InputStream inputStream, int i8, int i9) {
        super(inputStream);
        boolean z7;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        boolean z8;
        this.crc32 = new CRC32();
        this.entries = new HashMap();
        this.bytesRead = 0;
        this.bytesReadFromCurrentSource = 0;
        try {
            parseZip(i8);
            Manifest manifest = this.manifest;
            boolean z9 = true;
            if (manifest != null) {
                if (manifest.getApplicationInfo() == null || (i9 != 0 && (i9 & 4) <= 0)) {
                    z8 = false;
                } else {
                    FileInfo applicationInfo = this.manifest.getApplicationInfo();
                    this.applicationBytes = this.entries.get(applicationInfo.getBinFileName());
                    this.applicationInitBytes = this.entries.get(applicationInfo.getDatFileName());
                    byte[] bArr5 = this.applicationBytes;
                    if (bArr5 == null) {
                        throw new IOException("Application file " + applicationInfo.getBinFileName() + " not found.");
                    }
                    this.applicationSize = bArr5.length;
                    this.currentSource = bArr5;
                    z8 = true;
                }
                if (this.manifest.getBootloaderInfo() != null && (i9 == 0 || (i9 & 2) > 0)) {
                    if (this.systemInitBytes != null) {
                        throw new IOException("Manifest: softdevice and bootloader specified. Use softdevice_bootloader instead.");
                    }
                    FileInfo bootloaderInfo = this.manifest.getBootloaderInfo();
                    this.bootloaderBytes = this.entries.get(bootloaderInfo.getBinFileName());
                    this.systemInitBytes = this.entries.get(bootloaderInfo.getDatFileName());
                    byte[] bArr6 = this.bootloaderBytes;
                    if (bArr6 == null) {
                        throw new IOException("Bootloader file " + bootloaderInfo.getBinFileName() + " not found.");
                    }
                    this.bootloaderSize = bArr6.length;
                    this.currentSource = bArr6;
                    z8 = true;
                }
                if (this.manifest.getSoftdeviceInfo() == null || (i9 != 0 && (i9 & 1) <= 0)) {
                    z9 = z8;
                } else {
                    FileInfo softdeviceInfo = this.manifest.getSoftdeviceInfo();
                    this.softDeviceBytes = this.entries.get(softdeviceInfo.getBinFileName());
                    this.systemInitBytes = this.entries.get(softdeviceInfo.getDatFileName());
                    byte[] bArr7 = this.softDeviceBytes;
                    if (bArr7 == null) {
                        throw new IOException("SoftDevice file " + softdeviceInfo.getBinFileName() + " not found.");
                    }
                    this.softDeviceSize = bArr7.length;
                    this.currentSource = bArr7;
                }
                if (this.manifest.getSoftdeviceBootloaderInfo() == null || (i9 != 0 && ((i9 & 1) <= 0 || (i9 & 2) <= 0))) {
                    if (!z9) {
                        throw new IOException("Manifest file must specify at least one file.");
                    }
                } else {
                    if (this.systemInitBytes != null) {
                        throw new IOException("Manifest: The softdevice_bootloader may not be used together with softdevice or bootloader.");
                    }
                    SoftDeviceBootloaderFileInfo softdeviceBootloaderInfo = this.manifest.getSoftdeviceBootloaderInfo();
                    this.softDeviceAndBootloaderBytes = this.entries.get(softdeviceBootloaderInfo.getBinFileName());
                    this.systemInitBytes = this.entries.get(softdeviceBootloaderInfo.getDatFileName());
                    if (this.softDeviceAndBootloaderBytes == null) {
                        throw new IOException("File " + softdeviceBootloaderInfo.getBinFileName() + " not found.");
                    }
                    this.softDeviceSize = softdeviceBootloaderInfo.getSoftdeviceSize();
                    this.bootloaderSize = softdeviceBootloaderInfo.getBootloaderSize();
                    this.currentSource = this.softDeviceAndBootloaderBytes;
                }
            } else {
                if (i9 == 0 || (i9 & 4) > 0) {
                    byte[] bArr8 = this.entries.get(APPLICATION_HEX);
                    this.applicationBytes = bArr8;
                    if (bArr8 == null) {
                        this.applicationBytes = this.entries.get(APPLICATION_BIN);
                    }
                    byte[] bArr9 = this.applicationBytes;
                    if (bArr9 != null) {
                        this.applicationSize = bArr9.length;
                        this.applicationInitBytes = this.entries.get(APPLICATION_INIT);
                        this.currentSource = this.applicationBytes;
                        z7 = true;
                        if (i9 != 0 || (i9 & 2) > 0) {
                            bArr = this.entries.get(BOOTLOADER_HEX);
                            this.bootloaderBytes = bArr;
                            if (bArr == null) {
                                this.bootloaderBytes = this.entries.get(BOOTLOADER_BIN);
                            }
                            bArr2 = this.bootloaderBytes;
                            if (bArr2 != null) {
                                this.bootloaderSize = bArr2.length;
                                this.systemInitBytes = this.entries.get(SYSTEM_INIT);
                                this.currentSource = this.bootloaderBytes;
                                z7 = true;
                            }
                        }
                        if (i9 != 0 || (i9 & 1) > 0) {
                            bArr3 = this.entries.get(SOFTDEVICE_HEX);
                            this.softDeviceBytes = bArr3;
                            if (bArr3 == null) {
                                this.softDeviceBytes = this.entries.get(SOFTDEVICE_BIN);
                            }
                            bArr4 = this.softDeviceBytes;
                            if (bArr4 != null) {
                                this.softDeviceSize = bArr4.length;
                                this.systemInitBytes = this.entries.get(SYSTEM_INIT);
                                this.currentSource = this.softDeviceBytes;
                            }
                        }
                        if (!z7) {
                            throw new IOException("The ZIP file must contain an Application, a Soft Device and/or a Bootloader.");
                        }
                    }
                }
                z7 = false;
                if (i9 != 0) {
                }
                bArr = this.entries.get(BOOTLOADER_HEX);
                this.bootloaderBytes = bArr;
                if (bArr == null) {
                }
                bArr2 = this.bootloaderBytes;
                if (bArr2 != null) {
                }
                if (i9 != 0) {
                }
                bArr3 = this.entries.get(SOFTDEVICE_HEX);
                this.softDeviceBytes = bArr3;
                if (bArr3 == null) {
                }
                bArr4 = this.softDeviceBytes;
                if (bArr4 != null) {
                }
                if (!z7) {
                }
            }
            mark(0);
            super.close();
        } catch (Throwable th) {
            super.close();
            throw th;
        }
    }

    private void parseZip(int i8) {
        byte[] bArr = new byte[1024];
        String str = null;
        while (true) {
            ZipEntry nextEntry = getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String name = nextEntry.getName();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = super.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (name.toLowerCase(Locale.US).endsWith("hex")) {
                HexInputStream hexInputStream = new HexInputStream(byteArray, i8);
                byteArray = new byte[hexInputStream.available()];
                hexInputStream.read(byteArray);
                hexInputStream.close();
            }
            if (MANIFEST.equals(name)) {
                str = new String(byteArray, l.UTF_8);
            } else {
                this.entries.put(name, byteArray);
            }
        }
        if (str != null) {
            this.manifest = ((ManifestFile) new e().a(str, ManifestFile.class)).getManifest();
        }
    }

    private byte[] startNextFile() {
        byte[] bArr;
        byte[] bArr2 = this.currentSource;
        if (bArr2 != this.softDeviceBytes || (bArr = this.bootloaderBytes) == null) {
            bArr = this.applicationBytes;
            if (bArr2 == bArr || bArr == null) {
                bArr = null;
                this.currentSource = null;
            } else {
                this.currentSource = bArr;
            }
        } else {
            this.currentSource = bArr;
        }
        this.bytesReadFromCurrentSource = 0;
        return bArr;
    }

    public int applicationImageSize() {
        return this.applicationSize;
    }

    @Override // java.util.zip.ZipInputStream, java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        byte[] bArr = this.softDeviceAndBootloaderBytes;
        return (((bArr != null && this.softDeviceSize == 0 && this.bootloaderSize == 0) ? bArr.length : this.softDeviceSize + this.bootloaderSize) + this.applicationSize) - this.bytesRead;
    }

    public int bootloaderImageSize() {
        return this.bootloaderSize;
    }

    @Override // java.util.zip.ZipInputStream, java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bootloaderBytes = null;
        this.softDeviceBytes = null;
        this.softDeviceAndBootloaderBytes = null;
        this.applicationSize = 0;
        this.bootloaderSize = 0;
        this.softDeviceSize = 0;
        this.currentSource = null;
        this.bytesReadFromCurrentSource = 0;
        this.bytesRead = 0;
        super.close();
    }

    public byte[] getApplicationInit() {
        return this.applicationInitBytes;
    }

    public int getBytesRead() {
        return this.bytesRead;
    }

    public int getContentType() {
        byte b8 = this.softDeviceAndBootloaderBytes != null ? (byte) 3 : (byte) 0;
        if (this.softDeviceSize > 0) {
            b8 = (byte) (b8 | 1);
        }
        if (this.bootloaderSize > 0) {
            b8 = (byte) (b8 | 2);
        }
        return this.applicationSize > 0 ? (byte) (b8 | 4) : b8;
    }

    public long getCrc32() {
        return this.crc32.getValue();
    }

    public byte[] getSystemInit() {
        return this.systemInitBytes;
    }

    public boolean isSecureDfuRequired() {
        Manifest manifest = this.manifest;
        return manifest != null && manifest.isSecureDfuRequired();
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i8) {
        this.markedSource = this.currentSource;
        this.bytesReadFromMarkedSource = this.bytesReadFromCurrentSource;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr) {
        byte[] bArr2 = this.currentSource;
        int length = bArr2.length;
        int i8 = this.bytesReadFromCurrentSource;
        int i9 = length - i8;
        if (bArr.length <= i9) {
            i9 = bArr.length;
        }
        System.arraycopy(bArr2, i8, bArr, 0, i9);
        this.bytesReadFromCurrentSource += i9;
        if (bArr.length > i9 && startNextFile() != null) {
            byte[] bArr3 = this.currentSource;
            int length2 = bArr3.length;
            if (bArr.length - i9 <= length2) {
                length2 = bArr.length - i9;
            }
            System.arraycopy(bArr3, 0, bArr, i9, length2);
            this.bytesReadFromCurrentSource += length2;
            i9 += length2;
        }
        this.bytesRead += i9;
        this.crc32.update(bArr, 0, i9);
        return i9;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        byte[] bArr;
        if (this.applicationBytes != null && (this.softDeviceBytes != null || this.bootloaderBytes != null || this.softDeviceAndBootloaderBytes != null)) {
            throw new UnsupportedOperationException("Application must be sent in a separate connection.");
        }
        this.currentSource = this.markedSource;
        int i8 = this.bytesReadFromMarkedSource;
        this.bytesReadFromCurrentSource = i8;
        this.bytesRead = i8;
        this.crc32.reset();
        if (this.currentSource == this.bootloaderBytes && (bArr = this.softDeviceBytes) != null) {
            this.crc32.update(bArr);
            this.bytesRead += this.softDeviceSize;
        }
        this.crc32.update(this.currentSource, 0, this.bytesReadFromCurrentSource);
    }

    public int setContentType(int i8) {
        if (this.bytesRead > 0) {
            throw new UnsupportedOperationException("Content type must not be change after reading content");
        }
        int contentType = i8 & getContentType();
        if ((contentType & 1) == 0) {
            this.softDeviceBytes = null;
            if (this.softDeviceAndBootloaderBytes != null) {
                this.softDeviceAndBootloaderBytes = null;
                this.bootloaderSize = 0;
            }
            this.softDeviceSize = 0;
        }
        if ((contentType & 2) == 0) {
            this.bootloaderBytes = null;
            if (this.softDeviceAndBootloaderBytes != null) {
                this.softDeviceAndBootloaderBytes = null;
                this.softDeviceSize = 0;
            }
            this.bootloaderSize = 0;
        }
        if ((contentType & 4) == 0) {
            this.applicationBytes = null;
            this.applicationSize = 0;
        }
        mark(0);
        return contentType;
    }

    public int softDeviceImageSize() {
        return this.softDeviceSize;
    }
}
