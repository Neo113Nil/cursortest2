package io.reactivex.internal.util;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LinkedArrayList {
    final int capacityHint;
    Object[] head;
    int indexInTail;
    volatile int size;
    Object[] tail;

    public LinkedArrayList(int i8) {
        this.capacityHint = i8;
    }

    public void add(Object obj) {
        if (this.size == 0) {
            Object[] objArr = new Object[this.capacityHint + 1];
            this.head = objArr;
            this.tail = objArr;
            objArr[0] = obj;
            this.indexInTail = 1;
            this.size = 1;
            return;
        }
        int i8 = this.indexInTail;
        int i9 = this.capacityHint;
        if (i8 != i9) {
            this.tail[i8] = obj;
            this.indexInTail = i8 + 1;
            this.size++;
        } else {
            Object[] objArr2 = new Object[i9 + 1];
            objArr2[0] = obj;
            this.tail[i9] = objArr2;
            this.tail = objArr2;
            this.indexInTail = 1;
            this.size++;
        }
    }

    public Object[] head() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        int i8 = this.capacityHint;
        int i9 = this.size;
        ArrayList arrayList = new ArrayList(i9 + 1);
        Object[] head = head();
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (i10 < i9) {
                arrayList.add(head[i11]);
                i10++;
                i11++;
                if (i11 == i8) {
                    break;
                }
            }
            return arrayList.toString();
            head = head[i8];
        }
    }
}
