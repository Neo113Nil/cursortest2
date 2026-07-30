package com.google.android.exoplayer2.mediacodec;

import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: com.google.android.exoplayer2.mediacodec.r
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z7, boolean z8) {
            return MediaCodecUtil.getDecoderInfos(str, z7, z8);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z7, boolean z8);
}
