package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* loaded from: classes3.dex */
public class Cache {
    Pools.Pool optimizedArrayRowPool = new Pools.SimplePool(256);
    Pools.Pool arrayRowPool = new Pools.SimplePool(256);
    Pools.Pool solverVariablePool = new Pools.SimplePool(256);
    SolverVariable[] mIndexedVariables = new SolverVariable[32];
}
