package org.apache.commons.imaging.formats.tiff.write;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class TiffImageWriterLossless extends TiffImageWriterBase {
    private static final Comparator<TiffElement> ELEMENT_SIZE_COMPARATOR = new TiffOutputDirectory$$ExternalSyntheticLambda0(2);
    private static final Comparator<TiffOutputItem> ITEM_SIZE_COMPARATOR = new TiffOutputDirectory$$ExternalSyntheticLambda0(1);
    private final byte[] exifBytes;

    public TiffImageWriterLossless(byte[] bArr) {
        this.exifBytes = bArr;
    }

    private List<TiffElement> analyzeOldTiff(Map<Integer, TiffOutputField> map) {
        try {
            TiffElement tiffElement = null;
            TiffContents readContents = new TiffReader(false).readContents(new ByteSourceArray(this.exifBytes), null, FormatCompliance.getDefault());
            ArrayList arrayList = new ArrayList();
            for (TiffDirectory tiffDirectory : readContents.directories) {
                arrayList.add(tiffDirectory);
                for (TiffField tiffField : tiffDirectory.getDirectoryEntries()) {
                    TiffElement oversizeValueElement = tiffField.getOversizeValueElement();
                    if (oversizeValueElement != null) {
                        TiffOutputField tiffOutputField = map.get(Integer.valueOf(tiffField.getTag()));
                        if (tiffOutputField == null || tiffOutputField.getSeperateValue() == null || !tiffOutputField.bytesEqual(tiffField.getByteArrayValue())) {
                            arrayList.add(oversizeValueElement);
                        } else {
                            tiffOutputField.getSeperateValue().setOffset(tiffField.getOffset());
                        }
                    }
                }
                JpegImageData jpegImageData = tiffDirectory.getJpegImageData();
                if (jpegImageData != null) {
                    arrayList.add(jpegImageData);
                }
                TiffImageData tiffImageData = tiffDirectory.getTiffImageData();
                if (tiffImageData != null) {
                    Collections.addAll(arrayList, tiffImageData.getImageData());
                }
            }
            Collections.sort(arrayList, TiffElement.COMPARATOR);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            long j = -1;
            while (it.hasNext()) {
                TiffElement tiffElement2 = (TiffElement) it.next();
                long j2 = tiffElement2.offset;
                long j3 = tiffElement2.length + j2;
                if (tiffElement != null) {
                    if (j2 - j > 3) {
                        long j4 = tiffElement.offset;
                        arrayList2.add(new TiffElement.Stub(j4, (int) (j - j4)));
                    } else {
                        j = j3;
                    }
                }
                tiffElement = tiffElement2;
                j = j3;
            }
            if (tiffElement != null) {
                long j5 = tiffElement.offset;
                arrayList2.add(new TiffElement.Stub(j5, (int) (j - j5)));
            }
            return arrayList2;
        } catch (ImageReadException e) {
            throw new ImageWriteException(e.getMessage(), (Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(TiffElement tiffElement, TiffElement tiffElement2) {
        return tiffElement.length - tiffElement2.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(TiffOutputItem tiffOutputItem, TiffOutputItem tiffOutputItem2) {
        return tiffOutputItem.getItemLength() - tiffOutputItem2.getItemLength();
    }

    private long updateOffsetsStep(List<TiffElement> list, List<TiffOutputItem> list2) {
        long length = this.exifBytes.length;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, TiffElement.COMPARATOR);
        Collections.reverse(arrayList);
        while (!arrayList.isEmpty()) {
            TiffElement tiffElement = (TiffElement) arrayList.get(0);
            long j = tiffElement.offset;
            int i = tiffElement.length;
            if (j + i != length) {
                break;
            }
            length -= i;
            arrayList.remove(0);
        }
        Collections.sort(arrayList, ELEMENT_SIZE_COMPARATOR);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(list2);
        Collections.sort(arrayList2, ITEM_SIZE_COMPARATOR);
        Collections.reverse(arrayList2);
        while (!arrayList2.isEmpty()) {
            TiffOutputItem tiffOutputItem = (TiffOutputItem) arrayList2.remove(0);
            int itemLength = tiffOutputItem.getItemLength();
            Iterator it = arrayList.iterator();
            TiffElement tiffElement2 = null;
            while (it.hasNext()) {
                TiffElement tiffElement3 = (TiffElement) it.next();
                if (tiffElement3.length < itemLength) {
                    break;
                }
                tiffElement2 = tiffElement3;
            }
            if (tiffElement2 == null) {
                if ((length & 1) != 0) {
                    length++;
                }
                tiffOutputItem.setOffset(length);
                length += itemLength;
            } else {
                long j2 = tiffElement2.offset;
                if ((j2 & 1) != 0) {
                    j2++;
                }
                tiffOutputItem.setOffset(j2);
                arrayList.remove(tiffElement2);
                int i2 = tiffElement2.length;
                if (i2 > itemLength) {
                    arrayList.add(new TiffElement.Stub(tiffElement2.offset + itemLength, i2 - itemLength));
                    Collections.sort(arrayList, ELEMENT_SIZE_COMPARATOR);
                    Collections.reverse(arrayList);
                }
            }
        }
        return length;
    }

    private void writeStep(OutputStream outputStream, TiffOutputSet tiffOutputSet, List<TiffElement> list, List<TiffOutputItem> list2, long j) {
        TiffOutputDirectory rootDirectory = tiffOutputSet.getRootDirectory();
        int i = (int) j;
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.exifBytes;
        System.arraycopy(bArr2, 0, bArr, 0, Math.min(bArr2.length, i));
        writeImageFileHeader(new BinaryOutputStream(new BufferOutputStream(bArr, 0), this.byteOrder), rootDirectory.getOffset());
        Iterator<TiffElement> it = list.iterator();
        while (it.hasNext()) {
            long j2 = it.next().offset;
            Arrays.fill(bArr, (int) j2, (int) Math.min(j2 + r9.length, i), (byte) 0);
        }
        for (TiffOutputItem tiffOutputItem : list2) {
            BinaryOutputStream binaryOutputStream = new BinaryOutputStream(new BufferOutputStream(bArr, (int) tiffOutputItem.getOffset()), this.byteOrder);
            try {
                tiffOutputItem.writeItem(binaryOutputStream);
                binaryOutputStream.close();
            } finally {
            }
        }
        outputStream.write(bArr);
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase
    public void write(OutputStream outputStream, TiffOutputSet tiffOutputSet) {
        HashMap hashMap = new HashMap();
        TagInfoUndefineds tagInfoUndefineds = ExifTagConstants.EXIF_TAG_MAKER_NOTE;
        TiffOutputField findField = tiffOutputSet.findField(tagInfoUndefineds);
        if (findField != null && findField.getSeperateValue() != null) {
            hashMap.put(Integer.valueOf(tagInfoUndefineds.tag), findField);
        }
        List<TiffElement> analyzeOldTiff = analyzeOldTiff(hashMap);
        int length = this.exifBytes.length;
        if (analyzeOldTiff.isEmpty()) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Couldn't analyze old tiff data.");
            return;
        }
        if (analyzeOldTiff.size() == 1) {
            long j = analyzeOldTiff.get(0).offset;
            if (j == 8 && j + r2.length + 8 == length) {
                new TiffImageWriterLossy(this.byteOrder).write(outputStream, tiffOutputSet);
                return;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            TiffOutputField tiffOutputField = (TiffOutputField) ((Map.Entry) it.next()).getValue();
            if (tiffOutputField.getSeperateValue().getOffset() != -1) {
                hashMap2.put(Long.valueOf(tiffOutputField.getSeperateValue().getOffset()), tiffOutputField);
            }
        }
        TiffOutputSummary validateDirectories = validateDirectories(tiffOutputSet);
        List<TiffOutputItem> outputItems = tiffOutputSet.getOutputItems(validateDirectories);
        ArrayList arrayList = new ArrayList();
        for (TiffOutputItem tiffOutputItem : outputItems) {
            if (!hashMap2.containsKey(Long.valueOf(tiffOutputItem.getOffset()))) {
                arrayList.add(tiffOutputItem);
            }
        }
        long updateOffsetsStep = updateOffsetsStep(analyzeOldTiff, arrayList);
        validateDirectories.updateOffsets(this.byteOrder);
        writeStep(outputStream, tiffOutputSet, analyzeOldTiff, arrayList, updateOffsetsStep);
    }

    public TiffImageWriterLossless(ByteOrder byteOrder, byte[] bArr) {
        super(byteOrder);
        this.exifBytes = bArr;
    }

    public static class BufferOutputStream extends OutputStream {
        private final byte[] buffer;
        private int index;

        public BufferOutputStream(byte[] bArr, int i) {
            this.buffer = bArr;
            this.index = i;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            int i3 = this.index;
            int i4 = i3 + i2;
            byte[] bArr2 = this.buffer;
            if (i4 > bArr2.length) {
                a$$ExternalSyntheticBUOutline0.m$4("Buffer overflow.");
            } else {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.index += i2;
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            int i2 = this.index;
            byte[] bArr = this.buffer;
            if (i2 < bArr.length) {
                this.index = i2 + 1;
                bArr[i2] = (byte) i;
            } else {
                a$$ExternalSyntheticBUOutline0.m$4("Buffer overflow.");
            }
        }
    }
}
