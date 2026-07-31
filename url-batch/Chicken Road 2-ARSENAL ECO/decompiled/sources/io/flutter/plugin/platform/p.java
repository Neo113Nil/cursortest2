package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class p extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final s f4598a;

    /* renamed from: b, reason: collision with root package name */
    public s f4599b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4600c;

    public p(Context context, s sVar, Context context2) {
        super(context);
        this.f4598a = sVar;
        this.f4600c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
            if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                return this.f4600c.getSystemService(str);
            }
        }
        if (this.f4599b == null) {
            this.f4599b = this.f4598a;
        }
        return this.f4599b;
    }
}
