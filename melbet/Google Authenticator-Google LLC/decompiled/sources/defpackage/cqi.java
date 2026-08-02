package defpackage;

import android.content.ComponentName;
import android.os.UserHandle;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqi {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;
    public final UserHandle f;

    public cqi(String str, boolean z) {
        oy.ar(str);
        this.a = str;
        oy.ar("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = 4225;
        this.e = z;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqi)) {
            return false;
        }
        cqi cqiVar = (cqi) obj;
        if (Objects.equals(this.a, cqiVar.a) && Objects.equals(this.b, cqiVar.b) && Objects.equals(this.c, cqiVar.c)) {
            int i = cqiVar.d;
            if (this.e == cqiVar.e) {
                UserHandle userHandle = cqiVar.f;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, 4225, Boolean.valueOf(this.e), null});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        oy.at(componentName);
        return componentName.flattenToString();
    }

    public cqi(ComponentName componentName) {
        this.a = null;
        this.b = null;
        oy.at(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
        this.f = null;
    }
}
