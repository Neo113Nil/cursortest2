package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBookletV1;

/* loaded from: classes8.dex */
public final class GreenBookletV1$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBookletV1((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Money) obj4, m, (GreenBookletV1.BookletFooterButton) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    m.add(BookletTile.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(GreenBookletV1.BookletFooterButton.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBookletV1 greenBookletV1 = (GreenBookletV1) obj;
        reverseProtoWriter.getClass();
        greenBookletV1.getClass();
        reverseProtoWriter.writeBytes(greenBookletV1.unknownFields());
        GreenBookletV1.BookletFooterButton.ADAPTER.encodeWithTag(reverseProtoWriter, 6, greenBookletV1.primary_footer_button);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, greenBookletV1.tiles);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, greenBookletV1.threshold_amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, greenBookletV1.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, greenBookletV1.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, greenBookletV1.hero_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GreenBookletV1 greenBookletV1 = (GreenBookletV1) obj;
        greenBookletV1.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, greenBookletV1.hero_image) + greenBookletV1.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return GreenBookletV1.BookletFooterButton.ADAPTER.encodedSizeWithTag(6, greenBookletV1.primary_footer_button) + BookletTile.ADAPTER.asRepeated().encodedSizeWithTag(5, greenBookletV1.tiles) + Money.ADAPTER.encodedSizeWithTag(4, greenBookletV1.threshold_amount) + protoAdapter.encodedSizeWithTag(3, greenBookletV1.subtitle) + protoAdapter.encodedSizeWithTag(2, greenBookletV1.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBookletV1 greenBookletV1 = (GreenBookletV1) obj;
        greenBookletV1.getClass();
        Image image = greenBookletV1.hero_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = greenBookletV1.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = greenBookletV1.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Money money = greenBookletV1.threshold_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(greenBookletV1.tiles, BookletTile.ADAPTER);
        GreenBookletV1.BookletFooterButton bookletFooterButton = greenBookletV1.primary_footer_button;
        GreenBookletV1.BookletFooterButton bookletFooterButton2 = bookletFooterButton != null ? (GreenBookletV1.BookletFooterButton) GreenBookletV1.BookletFooterButton.ADAPTER.redact(bookletFooterButton) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GreenBookletV1(image2, localizedString2, localizedString4, money2, m1169redactElements, bookletFooterButton2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBookletV1 greenBookletV1 = (GreenBookletV1) obj;
        greenBookletV1.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, greenBookletV1.hero_image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, greenBookletV1.title);
        protoAdapter.encodeWithTag(protoWriter, 3, greenBookletV1.subtitle);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, greenBookletV1.threshold_amount);
        BookletTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, greenBookletV1.tiles);
        GreenBookletV1.BookletFooterButton.ADAPTER.encodeWithTag(protoWriter, 6, greenBookletV1.primary_footer_button);
        protoWriter.writeBytes(greenBookletV1.unknownFields());
    }
}
