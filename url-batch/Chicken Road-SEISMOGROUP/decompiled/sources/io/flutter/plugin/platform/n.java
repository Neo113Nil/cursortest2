package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class n extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final q f741a;

    /* renamed from: b, reason: collision with root package name */
    public q f742b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f743c;

    public n(Context context, q qVar, Context context2) {
        super(context);
        this.f741a = qVar;
        this.f743c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f743c.getSystemService(str);
            }
        }
        if (this.f742b == null) {
            this.f742b = this.f741a;
        }
        return this.f742b;
    }
}
