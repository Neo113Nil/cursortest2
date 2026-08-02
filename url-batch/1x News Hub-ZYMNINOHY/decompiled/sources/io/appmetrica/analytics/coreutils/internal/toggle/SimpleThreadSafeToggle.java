package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f5542a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5543b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f5544c;

    public SimpleThreadSafeToggle(boolean z, String str) {
        this.f5542a = str;
        this.f5543b = z;
        this.f5544c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f5543b;
    }

    public final String getTag() {
        return this.f5542a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z) {
        this.f5544c.add(toggleObserver);
        if (z) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f5544c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z) {
        if (z != getActualState()) {
            this.f5543b = z;
            Iterator it = this.f5544c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i3, f fVar) {
        this((i3 & 1) != 0 ? false : z, str);
    }
}
