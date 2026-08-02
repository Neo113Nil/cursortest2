package io.flutter.plugins.inapppurchase;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b4, ByteBuffer buffer) {
        i.e(buffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) readValue(buffer);
            if (l4 != null) {
                return PlatformBillingResponse.Companion.ofRaw((int) l4.longValue());
            }
            return null;
        }
        if (b4 == -126) {
            Long l5 = (Long) readValue(buffer);
            if (l5 != null) {
                return PlatformReplacementMode.Companion.ofRaw((int) l5.longValue());
            }
            return null;
        }
        if (b4 == -125) {
            Long l6 = (Long) readValue(buffer);
            if (l6 != null) {
                return PlatformProductType.Companion.ofRaw((int) l6.longValue());
            }
            return null;
        }
        if (b4 == -124) {
            Long l7 = (Long) readValue(buffer);
            if (l7 != null) {
                return PlatformBillingChoiceMode.Companion.ofRaw((int) l7.longValue());
            }
            return null;
        }
        if (b4 == -123) {
            Long l8 = (Long) readValue(buffer);
            if (l8 != null) {
                return PlatformBillingClientFeature.Companion.ofRaw((int) l8.longValue());
            }
            return null;
        }
        if (b4 == -122) {
            Long l9 = (Long) readValue(buffer);
            if (l9 != null) {
                return PlatformPurchaseState.Companion.ofRaw((int) l9.longValue());
            }
            return null;
        }
        if (b4 == -121) {
            Long l10 = (Long) readValue(buffer);
            if (l10 != null) {
                return PlatformRecurrenceMode.Companion.ofRaw((int) l10.longValue());
            }
            return null;
        }
        if (b4 == -120) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return PlatformQueryProduct.Companion.fromList(list);
            }
            return null;
        }
        if (b4 == -119) {
            Object readValue2 = readValue(buffer);
            List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (list2 != null) {
                return PlatformAccountIdentifiers.Companion.fromList(list2);
            }
            return null;
        }
        if (b4 == -118) {
            Object readValue3 = readValue(buffer);
            List<? extends Object> list3 = readValue3 instanceof List ? (List) readValue3 : null;
            if (list3 != null) {
                return PlatformBillingResult.Companion.fromList(list3);
            }
            return null;
        }
        if (b4 == -117) {
            Object readValue4 = readValue(buffer);
            List<? extends Object> list4 = readValue4 instanceof List ? (List) readValue4 : null;
            if (list4 != null) {
                return PlatformOneTimePurchaseOfferDetails.Companion.fromList(list4);
            }
            return null;
        }
        if (b4 == -116) {
            Object readValue5 = readValue(buffer);
            List<? extends Object> list5 = readValue5 instanceof List ? (List) readValue5 : null;
            if (list5 != null) {
                return PlatformProductDetails.Companion.fromList(list5);
            }
            return null;
        }
        if (b4 == -115) {
            Object readValue6 = readValue(buffer);
            List<? extends Object> list6 = readValue6 instanceof List ? (List) readValue6 : null;
            if (list6 != null) {
                return PlatformProductDetailsResponse.Companion.fromList(list6);
            }
            return null;
        }
        if (b4 == -114) {
            Object readValue7 = readValue(buffer);
            List<? extends Object> list7 = readValue7 instanceof List ? (List) readValue7 : null;
            if (list7 != null) {
                return PlatformAlternativeBillingOnlyReportingDetailsResponse.Companion.fromList(list7);
            }
            return null;
        }
        if (b4 == -113) {
            Object readValue8 = readValue(buffer);
            List<? extends Object> list8 = readValue8 instanceof List ? (List) readValue8 : null;
            if (list8 != null) {
                return PlatformBillingConfigResponse.Companion.fromList(list8);
            }
            return null;
        }
        if (b4 == -112) {
            Object readValue9 = readValue(buffer);
            List<? extends Object> list9 = readValue9 instanceof List ? (List) readValue9 : null;
            if (list9 != null) {
                return PlatformBillingFlowParams.Companion.fromList(list9);
            }
            return null;
        }
        if (b4 == -111) {
            Object readValue10 = readValue(buffer);
            List<? extends Object> list10 = readValue10 instanceof List ? (List) readValue10 : null;
            if (list10 != null) {
                return PlatformPricingPhase.Companion.fromList(list10);
            }
            return null;
        }
        if (b4 == -110) {
            Object readValue11 = readValue(buffer);
            List<? extends Object> list11 = readValue11 instanceof List ? (List) readValue11 : null;
            if (list11 != null) {
                return PlatformPurchase.Companion.fromList(list11);
            }
            return null;
        }
        if (b4 == -109) {
            Object readValue12 = readValue(buffer);
            List<? extends Object> list12 = readValue12 instanceof List ? (List) readValue12 : null;
            if (list12 != null) {
                return PlatformPendingPurchaseUpdate.Companion.fromList(list12);
            }
            return null;
        }
        if (b4 == -108) {
            Object readValue13 = readValue(buffer);
            List<? extends Object> list13 = readValue13 instanceof List ? (List) readValue13 : null;
            if (list13 != null) {
                return PlatformPurchaseHistoryRecord.Companion.fromList(list13);
            }
            return null;
        }
        if (b4 == -107) {
            Object readValue14 = readValue(buffer);
            List<? extends Object> list14 = readValue14 instanceof List ? (List) readValue14 : null;
            if (list14 != null) {
                return PlatformPurchaseHistoryResponse.Companion.fromList(list14);
            }
            return null;
        }
        if (b4 == -106) {
            Object readValue15 = readValue(buffer);
            List<? extends Object> list15 = readValue15 instanceof List ? (List) readValue15 : null;
            if (list15 != null) {
                return PlatformPurchasesResponse.Companion.fromList(list15);
            }
            return null;
        }
        if (b4 == -105) {
            Object readValue16 = readValue(buffer);
            List<? extends Object> list16 = readValue16 instanceof List ? (List) readValue16 : null;
            if (list16 != null) {
                return PlatformSubscriptionOfferDetails.Companion.fromList(list16);
            }
            return null;
        }
        if (b4 == -104) {
            Object readValue17 = readValue(buffer);
            List<? extends Object> list17 = readValue17 instanceof List ? (List) readValue17 : null;
            if (list17 != null) {
                return PlatformUserChoiceDetails.Companion.fromList(list17);
            }
            return null;
        }
        if (b4 == -103) {
            Object readValue18 = readValue(buffer);
            List<? extends Object> list18 = readValue18 instanceof List ? (List) readValue18 : null;
            if (list18 != null) {
                return PlatformUserChoiceProduct.Companion.fromList(list18);
            }
            return null;
        }
        if (b4 == -102) {
            Object readValue19 = readValue(buffer);
            List<? extends Object> list19 = readValue19 instanceof List ? (List) readValue19 : null;
            if (list19 != null) {
                return PlatformInstallmentPlanDetails.Companion.fromList(list19);
            }
            return null;
        }
        if (b4 == -101) {
            Object readValue20 = readValue(buffer);
            List<? extends Object> list20 = readValue20 instanceof List ? (List) readValue20 : null;
            if (list20 != null) {
                return PlatformPendingPurchasesParams.Companion.fromList(list20);
            }
            return null;
        }
        if (b4 != -100) {
            return super.readValueOfType(b4, buffer);
        }
        Object readValue21 = readValue(buffer);
        List<? extends Object> list21 = readValue21 instanceof List ? (List) readValue21 : null;
        if (list21 != null) {
            return PlatformUnfetchedProduct.Companion.fromList(list21);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        i.e(stream, "stream");
        if (obj instanceof PlatformBillingResponse) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((PlatformBillingResponse) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformReplacementMode) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((PlatformReplacementMode) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformProductType) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((PlatformProductType) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformBillingChoiceMode) {
            stream.write(132);
            writeValue(stream, Long.valueOf(((PlatformBillingChoiceMode) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformBillingClientFeature) {
            stream.write(133);
            writeValue(stream, Long.valueOf(((PlatformBillingClientFeature) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformPurchaseState) {
            stream.write(134);
            writeValue(stream, Long.valueOf(((PlatformPurchaseState) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformRecurrenceMode) {
            stream.write(135);
            writeValue(stream, Long.valueOf(((PlatformRecurrenceMode) obj).getRaw()));
            return;
        }
        if (obj instanceof PlatformQueryProduct) {
            stream.write(136);
            writeValue(stream, ((PlatformQueryProduct) obj).toList());
            return;
        }
        if (obj instanceof PlatformAccountIdentifiers) {
            stream.write(137);
            writeValue(stream, ((PlatformAccountIdentifiers) obj).toList());
            return;
        }
        if (obj instanceof PlatformBillingResult) {
            stream.write(138);
            writeValue(stream, ((PlatformBillingResult) obj).toList());
            return;
        }
        if (obj instanceof PlatformOneTimePurchaseOfferDetails) {
            stream.write(139);
            writeValue(stream, ((PlatformOneTimePurchaseOfferDetails) obj).toList());
            return;
        }
        if (obj instanceof PlatformProductDetails) {
            stream.write(140);
            writeValue(stream, ((PlatformProductDetails) obj).toList());
            return;
        }
        if (obj instanceof PlatformProductDetailsResponse) {
            stream.write(141);
            writeValue(stream, ((PlatformProductDetailsResponse) obj).toList());
            return;
        }
        if (obj instanceof PlatformAlternativeBillingOnlyReportingDetailsResponse) {
            stream.write(142);
            writeValue(stream, ((PlatformAlternativeBillingOnlyReportingDetailsResponse) obj).toList());
            return;
        }
        if (obj instanceof PlatformBillingConfigResponse) {
            stream.write(143);
            writeValue(stream, ((PlatformBillingConfigResponse) obj).toList());
            return;
        }
        if (obj instanceof PlatformBillingFlowParams) {
            stream.write(144);
            writeValue(stream, ((PlatformBillingFlowParams) obj).toList());
            return;
        }
        if (obj instanceof PlatformPricingPhase) {
            stream.write(145);
            writeValue(stream, ((PlatformPricingPhase) obj).toList());
            return;
        }
        if (obj instanceof PlatformPurchase) {
            stream.write(146);
            writeValue(stream, ((PlatformPurchase) obj).toList());
            return;
        }
        if (obj instanceof PlatformPendingPurchaseUpdate) {
            stream.write(147);
            writeValue(stream, ((PlatformPendingPurchaseUpdate) obj).toList());
            return;
        }
        if (obj instanceof PlatformPurchaseHistoryRecord) {
            stream.write(148);
            writeValue(stream, ((PlatformPurchaseHistoryRecord) obj).toList());
            return;
        }
        if (obj instanceof PlatformPurchaseHistoryResponse) {
            stream.write(149);
            writeValue(stream, ((PlatformPurchaseHistoryResponse) obj).toList());
            return;
        }
        if (obj instanceof PlatformPurchasesResponse) {
            stream.write(150);
            writeValue(stream, ((PlatformPurchasesResponse) obj).toList());
            return;
        }
        if (obj instanceof PlatformSubscriptionOfferDetails) {
            stream.write(151);
            writeValue(stream, ((PlatformSubscriptionOfferDetails) obj).toList());
            return;
        }
        if (obj instanceof PlatformUserChoiceDetails) {
            stream.write(152);
            writeValue(stream, ((PlatformUserChoiceDetails) obj).toList());
            return;
        }
        if (obj instanceof PlatformUserChoiceProduct) {
            stream.write(153);
            writeValue(stream, ((PlatformUserChoiceProduct) obj).toList());
            return;
        }
        if (obj instanceof PlatformInstallmentPlanDetails) {
            stream.write(154);
            writeValue(stream, ((PlatformInstallmentPlanDetails) obj).toList());
        } else if (obj instanceof PlatformPendingPurchasesParams) {
            stream.write(155);
            writeValue(stream, ((PlatformPendingPurchasesParams) obj).toList());
        } else if (!(obj instanceof PlatformUnfetchedProduct)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(156);
            writeValue(stream, ((PlatformUnfetchedProduct) obj).toList());
        }
    }
}
