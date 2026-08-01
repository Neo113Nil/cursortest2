package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2577f;

    /* renamed from: a, reason: collision with root package name */
    public int f2578a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2579b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2580c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2581e;

    public C0146c(Context context, int i) {
        super(context);
        this.f2578a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2581e != null) {
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
        if (this.f2579b == null) {
            this.f2579b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2579b.setTo(theme);
            }
        }
        this.f2579b.applyStyle(this.f2578a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2581e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2577f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = RecyclerView.f1559A0;
                    f2577f = configuration2;
                }
                if (!configuration.equals(f2577f)) {
                    this.f2581e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2581e = super.getResources();
        }
        return this.f2581e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2580c == null) {
            this.f2580c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2580c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2579b;
        if (theme != null) {
            return theme;
        }
        if (this.f2578a == 0) {
            this.f2578a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2579b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2578a != i) {
            this.f2578a = i;
            b();
        }
    }
}
