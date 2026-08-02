package com.squareup.cash.support.chat.backend.real;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ChatBackendModule$Companion$provideReadTokenStorage$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE$1 = new ChatBackendModule$Companion$provideReadTokenStorage$1(1);
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE$2 = new ChatBackendModule$Companion$provideReadTokenStorage$1(2);
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE$3 = new ChatBackendModule$Companion$provideReadTokenStorage$1(3);
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE$4 = new ChatBackendModule$Companion$provideReadTokenStorage$1(4);
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE = new ChatBackendModule$Companion$provideReadTokenStorage$1(0);
    public static final ChatBackendModule$Companion$provideReadTokenStorage$1 INSTANCE$5 = new ChatBackendModule$Companion$provideReadTokenStorage$1(5);

    public /* synthetic */ ChatBackendModule$Companion$provideReadTokenStorage$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return new ChatLastReadMessageToken(str);
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                return ChatSavedInputPreference.m3750boximpl(str2);
            case 2:
                String m3751unboximpl = ((ChatSavedInputPreference) obj).m3751unboximpl();
                m3751unboximpl.getClass();
                return m3751unboximpl;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                return new ChatLastLoadedMessageToken(str3);
            case 4:
                String str4 = ((ChatLastLoadedMessageToken) obj).token;
                str4.getClass();
                return str4;
            default:
                String str5 = ((ChatLastReadMessageToken) obj).token;
                str5.getClass();
                return str5;
        }
    }
}
