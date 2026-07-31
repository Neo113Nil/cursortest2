package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewProxyActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onCreate", "onDestroy", BuildConfig.FLAVOR, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "intent", "onNewIntent", "Lcom/onevcat/uniwebview/d0;", "handler", "Lcom/onevcat/uniwebview/d0;", "<init>", "()V", "Companion", "com/onevcat/uniwebview/a5", "uniwebview_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class UniWebViewProxyActivity extends Activity {
    public static final a5 Companion = new a5();
    public static final String HANDLER_ID = "com.uniwebview.UniWebViewProxyActivity.handlerId";
    private d0 handler;

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        d0 d0Var = this.handler;
        if (d0Var != null) {
            d0Var.a(this, requestCode, resultCode, data);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        d0 d0Var;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(HANDLER_ID);
        d0.a.getClass();
        LinkedHashMap linkedHashMap = c0.b;
        d0 d0Var2 = (d0) linkedHashMap.get(stringExtra);
        if (d0Var2 != null) {
            this.handler = d0Var2;
            d0Var2.a(this);
            return;
        }
        o oVar = o.b;
        String message = "No handler found for this activity: " + this + ". Usually this means a wrong implementation of the browser that does not start the callback URI intent in the desired way. Trying to recover by force dismiss and go back to the normal flow...If you know the browser you are using when seeing this, please report back to the developer.";
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.CRITICAL, message);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d0Var = null;
                break;
            } else {
                d0Var = (d0) ((Map.Entry) it.next()).getValue();
                if (d0Var != null) {
                    break;
                }
            }
        }
        if (d0Var != null) {
            o oVar2 = o.b;
            String message2 = "handler is null for " + this + ". Forwarding intent to the first handler: " + d0Var;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            oVar2.a(n.DEBUG, message2);
            d0Var.a(getIntent());
            d0Var.a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d0 d0Var = this.handler;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d0 d0Var = this.handler;
        if (d0Var != null) {
            d0Var.a(intent);
        }
    }
}
