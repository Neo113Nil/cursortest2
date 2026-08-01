package t3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f9274a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9275b;

    /* renamed from: c, reason: collision with root package name */
    public Class f9276c;

    /* renamed from: d, reason: collision with root package name */
    public Method f9277d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9278e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9279f = false;

    public h(ActionMode.Callback callback, TextView textView) {
        this.f9274a = callback;
        this.f9275b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f9274a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f9274a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f9274a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextView textView = this.f9275b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z10 = this.f9279f;
        Class cls = Integer.TYPE;
        if (!z10) {
            this.f9279f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f9276c = cls2;
                this.f9277d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f9278e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f9276c = null;
                this.f9277d = null;
                this.f9278e = false;
            }
        }
        try {
            Method declaredMethod = (this.f9278e && this.f9276c.isInstance(menu)) ? this.f9277d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
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
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i3);
                MenuItem add = menu.add(0, 0, i3 + 100, resolveInfo2.loadLabel(packageManager));
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f9274a.onPrepareActionMode(actionMode, menu);
    }
}
