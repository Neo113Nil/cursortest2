package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cu implements ct {
    private final Activity a;

    public cu(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.ct
    public final Context a() {
        Activity activity = this.a;
        ActionBar actionBar = activity.getActionBar();
        return actionBar != null ? actionBar.getThemedContext() : activity;
    }

    @Override // defpackage.ct
    public final void b(int i) {
        ActionBar actionBar = this.a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // defpackage.ct
    public final void c() {
        TypedArray obtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
}
