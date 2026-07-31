package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/onevcat/uniwebview/y;", "handler", "Lcom/onevcat/uniwebview/y;", "Companion", "com/onevcat/uniwebview/W1", "uniwebview_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class UniWebViewProxyActivity extends Activity {
    public static final W1 Companion = new W1();
    public static final String HANDLER_ID = "com.uniwebview.UniWebViewProxyActivity.handlerId";
    private InterfaceC0101y handler;

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        InterfaceC0101y interfaceC0101y = this.handler;
        if (interfaceC0101y != null) {
            interfaceC0101y.a(this, requestCode, resultCode, data);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        InterfaceC0101y interfaceC0101y;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(HANDLER_ID);
        InterfaceC0101y.a.getClass();
        LinkedHashMap linkedHashMap = C0098x.b;
        InterfaceC0101y interfaceC0101y2 = (InterfaceC0101y) linkedHashMap.get(stringExtra);
        if (interfaceC0101y2 != null) {
            this.handler = interfaceC0101y2;
            interfaceC0101y2.a(this);
            return;
        }
        C0060l c0060l = C0060l.b;
        String message = "No handler found for this activity: " + this + ". Usually this means a wrong implementation of the browser that does not start the callback URI intent in the desired way. Trying to recover by force dismiss and go back to the normal flow...If you know the browser you are using when seeing this, please report back to the developer.";
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.CRITICAL, message);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC0101y = null;
                break;
            } else {
                interfaceC0101y = (InterfaceC0101y) ((Map.Entry) it.next()).getValue();
                if (interfaceC0101y != null) {
                    break;
                }
            }
        }
        if (interfaceC0101y != null) {
            C0060l c0060l2 = C0060l.b;
            String message2 = "handler is null for " + this + ". Forwarding intent to the first handler: " + interfaceC0101y;
            c0060l2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c0060l2.a(EnumC0057k.DEBUG, message2);
            interfaceC0101y.a(getIntent());
            interfaceC0101y.a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC0101y interfaceC0101y = this.handler;
        if (interfaceC0101y != null) {
            interfaceC0101y.b();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        InterfaceC0101y interfaceC0101y = this.handler;
        if (interfaceC0101y != null) {
            interfaceC0101y.a(intent);
        }
    }
}
