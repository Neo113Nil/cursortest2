package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcv {
    public static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    public static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public static hfm a(Set set) {
        qk qkVar = new qk(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                qkVar.add(str.substring(13));
            }
        }
        return hfm.n(qkVar);
    }

    public static String b(WorkerParameters workerParameters) {
        return (String) hnu.X(a(workerParameters.c));
    }
}
