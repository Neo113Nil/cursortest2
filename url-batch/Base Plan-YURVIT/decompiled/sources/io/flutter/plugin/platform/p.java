package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class p extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final s f2503a;

    /* renamed from: b, reason: collision with root package name */
    public s f2504b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2505c;

    public p(Context context, s sVar, Context context2) {
        super(context);
        this.f2503a = sVar;
        this.f2505c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f2505c.getSystemService(str);
            }
        }
        if (this.f2504b == null) {
            this.f2504b = this.f2503a;
        }
        return this.f2504b;
    }
}
