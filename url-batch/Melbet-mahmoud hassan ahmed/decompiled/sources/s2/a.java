package s2;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.kz;
import java.util.List;
import r2.g;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: s2.a$a, reason: collision with other inner class name */
    public static final class C0135a extends g.a {
        @RecentlyNonNull
        public C0135a n(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f21141a.C(str, str2);
            return this;
        }

        @RecentlyNonNull
        public C0135a o(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
            if (list != null) {
                this.f21141a.C(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // r2.g.a
        @RecentlyNonNull
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a c() {
            return new a(this, null);
        }

        @RecentlyNonNull
        public C0135a q(@RecentlyNonNull String str) {
            this.f21141a.h(str);
            return this;
        }
    }

    /* synthetic */ a(C0135a c0135a, f fVar) {
        super(c0135a);
    }

    @Override // r2.g
    public final kz a() {
        return this.f21140a;
    }
}
