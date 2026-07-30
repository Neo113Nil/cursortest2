package com.realsil.sdk.core.base;

import com.realsil.sdk.core.logger.ZLogger;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes4.dex */
public abstract class BaseThread<T> extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f15415a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingDeque f15416b = new LinkedBlockingDeque();

    public void addQueue(T t7) {
        synchronized (this.f15416b) {
            this.f15416b.add(t7);
        }
    }

    public void cancel(boolean z7) {
        this.f15415a = z7;
    }

    public void clearQueue() {
        synchronized (this.f15416b) {
            this.f15416b.clear();
        }
    }

    public boolean isCanceled() {
        return this.f15415a;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f15416b) {
            isEmpty = this.f15416b.isEmpty();
        }
        return isEmpty;
    }

    public T peek() {
        T t7;
        synchronized (this.f15416b) {
            t7 = (T) this.f15416b.peek();
        }
        return t7;
    }

    public T poll() {
        T t7;
        synchronized (this.f15416b) {
            t7 = (T) this.f15416b.poll();
        }
        return t7;
    }

    public void push(T t7) {
        synchronized (this.f15416b) {
            this.f15416b.push(t7);
        }
    }

    public T take() {
        try {
            return (T) this.f15416b.take();
        } catch (InterruptedException e8) {
            ZLogger.v(e8.getMessage());
            return null;
        }
    }
}
