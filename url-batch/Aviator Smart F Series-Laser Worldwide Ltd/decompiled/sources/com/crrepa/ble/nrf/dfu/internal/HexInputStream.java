package com.crrepa.ble.nrf.dfu.internal;

import com.crrepa.ble.nrf.dfu.internal.exception.HexFileValidationException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class HexInputStream extends FilterInputStream {
    private final int LINE_LENGTH;
    private final int MBRSize;
    private int available;
    private int bytesRead;
    private int lastAddress;
    private final byte[] localBuf;
    private int localPos;
    private int pos;
    private int size;

    public HexInputStream(InputStream inputStream, int i8) {
        super(new BufferedInputStream(inputStream));
        this.LINE_LENGTH = 128;
        this.localBuf = new byte[128];
        this.localPos = 128;
        this.size = 128;
        this.lastAddress = 0;
        this.MBRSize = i8;
        this.available = calculateBinSize(i8);
    }

    private int asciiToInt(int i8) {
        if (i8 >= 65) {
            return i8 - 55;
        }
        if (i8 >= 48) {
            return i8 - 48;
        }
        return -1;
    }

    private int calculateBinSize(int i8) {
        InputStream inputStream = ((FilterInputStream) this).in;
        inputStream.mark(inputStream.available());
        try {
            int read = inputStream.read();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                checkComma(read);
                int readByte = readByte(inputStream);
                int readAddress = readAddress(inputStream);
                int readByte2 = readByte(inputStream);
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        inputStream.reset();
                        return i10;
                    }
                    if (readByte2 == 2) {
                        int readAddress2 = readAddress(inputStream) << 4;
                        if (i10 > 0 && (readAddress2 >> 16) != (i9 >> 16) + 1) {
                            inputStream.reset();
                            return i10;
                        }
                        skip(inputStream, 2L);
                        i9 = readAddress2;
                    } else if (readByte2 == 4) {
                        int readAddress3 = readAddress(inputStream);
                        if (i10 > 0 && readAddress3 != (i9 >> 16) + 1) {
                            inputStream.reset();
                            return i10;
                        }
                        i9 = readAddress3 << 16;
                        skip(inputStream, 2L);
                    }
                    while (true) {
                        read = inputStream.read();
                        if (read != 10 || read == 13) {
                        }
                    }
                } else if (readAddress + i9 >= i8) {
                    i10 += readByte;
                }
                skip(inputStream, (readByte * 2) + 2);
                while (true) {
                    read = inputStream.read();
                    if (read != 10) {
                    }
                }
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    private void checkComma(int i8) {
        if (i8 != 58) {
            throw new HexFileValidationException("Not a HEX file");
        }
    }

    private int readAddress(InputStream inputStream) {
        return readByte(inputStream) | (readByte(inputStream) << 8);
    }

    private int readByte(InputStream inputStream) {
        return asciiToInt(inputStream.read()) | (asciiToInt(inputStream.read()) << 4);
    }

    private int readLine() {
        int readAddress;
        int i8;
        if (this.pos == -1) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        while (true) {
            int read = inputStream.read();
            this.pos++;
            if (read != 10 && read != 13) {
                checkComma(read);
                int readByte = readByte(inputStream);
                this.pos += 2;
                int readAddress2 = readAddress(inputStream);
                this.pos += 4;
                int readByte2 = readByte(inputStream);
                int i9 = this.pos + 2;
                this.pos = i9;
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        this.pos = -1;
                        return 0;
                    }
                    if (readByte2 == 2) {
                        readAddress = readAddress(inputStream) << 4;
                        i8 = this.pos + 4;
                        this.pos = i8;
                        if (this.bytesRead > 0 && (readAddress >> 16) != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                    } else if (readByte2 != 4) {
                        this.pos = (int) (i9 + skip(inputStream, (readByte * 2) + 2));
                    } else {
                        int readAddress3 = readAddress(inputStream);
                        i8 = this.pos + 4;
                        this.pos = i8;
                        if (this.bytesRead > 0 && readAddress3 != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        readAddress = readAddress3 << 16;
                    }
                    this.lastAddress = readAddress;
                    this.pos = (int) (i8 + skip(inputStream, 2L));
                } else if (this.lastAddress + readAddress2 < this.MBRSize) {
                    this.pos = (int) (i9 + skip(inputStream, (readByte * 2) + 2));
                }
                if (readByte2 == 0) {
                    for (int i10 = 0; i10 < this.localBuf.length && i10 < readByte; i10++) {
                        int readByte3 = readByte(inputStream);
                        this.pos += 2;
                        this.localBuf[i10] = (byte) readByte3;
                    }
                    this.pos = (int) (this.pos + skip(inputStream, 2L));
                    this.localPos = 0;
                    return readByte;
                }
            }
        }
    }

    private long skip(InputStream inputStream, long j8) {
        long skip = inputStream.skip(j8);
        return skip < j8 ? skip + inputStream.skip(j8 - skip) : skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.available - this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }

    public int readPacket(byte[] bArr) {
        int i8 = 0;
        while (i8 < bArr.length) {
            int i9 = this.localPos;
            if (i9 < this.size) {
                byte[] bArr2 = this.localBuf;
                this.localPos = i9 + 1;
                bArr[i8] = bArr2[i9];
                i8++;
            } else {
                int i10 = this.bytesRead;
                int readLine = readLine();
                this.size = readLine;
                this.bytesRead = i10 + readLine;
                if (readLine == 0) {
                    break;
                }
            }
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.pos = 0;
        this.bytesRead = 0;
        this.localPos = 0;
    }

    public int sizeInBytes() {
        return this.available;
    }

    public int sizeInPackets(int i8) {
        int sizeInBytes = sizeInBytes();
        return (sizeInBytes / i8) + (sizeInBytes % i8 > 0 ? 1 : 0);
    }

    public HexInputStream(byte[] bArr, int i8) {
        super(new ByteArrayInputStream(bArr));
        this.LINE_LENGTH = 128;
        this.localBuf = new byte[128];
        this.localPos = 128;
        this.size = 128;
        this.lastAddress = 0;
        this.MBRSize = i8;
        this.available = calculateBinSize(i8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return readPacket(bArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        throw new UnsupportedOperationException("Please, use readPacket() method instead");
    }
}
