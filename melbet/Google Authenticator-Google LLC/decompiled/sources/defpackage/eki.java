package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eki extends ekl {
    public final hac a;
    private final hac b;

    public eki(final long j) {
        final int i = 1;
        if (j <= -100 || j >= 100) {
            final int i2 = 2;
            this.a = hoq.v(new hac() { // from class: ekh
                @Override // defpackage.hac
                public final Object bB() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i3 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            this.b = hoq.v(new eks(this, i));
        } else {
            this.b = hoq.v(new hac() { // from class: ekh
                @Override // defpackage.hac
                public final Object bB() {
                    int i3 = i;
                    if (i3 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i3 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
            final int i3 = 0;
            this.a = hoq.v(new hac() { // from class: ekh
                @Override // defpackage.hac
                public final Object bB() {
                    int i32 = i3;
                    if (i32 == 0) {
                        return String.valueOf(j);
                    }
                    long j2 = j;
                    return i32 != 1 ? String.format(Locale.US, "%.1e", Double.valueOf(j2)) : Long.valueOf(j2);
                }
            });
        }
    }

    @Override // defpackage.ekl
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.bB();
    }

    @Override // defpackage.ekl
    public final String b() {
        return (String) this.a.bB();
    }
}
