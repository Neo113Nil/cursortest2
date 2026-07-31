package com.google.android.datatransport;

/* loaded from: classes.dex */
public abstract class Event<T> {
    public static <T> Event<T> ofData(T t4, ProductData productData) {
        return new AutoValue_Event(null, t4, Priority.DEFAULT, productData);
    }

    public abstract Integer getCode();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(T t4) {
        return new AutoValue_Event(null, t4, Priority.DEFAULT, null);
    }
}
