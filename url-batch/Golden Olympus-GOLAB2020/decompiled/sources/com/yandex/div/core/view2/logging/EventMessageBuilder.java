package com.yandex.div.core.view2.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class EventMessageBuilder {

    @NotNull
    private final StringBuilder consolidatedEvents = new StringBuilder();

    protected final void appendEventMessage(@NotNull String event, @NotNull String message) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.consolidatedEvents.length() > 0) {
            this.consolidatedEvents.append(", ");
        }
        this.consolidatedEvents.append(event + " (" + message + ')');
    }

    @Nullable
    protected final String buildEventsLogMessage() {
        StringBuilder sb = this.consolidatedEvents;
        if (sb.length() <= 0) {
            return null;
        }
        String sb2 = sb.toString();
        StringsKt.i(sb);
        return sb2;
    }
}
