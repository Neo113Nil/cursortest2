package com.startapp.sdk.internal;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f191a;

    public c1(Context context, AttributeSet attributeSet) {
        String str = null;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "adTag", -1);
            str = attributeResourceValue != -1 ? context.getResources().getString(attributeResourceValue) : attributeSet.getAttributeValue(null, "adTag");
        } catch (Exception unused) {
        }
        this.f191a = str;
    }
}
