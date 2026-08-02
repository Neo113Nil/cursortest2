package com.squareup.cash.treehouse.android.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class LoadingScrimKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ LoadingScrimKt$$ExternalSyntheticLambda1(Modifier modifier, boolean z, int i) {
        this.f$1 = modifier;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LoadingScrimKt.LoadingScrim(Updater.updateChangedFlags(1), composer, this.f$1, this.f$0);
                break;
            default:
                AlphaKt.DeleteIcon(Updater.updateChangedFlags(1), composer, this.f$1, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LoadingScrimKt$$ExternalSyntheticLambda1(boolean z, Modifier modifier, int i) {
        this.f$0 = z;
        this.f$1 = modifier;
    }
}
