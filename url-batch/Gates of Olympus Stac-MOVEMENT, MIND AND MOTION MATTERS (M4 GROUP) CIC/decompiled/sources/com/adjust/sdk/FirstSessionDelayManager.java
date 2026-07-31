package com.adjust.sdk;

import java.util.ArrayList;

/* loaded from: classes.dex */
class FirstSessionDelayManager {
    public final ActivityHandler a;
    public final ArrayList b = new ArrayList();
    public int c = 0;

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.c != 3) {
            runnable.run();
        } else {
            this.a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
            this.b.add(runnable);
        }
    }

    public final void a(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.c == 3) {
            this.a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
            this.a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        } else {
            iRunActivityHandler.run(this.a);
        }
    }
}
