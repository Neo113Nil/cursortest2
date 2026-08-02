package com.squareup.cash.support.chat.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.FileTypes;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ChatContentViewModel {

    public final class BottomBookmarkViewModel extends ChatContentViewModel {
        public final boolean chatUiUpliftEnabled;
        public final Height height;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Height {
            public static final /* synthetic */ Height[] $VALUES;
            public static final Height MINIMAL;
            public static final Height NORMAL;

            static {
                Height height = new Height("MINIMAL", 0);
                MINIMAL = height;
                Height height2 = new Height("NORMAL", 1);
                NORMAL = height2;
                $VALUES = new Height[]{height, height2};
            }

            public static Height valueOf(String str) {
                return (Height) Enum.valueOf(Height.class, str);
            }

            public static Height[] values() {
                return (Height[]) $VALUES.clone();
            }
        }

        public BottomBookmarkViewModel(Height height, boolean z) {
            this.height = height;
            this.chatUiUpliftEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomBookmarkViewModel)) {
                return false;
            }
            BottomBookmarkViewModel bottomBookmarkViewModel = (BottomBookmarkViewModel) obj;
            return this.height == bottomBookmarkViewModel.height && this.chatUiUpliftEnabled == bottomBookmarkViewModel.chatUiUpliftEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.chatUiUpliftEnabled) + (this.height.hashCode() * 31);
        }

        public final String toString() {
            return "BottomBookmarkViewModel(height=" + this.height + ", chatUiUpliftEnabled=" + this.chatUiUpliftEnabled + ")";
        }
    }

    public final class DisclaimerViewModel extends ChatContentViewModel {
        public final boolean chatUiUpliftEnabled;
        public final String disclaimerMarkdown;
        public final String messageToken;

        public DisclaimerViewModel(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.disclaimerMarkdown = str;
            this.messageToken = str2;
            this.chatUiUpliftEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisclaimerViewModel)) {
                return false;
            }
            DisclaimerViewModel disclaimerViewModel = (DisclaimerViewModel) obj;
            return Intrinsics.areEqual(this.disclaimerMarkdown, disclaimerViewModel.disclaimerMarkdown) && Intrinsics.areEqual(this.messageToken, disclaimerViewModel.messageToken) && this.chatUiUpliftEnabled == disclaimerViewModel.chatUiUpliftEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.chatUiUpliftEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.disclaimerMarkdown.hashCode() * 31, 31, this.messageToken);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclaimerViewModel(disclaimerMarkdown=", this.disclaimerMarkdown, ", messageToken=", this.messageToken, ", chatUiUpliftEnabled="), this.chatUiUpliftEnabled, ")");
        }
    }

    public final class DividerViewModel extends ChatContentViewModel {
        public final boolean chatUiUpliftEnabled;

        public DividerViewModel(boolean z) {
            this.chatUiUpliftEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DividerViewModel) && this.chatUiUpliftEnabled == ((DividerViewModel) obj).chatUiUpliftEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.chatUiUpliftEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("DividerViewModel(chatUiUpliftEnabled=", ")", this.chatUiUpliftEnabled);
        }
    }

    public abstract class EntryViewModel extends ChatContentViewModel {

        public final class ContentDescription {
            public final String messageDescription;
            public final String messagePrefix;
            public final String status;

            public ContentDescription(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.messagePrefix = str;
                this.messageDescription = str2;
                this.status = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentDescription)) {
                    return false;
                }
                ContentDescription contentDescription = (ContentDescription) obj;
                return Intrinsics.areEqual(this.messagePrefix, contentDescription.messagePrefix) && Intrinsics.areEqual(this.messageDescription, contentDescription.messageDescription) && Intrinsics.areEqual(this.status, contentDescription.status);
            }

            public final int hashCode() {
                return this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messagePrefix.hashCode() * 31, 31, this.messageDescription);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContentDescription(messagePrefix=", this.messagePrefix, ", messageDescription=", this.messageDescription, ", status="), this.status, ")");
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Sender {
            public static final /* synthetic */ Sender[] $VALUES;
            public static final Sender ADVOCATE;
            public static final Sender BOT;
            public static final Sender CUSTOMER;
            public static final Sender SYSTEM;

            static {
                Sender sender = new Sender("CUSTOMER", 0);
                CUSTOMER = sender;
                Sender sender2 = new Sender("ADVOCATE", 1);
                ADVOCATE = sender2;
                Sender sender3 = new Sender("BOT", 2);
                BOT = sender3;
                Sender sender4 = new Sender("SYSTEM", 3);
                SYSTEM = sender4;
                $VALUES = new Sender[]{sender, sender2, sender3, sender4};
            }

            public static Sender valueOf(String str) {
                return (Sender) Enum.valueOf(Sender.class, str);
            }

            public static Sender[] values() {
                return (Sender[]) $VALUES.clone();
            }
        }

        public abstract ViewModelKt getBody();

        public abstract ContentDescription getContentDescription();

        public abstract String getId();

        public abstract Sender getSender();

        public abstract boolean getShowSender();
    }

    public final class ErrorViewModel extends ChatContentViewModel {
        public static final ErrorViewModel INSTANCE = new ErrorViewModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorViewModel);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return 708815629;
        }

        public final String toString() {
            return "ErrorViewModel";
        }
    }

    public final class LoadOldMessagesViewModel extends ChatContentViewModel {
        public static final LoadOldMessagesViewModel INSTANCE = new LoadOldMessagesViewModel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadOldMessagesViewModel);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return 709971368;
        }

        public final String toString() {
            return "LoadOldMessagesViewModel";
        }
    }

    public final class MessageViewModel extends EntryViewModel {
        public final ViewModelKt body;
        public final boolean chatUiUpliftEnabled;
        public final EntryViewModel.ContentDescription contentDescription;
        public final String idempotenceToken;
        public final boolean isFirstInGroup;
        public final boolean isTalkBackEnabled;
        public final String messageToken;
        public final EntryViewModel.Sender sender;
        public final boolean showSender;
        public final FileTypes status;
        public final String timestamp;

        public MessageViewModel(EntryViewModel.Sender sender, ViewModelKt viewModelKt, EntryViewModel.ContentDescription contentDescription, boolean z, String str, String str2, FileTypes fileTypes, String str3, boolean z2, boolean z3, boolean z4) {
            this.sender = sender;
            this.body = viewModelKt;
            this.contentDescription = contentDescription;
            this.showSender = z;
            this.idempotenceToken = str;
            this.messageToken = str2;
            this.status = fileTypes;
            this.timestamp = str3;
            this.chatUiUpliftEnabled = z2;
            this.isFirstInGroup = z3;
            this.isTalkBackEnabled = z4;
            if (str == null && str2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageViewModel)) {
                return false;
            }
            MessageViewModel messageViewModel = (MessageViewModel) obj;
            return this.sender == messageViewModel.sender && this.body.equals(messageViewModel.body) && this.contentDescription.equals(messageViewModel.contentDescription) && this.showSender == messageViewModel.showSender && Intrinsics.areEqual(this.idempotenceToken, messageViewModel.idempotenceToken) && Intrinsics.areEqual(this.messageToken, messageViewModel.messageToken) && Intrinsics.areEqual(this.status, messageViewModel.status) && Intrinsics.areEqual(this.timestamp, messageViewModel.timestamp) && this.chatUiUpliftEnabled == messageViewModel.chatUiUpliftEnabled && this.isFirstInGroup == messageViewModel.isFirstInGroup && this.isTalkBackEnabled == messageViewModel.isTalkBackEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final ViewModelKt getBody() {
            return this.body;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final EntryViewModel.ContentDescription getContentDescription() {
            return this.contentDescription;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final String getId() {
            String str = this.idempotenceToken;
            if (str != null) {
                return str;
            }
            String str2 = this.messageToken;
            str2.getClass();
            return str2;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final EntryViewModel.Sender getSender() {
            return this.sender;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final boolean getShowSender() {
            return this.showSender;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.contentDescription.hashCode() + ((this.body.hashCode() + (this.sender.hashCode() * 31)) * 31)) * 31, 31, this.showSender);
            String str = this.idempotenceToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.messageToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            FileTypes fileTypes = this.status;
            int hashCode3 = (hashCode2 + (fileTypes == null ? 0 : fileTypes.hashCode())) * 31;
            String str3 = this.timestamp;
            return Boolean.hashCode(this.isTalkBackEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.chatUiUpliftEnabled), 31, this.isFirstInGroup);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageViewModel(sender=");
            sb.append(this.sender);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", contentDescription=");
            sb.append(this.contentDescription);
            sb.append(", showSender=");
            sb.append(this.showSender);
            sb.append(", idempotenceToken=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.idempotenceToken, ", messageToken=", this.messageToken, ", status=");
            sb.append(this.status);
            sb.append(", timestamp=");
            sb.append(this.timestamp);
            sb.append(", chatUiUpliftEnabled=");
            re$$ExternalSyntheticOutline0.m(sb, this.chatUiUpliftEnabled, ", isFirstInGroup=", this.isFirstInGroup, ", isTalkBackEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isTalkBackEnabled, ")");
        }
    }

    public final class NameDisplayViewModel extends ChatContentViewModel {
        public final Integer avatarRes;
        public final boolean isVisible;
        public final String name;
        public final NameColorType nameColorType;
        public final SpaceType spaceBetween;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NameColorType {
            public static final /* synthetic */ NameColorType[] $VALUES;
            public static final NameColorType SUBTLE;

            static {
                NameColorType nameColorType = new NameColorType("SUBTLE", 0);
                SUBTLE = nameColorType;
                $VALUES = new NameColorType[]{nameColorType, new NameColorType("STANDARD", 1)};
            }

            public static NameColorType valueOf(String str) {
                return (NameColorType) Enum.valueOf(NameColorType.class, str);
            }

            public static NameColorType[] values() {
                return (NameColorType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SpaceType {
            public static final /* synthetic */ SpaceType[] $VALUES;
            public static final SpaceType LARGE;

            /* JADX INFO: Fake field, exist only in values array */
            SpaceType EF0;

            static {
                SpaceType spaceType = new SpaceType("SMALL", 0);
                SpaceType spaceType2 = new SpaceType("LARGE", 1);
                LARGE = spaceType2;
                $VALUES = new SpaceType[]{spaceType, spaceType2};
            }

            public static SpaceType valueOf(String str) {
                return (SpaceType) Enum.valueOf(SpaceType.class, str);
            }

            public static SpaceType[] values() {
                return (SpaceType[]) $VALUES.clone();
            }
        }

        public NameDisplayViewModel(String str, NameColorType nameColorType, Integer num, boolean z, SpaceType spaceType) {
            nameColorType.getClass();
            spaceType.getClass();
            this.name = str;
            this.nameColorType = nameColorType;
            this.avatarRes = num;
            this.isVisible = z;
            this.spaceBetween = spaceType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameDisplayViewModel)) {
                return false;
            }
            NameDisplayViewModel nameDisplayViewModel = (NameDisplayViewModel) obj;
            return Intrinsics.areEqual(this.name, nameDisplayViewModel.name) && this.nameColorType == nameDisplayViewModel.nameColorType && Intrinsics.areEqual(this.avatarRes, nameDisplayViewModel.avatarRes) && this.isVisible == nameDisplayViewModel.isVisible && this.spaceBetween == nameDisplayViewModel.spaceBetween;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            String str = this.name;
            int hashCode = (this.nameColorType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Integer num = this.avatarRes;
            return this.spaceBetween.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.isVisible);
        }

        public final String toString() {
            return "NameDisplayViewModel(name=" + this.name + ", nameColorType=" + this.nameColorType + ", avatarRes=" + this.avatarRes + ", isVisible=" + this.isVisible + ", spaceBetween=" + this.spaceBetween + ")";
        }
    }

    public final class StatusTimestampViewModel extends ChatContentViewModel {
        public final boolean isTimestampVisible;
        public final boolean showStatusIcon;
        public final FileTypes status;
        public final String statusText;
        public final String timestampText;

        public StatusTimestampViewModel(String str, FileTypes fileTypes, boolean z, String str2, boolean z2) {
            this.statusText = str;
            this.status = fileTypes;
            this.showStatusIcon = z;
            this.timestampText = str2;
            this.isTimestampVisible = z2;
        }

        public static StatusTimestampViewModel copy$default(StatusTimestampViewModel statusTimestampViewModel, String str, FileTypes fileTypes, boolean z, String str2, boolean z2, int i) {
            if ((i & 1) != 0) {
                str = statusTimestampViewModel.statusText;
            }
            String str3 = str;
            if ((i & 2) != 0) {
                fileTypes = statusTimestampViewModel.status;
            }
            FileTypes fileTypes2 = fileTypes;
            if ((i & 4) != 0) {
                z = statusTimestampViewModel.showStatusIcon;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                str2 = statusTimestampViewModel.timestampText;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                z2 = statusTimestampViewModel.isTimestampVisible;
            }
            statusTimestampViewModel.getClass();
            return new StatusTimestampViewModel(str3, fileTypes2, z3, str4, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusTimestampViewModel)) {
                return false;
            }
            StatusTimestampViewModel statusTimestampViewModel = (StatusTimestampViewModel) obj;
            return Intrinsics.areEqual(this.statusText, statusTimestampViewModel.statusText) && Intrinsics.areEqual(this.status, statusTimestampViewModel.status) && this.showStatusIcon == statusTimestampViewModel.showStatusIcon && Intrinsics.areEqual(this.timestampText, statusTimestampViewModel.timestampText) && this.isTimestampVisible == statusTimestampViewModel.isTimestampVisible;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            String str = this.statusText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            FileTypes fileTypes = this.status;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (fileTypes == null ? 0 : fileTypes.hashCode())) * 31, 31, this.showStatusIcon);
            String str2 = this.timestampText;
            return Boolean.hashCode(this.isTimestampVisible) + ((m + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusTimestampViewModel(statusText=");
            sb.append(this.statusText);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", showStatusIcon=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.showStatusIcon, ", timestampText=", this.timestampText, ", isTimestampVisible=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isTimestampVisible, ")");
        }
    }

    public final class StatusViewModel extends ChatContentViewModel {
        public final String text;

        public StatusViewModel(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusViewModel) && Intrinsics.areEqual(this.text, ((StatusViewModel) obj).text);
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StatusViewModel(text=", this.text, ")");
        }
    }

    public final class SuggestedRepliesViewModel extends ChatContentViewModel {
        public final boolean chatUiUpliftEnabled;
        public final ArrayList replies;
        public final boolean useEmojiButtons;
        public final boolean useEnhancedStyle;

        public final class SuggestedReplyViewModel {
            public final String text;
            public final String token;

            public SuggestedReplyViewModel(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.token = str;
                this.text = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SuggestedReplyViewModel)) {
                    return false;
                }
                SuggestedReplyViewModel suggestedReplyViewModel = (SuggestedReplyViewModel) obj;
                return Intrinsics.areEqual(this.token, suggestedReplyViewModel.token) && Intrinsics.areEqual(this.text, suggestedReplyViewModel.text);
            }

            public final int hashCode() {
                return this.text.hashCode() + (this.token.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("SuggestedReplyViewModel(token=", this.token, ", text=", this.text, ")");
            }
        }

        public SuggestedRepliesViewModel(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
            this.replies = arrayList;
            this.useEmojiButtons = z;
            this.useEnhancedStyle = z2;
            this.chatUiUpliftEnabled = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedRepliesViewModel)) {
                return false;
            }
            SuggestedRepliesViewModel suggestedRepliesViewModel = (SuggestedRepliesViewModel) obj;
            return this.replies.equals(suggestedRepliesViewModel.replies) && this.useEmojiButtons == suggestedRepliesViewModel.useEmojiButtons && this.useEnhancedStyle == suggestedRepliesViewModel.useEnhancedStyle && this.chatUiUpliftEnabled == suggestedRepliesViewModel.chatUiUpliftEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.chatUiUpliftEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.replies.hashCode() * 31, 31, this.useEmojiButtons), 31, this.useEnhancedStyle);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuggestedRepliesViewModel(replies=");
            sb.append(this.replies);
            sb.append(", useEmojiButtons=");
            sb.append(this.useEmojiButtons);
            sb.append(", useEnhancedStyle=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.useEnhancedStyle, ", chatUiUpliftEnabled=", this.chatUiUpliftEnabled, ")");
        }
    }

    public final class TimestampDividerViewModel extends ChatContentViewModel {
        public final boolean chatUiUpliftEnabled;
        public final String date;
        public final Styling styling;
        public final String time;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Styling {
            public static final /* synthetic */ Styling[] $VALUES;
            public static final Styling AFTER_DIVIDER;
            public static final Styling BELOW_SYSTEM_MESSAGE;
            public static final Styling DEFAULT;

            static {
                Styling styling = new Styling("DEFAULT", 0);
                DEFAULT = styling;
                Styling styling2 = new Styling("BELOW_SYSTEM_MESSAGE", 1);
                BELOW_SYSTEM_MESSAGE = styling2;
                Styling styling3 = new Styling("AFTER_DIVIDER", 2);
                AFTER_DIVIDER = styling3;
                $VALUES = new Styling[]{styling, styling2, styling3};
            }

            public static Styling valueOf(String str) {
                return (Styling) Enum.valueOf(Styling.class, str);
            }

            public static Styling[] values() {
                return (Styling[]) $VALUES.clone();
            }
        }

        public TimestampDividerViewModel(String str, String str2, Styling styling, boolean z) {
            str.getClass();
            str2.getClass();
            this.date = str;
            this.time = str2;
            this.styling = styling;
            this.chatUiUpliftEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimestampDividerViewModel)) {
                return false;
            }
            TimestampDividerViewModel timestampDividerViewModel = (TimestampDividerViewModel) obj;
            return Intrinsics.areEqual(this.date, timestampDividerViewModel.date) && Intrinsics.areEqual(this.time, timestampDividerViewModel.time) && this.styling == timestampDividerViewModel.styling && this.chatUiUpliftEnabled == timestampDividerViewModel.chatUiUpliftEnabled;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.chatUiUpliftEnabled) + ((this.styling.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.date.hashCode() * 31, 31, this.time)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimestampDividerViewModel(date=", this.date, ", time=", this.time, ", styling=");
            m.append(this.styling);
            m.append(", chatUiUpliftEnabled=");
            m.append(this.chatUiUpliftEnabled);
            m.append(")");
            return m.toString();
        }
    }

    public final class TypingIndicatorViewModel extends EntryViewModel {
        public final BodyViewModel$TypingIndicatorBodyViewModel body;
        public final EntryViewModel.ContentDescription contentDescription;
        public final EntryViewModel.Sender sender = EntryViewModel.Sender.BOT;
        public final boolean showSender;

        public TypingIndicatorViewModel(EntryViewModel.ContentDescription contentDescription, BodyViewModel$TypingIndicatorBodyViewModel bodyViewModel$TypingIndicatorBodyViewModel, boolean z) {
            this.contentDescription = contentDescription;
            this.body = bodyViewModel$TypingIndicatorBodyViewModel;
            this.showSender = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypingIndicatorViewModel)) {
                return false;
            }
            TypingIndicatorViewModel typingIndicatorViewModel = (TypingIndicatorViewModel) obj;
            return this.contentDescription.equals(typingIndicatorViewModel.contentDescription) && this.body.equals(typingIndicatorViewModel.body) && this.showSender == typingIndicatorViewModel.showSender;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final ViewModelKt getBody() {
            return this.body;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final EntryViewModel.ContentDescription getContentDescription() {
            return this.contentDescription;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final String getId() {
            return "TypingIndicatorViewModelId";
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final EntryViewModel.Sender getSender() {
            return this.sender;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel.EntryViewModel
        public final boolean getShowSender() {
            return this.showSender;
        }

        @Override // com.squareup.cash.support.chat.viewmodels.ChatContentViewModel
        public final int hashCode() {
            return Boolean.hashCode(this.showSender) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.contentDescription.hashCode() * 31, 31, this.body.chatUiUpliftEnabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TypingIndicatorViewModel(contentDescription=");
            sb.append(this.contentDescription);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", showSender=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showSender, ")");
        }
    }

    public abstract int hashCode();
}
