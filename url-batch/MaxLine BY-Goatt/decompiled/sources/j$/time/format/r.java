package j$.time.format;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class r extends i {
    public final char g;
    public final int h;

    public r(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, f0.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).B(vVar, charSequence, i);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new r(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new r(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final i f(Locale locale) {
        j$.time.temporal.v vVar;
        ConcurrentMap concurrentMap = j$.time.temporal.w.g;
        Objects.requireNonNull(locale, "locale");
        j$.time.temporal.w a = j$.time.temporal.w.a(j$.time.e.a[((((int) ((r7.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.e.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            vVar = a.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.v vVar2 = a.f;
                int i = this.h;
                if (i == 2) {
                    return new o(vVar2, 2, 2, o.h, this.e);
                }
                return new i(vVar2, i, 19, i < 4 ? f0.NORMAL : f0.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                vVar = a.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                vVar = a.e;
            }
        }
        return new i(vVar, this.b, this.c, f0.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        return f(yVar.b.b).s(yVar, sb);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? f0.NORMAL : f0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
