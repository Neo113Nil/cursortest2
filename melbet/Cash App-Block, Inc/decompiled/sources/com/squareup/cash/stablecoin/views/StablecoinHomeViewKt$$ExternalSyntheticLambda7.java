package com.squareup.cash.stablecoin.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.glance.appwidget.WidgetLayoutKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class StablecoinHomeViewKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ StablecoinHomeViewKt$$ExternalSyntheticLambda7(Modifier modifier, ArrayList arrayList, int i) {
        this.$r8$classId = 1;
        this.f$1 = modifier;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$1;
        ArrayList arrayList = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                WidgetLayoutKt.AppletContent(Updater.updateChangedFlags(1), composer, modifier, arrayList);
                break;
            case 1:
                BenefitsHomeViewKt.ExplanationBody(Updater.updateChangedFlags(1), composer, modifier, arrayList);
                break;
            default:
                OnUndeliveredElementKt.InvestingGraphDetails(Updater.updateChangedFlags(1), composer, modifier, arrayList);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StablecoinHomeViewKt$$ExternalSyntheticLambda7(ArrayList arrayList, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arrayList;
        this.f$1 = modifier;
    }
}
