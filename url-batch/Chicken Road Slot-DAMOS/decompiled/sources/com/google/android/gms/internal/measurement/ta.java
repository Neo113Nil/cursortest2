package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class ta implements a8.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2822d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2823e;

    public ta(Context context) {
        this.f2822d = 3;
        new ConcurrentHashMap();
        oa.e(context != null, "Context cannot be null", new Object[0]);
        this.f2823e = context.getApplicationContext();
    }

    @Override // a8.m
    public Object get() {
        int i3 = this.f2822d;
        Context context = this.f2823e;
        switch (i3) {
            case 0:
                Object obj = sa.j;
                final ra raVar = new ra();
                raVar.f2737a = context;
                context.getClass();
                if (((a8.m) raVar.f2738b) == null) {
                    raVar.f2738b = sa.f2785m;
                }
                final int i10 = 1;
                if (((a8.m) raVar.f2739c) == null) {
                    raVar.f2739c = z4.w.D(new ta((Context) raVar.f2737a, i10));
                }
                if (((qa) raVar.f2741e) == null) {
                    raVar.f2741e = new a8.m() { // from class: com.google.android.gms.internal.measurement.qa
                        @Override // a8.m
                        public final Object get() {
                            int i11 = i10;
                            ra raVar2 = raVar;
                            switch (i11) {
                                case 0:
                                    Context context2 = (Context) raVar2.f2737a;
                                    Object obj2 = sa.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new a8.i(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return a8.a.f339d;
                                    }
                                default:
                                    return new a8.i(new hd((a8.m) raVar2.f2738b));
                            }
                        }
                    };
                }
                final int i11 = 0;
                if (((a8.m) raVar.f2740d) == null) {
                    Context context2 = (Context) raVar.f2737a;
                    ArrayList arrayList = new ArrayList();
                    be beVar = new be(new ta(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, beVar, new ee());
                    raVar.f2740d = z4.w.D(new v5(11, arrayList));
                }
                if (((qa) raVar.f2742f) == null) {
                    raVar.f2742f = new a8.m() { // from class: com.google.android.gms.internal.measurement.qa
                        @Override // a8.m
                        public final Object get() {
                            int i112 = i11;
                            ra raVar2 = raVar;
                            switch (i112) {
                                case 0:
                                    Context context22 = (Context) raVar2.f2737a;
                                    Object obj2 = sa.j;
                                    try {
                                        ApplicationInfo applicationInfo = context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new a8.i(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return a8.a.f339d;
                                    }
                                default:
                                    return new a8.i(new hd((a8.m) raVar2.f2738b));
                            }
                        }
                    };
                }
                return new sa((Context) raVar.f2737a, (a8.m) raVar.f2738b, (a8.m) raVar.f2739c, (qa) raVar.f2741e, (a8.m) raVar.f2740d, (qa) raVar.f2742f);
            case 1:
                Object obj2 = sa.j;
                return new jb(new da(context, g1.f2311a, a7.b.f312a, a7.i.f325c));
            default:
                Object obj3 = wa.f2945a;
                return oa.b(context);
        }
    }

    public /* synthetic */ ta(Context context, int i3) {
        this.f2822d = i3;
        this.f2823e = context;
    }
}
