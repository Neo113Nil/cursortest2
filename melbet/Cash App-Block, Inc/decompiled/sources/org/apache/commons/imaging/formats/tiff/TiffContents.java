package org.apache.commons.imaging.formats.tiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.internal.Debug;

/* loaded from: classes9.dex */
public class TiffContents {
    public final List<TiffDirectory> directories;
    public final TiffHeader header;
    public final List<TiffField> tiffFields;

    public TiffContents(TiffHeader tiffHeader, List<TiffDirectory> list, List<TiffField> list2) {
        this.header = tiffHeader;
        this.directories = Collections.unmodifiableList(list);
        this.tiffFields = Collections.unmodifiableList(list2);
    }

    public void dissect() {
        List<TiffElement> elements = getElements();
        Collections.sort(elements, TiffElement.COMPARATOR);
        long j = 0;
        for (TiffElement tiffElement : elements) {
            if (tiffElement.offset > j) {
                Debug.debug("\tgap: " + (tiffElement.offset - j));
            }
            if (tiffElement.offset < j) {
                Debug.debug("\toverlap");
            }
            Debug.debug("element, start: " + tiffElement.offset + ", length: " + tiffElement.length + ", end: " + (tiffElement.offset + tiffElement.length) + ": " + tiffElement.getElementDescription());
            String elementDescription = tiffElement.getElementDescription();
            if (elementDescription != null) {
                Debug.debug(elementDescription);
            }
            j = tiffElement.offset + tiffElement.length;
        }
        Debug.debug("end: " + j);
        Debug.debug();
    }

    public TiffField findField(TagInfo tagInfo) {
        Iterator<TiffDirectory> it = this.directories.iterator();
        while (it.hasNext()) {
            TiffField findField = it.next().findField(tagInfo);
            if (findField != null) {
                return findField;
            }
        }
        return null;
    }

    public List<TiffElement> getElements() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.header);
        for (TiffDirectory tiffDirectory : this.directories) {
            arrayList.add(tiffDirectory);
            Iterator<TiffField> it = tiffDirectory.entries.iterator();
            while (it.hasNext()) {
                TiffElement oversizeValueElement = it.next().getOversizeValueElement();
                if (oversizeValueElement != null) {
                    arrayList.add(oversizeValueElement);
                }
            }
            if (tiffDirectory.hasTiffImageData()) {
                arrayList.addAll(tiffDirectory.getTiffRawImageDataElements());
            }
            if (tiffDirectory.hasJpegImageData()) {
                arrayList.add(tiffDirectory.getJpegRawImageDataElement());
            }
        }
        return arrayList;
    }
}
