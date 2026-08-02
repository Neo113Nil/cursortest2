package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import squareup.cash.bills.BillsApplet;
import squareup.cash.savings.SavingsConfig;
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowLimitHubData> CREATOR;
    public final List sections;
    public final LocalizedString title;

    public final class IncreaseLimitActionsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IncreaseLimitActionsSection> CREATOR;
        public final List cta_bullets;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        public final class CTABullet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CTABullet> CREATOR;
            public final LocalizedString accessory_label;
            public final BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute action;
            public final LocalizedString body;
            public final Icon icon;
            public final LocalizedString title;

            static {
                BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1 borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1 = new BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CTABullet.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.IncreaseLimitActionsSection.CTABullet", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
                ADAPTER = borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CTABullet(LocalizedString localizedString, LocalizedString localizedString2, Icon icon, LocalizedString localizedString3, BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.body = localizedString2;
                this.icon = icon;
                this.accessory_label = localizedString3;
                this.action = borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CTABullet)) {
                    return false;
                }
                CTABullet cTABullet = (CTABullet) obj;
                return Intrinsics.areEqual(unknownFields(), cTABullet.unknownFields()) && Intrinsics.areEqual(this.title, cTABullet.title) && Intrinsics.areEqual(this.body, cTABullet.body) && Intrinsics.areEqual(this.icon, cTABullet.icon) && Intrinsics.areEqual(this.accessory_label, cTABullet.accessory_label) && Intrinsics.areEqual(this.action, cTABullet.action);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.accessory_label;
                int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = this.action;
                int hashCode6 = hashCode5 + (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null ? borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute.value.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Binding.Builder builder = new Binding.Builder(2);
                builder.key_path = this.title;
                builder.get_transform = this.body;
                builder.set_transform = this.icon;
                builder.validation = this.accessory_label;
                builder.on_invalid = this.action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                LocalizedString localizedString3 = this.accessory_label;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessory_label=", localizedString3, arrayList);
                }
                BorrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute = this.action;
                if (borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute != null) {
                    arrayList.add("action=" + borrowLimitHubData$IncreaseLimitActionsSection$CTABullet$Action$ClientRoute);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CTABullet{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1 borrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1 = new BorrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IncreaseLimitActionsSection.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.IncreaseLimitActionsSection", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
            ADAPTER = borrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$IncreaseLimitActionsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncreaseLimitActionsSection(LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.cta_bullets = TransactorKt.immutableCopyOf("cta_bullets", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IncreaseLimitActionsSection)) {
                return false;
            }
            IncreaseLimitActionsSection increaseLimitActionsSection = (IncreaseLimitActionsSection) obj;
            return Intrinsics.areEqual(unknownFields(), increaseLimitActionsSection.unknownFields()) && Intrinsics.areEqual(this.title, increaseLimitActionsSection.title) && Intrinsics.areEqual(this.subtitle, increaseLimitActionsSection.subtitle) && Intrinsics.areEqual(this.cta_bullets, increaseLimitActionsSection.cta_bullets);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = this.cta_bullets.hashCode() + ((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanRepaymentSelectionData.Builder builder = new LoanRepaymentSelectionData.Builder(3);
            builder.title = this.title;
            builder.dismiss_button_text = this.subtitle;
            builder.repayment_choices = this.cta_bullets;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            List list = this.cta_bullets;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("cta_bullets=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IncreaseLimitActionsSection{", "}", 0, null, null, 56);
        }
    }

    public final class LimitDisclaimerSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitDisclaimerSection> CREATOR;
        public final LocalizedString text;

        static {
            BorrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1 borrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitDisclaimerSection.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitDisclaimerSection", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
            ADAPTER = borrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitDisclaimerSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitDisclaimerSection(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitDisclaimerSection)) {
                return false;
            }
            LimitDisclaimerSection limitDisclaimerSection = (LimitDisclaimerSection) obj;
            return Intrinsics.areEqual(unknownFields(), limitDisclaimerSection.unknownFields()) && Intrinsics.areEqual(this.text, limitDisclaimerSection.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(7);
            builder.yield_current_rate_enhanced = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitDisclaimerSection{", "}", 0, null, null, 56);
        }
    }

    public final class LimitInfoBulletsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitInfoBulletsSection> CREATOR;
        public final List bullets;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        public final class Bullet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Bullet> CREATOR;
            public final Icon icon;
            public final LocalizedString text;

            static {
                BorrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1 borrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bullet.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitInfoBulletsSection.Bullet", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
                ADAPTER = borrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitInfoBulletsSection$Bullet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Bullet(Icon icon, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.text = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bullet)) {
                    return false;
                }
                Bullet bullet = (Bullet) obj;
                return Intrinsics.areEqual(unknownFields(), bullet.unknownFields()) && Intrinsics.areEqual(this.icon, bullet.icon) && Intrinsics.areEqual(this.text, bullet.text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString = this.text;
                int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Footer.Builder builder = new Footer.Builder(1);
                builder.arcade_icon = this.icon;
                builder.footer_markdown_text = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Bullet{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1 borrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitInfoBulletsSection.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitInfoBulletsSection", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
            ADAPTER = borrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitInfoBulletsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitInfoBulletsSection(LocalizedString localizedString, LocalizedString localizedString2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.bullets = TransactorKt.immutableCopyOf("bullets", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitInfoBulletsSection)) {
                return false;
            }
            LimitInfoBulletsSection limitInfoBulletsSection = (LimitInfoBulletsSection) obj;
            return Intrinsics.areEqual(unknownFields(), limitInfoBulletsSection.unknownFields()) && Intrinsics.areEqual(this.title, limitInfoBulletsSection.title) && Intrinsics.areEqual(this.subtitle, limitInfoBulletsSection.subtitle) && Intrinsics.areEqual(this.bullets, limitInfoBulletsSection.bullets);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = this.bullets.hashCode() + ((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LoanRepaymentSelectionData.Builder builder = new LoanRepaymentSelectionData.Builder(4);
            builder.title = this.title;
            builder.dismiss_button_text = this.subtitle;
            builder.repayment_choices = this.bullets;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            List list = this.bullets;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitInfoBulletsSection{", "}", 0, null, null, 56);
        }
    }

    public final class LimitProgressSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LimitProgressSection> CREATOR;
        public final TextStack leading_text_stack;
        public final SegmentedProgressBar progress_bar;
        public final TextStack trailing_text_stack;

        public final class SegmentedProgressBar extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SegmentedProgressBar> CREATOR;
            public final LocalizedString accessibility_description;
            public final List segments;

            public final class Segment extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Segment> CREATOR;
                public final Color color;
                public final Float percent;

                static {
                    BorrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Segment$Companion$ADAPTER$1 borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Segment$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Segment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Segment.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar.Segment", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
                    ADAPTER = borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Segment$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Segment$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Segment(Color color, Float f, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.color = color;
                    this.percent = f;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Segment)) {
                        return false;
                    }
                    Segment segment = (Segment) obj;
                    return Intrinsics.areEqual(unknownFields(), segment.unknownFields()) && Intrinsics.areEqual(this.color, segment.color) && Intrinsics.areEqual(this.percent, segment.percent);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Color color = this.color;
                    int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
                    Float f = this.percent;
                    int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    SegmentedCircle.Segment.Builder builder = new SegmentedCircle.Segment.Builder(2);
                    builder.color = this.color;
                    builder.percent = this.percent;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Color color = this.color;
                    if (color != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
                    }
                    Float f = this.percent;
                    if (f != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("percent=", f, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Segment{", "}", 0, null, null, 56);
                }
            }

            static {
                BorrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1 borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SegmentedProgressBar.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitProgressSection.SegmentedProgressBar", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
                ADAPTER = borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitProgressSection$SegmentedProgressBar$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SegmentedProgressBar(LocalizedString localizedString, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.accessibility_description = localizedString;
                this.segments = TransactorKt.immutableCopyOf("segments", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SegmentedProgressBar)) {
                    return false;
                }
                SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) obj;
                return Intrinsics.areEqual(unknownFields(), segmentedProgressBar.unknownFields()) && Intrinsics.areEqual(this.segments, segmentedProgressBar.segments) && Intrinsics.areEqual(this.accessibility_description, segmentedProgressBar.accessibility_description);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.segments);
                LocalizedString localizedString = this.accessibility_description;
                int hashCode = m + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(9);
                builder.lines = this.segments;
                builder.title = this.accessibility_description;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.segments;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("segments=", arrayList, list);
                }
                LocalizedString localizedString = this.accessibility_description;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("accessibility_description=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SegmentedProgressBar{", "}", 0, null, null, 56);
            }
        }

        public final class TextStack extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextStack> CREATOR;
            public final Color label_color;
            public final LocalizedString label_text;
            public final Color value_color;
            public final LocalizedString value_text;

            static {
                BorrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1 borrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextStack.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitProgressSection.TextStack", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
                ADAPTER = borrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextStack(LocalizedString localizedString, LocalizedString localizedString2, Color color, Color color2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label_text = localizedString;
                this.value_text = localizedString2;
                this.label_color = color;
                this.value_color = color2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextStack)) {
                    return false;
                }
                TextStack textStack = (TextStack) obj;
                return Intrinsics.areEqual(unknownFields(), textStack.unknownFields()) && Intrinsics.areEqual(this.label_text, textStack.label_text) && Intrinsics.areEqual(this.value_text, textStack.value_text) && Intrinsics.areEqual(this.label_color, textStack.label_color) && Intrinsics.areEqual(this.value_color, textStack.value_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.label_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.value_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                Color color = this.label_color;
                int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
                Color color2 = this.value_color;
                int hashCode5 = hashCode4 + (color2 != null ? color2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiDda.Builder builder = new UiDda.Builder(18);
                builder.account = this.label_text;
                builder.enabled = this.value_text;
                builder.button = this.label_color;
                builder.dda_form = this.value_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.label_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.value_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("value_text=", localizedString2, arrayList);
                }
                Color color = this.label_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("label_color=", color, arrayList);
                }
                Color color2 = this.value_color;
                if (color2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("value_color=", color2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextStack{", "}", 0, null, null, 56);
            }
        }

        static {
            BorrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1 borrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1 = new BorrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LimitProgressSection.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.LimitProgressSection", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
            ADAPTER = borrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$LimitProgressSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitProgressSection(TextStack textStack, TextStack textStack2, SegmentedProgressBar segmentedProgressBar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.leading_text_stack = textStack;
            this.trailing_text_stack = textStack2;
            this.progress_bar = segmentedProgressBar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimitProgressSection)) {
                return false;
            }
            LimitProgressSection limitProgressSection = (LimitProgressSection) obj;
            return Intrinsics.areEqual(unknownFields(), limitProgressSection.unknownFields()) && Intrinsics.areEqual(this.leading_text_stack, limitProgressSection.leading_text_stack) && Intrinsics.areEqual(this.trailing_text_stack, limitProgressSection.trailing_text_stack) && Intrinsics.areEqual(this.progress_bar, limitProgressSection.progress_bar);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TextStack textStack = this.leading_text_stack;
            int hashCode2 = (hashCode + (textStack != null ? textStack.hashCode() : 0)) * 37;
            TextStack textStack2 = this.trailing_text_stack;
            int hashCode3 = (hashCode2 + (textStack2 != null ? textStack2.hashCode() : 0)) * 37;
            SegmentedProgressBar segmentedProgressBar = this.progress_bar;
            int hashCode4 = hashCode3 + (segmentedProgressBar != null ? segmentedProgressBar.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(20);
            builder.label = this.leading_text_stack;
            builder.localizable_label = this.trailing_text_stack;
            builder.client_scenario = this.progress_bar;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            TextStack textStack = this.leading_text_stack;
            if (textStack != null) {
                arrayList.add("leading_text_stack=" + textStack);
            }
            TextStack textStack2 = this.trailing_text_stack;
            if (textStack2 != null) {
                arrayList.add("trailing_text_stack=" + textStack2);
            }
            SegmentedProgressBar segmentedProgressBar = this.progress_bar;
            if (segmentedProgressBar != null) {
                arrayList.add("progress_bar=" + segmentedProgressBar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitProgressSection{", "}", 0, null, null, 56);
        }
    }

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final List app_supports;
        public final zzjl section;

        static {
            BorrowLimitHubData$Section$Companion$ADAPTER$1 borrowLimitHubData$Section$Companion$ADAPTER$1 = new BorrowLimitHubData$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData.Section", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
            ADAPTER = borrowLimitHubData$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(List list, zzjl zzjlVar, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.section = zzjlVar;
            this.app_supports = TransactorKt.immutableCopyOf("app_supports", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.app_supports, section.app_supports) && Intrinsics.areEqual(this.section, section.section);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.app_supports);
            zzjl zzjlVar = this.section;
            int hashCode = m + (zzjlVar != null ? zzjlVar.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(14);
            builder.f1411android = this.app_supports;
            builder.ios = this.section;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.app_supports;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("app_supports=", arrayList, list);
            }
            zzjl zzjlVar = this.section;
            if (zzjlVar != null) {
                arrayList.add("section=" + zzjlVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    static {
        BorrowLimitHubData$Companion$ADAPTER$1 borrowLimitHubData$Companion$ADAPTER$1 = new BorrowLimitHubData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowLimitHubData.class), "type.googleapis.com/squareup.lending.sync_values.BorrowLimitHubData", Syntax.PROTO_2, null, "squareup/lending/borrow_limit_hub_sync_value.proto");
        ADAPTER = borrowLimitHubData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowLimitHubData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowLimitHubData(LocalizedString localizedString, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowLimitHubData)) {
            return false;
        }
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) obj;
        return Intrinsics.areEqual(unknownFields(), borrowLimitHubData.unknownFields()) && Intrinsics.areEqual(this.title, borrowLimitHubData.title) && Intrinsics.areEqual(this.sections, borrowLimitHubData.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = this.sections.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(8);
        builder.title = this.title;
        builder.lines = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowLimitHubData{", "}", 0, null, null, 56);
    }
}
