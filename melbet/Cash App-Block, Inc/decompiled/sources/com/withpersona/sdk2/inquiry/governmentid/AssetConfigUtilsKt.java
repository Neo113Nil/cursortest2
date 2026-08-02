package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;

/* loaded from: classes9.dex */
public abstract class AssetConfigUtilsKt {
    public static final RemoteImage getAsset(NextStep.GovernmentId.AssetConfig.CapturePage capturePage, IdClass idClass, IdConfig.Side side) {
        capturePage.getClass();
        idClass.getClass();
        side.getClass();
        if (idClass == IdClass.Passport && side == IdConfig.Side.Front) {
            RemoteImage passportFrontPictograph = capturePage.getPassportFrontPictograph();
            return passportFrontPictograph == null ? capturePage.getIdFrontPictograph() : passportFrontPictograph;
        }
        if (side == IdConfig.Side.Front) {
            return capturePage.getIdFrontPictograph();
        }
        if (side == IdConfig.Side.Back) {
            return capturePage.getIdBackPictograph();
        }
        if (side == IdConfig.Side.PassportSignature) {
            return capturePage.getPassportSignaturePictograph();
        }
        if (side == IdConfig.Side.BarcodePdf417) {
            return capturePage.getBarcodePdf417Pictograph();
        }
        return null;
    }
}
