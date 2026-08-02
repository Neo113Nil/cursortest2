package com.squareup.protos.cash.api.sandbox;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public enum MagicValue implements WireEnum {
    PaymentApprovedConnectionError(1),
    PaymentDeclineCompliance(2),
    PaymentDeclineInsufficientFunds(3),
    PaymentDeclineOther(4),
    PaymentDeclineRisk(5),
    PaymentDeclineTooLarge(6),
    PaymentDeclineTooSmall(7),
    PaymentDeclineGrantConsumed(8),
    PaymentDeclineGrantExpired(9),
    PaymentDeclineGrantMissing(10),
    PaymentDeclineGrantRevoked(11),
    PaymentCreationFailureMerchantDisabled(12),
    PaymentCreationFailureMerchantPending(13),
    PaymentCreationFailureMerchantMissing(14),
    RefundApprovedConnectionError(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO),
    RefundDeclineCompliance(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO),
    RefundDeclineOther(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA),
    RefundDeclineRisk(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE),
    RefundDeclineTooLarge(1004),
    RefundDeclineTooSmall(IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO),
    RefundDeclineGrantConsumed(IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES),
    RefundDeclineGrantExpired(IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO),
    RefundDeclineGrantMissing(IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION),
    RefundDeclineGrantRevoked(IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION),
    RefundCreationFailureMerchantDisabled(IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR),
    RefundCreationFailureMerchantMissing(IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS),
    RefundCreationFailureMerchantPending(IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO),
    CreateDisputeCD10(2000),
    CreateDisputeCD11(2001),
    CreateDisputeCD12(2002),
    CreateDisputeCD13(2003),
    CreateDisputeFR10(2004),
    CreateDisputeFR11(2005),
    CreateDisputePE10(2006),
    CreateDisputePE11(2007),
    CreateDisputePE12(2008),
    CreateDisputeAmountDifferent(2009),
    CustomerRequestFailureCustomerIneligible(3000);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final MagicValue$Companion$ADAPTER$1 ADAPTER = new MagicValue$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MagicValue.class), Syntax.PROTO_2, null);

    MagicValue(int i) {
        this.value = i;
    }

    public static final MagicValue fromValue(int i) {
        Companion.getClass();
        return Op.Companion.m3672fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
