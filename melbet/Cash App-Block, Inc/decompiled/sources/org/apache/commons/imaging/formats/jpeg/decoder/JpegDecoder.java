package org.apache.commons.imaging.formats.jpeg.decoder;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.color.ColorConversions;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.segments.DhtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SosSegment;

/* loaded from: classes9.dex */
public class JpegDecoder extends BinaryFileParser implements JpegUtils.Visitor {
    private BufferedImage image;
    private ImageReadException imageReadException;
    private IOException ioException;
    private SofnSegment sofnSegment;
    private SosSegment sosSegment;
    private final DqtSegment.QuantizationTable[] quantizationTables = new DqtSegment.QuantizationTable[4];
    private final DhtSegment.HuffmanTable[] huffmanDCTables = new DhtSegment.HuffmanTable[4];
    private final DhtSegment.HuffmanTable[] huffmanACTables = new DhtSegment.HuffmanTable[4];
    private final float[][] scaledQuantizationTables = new float[4][];
    private final int[] zz = new int[64];
    private final int[] blockInt = new int[64];
    private final float[] block = new float[64];

    private Block[] allocateMCUMemory() {
        SofnSegment.Component component;
        Block[] blockArr = new Block[this.sosSegment.numberOfComponents];
        int i = 0;
        while (true) {
            SosSegment sosSegment = this.sosSegment;
            if (i >= sosSegment.numberOfComponents) {
                return blockArr;
            }
            SosSegment.Component components = sosSegment.getComponents(i);
            int i2 = 0;
            while (true) {
                SofnSegment sofnSegment = this.sofnSegment;
                if (i2 >= sofnSegment.numberOfComponents) {
                    component = null;
                    break;
                }
                if (sofnSegment.getComponents(i2).componentIdentifier == components.scanComponentSelector) {
                    component = this.sofnSegment.getComponents(i2);
                    break;
                }
                i2++;
            }
            if (component == null) {
                f$$ExternalSyntheticLambda0.m("Invalid component");
                return null;
            }
            blockArr[i] = new Block(component.horizontalSamplingFactor * 8, component.verticalSamplingFactor * 8);
            i++;
        }
    }

    private int decode(JpegInputStream jpegInputStream, DhtSegment.HuffmanTable huffmanTable) {
        int nextBit = jpegInputStream.nextBit();
        int i = 1;
        while (nextBit > huffmanTable.getMaxCode(i)) {
            i++;
            nextBit = (nextBit << 1) | jpegInputStream.nextBit();
        }
        return huffmanTable.getHuffVal((nextBit - huffmanTable.getMinCode(i)) + huffmanTable.getValPtr(i));
    }

    private int extend(int i, int i2) {
        return i < (1 << (i2 + (-1))) ? ((-1) << i2) + 1 + i : i;
    }

    private static int fastRound(float f) {
        return (int) (f + 0.5f);
    }

    public static List<Integer> getIntervalStartPositions(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < iArr.length; i++) {
            if (z) {
                int i2 = iArr[i];
                if (i2 < 208 || i2 > 215) {
                    z = false;
                } else {
                    z2 = true;
                }
            }
            boolean z3 = iArr[i] != 255 ? z : true;
            if (z3 && z2) {
                arrayList.add(Integer.valueOf(i + 1));
                z = false;
                z2 = false;
            } else {
                z = z3;
            }
        }
        return arrayList;
    }

    private void readMCU(JpegInputStream jpegInputStream, int[] iArr, Block[] blockArr) {
        SofnSegment.Component component;
        float[] fArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            SosSegment sosSegment = this.sosSegment;
            if (i2 >= sosSegment.numberOfComponents) {
                return;
            }
            SosSegment.Component components = sosSegment.getComponents(i2);
            int i3 = i;
            while (true) {
                SofnSegment sofnSegment = this.sofnSegment;
                if (i3 >= sofnSegment.numberOfComponents) {
                    component = null;
                    break;
                } else {
                    if (sofnSegment.getComponents(i3).componentIdentifier == components.scanComponentSelector) {
                        component = this.sofnSegment.getComponents(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (component == null) {
                f$$ExternalSyntheticLambda0.m("Invalid component");
                return;
            }
            Block block = blockArr[i2];
            int i4 = i;
            while (i4 < component.verticalSamplingFactor) {
                int i5 = i;
                while (i5 < component.horizontalSamplingFactor) {
                    Arrays.fill(this.zz, i);
                    int decode = decode(jpegInputStream, this.huffmanDCTables[components.dcCodingTableSelector]);
                    int extend = extend(receive(decode, jpegInputStream), decode);
                    int[] iArr2 = this.zz;
                    int i6 = iArr[i2] + extend;
                    iArr2[i] = i6;
                    iArr[i2] = i6;
                    int i7 = 1;
                    while (true) {
                        int decode2 = decode(jpegInputStream, this.huffmanACTables[components.acCodingTableSelector]);
                        int i8 = decode2 & 15;
                        int i9 = decode2 >> 4;
                        if (i8 != 0) {
                            int i10 = i7 + i9;
                            this.zz[i10] = receive(i8, jpegInputStream);
                            int[] iArr3 = this.zz;
                            iArr3[i10] = extend(iArr3[i10], i8);
                            if (i10 == 63) {
                                break;
                            }
                            i7 = i10 + 1;
                            i = 0;
                        } else {
                            if (i9 != 15) {
                                break;
                            }
                            i7 += 16;
                            i = 0;
                        }
                    }
                    int i11 = this.sofnSegment.precision;
                    int i12 = 1 << (i11 - 1);
                    int i13 = (1 << i11) - 1;
                    float[] fArr2 = this.scaledQuantizationTables[component.quantTabDestSelector];
                    ZigZag.zigZagToBlock(this.zz, this.blockInt);
                    int i14 = i;
                    while (true) {
                        fArr = this.block;
                        if (i14 >= 64) {
                            break;
                        }
                        fArr[i14] = this.blockInt[i14] * fArr2[i14];
                        i14++;
                    }
                    Dct.inverseDCT8x8(fArr);
                    int i15 = (i5 * 8) + (i4 * 64 * component.horizontalSamplingFactor);
                    int i16 = i;
                    int i17 = i16;
                    while (i16 < 8) {
                        int i18 = i;
                        while (i18 < 8) {
                            int i19 = i17 + 1;
                            float f = this.block[i17] + i12;
                            block.samples[i15 + i18] = f < RecyclerView.DECELERATION_RATE ? 0 : f > ((float) i13) ? i13 : fastRound(f);
                            i18++;
                            i17 = i19;
                        }
                        i15 += component.horizontalSamplingFactor * 8;
                        i16++;
                        i = 0;
                    }
                    i5++;
                    i = 0;
                }
                i4++;
                i = 0;
            }
            i2++;
            i = 0;
        }
    }

    private int receive(int i, JpegInputStream jpegInputStream) {
        int i2 = 0;
        int i3 = 0;
        while (i2 != i) {
            i2++;
            i3 = (i3 << 1) + jpegInputStream.nextBit();
        }
        return i3;
    }

    private void rescaleMCU(Block[] blockArr, int i, int i2, Block[] blockArr2) {
        for (int i3 = 0; i3 < blockArr.length; i3++) {
            Block block = blockArr[i3];
            int i4 = block.width;
            if (i4 == i && block.height == i2) {
                System.arraycopy(block.samples, 0, blockArr2[i3].samples, 0, i * i2);
            } else {
                int i5 = i / i4;
                int i6 = i2 / block.height;
                if (i5 == 2 && i6 == 2) {
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < block.height; i9++) {
                        for (int i10 = 0; i10 < i; i10++) {
                            int i11 = block.samples[(i10 >> 1) + i7];
                            int[] iArr = blockArr2[i3].samples;
                            iArr[i8 + i10] = i11;
                            iArr[i8 + i + i10] = i11;
                        }
                        i7 += block.width;
                        i8 += i * 2;
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        for (int i14 = 0; i14 < i; i14++) {
                            blockArr2[i3].samples[i12 + i14] = block.samples[(i14 / i5) + ((i13 / i6) * block.width)];
                        }
                        i12 += i;
                    }
                }
            }
        }
    }

    public static JpegInputStream[] splitByRstMarkers(int[] iArr) {
        List<Integer> intervalStartPositions = getIntervalStartPositions(iArr);
        int size = intervalStartPositions.size();
        JpegInputStream[] jpegInputStreamArr = new JpegInputStream[size];
        int i = 0;
        while (i < size) {
            jpegInputStreamArr[i] = new JpegInputStream(Arrays.copyOfRange(iArr, intervalStartPositions.get(i).intValue(), i < size + (-1) ? intervalStartPositions.get(i + 1).intValue() - 2 : iArr.length));
            i++;
        }
        return jpegInputStreamArr;
    }

    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    public boolean beginSOS() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ce, code lost:
    
        continue;
     */
    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
        SofnSegment sofnSegment;
        DirectColorModel directColorModel;
        WritableRaster createPackedRaster;
        JpegInputStream[] jpegInputStreamArr;
        int i2;
        int i3;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        try {
            int read2Bytes = BinaryFunctions.read2Bytes("segmentLength", byteArrayInputStream, "Not a Valid JPEG File", getByteOrder());
            this.sosSegment = new SosSegment(i, BinaryFunctions.readBytes("SosSegment", byteArrayInputStream, read2Bytes - 2, "Not a Valid JPEG File"));
            int length = bArr2.length - read2Bytes;
            int[] iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = byteArrayInputStream.read();
            }
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                sofnSegment = this.sofnSegment;
                if (i5 >= sofnSegment.numberOfComponents) {
                    break;
                }
                i6 = Math.max(i6, sofnSegment.getComponents(i5).horizontalSamplingFactor);
                i7 = Math.max(i7, this.sofnSegment.getComponents(i5).verticalSamplingFactor);
                i5++;
            }
            int i8 = i6 * 8;
            int i9 = i7 * 8;
            int m = Fragment$5$$ExternalSyntheticOutline0.m(sofnSegment.width, i8, 1, i8);
            int m2 = Fragment$5$$ExternalSyntheticOutline0.m(sofnSegment.height, i9, 1, i9);
            Block[] allocateMCUMemory = allocateMCUMemory();
            int length2 = allocateMCUMemory.length;
            Block[] blockArr = new Block[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                blockArr[i10] = new Block(i8, i9);
            }
            int i11 = this.sofnSegment.numberOfComponents;
            int[] iArr2 = new int[i11];
            if (i11 == 4) {
                directColorModel = new DirectColorModel(24, 16711680, 65280, 255);
                SofnSegment sofnSegment2 = this.sofnSegment;
                createPackedRaster = Raster.createPackedRaster(3, sofnSegment2.width, sofnSegment2.height, new int[]{16711680, 65280, 255}, (Point) null);
            } else if (i11 == 3) {
                directColorModel = new DirectColorModel(24, 16711680, 65280, 255);
                SofnSegment sofnSegment3 = this.sofnSegment;
                createPackedRaster = Raster.createPackedRaster(3, sofnSegment3.width, sofnSegment3.height, new int[]{16711680, 65280, 255}, (Point) null);
            } else {
                if (i11 != 1) {
                    throw new ImageReadException(this.sofnSegment.numberOfComponents + " components are invalid or unsupported");
                }
                directColorModel = new DirectColorModel(24, 16711680, 65280, 255);
                SofnSegment sofnSegment4 = this.sofnSegment;
                createPackedRaster = Raster.createPackedRaster(3, sofnSegment4.width, sofnSegment4.height, new int[]{16711680, 65280, 255}, (Point) null);
            }
            DataBuffer dataBuffer = createPackedRaster.getDataBuffer();
            JpegInputStream[] splitByRstMarkers = splitByRstMarkers(iArr);
            JpegInputStream jpegInputStream = splitByRstMarkers[0];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i9 * m2) {
                int i14 = 0;
                int i15 = m2;
                while (i14 < i8 * m) {
                    if (!jpegInputStream.hasNext() && (i13 = i13 + 1) < splitByRstMarkers.length) {
                        jpegInputStream = splitByRstMarkers[i13];
                    }
                    readMCU(jpegInputStream, iArr2, allocateMCUMemory);
                    rescaleMCU(allocateMCUMemory, i8, i9, blockArr);
                    int i16 = (this.sofnSegment.width * i12) + i14;
                    int i17 = 0;
                    int i18 = i14;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= i9) {
                            jpegInputStreamArr = splitByRstMarkers;
                            break;
                        }
                        int i20 = i19;
                        jpegInputStreamArr = splitByRstMarkers;
                        if (i12 + i20 >= this.sofnSegment.height) {
                            break;
                        }
                        int i21 = 0;
                        while (i21 < i8) {
                            int i22 = i21;
                            if (i18 + i21 < this.sofnSegment.width) {
                                if (length2 == 4) {
                                    int i23 = i17 + i22;
                                    i2 = i8;
                                    i3 = i9;
                                    dataBuffer.setElem(i16 + i22, ColorConversions.convertCMYKtoRGB(blockArr[0].samples[i23], blockArr[1].samples[i23], blockArr[2].samples[i23], blockArr[3].samples[i23]));
                                } else {
                                    i2 = i8;
                                    i3 = i9;
                                    if (length2 == 3) {
                                        int i24 = i17 + i22;
                                        dataBuffer.setElem(i16 + i22, YCbCrConverter.convertYCbCrToRGB(blockArr[0].samples[i24], blockArr[1].samples[i24], blockArr[2].samples[i24]));
                                    } else {
                                        if (allocateMCUMemory.length != 1) {
                                            throw new ImageReadException("Unsupported JPEG with " + allocateMCUMemory.length + " components");
                                        }
                                        int i25 = blockArr[0].samples[i17 + i22];
                                        dataBuffer.setElem(i16 + i22, i25 | (i25 << 16) | (i25 << 8));
                                        i21 = i22 + 1;
                                        i8 = i2;
                                        i9 = i3;
                                    }
                                }
                                i21 = i22 + 1;
                                i8 = i2;
                                i9 = i3;
                            }
                        }
                        int i26 = i8;
                        i17 += i26;
                        i16 += this.sofnSegment.width;
                        i19 = i20 + 1;
                        splitByRstMarkers = jpegInputStreamArr;
                        i8 = i26;
                        i9 = i9;
                    }
                    int i27 = i8;
                    i14 = i18 + i27;
                    splitByRstMarkers = jpegInputStreamArr;
                    i8 = i27;
                    i9 = i9;
                }
                int i28 = i9;
                i12 += i28;
                m2 = i15;
                i9 = i28;
            }
            this.image = new BufferedImage(directColorModel, createPackedRaster, directColorModel.isAlphaPremultiplied(), new Properties());
        } catch (IOException e) {
            this.ioException = e;
        } catch (RuntimeException e2) {
            this.imageReadException = new ImageReadException("Error parsing JPEG", e2);
        } catch (ImageReadException e3) {
            this.imageReadException = e3;
        }
    }

    @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
    public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
        DhtSegment.HuffmanTable[] huffmanTableArr;
        if (Arrays.binarySearch(new int[]{JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER, JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER, JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER}, i) >= 0) {
            if (i != 65472) {
                f$$ExternalSyntheticLambda0.m("Only sequential, baseline JPEGs are supported at the moment");
                return false;
            }
            this.sofnSegment = new SofnSegment(i, bArr3);
        } else {
            if (i == 65499) {
                DqtSegment dqtSegment = new DqtSegment(i, bArr3);
                for (int i3 = 0; i3 < dqtSegment.quantizationTables.size(); i3++) {
                    DqtSegment.QuantizationTable quantizationTable = dqtSegment.quantizationTables.get(i3);
                    int i4 = quantizationTable.destinationIdentifier;
                    if (i4 >= 0) {
                        DqtSegment.QuantizationTable[] quantizationTableArr = this.quantizationTables;
                        if (i4 < quantizationTableArr.length) {
                            quantizationTableArr[i4] = quantizationTable;
                            ZigZag.zigZagToBlock(quantizationTable.getElements(), new int[64]);
                            float[] fArr = new float[64];
                            for (int i5 = 0; i5 < 64; i5++) {
                                fArr[i5] = r1[i5];
                            }
                            Dct.scaleDequantizationMatrix(fArr);
                            this.scaledQuantizationTables[quantizationTable.destinationIdentifier] = fArr;
                        }
                    }
                    throw new ImageReadException("Invalid quantization table identifier " + quantizationTable.destinationIdentifier);
                }
            }
            if (i == 65476) {
                DhtSegment dhtSegment = new DhtSegment(i, bArr3);
                for (int i6 = 0; i6 < dhtSegment.huffmanTables.size(); i6++) {
                    DhtSegment.HuffmanTable huffmanTable = dhtSegment.huffmanTables.get(i6);
                    int i7 = huffmanTable.tableClass;
                    if (i7 == 0) {
                        huffmanTableArr = this.huffmanDCTables;
                    } else {
                        if (i7 != 1) {
                            throw new ImageReadException("Invalid huffman table class " + huffmanTable.tableClass);
                        }
                        huffmanTableArr = this.huffmanACTables;
                    }
                    int i8 = huffmanTable.destinationIdentifier;
                    if (i8 < 0 || i8 >= huffmanTableArr.length) {
                        throw new ImageReadException("Invalid huffman table identifier " + huffmanTable.destinationIdentifier);
                    }
                    huffmanTableArr[i8] = huffmanTable;
                }
            }
        }
        return true;
    }

    public BufferedImage decode(ByteSource byteSource) {
        new JpegUtils().traverseJFIF(byteSource, this);
        ImageReadException imageReadException = this.imageReadException;
        if (imageReadException == null) {
            IOException iOException = this.ioException;
            if (iOException == null) {
                return this.image;
            }
            throw iOException;
        }
        throw imageReadException;
    }
}
