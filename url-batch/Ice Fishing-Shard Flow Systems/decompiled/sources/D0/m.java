package D0;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f341a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.i f342b;

    /* renamed from: c, reason: collision with root package name */
    public A0.l f343c;

    public m(Activity activity, e0.c executor, A0.i callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f341a = activity;
        this.f342b = callback;
    }
}
