package com.squareup.cash.stablecoin.views;

import android.content.Context;
import coil3.RealImageLoader;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.cash.directory_ui.views.MooncakeHeaderView;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView;
import com.squareup.cash.upsell.views.NullStateSwipeView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StablecoinHomeViewKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealImageLoader f$0;

    public /* synthetic */ StablecoinHomeViewKt$$ExternalSyntheticLambda10(RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealImageLoader realImageLoader = this.f$0;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                return new NullStateSwipeView(context, realImageLoader);
            case 1:
                context.getClass();
                MooncakeHeaderView mooncakeHeaderView = new MooncakeHeaderView(context, realImageLoader);
                mooncakeHeaderView.setClipToOutline(true);
                return mooncakeHeaderView;
            case 2:
                context.getClass();
                MooncakeFlatRowItemView mooncakeFlatRowItemView = new MooncakeFlatRowItemView(context, realImageLoader);
                mooncakeFlatRowItemView.setTitleMaxLines(3);
                return mooncakeFlatRowItemView;
            case 3:
                context.getClass();
                return new InstrumentAvatarView(context, InstrumentAvatarView.Size.SMALL, realImageLoader);
            case 4:
                context.getClass();
                return new InvestingStockDetailsCollapsedToolbar(context, realImageLoader);
            case 5:
                context.getClass();
                return new MooncakeInvestingStockRowView(context, realImageLoader, null);
            case 6:
                context.getClass();
                return new InstrumentAvatarView(context, InstrumentAvatarView.Size.SMALL, realImageLoader);
            default:
                context.getClass();
                return new InstrumentAvatarView(context, InstrumentAvatarView.Size.MEDIUM, realImageLoader);
        }
    }
}
