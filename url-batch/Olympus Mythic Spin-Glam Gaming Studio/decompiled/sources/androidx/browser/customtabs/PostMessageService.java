package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* loaded from: classes15.dex */
public class PostMessageService extends Service {
    private IPostMessageService.Stub mBinder;

    /* renamed from: androidx.browser.customtabs.PostMessageService$1, reason: invalid class name */
    class AnonymousClass1 extends IPostMessageService.Stub {
        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
