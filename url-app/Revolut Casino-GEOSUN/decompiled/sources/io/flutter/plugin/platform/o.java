package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class o extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final r f2500a;

    /* renamed from: b, reason: collision with root package name */
    public r f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2502c;

    public o(Context context, r rVar, Context context2) {
        super(context);
        this.f2500a = rVar;
        this.f2502c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f2502c.getSystemService(str);
            }
        }
        if (this.f2501b == null) {
            this.f2501b = this.f2500a;
        }
        return this.f2501b;
    }
}
