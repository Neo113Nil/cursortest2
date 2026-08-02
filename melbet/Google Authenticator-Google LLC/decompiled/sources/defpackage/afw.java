package defpackage;

import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afw implements agn {
    private final /* synthetic */ int a;

    public afw(int i) {
        this.a = i;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            String num = Integer.toString(hashCode(), 16);
            num.getClass();
            int i2 = ksx.a;
            return "CreationExtras.Key@" + num + "<" + new ksj(agl.class).c() + ">";
        }
        if (i == 1) {
            String num2 = Integer.toString(hashCode(), 16);
            num2.getClass();
            int i3 = ksx.a;
            return "CreationExtras.Key@" + num2 + "<" + new ksj(ame.class).c() + ">";
        }
        if (i == 2) {
            String num3 = Integer.toString(hashCode(), 16);
            num3.getClass();
            int i4 = ksx.a;
            return "CreationExtras.Key@" + num3 + "<" + new ksj(Bundle.class).c() + ">";
        }
        if (i == 3) {
            String num4 = Integer.toString(hashCode(), 16);
            num4.getClass();
            int i5 = ksx.a;
            return "CreationExtras.Key@" + num4 + "<" + new ksj(Application.class).c() + ">";
        }
        if (i != 4) {
            String num5 = Integer.toString(hashCode(), 16);
            num5.getClass();
            int i6 = ksx.a;
            return "CreationExtras.Key@" + num5 + "<" + new ksj(jrm.class).c() + ">";
        }
        String num6 = Integer.toString(hashCode(), 16);
        num6.getClass();
        int i7 = ksx.a;
        return "CreationExtras.Key@" + num6 + "<" + new ksj(String.class).c() + ">";
    }
}
