package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.skydrop.fallring.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2530f;

    /* renamed from: a, reason: collision with root package name */
    public int f2531a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2532b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2533c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2534e;

    public C0140c(Context context, int i) {
        super(context);
        this.f2531a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2534e != null) {
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
        if (this.f2532b == null) {
            this.f2532b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2532b.setTo(theme);
            }
        }
        this.f2532b.applyStyle(this.f2531a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2534e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2530f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2530f = configuration2;
                }
                if (!configuration.equals(f2530f)) {
                    this.f2534e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2534e = super.getResources();
        }
        return this.f2534e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2533c == null) {
            this.f2533c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2533c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2532b;
        if (theme != null) {
            return theme;
        }
        if (this.f2531a == 0) {
            this.f2531a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2532b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2531a != i) {
            this.f2531a = i;
            b();
        }
    }
}
