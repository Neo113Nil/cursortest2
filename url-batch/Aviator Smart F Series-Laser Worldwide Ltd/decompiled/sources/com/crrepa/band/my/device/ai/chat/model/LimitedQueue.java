package com.crrepa.band.my.device.ai.chat.model;

import cn.hutool.core.text.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* loaded from: classes2.dex */
public class LimitedQueue<T> {
    private final Deque<T> deque;
    private final int limit;

    public LimitedQueue(int i8) {
        this.limit = i8;
        this.deque = new ArrayDeque(i8);
    }

    public static void main(String[] strArr) {
        LimitedQueue limitedQueue = new LimitedQueue(6);
        for (int i8 = 0; i8 < 10; i8++) {
            limitedQueue.add(Integer.valueOf(i8));
            limitedQueue.printQueue();
        }
    }

    public void add(T t7) {
        if (this.deque.size() == this.limit) {
            this.deque.removeFirst();
        }
        this.deque.addLast(t7);
    }

    public void clear() {
        this.deque.clear();
    }

    public List<T> convertToList() {
        ArrayList arrayList = new ArrayList(this.deque.size());
        arrayList.addAll(this.deque);
        return arrayList;
    }

    public Deque<T> getDeque() {
        return this.deque;
    }

    public Iterable<T> getItems() {
        return this.deque;
    }

    public void printQueue() {
        for (T t7 : this.deque) {
            System.out.print(t7 + l.SPACE);
        }
        System.out.println();
    }
}
