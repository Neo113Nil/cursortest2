package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import p7.c;

/* loaded from: classes3.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final Object[] head;
    int offset;
    Object[] tail;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t7);
    }

    public AppendOnlyLinkedArrayList(int i8) {
        this.capacity = i8;
        Object[] objArr = new Object[i8 + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(c cVar) {
        Object[] objArr = this.head;
        int i8 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                Object[] objArr2 = objArr[i9];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, cVar)) {
                    return true;
                }
            }
            objArr = objArr[i8];
        }
    }

    public void add(T t7) {
        int i8 = this.capacity;
        int i9 = this.offset;
        if (i9 == i8) {
            Object[] objArr = new Object[i8 + 1];
            this.tail[i8] = objArr;
            this.tail = objArr;
            i9 = 0;
        }
        this.tail[i9] = t7;
        this.offset = i9 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i8 = this.capacity;
        for (Object[] objArr = this.head; objArr != null; objArr = (Object[]) objArr[i8]) {
            for (int i9 = 0; i9 < i8; i9++) {
                Object obj = objArr[i9];
                if (obj == null) {
                    break;
                } else {
                    if (nonThrowingPredicate.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void setFirst(T t7) {
        this.head[0] = t7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(Observer<? super U> observer) {
        Object[] objArr = this.head;
        int i8 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i9 = 0; i9 < i8; i9++) {
                Object[] objArr2 = objArr[i9];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, observer)) {
                    return true;
                }
            }
            objArr = objArr[i8];
        }
    }

    public <S> void forEachWhile(S s7, BiPredicate<? super S, ? super T> biPredicate) {
        Object[] objArr = this.head;
        int i8 = this.capacity;
        while (true) {
            for (int i9 = 0; i9 < i8; i9++) {
                Object obj = objArr[i9];
                if (obj == null || biPredicate.test(s7, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i8];
        }
    }
}
