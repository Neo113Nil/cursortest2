package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardStackRecyclerView;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzq extends ehm {
    private final dzr a;
    private final cbp e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dzq(cbp cbpVar, dzr dzrVar, ExecutorService executorService) {
        super(r0.a());
        executorService.getClass();
        eq eqVar = new eq(new dzp());
        eqVar.a = executorService;
        this.e = cbpVar;
        this.a = dzrVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, koe] */
    @Override // defpackage.kr
    public final lp d(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_card_stack, viewGroup, false);
        Object b = this.e.a.b();
        ((CardStackRecyclerView) inflate.findViewById(R.id.og_bento_card_stack_content)).X((kr) b);
        inflate.getClass();
        return new dzs(inflate, (dzo) b);
    }

    @Override // defpackage.kr
    public final void k(lp lpVar, int i) {
        lpVar.getClass();
        this.a.c((dzs) lpVar, u(i));
    }
}
