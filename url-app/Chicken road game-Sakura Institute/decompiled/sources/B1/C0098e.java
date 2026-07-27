package B1;

import A.AbstractC0017m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098e {
    public static final int $stable = 0;
    private final boolean active;
    private final String checkUrl;
    private final String title;

    public C0098e() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ C0098e copy$default(C0098e c0098e, boolean z4, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z4 = c0098e.active;
        }
        if ((i2 & 2) != 0) {
            str = c0098e.checkUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = c0098e.title;
        }
        return c0098e.copy(z4, str, str2);
    }

    public final boolean component1() {
        return this.active;
    }

    public final String component2() {
        return this.checkUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final C0098e copy(boolean z4, String checkUrl, String title) {
        Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        return new C0098e(z4, checkUrl, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0098e)) {
            return false;
        }
        C0098e c0098e = (C0098e) obj;
        return this.active == c0098e.active && Intrinsics.a(this.checkUrl, c0098e.checkUrl) && Intrinsics.a(this.title, c0098e.title);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getCheckUrl() {
        return this.checkUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + r0.B.a(this.checkUrl, Boolean.hashCode(this.active) * 31, 31);
    }

    public String toString() {
        boolean z4 = this.active;
        String str = this.checkUrl;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("VillageConfig(active=");
        sb.append(z4);
        sb.append(", checkUrl=");
        sb.append(str);
        sb.append(", title=");
        return AbstractC0017m.n(sb, str2, ")");
    }

    public C0098e(boolean z4, String checkUrl, String title) {
        Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.active = z4;
        this.checkUrl = checkUrl;
        this.title = title;
    }

    public /* synthetic */ C0098e(boolean z4, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z4, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
