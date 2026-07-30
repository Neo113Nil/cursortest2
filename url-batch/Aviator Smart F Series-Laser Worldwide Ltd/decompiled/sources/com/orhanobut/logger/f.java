package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class f {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    @NonNull
    private static i printer = new g();

    private f() {
    }

    public static void addLogAdapter(@NonNull c cVar) {
        printer.addAdapter((c) j.checkNotNull(cVar));
    }

    public static void clearLogAdapters() {
        printer.clearLogAdapters();
    }

    public static void d(@NonNull String str, @Nullable Object... objArr) {
        printer.d(str, objArr);
    }

    public static void e(@NonNull String str, @Nullable Object... objArr) {
        printer.e(null, str, objArr);
    }

    public static void i(@NonNull String str, @Nullable Object... objArr) {
        printer.i(str, objArr);
    }

    public static void json(@Nullable String str) {
        printer.json(str);
    }

    public static void log(int i8, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        printer.log(i8, str, str2, th);
    }

    public static void printer(@NonNull i iVar) {
        printer = (i) j.checkNotNull(iVar);
    }

    public static i t(@Nullable String str) {
        return printer.t(str);
    }

    public static void v(@NonNull String str, @Nullable Object... objArr) {
        printer.v(str, objArr);
    }

    public static void w(@NonNull String str, @Nullable Object... objArr) {
        printer.w(str, objArr);
    }

    public static void wtf(@NonNull String str, @Nullable Object... objArr) {
        printer.wtf(str, objArr);
    }

    public static void xml(@Nullable String str) {
        printer.xml(str);
    }

    public static void d(@Nullable Object obj) {
        printer.d(obj);
    }

    public static void e(@Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        printer.e(th, str, objArr);
    }
}
