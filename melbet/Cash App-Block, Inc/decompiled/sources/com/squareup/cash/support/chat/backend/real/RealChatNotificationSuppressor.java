package com.squareup.cash.support.chat.backend.real;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealChatNotificationSuppressor {
    public boolean inForeground;
    public boolean onChatScreen;
    public boolean onSurveyScreenState;

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealChatNotificationSuppressor();
        }
    }
}
