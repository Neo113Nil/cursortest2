package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2078f;

    /* renamed from: a, reason: collision with root package name */
    public int f2079a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2080b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2081c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2082e;

    public c(Context context, int i) {
        super(context);
        this.f2079a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2082e != null) {
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
        if (this.f2080b == null) {
            this.f2080b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2080b.setTo(theme);
            }
        }
        this.f2080b.applyStyle(this.f2079a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2082e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2078f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2078f = configuration2;
                }
                if (!configuration.equals(f2078f)) {
                    this.f2082e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2082e = super.getResources();
        }
        return this.f2082e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2081c == null) {
            this.f2081c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2081c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2080b;
        if (theme != null) {
            return theme;
        }
        if (this.f2079a == 0) {
            this.f2079a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2080b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2079a != i) {
            this.f2079a = i;
            b();
        }
    }
}
