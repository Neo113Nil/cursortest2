package defpackage;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fz0 implements pk0 {
    public final y91 a;
    public final y91 b;
    public final boolean c;

    public fz0(y91 y91Var, y91 y91Var2, boolean z) {
        this.a = y91Var;
        this.b = y91Var2;
        this.c = z;
    }

    @Override // defpackage.pk0
    public final qk0 a(Object obj, uw1 uw1Var) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.b(uri.getScheme(), "http") && !Intrinsics.b(uri.getScheme(), TournamentShareDialogURIBuilder.scheme)) {
            return null;
        }
        return new iz0(uri.toString(), uw1Var, this.a, this.b, this.c);
    }
}
