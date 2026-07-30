package com.google.android.exoplayer2.util;

import android.os.Looper;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public interface HandlerWrapper {

    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i8);

    Message obtainMessage(int i8);

    Message obtainMessage(int i8, int i9, int i10);

    Message obtainMessage(int i8, int i9, int i10, @Nullable Object obj);

    Message obtainMessage(int i8, @Nullable Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j8);

    void removeCallbacksAndMessages(@Nullable Object obj);

    void removeMessages(int i8);

    boolean sendEmptyMessage(int i8);

    boolean sendEmptyMessageAtTime(int i8, long j8);

    boolean sendEmptyMessageDelayed(int i8, int i9);

    boolean sendMessageAtFrontOfQueue(Message message);
}
