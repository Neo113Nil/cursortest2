package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzeb;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineStatusData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzeb creditLine$CreditLineStatusData$Routing$ClientRoute;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        zzeb zzebVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLine.CreditLineStatusData((CreditLine.CreditLineStatusData.Icon) obj, (String) obj2, (String) obj3, (Boolean) obj4, zzebVar, (LocalizableString) obj5, (LocalizableString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CreditLine.CreditLineStatusData.Icon.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 5:
                    try {
                        creditLine$CreditLineStatusData$Routing$ClientRoute = new CreditLine$CreditLineStatusData$Routing$ClientScenario((ClientScenario) ClientScenario.ADAPTER.decode(protoReader));
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    creditLine$CreditLineStatusData$Routing$ClientRoute = new CreditLine$CreditLineStatusData$Routing$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    continue;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj6);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzebVar = creditLine$CreditLineStatusData$Routing$ClientRoute;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.CreditLineStatusData creditLineStatusData = (CreditLine.CreditLineStatusData) obj;
        reverseProtoWriter.getClass();
        creditLineStatusData.getClass();
        reverseProtoWriter.writeBytes(creditLineStatusData.unknownFields());
        zzeb zzebVar = creditLineStatusData.routing;
        if (zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientScenario) {
            ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CreditLine$CreditLineStatusData$Routing$ClientScenario) zzebVar).value);
        } else if (zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, ((CreditLine$CreditLineStatusData$Routing$ClientRoute) zzebVar).value);
        } else if (zzebVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, creditLineStatusData.localizable_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, creditLineStatusData.localizable_title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, creditLineStatusData.badged);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, creditLineStatusData.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, creditLineStatusData.title);
        CreditLine.CreditLineStatusData.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditLineStatusData.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CreditLine.CreditLineStatusData creditLineStatusData = (CreditLine.CreditLineStatusData) obj;
        creditLineStatusData.getClass();
        int encodedSizeWithTag2 = CreditLine.CreditLineStatusData.Icon.ADAPTER.encodedSizeWithTag(1, creditLineStatusData.icon) + creditLineStatusData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, creditLineStatusData.badged) + protoAdapter.encodedSizeWithTag(3, creditLineStatusData.subtitle) + protoAdapter.encodedSizeWithTag(2, creditLineStatusData.title) + encodedSizeWithTag2;
        zzeb zzebVar = creditLineStatusData.routing;
        if (zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientScenario) {
            encodedSizeWithTag = ClientScenario.ADAPTER.encodedSizeWithTag(5, ((CreditLine$CreditLineStatusData$Routing$ClientScenario) zzebVar).value);
        } else {
            if (!(zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientRoute)) {
                if (zzebVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(8, creditLineStatusData.localizable_subtitle) + protoAdapter2.encodedSizeWithTag(7, creditLineStatusData.localizable_title) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, ((CreditLine$CreditLineStatusData$Routing$ClientRoute) zzebVar).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        ProtoAdapter protoAdapter22 = LocalizableString.ADAPTER;
        return protoAdapter22.encodedSizeWithTag(8, creditLineStatusData.localizable_subtitle) + protoAdapter22.encodedSizeWithTag(7, creditLineStatusData.localizable_title) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.CreditLineStatusData creditLineStatusData = (CreditLine.CreditLineStatusData) obj;
        creditLineStatusData.getClass();
        LocalizableString localizableString = creditLineStatusData.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = creditLineStatusData.localizable_subtitle;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        CreditLine.CreditLineStatusData.Icon icon = creditLineStatusData.icon;
        String str = creditLineStatusData.title;
        String str2 = creditLineStatusData.subtitle;
        Boolean bool = creditLineStatusData.badged;
        zzeb zzebVar = creditLineStatusData.routing;
        byteString.getClass();
        return new CreditLine.CreditLineStatusData(icon, str, str2, bool, zzebVar, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.CreditLineStatusData creditLineStatusData = (CreditLine.CreditLineStatusData) obj;
        creditLineStatusData.getClass();
        CreditLine.CreditLineStatusData.Icon.ADAPTER.encodeWithTag(protoWriter, 1, creditLineStatusData.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, creditLineStatusData.title);
        protoAdapter.encodeWithTag(protoWriter, 3, creditLineStatusData.subtitle);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, creditLineStatusData.badged);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, creditLineStatusData.localizable_title);
        protoAdapter2.encodeWithTag(protoWriter, 8, creditLineStatusData.localizable_subtitle);
        zzeb zzebVar = creditLineStatusData.routing;
        if (zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientScenario) {
            ClientScenario.ADAPTER.encodeWithTag(protoWriter, 5, ((CreditLine$CreditLineStatusData$Routing$ClientScenario) zzebVar).value);
        } else if (zzebVar instanceof CreditLine$CreditLineStatusData$Routing$ClientRoute) {
            protoAdapter.encodeWithTag(protoWriter, 6, ((CreditLine$CreditLineStatusData$Routing$ClientRoute) zzebVar).value);
        } else if (zzebVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(creditLineStatusData.unknownFields());
    }
}
