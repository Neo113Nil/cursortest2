package org.apache.commons.imaging.formats.psd;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserIndexed;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb;
import org.apache.commons.imaging.formats.psd.datareaders.CompressedDataReader;
import org.apache.commons.imaging.formats.psd.datareaders.DataReader;
import org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader;

/* loaded from: classes9.dex */
public class PsdImageParser extends ImageParser implements XmpEmbeddable {
    public static final String BLOCK_NAME_XMP = "XMP";
    private static final int COLOR_MODE_INDEXED = 2;
    public static final int IMAGE_RESOURCE_ID_ICC_PROFILE = 1039;
    public static final int IMAGE_RESOURCE_ID_XMP = 1060;
    private static final int PSD_HEADER_LENGTH = 26;
    private static final int PSD_SECTION_COLOR_MODE = 1;
    private static final int PSD_SECTION_HEADER = 0;
    private static final int PSD_SECTION_IMAGE_DATA = 4;
    private static final int PSD_SECTION_IMAGE_RESOURCES = 2;
    private static final int PSD_SECTION_LAYER_AND_MASK_DATA = 3;
    private static final String DEFAULT_EXTENSION = ".psd";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    public PsdImageParser() {
        super.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    private int getChannelsPerMode(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        if (i != 3) {
            return (i == 4 || i == 9) ? 4 : -1;
        }
        return 3;
    }

    private byte[] getData(ByteSource byteSource, int i) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            if (i == 0) {
                byte[] readBytes = BinaryFunctions.readBytes("Header", inputStream, 26, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes;
            }
            BinaryFunctions.skipBytes(inputStream, 26L);
            int read4Bytes = BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 1) {
                byte[] readBytes2 = BinaryFunctions.readBytes("ColorModeData", inputStream, read4Bytes, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes2;
            }
            BinaryFunctions.skipBytes(inputStream, read4Bytes);
            int read4Bytes2 = BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 2) {
                byte[] readBytes3 = BinaryFunctions.readBytes("ImageResources", inputStream, read4Bytes2, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes3;
            }
            BinaryFunctions.skipBytes(inputStream, read4Bytes2);
            int read4Bytes3 = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i == 3) {
                byte[] readBytes4 = BinaryFunctions.readBytes("LayerAndMaskData", inputStream, read4Bytes3, "Not a Valid PSD File");
                if (inputStream != null) {
                    inputStream.close();
                }
                return readBytes4;
            }
            BinaryFunctions.skipBytes(inputStream, read4Bytes3);
            BinaryFunctions.read2Bytes("Compression", inputStream, "Not a Valid PSD File", getByteOrder());
            if (inputStream != null) {
                inputStream.close();
            }
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "getInputStream: Unknown Section: "));
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

    private InputStream getInputStream(ByteSource byteSource, int i) {
        InputStream inputStream = byteSource.getInputStream();
        if (i != 0) {
            BinaryFunctions.skipBytes(inputStream, 26L);
            int read4Bytes = BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
            if (i != 1) {
                BinaryFunctions.skipBytes(inputStream, read4Bytes);
                int read4Bytes2 = BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
                if (i != 2) {
                    BinaryFunctions.skipBytes(inputStream, read4Bytes2);
                    int read4Bytes3 = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
                    if (i != 3) {
                        BinaryFunctions.skipBytes(inputStream, read4Bytes3);
                        BinaryFunctions.read2Bytes("Compression", inputStream, "Not a Valid PSD File", getByteOrder());
                        if (i != 4) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "getInputStream: Unknown Section: "));
                        }
                    }
                }
            }
        }
        return inputStream;
    }

    private boolean keepImageResourceBlock(int i, int[] iArr) {
        if (iArr == null) {
            return true;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private PsdHeaderInfo readHeader(InputStream inputStream) {
        BinaryFunctions.readAndVerifyBytes(inputStream, new byte[]{56, 66, PnmConstants.PNM_PREFIX_BYTE, 83}, "Not a Valid PSD File");
        return new PsdHeaderInfo(BinaryFunctions.read2Bytes("Version", inputStream, "Not a Valid PSD File", getByteOrder()), BinaryFunctions.readBytes("Reserved", inputStream, 6, "Not a Valid PSD File"), BinaryFunctions.read2Bytes("Channels", inputStream, "Not a Valid PSD File", getByteOrder()), BinaryFunctions.read4Bytes("Rows", inputStream, "Not a Valid PSD File", getByteOrder()), BinaryFunctions.read4Bytes("Columns", inputStream, "Not a Valid PSD File", getByteOrder()), BinaryFunctions.read2Bytes("Depth", inputStream, "Not a Valid PSD File", getByteOrder()), BinaryFunctions.read2Bytes("Mode", inputStream, "Not a Valid PSD File", getByteOrder()));
    }

    private PsdImageContents readImageContents(InputStream inputStream) {
        PsdHeaderInfo readHeader = readHeader(inputStream);
        int read4Bytes = BinaryFunctions.read4Bytes("ColorModeDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(inputStream, read4Bytes);
        int read4Bytes2 = BinaryFunctions.read4Bytes("ImageResourcesLength", inputStream, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(inputStream, read4Bytes2);
        int read4Bytes3 = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", inputStream, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(inputStream, read4Bytes3);
        return new PsdImageContents(readHeader, read4Bytes, read4Bytes2, read4Bytes3, BinaryFunctions.read2Bytes("Compression", inputStream, "Not a Valid PSD File", getByteOrder()));
    }

    private List<ImageResourceBlock> readImageResourceBlocks(InputStream inputStream, int[] iArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            BinaryFunctions.readAndVerifyBytes(inputStream, new byte[]{56, 66, 73, 77}, "Not a Valid PSD File");
            int read2Bytes = BinaryFunctions.read2Bytes("ID", inputStream, "Not a Valid PSD File", getByteOrder());
            byte readByte = BinaryFunctions.readByte("NameLength", inputStream, "Not a Valid PSD File");
            byte[] readBytes = BinaryFunctions.readBytes("NameData", inputStream, readByte, "Not a Valid PSD File");
            int i3 = (i2 - 7) - readByte;
            if ((readByte + 1) % 2 != 0) {
                BinaryFunctions.readByte("NameDiscard", inputStream, "Not a Valid PSD File");
                i3--;
            }
            int read4Bytes = BinaryFunctions.read4Bytes("Size", inputStream, "Not a Valid PSD File", getByteOrder());
            byte[] readBytes2 = BinaryFunctions.readBytes("Data", inputStream, read4Bytes, "Not a Valid PSD File");
            i2 = (i3 - 4) - read4Bytes;
            if (read4Bytes % 2 != 0) {
                BinaryFunctions.readByte("DataDiscard", inputStream, "Not a Valid PSD File");
                i2--;
            }
            if (keepImageResourceBlock(read2Bytes, iArr)) {
                arrayList.add(new ImageResourceBlock(read2Bytes, readBytes, readBytes2));
                if (i >= 0 && arrayList.size() >= i) {
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        printWriter.println("gif.dumpImageFile");
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        PsdImageContents readImageContents = readImageContents(byteSource);
        readImageContents.dump(printWriter);
        readImageContents.header.dump(printWriter);
        List<ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, (int[]) null, -1);
        printWriter.println("blocks.size(): " + readImageResourceBlocks.size());
        for (int i = 0; i < readImageResourceBlocks.size(); i++) {
            ImageResourceBlock imageResourceBlock = readImageResourceBlocks.get(i);
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "\t", " (");
            m2m.append(Integer.toHexString(imageResourceBlock.id));
            m2m.append(", '");
            m2m.append(new String(imageResourceBlock.nameData, StandardCharsets.ISO_8859_1));
            m2m.append("' (");
            m2m.append(imageResourceBlock.nameData.length);
            m2m.append("),  data: ");
            m2m.append(imageResourceBlock.data.length);
            m2m.append(" type: '");
            m2m.append(ImageResourceType.getDescription(imageResourceBlock.id));
            m2m.append("' )");
            printWriter.println(m2m.toString());
        }
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return (String[]) ACCEPTED_EXTENSIONS.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.PSD};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        DataParser dataParserBitmap;
        DataReader uncompressedDataReader;
        PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read blocks");
            return null;
        }
        PsdHeaderInfo psdHeaderInfo = readImageContents.header;
        if (psdHeaderInfo == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read Header");
            return null;
        }
        readImageResourceBlocks(byteSource, (int[]) null, -1);
        BufferedImage colorBufferedImage = getBufferedImageFactory(map).getColorBufferedImage(psdHeaderInfo.columns, psdHeaderInfo.rows, false);
        int i = readImageContents.header.mode;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    dataParserBitmap = new DataParserIndexed(getData(byteSource, 1));
                } else if (i == 3) {
                    dataParserBitmap = new DataParserRgb();
                } else if (i == 4) {
                    dataParserBitmap = new DataParserCmyk();
                } else if (i != 8) {
                    if (i != 9) {
                        throw new ImageReadException("Unknown Mode: " + readImageContents.header.mode);
                    }
                    dataParserBitmap = new DataParserLab();
                }
            }
            dataParserBitmap = new DataParserGrayscale();
        } else {
            dataParserBitmap = new DataParserBitmap();
        }
        int i2 = readImageContents.Compression;
        if (i2 == 0) {
            uncompressedDataReader = new UncompressedDataReader(dataParserBitmap);
        } else {
            if (i2 != 1) {
                throw new ImageReadException("Unknown Compression: " + readImageContents.Compression);
            }
            uncompressedDataReader = new CompressedDataReader(dataParserBitmap);
        }
        InputStream inputStream = getInputStream(byteSource, 4);
        try {
            uncompressedDataReader.readData(inputStream, colorBufferedImage, readImageContents, this);
            if (inputStream != null) {
                inputStream.close();
            }
            return colorBufferedImage;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        byte[] bArr;
        List<ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, new int[]{1039}, 1);
        if (readImageResourceBlocks == null || readImageResourceBlocks.isEmpty() || (bArr = readImageResourceBlocks.get(0).data) == null || bArr.length < 1) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read blocks");
            return null;
        }
        PsdHeaderInfo psdHeaderInfo = readImageContents.header;
        if (psdHeaderInfo == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read Header");
            return null;
        }
        int i = psdHeaderInfo.columns;
        int i2 = psdHeaderInfo.rows;
        ArrayList arrayList = new ArrayList();
        int channelsPerMode = psdHeaderInfo.depth * getChannelsPerMode(psdHeaderInfo.mode);
        int i3 = channelsPerMode < 0 ? 0 : channelsPerMode;
        ImageFormats imageFormats = ImageFormats.PSD;
        float f = (float) (i / 72.0d);
        float f2 = (float) (i2 / 72.0d);
        boolean z = psdHeaderInfo.mode == 2;
        ImageInfo.ColorType colorType = ImageInfo.ColorType.UNKNOWN;
        int i4 = readImageContents.Compression;
        return new ImageInfo("Psd", i3, arrayList, imageFormats, "Photoshop", i2, "image/x-photoshop", -1, 72, f2, 72, f, i, false, false, z, colorType, i4 != 0 ? i4 != 1 ? ImageInfo.CompressionAlgorithm.UNKNOWN : ImageInfo.CompressionAlgorithm.PSD : ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        PsdHeaderInfo readHeader = readHeader(byteSource);
        if (readHeader != null) {
            return new Dimension(readHeader.columns, readHeader.rows);
        }
        f$$ExternalSyntheticLambda0.m("PSD: couldn't read header");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "PSD-Custom";
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        PsdImageContents readImageContents = readImageContents(byteSource);
        if (readImageContents == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read blocks");
            return null;
        }
        if (readImageContents.header == null) {
            f$$ExternalSyntheticLambda0.m("PSD: Couldn't read Header");
            return null;
        }
        List<ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(byteSource, new int[]{1060}, -1);
        if (readImageResourceBlocks != null && !readImageResourceBlocks.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(readImageResourceBlocks);
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() <= 1) {
                byte[] bArr = ((ImageResourceBlock) arrayList.get(0)).data;
                return new String(bArr, 0, bArr.length, StandardCharsets.UTF_8);
            }
            f$$ExternalSyntheticLambda0.m("PSD contains more than one XMP block.");
        }
        return null;
    }

    private PsdImageContents readImageContents(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            PsdImageContents readImageContents = readImageContents(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImageContents;
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

    private PsdHeaderInfo readHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            PsdHeaderInfo readHeader = readHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readHeader;
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

    private List<ImageResourceBlock> readImageResourceBlocks(byte[] bArr, int[] iArr, int i) {
        return readImageResourceBlocks(new ByteArrayInputStream(bArr), iArr, i, bArr.length);
    }

    private List<ImageResourceBlock> readImageResourceBlocks(ByteSource byteSource, int[] iArr, int i) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            InputStream inputStream2 = getInputStream(byteSource, 2);
            try {
                List<ImageResourceBlock> readImageResourceBlocks = readImageResourceBlocks(BinaryFunctions.readBytes("ImageResources", inputStream2, readImageContents(inputStream).ImageResourcesLength, "Not a Valid PSD File"), iArr, i);
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return readImageResourceBlocks;
            } finally {
            }
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
}
