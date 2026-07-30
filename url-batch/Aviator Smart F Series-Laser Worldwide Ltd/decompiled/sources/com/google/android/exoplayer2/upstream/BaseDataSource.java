package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public abstract class BaseDataSource implements DataSource {

    @Nullable
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners = new ArrayList<>(1);

    protected BaseDataSource(boolean z7) {
        this.isNetwork = z7;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        if (this.listeners.contains(transferListener)) {
            return;
        }
        this.listeners.add(transferListener);
        this.listenerCount++;
    }

    protected final void bytesTransferred(int i8) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i9 = 0; i9 < this.listenerCount; i9++) {
            this.listeners.get(i9).onBytesTransferred(this, dataSpec, this.isNetwork, i8);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return f.a(this);
    }

    protected final void transferEnded() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i8 = 0; i8 < this.listenerCount; i8++) {
            this.listeners.get(i8).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    protected final void transferInitializing(DataSpec dataSpec) {
        for (int i8 = 0; i8 < this.listenerCount; i8++) {
            this.listeners.get(i8).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    protected final void transferStarted(DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i8 = 0; i8 < this.listenerCount; i8++) {
            this.listeners.get(i8).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }
}
