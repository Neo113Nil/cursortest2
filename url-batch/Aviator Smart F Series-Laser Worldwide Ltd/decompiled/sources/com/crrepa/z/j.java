package com.crrepa.z;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class j implements d {

    /* renamed from: f, reason: collision with root package name */
    private static final int f14083f = 4000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f14084g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final char f14085h = 9484;

    /* renamed from: i, reason: collision with root package name */
    private static final char f14086i = 9492;

    /* renamed from: j, reason: collision with root package name */
    private static final char f14087j = 9500;

    /* renamed from: k, reason: collision with root package name */
    private static final char f14088k = 9474;

    /* renamed from: l, reason: collision with root package name */
    private static final String f14089l = "────────────────────────────────────────────────────────";

    /* renamed from: m, reason: collision with root package name */
    private static final String f14090m = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: n, reason: collision with root package name */
    private static final String f14091n = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: o, reason: collision with root package name */
    private static final String f14092o = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: p, reason: collision with root package name */
    private static final String f14093p = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: a, reason: collision with root package name */
    private final int f14094a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14095b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14096c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final f f14097d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f14098e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f14099a;

        /* renamed from: b, reason: collision with root package name */
        int f14100b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14101c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        f f14102d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        String f14103e;

        private b() {
            this.f14099a = 2;
            this.f14100b = 0;
            this.f14101c = true;
            this.f14103e = "PRETTY_LOGGER";
        }

        @NonNull
        public b a(int i8) {
            this.f14099a = i8;
            return this;
        }

        @NonNull
        public b b(int i8) {
            this.f14100b = i8;
            return this;
        }

        @NonNull
        public b a(@Nullable f fVar) {
            this.f14102d = fVar;
            return this;
        }

        @NonNull
        public b a(@Nullable String str) {
            this.f14103e = str;
            return this;
        }

        @NonNull
        public b a(boolean z7) {
            this.f14101c = z7;
            return this;
        }

        @NonNull
        public j a() {
            if (this.f14102d == null) {
                this.f14102d = new g();
            }
            return new j(this);
        }
    }

    private j(@NonNull b bVar) {
        l.a(bVar);
        this.f14094a = bVar.f14099a;
        this.f14095b = bVar.f14100b;
        this.f14096c = bVar.f14101c;
        this.f14097d = bVar.f14102d;
        this.f14098e = bVar.f14103e;
    }

    private int a(@NonNull StackTraceElement[] stackTraceElementArr) {
        l.a(stackTraceElementArr);
        for (int i8 = 5; i8 < stackTraceElementArr.length; i8++) {
            String className = stackTraceElementArr[i8].getClassName();
            if (!className.equals(i.class.getName()) && !className.equals(h.class.getName())) {
                return i8 - 1;
            }
        }
        return -1;
    }

    private String b(@NonNull String str) {
        l.a(str);
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private void c(int i8, @Nullable String str) {
        a(i8, str, f14091n);
    }

    @Override // com.crrepa.z.d
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        String a8 = a(str);
        c(i8, a8);
        a(i8, a8, this.f14094a);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            if (this.f14094a > 0) {
                b(i8, a8);
            }
            b(i8, a8, str2);
            a(i8, a8);
            return;
        }
        if (this.f14094a > 0) {
            b(i8, a8);
        }
        for (int i9 = 0; i9 < length; i9 += 4000) {
            b(i8, a8, new String(bytes, i9, Math.min(length - i9, 4000)));
        }
        a(i8, a8);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    private void b(int i8, @Nullable String str) {
        a(i8, str, f14093p);
    }

    @Nullable
    private String a(@Nullable String str) {
        if (l.a((CharSequence) str) || l.a(this.f14098e, str)) {
            return this.f14098e;
        }
        return this.f14098e + "-" + str;
    }

    private void b(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            a(i8, str, "│ " + str3);
        }
    }

    private void a(int i8, @Nullable String str) {
        a(i8, str, f14092o);
    }

    private void a(int i8, @Nullable String str, int i9) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f14096c) {
            a(i8, str, "│ Thread: " + Thread.currentThread().getName());
            b(i8, str);
        }
        int a8 = a(stackTrace) + this.f14095b;
        String str2 = "";
        if (i9 + a8 > stackTrace.length) {
            i9 = (stackTrace.length - a8) - 1;
        }
        while (i9 > 0) {
            int i10 = i9 + a8;
            if (i10 < stackTrace.length) {
                a(i8, str, f14088k + ' ' + str2 + b(stackTrace[i10].getClassName()) + "." + stackTrace[i10].getMethodName() + cn.hutool.core.text.l.SPACE + " (" + stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber() + ")");
                str2 = str2 + "   ";
            }
            i9--;
        }
    }

    private void a(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        this.f14097d.log(i8, str, str2);
    }
}
