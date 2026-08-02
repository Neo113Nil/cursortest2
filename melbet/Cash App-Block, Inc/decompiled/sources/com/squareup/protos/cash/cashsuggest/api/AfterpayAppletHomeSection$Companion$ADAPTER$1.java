package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.AvatarTextSection;
import com.squareup.protos.cash.shop.rendering.api.IconTextSection;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.PageHeaderSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.TextLinesSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        LocalMenuSelectorKt localMenuSelectorKt = null;
        Object obj4 = null;
        LocalMenuHoursViewKt localMenuHoursViewKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletHomeSection((SectionHeader) obj, localMenuSelectorKt, (Boolean) obj2, localMenuHoursViewKt, (AnalyticsEvent) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(SectionHeader.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CreditRing((CreditRingSection) CreditRingSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PaymentMgmt((PaymentMgmtSection) PaymentMgmtSection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CheckEligibility((ImageTextSection) ImageTextSection.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CheckEligibilityRow((com.squareup.protos.cash.shop.rendering.api.RowSection) com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$TotalBalance((TotalBalanceSection) TotalBalanceSection.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$BrandsDiscovery((AvatarCarouselSection) AvatarCarouselSection.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
                    break;
                case 11:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$RowItemSection((com.squareup.protos.cash.shop.rendering.api.RowSection) com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$OrderList((OrderListSection) OrderListSection.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    localMenuSelectorKt = new AfterpayAppletHomeSection$SectionHeader$StandardHeader((SectionHeader) SectionHeader.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    localMenuSelectorKt = new AfterpayAppletHomeSection$SectionHeader$CreditLineHeader((CreditLineSectionHeader) CreditLineSectionHeader.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$AvatarTextSection((AvatarTextSection) AvatarTextSection.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$IconTextSection((IconTextSection) IconTextSection.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$TextLinesSection((TextLinesSection) TextLinesSection.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PageHeaderSection((PageHeaderSection) PageHeaderSection.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$ImageTextSection((ImageTextSection) ImageTextSection.ADAPTER.decode(protoReader));
                    break;
                case 21:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$CardSection((AppletCardSection) AppletCardSection.ADAPTER.decode(protoReader));
                    break;
                case 22:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$HeroBalanceSection((HeroBalanceSection) HeroBalanceSection.ADAPTER.decode(protoReader));
                    break;
                case 23:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$HeroUpsellSection((HeroUpsellSection) HeroUpsellSection.ADAPTER.decode(protoReader));
                    break;
                case 24:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection((PrepurchaseCardToggleSection) PrepurchaseCardToggleSection.ADAPTER.decode(protoReader));
                    break;
                case 25:
                    localMenuHoursViewKt = new AfterpayAppletHomeSection$Section$Banner((Banner) Banner.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletHomeSection afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj;
        reverseProtoWriter.getClass();
        afterpayAppletHomeSection.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletHomeSection.unknownFields());
        LocalMenuHoursViewKt localMenuHoursViewKt = afterpayAppletHomeSection.section;
        if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CreditRing) {
            CreditRingSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((AfterpayAppletHomeSection$Section$CreditRing) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TotalBalance) {
            TotalBalanceSection.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((AfterpayAppletHomeSection$Section$TotalBalance) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PaymentMgmt) {
            PaymentMgmtSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((AfterpayAppletHomeSection$Section$PaymentMgmt) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$BrandsDiscovery) {
            AvatarCarouselSection.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((AfterpayAppletHomeSection$Section$BrandsDiscovery) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibility) {
            ImageTextSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((AfterpayAppletHomeSection$Section$CheckEligibility) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibilityRow) {
            com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((AfterpayAppletHomeSection$Section$CheckEligibilityRow) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$RowItemSection) {
            com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((AfterpayAppletHomeSection$Section$RowItemSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$OrderList) {
            OrderListSection.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((AfterpayAppletHomeSection$Section$OrderList) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$AvatarTextSection) {
            AvatarTextSection.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((AfterpayAppletHomeSection$Section$AvatarTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$IconTextSection) {
            IconTextSection.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((AfterpayAppletHomeSection$Section$IconTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TextLinesSection) {
            TextLinesSection.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((AfterpayAppletHomeSection$Section$TextLinesSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PageHeaderSection) {
            PageHeaderSection.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((AfterpayAppletHomeSection$Section$PageHeaderSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$ImageTextSection) {
            ImageTextSection.ADAPTER.encodeWithTag(reverseProtoWriter, 20, ((AfterpayAppletHomeSection$Section$ImageTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CardSection) {
            AppletCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((AfterpayAppletHomeSection$Section$CardSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection) {
            HeroBalanceSection.ADAPTER.encodeWithTag(reverseProtoWriter, 22, ((AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroUpsellSection) {
            HeroUpsellSection.ADAPTER.encodeWithTag(reverseProtoWriter, 23, ((AfterpayAppletHomeSection$Section$HeroUpsellSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) {
            PrepurchaseCardToggleSection.ADAPTER.encodeWithTag(reverseProtoWriter, 24, ((AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$Banner) {
            Banner.ADAPTER.encodeWithTag(reverseProtoWriter, 25, ((AfterpayAppletHomeSection$Section$Banner) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalMenuSelectorKt localMenuSelectorKt = afterpayAppletHomeSection.section_header;
        if (localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$StandardHeader) {
            SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((AfterpayAppletHomeSection$SectionHeader$StandardHeader) localMenuSelectorKt).value);
        } else if (localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) {
            CreditLineSectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) localMenuSelectorKt).value);
        } else if (localMenuSelectorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 11, afterpayAppletHomeSection.section_id);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 10, afterpayAppletHomeSection.analytic_view_event);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, afterpayAppletHomeSection.show_divider);
        SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayAppletHomeSection.header);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalMenuHoursViewKt localMenuHoursViewKt;
        int encodedSizeWithTag2;
        AfterpayAppletHomeSection afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj;
        afterpayAppletHomeSection.getClass();
        int size$okio = afterpayAppletHomeSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = SectionHeader.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(1, afterpayAppletHomeSection.header) + size$okio;
        LocalMenuSelectorKt localMenuSelectorKt = afterpayAppletHomeSection.section_header;
        if (localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$StandardHeader) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(14, ((AfterpayAppletHomeSection$SectionHeader$StandardHeader) localMenuSelectorKt).value);
        } else {
            if (!(localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$CreditLineHeader)) {
                if (localMenuSelectorKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag4 = ProtoAdapter.BOOL.encodedSizeWithTag(2, afterpayAppletHomeSection.show_divider) + encodedSizeWithTag3;
                localMenuHoursViewKt = afterpayAppletHomeSection.section;
                if (!(localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CreditRing)) {
                    encodedSizeWithTag2 = CreditRingSection.ADAPTER.encodedSizeWithTag(3, ((AfterpayAppletHomeSection$Section$CreditRing) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TotalBalance) {
                    encodedSizeWithTag2 = TotalBalanceSection.ADAPTER.encodedSizeWithTag(8, ((AfterpayAppletHomeSection$Section$TotalBalance) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PaymentMgmt) {
                    encodedSizeWithTag2 = PaymentMgmtSection.ADAPTER.encodedSizeWithTag(4, ((AfterpayAppletHomeSection$Section$PaymentMgmt) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$BrandsDiscovery) {
                    encodedSizeWithTag2 = AvatarCarouselSection.ADAPTER.encodedSizeWithTag(9, ((AfterpayAppletHomeSection$Section$BrandsDiscovery) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibility) {
                    encodedSizeWithTag2 = ImageTextSection.ADAPTER.encodedSizeWithTag(6, ((AfterpayAppletHomeSection$Section$CheckEligibility) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibilityRow) {
                    encodedSizeWithTag2 = com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodedSizeWithTag(7, ((AfterpayAppletHomeSection$Section$CheckEligibilityRow) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$RowItemSection) {
                    encodedSizeWithTag2 = com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodedSizeWithTag(12, ((AfterpayAppletHomeSection$Section$RowItemSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$OrderList) {
                    encodedSizeWithTag2 = OrderListSection.ADAPTER.encodedSizeWithTag(13, ((AfterpayAppletHomeSection$Section$OrderList) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$AvatarTextSection) {
                    encodedSizeWithTag2 = AvatarTextSection.ADAPTER.encodedSizeWithTag(16, ((AfterpayAppletHomeSection$Section$AvatarTextSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$IconTextSection) {
                    encodedSizeWithTag2 = IconTextSection.ADAPTER.encodedSizeWithTag(17, ((AfterpayAppletHomeSection$Section$IconTextSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TextLinesSection) {
                    encodedSizeWithTag2 = TextLinesSection.ADAPTER.encodedSizeWithTag(18, ((AfterpayAppletHomeSection$Section$TextLinesSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PageHeaderSection) {
                    encodedSizeWithTag2 = PageHeaderSection.ADAPTER.encodedSizeWithTag(19, ((AfterpayAppletHomeSection$Section$PageHeaderSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$ImageTextSection) {
                    encodedSizeWithTag2 = ImageTextSection.ADAPTER.encodedSizeWithTag(20, ((AfterpayAppletHomeSection$Section$ImageTextSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CardSection) {
                    encodedSizeWithTag2 = AppletCardSection.ADAPTER.encodedSizeWithTag(21, ((AfterpayAppletHomeSection$Section$CardSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection) {
                    encodedSizeWithTag2 = HeroBalanceSection.ADAPTER.encodedSizeWithTag(22, ((AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroUpsellSection) {
                    encodedSizeWithTag2 = HeroUpsellSection.ADAPTER.encodedSizeWithTag(23, ((AfterpayAppletHomeSection$Section$HeroUpsellSection) localMenuHoursViewKt).value);
                } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) {
                    encodedSizeWithTag2 = PrepurchaseCardToggleSection.ADAPTER.encodedSizeWithTag(24, ((AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) localMenuHoursViewKt).value);
                } else {
                    if (!(localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$Banner)) {
                        if (localMenuHoursViewKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ProtoAdapter.STRING.encodedSizeWithTag(11, afterpayAppletHomeSection.section_id) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(10, afterpayAppletHomeSection.analytic_view_event) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag2 = Banner.ADAPTER.encodedSizeWithTag(25, ((AfterpayAppletHomeSection$Section$Banner) localMenuHoursViewKt).value);
                }
                encodedSizeWithTag4 += encodedSizeWithTag2;
                return ProtoAdapter.STRING.encodedSizeWithTag(11, afterpayAppletHomeSection.section_id) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(10, afterpayAppletHomeSection.analytic_view_event) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = CreditLineSectionHeader.ADAPTER.encodedSizeWithTag(15, ((AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) localMenuSelectorKt).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        int encodedSizeWithTag42 = ProtoAdapter.BOOL.encodedSizeWithTag(2, afterpayAppletHomeSection.show_divider) + encodedSizeWithTag3;
        localMenuHoursViewKt = afterpayAppletHomeSection.section;
        if (!(localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CreditRing)) {
        }
        encodedSizeWithTag42 += encodedSizeWithTag2;
        return ProtoAdapter.STRING.encodedSizeWithTag(11, afterpayAppletHomeSection.section_id) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(10, afterpayAppletHomeSection.analytic_view_event) + encodedSizeWithTag42;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletHomeSection afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj;
        afterpayAppletHomeSection.getClass();
        SectionHeader sectionHeader = afterpayAppletHomeSection.header;
        SectionHeader sectionHeader2 = sectionHeader != null ? (SectionHeader) SectionHeader.ADAPTER.redact(sectionHeader) : null;
        AnalyticsEvent analyticsEvent = afterpayAppletHomeSection.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        LocalMenuSelectorKt localMenuSelectorKt = afterpayAppletHomeSection.section_header;
        Boolean bool = afterpayAppletHomeSection.show_divider;
        LocalMenuHoursViewKt localMenuHoursViewKt = afterpayAppletHomeSection.section;
        String str = afterpayAppletHomeSection.section_id;
        byteString.getClass();
        return new AfterpayAppletHomeSection(sectionHeader2, localMenuSelectorKt, bool, localMenuHoursViewKt, analyticsEvent2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletHomeSection afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj;
        afterpayAppletHomeSection.getClass();
        ProtoAdapter protoAdapter = SectionHeader.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, afterpayAppletHomeSection.header);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, afterpayAppletHomeSection.show_divider);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 10, afterpayAppletHomeSection.analytic_view_event);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, afterpayAppletHomeSection.section_id);
        LocalMenuSelectorKt localMenuSelectorKt = afterpayAppletHomeSection.section_header;
        if (localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$StandardHeader) {
            protoAdapter.encodeWithTag(protoWriter, 14, ((AfterpayAppletHomeSection$SectionHeader$StandardHeader) localMenuSelectorKt).value);
        } else if (localMenuSelectorKt instanceof AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) {
            CreditLineSectionHeader.ADAPTER.encodeWithTag(protoWriter, 15, ((AfterpayAppletHomeSection$SectionHeader$CreditLineHeader) localMenuSelectorKt).value);
        } else if (localMenuSelectorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalMenuHoursViewKt localMenuHoursViewKt = afterpayAppletHomeSection.section;
        if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CreditRing) {
            CreditRingSection.ADAPTER.encodeWithTag(protoWriter, 3, ((AfterpayAppletHomeSection$Section$CreditRing) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TotalBalance) {
            TotalBalanceSection.ADAPTER.encodeWithTag(protoWriter, 8, ((AfterpayAppletHomeSection$Section$TotalBalance) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PaymentMgmt) {
            PaymentMgmtSection.ADAPTER.encodeWithTag(protoWriter, 4, ((AfterpayAppletHomeSection$Section$PaymentMgmt) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$BrandsDiscovery) {
            AvatarCarouselSection.ADAPTER.encodeWithTag(protoWriter, 9, ((AfterpayAppletHomeSection$Section$BrandsDiscovery) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibility) {
            ImageTextSection.ADAPTER.encodeWithTag(protoWriter, 6, ((AfterpayAppletHomeSection$Section$CheckEligibility) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CheckEligibilityRow) {
            com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodeWithTag(protoWriter, 7, ((AfterpayAppletHomeSection$Section$CheckEligibilityRow) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$RowItemSection) {
            com.squareup.protos.cash.shop.rendering.api.RowSection.ADAPTER.encodeWithTag(protoWriter, 12, ((AfterpayAppletHomeSection$Section$RowItemSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$OrderList) {
            OrderListSection.ADAPTER.encodeWithTag(protoWriter, 13, ((AfterpayAppletHomeSection$Section$OrderList) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$AvatarTextSection) {
            AvatarTextSection.ADAPTER.encodeWithTag(protoWriter, 16, ((AfterpayAppletHomeSection$Section$AvatarTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$IconTextSection) {
            IconTextSection.ADAPTER.encodeWithTag(protoWriter, 17, ((AfterpayAppletHomeSection$Section$IconTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$TextLinesSection) {
            TextLinesSection.ADAPTER.encodeWithTag(protoWriter, 18, ((AfterpayAppletHomeSection$Section$TextLinesSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PageHeaderSection) {
            PageHeaderSection.ADAPTER.encodeWithTag(protoWriter, 19, ((AfterpayAppletHomeSection$Section$PageHeaderSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$ImageTextSection) {
            ImageTextSection.ADAPTER.encodeWithTag(protoWriter, 20, ((AfterpayAppletHomeSection$Section$ImageTextSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CardSection) {
            AppletCardSection.ADAPTER.encodeWithTag(protoWriter, 21, ((AfterpayAppletHomeSection$Section$CardSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection) {
            HeroBalanceSection.ADAPTER.encodeWithTag(protoWriter, 22, ((AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroUpsellSection) {
            HeroUpsellSection.ADAPTER.encodeWithTag(protoWriter, 23, ((AfterpayAppletHomeSection$Section$HeroUpsellSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) {
            PrepurchaseCardToggleSection.ADAPTER.encodeWithTag(protoWriter, 24, ((AfterpayAppletHomeSection$Section$PrepurchaseCardToggleSection) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$Banner) {
            Banner.ADAPTER.encodeWithTag(protoWriter, 25, ((AfterpayAppletHomeSection$Section$Banner) localMenuHoursViewKt).value);
        } else if (localMenuHoursViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(afterpayAppletHomeSection.unknownFields());
    }
}
