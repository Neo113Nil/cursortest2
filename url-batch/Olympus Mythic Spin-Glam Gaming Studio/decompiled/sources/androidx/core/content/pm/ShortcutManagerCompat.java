package androidx.core.content.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes10.dex */
public class ShortcutManagerCompat {

    @RequiresApi
    private static class Api25Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShortcutMatchFlags {
    }

    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    class AnonymousClass1 extends BroadcastReceiver {
        final /* synthetic */ IntentSender val$callback;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.val$callback.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }
}
