package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes4.dex */
public class SubscriptionManagerCompat {

    @RequiresApi
    private static class Api29Impl {
        @DoNotInline
        static int getSlotIndex(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }
}
