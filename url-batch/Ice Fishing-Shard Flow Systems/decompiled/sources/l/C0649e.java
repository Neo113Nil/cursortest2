package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f6204f;

    /* renamed from: a, reason: collision with root package name */
    public int f6205a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f6206b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f6207c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f6208d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f6209e;

    public C0649e(Context context, int i2) {
        super(context);
        this.f6205a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f6209e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f6208d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f6208d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f6206b == null) {
            this.f6206b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f6206b.setTo(theme);
            }
        }
        this.f6206b.applyStyle(this.f6205a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(l.C0649e.f6204f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f6209e == null) {
            Configuration configuration = this.f6208d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f6204f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f6204f = configuration2;
                    }
                }
                this.f6209e = AbstractC0648d.a(this, this.f6208d).getResources();
            }
            this.f6209e = super.getResources();
        }
        return this.f6209e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6207c == null) {
            this.f6207c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f6207c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f6206b;
        if (theme != null) {
            return theme;
        }
        if (this.f6205a == 0) {
            this.f6205a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f6206b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f6205a != i2) {
            this.f6205a = i2;
            b();
        }
    }
}
