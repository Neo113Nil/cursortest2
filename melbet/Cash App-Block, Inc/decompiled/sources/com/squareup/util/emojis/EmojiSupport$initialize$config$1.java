package com.squareup.util.emojis;

import androidx.room.Room;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class EmojiSupport$initialize$config$1 extends Room {
    @Override // androidx.room.Room
    public final void onFailed(Throwable th) {
        Timber.Forest.w("EmojiCompat Initialization Failed", new Object[0], th);
    }

    @Override // androidx.room.Room
    public final void onInitialized() {
        Timber.Forest.i("EmojiCompat Initialized", new Object[0]);
    }
}
