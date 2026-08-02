package com.squareup.cash.support.chat.backend.api;

import androidx.glance.session.TimerScopeKt;
import java.time.Instant;

/* loaded from: classes7.dex */
public abstract class Message {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Sender {
        public static final /* synthetic */ Sender[] $VALUES;
        public static final Sender ADVOCATE;
        public static final Sender BOT;
        public static final Sender CUSTOMER;
        public static final Sender SYSTEM;
        public static final Sender UNKNOWN;

        static {
            Sender sender = new Sender("CUSTOMER", 0);
            CUSTOMER = sender;
            Sender sender2 = new Sender("ADVOCATE", 1);
            ADVOCATE = sender2;
            Sender sender3 = new Sender("BOT", 2);
            BOT = sender3;
            Sender sender4 = new Sender("SYSTEM", 3);
            SYSTEM = sender4;
            Sender sender5 = new Sender("UNKNOWN", 4);
            UNKNOWN = sender5;
            $VALUES = new Sender[]{sender, sender2, sender3, sender4, sender5};
        }

        public static Sender valueOf(String str) {
            return (Sender) Enum.valueOf(Sender.class, str);
        }

        public static Sender[] values() {
            return (Sender[]) $VALUES.clone();
        }
    }

    public abstract MessageBody getBody();

    public abstract String getIdempotenceToken();

    public abstract Sender getSender();

    public abstract TimerScopeKt getStatus();

    public abstract Instant getTimestamp();
}
