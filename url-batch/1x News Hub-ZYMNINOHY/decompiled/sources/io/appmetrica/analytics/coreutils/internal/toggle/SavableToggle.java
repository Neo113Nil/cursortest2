package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.coreapi.internal.data.Updatable;

/* loaded from: classes.dex */
public final class SavableToggle extends SimpleThreadSafeToggle implements Updatable<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    private final Savable f5541d;

    public SavableToggle(String str, Savable<Boolean> savable) {
        super(savable.getValue().booleanValue(), "[SavableToggle - " + str + ']');
        this.f5541d = savable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Updatable
    public /* bridge */ /* synthetic */ void update(Boolean bool) {
        update(bool.booleanValue());
    }

    public void update(boolean z) {
        updateState(z);
        this.f5541d.setValue(Boolean.valueOf(getActualState()));
    }
}
