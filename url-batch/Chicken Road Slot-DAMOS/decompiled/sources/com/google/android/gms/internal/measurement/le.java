package com.google.android.gms.internal.measurement;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class le {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2506a = Pattern.compile("(\\w+).*");

    public static String a(b8.s sVar) {
        if (sVar.isEmpty()) {
            return null;
        }
        a8.f fVar = new a8.f("+", 0);
        b8.d listIterator = sVar.listIterator(0);
        StringBuilder sb2 = new StringBuilder();
        fVar.a(sb2, listIterator);
        return "transform=".concat(sb2.toString());
    }
}
