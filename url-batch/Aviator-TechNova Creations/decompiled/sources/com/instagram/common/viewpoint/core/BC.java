package com.instagram.common.viewpoint.core;

import java.io.Closeable;

/* loaded from: assets/audience_network.dex */
public interface BC extends Closeable {
    int getPosition();

    boolean moveToPosition(int i);
}
