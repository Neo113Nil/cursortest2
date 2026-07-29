package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.luckyreads.bookshelf.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2525f;

    /* renamed from: a, reason: collision with root package name */
    public int f2526a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2527b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2528c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2529e;

    public C0139c(Context context, int i) {
        super(context);
        this.f2526a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2529e != null) {
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
        if (this.f2527b == null) {
            this.f2527b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2527b.setTo(theme);
            }
        }
        this.f2527b.applyStyle(this.f2526a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2529e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2525f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f2525f = configuration2;
                }
                if (!configuration.equals(f2525f)) {
                    this.f2529e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2529e = super.getResources();
        }
        return this.f2529e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2528c == null) {
            this.f2528c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2528c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2527b;
        if (theme != null) {
            return theme;
        }
        if (this.f2526a == 0) {
            this.f2526a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2527b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2526a != i) {
            this.f2526a = i;
            b();
        }
    }
}
