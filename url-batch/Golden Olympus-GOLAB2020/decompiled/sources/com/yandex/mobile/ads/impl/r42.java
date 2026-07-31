package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ca2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r42 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<p42> f31027a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jg1 f31028b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ij1 f31029c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final s42 f31030d;

    public /* synthetic */ r42(Set set) {
        this(set, new jg1(), new ij1(), new s42());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r0 <= 100.0f) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ca2 a(@NotNull String rawValue) {
        Long l4;
        Integer num;
        int parseInt;
        Float f4;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        if (this.f31027a.contains(p42.f30337d) && Intrinsics.areEqual("start", rawValue)) {
            return new ca2(ca2.b.f24147b, 0.0f);
        }
        if (this.f31027a.contains(p42.f30338e) && Intrinsics.areEqual("end", rawValue)) {
            return new ca2(ca2.b.f24148c, 100.0f);
        }
        if (this.f31027a.contains(p42.f30336c) && StringsKt.v(rawValue, "%", false, 2, null)) {
            this.f31028b.getClass();
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            try {
                String substring = rawValue.substring(0, StringsKt.W(rawValue));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                f4 = StringsKt.k(substring);
                if (f4 != null) {
                    float floatValue = f4.floatValue();
                    if (0.0f <= floatValue) {
                    }
                }
            } catch (Throwable unused) {
            }
            f4 = null;
            if (f4 != null) {
                return new ca2(ca2.b.f24148c, f4.floatValue());
            }
            return null;
        }
        if (!this.f31027a.contains(p42.f30339f) || !StringsKt.K(rawValue, "#", false, 2, null)) {
            if (!this.f31027a.contains(p42.f30335b)) {
                return null;
            }
            this.f31030d.getClass();
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                l4 = Long.valueOf(simpleDateFormat.parse(rawValue).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused2) {
                l4 = null;
            }
            if (l4 != null) {
                return new ca2(ca2.b.f24147b, l4.longValue());
            }
            return null;
        }
        this.f31029c.getClass();
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        try {
            String substring2 = rawValue.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            parseInt = Integer.parseInt(substring2);
        } catch (Exception unused3) {
        }
        if (parseInt >= 1) {
            num = Integer.valueOf(parseInt);
            if (num == null) {
                return new ca2(ca2.b.f24149d, num.intValue());
            }
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r42(@NotNull Set<? extends p42> allowedFormats, @NotNull jg1 percentageParser, @NotNull ij1 positionParser, @NotNull s42 timeParser) {
        Intrinsics.checkNotNullParameter(allowedFormats, "allowedFormats");
        Intrinsics.checkNotNullParameter(percentageParser, "percentageParser");
        Intrinsics.checkNotNullParameter(positionParser, "positionParser");
        Intrinsics.checkNotNullParameter(timeParser, "timeParser");
        this.f31027a = allowedFormats;
        this.f31028b = percentageParser;
        this.f31029c = positionParser;
        this.f31030d = timeParser;
    }
}
