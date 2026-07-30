package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import java.nio.ByteBuffer;
import java.util.Random;

/* loaded from: classes2.dex */
public class BandBondProvider {
    private static final String BAND_BOND_CODE = "band_bond_code";

    private BandBondProvider() {
    }

    private static int createBondCode() {
        return Math.abs(new Random().nextInt(1000000));
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.BAND_BOND_TIME);
        g.getInstance().remove(BAND_BOND_CODE);
    }

    public static byte[] getBondBytes(long j8) {
        byte[] bArr = new byte[6];
        System.arraycopy(ByteBuffer.allocate(8).putLong(j8).array(), 2, bArr, 0, 6);
        return bArr;
    }

    public static int getBondCode() {
        return g.getInstance().getInt(BAND_BOND_CODE, createBondCode());
    }

    public static long getBondTime() {
        return g.getInstance().getLong(BaseParamNames.BAND_BOND_TIME, System.currentTimeMillis());
    }

    public static boolean hasBondCode() {
        return g.getInstance().contains(BAND_BOND_CODE);
    }

    public static void saveBondCode(int i8) {
        g.getInstance().putInt(BAND_BOND_CODE, i8);
    }

    public static void saveBondTime(long j8) {
        g.getInstance().putLong(BaseParamNames.BAND_BOND_TIME, j8);
    }
}
