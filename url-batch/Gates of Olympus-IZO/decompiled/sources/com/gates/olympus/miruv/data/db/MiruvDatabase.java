package com.gates.olympus.miruv.data.db;

import androidx.room.s;

/* loaded from: classes.dex */
public abstract class MiruvDatabase extends s {
    public static final int $stable = 0;

    public abstract GameStatDao gameStatDao();

    public abstract SavedJointDao savedJointDao();
}
