package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f2674f;

    /* renamed from: a, reason: collision with root package name */
    public int f2675a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2676b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2677c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2678e;

    public C0149c(Context context, int i) {
        super(context);
        this.f2675a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f2678e != null) {
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
        if (this.f2676b == null) {
            this.f2676b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2676b.setTo(theme);
            }
        }
        this.f2676b.applyStyle(this.f2675a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2678e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f2674f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = RecyclerView.A0;
                    f2674f = configuration2;
                }
                if (!configuration.equals(f2674f)) {
                    this.f2678e = createConfigurationContext(this.d).getResources();
                }
            }
            this.f2678e = super.getResources();
        }
        return this.f2678e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2677c == null) {
            this.f2677c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2677c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2676b;
        if (theme != null) {
            return theme;
        }
        if (this.f2675a == 0) {
            this.f2675a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2676b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f2675a != i) {
            this.f2675a = i;
            b();
        }
    }
}
