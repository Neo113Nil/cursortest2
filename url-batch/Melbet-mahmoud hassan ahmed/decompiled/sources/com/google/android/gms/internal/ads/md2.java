package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class md2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8499a;

    /* renamed from: b, reason: collision with root package name */
    public final pv f8500b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Parcelable> f8501c;

    public md2(Context context, pv pvVar, List<Parcelable> list) {
        this.f8499a = context;
        this.f8500b = pvVar;
        this.f8501c = list;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle2 = bundle;
        if (f30.f4958a.e().booleanValue()) {
            Bundle bundle3 = new Bundle();
            y2.t.q();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f8499a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    str = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString("activity", str);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f8500b.f10380j);
            bundle4.putInt("height", this.f8500b.f10377g);
            bundle3.putBundle("size", bundle4);
            if (this.f8501c.size() > 0) {
                List<Parcelable> list = this.f8501c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
