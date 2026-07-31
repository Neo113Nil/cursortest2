package com.bytedance.sdk.component.adexpress.btk;

/* loaded from: classes5.dex */
public interface fs {
    String adInfo();

    String appInfo();

    void changeVideoState(String str);

    void clickEvent(String str);

    void dynamicTrack(String str);

    String getCurrentVideoState();

    String getData(String str);

    String getTemplateInfo();

    void initRenderFinish();

    void muteVideo(String str);

    void renderDidFinish(String str);

    void skipVideo();

    void videoFrameChanged(String str);

    void zmn(String str);
}
