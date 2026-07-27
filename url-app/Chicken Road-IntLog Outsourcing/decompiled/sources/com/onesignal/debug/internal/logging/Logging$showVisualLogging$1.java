package com.onesignal.debug.internal.logging;

import android.app.Activity;
import android.app.AlertDialog;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.debug.internal.logging.Logging$showVisualLogging$1", f = "Logging.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Logging$showVisualLogging$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $finalFullMessage;
    final /* synthetic */ LogLevel $level;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logging$showVisualLogging$1(LogLevel logLevel, String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$level = logLevel;
        this.$finalFullMessage = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new Logging$showVisualLogging$1(this.$level, this.$finalFullMessage, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        IApplicationService applicationService = Logging.INSTANCE.getApplicationService();
        Activity current = applicationService != null ? applicationService.getCurrent() : null;
        if (current != null) {
            new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((Logging$showVisualLogging$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
