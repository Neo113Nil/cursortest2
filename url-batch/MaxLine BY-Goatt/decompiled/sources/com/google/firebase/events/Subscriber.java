package com.google.firebase.events;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface Subscriber {
    <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler);

    <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler);

    <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler);
}
