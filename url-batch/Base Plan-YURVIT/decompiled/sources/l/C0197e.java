package l;

import B0.C0000a;
import B0.C0008i;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197e {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f2764a;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f2765b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f2766c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f2767d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f2768e;

    /* renamed from: f, reason: collision with root package name */
    public int f2769f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2770g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2771h;

    public C0197e(C0008i c0008i) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f2764a = intent;
        this.f2765b = new C0000a(23);
        this.f2769f = 0;
        this.f2770g = true;
        if (c0008i != null) {
            intent.setPackage(((ComponentName) c0008i.f86h).getPackageName());
            BinderC0193a binderC0193a = (BinderC0193a) c0008i.f85g;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC0193a);
            intent.putExtras(bundle);
        }
    }

    public final void a(int i2, C0008i c0008i) {
        if (i2 < 0 || i2 > 2 || i2 == 0) {
            throw new IllegalArgumentException(L.d.e("Invalid colorScheme: ", i2));
        }
        if (this.f2767d == null) {
            this.f2767d = new SparseArray();
        }
        this.f2767d.put(i2, c0008i.J());
    }

    public final void b(int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
        }
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
        }
        Intent intent = this.f2764a;
        intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i2);
        intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i3);
    }
}
