package com.github.mikephil.charting.utils;

import java.util.List;

/* loaded from: classes3.dex */
public class f {
    private static int ids;
    private int desiredCapacity;
    private a modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class a {
        public static int NO_OWNER = -1;
        int currentOwnerId = NO_OWNER;

        protected abstract a instantiate();
    }

    private f(int i8, a aVar) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.desiredCapacity = i8;
        this.objects = new Object[i8];
        this.objectsPointer = 0;
        this.modelObject = aVar;
        this.replenishPercentage = 1.0f;
        refillPool();
    }

    public static synchronized f create(int i8, a aVar) {
        f fVar;
        synchronized (f.class) {
            fVar = new f(i8, aVar);
            int i9 = ids;
            fVar.poolId = i9;
            ids = i9 + 1;
        }
        return fVar;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void resizePool() {
        int i8 = this.desiredCapacity;
        int i9 = i8 * 2;
        this.desiredCapacity = i9;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i8; i10++) {
            objArr[i10] = this.objects[i10];
        }
        this.objects = objArr;
    }

    public synchronized a get() {
        a aVar;
        try {
            if (this.objectsPointer == -1 && this.replenishPercentage > 0.0f) {
                refillPool();
            }
            Object[] objArr = this.objects;
            int i8 = this.objectsPointer;
            aVar = (a) objArr[i8];
            aVar.currentOwnerId = a.NO_OWNER;
            this.objectsPointer = i8 - 1;
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(a aVar) {
        try {
            int i8 = aVar.currentOwnerId;
            if (i8 != a.NO_OWNER) {
                if (i8 == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + aVar.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i9 = this.objectsPointer + 1;
            this.objectsPointer = i9;
            if (i9 >= this.objects.length) {
                resizePool();
            }
            aVar.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer] = aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setReplenishPercentage(float f8) {
        if (f8 > 1.0f) {
            f8 = 1.0f;
        } else if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.replenishPercentage = f8;
    }

    private void refillPool(float f8) {
        int i8 = this.desiredCapacity;
        int i9 = (int) (i8 * f8);
        if (i9 < 1) {
            i8 = 1;
        } else if (i9 <= i8) {
            i8 = i9;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            this.objects[i10] = this.modelObject.instantiate();
        }
        this.objectsPointer = i8 - 1;
    }

    public synchronized void recycle(List<a> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            try {
                resizePool();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = list.get(i8);
            int i9 = aVar.currentOwnerId;
            if (i9 != a.NO_OWNER) {
                if (i9 == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + aVar.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            aVar.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer + 1 + i8] = aVar;
        }
        this.objectsPointer += size;
    }
}
