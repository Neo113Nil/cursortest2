package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
final class ar extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f13513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f13513a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        if (i4 == 1) {
            this.f13513a.f13514a.trySetResult(3);
        } else if (i4 == 2) {
            this.f13513a.f13514a.trySetResult(2);
        } else {
            if (i4 != 3) {
                return;
            }
            this.f13513a.f13514a.trySetResult(1);
        }
    }
}
