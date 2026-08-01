package com.bytedance.sdk.component.pvs;

import java.lang.reflect.Type;

/* compiled from: IDataConverter.java */
/* loaded from: classes.dex */
public interface kj {
    <T> T pvs(String str, Type type);

    <T> String pvs(T t);
}
