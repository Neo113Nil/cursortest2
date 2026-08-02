package j$.nio.channels;

import j$.adapter.a;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.a)) {
            return new j$.desugar.sun.nio.fs.a(fileChannel);
        }
        int i = j$.desugar.sun.nio.fs.a.b;
        return (j$.desugar.sun.nio.fs.a) fileChannel;
    }
}
