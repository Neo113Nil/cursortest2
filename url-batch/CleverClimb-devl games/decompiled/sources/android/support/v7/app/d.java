package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static int f1632a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1633b;

    public abstract a a();

    public abstract android.support.v7.view.b a(b.a aVar);

    public abstract <T extends View> T a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract ActionBarDrawerToggle.a h();

    public abstract void i();

    public abstract boolean j();

    public static d a(Activity activity, c cVar) {
        return a(activity, activity.getWindow(), cVar);
    }

    public static d a(Dialog dialog, c cVar) {
        return a(dialog.getContext(), dialog.getWindow(), cVar);
    }

    private static d a(Context context, Window window, c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new f(context, window, cVar);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new h(context, window, cVar);
        }
        return new g(context, window, cVar);
    }

    d() {
    }

    public static int k() {
        return f1632a;
    }

    public static boolean l() {
        return f1633b;
    }
}
