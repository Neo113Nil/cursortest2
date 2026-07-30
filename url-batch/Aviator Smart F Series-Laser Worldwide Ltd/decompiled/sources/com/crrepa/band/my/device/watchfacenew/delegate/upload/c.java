package com.crrepa.band.my.device.watchfacenew.delegate.upload;

import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void destroy();

    void renderBandDisconnected();

    void renderLowBatteryHint();

    void renderLowStorage();

    void renderPointerDownloadFailed();

    void renderThumbTransCompleted();

    void renderTransCompleted();

    void renderTransError(int i8, List<String> list);

    void renderTransProgressChanged(int i8);

    void renderTransProgressStarting();
}
