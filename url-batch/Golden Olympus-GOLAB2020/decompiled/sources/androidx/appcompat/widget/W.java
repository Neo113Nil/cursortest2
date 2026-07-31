package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class W extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f10849c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f10850d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f10851a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f10852b;

    private W(Context context) {
        super(context);
        if (!j0.c()) {
            this.f10851a = new Y(this, context.getResources());
            this.f10852b = null;
            return;
        }
        j0 j0Var = new j0(this, context.getResources());
        this.f10851a = j0Var;
        Resources.Theme newTheme = j0Var.newTheme();
        this.f10852b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof W) || (context.getResources() instanceof Y) || (context.getResources() instanceof j0) || !j0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f10849c) {
            try {
                ArrayList arrayList = f10850d;
                if (arrayList == null) {
                    f10850d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f10850d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f10850d.remove(size);
                        }
                    }
                    for (int size2 = f10850d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f10850d.get(size2);
                        W w4 = weakReference2 != null ? (W) weakReference2.get() : null;
                        if (w4 != null && w4.getBaseContext() == context) {
                            return w4;
                        }
                    }
                }
                W w5 = new W(context);
                f10850d.add(new WeakReference(w5));
                return w5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f10851a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f10851a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10852b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f10852b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
