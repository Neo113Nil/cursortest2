package com.realsil.sdk.dfu.f;

import android.content.Context;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class b extends BufferedInputStream {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f15745f = RtkCore.DEBUG;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15746g = RtkCore.VDBG;

    /* renamed from: a, reason: collision with root package name */
    public int f15747a;

    /* renamed from: b, reason: collision with root package name */
    public int f15748b;

    /* renamed from: c, reason: collision with root package name */
    public int f15749c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f15750d;

    /* renamed from: e, reason: collision with root package name */
    public String f15751e;

    public b(String str, InputStream inputStream) {
        super(inputStream);
        if (available() < 12) {
            throw new IOException("The input file size is less to 12, please check!");
        }
        this.f15751e = str;
    }

    public static com.realsil.sdk.dfu.image.pack.a b(LoadParams loadParams) {
        com.realsil.sdk.dfu.image.pack.a a8;
        String c8 = loadParams.c();
        b a9 = a(loadParams);
        if (a9 == null) {
            a8 = com.realsil.sdk.dfu.image.pack.a.a(loadParams);
            if (a8 == null) {
                if (loadParams.z()) {
                    return a8;
                }
                ZLogger.w("not support single file.");
                throw new LoadFileException("not support single file.", 4108);
            }
            if (!a8.h()) {
                ZLogger.w("pack for MP can not be OTA");
                throw new LoadFileException("not support pack file.", 4116);
            }
            if (a8.f() && !loadParams.r()) {
                ZLogger.w("not support compress pack file.");
                throw new LoadFileException("not support compress pack file.", LoadFileException.ERROR_COMPRESS_PACK_NOT_SUPPORTED);
            }
            if (loadParams.v()) {
                if (!a8.g()) {
                    ZLogger.w("not support common pack file.");
                    throw new LoadFileException("not support common bank pack file.", 4107);
                }
            } else {
                if (a8.g()) {
                    ZLogger.w("not support merge bank pack file.");
                    throw new LoadFileException("not support merge bank pack file.", LoadFileException.ERROR_MERGE_BANK_PACK_NOT_SUPPORTED);
                }
                if (!loadParams.x()) {
                    ZLogger.w("not support common pack file.");
                    throw new LoadFileException("not support common bank pack file.", 4107);
                }
            }
        } else {
            if (!loadParams.p()) {
                ZLogger.w("not support combine pack file.");
                throw new LoadFileException("not support combine pack file.", 4103);
            }
            int h8 = loadParams.h();
            ZLogger.v(f15746g, a9.toString());
            a a10 = a9.a(h8);
            if (a10 == null) {
                ZLogger.w("no bud item exist, preferredBudRole=" + h8);
                throw new LoadFileException("no combine bud item exist.", 4105);
            }
            ZLogger.v(f15746g, a10.toString());
            if (loadParams.b() == 0) {
                a8 = com.realsil.sdk.dfu.image.pack.a.a(new SubFileInfo.d(0, c8, null), a10.b(), a10.d());
            } else {
                Context a11 = loadParams.a();
                a8 = com.realsil.sdk.dfu.image.pack.a.a(new SubFileInfo.d(1, c8, a11), a10.a(a11), a10.d());
            }
            if (a8 == null) {
                ZLogger.w("sub combined file must be a pack file, preferredBudRole=" + h8);
                throw new LoadFileException("sub combined file must be a pack file.", 4106);
            }
            if (!a8.h()) {
                ZLogger.w("pack for MP can not be OTA");
                throw new LoadFileException("not support pack file.", 4116);
            }
            if (a8.f() && !loadParams.r()) {
                ZLogger.w("not support compress pack file.");
                throw new LoadFileException("not support compress pack file.", LoadFileException.ERROR_COMPRESS_PACK_NOT_SUPPORTED);
            }
        }
        ZLogger.v(f15746g, a8.toString());
        return a8;
    }

    public a a(int i8) {
        ArrayList arrayList = this.f15750d;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = this.f15750d;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                a aVar = (a) obj;
                if (aVar.a() == i8) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Multi-pack{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n\tsignature=");
        int i8 = 0;
        sb2.append(String.format("0x%04X", Integer.valueOf(this.f15747a)));
        sb2.append(", version=");
        sb2.append(String.format(Locale.US, "0x%08x(%d)", Integer.valueOf(this.f15748b), Integer.valueOf(this.f15748b)));
        sb2.append(", num=");
        sb2.append(String.format("0x%04x", Integer.valueOf(this.f15749c)));
        sb.append(sb2.toString());
        ArrayList arrayList = this.f15750d;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = this.f15750d;
            int size = arrayList2.size();
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                sb.append("\n\t\t" + ((a) obj).toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static b a(LoadParams loadParams) {
        InputStream inputStream;
        b bVar = null;
        if (loadParams == null) {
            return null;
        }
        if (loadParams.b() == 1) {
            Context a8 = loadParams.a();
            if (a8 == null) {
                ZLogger.d("please set the context first.");
                return null;
            }
            try {
                inputStream = a8.getAssets().open(loadParams.c());
            } catch (IOException e8) {
                ZLogger.w(e8.toString());
                return null;
            }
        } else {
            try {
                inputStream = new BufferedInputStream(new FileInputStream(loadParams.c()));
            } catch (FileNotFoundException e9) {
                ZLogger.w(e9.toString());
                inputStream = null;
            }
        }
        if (inputStream == null) {
            return null;
        }
        try {
            b bVar2 = new b(loadParams.c(), inputStream);
            if (bVar2.a()) {
                bVar = bVar2;
            } else {
                bVar2.close();
            }
            try {
                inputStream.close();
            } catch (IOException e10) {
                ZLogger.w(e10.toString());
            }
            return bVar;
        } catch (IOException e11) {
            ZLogger.v(e11.toString());
            return null;
        }
    }

    public final boolean a() {
        byte[] bArr = new byte[12];
        read(bArr, 0, 12);
        int i8 = ByteArrayConverter.toInt(bArr, 0, 0);
        this.f15747a = i8;
        if (i8 != -1768442424) {
            ZLogger.v(f15746g, String.format("invalid multi-pack signature(0x%08X) ", Integer.valueOf(i8)));
            return false;
        }
        this.f15748b = ByteArrayConverter.toInt(bArr, 4, 0);
        this.f15749c = ByteArrayConverter.toInt(bArr, 8, 0);
        this.f15750d = new ArrayList();
        int i9 = (this.f15749c * 8) + 12;
        byte[] bArr2 = new byte[8];
        for (int i10 = 0; i10 < this.f15749c; i10++) {
            read(bArr2, 0, 8);
            a a8 = a.a(this.f15751e, i9, bArr2);
            this.f15750d.add(a8);
            i9 += a8.c();
        }
        return true;
    }
}
