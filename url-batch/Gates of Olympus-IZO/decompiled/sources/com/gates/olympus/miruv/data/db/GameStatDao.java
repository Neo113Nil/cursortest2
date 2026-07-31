package com.gates.olympus.miruv.data.db;

import P1.d;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public interface GameStatDao {
    Object get(String str, d dVar);

    InterfaceC0700f observeAll();

    Object upsert(GameStatEntity gameStatEntity, d dVar);
}
