package com.onesignal.core.internal.permissions;

import android.content.DialogInterface;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.notifications.internal.registration.impl.a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3915b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f3914a = i7;
        this.f3915b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f3914a) {
            case 0:
                e.show$lambda$0((d) this.f3915b, dialogInterface, i7);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e.show$lambda$1((d) this.f3915b, dialogInterface, i7);
                break;
            default:
                a.b.invokeSuspend$lambda$1((com.onesignal.notifications.internal.registration.impl.a) this.f3915b, dialogInterface, i7);
                break;
        }
    }
}
