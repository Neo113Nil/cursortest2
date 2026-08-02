package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjh implements bbn {
    private static final brn c = new brn((byte[]) null, (char[]) null);
    private final Context a;
    private final List b;
    private final brn d;
    private final afr e;

    public bjh(Context context, List list, bed bedVar, bek bekVar) {
        brn brnVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new afr(bedVar, bekVar);
        this.d = brnVar;
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        bat batVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        bau k = this.d.k(byteBuffer);
        try {
            double d = bmd.a;
            SystemClock.elapsedRealtimeNanos();
            if (k.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            bjl bjlVar = null;
            int i3 = 0;
            if (k.e()) {
                batVar = k.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < 6; i4++) {
                    sb.append((char) k.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    k.c.f = k.b();
                    k.c.g = k.b();
                    int a = k.a();
                    bat batVar2 = k.c;
                    batVar2.h = (a & 128) != 0;
                    batVar2.i = (int) Math.pow(2.0d, (a & 7) + 1);
                    k.c.j = k.a();
                    k.c.k = k.a();
                    if (k.c.h && !k.e()) {
                        bat batVar3 = k.c;
                        batVar3.a = k.f(batVar3.i);
                        bat batVar4 = k.c;
                        batVar4.l = batVar4.a[batVar4.j];
                    }
                } else {
                    k.c.b = 1;
                }
                if (!k.e()) {
                    while (!k.e()) {
                        int i5 = k.c.c;
                        int a2 = k.a();
                        if (a2 == 33) {
                            int a3 = k.a();
                            if (a3 == 1) {
                                k.d();
                            } else if (a3 == 249) {
                                k.c.d = new bas();
                                k.a();
                                int a4 = k.a();
                                bas basVar = k.c.d;
                                int i6 = (a4 & 28) >> 2;
                                basVar.g = i6;
                                if (i6 == 0) {
                                    basVar.g = 1;
                                }
                                basVar.f = 1 == (a4 & 1);
                                int b = k.b();
                                if (b < 2) {
                                    b = 10;
                                }
                                bas basVar2 = k.c.d;
                                basVar2.i = b * 10;
                                basVar2.h = k.a();
                                k.a();
                            } else if (a3 == 254) {
                                k.d();
                            } else if (a3 != 255) {
                                k.d();
                            } else {
                                k.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i7 = 0; i7 < 11; i7++) {
                                    sb2.append((char) k.a[i7]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        k.c();
                                        byte[] bArr = k.a;
                                        if (bArr[0] == 1) {
                                            k.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                        }
                                        if (k.d > 0) {
                                        }
                                    } while (!k.e());
                                } else {
                                    k.d();
                                }
                            }
                        } else if (a2 == 44) {
                            bat batVar5 = k.c;
                            if (batVar5.d == null) {
                                batVar5.d = new bas();
                            }
                            batVar5.d.a = k.b();
                            k.c.d.b = k.b();
                            k.c.d.c = k.b();
                            k.c.d.d = k.b();
                            int a5 = k.a();
                            int i8 = a5 & 128;
                            int pow = (int) Math.pow(2.0d, (a5 & 7) + 1);
                            bas basVar3 = k.c.d;
                            basVar3.e = (a5 & 64) != 0;
                            if (i8 != 0) {
                                basVar3.k = k.f(pow);
                            } else {
                                basVar3.k = null;
                            }
                            k.c.d.j = k.b.position();
                            k.a();
                            k.d();
                            if (!k.e()) {
                                bat batVar6 = k.c;
                                batVar6.c++;
                                batVar6.e.add(batVar6.d);
                            }
                        } else {
                            if (a2 == 59) {
                                break;
                            }
                            k.c.b = 1;
                        }
                    }
                    bat batVar7 = k.c;
                    if (batVar7.c < 0) {
                        batVar7.b = 1;
                    }
                }
                batVar = k.c;
            }
            if (batVar.c > 0 && batVar.b == 0) {
                Bitmap.Config config = bblVar.b(bjo.a) == baw.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(batVar.g / i2, batVar.f / i);
                if (min != 0) {
                    i3 = Integer.highestOneBit(min);
                }
                bav bavVar = new bav(this.e, batVar, byteBuffer, Math.max(1, i3));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                }
                bavVar.i = config;
                bavVar.b();
                Bitmap a6 = bavVar.a();
                if (a6 != null) {
                    bjlVar = new bjl(new bjj(new bji(new bjn(azj.b(this.a), bavVar, i, i2, bgz.b, a6))));
                }
            }
            return bjlVar;
        } finally {
            this.d.l(k);
        }
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bbl bblVar) {
        return !((Boolean) bblVar.b(bjo.b)).booleanValue() && afn.m(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
