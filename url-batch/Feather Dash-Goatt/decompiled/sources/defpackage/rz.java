package defpackage;

import android.content.Context;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rz {
    public final Context a;

    public rz(Context context) {
        context.getClass();
        this.a = context.getApplicationContext();
    }

    public final String a() {
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("gcm_defaultSenderId", "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier);
        }
        if (StringsKt.n("")) {
            return null;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fn fnVar) {
        pz pzVar;
        int i;
        String str;
        if (fnVar instanceof pz) {
            pzVar = (pz) fnVar;
            int i2 = pzVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pzVar.j = i2 - Integer.MIN_VALUE;
                Object obj = pzVar.h;
                tn tnVar = tn.d;
                i = pzVar.j;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    d dVar = new d(this, dnVar, 10);
                    pzVar.j = 1;
                    obj = y90.J(5000L, dVar, pzVar);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return str;
                }
                Context context = this.a;
                context.getClass();
                String string = context.getApplicationContext().getSharedPreferences("feather_firebase_push_token", 0).getString("push_token", null);
                if (string == null || StringsKt.n(string)) {
                    return null;
                }
                return string;
            }
        }
        pzVar = new pz(this, fnVar);
        Object obj2 = pzVar.h;
        tn tnVar2 = tn.d;
        i = pzVar.j;
        dn dnVar2 = null;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }
}
