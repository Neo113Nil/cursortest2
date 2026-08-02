package com.squareup.cash.taptopay.backend.real;

import com.google.android.gms.maps.zzai;
import com.squareup.cash.taptopay.backend.api.EmvAlertType;
import com.squareup.cash.taptopay.backend.api.EmvCardStatus;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.backend.real.model.EcrApduData;
import com.squareup.scannerview.TextSetter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzai f$0;

    public /* synthetic */ RealEmbeddedCardReaderProcessor$$ExternalSyntheticLambda0(zzai zzaiVar, int i) {
        this.$r8$classId = i;
        this.f$0 = zzaiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        zzai zzaiVar = this.f$0;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                TextSetter textSetter = (TextSetter) zzaiVar.zza;
                textSetter.getClass();
                textSetter.getEmbeddedCardReader().sendRandomNumber(bArr);
                break;
            case 1:
                EmvCardStatus emvCardStatus = (EmvCardStatus) obj;
                emvCardStatus.getClass();
                if (emvCardStatus == EmvCardStatus.REMOVED) {
                    ((TextSetter) zzaiVar.zza).getEmbeddedCardReader().sendCardRemoved();
                }
                StateFlowImpl stateFlowImpl = (StateFlowImpl) zzaiVar.zzb;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, emvCardStatus);
                break;
            case 2:
                ((EcrApduData) obj).getClass();
                ((StateFlowImpl) zzaiVar.zzc).setValue(null);
                break;
            case 3:
                EmvPaymentResult emvPaymentResult = (EmvPaymentResult) obj;
                emvPaymentResult.getClass();
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) zzaiVar.zzd;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, emvPaymentResult);
                break;
            default:
                EmvAlertType emvAlertType = (EmvAlertType) obj;
                emvAlertType.getClass();
                StateFlowImpl stateFlowImpl3 = (StateFlowImpl) zzaiVar.zze;
                stateFlowImpl3.getClass();
                stateFlowImpl3.updateState(null, emvAlertType);
                break;
        }
        return Unit.INSTANCE;
    }
}
