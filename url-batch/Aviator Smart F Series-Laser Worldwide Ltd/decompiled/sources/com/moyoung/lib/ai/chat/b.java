package com.moyoung.lib.ai.chat;

/* loaded from: classes4.dex */
public class b {
    public static final String ROLE_ASSISTANT = "assistant";
    public static final String ROLE_SYSTEM = "system";
    public static final String ROLE_USER = "user";
    public String content;
    public String contentId;
    public String role;

    public b(String str, String str2, String str3) {
        this.contentId = str;
        this.role = str2;
        this.content = str3;
    }
}
