package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2982t8;
import io.appmetrica.analytics.impl.C3008u8;
import io.appmetrica.analytics.impl.C3125yl;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.W2;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final O6 f40660a = new O6("appmetrica_birth_date", new C3008u8(), new C3125yl());

    BirthDateAttribute() {
    }

    final UserProfileUpdate a(Calendar calendar, String str, W2 w22) {
        return new UserProfileUpdate(new Xm(this.f40660a.f38052c, new SimpleDateFormat(str).format(calendar.getTime()), new C2982t8(), new C3008u8(), w22));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withAge(int i4) {
        int i5 = Calendar.getInstance(Locale.US).get(1) - i4;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new N4(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withAgeIfUndefined(int i4) {
        int i5 = Calendar.getInstance(Locale.US).get(1) - i4;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i5);
        return a(gregorianCalendar, "yyyy", new Yk(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new N4(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new Yk(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(0, this.f40660a.f38052c, new C3008u8(), new C3125yl()));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDate(int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new N4(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDateIfUndefined(int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new Yk(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDate(int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new N4(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDateIfUndefined(int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Yk(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDate(int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new N4(this.f40660a.f38051b));
    }

    public UserProfileUpdate<? extends InterfaceC2528bo> withBirthDateIfUndefined(int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i6);
        return a(gregorianCalendar, "yyyy-MM-dd", new Yk(this.f40660a.f38051b));
    }
}
