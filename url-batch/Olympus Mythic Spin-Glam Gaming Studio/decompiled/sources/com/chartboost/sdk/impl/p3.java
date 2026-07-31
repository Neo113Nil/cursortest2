package com.chartboost.sdk.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p3 {
    public static final p3 a = new p3();

    public static final String b() {
        return "Chartboost-Android-SDK  9.12.1";
    }

    public static final List a(File file, boolean z) {
        if (file == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && !Intrinsics.areEqual(file2.getName(), ".nomedia")) {
                Intrinsics.checkNotNull(file2);
                arrayList.add(file2);
            } else if (file2.isDirectory() && z) {
                arrayList.addAll(a(file2, z));
            }
        }
        return arrayList;
    }

    public static final String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
