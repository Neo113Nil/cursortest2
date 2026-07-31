package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f7107a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7108b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7109c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7110d = 0;

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f7107a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static xe b(rm rmVar, String str, String str2, yg ygVar) {
        int i7 = f7108b[(rmVar.g() & 192) >> 6];
        int g7 = rmVar.g();
        int i8 = f7109c[(g7 & 56) >> 3];
        if ((g7 & 4) != 0) {
            i8++;
        }
        return xe.k(str, "audio/ac3", null, -1, -1, i8, i7, null, ygVar, 0, str2);
    }

    public static xe c(rm rmVar, String str, String str2, yg ygVar) {
        rmVar.w(2);
        int i7 = f7108b[(rmVar.g() & 192) >> 6];
        int g7 = rmVar.g();
        int i8 = f7109c[(g7 & 14) >> 1];
        if ((g7 & 1) != 0) {
            i8++;
        }
        return xe.k(str, "audio/eac3", null, -1, -1, i8, i7, null, ygVar, 0, str2);
    }
}
