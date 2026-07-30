package io.reactivex.internal.util;

import p7.c;

/* loaded from: classes3.dex */
public interface QueueDrain<T, U> {
    boolean accept(c cVar, T t7);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i8);

    long produced(long j8);

    long requested();
}
