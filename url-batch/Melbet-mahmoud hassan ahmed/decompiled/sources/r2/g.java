package r2;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.kz;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    protected final kz f21140a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected final jz f21141a;

        public a() {
            jz jzVar = new jz();
            this.f21141a = jzVar;
            jzVar.F("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str) {
            this.f21141a.D(str);
            return this;
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull Class<Object> cls, @RecentlyNonNull Bundle bundle) {
            this.f21141a.E(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f21141a.G("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        public g c() {
            return new g(this);
        }

        @RecentlyNonNull
        public a d(@RecentlyNonNull String str) {
            r3.o.j(str, "Content URL must be non-null.");
            r3.o.g(str, "Content URL must be non-empty.");
            r3.o.c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f21141a.b(str);
            return this;
        }

        @RecentlyNonNull
        public a e(int i7) {
            this.f21141a.d(i7);
            return this;
        }

        @RecentlyNonNull
        public a f(@RecentlyNonNull Location location) {
            this.f21141a.f(location);
            return this;
        }

        @RecentlyNonNull
        public a g(@RecentlyNonNull List<String> list) {
            if (list == null) {
                io0.g("neighboring content URLs list should not be null");
                return this;
            }
            this.f21141a.g(list);
            return this;
        }

        @RecentlyNonNull
        public a h(@RecentlyNonNull String str) {
            this.f21141a.i(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a i(@RecentlyNonNull String str) {
            this.f21141a.F(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a j(@RecentlyNonNull Date date) {
            this.f21141a.a(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a k(int i7) {
            this.f21141a.c(i7);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a l(boolean z6) {
            this.f21141a.e(z6);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final a m(boolean z6) {
            this.f21141a.j(z6);
            return this;
        }
    }

    protected g(@RecentlyNonNull a aVar) {
        this.f21140a = new kz(aVar.f21141a, null);
    }

    public kz a() {
        return this.f21140a;
    }
}
