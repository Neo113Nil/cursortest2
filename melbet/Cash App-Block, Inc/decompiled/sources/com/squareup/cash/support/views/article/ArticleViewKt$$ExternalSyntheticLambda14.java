package com.squareup.cash.support.views.article;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArticleViewKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda14(Function1 function1, boolean z, int i) {
        this.f$0 = function1;
        this.f$1 = z;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.getClass();
                ArticleViewKt.Error(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            default:
                num.intValue();
                BitcoinMapViewKt.LoadedBitcoinMapOnboardingView(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda14(boolean z, Function1 function1, int i) {
        this.f$1 = z;
        this.f$0 = function1;
        this.f$2 = i;
    }
}
