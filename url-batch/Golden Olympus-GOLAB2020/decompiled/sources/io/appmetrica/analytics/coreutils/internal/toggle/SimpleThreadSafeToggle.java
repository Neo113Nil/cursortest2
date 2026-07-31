package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f37081a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37082b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f37083c;

    public SimpleThreadSafeToggle(boolean z4, @NotNull String str) {
        this.f37081a = str;
        this.f37082b = z4;
        this.f37083c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f37082b;
    }

    @NotNull
    protected final String getTag() {
        return this.f37081a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z4) {
        this.f37083c.add(toggleObserver);
        if (z4) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(@NotNull ToggleObserver toggleObserver) {
        this.f37083c.remove(toggleObserver);
    }

    protected final synchronized void updateState(boolean z4) {
        if (z4 != getActualState()) {
            this.f37082b = z4;
            ArrayList arrayList = this.f37083c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((ToggleObserver) obj).onStateChanged(z4);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z4, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4, str);
    }
}
