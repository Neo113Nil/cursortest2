package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.ActionButton;

/* loaded from: classes8.dex */
public final class GreenBookletV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GreenBookletV1> CREATOR;
    public final Image hero_image;
    public final BookletFooterButton primary_footer_button;
    public final LocalizedString subtitle;
    public final Money threshold_amount;
    public final List tiles;
    public final LocalizedString title;

    /* loaded from: classes10.dex */
    public final class BookletFooterButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BookletFooterButton> CREATOR;
        public final String client_route;
        public final LocalizedString text;

        static {
            GreenBookletV1$BookletFooterButton$Companion$ADAPTER$1 greenBookletV1$BookletFooterButton$Companion$ADAPTER$1 = new GreenBookletV1$BookletFooterButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BookletFooterButton.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBookletV1.BookletFooterButton", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBooklet.proto");
            ADAPTER = greenBookletV1$BookletFooterButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBookletV1$BookletFooterButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookletFooterButton(LocalizedString localizedString, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BookletFooterButton)) {
                return false;
            }
            BookletFooterButton bookletFooterButton = (BookletFooterButton) obj;
            return Intrinsics.areEqual(unknownFields(), bookletFooterButton.unknownFields()) && Intrinsics.areEqual(this.text, bookletFooterButton.text) && Intrinsics.areEqual(this.client_route, bookletFooterButton.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.client_route;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ActionButton.Builder builder = new ActionButton.Builder(5);
            builder.title = this.text;
            builder.client_route = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            String str = this.client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BookletFooterButton{", "}", 0, null, null, 56);
        }
    }

    static {
        GreenBookletV1$Companion$ADAPTER$1 greenBookletV1$Companion$ADAPTER$1 = new GreenBookletV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GreenBookletV1.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.GreenBookletV1", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBooklet.proto");
        ADAPTER = greenBookletV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(greenBookletV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreenBookletV1(Image image, LocalizedString localizedString, LocalizedString localizedString2, Money money, List list, BookletFooterButton bookletFooterButton, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.hero_image = image;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.threshold_amount = money;
        this.primary_footer_button = bookletFooterButton;
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreenBookletV1)) {
            return false;
        }
        GreenBookletV1 greenBookletV1 = (GreenBookletV1) obj;
        return Intrinsics.areEqual(unknownFields(), greenBookletV1.unknownFields()) && Intrinsics.areEqual(this.hero_image, greenBookletV1.hero_image) && Intrinsics.areEqual(this.title, greenBookletV1.title) && Intrinsics.areEqual(this.subtitle, greenBookletV1.subtitle) && Intrinsics.areEqual(this.threshold_amount, greenBookletV1.threshold_amount) && Intrinsics.areEqual(this.tiles, greenBookletV1.tiles) && Intrinsics.areEqual(this.primary_footer_button, greenBookletV1.primary_footer_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.hero_image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Money money = this.threshold_amount;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (money != null ? money.hashCode() : 0)) * 37, 37, this.tiles);
        BookletFooterButton bookletFooterButton = this.primary_footer_button;
        int hashCode5 = m + (bookletFooterButton != null ? bookletFooterButton.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(29, false);
        builder.full_name = this.hero_image;
        builder.photo_url = this.title;
        builder.synopsis = this.subtitle;
        builder.full_cashtag = this.threshold_amount;
        builder.cashtag_url_enabled = this.tiles;
        builder.is_verified_account = this.primary_footer_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.hero_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("hero_image=", image, arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Money money = this.threshold_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("threshold_amount=", money, arrayList);
        }
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        BookletFooterButton bookletFooterButton = this.primary_footer_button;
        if (bookletFooterButton != null) {
            arrayList.add("primary_footer_button=" + bookletFooterButton);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GreenBookletV1{", "}", 0, null, null, 56);
    }
}
