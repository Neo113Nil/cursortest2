package io.flutter.util;

import android.os.Build;
import android.os.Trace;
import i2.AbstractC0457a;
import o1.AbstractC1325a;

/* loaded from: classes.dex */
public final class TraceSection implements AutoCloseable {
    private TraceSection(String str) {
        begin(str);
    }

    public static void begin(String str) {
        Trace.beginSection(AbstractC0457a.E(cropSectionName(str)));
    }

    public static void beginAsyncSection(String str, int i4) {
        String cropSectionName = cropSectionName(str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1325a.a(AbstractC0457a.E(cropSectionName), i4);
            return;
        }
        String E4 = AbstractC0457a.E(cropSectionName);
        try {
            if (AbstractC0457a.f9320i == null) {
                AbstractC0457a.f9320i = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            AbstractC0457a.f9320i.invoke(null, Long.valueOf(AbstractC0457a.f9318g), E4, Integer.valueOf(i4));
        } catch (Exception e4) {
            AbstractC0457a.s("asyncTraceBegin", e4);
        }
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() throws RuntimeException {
        Trace.endSection();
    }

    public static void endAsyncSection(String str, int i4) {
        String cropSectionName = cropSectionName(str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1325a.b(AbstractC0457a.E(cropSectionName), i4);
            return;
        }
        String E4 = AbstractC0457a.E(cropSectionName);
        try {
            if (AbstractC0457a.f9321j == null) {
                AbstractC0457a.f9321j = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            AbstractC0457a.f9321j.invoke(null, Long.valueOf(AbstractC0457a.f9318g), E4, Integer.valueOf(i4));
        } catch (Exception e4) {
            AbstractC0457a.s("asyncTraceEnd", e4);
        }
    }

    public static TraceSection scoped(String str) {
        return new TraceSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
