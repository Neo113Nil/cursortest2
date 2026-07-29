package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.youappi.sdk.AdType;

/* loaded from: classes2.dex */
public class CardItem extends AdItem {

    @c(a = "cardConfig")
    private CardConfig _cardConfig;

    @Override // com.youappi.sdk.net.model.AdItem
    public AdType getAdType() {
        return AdType.CARD;
    }

    @Override // com.youappi.sdk.net.model.AdItem
    public CardConfig getCardConfig() {
        return this._cardConfig;
    }

    @Override // com.youappi.sdk.net.model.AdItem
    public EventUrls getEventUrls() {
        return this._cardConfig.getEventUrls();
    }

    public void setCardConfig(CardConfig cardConfig) {
        this._cardConfig = cardConfig;
    }
}
