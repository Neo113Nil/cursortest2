package org.greenrobot.greendao.internal;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class c {
    private int capacity;
    private int size;
    private a[] table;
    private int threshold;

    static final class a {
        final long key;
        a next;
        Object value;

        a(long j8, Object obj, a aVar) {
            this.key = j8;
            this.value = obj;
            this.next = aVar;
        }
    }

    public c() {
        this(16);
    }

    public void clear() {
        this.size = 0;
        Arrays.fill(this.table, (Object) null);
    }

    public boolean containsKey(long j8) {
        for (a aVar = this.table[((((int) j8) ^ ((int) (j8 >>> 32))) & Integer.MAX_VALUE) % this.capacity]; aVar != null; aVar = aVar.next) {
            if (aVar.key == j8) {
                return true;
            }
        }
        return false;
    }

    public Object get(long j8) {
        for (a aVar = this.table[((((int) j8) ^ ((int) (j8 >>> 32))) & Integer.MAX_VALUE) % this.capacity]; aVar != null; aVar = aVar.next) {
            if (aVar.key == j8) {
                return aVar.value;
            }
        }
        return null;
    }

    public void logStats() {
        int i8 = 0;
        for (a aVar : this.table) {
            while (aVar != null) {
                aVar = aVar.next;
                if (aVar != null) {
                    i8++;
                }
            }
        }
        org.greenrobot.greendao.d.d("load: " + (this.size / this.capacity) + ", size: " + this.size + ", capa: " + this.capacity + ", collisions: " + i8 + ", collision ratio: " + (i8 / this.size));
    }

    public Object put(long j8, Object obj) {
        int i8 = ((((int) j8) ^ ((int) (j8 >>> 32))) & Integer.MAX_VALUE) % this.capacity;
        a aVar = this.table[i8];
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.next) {
            if (aVar2.key == j8) {
                Object obj2 = aVar2.value;
                aVar2.value = obj;
                return obj2;
            }
        }
        this.table[i8] = new a(j8, obj, aVar);
        int i9 = this.size + 1;
        this.size = i9;
        if (i9 <= this.threshold) {
            return null;
        }
        setCapacity(this.capacity * 2);
        return null;
    }

    public Object remove(long j8) {
        int i8 = ((((int) j8) ^ ((int) (j8 >>> 32))) & Integer.MAX_VALUE) % this.capacity;
        a aVar = this.table[i8];
        a aVar2 = null;
        while (aVar != null) {
            a aVar3 = aVar.next;
            if (aVar.key == j8) {
                if (aVar2 == null) {
                    this.table[i8] = aVar3;
                } else {
                    aVar2.next = aVar3;
                }
                this.size--;
                return aVar.value;
            }
            aVar2 = aVar;
            aVar = aVar3;
        }
        return null;
    }

    public void reserveRoom(int i8) {
        setCapacity((i8 * 5) / 3);
    }

    public void setCapacity(int i8) {
        a[] aVarArr = new a[i8];
        int length = this.table.length;
        for (int i9 = 0; i9 < length; i9++) {
            a aVar = this.table[i9];
            while (aVar != null) {
                long j8 = aVar.key;
                int i10 = ((((int) (j8 >>> 32)) ^ ((int) j8)) & Integer.MAX_VALUE) % i8;
                a aVar2 = aVar.next;
                aVar.next = aVarArr[i10];
                aVarArr[i10] = aVar;
                aVar = aVar2;
            }
        }
        this.table = aVarArr;
        this.capacity = i8;
        this.threshold = (i8 * 4) / 3;
    }

    public int size() {
        return this.size;
    }

    public c(int i8) {
        this.capacity = i8;
        this.threshold = (i8 * 4) / 3;
        this.table = new a[i8];
    }
}
