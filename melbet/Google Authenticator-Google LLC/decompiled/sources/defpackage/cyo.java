package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cyo extends ox {
    @Override // defpackage.ox
    public final /* bridge */ /* synthetic */ cml y(Context context, Looper looper, cpr cprVar, Object obj, cmt cmtVar, cmu cmuVar) {
        cyq cyqVar = (cyq) obj;
        oy.au(cyqVar, "Must provide valid PeopleOptions!");
        return new dan(context, looper, cmtVar, cmuVar, String.valueOf(cyqVar.b), cprVar);
    }
}
