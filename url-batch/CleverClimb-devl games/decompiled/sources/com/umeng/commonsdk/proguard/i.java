package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.i;
import com.umeng.commonsdk.proguard.p;
import java.io.Serializable;

/* compiled from: TBase.java */
/* loaded from: classes2.dex */
public interface i<T extends i<?, ?>, F extends p> extends Serializable {
    void clear();

    i<T, F> deepCopy();

    F fieldForId(int i);

    void read(ah ahVar) throws o;

    void write(ah ahVar) throws o;
}
