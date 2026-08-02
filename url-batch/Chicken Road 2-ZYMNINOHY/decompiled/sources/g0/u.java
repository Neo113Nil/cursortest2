package g0;

import E.AbstractC0005f;
import T.D;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements D {

    /* renamed from: a, reason: collision with root package name */
    public final String f8985a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8986b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8987c;

    public u(String str, String str2, List list) {
        this.f8985a = str;
        this.f8986b = str2;
        this.f8987c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f8985a, uVar.f8985a) && TextUtils.equals(this.f8986b, uVar.f8986b) && this.f8987c.equals(uVar.f8987c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8985a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8986b;
        return this.f8987c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f8985a;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(str2);
            sb2.append(", ");
            str = AbstractC0005f.q(sb2, this.f8986b, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
