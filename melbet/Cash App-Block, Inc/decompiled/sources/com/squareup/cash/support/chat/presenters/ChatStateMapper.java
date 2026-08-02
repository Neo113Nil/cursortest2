package com.squareup.cash.support.chat.presenters;

import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportUiUpliftChat;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.real.AndroidFileTypeDescriber;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$SystemMessageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes7.dex */
public final class ChatStateMapper {
    public final AndroidAccessibilityManager accessibilityManager;
    public final boolean chatUiUpliftEnabled;
    public final AndroidFileTypeDescriber fileTypeDescriber;
    public final AndroidStringManager stringManager;
    public final AssetPublicSuffixList timestampFormatter;

    public ChatStateMapper(AndroidStringManager androidStringManager, RealEmojiDetector realEmojiDetector, AndroidFileTypeDescriber androidFileTypeDescriber, FeatureFlagManager featureFlagManager, AndroidAccessibilityManager androidAccessibilityManager, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl) {
        this.stringManager = androidStringManager;
        this.fileTypeDescriber = androidFileTypeDescriber;
        this.accessibilityManager = androidAccessibilityManager;
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.timestampFormatter = realTimestampFormatter$Factory$Impl.create$1(locale, TimestampFormatter$DisplayContext.STANDALONE);
        this.chatUiUpliftEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientSupportUiUpliftChat.INSTANCE)).enabled();
    }

    public static Integer firstIndexOfUnreadMessage(String str, ArrayList arrayList) {
        Integer num;
        int i;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            num = null;
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            ChatContentViewModel chatContentViewModel = (ChatContentViewModel) listIterator.previous();
            ChatContentViewModel.MessageViewModel messageViewModel = chatContentViewModel instanceof ChatContentViewModel.MessageViewModel ? (ChatContentViewModel.MessageViewModel) chatContentViewModel : null;
            if (Intrinsics.areEqual(messageViewModel != null ? messageViewModel.messageToken : null, str)) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i == -1) {
            return 0;
        }
        int i2 = i + 1;
        int size = arrayList.size();
        while (true) {
            if (i2 >= size) {
                break;
            }
            ChatContentViewModel chatContentViewModel2 = (ChatContentViewModel) arrayList.get(i2);
            if ((chatContentViewModel2 instanceof ChatContentViewModel.MessageViewModel) && !(((ChatContentViewModel.MessageViewModel) chatContentViewModel2).body instanceof BodyViewModel$SystemMessageBodyViewModel)) {
                num = Integer.valueOf(i2);
                break;
            }
            i2++;
        }
        return (num == null || num.intValue() <= 1 || !(arrayList.get(num.intValue() - 1) instanceof ChatContentViewModel.DisclaimerViewModel)) ? num : Integer.valueOf(num.intValue() - 1);
    }

    public static Integer lastIndexOfDisclaimer(ArrayList arrayList) {
        int i;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (((ChatContentViewModel) listIterator.previous()) instanceof ChatContentViewModel.DisclaimerViewModel) {
                i = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (i >= 0) {
            return valueOf;
        }
        return null;
    }

    public static int lastIndexOrZero(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() - 1;
    }

    public static Message.Sender sender(Message message) {
        if (message instanceof PendingMessage) {
            return Message.Sender.CUSTOMER;
        }
        if (message instanceof RecordedMessage) {
            return ((RecordedMessage) message).sender;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
