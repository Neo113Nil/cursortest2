package com.squareup.cash.support.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes5.dex */
public abstract class FormattedPaymentHistoryActivityItemUtilsKt {
    public static final ItemAccessory accessory(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        String str;
        if (formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_formatted_activity_list == null) {
            if (formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list == null) {
                return null;
            }
            String str2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_formatted_activity_list;
            str = str2 != null ? str2 : "";
            PaymentHistoryData.AmountTreatment amountTreatment = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list;
            if (amountTreatment == null) {
                amountTreatment = PaymentHistoryData.AmountTreatment.STANDARD;
            }
            return new ItemAccessory.Amount(str, amountTreatment);
        }
        String str3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_formatted_activity_list;
        if (str3 == null) {
            str3 = "";
        }
        PaymentHistoryData.AmountTreatment amountTreatment2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().amount_treatment_activity_list;
        if (amountTreatment2 == null) {
            amountTreatment2 = PaymentHistoryData.AmountTreatment.STANDARD;
        }
        ItemAccessory.Amount amount = new ItemAccessory.Amount(str3, amountTreatment2);
        String str4 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_formatted_activity_list;
        str = str4 != null ? str4 : "";
        PaymentHistoryData.AmountTreatment amountTreatment3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_amount_treatment_activity_list;
        if (amountTreatment3 == null) {
            amountTreatment3 = PaymentHistoryData.AmountTreatment.STANDARD;
        }
        return new ItemAccessory.DualAmounts(amount, new ItemAccessory.Amount(str, amountTreatment3));
    }

    public static final StackedAvatarViewModel avatar(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        Image image;
        PaymentHistoryData.StackedAvatars stackedAvatars = formattedPaymentHistoryActivityItem.getPaymentHistoryData().stacked_avatars;
        if (stackedAvatars != null) {
            if (!stackedAvatars.avatars.isEmpty()) {
                List take = CollectionsKt.take(stackedAvatars.avatars, 2);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                Iterator it = take.iterator();
                while (it.hasNext()) {
                    arrayList.add(createAvatarModel((Avatar) it.next(), null, null));
                }
                int size = arrayList.size();
                if (size == 1) {
                    return new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList.get(0));
                }
                if (size == 2) {
                    return new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList.get(0), (StackedAvatarViewModel.Avatar) arrayList.get(1));
                }
                a$$ExternalSyntheticBUOutline0.m$1("We shouldn't have more than 2 avatar here.");
                return null;
            }
            if (!stackedAvatars.images.isEmpty()) {
                List<Image> take2 = CollectionsKt.take(stackedAvatars.images, 2);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take2, 10));
                for (Image image2 : take2) {
                    arrayList2.add(new StackedAvatarViewModel.Avatar(null, null, null, new Image(image2.light_url, image2.dark_url, 4), null, null, null, null, false, false, null, false, null, null, 131063));
                }
                int size2 = arrayList2.size();
                if (size2 == 1) {
                    return new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList2.get(0));
                }
                if (size2 == 2) {
                    return new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList2.get(0), (StackedAvatarViewModel.Avatar) arrayList2.get(1));
                }
                a$$ExternalSyntheticBUOutline0.m$1("We shouldn't have more than 2 avatar here.");
                return null;
            }
        }
        PaymentHistoryData paymentHistoryData = formattedPaymentHistoryActivityItem.getPaymentHistoryData();
        String str = paymentHistoryData.primary_label;
        String str2 = str == null ? "" : str;
        StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(null, str != null ? GrpcStatus.Companion.monogram(str) : null, str2, null, null, null, null, null, false, false, null, false, null, null, 131065);
        String str3 = paymentHistoryData.avatar_overlay_icon_url;
        if (str3 != null) {
            String str4 = paymentHistoryData.dark_theme_avatar_overlay_icon_url;
            if (str4 == null) {
                str4 = str3;
            }
            image = new Image(str3, str4, 4);
        } else {
            image = null;
        }
        if (image != null && paymentHistoryData.icon_overlay_shape != PaymentHistoryData.IconOverlayShape.CIRCULAR_BADGE_SHAPE) {
            StackedAvatarViewModel.Avatar avatar2 = new StackedAvatarViewModel.Avatar(null, null, null, image, null, null, null, null, false, false, null, false, null, null, 131063);
            Avatar avatar3 = paymentHistoryData.avatar;
            if (avatar3 != null) {
                String str5 = paymentHistoryData.primary_label;
                avatar = createAvatarModel(avatar3, str2, str5 != null ? GrpcStatus.Companion.monogram(str5) : null);
            }
            return new StackedAvatarViewModel.Duo(avatar2, avatar);
        }
        UiAvatar uiAvatar = paymentHistoryData.ui_avatar;
        if (uiAvatar != null) {
            return StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar);
        }
        Avatar avatar4 = paymentHistoryData.avatar;
        if (avatar4 == null) {
            return new StackedAvatarViewModel.Single(avatar);
        }
        String str6 = paymentHistoryData.primary_label;
        return new StackedAvatarViewModel.Single(createAvatarModel(avatar4, str2, str6 != null ? GrpcStatus.Companion.monogram(str6) : null));
    }

    public static final String contentDescription(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem) {
        String str = formattedPaymentHistoryActivityItem.getPaymentHistoryData().primary_label;
        if (str == null) {
            str = "";
        }
        String str2 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().secondary_label;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().tertiary_label;
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str, str2, str3 != null ? str3 : ""}), null, null, null, 0, null, null, 63);
    }

    public static final StackedAvatarViewModel.Avatar createAvatarModel(Avatar avatar, String str, Character ch) {
        StackedAvatarViewModel.Avatar avatarModel = StackedAvatarViewModelKt.toAvatarModel(avatar);
        if (ch == null) {
            ch = avatarModel.character;
        }
        if (str == null) {
            str = avatarModel.contentDescription;
        }
        return StackedAvatarViewModel.Avatar.copy$default(avatarModel, ch, str, 131065);
    }
}
