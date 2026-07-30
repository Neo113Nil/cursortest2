package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final q f534a;

    /* renamed from: b, reason: collision with root package name */
    public q f535b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f536c;

    public n(Context context, q qVar, Context context2) {
        super(context);
        this.f534a = qVar;
        this.f536c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f536c.getSystemService(str);
            }
        }
        if (this.f535b == null) {
            this.f535b = this.f534a;
        }
        return this.f535b;
    }
}
