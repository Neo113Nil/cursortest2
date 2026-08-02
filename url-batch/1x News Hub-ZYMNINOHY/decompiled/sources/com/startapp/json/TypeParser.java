package com.startapp.json;

/* loaded from: classes.dex */
public interface TypeParser<T> {
    T parse(Class<T> cls, Object obj);
}
