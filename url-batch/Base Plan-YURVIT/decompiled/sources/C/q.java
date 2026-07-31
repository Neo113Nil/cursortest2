package C;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f180a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f181b;

    /* renamed from: c, reason: collision with root package name */
    public Class f182c;

    /* renamed from: d, reason: collision with root package name */
    public Method f183d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f184e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f185f = false;

    public q(ActionMode.Callback callback, TextView textView) {
        this.f180a = callback;
        this.f181b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f180a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f180a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f180a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextView textView = this.f181b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = this.f185f;
        Class cls = Integer.TYPE;
        if (!z2) {
            this.f185f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f182c = cls2;
                this.f183d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f184e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f182c = null;
                this.f183d = null;
                this.f184e = false;
            }
        }
        try {
            Method declaredMethod = (this.f184e && this.f182c.isInstance(menu)) ? this.f183d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f180a.onPrepareActionMode(actionMode, menu);
    }
}
