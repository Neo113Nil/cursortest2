package i3;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f17024a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17025b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f17026a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f17027b = "";

        @RecentlyNonNull
        public e a() {
            return new e(this, null);
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull String str) {
            this.f17027b = str;
            return this;
        }

        @RecentlyNonNull
        public a c(@RecentlyNonNull String str) {
            this.f17026a = str;
            return this;
        }
    }

    /* synthetic */ e(a aVar, f fVar) {
        this.f17024a = aVar.f17026a;
        this.f17025b = aVar.f17027b;
    }

    @RecentlyNonNull
    public String a() {
        return this.f17025b;
    }

    @RecentlyNonNull
    public String b() {
        return this.f17024a;
    }
}
