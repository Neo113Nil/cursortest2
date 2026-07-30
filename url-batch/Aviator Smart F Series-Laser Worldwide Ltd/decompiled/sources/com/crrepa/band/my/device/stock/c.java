package com.crrepa.band.my.device.stock;

/* loaded from: classes2.dex */
public class c {
    public static final String SUPPORT_STOCK_COUNT = "support_stock_count";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(SUPPORT_STOCK_COUNT);
    }

    public static int getSupportStockCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(SUPPORT_STOCK_COUNT, 0);
    }

    public static boolean isSupportStock() {
        return getSupportStockCount() > 0;
    }

    public static void save(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(SUPPORT_STOCK_COUNT, i8);
    }
}
