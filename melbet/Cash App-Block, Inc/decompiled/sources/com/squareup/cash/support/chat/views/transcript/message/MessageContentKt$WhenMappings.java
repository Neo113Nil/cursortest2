package com.squareup.cash.support.chat.views.transcript.message;

import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class MessageContentKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ChatContentViewModel.EntryViewModel.Sender.values().length];
        try {
            ChatContentViewModel.EntryViewModel.Sender sender = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ChatContentViewModel.EntryViewModel.Sender sender2 = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ChatContentViewModel.EntryViewModel.Sender sender3 = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ChatContentViewModel.EntryViewModel.Sender sender4 = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
