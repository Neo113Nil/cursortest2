package androidx.core.os;

import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes6.dex */
public final class MessageCompat {

    @RequiresApi
    static class Api22Impl {
        @DoNotInline
        static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        static void setAsynchronous(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }
}
