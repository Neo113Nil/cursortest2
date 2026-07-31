package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1668o1 {

    /* renamed from: a, reason: collision with root package name */
    private final List f21471a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21472b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final PluginEventTracker f21473c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f21474d;

    private C1668o1(PluginEventTracker pluginEventTracker, Application application) {
        this.f21473c = pluginEventTracker;
        this.f21474d = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            AbstractC1708y2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f21473c, this.f21474d);
                this.f21471a.add(myTrackerPlugin);
                AbstractC1708y2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th) {
                AbstractC1708y2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th);
            }
        }
    }

    public void a(final List list) {
        if (this.f21472b.compareAndSet(false, true)) {
            AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.r3
                @Override // java.lang.Runnable
                public final void run() {
                    C1668o1.this.b(list);
                }
            });
        } else {
            AbstractC1708y2.a("PluginHandler: instance has already been initialized");
        }
    }

    public static C1668o1 a(C1631f0 c1631f0, Application application) {
        return new C1668o1(PluginEventTracker.newTracker(c1631f0), application);
    }
}
