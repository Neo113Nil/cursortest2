package com.squareup.util.coroutines;

import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public interface UnitSetupTeardown {
    Teardown setup(CoroutineScope coroutineScope);
}
