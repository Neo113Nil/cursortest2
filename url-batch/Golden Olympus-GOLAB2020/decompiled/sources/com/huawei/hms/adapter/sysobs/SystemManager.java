package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class SystemManager {

    /* renamed from: a, reason: collision with root package name */
    private static SystemManager f13857a = new SystemManager();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f13858b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static SystemNotifier f13859c = new a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f13857a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f13859c;
    }

    public void notifyNoticeResult(int i4) {
        f13859c.notifyNoticeObservers(i4);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f13859c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i4) {
        f13859c.notifyObservers(i4);
    }

    class a implements SystemNotifier {

        /* renamed from: a, reason: collision with root package name */
        private final List<SystemObserver> f13860a = new ArrayList();

        a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i4) {
            synchronized (SystemManager.f13858b) {
                try {
                    Iterator<SystemObserver> it = this.f13860a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i4)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f13858b) {
                try {
                    Iterator<SystemObserver> it = this.f13860a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f13860a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f13858b) {
                this.f13860a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f13858b) {
                this.f13860a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i4) {
            synchronized (SystemManager.f13858b) {
                try {
                    Iterator<SystemObserver> it = this.f13860a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i4)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
