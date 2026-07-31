package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f3485a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f3486b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f3487c;

    /* renamed from: d, reason: collision with root package name */
    public Resources f3488d;

    public final void a() {
        if (this.f3486b == null) {
            this.f3486b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3486b.setTo(theme);
            }
        }
        this.f3486b.applyStyle(this.f3485a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f3488d == null) {
            this.f3488d = super.getResources();
        }
        return this.f3488d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3487c == null) {
            this.f3487c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3487c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3486b;
        if (theme != null) {
            return theme;
        }
        if (this.f3485a == 0) {
            this.f3485a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f3486b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3485a != i) {
            this.f3485a = i;
            a();
        }
    }
}
