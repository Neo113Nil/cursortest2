package com.crrepa.band.my.model.band.provider;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandMessageLengthProvider {
    private static final String MAX_MESSAGE_LENGTH = "max_message_length";

    private BandMessageLengthProvider() {
    }

    public static void delete() {
        g.getInstance().remove(MAX_MESSAGE_LENGTH);
    }

    public static int getMessageLength() {
        return g.getInstance().getInt(MAX_MESSAGE_LENGTH, 0);
    }

    public static boolean hasMessageLength() {
        return g.getInstance().contains(MAX_MESSAGE_LENGTH);
    }

    public static void saveMessageLength(int i8) {
        g.getInstance().putInt(MAX_MESSAGE_LENGTH, i8);
    }
}
