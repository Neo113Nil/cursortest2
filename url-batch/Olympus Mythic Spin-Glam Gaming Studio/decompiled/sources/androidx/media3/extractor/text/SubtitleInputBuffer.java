package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;

@UnstableApi
/* loaded from: classes10.dex */
public class SubtitleInputBuffer extends DecoderInputBuffer {
    public long subsampleOffsetUs;

    public SubtitleInputBuffer() {
        super(1);
    }
}
