package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public interface MetadataDecoder {
    @Nullable
    Metadata decode(MetadataInputBuffer metadataInputBuffer);
}
