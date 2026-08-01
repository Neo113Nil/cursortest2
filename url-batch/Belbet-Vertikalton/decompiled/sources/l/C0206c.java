package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.winpower.neonfit.R;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f3190f;

    /* renamed from: a, reason: collision with root package name */
    public int f3191a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f3192b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f3193c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f3194d;
    public Resources e;

    public C0206c(Context context, int i) {
        super(context);
        this.f3191a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3194d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3194d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3192b == null) {
            this.f3192b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3192b.setTo(theme);
            }
        }
        this.f3192b.applyStyle(this.f3191a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.f3194d;
            if (configuration != null) {
                if (f3190f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f3190f = configuration2;
                }
                if (!configuration.equals(f3190f)) {
                    this.e = createConfigurationContext(this.f3194d).getResources();
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3193c == null) {
            this.f3193c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3193c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3192b;
        if (theme != null) {
            return theme;
        }
        if (this.f3191a == 0) {
            this.f3191a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f3192b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3191a != i) {
            this.f3191a = i;
            b();
        }
    }
}
