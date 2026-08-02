package com.squareup.cash.support.chat.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ChatPermission {
    public static final /* synthetic */ ChatPermission[] $VALUES;
    public static final ChatPermission ALLOWED;
    public static final ChatPermission DENIED;
    public static final ChatPermission UNKNOWN;

    static {
        ChatPermission chatPermission = new ChatPermission("ALLOWED", 0);
        ALLOWED = chatPermission;
        ChatPermission chatPermission2 = new ChatPermission("DENIED", 1);
        DENIED = chatPermission2;
        ChatPermission chatPermission3 = new ChatPermission("UNKNOWN", 2);
        UNKNOWN = chatPermission3;
        $VALUES = new ChatPermission[]{chatPermission, chatPermission2, chatPermission3};
    }

    public static ChatPermission valueOf(String str) {
        return (ChatPermission) Enum.valueOf(ChatPermission.class, str);
    }

    public static ChatPermission[] values() {
        return (ChatPermission[]) $VALUES.clone();
    }
}
