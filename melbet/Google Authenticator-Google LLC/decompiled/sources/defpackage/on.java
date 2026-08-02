package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class on extends ContextWrapper {
    private static Configuration b;
    public int a;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public on(Context context, int i) {
        super(context);
        this.a = i;
    }

    private final Resources b() {
        Resources resources = this.f;
        if (resources != null) {
            return resources;
        }
        Configuration configuration = this.e;
        if (configuration != null) {
            Configuration configuration2 = b;
            if (configuration2 == null) {
                configuration2 = new Configuration();
                configuration2.fontScale = 0.0f;
                b = configuration2;
            }
            if (!configuration.equals(configuration2)) {
                Resources resources2 = createConfigurationContext(this.e).getResources();
                this.f = resources2;
                return resources2;
            }
        }
        Resources resources3 = super.getResources();
        this.f = resources3;
        return resources3;
    }

    private final void c() {
        if (this.c == null) {
            this.c = b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.e != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.e = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.d;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.d = cloneInContext;
        return cloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public on() {
        super(null);
    }

    public on(Context context, Resources.Theme theme) {
        super(context);
        this.c = theme;
    }
}
