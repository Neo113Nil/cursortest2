package j$.util.concurrent;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    public long a;
    public int b;
    public final boolean c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    public static final ThreadLocal d = new ThreadLocal();
    public static final AtomicInteger e = new AtomicInteger();
    public static final x f = new x();
    public static final AtomicLong g = new AtomicLong(c(System.currentTimeMillis()) ^ c(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new j$.sun.security.action.a(2))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    public static final void a() {
        int addAndGet = e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long c = c(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = c;
        threadLocalRandom.b = addAndGet;
    }

    public static int b(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long c(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            a();
        }
        return threadLocalRandom;
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    public final long d() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return b(d()) < 0;
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return nextLong;
        }
        double d4 = ((d3 - d2) * nextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (b(d()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public final int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        int b = b(d());
        if (i >= i2) {
            return b;
        }
        int i3 = i2 - i;
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return (b & i4) + i;
        }
        if (i3 > 0) {
            int i5 = b >>> 1;
            while (true) {
                int i6 = i5 + i4;
                int i7 = i5 % i3;
                if (i6 - i7 >= 0) {
                    return i7 + i;
                }
                i5 = b(d()) >>> 1;
            }
        } else {
            while (true) {
                if (b >= i && b < i2) {
                    return b;
                }
                b = b(d());
            }
        }
    }

    public long nextLong(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        long c = c(d());
        if (j >= j2) {
            return c;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (c & j4) + j;
        }
        if (j3 > 0) {
            long j5 = c >>> 1;
            while (true) {
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                j5 = c(d()) >>> 1;
            }
        } else {
            while (true) {
                if (c >= j && c < j2) {
                    return c;
                }
                c = c(d());
            }
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ ThreadLocalRandom(int i) {
        this();
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (c(d()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 > 0.0d) {
            double c = (c(d()) >>> 11) * 1.1102230246251565E-16d * d2;
            return c < d2 ? c : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override // java.util.Random
    public final int nextInt() {
        return b(d());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i > 0) {
            int b = b(d());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return b & i2;
            }
            while (true) {
                int i3 = b >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                b = b(d());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return c(d());
    }

    public final long nextLong(long j) {
        if (j > 0) {
            long c = c(d());
            long j2 = j - 1;
            if ((j & j2) == 0) {
                return c & j2;
            }
            while (true) {
                long j3 = c >>> 1;
                long j4 = j3 + j2;
                long j5 = j3 % j;
                if (j4 - j5 >= 0) {
                    return j5;
                }
                c = c(d());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }
}
