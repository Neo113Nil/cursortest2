package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.glasspulse.glasspulse.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2514f;

    /* renamed from: a, reason: collision with root package name */
    public int f2515a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2516b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2517c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2518e;

    public C0139c(Context context, int i) {
        super(context);
        this.f2515a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2518e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2516b == null) {
            this.f2516b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2516b.setTo(theme);
            }
        }
        this.f2516b.applyStyle(this.f2515a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2518e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2514f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2514f = configuration2;
                }
                if (!configuration.equals(f2514f)) {
                    this.f2518e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2518e = super.getResources();
        }
        return this.f2518e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2517c == null) {
            this.f2517c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2517c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2516b;
        if (theme != null) {
            return theme;
        }
        if (this.f2515a == 0) {
            this.f2515a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2516b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2515a != i) {
            this.f2515a = i;
            b();
        }
    }
}
