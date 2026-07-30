package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class y extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final H f5776a;

    /* renamed from: b, reason: collision with root package name */
    public H f5777b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5778c;

    public y(Context context, H h7, Context context2) {
        super(context);
        this.f5776a = h7;
        this.f5778c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f5778c.getSystemService(str);
            }
        }
        if (this.f5777b == null) {
            this.f5777b = this.f5776a;
        }
        return this.f5777b;
    }
}
