package com.realsil.sdk.dfu.image.pack;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a extends BufferedInputStream {

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f15877l = RtkDfu.VDBG;

    /* renamed from: a, reason: collision with root package name */
    public int f15878a;

    /* renamed from: b, reason: collision with root package name */
    public int f15879b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f15880c;

    /* renamed from: d, reason: collision with root package name */
    public b f15881d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f15882e;

    /* renamed from: f, reason: collision with root package name */
    public int f15883f;

    /* renamed from: g, reason: collision with root package name */
    public int f15884g;

    /* renamed from: h, reason: collision with root package name */
    public int f15885h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f15886i;

    /* renamed from: j, reason: collision with root package name */
    public String f15887j;

    /* renamed from: k, reason: collision with root package name */
    public long f15888k;

    /* renamed from: com.realsil.sdk.dfu.image.pack.a$a, reason: collision with other inner class name */
    public class C0327a implements Comparator {
        public C0327a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SubFileInfo subFileInfo, SubFileInfo subFileInfo2) {
            return subFileInfo.getSortNumber() - subFileInfo2.getSortNumber();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f15890a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15891b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15892c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15893d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15894e;

        /* renamed from: f, reason: collision with root package name */
        public int f15895f;

        public b() {
            this.f15890a = 1;
            this.f15891b = false;
            this.f15892c = false;
            this.f15893d = true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("packVersion=0x%02X, dualBank=%b", Integer.valueOf(this.f15890a), Boolean.valueOf(this.f15894e)) + String.format(", icType=0x%02X, compressed=%b,useLongAddrSize=%b", Integer.valueOf(this.f15895f), Boolean.valueOf(this.f15892c), Boolean.valueOf(this.f15891b)));
            return sb.toString();
        }

        public b(int i8) {
            this.f15891b = false;
            this.f15892c = false;
            this.f15893d = true;
            int i9 = i8 & 15;
            this.f15890a = i9;
            if (i9 == 5) {
                this.f15891b = ((byte) ((i8 >> 4) & 1)) == 1;
            }
            if (i9 == 4) {
                this.f15892c = ((byte) ((i8 >> 5) & 1)) == 1;
            }
            if (i9 > 1 && i9 != 2) {
                this.f15893d = ((byte) ((i8 >> 6) & 1)) == 1;
            } else {
                this.f15893d = true;
            }
            this.f15894e = ((byte) ((i8 >> 7) & 1)) == 1;
            this.f15895f = (i8 >> 8) & 255;
        }
    }

    public a(SubFileInfo.d dVar, long j8, InputStream inputStream) {
        super(inputStream);
        this.f15883f = 4;
        this.f15884g = 16;
        if (available() < 44) {
            throw new IOException("The input file size is less to 44, please check!");
        }
        this.f15886i = new ArrayList();
        this.f15887j = dVar.f15875b;
        this.f15888k = j8;
        this.f15881d = new b();
        i();
        a(dVar);
        close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(LoadParams loadParams) {
        SubFileInfo.d dVar;
        InputStream bufferedInputStream;
        if (loadParams.b() == 1) {
            dVar = new SubFileInfo.d(1, loadParams.c(), loadParams.a());
            try {
                bufferedInputStream = loadParams.a().getAssets().open(loadParams.c());
            } catch (IOException e8) {
                ZLogger.w(e8.toString());
                bufferedInputStream = null;
                if (bufferedInputStream == null) {
                }
            }
        } else {
            dVar = new SubFileInfo.d(0, loadParams.c(), null);
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(loadParams.c()));
            } catch (IOException e9) {
                if (f15877l) {
                    ZLogger.v(e9.toString());
                }
                bufferedInputStream = null;
                if (bufferedInputStream == null) {
                }
            }
        }
        if (bufferedInputStream == null) {
            return null;
        }
        a a8 = a(dVar, bufferedInputStream, 0L);
        try {
            bufferedInputStream.close();
        } catch (IOException e10) {
            ZLogger.w(e10.toString());
        }
        return a8;
    }

    public int b() {
        return this.f15883f * 4;
    }

    public int c() {
        return this.f15881d.f15895f;
    }

    public SubFileInfo d() {
        return (this.f15881d.f15895f == 14 || this.f15881d.f15895f == 15) ? b(2048) : c(2);
    }

    public ArrayList e() {
        return this.f15886i;
    }

    public boolean f() {
        return this.f15881d.f15892c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r3.isMergeBankBin != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g() {
        char c8;
        boolean z7;
        List a8 = a(0);
        List a9 = a(1);
        char c9 = 2;
        if (a8.size() == 1) {
            SubFileInfo subFileInfo = (SubFileInfo) a8.get(0);
            if (subFileInfo.getBinIndicator().subBinId == 2048 && subFileInfo.isMergeBankBin) {
                c8 = 2;
            }
            c8 = 0;
        } else {
            if (a8.isEmpty()) {
                c8 = 1;
            }
            c8 = 0;
        }
        if (a9.size() == 1) {
            SubFileInfo subFileInfo2 = (SubFileInfo) a9.get(0);
            if (subFileInfo2.getBinIndicator().subBinId == 2048) {
            }
        } else if (a9.isEmpty()) {
            c9 = c8;
            z7 = true;
            if (c9 == 0 && z7) {
                return (c9 == 1 && z7) ? false : true;
            }
            return false;
        }
        c9 = c8;
        z7 = false;
        if (c9 == 0) {
        }
        return false;
    }

    public boolean h() {
        return this.f15881d.f15893d;
    }

    public final void i() {
        int i8 = 40;
        byte[] bArr = new byte[40];
        read(bArr, 0, 40);
        if (f15877l) {
            ZLogger.v(String.format(Locale.US, "PackHeader:(%d)%s", 40, DataConverter.bytes2Hex(bArr)));
        }
        int i9 = (((bArr[1] << 8) & 65280) | (bArr[0] & 255)) & 65535;
        this.f15878a = i9;
        if (i9 != 19783) {
            throw new IOException(String.format("not a pack file(0x%04X)", Integer.valueOf(this.f15878a)));
        }
        this.f15879b = ByteArrayConverter.toInt(bArr, 2, 0);
        byte[] bArr2 = new byte[32];
        this.f15880c = bArr2;
        System.arraycopy(bArr, 6, bArr2, 0, 32);
        b bVar = new b(((bArr[38] & 255) | (65280 & (bArr[39] << 8))) & 65535);
        this.f15881d = bVar;
        if (bVar.f15890a <= 1) {
            this.f15883f = 4;
        } else {
            int i10 = this.f15881d.f15890a;
            this.f15883f = 32;
            if (i10 > 4) {
                read(new byte[32], 0, 32);
                i8 = 72;
            }
        }
        this.f15884g = this.f15883f * 4;
        ZLogger.v("bankStageSize=" + this.f15884g);
        int i11 = this.f15883f;
        byte[] bArr3 = new byte[i11];
        this.f15882e = bArr3;
        read(bArr3, 0, i11);
        this.f15888k += i8 + this.f15883f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (f15877l) {
            sb.append(String.format("signature==0x%04X", Integer.valueOf(this.f15878a)));
        }
        sb.append(this.f15881d.toString());
        sb.append(String.format(Locale.US, "\nsize=0x%08x(%d)", Integer.valueOf(this.f15879b), Integer.valueOf(this.f15879b)) + String.format(", subFileNum=%d, subFileIndicator=%s", Integer.valueOf(this.f15885h), DataConverter.bytes2Hex(this.f15882e)));
        return sb.toString();
    }

    public static a a(SubFileInfo.d dVar, InputStream inputStream, long j8) {
        a aVar = null;
        if (inputStream == null) {
            ZLogger.w("InputStream can not be null");
            return null;
        }
        try {
            aVar = new a(dVar, j8, inputStream);
        } catch (IOException e8) {
            if (f15877l) {
                ZLogger.d(e8.toString());
            }
        }
        try {
            inputStream.close();
        } catch (IOException e9) {
            ZLogger.w(e9.toString());
        }
        return aVar;
    }

    public SubFileInfo b(int i8) {
        ArrayList arrayList = this.f15886i;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            SubFileInfo subFileInfo = (SubFileInfo) obj;
            if (subFileInfo.binId == i8) {
                return subFileInfo;
            }
        }
        return null;
    }

    public SubFileInfo c(int i8) {
        ArrayList arrayList = this.f15886i;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = this.f15886i;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                SubFileInfo subFileInfo = (SubFileInfo) obj;
                if (subFileInfo.bitNumber == i8) {
                    return subFileInfo;
                }
            }
        }
        return null;
    }

    public boolean d(int i8) {
        ArrayList arrayList = this.f15886i;
        return (arrayList == null || arrayList.size() != 1 || b(i8) == null) ? false : true;
    }

    public final List a(int i8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15886i;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ZLogger.v("getSubFileInfos:bankNumber=" + i8);
            int i9 = 0;
            if (i8 == 1) {
                ArrayList arrayList3 = this.f15886i;
                int size = arrayList3.size();
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    SubFileInfo subFileInfo = (SubFileInfo) obj;
                    if (b(subFileInfo)) {
                        ZLogger.v(f15877l, "add:" + subFileInfo.toString());
                        arrayList.add(subFileInfo);
                    }
                }
            } else {
                ArrayList arrayList4 = this.f15886i;
                int size2 = arrayList4.size();
                while (i9 < size2) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    SubFileInfo subFileInfo2 = (SubFileInfo) obj2;
                    if (a(subFileInfo2)) {
                        ZLogger.v(f15877l, "add:" + subFileInfo2.toString());
                        arrayList.add(subFileInfo2);
                    }
                }
            }
        }
        return arrayList;
    }

    public SubFileInfo b(int i8, int i9) {
        if (i9 == 1) {
            i8 += this.f15884g;
        }
        return c(i8);
    }

    public List a(LoadParams loadParams, int i8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15886i;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ZLogger.v("getSubFileInfos:bankNumber=" + i8);
            int i9 = 0;
            if (i8 == 1) {
                ArrayList arrayList3 = this.f15886i;
                int size = arrayList3.size();
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    SubFileInfo subFileInfo = (SubFileInfo) obj;
                    if (b(subFileInfo) || subFileInfo.isNeedCopyToBank(loadParams)) {
                        arrayList.add(subFileInfo);
                    }
                }
            } else {
                ArrayList arrayList4 = this.f15886i;
                int size2 = arrayList4.size();
                while (i9 < size2) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    SubFileInfo subFileInfo2 = (SubFileInfo) obj2;
                    if (a(subFileInfo2)) {
                        arrayList.add(subFileInfo2);
                    }
                }
            }
        }
        return arrayList;
    }

    public List b(LoadParams loadParams) {
        return a(loadParams, loadParams.l(), true);
    }

    public List a(LoadParams loadParams, int i8, boolean z7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15886i;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i9 = 0;
            if (i8 == 1) {
                ArrayList arrayList3 = this.f15886i;
                int size = arrayList3.size();
                while (i9 < size) {
                    Object obj = arrayList3.get(i9);
                    i9++;
                    SubFileInfo subFileInfo = (SubFileInfo) obj;
                    if (a(subFileInfo, loadParams)) {
                        b(subFileInfo, loadParams);
                        if (b(subFileInfo) || subFileInfo.isNeedCopyToBank(loadParams)) {
                            arrayList.add(subFileInfo);
                        }
                    }
                }
            } else {
                ArrayList arrayList4 = this.f15886i;
                int size2 = arrayList4.size();
                while (i9 < size2) {
                    Object obj2 = arrayList4.get(i9);
                    i9++;
                    SubFileInfo subFileInfo2 = (SubFileInfo) obj2;
                    if (a(subFileInfo2, loadParams)) {
                        b(subFileInfo2, loadParams);
                        if (a(subFileInfo2)) {
                            arrayList.add(subFileInfo2);
                        }
                    }
                }
            }
            if (z7 && loadParams.B()) {
                Collections.sort(arrayList, new C0327a());
            }
        }
        return arrayList;
    }

    public boolean b(SubFileInfo subFileInfo) {
        return subFileInfo.bitNumber >= this.f15884g;
    }

    public static boolean b(SubFileInfo subFileInfo, LoadParams loadParams) {
        if (!loadParams.B()) {
            return true;
        }
        subFileInfo.setSortNumber(loadParams.a(subFileInfo.wrapperBitNumber()));
        return true;
    }

    public void a() {
        try {
            close();
        } catch (IOException e8) {
            ZLogger.v(e8.toString());
        }
    }

    public final void a(SubFileInfo.d dVar) {
        int i8;
        int i9 = 0;
        this.f15885h = 0;
        this.f15886i = new ArrayList();
        byte[] bArr = this.f15882e;
        int length = bArr.length;
        for (byte b8 : bArr) {
            for (int i10 = 0; i10 < 8; i10++) {
                if (((byte) (((byte) (b8 >> i10)) & 1)) == 1) {
                    this.f15885h++;
                }
            }
        }
        int i11 = this.f15881d.f15891b ? 20 : 12;
        long j8 = this.f15888k + (this.f15885h * i11);
        byte[] bArr2 = this.f15882e;
        int length2 = bArr2.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length2) {
            byte b9 = bArr2[i12];
            int i14 = 0;
            while (i14 < 8) {
                if (((byte) (((byte) (b9 >> i14)) & 1)) == 1) {
                    byte[] bArr3 = new byte[i11];
                    read(bArr3, i9, i11);
                    i8 = i14;
                    SubFileInfo a8 = new SubFileInfo.b(this.f15881d.f15895f, i13, this.f15884g, j8, new SubFileInfo.c(bArr3, this.f15881d.f15891b)).a(dVar).a();
                    this.f15886i.add(a8);
                    j8 += a8.size;
                } else {
                    i8 = i14;
                }
                i13++;
                i14 = i8 + 1;
                i9 = 0;
            }
            i12++;
            i9 = 0;
        }
    }

    public boolean a(int i8, int i9) {
        return b(i8, i9) != null;
    }

    public boolean a(SubFileInfo subFileInfo) {
        return subFileInfo.bitNumber < this.f15884g;
    }

    public static boolean a(SubFileInfo subFileInfo, LoadParams loadParams) {
        if (!loadParams.t() || BinIndicator.isIndicatorEnabled(loadParams.e(), subFileInfo.wrapperBitNumber())) {
            return true;
        }
        ZLogger.v(String.format(Locale.US, "prohibit upgrade imageId=0x%04X", Integer.valueOf(subFileInfo.imageId)));
        return false;
    }
}
