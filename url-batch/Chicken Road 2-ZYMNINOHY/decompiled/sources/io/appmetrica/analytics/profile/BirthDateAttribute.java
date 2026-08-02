package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0479a8;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.C1113yl;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.J2;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13371a = new C0968t6("appmetrica_birth_date", new C0479a8(), new C1113yl());

    public final UserProfileUpdate a(Calendar calendar, String str, J2 j22) {
        return new UserProfileUpdate(new Ym(this.f13371a.f12770c, new SimpleDateFormat(str).format(calendar.getTime()), new Z7(), new C0479a8(), j22));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withAge(int i4) {
        int i5 = Calendar.getInstance(Locale.US).get(1) - i4;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new C0940s4(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withAgeIfUndefined(int i4) {
        int i5 = Calendar.getInstance(Locale.US).get(1) - i4;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new Xk(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0940s4(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Xk(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(0, this.f13371a.f12770c, new C0479a8(), new C1113yl()));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDate(int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new C0940s4(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDateIfUndefined(int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new Xk(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDate(int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0940s4(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDateIfUndefined(int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Xk(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDate(int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0940s4(this.f13371a.f12769b));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withBirthDateIfUndefined(int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new Xk(this.f13371a.f12769b));
    }
}
