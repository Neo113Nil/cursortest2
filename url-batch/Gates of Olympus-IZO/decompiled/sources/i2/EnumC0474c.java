package i2;

import M1.B;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0474c {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0474c f5121e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0474c f5122f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0474c f5123g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0474c f5124h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0474c f5125i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0474c f5126j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0474c[] f5127k;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f5128d;

    static {
        EnumC0474c enumC0474c = new EnumC0474c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f5121e = enumC0474c;
        EnumC0474c enumC0474c2 = new EnumC0474c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC0474c enumC0474c3 = new EnumC0474c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f5122f = enumC0474c3;
        EnumC0474c enumC0474c4 = new EnumC0474c("SECONDS", 3, TimeUnit.SECONDS);
        f5123g = enumC0474c4;
        EnumC0474c enumC0474c5 = new EnumC0474c("MINUTES", 4, TimeUnit.MINUTES);
        f5124h = enumC0474c5;
        EnumC0474c enumC0474c6 = new EnumC0474c("HOURS", 5, TimeUnit.HOURS);
        f5125i = enumC0474c6;
        EnumC0474c enumC0474c7 = new EnumC0474c("DAYS", 6, TimeUnit.DAYS);
        f5126j = enumC0474c7;
        EnumC0474c[] enumC0474cArr = {enumC0474c, enumC0474c2, enumC0474c3, enumC0474c4, enumC0474c5, enumC0474c6, enumC0474c7};
        f5127k = enumC0474cArr;
        B.x(enumC0474cArr);
    }

    public EnumC0474c(String str, int i3, TimeUnit timeUnit) {
        this.f5128d = timeUnit;
    }

    public static EnumC0474c valueOf(String str) {
        return (EnumC0474c) Enum.valueOf(EnumC0474c.class, str);
    }

    public static EnumC0474c[] values() {
        return (EnumC0474c[]) f5127k.clone();
    }
}
