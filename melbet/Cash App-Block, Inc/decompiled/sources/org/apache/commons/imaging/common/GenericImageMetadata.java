package org.apache.commons.imaging.common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.common.ImageMetadata;

/* loaded from: classes9.dex */
public class GenericImageMetadata implements ImageMetadata {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final List<ImageMetadata.ImageMetadataItem> items = new ArrayList();

    public void add(String str, String str2) {
        add(new GenericImageMetadataItem(str, str2));
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public List<? extends ImageMetadata.ImageMetadataItem> getItems() {
        return new ArrayList(this.items);
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public String toString(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.items.size(); i++) {
            if (i > 0) {
                sb.append(NEWLINE);
            }
            sb.append(this.items.get(i).toString(str + "\t"));
        }
        return sb.toString();
    }

    public void add(ImageMetadata.ImageMetadataItem imageMetadataItem) {
        this.items.add(imageMetadataItem);
    }

    public static class GenericImageMetadataItem implements ImageMetadata.ImageMetadataItem {
        private final String keyword;
        private final String text;

        public GenericImageMetadataItem(String str, String str2) {
            this.keyword = str;
            this.text = str2;
        }

        public String getKeyword() {
            return this.keyword;
        }

        public String getText() {
            return this.text;
        }

        @Override // org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem
        public String toString(String str) {
            String str2 = this.keyword + ": " + this.text;
            return str != null ? Recorder$$ExternalSyntheticOutline2.m$1(str, str2) : str2;
        }

        @Override // org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem
        public String toString() {
            return toString(null);
        }
    }

    public String toString() {
        return toString(null);
    }
}
