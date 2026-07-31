package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: f, reason: collision with root package name */
    private final Activity f681f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f682g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f683h;

    /* renamed from: i, reason: collision with root package name */
    private final int f684i;

    /* renamed from: j, reason: collision with root package name */
    final j f685j;

    h(Activity activity, Context context, Handler handler, int i7) {
        this.f685j = new j();
        this.f681f = activity;
        this.f682g = (Context) q.f.b(context, "context == null");
        this.f683h = (Handler) q.f.b(handler, "handler == null");
        this.f684i = i7;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View d(int i7) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean e() {
        return true;
    }

    Activity f() {
        return this.f681f;
    }

    Context g() {
        return this.f682g;
    }

    Handler j() {
        return this.f683h;
    }

    void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f682g);
    }

    public int o() {
        return this.f684i;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r() {
    }
}
