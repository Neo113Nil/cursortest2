package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class s extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final B f2681a;

    /* renamed from: b, reason: collision with root package name */
    public B f2682b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2683c;

    public s(Context context, B b2, Context context2) {
        super(context);
        this.f2681a = b2;
        this.f2683c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f2683c.getSystemService(str);
            }
        }
        if (this.f2682b == null) {
            this.f2682b = this.f2681a;
        }
        return this.f2682b;
    }
}
