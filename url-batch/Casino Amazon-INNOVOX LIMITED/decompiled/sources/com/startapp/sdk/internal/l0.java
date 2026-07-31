package com.startapp.sdk.internal;

import android.content.pm.Signature;
import java.util.Comparator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Signature) obj).toCharsString().compareTo(((Signature) obj2).toCharsString());
    }
}
