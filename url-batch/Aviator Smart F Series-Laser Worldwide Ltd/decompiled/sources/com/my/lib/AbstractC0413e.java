package com.my.lib;

import android.media.MediaMetadataRetriever;

/* renamed from: com.my.lib.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0413e {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r7 = kotlin.text.s.toLongOrNull(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(String filePath) {
        long j8;
        Long longOrNull;
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(filePath);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            j8 = (extractMetadata == null || longOrNull == null) ? -1L : longOrNull.longValue();
            mediaMetadataRetriever.release();
        } catch (Exception unused) {
            mediaMetadataRetriever.release();
            j8 = -1;
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
        if (j8 <= 0) {
            return -1L;
        }
        long j9 = j8 / 1000;
        if (j9 > 0) {
            return j9;
        }
        return 1L;
    }
}
