package com.startapp.sdk.internal;

import android.util.JsonToken;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ma {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f334a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f334a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f334a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f334a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f334a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f334a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f334a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
