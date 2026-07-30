package com.onesignal.core.internal.permissions;

import android.content.DialogInterface;
import com.onesignal.notifications.internal.registration.impl.a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4542e;

    public /* synthetic */ a(int i2, Object obj) {
        this.f4541d = i2;
        this.f4542e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f4541d) {
            case 0:
                e.show$lambda$0((d) this.f4542e, dialogInterface, i2);
                break;
            case 1:
                e.show$lambda$1((d) this.f4542e, dialogInterface, i2);
                break;
            default:
                a.b.invokeSuspend$lambda$1((com.onesignal.notifications.internal.registration.impl.a) this.f4542e, dialogInterface, i2);
                break;
        }
    }
}
