package com.squareup.cash.treehouse.android;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class ProductionTreehouseModule$provideLocalDevelopmentHost$1 implements KeyValue {
    @Override // com.squareup.preferences.KeyValue
    public final /* bridge */ /* synthetic */ Object blockingGet() {
        return "10.0.2.2";
    }

    @Override // com.squareup.preferences.KeyValue
    public final void blockingSet(Object obj) {
        ((String) obj).getClass();
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object delete(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.squareup.preferences.KeyValue
    public final Flow observe() {
        return new AppLockMonitor$special$$inlined$map$2("10.0.2.2", 19);
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object set(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
