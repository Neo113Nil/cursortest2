package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends j.c implements x, androidx.savedstate.b, c {

    /* renamed from: j, reason: collision with root package name */
    private w f472j;

    /* renamed from: l, reason: collision with root package name */
    private int f474l;

    /* renamed from: h, reason: collision with root package name */
    private final j f470h = new j(this);

    /* renamed from: i, reason: collision with root package name */
    private final androidx.savedstate.a f471i = androidx.savedstate.a.a(this);

    /* renamed from: k, reason: collision with root package name */
    private final OnBackPressedDispatcher f473k = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        Object f478a;

        /* renamed from: b, reason: collision with root package name */
        w f479b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 19) {
            a().a(new g() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.g
                public void d(i iVar, e.b bVar) {
                    if (bVar == e.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.g
            public void d(i iVar, e.b bVar) {
                if (bVar != e.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.c().a();
            }
        });
        if (19 > i7 || i7 > 23) {
            return;
        }
        a().a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f470h;
    }

    @Override // androidx.lifecycle.x
    public w c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f472j == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f472j = bVar.f479b;
            }
            if (this.f472j == null) {
                this.f472j = new w();
            }
        }
        return this.f472j;
    }

    @Deprecated
    public Object e() {
        return null;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher h() {
        return this.f473k;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry i() {
        return this.f471i.b();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f473k.c();
    }

    @Override // j.c, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f471i.c(bundle);
        s.g(this);
        int i7 = this.f474l;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object e7 = e();
        w wVar = this.f472j;
        if (wVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            wVar = bVar.f479b;
        }
        if (wVar == null && e7 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f478a = e7;
        bVar2.f479b = wVar;
        return bVar2;
    }

    @Override // j.c, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        e a7 = a();
        if (a7 instanceof j) {
            ((j) a7).o(e.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f471i.d(bundle);
    }
}
