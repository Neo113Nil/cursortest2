package c4;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* loaded from: classes.dex */
public final class j0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f1995a;

    public j0(Application application) {
        super(application);
    }

    public final void a(Activity activity) {
        this.f1995a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f1995a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f1995a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
