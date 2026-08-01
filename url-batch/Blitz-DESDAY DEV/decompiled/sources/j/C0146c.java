package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.winfour.neondrop.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2623f;

    /* renamed from: a, reason: collision with root package name */
    public int f2624a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2625b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2626c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2627e;

    public C0146c(Context context, int i) {
        super(context);
        this.f2624a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2627e != null) {
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
        if (this.f2625b == null) {
            this.f2625b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2625b.setTo(theme);
            }
        }
        this.f2625b.applyStyle(this.f2624a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2627e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2623f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2623f = configuration2;
                }
                if (!configuration.equals(f2623f)) {
                    this.f2627e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2627e = super.getResources();
        }
        return this.f2627e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2626c == null) {
            this.f2626c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2626c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2625b;
        if (theme != null) {
            return theme;
        }
        if (this.f2624a == 0) {
            this.f2624a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2625b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2624a != i) {
            this.f2624a = i;
            b();
        }
    }
}
