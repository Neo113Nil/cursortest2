package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f9796a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9797b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f9798c;

    public SimpleThreadSafeToggle(boolean z, String str) {
        this.f9796a = str;
        this.f9797b = z;
        this.f9798c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f9797b;
    }

    public final String getTag() {
        return this.f9796a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z) {
        this.f9798c.add(toggleObserver);
        if (z) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f9798c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z) {
        if (z != getActualState()) {
            this.f9797b = z;
            ArrayList arrayList = this.f9798c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((ToggleObserver) obj).onStateChanged(z);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i4, e eVar) {
        this((i4 & 1) != 0 ? false : z, str);
    }
}
