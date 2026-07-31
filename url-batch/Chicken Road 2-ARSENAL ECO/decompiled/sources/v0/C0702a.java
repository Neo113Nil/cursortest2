package v0;

import android.app.Application;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0702a f6053a = new C0702a();

    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.i.d(processName, "getProcessName()");
        return processName;
    }
}
