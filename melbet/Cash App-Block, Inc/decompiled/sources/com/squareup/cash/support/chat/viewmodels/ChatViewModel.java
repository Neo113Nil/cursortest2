package com.squareup.cash.support.chat.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ChatViewModel {
    public final ChatAttachmentViewModel attachment;
    public final boolean chatUiUpliftEnabled;
    public final ArrayList content;
    public final Integer firstUnreadMessageIndex;
    public final boolean initialState;
    public final String savedInput;
    public final ScrollAction scrollAction;
    public final boolean shouldAllowFileAttachments;
    public final boolean shouldShowPlaceholder;
    public final String unreadMessagesButtonText;

    public ChatViewModel(ArrayList arrayList, boolean z, String str, boolean z2, boolean z3, ChatAttachmentViewModel chatAttachmentViewModel, String str2, ScrollAction scrollAction, Integer num, boolean z4) {
        this.content = arrayList;
        this.initialState = z;
        this.unreadMessagesButtonText = str;
        this.shouldShowPlaceholder = z2;
        this.shouldAllowFileAttachments = z3;
        this.attachment = chatAttachmentViewModel;
        this.savedInput = str2;
        this.scrollAction = scrollAction;
        this.firstUnreadMessageIndex = num;
        this.chatUiUpliftEnabled = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatViewModel)) {
            return false;
        }
        ChatViewModel chatViewModel = (ChatViewModel) obj;
        return this.content.equals(chatViewModel.content) && this.initialState == chatViewModel.initialState && Intrinsics.areEqual(this.unreadMessagesButtonText, chatViewModel.unreadMessagesButtonText) && this.shouldShowPlaceholder == chatViewModel.shouldShowPlaceholder && this.shouldAllowFileAttachments == chatViewModel.shouldAllowFileAttachments && Intrinsics.areEqual(this.attachment, chatViewModel.attachment) && Intrinsics.areEqual(this.savedInput, chatViewModel.savedInput) && Intrinsics.areEqual(this.scrollAction, chatViewModel.scrollAction) && Intrinsics.areEqual(this.firstUnreadMessageIndex, chatViewModel.firstUnreadMessageIndex) && this.chatUiUpliftEnabled == chatViewModel.chatUiUpliftEnabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.content.hashCode() * 31, 31, this.initialState);
        String str = this.unreadMessagesButtonText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.shouldShowPlaceholder), 31, this.shouldAllowFileAttachments);
        ChatAttachmentViewModel chatAttachmentViewModel = this.attachment;
        int hashCode = (m2 + (chatAttachmentViewModel == null ? 0 : chatAttachmentViewModel.hashCode())) * 31;
        String str2 = this.savedInput;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ScrollAction scrollAction = this.scrollAction;
        int hashCode3 = (hashCode2 + (scrollAction == null ? 0 : scrollAction.hashCode())) * 31;
        Integer num = this.firstUnreadMessageIndex;
        return Boolean.hashCode(this.chatUiUpliftEnabled) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatViewModel(content=");
        sb.append(this.content);
        sb.append(", initialState=");
        sb.append(this.initialState);
        sb.append(", unreadMessagesButtonText=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.unreadMessagesButtonText, ", shouldShowPlaceholder=", this.shouldShowPlaceholder, ", shouldAllowFileAttachments=");
        sb.append(this.shouldAllowFileAttachments);
        sb.append(", attachment=");
        sb.append(this.attachment);
        sb.append(", savedInput=");
        sb.append(this.savedInput);
        sb.append(", scrollAction=");
        sb.append(this.scrollAction);
        sb.append(", firstUnreadMessageIndex=");
        sb.append(this.firstUnreadMessageIndex);
        sb.append(", chatUiUpliftEnabled=");
        sb.append(this.chatUiUpliftEnabled);
        sb.append(")");
        return sb.toString();
    }

    public final class ScrollAction {
        public final int scrollPosition;
        public final SnapPreference snapPreference;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SnapPreference {
            public static final /* synthetic */ SnapPreference[] $VALUES;
            public static final SnapPreference NONE;
            public static final SnapPreference SNAP_TO_START;

            static {
                SnapPreference snapPreference = new SnapPreference("NONE", 0);
                NONE = snapPreference;
                SnapPreference snapPreference2 = new SnapPreference("SNAP_TO_START", 1);
                SNAP_TO_START = snapPreference2;
                $VALUES = new SnapPreference[]{snapPreference, snapPreference2};
            }

            public static SnapPreference valueOf(String str) {
                return (SnapPreference) Enum.valueOf(SnapPreference.class, str);
            }

            public static SnapPreference[] values() {
                return (SnapPreference[]) $VALUES.clone();
            }
        }

        public ScrollAction(int i, SnapPreference snapPreference) {
            this.scrollPosition = i;
            this.snapPreference = snapPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollAction)) {
                return false;
            }
            ScrollAction scrollAction = (ScrollAction) obj;
            return this.scrollPosition == scrollAction.scrollPosition && this.snapPreference == scrollAction.snapPreference;
        }

        public final int hashCode() {
            return this.snapPreference.hashCode() + (Integer.hashCode(this.scrollPosition) * 31);
        }

        public final String toString() {
            return "ScrollAction(scrollPosition=" + this.scrollPosition + ", snapPreference=" + this.snapPreference + ")";
        }

        public /* synthetic */ ScrollAction(int i) {
            this(i, SnapPreference.NONE);
        }
    }
}
