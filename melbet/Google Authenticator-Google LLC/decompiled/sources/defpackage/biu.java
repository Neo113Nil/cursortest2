package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class biu implements biv {
    private final /* synthetic */ int a;

    public biu(int i) {
        this.a = i;
    }

    @Override // defpackage.biv
    public final /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaExtractor.setDataSource(new bit((ByteBuffer) obj));
        } else if (i != 1) {
            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @Override // defpackage.biv
    public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new bit((ByteBuffer) obj));
        } else if (i != 1) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
}
