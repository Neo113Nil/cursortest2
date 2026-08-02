package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bel implements bed {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final bem b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public bel(long j) {
        Bitmap.Config config;
        ber berVar = new ber();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        config = Bitmap.Config.HARDWARE;
        hashSet.remove(config);
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = berVar;
        this.c = unmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        config2 = Bitmap.Config.HARDWARE;
        if (config == config2) {
            throw new IllegalArgumentException(a.aj(config, "Cannot create a mutable Bitmap with config: ", ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"));
        }
        bem bemVar = this.b;
        if (config == null) {
            config = a;
        }
        int b = i * i2 * bmi.b(config);
        beq beqVar = ((ber) bemVar).f;
        bep d = beqVar.d(b, config);
        config3 = Bitmap.Config.RGBA_F16;
        int i3 = 0;
        if (config3.equals(config)) {
            configArr = ber.b;
        } else {
            int i4 = beo.a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : ber.e : ber.d : ber.c : ber.a;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config4 = configArr[i3];
            Integer num = (Integer) ((ber) bemVar).b(config4).ceilingKey(Integer.valueOf(b));
            if (num == null || num.intValue() > b * 8) {
                i3++;
            } else {
                if (num.intValue() == b) {
                    if (config4 == null) {
                        if (config != null) {
                        }
                    } else if (config4.equals(config)) {
                    }
                }
                beqVar.c(d);
                d = beqVar.d(num.intValue(), config4);
            }
        }
        bitmap = (Bitmap) ((ber) bemVar).g.a(d);
        if (bitmap != null) {
            ((ber) bemVar).c(Integer.valueOf(d.a), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        if (bitmap == null) {
            this.g++;
        } else {
            this.f++;
            this.e -= bmi.a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        }
        return bitmap;
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            bem bemVar = this.b;
            Bitmap bitmap = (Bitmap) ((ber) bemVar).g.b();
            if (bitmap != null) {
                ((ber) bemVar).c(Integer.valueOf(bmi.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    bemVar.toString();
                }
                this.e = 0L;
                return;
            }
            this.e -= bmi.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.bed
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        if (g == null) {
            return f(i, i2, config);
        }
        g.eraseColor(0);
        return g;
    }

    @Override // defpackage.bed
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap g = g(i, i2, config);
        return g == null ? f(i, i2, config) : g;
    }

    @Override // defpackage.bed
    public final void c() {
        h(0L);
    }

    @Override // defpackage.bed
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                bem bemVar = this.b;
                long a2 = bmi.a(bitmap);
                long j = this.d;
                if (a2 <= j && this.c.contains(bitmap.getConfig())) {
                    int a3 = bmi.a(bitmap);
                    bep d = ((ber) bemVar).f.d(bmi.a(bitmap), bitmap.getConfig());
                    ((ber) bemVar).g.c(d, bitmap);
                    NavigableMap b = ((ber) bemVar).b(bitmap.getConfig());
                    Integer num = (Integer) b.get(Integer.valueOf(d.a));
                    b.put(Integer.valueOf(d.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                    this.h++;
                    this.e += a3;
                    h(j);
                    return;
                }
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bed
    public final void e(int i) {
        if (i >= 40 || i >= 20) {
            h(0L);
        } else if (i == 15) {
            h(this.d >> 1);
        }
    }
}
