package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cis {
    public static final hkh a = hkh.l("com/google/android/gms/auth/aang/migration/MigrationUtils");

    public static void a(ExecutionException executionException, String str) {
        if (jsr.c() && (executionException.getCause() instanceof cmm) && ((cmm) executionException.getCause()).a() == 17) {
            return;
        }
        if (executionException.getCause() instanceof UserRecoverableAuthException) {
            throw ((UserRecoverableAuthException) executionException.getCause());
        }
        if (executionException.getCause() instanceof cig) {
            throw new UserRecoverableAuthException(executionException.getCause().getMessage(), ow.q(((cig) executionException.getCause()).a.h));
        }
        if (executionException.getCause() instanceof chh) {
            throw ((chh) executionException.getCause());
        }
        if (executionException.getCause() instanceof chw) {
            throw new chh(executionException.getCause().getMessage(), executionException.getCause());
        }
        if (executionException.getCause() instanceof IOException) {
            throw ((IOException) executionException.getCause());
        }
        if (!(executionException.getCause() instanceof chq)) {
            throw new chh(str, executionException);
        }
        throw ((chq) executionException.getCause());
    }

    public static boolean b(String str) {
        jsr jsrVar = jsr.a;
        if (!jsrVar.bB().e()) {
            return false;
        }
        jkx jkxVar = jsrVar.bB().b().b;
        return !jkxVar.contains(str) || jkxVar.contains("-".concat(String.valueOf(str)));
    }

    public static Account[] c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cid cidVar = (cid) it.next();
            arrayList.add(new Account(cidVar.c, cidVar.b));
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }
}
