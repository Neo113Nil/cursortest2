package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0398bn;
import io.appmetrica.analytics.impl.C0422cl;
import io.appmetrica.analytics.impl.C0486f8;
import io.appmetrica.analytics.impl.C0512g8;
import io.appmetrica.analytics.impl.C0998z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import io.appmetrica.analytics.impl.R2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8949a = new A6("appmetrica_birth_date", new C0512g8(), new Cl());

    public final UserProfileUpdate a(Calendar calendar, String str, R2 r22) {
        return new UserProfileUpdate(new C0398bn(this.f8949a.f5728c, new SimpleDateFormat(str).format(calendar.getTime()), new C0486f8(), new C0512g8(), r22));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withAge(int i3) {
        int i4 = Calendar.getInstance(Locale.US).get(1) - i3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new C0998z4(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withAgeIfUndefined(int i3) {
        int i4 = Calendar.getInstance(Locale.US).get(1) - i3;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i4);
        return a(gregorianCalendar, "yyyy", new C0422cl(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDate(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0998z4(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDateIfUndefined(Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C0422cl(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(0, this.f8949a.f5728c, new C0512g8(), new Cl()));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDate(int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C0998z4(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDateIfUndefined(int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        return a(gregorianCalendar, "yyyy", new C0422cl(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDate(int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0998z4(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDateIfUndefined(int i3, int i4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C0422cl(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDate(int i3, int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, i5);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0998z4(this.f8949a.f5727b));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withBirthDateIfUndefined(int i3, int i4, int i5) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i4 - 1);
        gregorianCalendar.set(5, i5);
        return a(gregorianCalendar, "yyyy-MM-dd", new C0422cl(this.f8949a.f5727b));
    }
}
