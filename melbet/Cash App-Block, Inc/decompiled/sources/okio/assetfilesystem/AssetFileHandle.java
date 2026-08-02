package okio.assetfilesystem;

import android.content.res.AssetManager;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.InputStream;
import okio.FileHandle;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class AssetFileHandle extends FileHandle {
    public final AssetManager assets;
    public int currentOffset;
    public InputStream inputStream;
    public final String pathString;
    public int size;

    public AssetFileHandle(AssetManager assetManager, String str, InputStream inputStream) {
        inputStream.getClass();
        this.assets = assetManager;
        this.pathString = str;
        this.inputStream = inputStream;
        this.size = -1;
    }

    @Override // okio.FileHandle
    public final void protectedClose() {
        this.inputStream.close();
    }

    @Override // okio.FileHandle
    public final int protectedRead(long j, int i, int i2, byte[] bArr) {
        bArr.getClass();
        int i3 = this.currentOffset;
        if (i3 > j || i3 == this.size) {
            this.inputStream.close();
            InputStream open = this.assets.open(this.pathString);
            open.getClass();
            this.inputStream = open;
            this.currentOffset = 0;
        }
        while (true) {
            long j2 = j - this.currentOffset;
            InputStream inputStream = this.inputStream;
            if (j2 == 0) {
                int read = inputStream.read(bArr, i, i2);
                int i4 = this.currentOffset;
                if (read == -1) {
                    this.size = i4;
                    return read;
                }
                this.currentOffset = i4 + read;
                return read;
            }
            int skip = (int) inputStream.skip(j2);
            int i5 = this.currentOffset;
            if (skip == 0) {
                this.size = i5;
                Handlers$$ExternalSyntheticBUOutline0.m(this.size, Boxes$$ExternalSyntheticOutline1.m1149m(j, "fileOffset ", " > size "));
                return 0;
            }
            this.currentOffset = i5 + skip;
        }
    }

    @Override // okio.FileHandle
    public final long protectedSize() {
        int i;
        if (this.size == -1) {
            while (true) {
                int skip = (int) this.inputStream.skip(1048576L);
                i = this.currentOffset;
                if (skip == 0) {
                    break;
                }
                this.currentOffset = i + skip;
            }
            this.size = i;
        }
        return this.size;
    }
}
