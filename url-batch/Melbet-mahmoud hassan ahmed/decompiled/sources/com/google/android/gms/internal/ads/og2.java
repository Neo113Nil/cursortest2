package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class og2 implements ij2<pg2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f9662a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f9663b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9664c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f9665d;

    public og2(dc3 dc3Var, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f9662a = dc3Var;
        this.f9665d = set;
        this.f9663b = viewGroup;
        this.f9664c = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<pg2> a() {
        return this.f9662a.E(new Callable() { // from class: com.google.android.gms.internal.ads.ng2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return og2.this.b();
            }
        });
    }

    final /* synthetic */ pg2 b() {
        if (((Boolean) sw.c().b(m10.f8277p4)).booleanValue() && this.f9663b != null && this.f9665d.contains("banner")) {
            return new pg2(Boolean.valueOf(this.f9663b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) sw.c().b(m10.f8285q4)).booleanValue() && this.f9665d.contains("native")) {
            Context context = this.f9664c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new pg2(bool);
            }
        }
        return new pg2(null);
    }
}
