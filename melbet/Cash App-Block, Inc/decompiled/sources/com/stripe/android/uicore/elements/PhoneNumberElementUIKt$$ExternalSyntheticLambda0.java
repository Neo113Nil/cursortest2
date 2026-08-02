package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import com.google.android.gms.internal.mlkit_vision_common.zzb;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class PhoneNumberElementUIKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PhoneNumberController f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;
    public final /* synthetic */ FocusRequester f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ PhoneNumberElementUIKt$$ExternalSyntheticLambda0(PhoneNumberController phoneNumberController, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, FocusRequester focusRequester, int i) {
        this.f$1 = phoneNumberController;
        this.f$2 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$6 = focusRequester;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    zzb.m2025PhoneNumberElementUIRts_TWA(this.f$1, this.f$2, this.f$3, this.f$6, this.f$7, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zzb.m2025PhoneNumberElementUIRts_TWA(this.f$1, this.f$2, this.f$3, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PhoneNumberElementUIKt$$ExternalSyntheticLambda0(PhoneNumberController phoneNumberController, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, FocusRequester focusRequester, int i, int i2) {
        this.f$1 = phoneNumberController;
        this.f$2 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$6 = focusRequester;
        this.f$7 = i;
    }
}
