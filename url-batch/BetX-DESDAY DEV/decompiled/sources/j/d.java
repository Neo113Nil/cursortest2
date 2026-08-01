package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.luckyarcade.spinthrow.R;

/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2813f;

    /* renamed from: a, reason: collision with root package name */
    public int f2814a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2815b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2816c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f2817d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2818e;

    public d(Context context, int i) {
        super(context);
        this.f2814a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2818e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2817d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2817d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2815b == null) {
            this.f2815b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2815b.setTo(theme);
            }
        }
        this.f2815b.applyStyle(this.f2814a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2818e == null) {
            Configuration configuration = this.f2817d;
            if (configuration != null) {
                if (f2813f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2813f = configuration2;
                }
                if (!configuration.equals(f2813f)) {
                    this.f2818e = createConfigurationContext(this.f2817d).getResources();
                }
            }
            this.f2818e = super.getResources();
        }
        return this.f2818e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2816c == null) {
            this.f2816c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2816c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2815b;
        if (theme != null) {
            return theme;
        }
        if (this.f2814a == 0) {
            this.f2814a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2815b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2814a != i) {
            this.f2814a = i;
            b();
        }
    }
}
