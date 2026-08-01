package defpackage;

import com.google.android.material.card.MaterialCardView;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class my extends q20 {
    public final o1 u;
    public final SimpleDateFormat v;
    public final /* synthetic */ ny w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(ny nyVar, o1 o1Var) {
        super((MaterialCardView) o1Var.a);
        this.w = nyVar;
        this.u = o1Var;
        this.v = new SimpleDateFormat("MMM d", Locale.getDefault());
    }
}
