package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j8, long j9) {
            this.mime = str;
            this.semantic = str2;
            this.length = j8;
            this.padding = j9;
        }
    }

    public MotionPhotoDescription(long j8, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j8;
        this.items = list;
    }

    @Nullable
    public MotionPhotoMetadata getMotionPhotoMetadata(long j8) {
        long j9;
        if (this.items.size() < 2) {
            return null;
        }
        long j10 = j8;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        boolean z7 = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean equals = MimeTypes.VIDEO_MP4.equals(containerItem.mime) | z7;
            if (size == 0) {
                j10 -= containerItem.padding;
                j9 = 0;
            } else {
                j9 = j10 - containerItem.length;
            }
            long j15 = j10;
            j10 = j9;
            if (!equals || j10 == j15) {
                z7 = equals;
            } else {
                j14 = j15 - j10;
                j13 = j10;
                z7 = false;
            }
            if (size == 0) {
                j11 = j10;
                j12 = j15;
            }
        }
        if (j13 == -1 || j14 == -1 || j11 == -1 || j12 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j11, j12, this.photoPresentationTimestampUs, j13, j14);
    }
}
