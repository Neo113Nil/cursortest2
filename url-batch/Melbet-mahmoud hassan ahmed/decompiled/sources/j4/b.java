package j4;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    public static IllegalStateException a(@RecentlyNonNull h<?> hVar) {
        String str;
        if (!hVar.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i7 = hVar.i();
        if (i7 != null) {
            str = "failure";
        } else if (hVar.m()) {
            String valueOf = String.valueOf(hVar.j());
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = hVar.k() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new b(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), i7);
    }
}
