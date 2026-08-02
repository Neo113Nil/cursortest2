package org.apache.commons.imaging.formats.gif;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;

/* loaded from: classes9.dex */
public class GifImageParser extends ImageParser implements XmpEmbeddable {
    private static final int APPLICATION_EXTENSION_LABEL = 255;
    private static final int COMMENT_EXTENSION = 254;
    private static final int EXTENSION_CODE = 33;
    private static final int GRAPHIC_CONTROL_EXTENSION = 8697;
    private static final int IMAGE_SEPARATOR = 44;
    private static final int INTERLACE_FLAG_MASK = 64;
    private static final int LOCAL_COLOR_TABLE_FLAG_MASK = 128;
    private static final int PLAIN_TEXT_EXTENSION = 1;
    private static final int SORT_FLAG_MASK = 32;
    private static final int TERMINATOR_BYTE = 59;
    private static final int XMP_COMPLETE_CODE = 8703;
    private static final int XMP_EXTENSION = 255;
    private static final Logger LOGGER = Logger.getLogger(GifImageParser.class.getName());
    private static final String DEFAULT_EXTENSION = ".gif";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final byte[] GIF_HEADER_SIGNATURE = {71, 73, 70};
    private static final byte[] XMP_APPLICATION_ID_AND_AUTH_CODE = {88, 77, PnmConstants.PNM_PREFIX_BYTE, PnmConstants.PNM_SEPARATOR, 68, 97, 116, 97, 88, 77, PnmConstants.PNM_PREFIX_BYTE};

    public GifImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    private int convertColorTableSize(int i) {
        return simplePow(2, i + 1) * 3;
    }

    public static DisposalMethod createDisposalMethodFromIntValue(int i) {
        switch (i) {
            case 0:
                return DisposalMethod.UNSPECIFIED;
            case 1:
                return DisposalMethod.DO_NOT_DISPOSE;
            case 2:
                return DisposalMethod.RESTORE_TO_BACKGROUND;
            case 3:
                return DisposalMethod.RESTORE_TO_PREVIOUS;
            case 4:
                return DisposalMethod.TO_BE_DEFINED_1;
            case 5:
                return DisposalMethod.TO_BE_DEFINED_2;
            case 6:
                return DisposalMethod.TO_BE_DEFINED_3;
            case 7:
                return DisposalMethod.TO_BE_DEFINED_4;
            default:
                f$$ExternalSyntheticLambda0.m("GIF: Invalid parsing of disposal method");
                return null;
        }
    }

    private <T extends GifBlock> List<T> findAllBlocks(List<GifBlock> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (GifBlock gifBlock : list) {
            if (gifBlock.blockCode == i) {
                arrayList.add(gifBlock);
            }
        }
        return arrayList;
    }

    private List<GifImageData> findAllImageData(GifImageContents gifImageContents) {
        List findAllBlocks = findAllBlocks(gifImageContents.blocks, 44);
        if (findAllBlocks.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Image Descriptor");
            return null;
        }
        List findAllBlocks2 = findAllBlocks(gifImageContents.blocks, GRAPHIC_CONTROL_EXTENSION);
        if (!findAllBlocks2.isEmpty() && findAllBlocks2.size() != findAllBlocks.size()) {
            f$$ExternalSyntheticLambda0.m("GIF: Invalid amount of Graphic Control Extensions");
            return null;
        }
        ArrayList arrayList = new ArrayList(findAllBlocks.size());
        for (int i = 0; i < findAllBlocks.size(); i++) {
            ImageDescriptor imageDescriptor = (ImageDescriptor) findAllBlocks.get(i);
            if (imageDescriptor == null) {
                throw new ImageReadException(String.format("GIF: Couldn't read Image Descriptor of image number %d", Integer.valueOf(i)));
            }
            arrayList.add(new GifImageData(imageDescriptor, findAllBlocks2.isEmpty() ? null : (GraphicControlExtension) findAllBlocks2.get(i)));
        }
        return arrayList;
    }

    private GifBlock findBlock(List<GifBlock> list, int i) {
        for (GifBlock gifBlock : list) {
            if (gifBlock.blockCode == i) {
                return gifBlock;
            }
        }
        return null;
    }

    private GifImageData findFirstImageData(GifImageContents gifImageContents) {
        ImageDescriptor imageDescriptor = (ImageDescriptor) findBlock(gifImageContents.blocks, 44);
        if (imageDescriptor != null) {
            return new GifImageData(imageDescriptor, (GraphicControlExtension) findBlock(gifImageContents.blocks, GRAPHIC_CONTROL_EXTENSION));
        }
        f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Image Descriptor");
        return null;
    }

    private BufferedImage getBufferedImage(GifHeaderInfo gifHeaderInfo, GifImageData gifImageData, byte[] bArr) {
        int[] colorTable;
        int i;
        ImageDescriptor imageDescriptor = gifImageData.descriptor;
        GraphicControlExtension graphicControlExtension = gifImageData.gce;
        int i2 = imageDescriptor.imageWidth;
        int i3 = imageDescriptor.imageHeight;
        int i4 = 1;
        boolean z = graphicControlExtension != null && graphicControlExtension.transparency;
        ImageBuilder imageBuilder = new ImageBuilder(i2, i3, z);
        byte[] bArr2 = imageDescriptor.localColorTable;
        if (bArr2 != null) {
            colorTable = getColorTable(bArr2);
        } else {
            if (bArr == null) {
                f$$ExternalSyntheticLambda0.m("Gif: No Color Table");
                return null;
            }
            colorTable = getColorTable(bArr);
        }
        int i5 = (graphicControlExtension == null || !z) ? -1 : graphicControlExtension.transparentColorIndex;
        int i6 = (i3 + 7) / 8;
        int i7 = (i3 + 3) / 8;
        int i8 = (i3 + 1) / 4;
        int i9 = i3 / 2;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i3) {
            if (!imageDescriptor.interlaceFlag) {
                i = i10;
            } else if (i10 < i6) {
                i = i10 * 8;
            } else {
                int i12 = i10 - i6;
                if (i12 < i7) {
                    i = (i12 * 8) + 4;
                } else {
                    int i13 = i12 - i7;
                    if (i13 < i8) {
                        i = (i13 * 4) + 2;
                    } else {
                        int i14 = i13 - i8;
                        if (i14 >= i9) {
                            f$$ExternalSyntheticLambda0.m("Gif: Strange Row");
                            return null;
                        }
                        i = (i14 * 2) + i4;
                    }
                }
            }
            int i15 = 0;
            while (i15 < i2) {
                int i16 = i11 + 1;
                int i17 = imageDescriptor.imageData[i11] & 255;
                int i18 = colorTable[i17];
                if (i5 == i17) {
                    i18 = 0;
                }
                imageBuilder.setRGB(i15, i, i18);
                i15++;
                i11 = i16;
            }
            i10++;
            i4 = 1;
        }
        return imageBuilder.getBufferedImage();
    }

    private int[] getColorTable(byte[] bArr) {
        if (bArr.length % 3 != 0) {
            throw new ImageReadException("Bad Color Table Length: " + bArr.length);
        }
        int length = bArr.length / 3;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            iArr[i] = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | (-16777216) | ((bArr[i2 + 1] & 255) << 8);
        }
        return iArr;
    }

    private List<String> getComments(List<GifBlock> list) {
        ArrayList arrayList = new ArrayList();
        for (GifBlock gifBlock : list) {
            if (gifBlock.blockCode == 8702) {
                arrayList.add(new String(((GenericGifBlock) gifBlock).appendSubBlocks(), StandardCharsets.US_ASCII));
            }
        }
        return arrayList;
    }

    private List<GifBlock> readBlocks(GifHeaderInfo gifHeaderInfo, InputStream inputStream, boolean z, FormatCompliance formatCompliance) {
        GifImageParser gifImageParser;
        GifHeaderInfo gifHeaderInfo2;
        InputStream inputStream2;
        boolean z2;
        FormatCompliance formatCompliance2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                f$$ExternalSyntheticLambda0.m("GIF: unexpected end of data");
                return null;
            }
            if (read == 0) {
                gifImageParser = this;
                gifHeaderInfo2 = gifHeaderInfo;
                inputStream2 = inputStream;
                z2 = z;
                formatCompliance2 = formatCompliance;
            } else if (read == 33) {
                gifImageParser = this;
                gifHeaderInfo2 = gifHeaderInfo;
                inputStream2 = inputStream;
                z2 = z;
                formatCompliance2 = formatCompliance;
                int read2 = inputStream2.read();
                int i = ((read & 255) << 8) | (read2 & 255);
                if (read2 != 1) {
                    if (read2 == 249) {
                        arrayList.add(gifImageParser.readGraphicControlExtension(i, inputStream2));
                    } else if (read2 != 254) {
                        if (read2 != 255) {
                            if (formatCompliance2 != null) {
                                formatCompliance2.addComment("Unknown block", i);
                            }
                            arrayList.add(gifImageParser.readGenericGIFBlock(inputStream2, i));
                        } else {
                            byte[] readSubBlock = gifImageParser.readSubBlock(inputStream2);
                            if (formatCompliance2 != null) {
                                formatCompliance2.addComment("Unknown Application Extension (" + new String(readSubBlock, StandardCharsets.US_ASCII) + ")", i);
                            }
                            if (readSubBlock != null && readSubBlock.length > 0) {
                                arrayList.add(gifImageParser.readGenericGIFBlock(inputStream2, i, readSubBlock));
                            }
                        }
                    }
                }
                arrayList.add(gifImageParser.readGenericGIFBlock(inputStream2, i));
            } else {
                if (read != 44) {
                    if (read == 59) {
                        return arrayList;
                    }
                    throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read, "GIF: unknown code: "));
                }
                gifImageParser = this;
                gifHeaderInfo2 = gifHeaderInfo;
                inputStream2 = inputStream;
                z2 = z;
                formatCompliance2 = formatCompliance;
                arrayList.add(gifImageParser.readImageDescriptor(gifHeaderInfo2, read, inputStream2, z2, formatCompliance2));
            }
            this = gifImageParser;
            gifHeaderInfo = gifHeaderInfo2;
            inputStream = inputStream2;
            z = z2;
            formatCompliance = formatCompliance2;
        }
    }

    private byte[] readColorTable(InputStream inputStream, int i) {
        return BinaryFunctions.readBytes("block", inputStream, convertColorTableSize(i), "GIF: corrupt Color Table");
    }

    private GifImageContents readFile(ByteSource byteSource, boolean z, FormatCompliance formatCompliance) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            GifHeaderInfo readHeader = readHeader(inputStream, formatCompliance);
            GifImageContents gifImageContents = new GifImageContents(readHeader, readHeader.globalColorTableFlag ? readColorTable(inputStream, readHeader.sizeOfGlobalColorTable) : null, readBlocks(readHeader, inputStream, z, formatCompliance));
            if (inputStream != null) {
                inputStream.close();
            }
            return gifImageContents;
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

    private GenericGifBlock readGenericGIFBlock(InputStream inputStream, int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            arrayList.add(bArr);
        }
        while (true) {
            byte[] readSubBlock = readSubBlock(inputStream);
            if (readSubBlock.length < 1) {
                return new GenericGifBlock(i, arrayList);
            }
            arrayList.add(readSubBlock);
        }
    }

    private GraphicControlExtension readGraphicControlExtension(int i, InputStream inputStream) {
        BinaryFunctions.readByte("block_size", inputStream, "GIF: corrupt GraphicControlExt");
        byte readByte = BinaryFunctions.readByte("packed fields", inputStream, "GIF: corrupt GraphicControlExt");
        int i2 = (readByte & 28) >> 2;
        boolean z = (readByte & 1) != 0;
        int read2Bytes = BinaryFunctions.read2Bytes("delay in milliseconds", inputStream, "GIF: corrupt GraphicControlExt", getByteOrder());
        int readByte2 = BinaryFunctions.readByte("transparent color index", inputStream, "GIF: corrupt GraphicControlExt") & 255;
        BinaryFunctions.readByte("block terminator", inputStream, "GIF: corrupt GraphicControlExt");
        return new GraphicControlExtension(i, readByte, i2, z, read2Bytes, readByte2);
    }

    private GifHeaderInfo readHeader(InputStream inputStream, FormatCompliance formatCompliance) {
        byte b;
        byte b2;
        byte b3;
        byte readByte = BinaryFunctions.readByte("identifier1", inputStream, "Not a Valid GIF File");
        byte readByte2 = BinaryFunctions.readByte("identifier2", inputStream, "Not a Valid GIF File");
        byte readByte3 = BinaryFunctions.readByte("identifier3", inputStream, "Not a Valid GIF File");
        byte readByte4 = BinaryFunctions.readByte("version1", inputStream, "Not a Valid GIF File");
        byte readByte5 = BinaryFunctions.readByte("version2", inputStream, "Not a Valid GIF File");
        byte readByte6 = BinaryFunctions.readByte("version3", inputStream, "Not a Valid GIF File");
        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", GIF_HEADER_SIGNATURE, new byte[]{readByte, readByte2, readByte3});
            formatCompliance.compare("version", 56, readByte4);
            formatCompliance.compare("version", new int[]{55, 57}, readByte5);
            formatCompliance.compare("version", 97, readByte6);
        }
        Logger logger = LOGGER;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            BinaryFunctions.printCharQuad("identifier: ", (readByte << 16) | (readByte2 << 8) | readByte3);
            BinaryFunctions.printCharQuad("version: ", (readByte4 << 16) | (readByte5 << 8) | readByte6);
        }
        int read2Bytes = BinaryFunctions.read2Bytes("Logical Screen Width", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes2 = BinaryFunctions.read2Bytes("Logical Screen Height", inputStream, "Not a Valid GIF File", getByteOrder());
        if (formatCompliance != null) {
            formatCompliance.checkBounds("Width", 1, Integer.MAX_VALUE, read2Bytes);
            formatCompliance.checkBounds("Height", 1, Integer.MAX_VALUE, read2Bytes2);
        }
        byte readByte7 = BinaryFunctions.readByte("Packed Fields", inputStream, "Not a Valid GIF File");
        byte readByte8 = BinaryFunctions.readByte("Background Color Index", inputStream, "Not a Valid GIF File");
        byte readByte9 = BinaryFunctions.readByte("Pixel Aspect Ratio", inputStream, "Not a Valid GIF File");
        if (logger.isLoggable(level)) {
            BinaryFunctions.printByteBits("PackedFields bits", readByte7);
        }
        boolean z = (readByte7 & 128) > 0;
        if (logger.isLoggable(level)) {
            b = readByte9;
            logger.finest("GlobalColorTableFlag: " + z);
        } else {
            b = readByte9;
        }
        byte b4 = (byte) ((readByte7 >> 4) & 7);
        if (logger.isLoggable(level)) {
            b2 = readByte7;
            logger.finest("ColorResolution: " + ((int) b4));
        } else {
            b2 = readByte7;
        }
        boolean z2 = (b2 & 8) > 0;
        if (logger.isLoggable(level)) {
            b3 = b4;
            logger.finest("SortFlag: " + z2);
        } else {
            b3 = b4;
        }
        byte b5 = (byte) (b2 & 7);
        if (logger.isLoggable(level)) {
            logger.finest("SizeofGlobalColorTable: " + ((int) b5));
        }
        if (formatCompliance != null && z && readByte8 != -1) {
            formatCompliance.checkBounds("Background Color Index", 0, convertColorTableSize(b5), readByte8);
        }
        return new GifHeaderInfo(readByte, readByte2, readByte3, readByte4, readByte5, readByte6, read2Bytes, read2Bytes2, b2, readByte8, b, z, b3, z2, b5);
    }

    private ImageDescriptor readImageDescriptor(GifHeaderInfo gifHeaderInfo, int i, InputStream inputStream, boolean z, FormatCompliance formatCompliance) {
        byte[] bArr;
        int read2Bytes = BinaryFunctions.read2Bytes("Image Left Position", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes2 = BinaryFunctions.read2Bytes("Image Top Position", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes3 = BinaryFunctions.read2Bytes("Image Width", inputStream, "Not a Valid GIF File", getByteOrder());
        int read2Bytes4 = BinaryFunctions.read2Bytes("Image Height", inputStream, "Not a Valid GIF File", getByteOrder());
        byte readByte = BinaryFunctions.readByte("Packed Fields", inputStream, "Not a Valid GIF File");
        if (formatCompliance != null) {
            formatCompliance.checkBounds("Width", 1, gifHeaderInfo.logicalScreenWidth, read2Bytes3);
            formatCompliance.checkBounds("Height", 1, gifHeaderInfo.logicalScreenHeight, read2Bytes4);
            formatCompliance.checkBounds("Left Position", 0, gifHeaderInfo.logicalScreenWidth - read2Bytes3, read2Bytes);
            formatCompliance.checkBounds("Top Position", 0, gifHeaderInfo.logicalScreenHeight - read2Bytes4, read2Bytes2);
        }
        Logger logger = LOGGER;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            BinaryFunctions.printByteBits("PackedFields bits", readByte);
        }
        boolean z2 = ((readByte >> 7) & 1) > 0;
        if (logger.isLoggable(level)) {
            logger.finest("LocalColorTableFlag: " + z2);
        }
        boolean z3 = ((readByte >> 6) & 1) > 0;
        if (logger.isLoggable(level)) {
            logger.finest("Interlace Flag: " + z3);
        }
        boolean z4 = ((readByte >> 5) & 1) > 0;
        if (logger.isLoggable(level)) {
            logger.finest("Sort Flag: " + z4);
        }
        byte b = (byte) (readByte & 7);
        if (logger.isLoggable(level)) {
            logger.finest("SizeofLocalColorTable: " + ((int) b));
        }
        byte[] readColorTable = z2 ? readColorTable(inputStream, b) : null;
        if (z) {
            int read = inputStream.read();
            if (logger.isLoggable(level)) {
                logger.finest("LZWMinimumCodeSize: " + read);
            }
            readGenericGIFBlock(inputStream, -1);
            bArr = null;
        } else {
            bArr = new MyLzwDecompressor(inputStream.read(), ByteOrder.LITTLE_ENDIAN).decompress(new ByteArrayInputStream(readGenericGIFBlock(inputStream, -1).appendSubBlocks()), read2Bytes3 * read2Bytes4);
        }
        return new ImageDescriptor(i, read2Bytes, read2Bytes2, read2Bytes3, read2Bytes4, readByte, z2, z3, z4, b, readColorTable, bArr);
    }

    private byte[] readSubBlock(InputStream inputStream) {
        return BinaryFunctions.readBytes("block", inputStream, BinaryFunctions.readByte("block_size", inputStream, "GIF: corrupt block") & 255, "GIF: corrupt block");
    }

    private int simplePow(int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 *= i;
        }
        return i3;
    }

    private void writeAsSubBlocks(OutputStream outputStream, byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int min = Math.min(bArr.length - i, 255);
            outputStream.write(min);
            outputStream.write(bArr, i, min);
            i += min;
        }
        outputStream.write(0);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        printWriter.println("gif.dumpImageFile");
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        GifImageContents readFile = readFile(byteSource, false);
        printWriter.println("gif.blocks: " + readFile.blocks.size());
        for (int i = 0; i < readFile.blocks.size(); i++) {
            GifBlock gifBlock = readFile.blocks.get(i);
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "\t", " (");
            m2m.append(gifBlock.getClass().getName());
            m2m.append(")");
            debugNumber(printWriter, m2m.toString(), gifBlock.blockCode, 4);
        }
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.GIF};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read blocks");
            return null;
        }
        GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Header");
            return null;
        }
        List<GifImageData> findAllImageData = findAllImageData(readFile);
        ArrayList arrayList = new ArrayList(findAllImageData.size());
        Iterator<GifImageData> it = findAllImageData.iterator();
        while (it.hasNext()) {
            arrayList.add(getBufferedImage(gifHeaderInfo, it.next(), readFile.globalColorTable));
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public FormatCompliance getFormatCompliance(ByteSource byteSource) {
        FormatCompliance formatCompliance = new FormatCompliance(byteSource.getDescription());
        readFile(byteSource, false, formatCompliance);
        return formatCompliance;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read blocks");
            return null;
        }
        GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Header");
            return null;
        }
        ImageDescriptor imageDescriptor = (ImageDescriptor) findBlock(readFile.blocks, 44);
        if (imageDescriptor == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read ImageDescriptor");
            return null;
        }
        GraphicControlExtension graphicControlExtension = (GraphicControlExtension) findBlock(readFile.blocks, GRAPHIC_CONTROL_EXTENSION);
        int i = gifHeaderInfo.logicalScreenHeight;
        int i2 = gifHeaderInfo.logicalScreenWidth;
        List<String> comments = getComments(readFile.blocks);
        int i3 = gifHeaderInfo.colorResolution + 1;
        ImageFormats imageFormats = ImageFormats.GIF;
        int size = findAllBlocks(readFile.blocks, 44).size();
        boolean z = imageDescriptor.interlaceFlag;
        return new ImageInfo("Gif " + ((char) readFile.gifHeaderInfo.version1) + ((char) readFile.gifHeaderInfo.version2) + ((char) readFile.gifHeaderInfo.version3), i3, comments, imageFormats, "GIF Graphics Interchange Format", i, "image/gif", size, 72, (float) (i / 72.0d), 72, (float) (i2 / 72.0d), i2, z, graphicControlExtension != null && graphicControlExtension.transparency, true, ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.LZW);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read blocks");
            return null;
        }
        GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo != null) {
            return new Dimension(gifHeaderInfo.logicalScreenWidth, gifHeaderInfo.logicalScreenHeight);
        }
        f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Header");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        GifImageContents readFile = readFile(byteSource, false);
        if (readFile == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read blocks");
            return null;
        }
        GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
        if (gifHeaderInfo == null) {
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Header");
            return null;
        }
        List<GifImageData> findAllImageData = findAllImageData(readFile);
        ArrayList arrayList = new ArrayList(findAllImageData.size());
        for (GifImageData gifImageData : findAllImageData) {
            DisposalMethod createDisposalMethodFromIntValue = createDisposalMethodFromIntValue(gifImageData.gce.dispose);
            int i = gifImageData.gce.delay;
            ImageDescriptor imageDescriptor = gifImageData.descriptor;
            arrayList.add(new GifImageMetadataItem(i, imageDescriptor.imageLeftPosition, imageDescriptor.imageTopPosition, createDisposalMethodFromIntValue));
        }
        return new GifImageMetadata(gifHeaderInfo.logicalScreenWidth, gifHeaderInfo.logicalScreenHeight, arrayList);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Graphics Interchange Format";
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            GifHeaderInfo readHeader = readHeader(inputStream, null);
            if (readHeader.globalColorTableFlag) {
                readColorTable(inputStream, readHeader.sizeOfGlobalColorTable);
            }
            List<GifBlock> readBlocks = readBlocks(readHeader, inputStream, true, null);
            ArrayList arrayList = new ArrayList();
            for (GifBlock gifBlock : readBlocks) {
                if (gifBlock.blockCode == XMP_COMPLETE_CODE) {
                    byte[] appendSubBlocks = ((GenericGifBlock) gifBlock).appendSubBlocks(true);
                    int length = appendSubBlocks.length;
                    byte[] bArr = XMP_APPLICATION_ID_AND_AUTH_CODE;
                    if (length >= bArr.length && BinaryFunctions.compareBytes(appendSubBlocks, 0, bArr, 0, bArr.length)) {
                        byte[] bArr2 = new byte[256];
                        for (int i = 0; i <= 255; i++) {
                            bArr2[i] = (byte) (255 - i);
                        }
                        int length2 = appendSubBlocks.length;
                        byte[] bArr3 = XMP_APPLICATION_ID_AND_AUTH_CODE;
                        if (length2 >= bArr3.length + 256) {
                            if (!BinaryFunctions.compareBytes(appendSubBlocks, appendSubBlocks.length - 256, bArr2, 0, 256)) {
                                throw new ImageReadException("XMP block in GIF missing magic trailer.");
                            }
                            arrayList.add(new String(appendSubBlocks, bArr3.length, appendSubBlocks.length - (bArr3.length + 256), StandardCharsets.UTF_8));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            }
            if (arrayList.size() > 1) {
                throw new ImageReadException("More than one XMP Block in GIF.");
            }
            String str = (String) arrayList.get(0);
            if (inputStream != null) {
                inputStream.close();
            }
            return str;
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

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        String str;
        int i;
        int i2;
        HashMap hashMap = new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            str = (String) hashMap.get(ImagingConstants.PARAM_KEY_XMP_XML);
            hashMap.remove(ImagingConstants.PARAM_KEY_XMP_XML);
        } else {
            str = null;
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean hasTransparency = new PaletteFactory().hasTransparency(bufferedImage);
        int i3 = hasTransparency ? 255 : 256;
        Palette makeExactRgbPaletteSimple = new PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, i3);
        if (makeExactRgbPaletteSimple == null) {
            makeExactRgbPaletteSimple = new PaletteFactory().makeQuantizedRgbPalette(bufferedImage, i3);
            Logger logger = LOGGER;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("quantizing");
            }
        } else {
            Logger logger2 = LOGGER;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine("exact palette");
            }
        }
        if (makeExactRgbPaletteSimple == null) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Gif: can't write images with more than 256 colors");
            return;
        }
        int length = makeExactRgbPaletteSimple.length() + (hasTransparency ? 1 : 0);
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        outputStream.write(71);
        outputStream.write(73);
        outputStream.write(70);
        outputStream.write(56);
        outputStream.write(57);
        outputStream.write(97);
        binaryOutputStream.write2Bytes(width);
        binaryOutputStream.write2Bytes(height);
        if (length > 128) {
            i2 = 7;
            i = 1;
        } else {
            i = 1;
            i2 = length > 64 ? 6 : length > 32 ? 5 : length > 16 ? 4 : length > 8 ? 3 : length > 4 ? 2 : length > 2 ? 1 : 0;
        }
        int i4 = i2 + 1;
        int i5 = i << i4;
        binaryOutputStream.write((((byte) i2) & 7) * 16);
        binaryOutputStream.write(0);
        binaryOutputStream.write(0);
        binaryOutputStream.write(33);
        binaryOutputStream.write(-7);
        binaryOutputStream.write(4);
        binaryOutputStream.write(hasTransparency ? (byte) 1 : (byte) 0);
        binaryOutputStream.write(0);
        binaryOutputStream.write(0);
        binaryOutputStream.write((byte) (hasTransparency ? makeExactRgbPaletteSimple.length() : 0));
        binaryOutputStream.write(0);
        if (str != null) {
            binaryOutputStream.write(33);
            binaryOutputStream.write(255);
            byte[] bArr = XMP_APPLICATION_ID_AND_AUTH_CODE;
            binaryOutputStream.write(bArr.length);
            binaryOutputStream.write(bArr);
            binaryOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            for (int i6 = 0; i6 <= 255; i6++) {
                binaryOutputStream.write(255 - i6);
            }
            binaryOutputStream.write(0);
        }
        binaryOutputStream.write(44);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(width);
        binaryOutputStream.write2Bytes(height);
        binaryOutputStream.write((i2 & 7) | 128);
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 < makeExactRgbPaletteSimple.length()) {
                int entry = makeExactRgbPaletteSimple.getEntry(i7);
                binaryOutputStream.write((entry >> 16) & 255);
                binaryOutputStream.write((entry >> 8) & 255);
                binaryOutputStream.write(entry & 255);
            } else {
                binaryOutputStream.write(0);
                binaryOutputStream.write(0);
                binaryOutputStream.write(0);
            }
        }
        int i8 = i4 < 2 ? 2 : i4;
        binaryOutputStream.write(i8);
        MyLzwCompressor myLzwCompressor = new MyLzwCompressor(i8, ByteOrder.LITTLE_ENDIAN, false);
        byte[] bArr2 = new byte[width * height];
        for (int i9 = 0; i9 < height; i9++) {
            for (int i10 = 0; i10 < width; i10++) {
                int rgb = bufferedImage.getRGB(i10, i9);
                int i11 = 16777215 & rgb;
                bArr2[(i9 * width) + i10] = (byte) (hasTransparency ? ((rgb >> 24) & 255) < 255 ? makeExactRgbPaletteSimple.length() : makeExactRgbPaletteSimple.getPaletteIndex(i11) : makeExactRgbPaletteSimple.getPaletteIndex(i11));
            }
        }
        writeAsSubBlocks(binaryOutputStream, myLzwCompressor.compress(bArr2));
        binaryOutputStream.write(59);
        binaryOutputStream.close();
        outputStream.close();
    }

    private GenericGifBlock readGenericGIFBlock(InputStream inputStream, int i) {
        return readGenericGIFBlock(inputStream, i, null);
    }

    private GifImageContents readFile(ByteSource byteSource, boolean z) {
        return readFile(byteSource, z, FormatCompliance.getDefault());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        GifImageContents readFile = readFile(byteSource, false);
        if (readFile != null) {
            GifHeaderInfo gifHeaderInfo = readFile.gifHeaderInfo;
            if (gifHeaderInfo != null) {
                return getBufferedImage(gifHeaderInfo, findFirstImageData(readFile), readFile.globalColorTable);
            }
            f$$ExternalSyntheticLambda0.m("GIF: Couldn't read Header");
            return null;
        }
        f$$ExternalSyntheticLambda0.m("GIF: Couldn't read blocks");
        return null;
    }
}
