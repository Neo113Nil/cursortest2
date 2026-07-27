package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class q extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final t f10259a;

    /* renamed from: b, reason: collision with root package name */
    public t f10260b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10261c;

    public q(Context context, t tVar, Context context2) {
        super(context);
        this.f10259a = tVar;
        this.f10261c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f10261c.getSystemService(str);
            }
        }
        if (this.f10260b == null) {
            this.f10260b = this.f10259a;
        }
        return this.f10260b;
    }
}
