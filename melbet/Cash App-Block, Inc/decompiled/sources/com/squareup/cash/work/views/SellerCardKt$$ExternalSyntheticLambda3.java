package com.squareup.cash.work.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SellerCardKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Modifier f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ SellerCardKt$$ExternalSyntheticLambda3(Modifier modifier, float f, float f2, String str, LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel, Function1 function1, int i) {
        this.f$5 = modifier;
        this.f$2 = f;
        this.f$3 = f2;
        this.f$0 = str;
        this.f$1 = moreOptionsMenuModel;
        this.f$4 = function1;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                String str = this.f$0;
                SellerCardKt.m3805FallbackSellerCard1yyLQnY(str, (SellerCardSize) obj4, this.f$2, this.f$3, (Shape) obj3, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier = this.f$5;
                float f = this.f$2;
                float f2 = this.f$3;
                String str2 = this.f$0;
                LocalBrandLocationRowKt.LocalBrandProfileCollapsedToolbar(modifier, f, f2, str2, (LocalBrandProfileViewModel.MoreOptionsMenuModel) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SellerCardKt$$ExternalSyntheticLambda3(String str, SellerCardSize sellerCardSize, float f, float f2, Shape shape, Modifier modifier, int i) {
        this.f$0 = str;
        this.f$1 = sellerCardSize;
        this.f$2 = f;
        this.f$3 = f2;
        this.f$4 = shape;
        this.f$5 = modifier;
        this.f$6 = i;
    }
}
