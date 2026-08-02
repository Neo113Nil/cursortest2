package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzic zzicVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent(zzicVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$Text((GetEditorialResponse.EditorialContent.Text) GetEditorialResponse.EditorialContent.Text.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$Row((GetEditorialResponse.EditorialContent.Row) GetEditorialResponse.EditorialContent.Row.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$Preview((GetEditorialResponse.EditorialContent.Preview) GetEditorialResponse.EditorialContent.Preview.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$Spacer((GetEditorialResponse.EditorialContent.Spacer) GetEditorialResponse.EditorialContent.Spacer.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$Image((GetEditorialResponse.EditorialContent.Image) GetEditorialResponse.EditorialContent.Image.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzicVar = new GetEditorialResponse$EditorialContent$ContentType$BrandCarousel((GetEditorialResponse.EditorialContent.BrandCarousel) GetEditorialResponse.EditorialContent.BrandCarousel.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent editorialContent = (GetEditorialResponse.EditorialContent) obj;
        reverseProtoWriter.getClass();
        editorialContent.getClass();
        reverseProtoWriter.writeBytes(editorialContent.unknownFields());
        zzic zzicVar = editorialContent.content_type;
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Text) {
            GetEditorialResponse.EditorialContent.Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetEditorialResponse$EditorialContent$ContentType$Text) zzicVar).value);
            return;
        }
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Row) {
            GetEditorialResponse.EditorialContent.Row.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetEditorialResponse$EditorialContent$ContentType$Row) zzicVar).value);
            return;
        }
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Preview) {
            GetEditorialResponse.EditorialContent.Preview.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetEditorialResponse$EditorialContent$ContentType$Preview) zzicVar).value);
            return;
        }
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Spacer) {
            GetEditorialResponse.EditorialContent.Spacer.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetEditorialResponse$EditorialContent$ContentType$Spacer) zzicVar).value);
            return;
        }
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Image) {
            GetEditorialResponse.EditorialContent.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GetEditorialResponse$EditorialContent$ContentType$Image) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) {
            GetEditorialResponse.EditorialContent.BrandCarousel.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) zzicVar).value);
        } else {
            if (zzicVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetEditorialResponse.EditorialContent editorialContent = (GetEditorialResponse.EditorialContent) obj;
        editorialContent.getClass();
        int size$okio = editorialContent.unknownFields().getSize$okio();
        zzic zzicVar = editorialContent.content_type;
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Text) {
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.Text.ADAPTER.encodedSizeWithTag(1, ((GetEditorialResponse$EditorialContent$ContentType$Text) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Row) {
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.Row.ADAPTER.encodedSizeWithTag(2, ((GetEditorialResponse$EditorialContent$ContentType$Row) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Preview) {
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.Preview.ADAPTER.encodedSizeWithTag(3, ((GetEditorialResponse$EditorialContent$ContentType$Preview) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Spacer) {
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.Spacer.ADAPTER.encodedSizeWithTag(4, ((GetEditorialResponse$EditorialContent$ContentType$Spacer) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Image) {
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.Image.ADAPTER.encodedSizeWithTag(5, ((GetEditorialResponse$EditorialContent$ContentType$Image) zzicVar).value);
        } else {
            if (!(zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$BrandCarousel)) {
                if (zzicVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetEditorialResponse.EditorialContent.BrandCarousel.ADAPTER.encodedSizeWithTag(6, ((GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) zzicVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent editorialContent = (GetEditorialResponse.EditorialContent) obj;
        editorialContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzic zzicVar = editorialContent.content_type;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent(zzicVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent editorialContent = (GetEditorialResponse.EditorialContent) obj;
        editorialContent.getClass();
        zzic zzicVar = editorialContent.content_type;
        if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Text) {
            GetEditorialResponse.EditorialContent.Text.ADAPTER.encodeWithTag(protoWriter, 1, ((GetEditorialResponse$EditorialContent$ContentType$Text) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Row) {
            GetEditorialResponse.EditorialContent.Row.ADAPTER.encodeWithTag(protoWriter, 2, ((GetEditorialResponse$EditorialContent$ContentType$Row) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Preview) {
            GetEditorialResponse.EditorialContent.Preview.ADAPTER.encodeWithTag(protoWriter, 3, ((GetEditorialResponse$EditorialContent$ContentType$Preview) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Spacer) {
            GetEditorialResponse.EditorialContent.Spacer.ADAPTER.encodeWithTag(protoWriter, 4, ((GetEditorialResponse$EditorialContent$ContentType$Spacer) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$Image) {
            GetEditorialResponse.EditorialContent.Image.ADAPTER.encodeWithTag(protoWriter, 5, ((GetEditorialResponse$EditorialContent$ContentType$Image) zzicVar).value);
        } else if (zzicVar instanceof GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) {
            GetEditorialResponse.EditorialContent.BrandCarousel.ADAPTER.encodeWithTag(protoWriter, 6, ((GetEditorialResponse$EditorialContent$ContentType$BrandCarousel) zzicVar).value);
        } else if (zzicVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(editorialContent.unknownFields());
    }
}
