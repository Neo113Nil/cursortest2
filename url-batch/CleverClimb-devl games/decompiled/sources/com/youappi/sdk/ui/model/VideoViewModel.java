package com.youappi.sdk.ui.model;

import com.youappi.sdk.net.model.ConfigurationItem;
import com.youappi.sdk.net.model.VideoItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class VideoViewModel extends AdViewModel<VideoItem> {
    private ArrayList<String> _assetList;

    public VideoViewModel(VideoItem videoItem, ConfigurationItem configurationItem) {
        super(videoItem, configurationItem);
    }

    @Override // com.youappi.sdk.ui.model.AdViewModel
    public List<String> getAssetUrls() {
        if (this._assetList == null || this._assetList.isEmpty()) {
            this._assetList = new ArrayList<>();
            this._assetList.add(getAdItem().getVideoConfig().getVideoUrl());
        }
        return this._assetList;
    }
}
