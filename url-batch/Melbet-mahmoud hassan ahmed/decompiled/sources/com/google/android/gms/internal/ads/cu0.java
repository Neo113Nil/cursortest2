package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
final /* synthetic */ class cu0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f3947a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f3947a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3947a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3947a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3947a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3947a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
