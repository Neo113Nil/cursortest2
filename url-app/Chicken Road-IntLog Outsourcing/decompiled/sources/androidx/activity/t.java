package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import g4.C0463h;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4074a;

    /* renamed from: b, reason: collision with root package name */
    public final C0463h f4075b = new C0463h();

    /* renamed from: c, reason: collision with root package name */
    public R.i f4076c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4077d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4078e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4079f;

    public t(Runnable runnable) {
        this.f4074a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f4077d = i2 >= 34 ? s.f4073a.a(new n(this, 0), new n(this, 1), new o(this, 0), new o(this, 1)) : q.f4068a.a(new o(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    public final void a() {
        R.i iVar;
        R.i iVar2 = this.f4076c;
        if (iVar2 == null) {
            C0463h c0463h = this.f4075b;
            ListIterator listIterator = c0463h.listIterator(c0463h.c());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iVar = 0;
                    break;
                } else {
                    iVar = listIterator.previous();
                    if (((R.i) iVar).f2594a) {
                        break;
                    }
                }
            }
            iVar2 = iVar;
        }
        this.f4076c = null;
        if (iVar2 == null) {
            this.f4074a.run();
            return;
        }
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        R.m mVar = iVar2.f2595b;
        if (isLoggable) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + mVar);
        }
        mVar.i();
        throw null;
    }
}
