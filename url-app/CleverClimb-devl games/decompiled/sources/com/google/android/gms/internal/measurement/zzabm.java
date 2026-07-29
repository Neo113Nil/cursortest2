package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzabm {
    private static final int zzbzt = 11;
    private static final int zzbzu = 12;
    private static final int zzbzv = 16;
    private static final int zzbzw = 26;
    public static final int[] zzbzx = new int[0];
    public static final long[] zzbzy = new long[0];
    private static final float[] zzbzz = new float[0];
    private static final double[] zzcaa = new double[0];
    private static final boolean[] zzcab = new boolean[0];
    public static final String[] zzcac = new String[0];
    private static final byte[][] zzcad = new byte[0][];
    public static final byte[] zzcae = new byte[0];

    public static final int zzb(zzaba zzabaVar, int i) throws IOException {
        int position = zzabaVar.getPosition();
        zzabaVar.zzam(i);
        int i2 = 1;
        while (zzabaVar.zzvo() == i) {
            zzabaVar.zzam(i);
            i2++;
        }
        zzabaVar.zzd(position, i);
        return i2;
    }
}
