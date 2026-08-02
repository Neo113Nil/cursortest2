package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Footer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Footer> CREATOR;
    public final Icon arcade_icon;
    public final LocalizedString footer_markdown_text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Icon arcade_icon;
        public LocalizedString footer_markdown_text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Footer(this.arcade_icon, this.footer_markdown_text, buildUnknownFields());
                default:
                    return new BorrowLimitHubData.LimitInfoBulletsSection.Bullet(this.arcade_icon, this.footer_markdown_text, buildUnknownFields());
            }
        }
    }

    static {
        Footer$Companion$ADAPTER$1 footer$Companion$ADAPTER$1 = new Footer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Footer.class), "type.googleapis.com/squareup.cash.shop.rendering.api.Footer", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Footer.proto");
        ADAPTER = footer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(footer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Footer(Icon icon, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.arcade_icon = icon;
        this.footer_markdown_text = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Footer)) {
            return false;
        }
        Footer footer = (Footer) obj;
        return Intrinsics.areEqual(unknownFields(), footer.unknownFields()) && Intrinsics.areEqual(this.arcade_icon, footer.arcade_icon) && Intrinsics.areEqual(this.footer_markdown_text, footer.footer_markdown_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.arcade_icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.footer_markdown_text;
        int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.arcade_icon = this.arcade_icon;
        builder.footer_markdown_text = this.footer_markdown_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        LocalizedString localizedString = this.footer_markdown_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("footer_markdown_text=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Footer{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Footer(LocalizedString localizedString, Icon icon) {
        this(icon, localizedString, ByteString.EMPTY);
    }
}
