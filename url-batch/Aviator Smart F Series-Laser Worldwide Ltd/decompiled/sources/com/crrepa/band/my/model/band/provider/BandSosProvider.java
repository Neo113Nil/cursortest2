package com.crrepa.band.my.model.band.provider;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandSosProvider {
    private static final String SOS_STATE = "sos_state";

    private BandSosProvider() {
    }

    public static void delete() {
        g.getInstance().remove(SOS_STATE);
    }

    public static boolean getSosState() {
        return g.getInstance().getBoolean(SOS_STATE, false);
    }

    public static boolean hasSos() {
        return g.getInstance().contains(SOS_STATE);
    }

    public static void saveSosState(boolean z7) {
        g.getInstance().putBoolean(SOS_STATE, z7);
    }
}
