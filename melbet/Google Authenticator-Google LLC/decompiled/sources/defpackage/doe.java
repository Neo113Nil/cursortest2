package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doe {
    public final String a;
    public final String b;

    public doe(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = "OneGoogle";
    }

    public static void a(Context context) {
        new doe(context.getPackageName());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof doe) {
            doe doeVar = (doe) obj;
            if (this.a.equals(doeVar.a) && this.b.equals(doeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 583896283);
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=null, moduleName=null, instanceId=" + this.b + "}";
    }

    public doe() {
        throw null;
    }
}
