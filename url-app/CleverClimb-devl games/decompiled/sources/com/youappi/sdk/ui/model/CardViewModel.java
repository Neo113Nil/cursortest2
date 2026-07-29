package com.youappi.sdk.ui.model;

import com.youappi.sdk.net.model.CardItem;
import com.youappi.sdk.net.model.ConfigurationItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CardViewModel extends AdViewModel<CardItem> {
    private ArrayList<String> _assetList;
    private final String _cardUrl;
    private CardWebViewConfig _cardViewConfig;

    public CardViewModel(CardItem cardItem, ConfigurationItem configurationItem) {
        super(cardItem, configurationItem);
        this._cardUrl = cardItem.getCardConfig().getAssets().getCardUrl();
        this._cardViewConfig = new CardWebViewConfig(cardItem.getCardConfig(), cardItem.getPromotedItem(), cardItem.getCardConfig().getAssets());
    }

    @Override // com.youappi.sdk.ui.model.AdViewModel
    public List<String> getAssetUrls() {
        if (this._assetList == null || this._assetList.isEmpty()) {
            this._assetList = new ArrayList<>();
            if (getCardViewConfig().getIconUrl() != null && !getCardViewConfig().getIconUrl().isEmpty()) {
                this._assetList.add(getCardViewConfig().getIconUrl());
            }
            this._assetList.addAll(getCardViewConfig().getLandscapeImageUrlList());
            this._assetList.addAll(getCardViewConfig().getPortraitImageUrlList());
            this._assetList.addAll(getCardViewConfig().getStaticAssetUrls().asMap().values());
        }
        return this._assetList;
    }

    public String getCardUrl() {
        return this._cardUrl;
    }

    public CardWebViewConfig getCardViewConfig() {
        return this._cardViewConfig;
    }
}
