package com.youappi.sdk.ui.model;

import com.youappi.sdk.net.model.CardConfig;
import com.youappi.sdk.net.model.CardItem;
import com.youappi.sdk.net.model.ConfigurationItem;
import com.youappi.sdk.net.model.RewardedVideoItem;
import com.youappi.sdk.net.model.VideoItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class VideoCardViewModel extends AdViewModel<VideoItem> {
    private ArrayList<String> _assetList;
    private CardViewModel _cardViewModel;
    private VideoViewModel _videoViewModel;

    public VideoCardViewModel(RewardedVideoItem rewardedVideoItem, ConfigurationItem configurationItem) {
        super(rewardedVideoItem, configurationItem);
        init(rewardedVideoItem, configurationItem);
    }

    public VideoCardViewModel(VideoItem videoItem, ConfigurationItem configurationItem) {
        super(videoItem, configurationItem);
        init(videoItem, configurationItem);
    }

    private void init(VideoItem videoItem, ConfigurationItem configurationItem) {
        CardViewModel cardViewModel;
        CardConfig cardConfig = videoItem.getCardConfig();
        if (cardConfig != null) {
            CardItem cardItem = new CardItem();
            cardItem.setCampaignId(videoItem.getCampaignId());
            cardItem.setAdUnitID(videoItem.getAdUnitID());
            cardItem.setAdId(videoItem.getAdId());
            cardItem.setCardConfig(cardConfig);
            cardItem.setPromotedItem(videoItem.getPromotedItem());
            cardItem.setMoatDetails(videoItem.getMoatDetails());
            cardViewModel = new CardViewModel(cardItem, configurationItem);
        } else {
            cardViewModel = null;
        }
        this._cardViewModel = cardViewModel;
        this._videoViewModel = new VideoViewModel(videoItem, configurationItem);
    }

    @Override // com.youappi.sdk.ui.model.AdViewModel
    public List<String> getAssetUrls() {
        if (this._assetList == null || this._assetList.isEmpty()) {
            this._assetList = new ArrayList<>();
            this._assetList.addAll(this._videoViewModel.getAssetUrls());
            if (this._cardViewModel != null) {
                this._assetList.addAll(this._cardViewModel.getAssetUrls());
            }
        }
        return this._assetList;
    }

    public CardViewModel getCardViewModel() {
        return this._cardViewModel;
    }

    public VideoViewModel getVideoViewModel() {
        return this._videoViewModel;
    }
}
