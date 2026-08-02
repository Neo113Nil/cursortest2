package com.squareup.cash.treehouse.android.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class LoadingScrim$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LoadingScrim f$0;

    public /* synthetic */ LoadingScrim$$ExternalSyntheticLambda0(LoadingScrim loadingScrim) {
        this.f$0 = loadingScrim;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        LoadingScrim loadingScrim = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = LoadingScrim.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LoadingScrimKt.LoadingScrim(0, gapComposer, null, ((Boolean) loadingScrim.isLoading$delegate.getValue()).booleanValue());
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                int i3 = LoadingScrim.$r8$clinit;
                loadingScrim.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LoadingScrim$$ExternalSyntheticLambda0(LoadingScrim loadingScrim, int i) {
        this.f$0 = loadingScrim;
    }
}
