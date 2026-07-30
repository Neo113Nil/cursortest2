package com.pichillilorenzo.flutter_inappwebview_android.types;

import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class ChannelDelegateImpl implements IChannelDelegate {
    private q channel;

    public ChannelDelegateImpl(q qVar) {
        this.channel = qVar;
        qVar.b(this);
    }

    public void dispose() {
        q qVar = this.channel;
        if (qVar != null) {
            qVar.b(null);
            this.channel = null;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate
    public q getChannel() {
        return this.channel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
    }
}
