package com.google.android.exoplayer2.upstream;

@Deprecated
/* loaded from: classes3.dex */
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z7, int i8);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z7);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z7);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z7);
}
