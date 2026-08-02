package C0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f229a;

    public h(WebViewActivity webViewActivity) {
        this.f229a = webViewActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("close action".equals(intent.getAction())) {
            this.f229a.finish();
        }
    }
}
