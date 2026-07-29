package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f1695a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f1696b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f1697c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f1698d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f1695a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1696b = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    private Resources b() {
        if (this.e == null) {
            if (this.f1698d == null) {
                this.e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.e = createConfigurationContext(this.f1698d).getResources();
            }
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1695a != i) {
            this.f1695a = i;
            c();
        }
    }

    public int a() {
        return this.f1695a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        if (this.f1696b != null) {
            return this.f1696b;
        }
        if (this.f1695a == 0) {
            this.f1695a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.f1696b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1697c == null) {
                this.f1697c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1697c;
        }
        return getBaseContext().getSystemService(str);
    }

    protected void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    private void c() {
        boolean z = this.f1696b == null;
        if (z) {
            this.f1696b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1696b.setTo(theme);
            }
        }
        a(this.f1696b, this.f1695a, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
