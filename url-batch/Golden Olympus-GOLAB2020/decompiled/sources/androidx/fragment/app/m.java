package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.AbstractC1278b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class m extends j {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f12496a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12497b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f12498c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12499d;

    /* renamed from: e, reason: collision with root package name */
    final FragmentManager f12500e;

    m(AbstractActivityC1333h abstractActivityC1333h) {
        this(abstractActivityC1333h, abstractActivityC1333h, new Handler(), 0);
    }

    Activity e() {
        return this.f12496a;
    }

    Context f() {
        return this.f12497b;
    }

    public Handler g() {
        return this.f12498c;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(Fragment fragment, String[] strArr, int i4) {
    }

    public abstract boolean l(String str);

    public void m(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (i4 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.q(this.f12497b, intent, bundle);
    }

    public void n(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (i4 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC1278b.B(this.f12496a, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public abstract void o();

    m(Activity activity, Context context, Handler handler, int i4) {
        this.f12500e = new u();
        this.f12496a = activity;
        this.f12497b = (Context) A.h.g(context, "context == null");
        this.f12498c = (Handler) A.h.g(handler, "handler == null");
        this.f12499d = i4;
    }
}
