package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.common.collect.ImmutableMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    static {
        CmcdConfiguration.Factory factory = CmcdConfiguration.Factory.DEFAULT;
    }

    public static /* synthetic */ CmcdConfiguration a(MediaItem mediaItem) {
        String uuid = UUID.randomUUID().toString();
        String str = mediaItem.mediaId;
        if (str == null) {
            str = "";
        }
        return new CmcdConfiguration(uuid, str, new CmcdConfiguration.RequestConfig() { // from class: com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory.1
            AnonymousClass1() {
            }

            @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
            public /* synthetic */ ImmutableMap getCustomData() {
                return e.a(this);
            }

            @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
            public /* synthetic */ int getRequestedMaximumThroughputKbps(int i8) {
                return e.b(this, i8);
            }

            @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
            public /* synthetic */ boolean isKeyAllowed(String str2) {
                return e.c(this, str2);
            }
        });
    }
}
