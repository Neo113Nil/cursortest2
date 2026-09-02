package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f1833f;

    /* renamed from: a, reason: collision with root package name */
    public int f1834a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f1835b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f1836c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f1837e;

    public c(Context context, int i) {
        super(context);
        this.f1834a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f1837e != null) {
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
        if (this.f1835b == null) {
            this.f1835b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1835b.setTo(theme);
            }
        }
        this.f1835b.applyStyle(this.f1834a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(j.c.f1833f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f1837e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f1833f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f1833f = configuration2;
                    }
                }
                this.f1837e = createConfigurationContext(this.d).getResources();
            }
            this.f1837e = super.getResources();
        }
        return this.f1837e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1836c == null) {
            this.f1836c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1836c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1835b;
        if (theme != null) {
            return theme;
        }
        if (this.f1834a == 0) {
            this.f1834a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1835b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f1834a != i) {
            this.f1834a = i;
            b();
        }
    }
}
