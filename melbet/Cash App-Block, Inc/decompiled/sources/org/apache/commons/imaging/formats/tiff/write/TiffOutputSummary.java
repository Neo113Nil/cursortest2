package org.apache.commons.imaging.formats.tiff.write;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;

/* loaded from: classes9.dex */
class TiffOutputSummary {
    public final ByteOrder byteOrder;
    public final Map<Integer, TiffOutputDirectory> directoryTypeMap;
    public final TiffOutputDirectory rootDirectory;
    private final List<OffsetItem> offsetItems = new ArrayList();
    private final List<ImageDataOffsets> imageDataItems = new ArrayList();

    public static class OffsetItem {
        public final TiffOutputItem item;
        public final TiffOutputField itemOffsetField;

        public OffsetItem(TiffOutputItem tiffOutputItem, TiffOutputField tiffOutputField) {
            this.itemOffsetField = tiffOutputField;
            this.item = tiffOutputItem;
        }
    }

    public TiffOutputSummary(ByteOrder byteOrder, TiffOutputDirectory tiffOutputDirectory, Map<Integer, TiffOutputDirectory> map) {
        this.byteOrder = byteOrder;
        this.rootDirectory = tiffOutputDirectory;
        this.directoryTypeMap = map;
    }

    public void add(TiffOutputItem tiffOutputItem, TiffOutputField tiffOutputField) {
        this.offsetItems.add(new OffsetItem(tiffOutputItem, tiffOutputField));
    }

    public void addTiffImageData(ImageDataOffsets imageDataOffsets) {
        this.imageDataItems.add(imageDataOffsets);
    }

    public void updateOffsets(ByteOrder byteOrder) {
        for (OffsetItem offsetItem : this.offsetItems) {
            offsetItem.itemOffsetField.setData(FieldType.LONG.writeData(Integer.valueOf((int) offsetItem.item.getOffset()), byteOrder));
        }
        for (ImageDataOffsets imageDataOffsets : this.imageDataItems) {
            int i = 0;
            while (true) {
                TiffOutputItem[] tiffOutputItemArr = imageDataOffsets.outputItems;
                if (i < tiffOutputItemArr.length) {
                    imageDataOffsets.imageDataOffsets[i] = (int) tiffOutputItemArr[i].getOffset();
                    i++;
                }
            }
            imageDataOffsets.imageDataOffsetsField.setData(FieldType.LONG.writeData(imageDataOffsets.imageDataOffsets, byteOrder));
        }
    }
}
