package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2029f;

    /* renamed from: a, reason: collision with root package name */
    public int f2030a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2031b;
    public LayoutInflater c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f2032d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2033e;

    public c(Context context, int i4) {
        super(context);
        this.f2030a = i4;
    }

    public final void a(Configuration configuration) {
        if (this.f2033e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2032d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2032d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2031b == null) {
            this.f2031b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2031b.setTo(theme);
            }
        }
        this.f2031b.applyStyle(this.f2030a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2033e == null) {
            Configuration configuration = this.f2032d;
            if (configuration != null) {
                if (f2029f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2029f = configuration2;
                }
                if (!configuration.equals(f2029f)) {
                    this.f2033e = createConfigurationContext(this.f2032d).getResources();
                }
            }
            this.f2033e = super.getResources();
        }
        return this.f2033e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2031b;
        if (theme != null) {
            return theme;
        }
        if (this.f2030a == 0) {
            this.f2030a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2031b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f2030a != i4) {
            this.f2030a = i4;
            b();
        }
    }
}
