package squareup.cash.savings;

import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.savings.SavingsScreen;

/* loaded from: classes10.dex */
public final class SavingsScreen$Element$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        AnalyticsMappersKt analyticsMappersKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsScreen.Element(analyticsMappersKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                analyticsMappersKt = new SavingsScreen$Element$ElementType$ArcadeElement((ArcadeElement) ArcadeElement.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                analyticsMappersKt = new SavingsScreen$Element$ElementType$SavingsElement((SavingsElement) SavingsElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                analyticsMappersKt = new SavingsScreen$Element$ElementType$SavingsExternalElementsReference((SavingsExternalElementsReference) SavingsExternalElementsReference.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsScreen.Element element = (SavingsScreen.Element) obj;
        reverseProtoWriter.getClass();
        element.getClass();
        reverseProtoWriter.writeBytes(element.unknownFields());
        AnalyticsMappersKt analyticsMappersKt = element.element_type;
        if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$ArcadeElement) {
            ArcadeElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SavingsScreen$Element$ElementType$ArcadeElement) analyticsMappersKt).value);
            return;
        }
        if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsElement) {
            SavingsElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SavingsScreen$Element$ElementType$SavingsElement) analyticsMappersKt).value);
        } else if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsExternalElementsReference) {
            SavingsExternalElementsReference.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SavingsScreen$Element$ElementType$SavingsExternalElementsReference) analyticsMappersKt).value);
        } else {
            if (analyticsMappersKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SavingsScreen.Element element = (SavingsScreen.Element) obj;
        element.getClass();
        int size$okio = element.unknownFields().getSize$okio();
        AnalyticsMappersKt analyticsMappersKt = element.element_type;
        if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$ArcadeElement) {
            encodedSizeWithTag = ArcadeElement.ADAPTER.encodedSizeWithTag(1, ((SavingsScreen$Element$ElementType$ArcadeElement) analyticsMappersKt).value);
        } else if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsElement) {
            encodedSizeWithTag = SavingsElement.ADAPTER.encodedSizeWithTag(2, ((SavingsScreen$Element$ElementType$SavingsElement) analyticsMappersKt).value);
        } else {
            if (!(analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsExternalElementsReference)) {
                if (analyticsMappersKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SavingsExternalElementsReference.ADAPTER.encodedSizeWithTag(3, ((SavingsScreen$Element$ElementType$SavingsExternalElementsReference) analyticsMappersKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsScreen.Element element = (SavingsScreen.Element) obj;
        element.getClass();
        ByteString byteString = ByteString.EMPTY;
        AnalyticsMappersKt analyticsMappersKt = element.element_type;
        byteString.getClass();
        return new SavingsScreen.Element(analyticsMappersKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsScreen.Element element = (SavingsScreen.Element) obj;
        element.getClass();
        AnalyticsMappersKt analyticsMappersKt = element.element_type;
        if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$ArcadeElement) {
            ArcadeElement.ADAPTER.encodeWithTag(protoWriter, 1, ((SavingsScreen$Element$ElementType$ArcadeElement) analyticsMappersKt).value);
        } else if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsElement) {
            SavingsElement.ADAPTER.encodeWithTag(protoWriter, 2, ((SavingsScreen$Element$ElementType$SavingsElement) analyticsMappersKt).value);
        } else if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsExternalElementsReference) {
            SavingsExternalElementsReference.ADAPTER.encodeWithTag(protoWriter, 3, ((SavingsScreen$Element$ElementType$SavingsExternalElementsReference) analyticsMappersKt).value);
        } else if (analyticsMappersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(element.unknownFields());
    }
}
