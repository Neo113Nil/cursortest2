package com.squareup.cash.wallet.db;

import app.cash.local.db.Local_tab_content;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.postcard.CardRenderingInfo;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Local_tab_content.Adapter cardTabHeroState = new Local_tab_content.Adapter(new WireAdapter(CardRenderingInfo.ADAPTER));
}
