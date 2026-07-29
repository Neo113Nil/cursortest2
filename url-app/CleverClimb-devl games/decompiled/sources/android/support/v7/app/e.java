package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;

/* compiled from: AppCompatDelegateImplBase.java */
/* loaded from: classes.dex */
abstract class e extends d {
    private static boolean m;
    private static final boolean n;
    private static final int[] o;

    /* renamed from: a, reason: collision with root package name */
    final Context f1634a;

    /* renamed from: b, reason: collision with root package name */
    final Window f1635b;

    /* renamed from: c, reason: collision with root package name */
    final Window.Callback f1636c;

    /* renamed from: d, reason: collision with root package name */
    final Window.Callback f1637d;
    final c e;
    android.support.v7.app.a f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private CharSequence p;
    private boolean q;
    private boolean r;

    abstract void a(int i, Menu menu);

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract android.support.v7.view.b b(b.a aVar);

    abstract void b(CharSequence charSequence);

    abstract boolean b(int i, Menu menu);

    @Override // android.support.v7.app.d
    public void c(Bundle bundle) {
    }

    @Override // android.support.v7.app.d
    public boolean j() {
        return false;
    }

    abstract void m();

    public boolean p() {
        return false;
    }

    static {
        n = Build.VERSION.SDK_INT < 21;
        if (n && !m) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: android.support.v7.app.e.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    if (a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                private boolean a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    return message.contains("drawable") || message.contains("Drawable");
                }
            });
            m = true;
        }
        o = new int[]{R.attr.windowBackground};
    }

    e(Context context, Window window, c cVar) {
        this.f1634a = context;
        this.f1635b = window;
        this.e = cVar;
        this.f1636c = this.f1635b.getCallback();
        if (this.f1636c instanceof b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1637d = a(this.f1636c);
        this.f1635b.setCallback(this.f1637d);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, o);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.f1635b.setBackgroundDrawable(drawableIfKnown);
        }
        obtainStyledAttributes.recycle();
    }

    Window.Callback a(Window.Callback callback) {
        return new b(callback);
    }

    @Override // android.support.v7.app.d
    public android.support.v7.app.a a() {
        m();
        return this.f;
    }

    final android.support.v7.app.a n() {
        return this.f;
    }

    @Override // android.support.v7.app.d
    public MenuInflater b() {
        if (this.g == null) {
            m();
            this.g = new android.support.v7.view.g(this.f != null ? this.f.b() : this.f1634a);
        }
        return this.g;
    }

    @Override // android.support.v7.app.d
    public final ActionBarDrawerToggle.a h() {
        return new a();
    }

    final Context o() {
        android.support.v7.app.a a2 = a();
        Context b2 = a2 != null ? a2.b() : null;
        return b2 == null ? this.f1634a : b2;
    }

    /* compiled from: AppCompatDelegateImplBase.java */
    private class a implements ActionBarDrawerToggle.a {
        a() {
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.a
        public void a(int i) {
            android.support.v7.app.a a2 = e.this.a();
            if (a2 != null) {
                a2.a(i);
            }
        }
    }

    @Override // android.support.v7.app.d
    public void c() {
        this.q = true;
    }

    @Override // android.support.v7.app.d
    public void d() {
        this.q = false;
    }

    @Override // android.support.v7.app.d
    public void g() {
        this.r = true;
    }

    final boolean q() {
        return this.r;
    }

    final Window.Callback r() {
        return this.f1635b.getCallback();
    }

    @Override // android.support.v7.app.d
    public final void a(CharSequence charSequence) {
        this.p = charSequence;
        b(charSequence);
    }

    final CharSequence s() {
        if (this.f1636c instanceof Activity) {
            return ((Activity) this.f1636c).getTitle();
        }
        return this.p;
    }

    /* compiled from: AppCompatDelegateImplBase.java */
    class b extends android.support.v7.view.i {
        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        b(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.c(false);
            }
            return onPreparePanel;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            e.this.b(i, menu);
            return true;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            e.this.a(i, menu);
        }
    }
}
