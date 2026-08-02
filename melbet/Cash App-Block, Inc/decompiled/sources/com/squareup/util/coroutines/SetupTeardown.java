package com.squareup.util.coroutines;

import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public interface SetupTeardown {
    Teardown setup(CoroutineScope coroutineScope, Object obj);
}
