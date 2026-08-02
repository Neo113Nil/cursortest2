package com.squareup.protos.cash.paymenttemplate.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OonPaymentMethod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzkg zzkgVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OonPaymentMethod((OonPaymentMethodType) obj, zzkgVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = OonPaymentMethodType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                zzkgVar = new OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail((CashP2PFiatMethodDetail) CashP2PFiatMethodDetail.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                zzkgVar = new OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail((SquareWebPaymentMethodDetail) SquareWebPaymentMethodDetail.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkgVar = new OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail((UsdcP2pMethodDetail) UsdcP2pMethodDetail.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OonPaymentMethod oonPaymentMethod = (OonPaymentMethod) obj;
        reverseProtoWriter.getClass();
        oonPaymentMethod.getClass();
        reverseProtoWriter.writeBytes(oonPaymentMethod.unknownFields());
        zzkg zzkgVar = oonPaymentMethod.payment_method_detail;
        if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) {
            CashP2PFiatMethodDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) zzkgVar).value);
        } else if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) {
            SquareWebPaymentMethodDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) zzkgVar).value);
        } else if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) {
            UsdcP2pMethodDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) zzkgVar).value);
        } else if (zzkgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        OonPaymentMethodType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, oonPaymentMethod.f1325type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OonPaymentMethod oonPaymentMethod = (OonPaymentMethod) obj;
        oonPaymentMethod.getClass();
        int encodedSizeWithTag = OonPaymentMethodType.ADAPTER.encodedSizeWithTag(1, oonPaymentMethod.f1325type) + oonPaymentMethod.unknownFields().getSize$okio();
        zzkg zzkgVar = oonPaymentMethod.payment_method_detail;
        if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) {
            return CashP2PFiatMethodDetail.ADAPTER.encodedSizeWithTag(2, ((OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) zzkgVar).value) + encodedSizeWithTag;
        }
        if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) {
            return SquareWebPaymentMethodDetail.ADAPTER.encodedSizeWithTag(3, ((OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) zzkgVar).value) + encodedSizeWithTag;
        }
        if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) {
            return UsdcP2pMethodDetail.ADAPTER.encodedSizeWithTag(4, ((OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) zzkgVar).value) + encodedSizeWithTag;
        }
        if (zzkgVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OonPaymentMethod oonPaymentMethod = (OonPaymentMethod) obj;
        oonPaymentMethod.getClass();
        ByteString byteString = ByteString.EMPTY;
        OonPaymentMethodType oonPaymentMethodType = oonPaymentMethod.f1325type;
        zzkg zzkgVar = oonPaymentMethod.payment_method_detail;
        byteString.getClass();
        return new OonPaymentMethod(oonPaymentMethodType, zzkgVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OonPaymentMethod oonPaymentMethod = (OonPaymentMethod) obj;
        oonPaymentMethod.getClass();
        OonPaymentMethodType.ADAPTER.encodeWithTag(protoWriter, 1, oonPaymentMethod.f1325type);
        zzkg zzkgVar = oonPaymentMethod.payment_method_detail;
        if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) {
            CashP2PFiatMethodDetail.ADAPTER.encodeWithTag(protoWriter, 2, ((OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) zzkgVar).value);
        } else if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) {
            SquareWebPaymentMethodDetail.ADAPTER.encodeWithTag(protoWriter, 3, ((OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) zzkgVar).value);
        } else if (zzkgVar instanceof OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) {
            UsdcP2pMethodDetail.ADAPTER.encodeWithTag(protoWriter, 4, ((OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) zzkgVar).value);
        } else if (zzkgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(oonPaymentMethod.unknownFields());
    }
}
