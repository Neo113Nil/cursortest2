package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.trifle.delegates.EndEntity$Factory;
import app.cash.versioned.VersionedKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.grantly.api.LoanOption;
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

/* loaded from: classes7.dex */
public final class CardTabNullStateSwipeConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardTabNullStateSwipeConfig> CREATOR;
    public final String analytics_key;
    public final ButtonElement button;
    public final List swipe_pages;

    public final class VisualElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<VisualElement> CREATOR;
        public final VersionedKt visual_element;

        static {
            CardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1 cardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1 = new CardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VisualElement.class), "type.googleapis.com/squareup.cash.composer.app.CardTabNullStateSwipeConfig.VisualElement", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
            ADAPTER = cardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardTabNullStateSwipeConfig$VisualElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisualElement(VersionedKt versionedKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.visual_element = versionedKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VisualElement)) {
                return false;
            }
            VisualElement visualElement = (VisualElement) obj;
            return Intrinsics.areEqual(unknownFields(), visualElement.unknownFields()) && Intrinsics.areEqual(this.visual_element, visualElement.visual_element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            VersionedKt versionedKt = this.visual_element;
            int hashCode2 = hashCode + (versionedKt != null ? versionedKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(4);
            builder.asset_type = this.visual_element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            VersionedKt versionedKt = this.visual_element;
            if (versionedKt != null) {
                arrayList.add("visual_element=" + versionedKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "VisualElement{", "}", 0, null, null, 56);
        }
    }

    static {
        CardTabNullStateSwipeConfig$Companion$ADAPTER$1 cardTabNullStateSwipeConfig$Companion$ADAPTER$1 = new CardTabNullStateSwipeConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardTabNullStateSwipeConfig.class), "type.googleapis.com/squareup.cash.composer.app.CardTabNullStateSwipeConfig", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = cardTabNullStateSwipeConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardTabNullStateSwipeConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTabNullStateSwipeConfig(List list, ButtonElement buttonElement, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.button = buttonElement;
        this.analytics_key = str;
        this.swipe_pages = TransactorKt.immutableCopyOf("swipe_pages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardTabNullStateSwipeConfig)) {
            return false;
        }
        CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cardTabNullStateSwipeConfig.unknownFields()) && Intrinsics.areEqual(this.swipe_pages, cardTabNullStateSwipeConfig.swipe_pages) && Intrinsics.areEqual(this.button, cardTabNullStateSwipeConfig.button) && Intrinsics.areEqual(this.analytics_key, cardTabNullStateSwipeConfig.analytics_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.swipe_pages);
        ButtonElement buttonElement = this.button;
        int hashCode = (m + (buttonElement != null ? buttonElement.hashCode() : 0)) * 37;
        String str = this.analytics_key;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(1);
        builder.payment_schedule = this.swipe_pages;
        builder.loan_type = this.button;
        builder.tila_data = this.analytics_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.swipe_pages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("swipe_pages=", arrayList, list);
        }
        ButtonElement buttonElement = this.button;
        if (buttonElement != null) {
            arrayList.add("button=" + buttonElement);
        }
        String str = this.analytics_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardTabNullStateSwipeConfig{", "}", 0, null, null, 56);
    }

    public final class SwipePage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SwipePage> CREATOR;
        public final String analytics_key;
        public final List elements;

        static {
            CardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1 cardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1 = new CardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SwipePage.class), "type.googleapis.com/squareup.cash.composer.app.CardTabNullStateSwipeConfig.SwipePage", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
            ADAPTER = cardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardTabNullStateSwipeConfig$SwipePage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwipePage(List list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.analytics_key = str;
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwipePage)) {
                return false;
            }
            SwipePage swipePage = (SwipePage) obj;
            return Intrinsics.areEqual(unknownFields(), swipePage.unknownFields()) && Intrinsics.areEqual(this.elements, swipePage.elements) && Intrinsics.areEqual(this.analytics_key, swipePage.analytics_key);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
            String str = this.analytics_key;
            int hashCode = m + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ToggleScreen.Builder builder = new ToggleScreen.Builder(12, false);
            builder.sections = this.elements;
            builder.toggle_title = this.analytics_key;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            String str = this.analytics_key;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_key=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SwipePage{", "}", 0, null, null, 56);
        }

        public final class SwipePageElement extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SwipePageElement> CREATOR;
            public final EndEntity$Factory swipe_page_element;

            static {
                CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1 cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1 = new CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SwipePageElement.class), "type.googleapis.com/squareup.cash.composer.app.CardTabNullStateSwipeConfig.SwipePage.SwipePageElement", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
                ADAPTER = cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SwipePageElement(EndEntity$Factory endEntity$Factory, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.swipe_page_element = endEntity$Factory;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SwipePageElement)) {
                    return false;
                }
                SwipePageElement swipePageElement = (SwipePageElement) obj;
                return Intrinsics.areEqual(unknownFields(), swipePageElement.unknownFields()) && Intrinsics.areEqual(this.swipe_page_element, swipePageElement.swipe_page_element);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                EndEntity$Factory endEntity$Factory = this.swipe_page_element;
                int hashCode2 = hashCode + (endEntity$Factory != null ? endEntity$Factory.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Asset.Builder builder = new Asset.Builder(3);
                builder.asset_type = this.swipe_page_element;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                EndEntity$Factory endEntity$Factory = this.swipe_page_element;
                if (endEntity$Factory != null) {
                    arrayList.add("swipe_page_element=" + endEntity$Factory);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SwipePageElement{", "}", 0, null, null, 56);
            }

            public /* synthetic */ SwipePageElement(EndEntity$Factory endEntity$Factory) {
                this(endEntity$Factory, ByteString.EMPTY);
            }
        }

        public SwipePage(List list, String str) {
            this(list, str, ByteString.EMPTY);
        }
    }
}
