package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bix implements bbn {
    public static final bbk a = new bbk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new bis(1, null));
    public static final bbk b = new bbk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bis(0));
    private static final List c = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    private final biv d;
    private final bed e;

    public bix(bed bedVar, biv bivVar) {
        this.e = bedVar;
        this.d = bivVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:48|49|50|(1:102)(1:54)|55|56|57|58|(1:60)|61|(3:95|(1:97)|(4:78|(1:80)(1:83)|81|82)(2:84|85))(4:65|(3:68|(2:70|71)(1:93)|66)|94|(0)(0))|72|73|74|(3:87|88|(1:90))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #0 {all -> 0x01b0, blocks: (B:16:0x0059, B:18:0x0067, B:34:0x00a4, B:35:0x00ae, B:38:0x00af, B:46:0x00bf, B:60:0x0107, B:61:0x010b, B:63:0x0117, B:65:0x011b, B:66:0x0121, B:68:0x0127, B:74:0x0142, B:87:0x015c, B:90:0x016c, B:84:0x01aa, B:85:0x01af, B:95:0x0136, B:97:0x013c), top: B:15:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:16:0x0059, B:18:0x0067, B:34:0x00a4, B:35:0x00ae, B:38:0x00af, B:46:0x00bf, B:60:0x0107, B:61:0x010b, B:63:0x0117, B:65:0x011b, B:66:0x0121, B:68:0x0127, B:74:0x0142, B:87:0x015c, B:90:0x016c, B:84:0x01aa, B:85:0x01af, B:95:0x0136, B:97:0x013c), top: B:15:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01aa A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #0 {all -> 0x01b0, blocks: (B:16:0x0059, B:18:0x0067, B:34:0x00a4, B:35:0x00ae, B:38:0x00af, B:46:0x00bf, B:60:0x0107, B:61:0x010b, B:63:0x0117, B:65:0x011b, B:66:0x0121, B:68:0x0127, B:74:0x0142, B:87:0x015c, B:90:0x016c, B:84:0x01aa, B:85:0x01af, B:95:0x0136, B:97:0x013c), top: B:15:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #0 {all -> 0x01b0, blocks: (B:16:0x0059, B:18:0x0067, B:34:0x00a4, B:35:0x00ae, B:38:0x00af, B:46:0x00bf, B:60:0x0107, B:61:0x010b, B:63:0x0117, B:65:0x011b, B:66:0x0121, B:68:0x0127, B:74:0x0142, B:87:0x015c, B:90:0x016c, B:84:0x01aa, B:85:0x01af, B:95:0x0136, B:97:0x013c), top: B:15:0x0059 }] */
    @Override // defpackage.bbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bdv a(Object obj, int i, int i2, bbl bblVar) {
        int i3;
        int parseInt;
        int parseInt2;
        MediaExtractor mediaExtractor;
        long longValue = ((Long) bblVar.b(a)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) bblVar.b(b);
        if (num == null) {
            num = 2;
        }
        bhu bhuVar = (bhu) bblVar.b(bhu.g);
        if (bhuVar == null) {
            bhuVar = bhu.f;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            biv bivVar = this.d;
            bivVar.b(mediaMetadataRetriever, obj);
            int intValue = num.intValue();
            Bitmap bitmap = null;
            if (Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
                try {
                } catch (Throwable unused) {
                    mediaExtractor = null;
                }
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        bivVar.a(mediaExtractor, obj);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i4 = 0; i4 < trackCount; i4++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i4).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused2) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        if (i != Integer.MIN_VALUE) {
                            try {
                                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (parseInt2 != 90) {
                                }
                                parseInt = parseInt3;
                                parseInt3 = parseInt;
                                float a2 = bhuVar.a(parseInt3, parseInt, i, i2);
                                int round = Math.round(parseInt3 * a2);
                                i3 = intValue;
                                try {
                                    bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, i3, round, Math.round(a2 * parseInt));
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                            }
                            if (bitmap == null) {
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                            }
                            if (Build.VERSION.SDK_INT >= 30) {
                            }
                            if (bitmap == null) {
                            }
                        }
                        i3 = intValue;
                        if (bitmap == null) {
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                        }
                        if (Build.VERSION.SDK_INT >= 30) {
                        }
                        if (bitmap == null) {
                        }
                    }
                    mediaExtractor.release();
                }
            }
            if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && bhuVar != bhu.e) {
                int parseInt32 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt2 != 90 || parseInt2 == 270) {
                    parseInt = parseInt32;
                    parseInt32 = parseInt;
                }
                float a22 = bhuVar.a(parseInt32, parseInt, i, i2);
                int round2 = Math.round(parseInt32 * a22);
                i3 = intValue;
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, i3, round2, Math.round(a22 * parseInt));
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, i3);
                }
                if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
                    if (Build.VERSION.SDK_INT >= 30) {
                    }
                    if (bitmap == null) {
                        return bil.g(bitmap, this.e);
                    }
                    throw new biw();
                }
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    if (Build.ID.startsWith((String) it.next())) {
                    }
                }
                if (bitmap == null) {
                }
                String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                int parseInt4 = Integer.parseInt(extractMetadata);
                int parseInt5 = Integer.parseInt(extractMetadata2);
                if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                if (bitmap == null) {
                }
            }
            i3 = intValue;
            if (bitmap == null) {
            }
            if (Build.MODEL.startsWith("Pixel")) {
            }
            if (Build.VERSION.SDK_INT >= 30) {
            }
            if (bitmap == null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // defpackage.bbn
    public final boolean b(Object obj, bbl bblVar) {
        return true;
    }
}
