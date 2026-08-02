package com.squareup.cash.wallet.db;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardTabHeroState {
    public final long _id;
    public final String card_token;
    public final Boolean enabled;
    public final Boolean facing_forward;
    public final CardRenderingInfo rendering_info;

    public CardTabHeroState(long j, String str, CardRenderingInfo cardRenderingInfo, Boolean bool, Boolean bool2) {
        this._id = j;
        this.card_token = str;
        this.rendering_info = cardRenderingInfo;
        this.facing_forward = bool;
        this.enabled = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTabHeroState)) {
            return false;
        }
        CardTabHeroState cardTabHeroState = (CardTabHeroState) obj;
        return this._id == cardTabHeroState._id && Intrinsics.areEqual(this.card_token, cardTabHeroState.card_token) && Intrinsics.areEqual(this.rendering_info, cardTabHeroState.rendering_info) && Intrinsics.areEqual(this.facing_forward, cardTabHeroState.facing_forward) && Intrinsics.areEqual(this.enabled, cardTabHeroState.enabled);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this._id) * 31;
        String str = this.card_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CardRenderingInfo cardRenderingInfo = this.rendering_info;
        int hashCode3 = (hashCode2 + (cardRenderingInfo == null ? 0 : cardRenderingInfo.hashCode())) * 31;
        Boolean bool = this.facing_forward;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("CardTabHeroState(_id=", this._id, ", card_token=", this.card_token);
        m.append(", rendering_info=");
        m.append(this.rendering_info);
        m.append(", facing_forward=");
        m.append(this.facing_forward);
        m.append(", enabled=");
        m.append(this.enabled);
        m.append(")");
        return m.toString();
    }
}
