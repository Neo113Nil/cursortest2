package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0641Li implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C0855Tp A01;

    public DialogInterfaceOnClickListenerC0641Li(C0855Tp c0855Tp, EditText editText) {
        this.A01 = c0855Tp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C0856Tq(this, dialogInterface));
    }
}
