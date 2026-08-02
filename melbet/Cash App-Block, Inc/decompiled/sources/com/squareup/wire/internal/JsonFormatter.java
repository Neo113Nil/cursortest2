package com.squareup.wire.internal;

/* loaded from: classes.dex */
public interface JsonFormatter {
    Object fromString(String str);

    Object toStringOrNumber(Object obj);
}
