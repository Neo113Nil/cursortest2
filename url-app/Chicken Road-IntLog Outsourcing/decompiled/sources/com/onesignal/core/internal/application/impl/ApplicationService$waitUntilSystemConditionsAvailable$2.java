package com.onesignal.core.internal.application.impl;

import R.e;
import R.f;
import R.l;
import R.m;
import com.onesignal.common.threading.Waiter;
import h2.C0482c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ApplicationService$waitUntilSystemConditionsAvailable$2 extends l {
    final /* synthetic */ m $manager;
    final /* synthetic */ Waiter $waiter;

    public ApplicationService$waitUntilSystemConditionsAvailable$2(m mVar, Waiter waiter) {
        this.$manager = mVar;
        this.$waiter = waiter;
    }

    public void onFragmentDetached(m fm, f fragmentDetached) {
        i.e(fm, "fm");
        i.e(fragmentDetached, "fragmentDetached");
        if (fragmentDetached instanceof e) {
            C0482c c0482c = this.$manager.f2603g;
            c0482c.getClass();
            synchronized (((CopyOnWriteArrayList) c0482c.f5783b)) {
                if (((CopyOnWriteArrayList) c0482c.f5783b).size() > 0) {
                    throw null;
                }
            }
            this.$waiter.wake();
        }
    }
}
